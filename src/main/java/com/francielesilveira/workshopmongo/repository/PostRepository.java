package com.francielesilveira.workshopmongo.repository;

import com.francielesilveira.workshopmongo.domain.Post;
import com.francielesilveira.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTitleContainingIgnoreCase(String text);
}
