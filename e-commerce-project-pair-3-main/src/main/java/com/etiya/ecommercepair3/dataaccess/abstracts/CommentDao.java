package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.Comment;
import com.etiya.ecommercepair3.entities.concrete.CorparateCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentDao extends JpaRepository<Comment,Integer> {
    @Query("SELECT c FROM Comment c")
    List<Comment> findAllByComment();
}
