package com.cvds.parcial.salud.service;

import com.cvds.parcial.salud.dto.UserDTO;
import com.cvds.parcial.salud.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUserById(String id);
    void createUser(UserDTO userDTO);
    void updateUser(String id, UserDTO userDTO);
    void deleteUser(String id);
}
