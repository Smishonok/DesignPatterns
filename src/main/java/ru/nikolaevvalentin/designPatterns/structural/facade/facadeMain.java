package ru.nikolaevvalentin.designPatterns.structural.facade;

public class facadeMain {
    public static void main(String[] args) {
        CarMaintenance wasteTimeShop = new CarMaintenanceShop("Best Waste Time Maintenance");
        MaintenanceShopFacade shopFacade = new MaintenanceShopFacade(wasteTimeShop);

        shopFacade.getMaintenance(TypeOfMaintenance.COMPLEX_CHECK);
    }
}
