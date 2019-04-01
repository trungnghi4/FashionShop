package com.NTQ.service;

import com.NTQ.model.Category;
import java.util.List;


public interface CategoryService {

    // create
    public boolean create(Category object);

    // update
    public boolean update(Category object);

    // delete
    public boolean delete(Category object);

    // find by id
    public Category findById(long categoryId);

    // load list category
    public List<Category> getAll();

}
