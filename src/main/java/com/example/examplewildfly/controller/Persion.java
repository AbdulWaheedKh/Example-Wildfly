package com.example.examplewildfly.controller;

import com.example.examplewildfly.dl.PersonRep;
import com.example.examplewildfly.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class Persion {

    @Autowired
    private PersonRep per;

    @GetMapping("/getAll")
    public List<Person> getAllPeople() {
        return per.findAll();
    }
}
