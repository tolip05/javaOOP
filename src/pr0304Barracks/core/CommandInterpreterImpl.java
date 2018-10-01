package pr0304Barracks.core;

import pr0304Barracks.anotations.Inject;
import pr0304Barracks.contracts.CommandInterpreter;
import pr0304Barracks.contracts.Executable;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class CommandInterpreterImpl implements CommandInterpreter {
    public static final String COMMANDS_PACKAGE = "pr0304Barracks.core.commands.";
    private Repository repository;
    private UnitFactory unitFactory;

    public CommandInterpreterImpl(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) {
        Character firstChar = commandName.toUpperCase().charAt(0);
        String path = COMMANDS_PACKAGE + firstChar + commandName.substring(1)
                + "Command";
        Executable executable = null;
        try {
            Class executableClass = Class.forName(path);
            Constructor constructor = executableClass.getConstructor(String[].class
                    );
            executable = (Executable) constructor.newInstance((Object) data);
            this.injecDependacies(executable,executableClass);
        } catch (ReflectiveOperationException ex) {
            ex.printStackTrace();
        }
        return executable;
    }

    private void injecDependacies(Executable executable, Class executableClass) throws IllegalAccessException {
        Field[] executableClassField = executableClass.getDeclaredFields();
        Field[] theseFields = CommandInterpreterImpl.class.getDeclaredFields();

        for (Field field : executableClassField) {
            if (!field.isAnnotationPresent(Inject.class)){
                continue;
            }
            field.setAccessible(true);
            for (Field theseField : theseFields) {
                if (!theseField.getType().equals(field.getType())){
                    continue;
                }
                theseField.setAccessible(true);
                field.set(executable,theseField.get(this));
            }
        }
    }
}
