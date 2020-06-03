package com.example.menuonweek;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menuonweek.food.GoulashSoup;
import com.example.menuonweek.food.PeaSoupWithCroutons;
import com.example.menuonweek.food.PotatoZrazyWithMushrooms;
import com.example.menuonweek.food.RatatouilleWithRice;
import com.example.menuonweek.food.RecipeInterface;
import com.example.menuonweek.food.SemolinaPorridge;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class DayActivity extends AppCompatActivity {

    GregorianCalendar calendar = new GregorianCalendar();
    private final Random randomGenerator;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private MainActivity mainActivity = new MainActivity();
    String position = getIntent().getStringExtra("key");
    int num = Integer.parseInt(position);

    public DayActivity() {
        super();
        randomGenerator = new Random(calendar.get(Calendar.MINUTE) + num);
    }

    private ArrayList<ArrayList<RecipeInterface>> getMealtime() {
        ArrayList<ArrayList<RecipeInterface>> mealtime = new ArrayList<>();
        mealtime.add(getBreakfast());
        mealtime.add(getLunch());
        mealtime.add(getAfternoonSnack());
        mealtime.add(getDinner());

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

    private ArrayList<RecipeInterface> getMenu() {
        ArrayList<ArrayList<RecipeInterface>> mealtime = getMealtime();
        ArrayList<RecipeInterface> menu = new ArrayList<>();

        for (ArrayList<RecipeInterface> entry : mealtime) {
            int randIndex = randomGenerator.nextInt(entry.size());
            menu.add(entry.get(randIndex));
        }

        return menu;
    }

    private ArrayList<RecipeInterface> getBreakfast() {
        ArrayList<RecipeInterface> breakfast = new ArrayList<>();
        breakfast.add(new SemolinaPorridge());
        return breakfast;
    }

    private ArrayList<RecipeInterface> getLunch() {
        ArrayList<RecipeInterface> lunch = new ArrayList<>();
        lunch.add(new GoulashSoup());
        lunch.add(new PeaSoupWithCroutons());
        return lunch;
    }

    private ArrayList<RecipeInterface> getAfternoonSnack() {
        ArrayList<RecipeInterface> afternoonSnack = new ArrayList<>();
        afternoonSnack.add(new RatatouilleWithRice());
        return afternoonSnack;
    }

    private ArrayList<RecipeInterface> getDinner() {
        ArrayList<RecipeInterface> dinner = new ArrayList<>();
        dinner.add(new PotatoZrazyWithMushrooms());
        return dinner;
    }
}
