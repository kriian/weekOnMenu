package com.example.menuonweek;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TuesdayActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        menu();

    }

    private void menu() {
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
                "Манная каша с изюмом",
                "Ну как можно умудриться испортить манную кашу!? Проще рецепта, наверно, даже не придумаешь."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.sup_goroh,
                "Гороховый суп с гренками",
                "Помню, как мама в детстве делала этот суп. Пока он докипал в кастрюльке, она мешала деревянной " +
                        "лопаткой в сковороде хлеб, а я крутилась вокруг нее и выпрашивала гренку"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ratatuy_rice,
                "Рататуй с рисом",
                "Традиционное овощное блюдо прованской кухни из перца, баклажанов и кабачков, во многом похожее на венгерское лечо."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pechenka_v_smetane,
                "Печенки, тушенной в сметане",
                "Вкусно, недорого, быстро и полезно – идеальный ужин."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.makarony,
                "Макароны",
                "Чтобы макароны были вкусными, нужно знать, как правильно их варить и соблюдать правила. А какие именно – мы покажем."));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.kapusta_s_chesnakom,
                "Салат из свежей капусты с чесночной заправкой",
                "Хороший салат – не дорогой, быстрый, легкий и полезный."));

        return recyclerViewItems;
    }
}