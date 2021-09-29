package com.maea.csitstudymaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView grid;
    int icon[] =
            {       R.drawable.cpp,
                    R.drawable.c,
                    R.drawable.java,
                    R.drawable.python,
                    R.drawable.digital,
                    R.drawable.web,
                    R.drawable.html,
            };
    String name[] = {"CPP","C","JAVA","PYTHON","DIGITAL","WEB","HTML"};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid = (GridView)findViewById(R.id.datagrid);


        grid.setAdapter(new gridAdapter(name,icon,this));
    }
}