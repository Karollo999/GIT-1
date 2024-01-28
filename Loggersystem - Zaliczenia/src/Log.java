package logger;

import java.time.LocalDateTime;

public class Log {
    private LocalDateTime timestamp;
    private User creator;
    private String logText;
    private String logType;

    public Log(User creator, String logText, String logType) {
        this.timestamp = LocalDateTime.now();
        this.creator = creator;
        this.logText = logText;
        this.logType = logType;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public User getCreator() {
        return creator;
    }

    public String getLogText() {
        return logText;
    }

    public String getLogType() {
        return logType;
    }

    @Override
    public String toString() {
        return "Log{" +
                "timestamp=" + timestamp +
                ", creator=" + creator.getName() +
                ", logText='" + logText + '\'' +
                ", logType='" + logType + '\'' +
                '}';
    }
}
