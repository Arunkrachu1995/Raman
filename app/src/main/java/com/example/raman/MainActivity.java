package com.example.raman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText in1,in2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        in1 =(EditText) findViewById(R.id.edtid);
        in2 =(EditText) findViewById(R.id.edtname);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage(v);
            }
        });

    }
    public void nextPage(View myView){
        Intent myIntent = new Intent(this,MainActivity2.class);
        myIntent.putExtra("C_ID",Integer.parseInt(in1.getText().toString()));
        myIntent.putExtra("C_NAME",(in2.getText().toString()));


        startActivity(myIntent);

    }
}
