package ru.nikolaevvalentin.designPatterns.structural.facade;

public interface CarMaintenance {

    void checkEngine();

    void checkLights();

    void checkEnergySystem();

    void checkWheelPressure();

    void repairEngine();

    void repairEnergySystem();

    void getWealsPressureToStandard();

    void checkOilLevel();

    void changeOil();

    void changeBrakeFluid();

    void changeBreakDiscs();

    void changeSpacerBetweenSeatAndWeal();
}
