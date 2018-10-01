package pr0304Barracks.core.commands;

import pr0304Barracks.anotations.Inject;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.UnitFactory;

public class RetireCommand extends Command{
    @Inject
    private Repository repository;

    public RetireCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String unitTipe = this.getData()[1];
        this.repository.removeUnit(unitTipe);
        String toReturn = String.format("%s retired!",unitTipe);
        return toReturn;
    }
}
