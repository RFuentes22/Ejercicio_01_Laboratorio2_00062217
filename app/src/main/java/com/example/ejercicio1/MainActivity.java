package com.example.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    EditText user,pass;
    TextView box;
    CharSequence textUser,textPass;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = findViewById(R.id.click);
        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        box = findViewById(R.id.show);
        textUser =user.getText();
        textPass = pass.getText();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                box.setText(textUser);

            }

        });
        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                box.setText(textPass);

                return true;
            }

        });

    }
}
