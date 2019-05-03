package com.igorternyuk.tiendabackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.igorternyuk.tiendabackend.dao.CategoryDAO;
import com.igorternyuk.tiendabackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	static List<Category> categories = new ArrayList<>();

	static {
		Category cat1 = new Category(1, "Television",
				"This a television category", "CAT_1.png", true);
		categories.add(cat1);
		Category cat2 = new Category(2, "Laptops",
				"This a laptop category", "CAT_2.png", true);
		categories.add(cat2);
		Category cat3 = new Category(3, "Phones",
				"This a phone category", "CAT_3.png", true);
		categories.add(cat3);
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category: categories) {
			if(category.getId() == id) {
				return category;
			}
		}
		return null;
	}

}
