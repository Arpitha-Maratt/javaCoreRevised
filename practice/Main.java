package practice;

final class User {
    private final long id;
    private String passwordHash;

    User(long id, String passwordHash) {
        if (passwordHash == null || passwordHash.isBlank()) {
            throw new IllegalArgumentException("Password hash cannot be null or blank");
        }
        this.id = id;
        this.passwordHash = passwordHash;
    }

    long getId() {
        return id;
    }

    String getPasswordHash() {
        return passwordHash;
    }

    void setPasswordHash(String passwordHash) {
        if (passwordHash == null || passwordHash.isBlank()) {
            throw new IllegalArgumentException("Password hash cannot be null or blank");
        }
        this.passwordHash = passwordHash;
    }
}

final class SessionStore {
    // keep count of active sessions per userId
    private final java.util.Map<Long, Integer> sessions = new java.util.HashMap<>();

    void createSession(long userId) {
        sessions.put(userId, sessions.getOrDefault(userId, 0) + 1);
    }

    int activeSessions(long userId) {
        return sessions.getOrDefault(userId, 0);
    }

    void invalidateAll(long userId) {
        sessions.remove(userId);
    }
}

final class SecurityService {
    private final SessionStore store;

    SecurityService(SessionStore store) {
        this.store = store;
    }

    void resetPassword(User u, String newPasswordHash) {

        u.setPasswordHash(newPasswordHash);


        store.invalidateAll(u.getId());
    }
}

public class Main {
    public static void main(String[] args) {

        SessionStore store = new SessionStore();
        SecurityService service = new SecurityService(store);

        User user = new User(101, "old_hash");


        store.createSession(user.getId());
        store.createSession(user.getId());


        assert user.getPasswordHash().equals("old_hash");
        assert store.activeSessions(user.getId()) == 2;


        service.resetPassword(user, "new_hash");


        assert user.getPasswordHash().equals("new_hash");
        assert store.activeSessions(user.getId()) == 0;

        System.out.println("All assertions passed ");
    }
}
