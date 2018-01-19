package com.example.poojajoshi.assignment_8_2;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Context context;
    ListView listView;
    String[] nameList = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQR", "STU"};
    String[] phoneNumberList = {"123456789", "123456789", "123456789", "123456789", "123456789", "123456789", "123456789"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Set the Custom Adapter with name and phone number list
        context = this;
        listView = findViewById(R.id.list);
        listView.setAdapter(new CustomAdapter(this, nameList,phoneNumberList));
    }
}

