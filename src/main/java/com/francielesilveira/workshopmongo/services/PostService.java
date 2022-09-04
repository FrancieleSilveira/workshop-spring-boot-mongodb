package com.francielesilveira.workshopmongo.services;

import com.francielesilveira.workshopmongo.domain.Post;
import com.francielesilveira.workshopmongo.domain.User;
import com.francielesilveira.workshopmongo.dto.UserDTO;
import com.francielesilveira.workshopmongo.repository.PostRepository;
import com.francielesilveira.workshopmongo.repository.UserRepository;
import com.francielesilveira.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repo.searchTitle(text);
    }
}