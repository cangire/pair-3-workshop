package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.Discount;
import com.etiya.ecommercepair3.entities.concrete.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DiscountDao extends JpaRepository<Discount,Integer> {
    @Query("SELECT d FROM Discount d")
    List<Discount> findAllByDiscount();
}
