package com.dzr.repository;

import com.dzr.entity.User;

import java.util.List;

public interface UserRepository {

    public  User findById(long id);

}
