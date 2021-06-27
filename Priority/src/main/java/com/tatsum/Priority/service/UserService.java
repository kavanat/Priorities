package com.tatsum.Priority.service;

import com.tatsum.Priority.model.User;
import com.tatsum.Priority.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public void saveUser(User user){
        userRepository.save(user);
    }

    public User getUser(Integer id){
        return userRepository.getById(id);
    }

    public void deleteUser(User user){
        userRepository.delete(user);
    }
}
