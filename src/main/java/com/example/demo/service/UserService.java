package com.example.demo.service;

import com.example.demo.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2019/8/22 9:19
 * @Created by T.C.M
 */
@Service
public interface UserService {
    public List<Person> findAll(String name);
    public Person findByIdInfo(int id);
    public Integer update(Person person);
}
