package com.example.dish_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addDishBtn = findViewById(R.id.addDishBtn);
        addDishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToAddDishPAge= new Intent(MainActivity.this,AddDishPage.class);
                startActivity(goToAddDishPAge);
            }
        });

        Button menuBtn = findViewById(R.id.menuBtn);
        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToMenuPage=new Intent(MainActivity.this,MenuPage.class);
                startActivity(goToMenuPage);
            }
        });
    }
}