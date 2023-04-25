package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.IndividualCustomer;
import com.etiya.ecommercepair3.entities.concrete.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IndividualCustomerDao extends JpaRepository<IndividualCustomer,Integer> {
    @Query("SELECT ic FROM IndividualCustomer ic")
    List<IndividualCustomer> findAllByIndividualCustomer();
}
