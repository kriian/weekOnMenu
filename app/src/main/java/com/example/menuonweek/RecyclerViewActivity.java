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
        adapter = new RecycleViewAdapter(arrayList());
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    public ArrayList<RecyclerViewItem> arrayList() {
        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.mannaja_kascha,
                "Манная каша",
                "Ну как можно умудриться испортить манную кашу!? Проще рецепта, наверно, даже не придумаешь."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.sup_guljj,
                "Суп-гуляш",
                "В этом супе много мяса с большой буквы М. Оно там плавает не для бульона, " +
                        "а для того, чтобы составить почти половину гущи всего супа."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ratatuy_rice,
                "Рататуй с рисом",
                "Традиционное овощное блюдо прованской кухни из перца, баклажанов и кабачков, во многом похожее на венгерское лечо."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.kartofelnye_zrazy_s_gribami,
                "Картофельные зразы с грибами",
                "Чудесное блюдо к ужину, за которое ваши домашние будут искренне вам благодарны"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.rukola_salat,
                "Салат с рукколой и редисом",
                "Полезное блюдо к ужину."));
        return recyclerViewItems;
    }
}
