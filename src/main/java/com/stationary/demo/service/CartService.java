package com.stationary.demo.service;

import java.util.List;

import com.stationary.demo.entities.Product;
import com.stationary.demo.entities.User;

public interface CartService {
	
	public List<Product> getCart(User user);

}