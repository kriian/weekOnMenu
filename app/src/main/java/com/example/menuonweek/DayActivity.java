package com.example.menuonweek;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menuonweek.food.RecipeInterface;
import com.example.menuonweek.food.SemolinaPorridge;

import java.util.ArrayList;

public class DayActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        menu();

    }

    public void menu() {
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
//        recyclerViewItems.add(new RecyclerViewItem(R.drawable.kartofelnye_zrazy_s_gribami,
//                "Картофельные зразы с грибами",
//                "Чудесное блюдо к ужину, за которое ваши домашние будут искренне вам благодарны"));
//        recyclerViewItems.add(new RecyclerViewItem(R.drawable.rukola_salat,
//                "Салат с рукколой и редисом",
//                "Полезное блюдо к ужину."));
        return arrayList;
    }
}
