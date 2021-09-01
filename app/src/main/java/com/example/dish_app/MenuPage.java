package com.example.dish_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MenuPage extends AppCompatActivity {

    AppDatabase appDatabase;
    DishDao dishDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        Button homeBtn= findViewById(R.id.homeBtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToHomePage= new Intent(MenuPage.this,MainActivity.class);
                startActivity(goToHomePage);
            }
        });


        appDatabase =  Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "Database").allowMainThreadQueries()
                .build();

        dishDao = appDatabase.dishDao();
        List<Dish> allDishes =dishDao.getAll();

        RecyclerView allDishesRecyclerView=findViewById(R.id.RecyclerViewId);
        allDishesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        allDishesRecyclerView.setAdapter(new DishAdapter(allDishes));

    }
}