package com.nt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Entity.StudentEntity;

public interface StundentRepositary extends JpaRepository<StudentEntity, Integer> {

}
