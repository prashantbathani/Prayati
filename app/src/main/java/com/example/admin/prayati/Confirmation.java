package com.example.admin.prayati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Confirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);


    }

    @Override
    public void onBackPressed()
    {
        Intent intent = new Intent(Confirmation.this, Drawer.class);
        startActivity(intent);
    }
}
