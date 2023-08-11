package br.com.matheusfabiao.nutrieasyapi.controllers;

import br.com.matheusfabiao.nutrieasyapi.dto.UserMinDTO;
import br.com.matheusfabiao.nutrieasyapi.entities.User;
import br.com.matheusfabiao.nutrieasyapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserMinDTO> findAll(){
        List<UserMinDTO> result = userService.findAll();
        return result;
    }
}
