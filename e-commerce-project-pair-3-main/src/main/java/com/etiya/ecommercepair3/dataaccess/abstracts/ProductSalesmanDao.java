package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.ProductSalesman;
import com.etiya.ecommercepair3.entities.concrete.Refund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductSalesmanDao extends JpaRepository<ProductSalesman,Integer> {
    @Query("SELECT ps FROM ProductSalesman ps")
    List<ProductSalesman> findAllByProductSalesman();
}
