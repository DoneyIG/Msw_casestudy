package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
public class login extends AppCompatActivity implements View.OnClickListener {
    Button button;
    @Override
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.activity_login);
        button=findViewById(R.id.regbutton);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(getApplicationContext(), stu_dash.class);
        startActivity(i);
    }
}



