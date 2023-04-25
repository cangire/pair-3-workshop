package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.ProductCart;
import com.etiya.ecommercepair3.entities.concrete.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductCartDao extends JpaRepository<ProductCart,Integer> {
    @Query("SELECT pc FROM ProductCart pc")
    List<ProductCart> findAllByProductCart();
}
