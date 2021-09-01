package com.example.dish_app;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface DishDao {
    @Query("SELECT * FROM Dish")
    List<Dish> getAll();

    @Insert
    void insertAll(Dish... dishes);
}
