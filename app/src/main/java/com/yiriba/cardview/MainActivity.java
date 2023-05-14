package com.yiriba.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.yiriba.cardview.adapter.MyAdapter;
import com.yiriba.cardview.model.Game;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 1 - Data
    ArrayList<Game> gamesList;

    // 2 - AdapterView
    RecyclerView recyclerView;

    // 3- Adapter
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        gamesList = new ArrayList<Game>();
        gamesList.add(new Game("Zelda", R.drawable.zelda));
        gamesList.add(new Game("Call of Duty", R.drawable.modern_warfare));
        gamesList.add(new Game("Jedi", R.drawable.jedi));
        gamesList.add(new Game("Final Fantasy", R.drawable.ff));
        gamesList.add(new Game("Hogwarts Legacy", R.drawable.hogwartst));
        gamesList.add(new Game("Resident Evil", R.drawable.resident_evil));
        gamesList.add(new Game("Diablo IV", R.drawable.diablo));
        gamesList.add(new Game("Grand Turismo", R.drawable.grand_turismo));
        gamesList.add(new Game("Dead Space", R.drawable.dead_space));

        adapter = new MyAdapter(this, gamesList);
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}