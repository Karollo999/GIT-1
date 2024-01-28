import logger.AccessType;
import logger.Log;
import logger.LoggerSystem;
import logger.User;

public class LoggerSystemTest {
    public static void main(String[] args) {
        LoggerSystem loggerSystem = new LoggerSystem();
        User owner = new User("Owner", AccessType.OWNER);
        User admin = new User("Admin", AccessType.ADMIN);
        User basicUser = new User("Basic", AccessType.BASIC);

        loggerSystem.createLog(owner, "System initialized.", "INFO");
        loggerSystem.createLog(admin, "New admin account created.", "INFO");
        loggerSystem.createLog(basicUser, "A basic user logged in.", "INFO");

        System.out.println("All Logs:");
        for (Log log : loggerSystem.getAllLogs()) {
            System.out.println(log);
        }

        loggerSystem.deleteLog(admin, loggerSystem.getAllLogs().get(2)); // Assuming admin can delete basic user's logs

        System.out.println("\nAfter Deletion:");
        for (Log log : loggerSystem.getAllLogs()) {
            System.out.println(log);
        }

        System.out.println("\nDeleted Logs:");
        for (Log log : loggerSystem.getDeletedLogs()) {
            System.out.println(log);
        }
    }
}