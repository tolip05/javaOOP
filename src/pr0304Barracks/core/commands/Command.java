package pr0304Barracks.core.commands;

import pr0304Barracks.contracts.Executable;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.UnitFactory;

public abstract class Command implements Executable{
    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    public Command(String[] data ) {
        this.data = data;

    }

    @Override
    public abstract String execute();

    public String[] getData() {
        return this.data;
    }


}

