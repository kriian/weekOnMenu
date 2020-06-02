package com.example.menuonweek;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

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
        adapter = new RecycleViewAdapter(arrayList(), this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    public  ArrayList<RecyclerViewItem> arrayList() {
        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.mannaja_kascha,
                MondayMenu.TITLE_TEXT_1, MondayMenu.DESCRIPTION_TEXT_1, MondayMenu.RECIPE_TEXT_1));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.sup_guljj,
                MondayMenu.TITLE_TEXT_2, MondayMenu.DESCRIPTION_TEXT_2, MondayMenu.RECIPE_TEXT_2));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ratatuy_rice,
                MondayMenu.TITLE_TEXT_3, MondayMenu.DESCRIPTION_TEXT_3, MondayMenu.RECIPE_TEXT_3));
//        recyclerViewItems.add(new RecyclerViewItem(R.drawable.kartofelnye_zrazy_s_gribami,
//                "Картофельные зразы с грибами",
//                "Чудесное блюдо к ужину, за которое ваши домашние будут искренне вам благодарны"));
//        recyclerViewItems.add(new RecyclerViewItem(R.drawable.rukola_salat,
//                "Салат с рукколой и редисом",
//                "Полезное блюдо к ужину."));
        return recyclerViewItems;
    }
}
