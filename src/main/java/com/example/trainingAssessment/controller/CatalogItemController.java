package com.example.trainingAssessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trainingAssessment.entity.CatalogItem;
import com.example.trainingAssessment.service.CatalogItemService;

@RestController
@RequestMapping("/catalogItem")
public class CatalogItemController {
	
	@Autowired
	public CatalogItemService catalogItemService;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<CatalogItem>> getAllCatalogItems(){
		List<CatalogItem> result = catalogItemService.getAllCatalogItems();
		return new ResponseEntity<List<CatalogItem>>(result, HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<CatalogItem> getItemById(@PathVariable("id") long itemId){
		CatalogItem result = catalogItemService.getCatalogItemById(itemId);
		return new ResponseEntity<CatalogItem>(result, HttpStatus.OK);
	}
	
	@PostMapping("/addItem")
	public ResponseEntity<CatalogItem> addCatalogItem(@RequestBody CatalogItem newItem){
		CatalogItem addedItem = catalogItemService.addCatalogItem(newItem);
		return new ResponseEntity<CatalogItem>(addedItem, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<String> deleteCatalogItemById(@PathVariable("id") long itemId) {
		catalogItemService.deleteCatalogItemById(itemId);
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/updateItem")
	public ResponseEntity<CatalogItem> updateCatalogItem(@RequestBody CatalogItem newItem) {
		CatalogItem updated = catalogItemService.updateCatalogItem(newItem);
		return new ResponseEntity<CatalogItem>(updated, HttpStatus.OK);
	}


}
