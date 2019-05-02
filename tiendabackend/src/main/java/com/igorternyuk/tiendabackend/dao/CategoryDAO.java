package com.igorternyuk.tiendabackend.dao;

import java.util.List;

import com.igorternyuk.tiendabackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> getAll();
	
}
