package com.tatsum.Priority.controller;

import com.tatsum.Priority.model.Category;
import com.tatsum.Priority.model.User;
import com.tatsum.Priority.service.CategoryService;
import com.tatsum.Priority.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priorities")
public class MainController {

    @Autowired
    UserService userService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("/users")
    public List<User> list(){
        return userService.getAllUser();
    }

    @PostMapping("/createUser")
    public void createUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @GetMapping("/categories")
    public List<Category> getCategories(){
        return categoryService.getCategories();
    }

    @PostMapping("/createCategory")
    public void createCategory(@RequestBody Category category){
        categoryService.createCategories(category);
    }



}
