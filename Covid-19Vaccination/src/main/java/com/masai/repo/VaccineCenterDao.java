package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.VaccinationCenter;

@Repository
public interface VaccineCenterDao extends JpaRepository<VaccinationCenter, Integer>{

}
