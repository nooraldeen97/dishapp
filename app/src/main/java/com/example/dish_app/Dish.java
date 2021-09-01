package com.example.dish_app;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Dish {
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name = "dishName")
    public String dishName;
    @ColumnInfo(name = "dishPrice")
    public int dishPrice;
    @ColumnInfo(name = "ingredient")
    public String ingredient;

    public Dish(String dishName, int dishPrice, String ingredient) {
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.ingredient = ingredient;
    }
}
