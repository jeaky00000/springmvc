package com.dabao.controllers;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/user")

public class UserController {
    @GetMapping("/list")
    @ResponseBody
    public String list(@RequestParam Date name){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = simpleDateFormat.format(name);
        return "hello list  " + date;
    }

    @GetMapping("/put")
    public String put(Map<String, String> map){
        map.put("name", "zhai");
        map.put("age", "30");
        return "user/put";
    }

    @ExceptionHandler
    @ResponseBody
    public String exception(Exception ex){
        return ex.getMessage();
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }
}
