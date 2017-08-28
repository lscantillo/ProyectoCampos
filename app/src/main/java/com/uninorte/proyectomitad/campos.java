package com.uninorte.proyectomitad;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import static com.uninorte.proyectomitad.R.id.numero;

public class campos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campos);


    }


    public void onclickbotonlog(View view) {
        Toast.makeText(getApplicationContext(),"", Toast.LENGTH_SHORT).show();
    }
}
