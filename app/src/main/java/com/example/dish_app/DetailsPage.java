package com.example.dish_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent=getIntent();
        String dishName =intent.getExtras().getString("DishName");
        String dishPrice=intent.getExtras().getString("DishPrice");
        String ingredient=intent.getExtras().getString("DishIngredient");

        TextView name= findViewById(R.id.textName);
        TextView price= findViewById(R.id.textPrice);
        TextView theIngredient = findViewById(R.id.textIngredient);

        name.setText(dishName);
        price.setText(dishPrice);
        theIngredient.setText(ingredient);
    }
}