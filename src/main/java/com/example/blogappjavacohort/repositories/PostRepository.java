package com.codeup.repository;

import com.codeup.entity.Post;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    Post getById(Long id);
//    Post save(Post post);
//
//    List<Post> findAll();
//
//    Post getById(Long id);
//
//    void deleteById(Long id);
}
