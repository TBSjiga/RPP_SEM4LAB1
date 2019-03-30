package com.lab_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView recyclerView; // Список
    private RecyclerView.Adapter adapter; // Адаптер
    private RecyclerView.LayoutManager layoutManager; // Отображение списка

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view); // Находим строку в списке через id
        recyclerView.setHasFixedSize(true); // Размер строк неизменяемый
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager); // Подключение к списку
        adapter = new Adapter();
        recyclerView.setAdapter(adapter); // Подключение адаптера
    }
}
