package com.example.loginfunction.repository;

import com.example.loginfunction.database.FakeDB;
import com.example.loginfunction.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    public List<User> findAll() {
        return FakeDB.users;
    }

    public Optional<User> findById(int id) {
        return FakeDB.users.
                stream().
                filter(user -> user.getId() == id)
                .findFirst();
    }

    public Optional<User> findByUsername(String username) {
        return FakeDB.users.
                stream().
                filter(user -> user.getUsername().equals(username))
                .findFirst();
    }

    public void save(User user) {
        FakeDB.users.add(user);
    }

    public void delete(User user) {
        FakeDB.users.remove(user);
    }
}
