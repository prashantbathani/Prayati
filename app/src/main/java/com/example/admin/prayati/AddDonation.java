package com.example.admin.prayati;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.admin.prayati.helper.SQLiteHandler;
import com.example.admin.prayati.helper.SessionManager;

public class AddDonation extends AppCompatActivity {


    private EditText editItem;
    private EditText editQty;
    private EditText editMessage;
    private Button btnPhoto;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_donation);

        btnPhoto = (Button)findViewById(R.id.btnPhoto);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);

        btnPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Add photo intent activity code

            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Add the data to database
                //Add the data to database
                //Add the data to database



                //Launch donation confirmation screen
                Intent intent = new Intent(AddDonation.this, Confirmation.class);
                startActivity(intent);
            }
        });

    }
}
