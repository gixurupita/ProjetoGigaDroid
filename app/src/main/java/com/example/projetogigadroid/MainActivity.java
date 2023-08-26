package com.example.projetogigadroid;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    //fiz uma troca de icones a partir do style nesse programa

    private BottomNavigationView bottomNavigationView;
    private RelativeLayout relativeLayout;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d("Menu", "onCreateOptionsMenu called");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.bottom_nav_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override //main
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //declaracoes
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        relativeLayout = findViewById(R.id.relativeLayout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        //predefinicoes
        setSupportActionBar(toolbar);
        bottomNavigationView.setItemIconTintList(null);// essa coisa ta fazendo os icones padroes nao serem coloridos juntos
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("Giga boy" );
    }

}
