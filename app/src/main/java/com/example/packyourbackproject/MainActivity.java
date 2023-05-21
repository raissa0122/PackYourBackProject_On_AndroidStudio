package com.example.packyourbackproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.example.packyourbackproject.Adapter.Adapter;
import com.example.packyourbackproject.Constants.MyConstants;
import com.example.packyourbackproject.Data.AppData;
import com.example.packyourbackproject.Database.RoomDB;
import com.example.packyourbackproject.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    //private RecyclerView recyclerView;
    private List<String> titles;
    private List<Integer> images;
    private Adapter adapter;
    private RoomDB database;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        //recyclerView = findViewById(R.id.recyclerView);

        addAddTitles();
        addAllImages();
        persistAppData();
        database = RoomDB.getInstance(this);
        System.out.println("----------->" + database.mainDao().getAllSelected(false).get(0).getItemName());

        adapter = new Adapter(this,titles,images,MainActivity.this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        binding.recyclerView.setLayoutManager(gridLayoutManager);
        binding.recyclerView.setAdapter(adapter);
    }

    private static final int TIME_INTERVAL = 2000;

    private long mBackPressed;

    @Override
    public void onBackPressed(){
        if(mBackPressed+TIME_INTERVAL>System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }
        else {
            Toast.makeText(this,"Tap back button in order to exit", Toast.LENGTH_SHORT).show();
        }
        mBackPressed = System.currentTimeMillis();
    }

    private void persistAppData(){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();

        database = RoomDB.getInstance(this);
        AppData appData = new AppData(database);
        int last = prefs.getInt(AppData.LAST_VERSION,0);
        if(!prefs.getBoolean(MyConstants.FIRST_TIME_CAMEL_CASE,false)){
            appData.persistAllData();
            editor.putBoolean(MyConstants.FIRST_TIME_CAMEL_CASE,true);
            editor.commit();
        } else if (last<AppData.NEW_VERSION) {
            database.mainDao().deleteAllSystemItems(MyConstants.SYSTEM_SMALL);
            appData.persistAllData();
            editor.putInt(AppData.LAST_VERSION,AppData.NEW_VERSION);
            editor.commit();
        }
    }

    private void addAddTitles(){
        titles = new ArrayList<>();
        titles.add(MyConstants.BASIC_NEEDS_CAMEL_CASE);
        titles.add(MyConstants.CLOTHING_CAMEL_CASE);
        titles.add(MyConstants.PERSONAL_CARE_CAMEL_CASE);
        titles.add(MyConstants.BABY_NEEDS_CAMEL_CASE);
        titles.add(MyConstants.HEALTH_CAMEL_CASE);
        titles.add(MyConstants.TECHNOLOGY_CAMEL_CASE);
        titles.add(MyConstants.FOOD_CAMEL_CASE);
        titles.add(MyConstants.BEACH_SUPPLIES_CAMEL_CASE);
        titles.add(MyConstants.CAR_SUPPLIES_CAMEL_CASE);
        titles.add(MyConstants.NEEDS_CAMEL_CASE);
        titles.add(MyConstants.MY_LIST_CAMEL_CASE);
        titles.add(MyConstants.MY_SELECTIONS_CAMEL_CASE);
    }

    private  void addAllImages(){
        images = new ArrayList<>();
        images.add(R.drawable.p1);
        images.add(R.drawable.p2);
        images.add(R.drawable.p3);
        images.add(R.drawable.p4);
        images.add(R.drawable.p5);
        images.add(R.drawable.p6);
        images.add(R.drawable.p7);
        images.add(R.drawable.p8);
        images.add(R.drawable.p9);
        images.add(R.drawable.p10);
        images.add(R.drawable.p11);
        images.add(R.drawable.p12);


    }
}