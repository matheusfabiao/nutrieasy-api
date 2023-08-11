package br.com.matheusfabiao.nutrieasyapi.services;

import br.com.matheusfabiao.nutrieasyapi.dto.UserDTO;
import br.com.matheusfabiao.nutrieasyapi.dto.UserMinDTO;
import br.com.matheusfabiao.nutrieasyapi.entities.User;
import br.com.matheusfabiao.nutrieasyapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service class for managing user-related operations.
 */
@Service
@Transactional(readOnly = true)
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO findById(Long id){
        User result = userRepository.findById(id).get();
        return new UserDTO(result);
    }

    /**
     * Retrieves a list of UserMinDTO objects containing minimal user information.
     *
     * @return A list of UserMinDTO objects representing users.
     */
    public List<UserMinDTO> findAll() {
        List<User> result = userRepository.findAll();
        return result.stream().map(x -> new UserMinDTO(x)).toList();
    }
}
