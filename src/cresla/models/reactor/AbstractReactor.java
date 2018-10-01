package cresla.models.reactor;

import cresla.entities.containers.ModuleContainer;
import cresla.interfaces.*;

import java.lang.reflect.Field;
import java.util.LinkedList;

public abstract class AbstractReactor implements Reactor {

    private Container container;
    private int id;

    AbstractReactor(Container container, int id) {
        this.container = container;
        this.id = id;
    }

    Container getContainer() {
        return this.container;
    }

    @Override
    public abstract long getTotalEnergyOutput();

    @Override
    public abstract long getTotalHeatAbsorbing();

    @Override
    @SuppressWarnings("unchecked")
    public int getModuleCount() {
        Class moduleContainer = ModuleContainer.class;
        Field field = moduleContainer.getDeclaredFields()[1];
        field.setAccessible(true);
        try {
            return ((LinkedList<Module>)field.get(this.container)).size();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void addEnergyModule(EnergyModule energyModule) {
        this.container.addEnergyModule(energyModule);
    }

    @Override
    public void addAbsorbingModule(AbsorbingModule absorbingModule) {
        this.container.addAbsorbingModule(absorbingModule);
    }

    @Override
    public int getId() {
        return this.id;
    }
}
