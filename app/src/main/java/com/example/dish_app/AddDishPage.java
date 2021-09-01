package com.example.dish_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class AddDishPage extends AppCompatActivity {
    AppDatabase db;
    DishDao dishDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dish_page);

        Button submitBtnId=findViewById(R.id.submitBtnId);

        submitBtnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText dishNameInput=findViewById(R.id.dishNameInputId);
                String dishName= dishNameInput.getText().toString();

                EditText dishPriceInput = findViewById(R.id.dishPriceId);
                String value=dishPriceInput.getText().toString();
                int dishPrice=Integer.parseInt(value);

                EditText ingredientInput= findViewById(R.id.ingredientId);
                String ingredient=ingredientInput.getText().toString();


                Dish dish= new Dish(dishName,dishPrice,ingredient);


                db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "Database").allowMainThreadQueries()
                        .build();

                 dishDao = db.dishDao();
              dishDao.insertAll(dish);
            }
        });
    }
}