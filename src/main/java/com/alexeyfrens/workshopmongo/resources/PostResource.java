package com.alexeyfrens.workshopmongo.resources;

import com.alexeyfrens.workshopmongo.domain.Post;
import com.alexeyfrens.workshopmongo.domain.User;
import com.alexeyfrens.workshopmongo.dto.UserDTO;
import com.alexeyfrens.workshopmongo.services.PostService;
import com.alexeyfrens.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
