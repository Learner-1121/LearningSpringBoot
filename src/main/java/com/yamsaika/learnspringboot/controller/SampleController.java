package com.yamsaika.learnspringboot.controller;

import com.yamsaika.learnspringboot.propertyeditor.DatePropertyEditor;
import com.yamsaika.learnspringboot.propertyeditor.FirstNamePropertyEditor;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(path = "/api")
public class SampleController {

    @InitBinder
    public void initBinder(DataBinder binder)
    {
        binder.registerCustomEditor(String.class,"firstName",new FirstNamePropertyEditor());
        binder.registerCustomEditor(String.class,"date",new DatePropertyEditor());
    }
    @GetMapping(path="/fetchUser")
    public String getUserDetails(@RequestParam(name = "firstName") String firstName,
                                 @RequestParam(name = "lastName", required = false) String lastName,
                                 @RequestParam(name = "date") Date date
                                )
    {
        String output = "fetched user details: \nFirstName:"+firstName+"\nLastName:"+lastName+"\nDOB:"+date.toString();
        return output;
    }


}
