package com.example.demo.contoller;

import com.example.demo.entity.Person;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;


@Controller
public class UserController {

    @Autowired
    UserService us;

    @RequestMapping("/findAll")
    public String hello(Model m, Person person,@Value("${person.name:null}") String name){
        List<Person> find=us.findAll(name);
        m.addAttribute("persons",find);
        return "list";
    }
    @RequestMapping("find")
    public String findById(@RequestParam int id,Model model){
        model.addAttribute("person",us.findByIdInfo(id));


        return "update";
    }
    @RequestMapping("/update")
    public String update(Person person,Model model){
        model.addAttribute("persons",us.update(person));
        return "redirect:/findAll";
    }
}
