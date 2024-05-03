package com.retailbusiness.retail.business.controller;

import com.retailbusiness.retail.business.entity.User;
import com.retailbusiness.retail.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.retailbusiness.retail.business.model.*;

@RestController
public class RetailController {

    @Autowired
    private UserService service;
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

    @PostMapping(path = "/create-user", produces = "application/json")
    public String createUser(@RequestBody User user)  {
        return service.createUser(user);
    }

    @PutMapping(path="/update-user", produces = "application/json")
    public String updateUser(@RequestBody User user)
    {
        return service.updateUser(user);
    }

    @DeleteMapping(path = "/delete/{id}", produces = "application/json")
    public void deleteUserById(@PathVariable("id") int id)
    {
        service.deleteUserById(id);
    }
}

