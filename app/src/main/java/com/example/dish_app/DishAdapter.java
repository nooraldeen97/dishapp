package com.example.dish_app;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class DishAdapter extends RecyclerView.Adapter<DishAdapter.DishViewHolder>{

    //  create the list that the adapter will use to bind data

    List<Dish> allDish=new ArrayList<Dish>();

    public DishAdapter(List<Dish> allDish) {
        this.allDish = allDish;
    }


    // create the ViewHolder class (Wraps the data and the view)
    public static class DishViewHolder extends RecyclerView.ViewHolder{
        // The model object
        public Dish dish;
        // view object
        View itemView;

        // setting the itemView value

        public DishViewHolder(@NotNull View itemView) {

            super(itemView);
            this.itemView=itemView;
            // this group of code are responsible for adding click listener for each fragment and show them in details page.
            itemView.findViewById(R.id.fragmentId).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent goToDetailsPage = new Intent(view.getContext(),DetailsPage.class);
                    goToDetailsPage.putExtra("DishName",dish.dishName);
                    goToDetailsPage.putExtra("DishPrice",dish.dishPrice);
                    goToDetailsPage.putExtra("DishIngredient",dish.ingredient);
                    view.getContext().startActivity(goToDetailsPage);
                }
            });
        }
    }


    @NotNull
    @Override
    public DishViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        // create the view

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_blank,parent,false);
        DishViewHolder dishViewHolder=new DishViewHolder(view);

        return dishViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DishAdapter.DishViewHolder holder, int position) {
        holder.dish=allDish.get(position);

        TextView dishName=holder.itemView.findViewById(R.id.dishNameFragment);
        TextView dishPrice=holder.itemView.findViewById(R.id.dishPriceFragment);

        dishName.setText(holder.dish.dishName);
        dishPrice.setText(Integer.toString(holder.dish.dishPrice));
    }

    @Override
    public int getItemCount() {
        return allDish.size();
    }

}
