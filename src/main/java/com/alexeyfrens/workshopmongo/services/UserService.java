package com.alexeyfrens.workshopmongo.services;

import com.alexeyfrens.workshopmongo.domain.User;
import com.alexeyfrens.workshopmongo.repository.UserRepository;
import com.alexeyfrens.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
