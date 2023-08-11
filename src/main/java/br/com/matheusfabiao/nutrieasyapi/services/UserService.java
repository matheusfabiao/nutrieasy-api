package br.com.matheusfabiao.nutrieasyapi.services;

import br.com.matheusfabiao.nutrieasyapi.entities.User;
import br.com.matheusfabiao.nutrieasyapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        List<User> result = userRepository.findAll();
        return result;
    }
}
