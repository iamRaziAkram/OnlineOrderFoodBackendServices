package com.upgrad.FoodOrderingApp.service.dao;

import com.upgrad.FoodOrderingApp.service.entity.CategoryEntity;

import javax.persistence.TypedQuery;
import java.util.List;

/*
 * This CategoryDao interface gives the list of all the dao methods that exist in the category dao implementation class.
 * Service class will be calling the dao methods by this interface.
 */
public interface CategoryDao {

    CategoryEntity getCategoryById(String categoryId);
    List<CategoryEntity> getAllCategoriesOrderedByName();
    List<CategoryEntity> getCategoriesByRestaurant(String restaurantId);
}
