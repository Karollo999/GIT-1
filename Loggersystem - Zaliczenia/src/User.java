package logger;

public class User {
    private String name;
    private AccessType accessType;

    public User(String name, AccessType accessType) {
        this.name = name;
        this.accessType = accessType;
    }

    public String getName() {
        return name;
    }

    public AccessType getAccessType() {
        return accessType;
    }
}