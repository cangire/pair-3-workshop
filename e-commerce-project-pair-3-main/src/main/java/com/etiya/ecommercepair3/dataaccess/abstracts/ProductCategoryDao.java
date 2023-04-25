package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.ProductCategory;
import com.etiya.ecommercepair3.entities.concrete.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer> {
    @Query("SELECT pc FROM ProductCategory pc")
    List<ProductCategory> findAllByProductCategory();
}
