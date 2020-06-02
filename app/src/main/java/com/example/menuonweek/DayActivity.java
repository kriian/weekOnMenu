package com.example.menuonweek;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menuonweek.food.GoulashSoup;
import com.example.menuonweek.food.PotatoZrazyWithMushrooms;
import com.example.menuonweek.food.RatatouilleWithRice;
import com.example.menuonweek.food.RecipeInterface;
import com.example.menuonweek.food.SemolinaPorridge;

import java.util.ArrayList;
import java.util.HashMap;

public class DayActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    public HashMap<String, ArrayList<RecipeInterface>> mealtime() {
        HashMap<String, ArrayList<RecipeInterface>> mealtime = new HashMap<String, ArrayList<RecipeInterface>>();
        mealtime.put("breakfast", (ArrayList<RecipeInterface>) getMenu().get(0));
        mealtime.put("lunch", (ArrayList<RecipeInterface>) getMenu().get(1));
        mealtime.put("afternoon snack", (ArrayList<RecipeInterface>) getMenu().get(2));
        mealtime.put("dinner", (ArrayList<RecipeInterface>) getMenu().get(3));

     return mealtime;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        showMenu();

    }

    private void showMenu() {
        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecycleViewAdapter(getMenu(), this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    public  ArrayList<RecipeInterface> getMenu() {
        ArrayList<RecipeInterface> arrayList = new ArrayList<>();
        arrayList.add(new SemolinaPorridge());
        arrayList.add(new GoulashSoup());
        arrayList.add(new RatatouilleWithRice());
        arrayList.add(new PotatoZrazyWithMushrooms());
//        recyclerViewItems.add(new RecyclerViewItem(R.drawable.rukola_salat,
//                "Салат с рукколой и редисом",
//                "Полезное блюдо к ужину."));
        return arrayList;
    }
}
