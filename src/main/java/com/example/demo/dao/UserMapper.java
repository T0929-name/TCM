package com.example.demo.dao;



import com.example.demo.entity.Person;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface UserMapper {
    public List<Person> findAll(String name);
    public Person findByIdInfo(int id);
    public Integer update(Person person);

}
