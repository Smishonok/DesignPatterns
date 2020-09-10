package ru.nikolaevvalentin.designPatterns.structural.facade;

public class CarMaintenanceShop implements CarMaintenance {

    private String shopName;

    public CarMaintenanceShop(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public void checkEngine() {
        System.out.println(shopName+": checks engine");
    }

    @Override
    public void checkLights() {
        System.out.println(shopName+": checks lights");
    }

    @Override
    public void checkEnergySystem() {
        System.out.println(shopName+": checks energy system");
    }

    @Override
    public void checkWheelPressure() {
        System.out.println(shopName+": checks pressure in the weals");
    }

    @Override
    public void changeOil() {
        System.out.println(shopName+": changes oil");
    }

    @Override
    public void changeBrakeFluid() {
        System.out.println(shopName+": changes break fluid");
    }

    @Override
    public void changeBreakDiscs() {
        System.out.println(shopName+": changes breaks");
    }

    @Override
    public void changeSpacerBetweenSeatAndWeal() {
        System.out.println(shopName+": takes the car and pushes out driver");
    }

    @Override
    public void repairEngine() {
        System.out.println(shopName+": repairs engine");
    }

    @Override
    public void repairEnergySystem() {
        System.out.println(shopName+": repairs energy system");
    }

    @Override
    public void getWealsPressureToStandard() {
        System.out.println(shopName+": stabilises weals pressure");
    }

    @Override
    public void checkOilLevel() {
        System.out.println(shopName+": check oil level");
    }
}
