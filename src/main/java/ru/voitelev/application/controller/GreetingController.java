package ru.voitelev.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.voitelev.application.calculation.PreparationData;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping("/index")
    public String greeting( ){

        return "index.html";
    }

    @RequestMapping(value = "/request", method = RequestMethod.GET)
    @ResponseBody
    public Integer index(@RequestParam String time,String averageTime) throws IOException, GeneralSecurityException {
        PreparationData preparationData = new PreparationData(time,averageTime);
        preparationData.prepareData();

        Integer a = 1;
        return a;
    }

    @RequestMapping(value = "/requestRegistration", method = RequestMethod.GET)
    @ResponseBody
    public void registrationUser(@RequestParam String login, String password) throws IOException, GeneralSecurityException {
        System.out.println(login + " " + password);
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("some", "hello, letsCode!");
        return "main";
    }
}
