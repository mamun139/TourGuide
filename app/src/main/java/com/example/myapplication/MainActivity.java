package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView bangladeshCv,foreignCv,videoCv,popularCv,blogCv,savedInfoCv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bangladeshCv=findViewById(R.id.cvBangladesh);
        foreignCv=findViewById(R.id.cvForiegn);
        videoCv=findViewById(R.id.cvVideo);
        popularCv=findViewById(R.id.cvPopular);
        blogCv=findViewById(R.id.cvBlog);
        savedInfoCv=findViewById(R.id.cvSavedInfo);

        bangladeshCv.setOnClickListener(this);
        foreignCv.setOnClickListener(this);
        videoCv.setOnClickListener(this);
        popularCv.setOnClickListener(this);
        blogCv.setOnClickListener(this);
        savedInfoCv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.cvBangladesh)
        {
            Intent intent=new Intent(MainActivity.this,AllDistBangladesh.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.cvForiegn)
        {

        }
        else if(v.getId()==R.id.cvVideo)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(getString(R.string.youtube_url)));
            intent.setPackage("com.google.android.youtube");
            startActivity(intent);

        }
        else if(v.getId()==R.id.cvBlog)
        {
            Intent intent=new Intent(MainActivity.this, RecycleView.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.cvPopular)
        {

        }
        else if(v.getId()==R.id.cvSavedInfo)
        {

        }

    }
}
