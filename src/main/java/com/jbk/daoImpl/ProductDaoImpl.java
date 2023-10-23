package com.jbk.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.dao.ProductDao;
import com.jbk.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory sessionfactory;

	@Override
	public int addProduct(Product product) {
		// TODO Auto-generated method stub
		
		try {
			Session session = sessionfactory.openSession();
			session.save(product);
			session.beginTransaction().commit();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e);
			return 2;
		}
		return 1;
	}

}
