package com.example.trainingAssessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trainingAssessment.entity.CatalogItem;
import com.example.trainingAssessment.repository.CatalogItemRepo;

@Service
public class CatalogItemServiceImpl implements CatalogItemService {
	
	@Autowired
	public CatalogItemRepo catalogItemRepo;

	@Override
	public List<CatalogItem> getAllCatalogItems() {
		return catalogItemRepo.findAll();
	}

	@Override
	public CatalogItem getCatalogItemById(long itemId) {
		return catalogItemRepo.findById(itemId).orElse(null);
	}

	@Override
	public CatalogItem addCatalogItem(CatalogItem newItem) {
		return catalogItemRepo.save(newItem);
	}

	@Override
	public void deleteCatalogItemById(long itemId) {
		catalogItemRepo.deleteById(itemId);
	}

	@Override
	public CatalogItem updateCatalogItem(CatalogItem newItem) {
		return catalogItemRepo.save(newItem);
	}

}
