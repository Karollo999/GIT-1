package logger;

import java.util.ArrayList;
import java.util.List;

public class LoggerSystem {
    private List<Log> allLogs = new ArrayList<>();
    private List<Log> deletedLogs = new ArrayList<>();

    public void createLog(User user, String logText, String logType) {
        allLogs.add(new Log(user, logText, logType));
    }

    public void deleteLog(User user, Log log) {
        if (log.getCreator().equals(user) || user.getAccessType() == AccessType.ADMIN || user.getAccessType() == AccessType.OWNER) {
            allLogs.remove(log);
            deletedLogs.add(log);
        }
    }

    public List<Log> getAllLogs() {
        return allLogs;
    }

    public List<Log> getDeletedLogs() {
        return deletedLogs;
    }

    public List<Log> getLogsByUser(User user) {
        List<Log> userLogs = new ArrayList<>();
        for (Log log : allLogs) {
            if (log.getCreator().equals(user)) {
                userLogs.add(log);
            }
        }
        return userLogs;
    }
}