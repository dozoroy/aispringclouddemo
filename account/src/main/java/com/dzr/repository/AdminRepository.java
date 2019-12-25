package com.dzr.repository;


import com.dzr.entity.Admin;

public interface AdminRepository {
    public Admin login(String username,String password);

}
