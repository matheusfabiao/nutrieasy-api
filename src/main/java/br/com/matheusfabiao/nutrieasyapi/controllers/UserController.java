package br.com.matheusfabiao.nutrieasyapi.controllers;

import br.com.matheusfabiao.nutrieasyapi.dto.UserDTO;
import br.com.matheusfabiao.nutrieasyapi.dto.UserMinDTO;
import br.com.matheusfabiao.nutrieasyapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public UserDTO findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @GetMapping
    public List<UserMinDTO> findAll(){
        return userService.findAll();
    }
}
