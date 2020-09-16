package ru.nikolaevvalentin.designPatterns.behavioral.templateMethod;

public class TemplMentMain {
    public static void main(String[] args) {
        Maintenance maintenance = new CarMaintenance();
        maintenance.getMaintenanceSchedule();
        maintenance.getMaintenanceSchedule();
        maintenance = new WallClockMaintenance();
        maintenance.getMaintenanceSchedule();
    }
}
