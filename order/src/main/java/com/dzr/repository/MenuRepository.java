package com.dzr.repository;

import com.dzr.entity.Menu;

import java.util.List;

public interface MenuRepository {
    public Menu findById(long id);
}
