package de.ait.timepad.repositories.impl;

import de.ait.timepad.models.User;
import de.ait.timepad.repositories.UsersRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersRepositoryListImpl implements UsersRepository {
    private static List<User> users = new ArrayList<>();


    @Override
    public void save(User user) {
        user.setId((long) users.size() + 1);
        users.add(user);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void clear() {
        users.clear();
    }
}
