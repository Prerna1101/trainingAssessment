package com.example.trainingAssessment.service;

import java.util.List;

import com.example.trainingAssessment.entity.CatalogItem;

public interface CatalogItemService {
	public List<CatalogItem> getAllCatalogItems();
	public CatalogItem getCatalogItemById(long itemId);
	public CatalogItem addCatalogItem(CatalogItem newItem);
	public void deleteCatalogItemById(long itemId);
	public CatalogItem updateCatalogItem(CatalogItem newItem);
}
