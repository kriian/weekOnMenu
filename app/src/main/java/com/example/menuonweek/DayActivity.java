package com.example.menuonweek;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menuonweek.food.GoulashSoup;
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
        mealtime.put("breakfast", getBreakfast());
        mealtime.put("lunch", getLunch());
        mealtime.put("afternoon snack", getAfternoonSnack());
        mealtime.put("dinner", getDinner());

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

    private ArrayList<RecipeInterface> getBreakfast() {
        ArrayList<RecipeInterface> breakfast = new ArrayList<>();
        breakfast.add(new SemolinaPorridge());
//        recyclerViewItems.add(new RecyclerViewItem(R.drawable.rukola_salat,
//                "Салат с рукколой и редисом",
//                "Полезное блюдо к ужину."));
        return breakfast;
    }

    private ArrayList<RecipeInterface> getLunch() {
        ArrayList<RecipeInterface> lunch = new ArrayList<>();
        lunch.add(new GoulashSoup());
        return lunch;
    }

    private ArrayList<RecipeInterface> getAfternoonSnack() {
        ArrayList<RecipeInterface> afternoonSnack = new ArrayList<>();
        afternoonSnack.add(new GoulashSoup());
        return afternoonSnack;
    }

    private ArrayList<RecipeInterface> getDinner() {
        ArrayList<RecipeInterface> dinner = new ArrayList<>();
        dinner.add(new GoulashSoup());
        return dinner;
    }
}
