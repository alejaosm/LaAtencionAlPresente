package com.laatencionalpresente.www.laatencionalpresente;

/*
 * Esta clase la utilizaremos para gargar datos previos al inicio de la app.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.laatencionalpresente.www.laatencionalpresente.Activitys.ActivityPrincipal;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        Intent i = new Intent(this,ActivityPrincipal.class);
        startActivity(i);
     
        
    }
}