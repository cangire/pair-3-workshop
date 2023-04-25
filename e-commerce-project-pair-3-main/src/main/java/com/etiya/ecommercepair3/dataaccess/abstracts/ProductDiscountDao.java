package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.ProductDiscount;
import com.etiya.ecommercepair3.entities.concrete.ProductSalesman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDiscountDao extends JpaRepository<ProductDiscount,Integer> {
    @Query("SELECT pd FROM ProductDiscount pd")
    List<ProductDiscount> findAllByProductDiscount();
}
