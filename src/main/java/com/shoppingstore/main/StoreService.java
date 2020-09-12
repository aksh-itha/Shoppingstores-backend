package com.shoppingstore.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
	@Autowired
	private StoreRepository storeRepository;

	public List<Store> getAllStores(){
		List<Store> stores=new ArrayList<>();
		storeRepository.findAll()
		.forEach(stores::add);
		return stores;
		}
	public Optional<Store> getStore(String address) {
		return storeRepository.findById(address);
	}
	public void addStore(Store store) {
		storeRepository.save(store);
	}			
	public void updateStore(String address,Store store) {
		storeRepository.save(store);
	}
	public void deleteStore(String address) {
		storeRepository.deleteById(address);
	}
}
