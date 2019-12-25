package com.dzr.repository;

import com.dzr.entity.User;

public interface UserRepository {
    public User login(String username, String password);
}
