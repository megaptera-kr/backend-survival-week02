package kr.megaptera.backend.weekd02.assignment.services;

import kr.megaptera.backend.weekd02.assignment.models.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserManager {
    private Map<String, User> users;

    public UserManager() {
        users = new HashMap<>();

        var defaultUser = new User("test", "1234");
        users.put(defaultUser.getName(), defaultUser);
    }

    public boolean isExist(String id) {
        var user = users.get(id);
        return user != null;
    }

    public User get(String id) {
        return users.get(id);
    }

    public void add(User user) {
        users.put(user.getName(), user);
    }

    public void update(User user) {
        users.replace(user.getName(), user);
    }
}
