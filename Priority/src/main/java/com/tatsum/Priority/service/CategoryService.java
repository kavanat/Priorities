package com.tatsum.Priority.service;

import com.tatsum.Priority.model.Category;
import com.tatsum.Priority.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }

    public void createCategories(Category category){
        categoryRepository.save(category);
    }



}
