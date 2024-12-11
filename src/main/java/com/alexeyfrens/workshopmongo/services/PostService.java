package com.alexeyfrens.workshopmongo.services;

import com.alexeyfrens.workshopmongo.domain.Post;
import com.alexeyfrens.workshopmongo.domain.User;
import com.alexeyfrens.workshopmongo.dto.UserDTO;
import com.alexeyfrens.workshopmongo.repository.PostRepository;
import com.alexeyfrens.workshopmongo.repository.UserRepository;
import com.alexeyfrens.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}