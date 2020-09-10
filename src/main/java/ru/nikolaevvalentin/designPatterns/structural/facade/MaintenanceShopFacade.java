package ru.nikolaevvalentin.designPatterns.structural.facade;

public class MaintenanceShopFacade {
    private CarMaintenance carMaintenance;

    public MaintenanceShopFacade(CarMaintenance carMaintenance) {
        this.carMaintenance = carMaintenance;
    }

    public void getMaintenance(TypeOfMaintenance typeOfMaintenance) {
        switch (typeOfMaintenance) {
            case MAINTENANCE:
                carMaintenance.checkLights();
                carMaintenance.checkWheelPressure();
                carMaintenance.checkEnergySystem();
                carMaintenance.changeOil();
                carMaintenance.changeBrakeFluid();
                break;
            case COMPLEX_CHECK:
                carMaintenance.checkEngine();
                carMaintenance.checkOilLevel();
                carMaintenance.checkLights();
                carMaintenance.checkEnergySystem();
                carMaintenance.checkWheelPressure();
                break;
            case ENGINE_REPAIR:
                carMaintenance.checkEngine();
                carMaintenance.repairEngine();
                carMaintenance.changeOil();
                carMaintenance.changeSpacerBetweenSeatAndWeal();
                break;
        }
    }

}
