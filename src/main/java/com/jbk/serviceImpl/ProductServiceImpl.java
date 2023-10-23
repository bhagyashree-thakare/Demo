package com.jbk.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.ProductDao;
import com.jbk.entity.Product;
import com.jbk.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productdao;
	
	@Override
	public int addProduct(Product product) {
		// TODO Auto-generated method stub
		return productdao.addProduct(product);
	}

}
