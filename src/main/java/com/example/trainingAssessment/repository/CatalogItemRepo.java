package com.example.trainingAssessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trainingAssessment.entity.CatalogItem;

public interface CatalogItemRepo extends JpaRepository<CatalogItem, Long>{

}
