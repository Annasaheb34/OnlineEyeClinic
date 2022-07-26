package com.onlineeyeclinic.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onlineeyeclinic.dto.Doctor;



@Repository
public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {
	
}
