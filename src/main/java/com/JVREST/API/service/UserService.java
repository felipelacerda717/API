package com.JVREST.API.service;

import com.JVREST.API.model.User;

public interface UserService {
         User findById(Long id);
        User create(User userToCreate);
}
