package com.example.myapplication;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleView extends AppCompatActivity {
    RecyclerView recyclerView;
    int[] images={
            R.drawable.bangladesh_flag,R.drawable.bangladesh_flag,R.drawable.bangladesh_flag,R.drawable.bangladesh_flag,
            R.drawable.bangladesh_flag,R.drawable.bangladesh_flag,R.drawable.bangladesh_flag,R.drawable.bangladesh_flag,
            R.drawable.bangladesh_flag,R.drawable.bangladesh_flag,R.drawable.bangladesh_flag,R.drawable.bangladesh_flag
    };
    MyAdapter myAdapter;
    String[] title,desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview_layout);
        recyclerView=findViewById(R.id.recyclerview);
        title=getResources().getStringArray(R.array.country_Names);
        desc=getResources().getStringArray(R.array.country_desc);
        myAdapter=new MyAdapter(this,title,desc,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
