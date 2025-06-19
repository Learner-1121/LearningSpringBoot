package com.yamsaika.learnspringboot.controller;

import com.yamsaika.learnspringboot.scope.prototype.Student1;
import com.yamsaika.learnspringboot.scope.prototype.User6;
import com.yamsaika.learnspringboot.scope.singleton.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("prototype")
@RequestMapping(value = "/api/")
public class TestController1 {

    @Autowired
    User6 user;

    @Autowired
    Student1 student;
    public TestController1()
    {
        System.out.println("TestController1 instance Initialized....");
    }
    @GetMapping(path = "/fetchUserPrototype")
    public ResponseEntity<String> getUserDetailsPrototype()
    {
        System.out.println("TestController1 object hashcode: "+this.hashCode()+" User object hashcode: "+user.hashCode()+" Student object hashcode: "+student.hashCode());
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
