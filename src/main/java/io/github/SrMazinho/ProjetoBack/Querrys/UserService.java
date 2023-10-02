package io.github.SrMazinho.ProjetoBack.Querrys;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService<UserDTO> {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getUsersByAgeGreaterThan(int age) {
        List<User> users = userRepository.findByAgeGreaterThan(age);

        // Usando Lambda e Stream API para mapear User para UserDTO
        return users.stream()
                .map(UserDTO::new)
                .collect(Collectors.toList());
    }

}
