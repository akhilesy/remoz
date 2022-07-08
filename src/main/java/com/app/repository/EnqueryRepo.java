package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Enquery;

public interface EnqueryRepo extends JpaRepository<Enquery, Integer> {

}
