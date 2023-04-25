package com.etiya.ecommercepair3.dataaccess.abstracts;

import com.etiya.ecommercepair3.entities.concrete.District;
import com.etiya.ecommercepair3.entities.concrete.IndividualCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DistrictDao extends JpaRepository<District,Integer> {
    @Query("SELECT d FROM District d")
    List<District> findAllByDistrict();
}
