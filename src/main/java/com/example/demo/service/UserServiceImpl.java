package com.example.demo.service;


import com.example.demo.dao.UserMapper;
import com.example.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2019/8/22 9:13
 * @Created by T.C.M
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper u;


    @Override
    public List<Person> findAll(String name) {
        return u.findAll(name);
    }

    @Override
    public Person findByIdInfo(int id) {
        return u.findByIdInfo(id);
    }

    @Override
    public Integer update(Person person) {
        return u.update(person);
    }
}
