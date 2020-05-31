package com.example.menuonweek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Понедельник");
        arrayList.add("Вторник");
        arrayList.add("Среда");
        arrayList.add("Четверг");
        arrayList.add("Пятница");
        arrayList.add("Суббота");
        arrayList.add("Воскресенье");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.select_dialog_item, arrayList);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                Toast.makeText(MainActivity.this, arrayList.get(position), Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                        startActivity(intent);
                        break;
                    case 1:
                        break;
                }

            }
        });
    }
}
