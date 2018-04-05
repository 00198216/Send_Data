package com.example.dontcare.send_data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button A;
    private EditText T;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A= findViewById(R.id.button);
        T= findViewById(R.id.hola);

        A.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                sendIntent.putExtra(Intent.EXTRA_TEXT, T.getText().toString());

                if(sendIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(sendIntent);
                }
            }
        });
    }

}
