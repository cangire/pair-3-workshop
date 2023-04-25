package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.CorparateCustomer;
import com.etiya.ecommercepair3.entities.concrete.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CorparateCustomerDao extends JpaRepository<CorparateCustomer,Integer> {
    @Query("SELECT cc FROM CorparateCustomer cc")
    List<CorparateCustomer> findAllByCorparateCustomer();
}
