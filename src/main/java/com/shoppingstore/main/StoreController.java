package com.shoppingstore.main;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class StoreController {
	@Autowired
	private StoreService storeService;
  @GetMapping("/store")
  public List<Store> getAllStores(){
	 return storeService.getAllStores();		  
  }
  @GetMapping("/store/{address}")
  public Optional<Store> getStore(@PathVariable String address) {
	  return storeService.getStore(address);
  }
  @PostMapping("/stores")
  public void addStore(@RequestBody Store store) {
	 storeService.addStore(store);
  }
  @PutMapping("/store/{address}")
  public void updateStore(@RequestBody Store store,@PathVariable String address) {
	  storeService.updateStore(address, store);  
  }
  @DeleteMapping("/store/{address}")
  public void deleteStore(@PathVariable String address) {
	  storeService.deleteStore(address);
  }

}
