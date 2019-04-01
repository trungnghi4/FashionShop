package com.NTQ.service;

import com.NTQ.dao.CategoryDAO;
import com.NTQ.model.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;

    public boolean create(Category object) {
        return categoryDAO.create(object);
    }

    public boolean update(Category object) {
        return categoryDAO.update(object);
    }

    public boolean delete(Category object) {
        return categoryDAO.delete(object);
    }

    public Category findById(long categoryId) {
        return categoryDAO.findById(categoryId);
    }

    public List<Category> getAll() {
        return categoryDAO.getAll();
    }

}
