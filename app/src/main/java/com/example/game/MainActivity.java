package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView view1 = findViewById(R.id.view1);
        TextView view2 = findViewById(R.id.view2);
        EditText edit1 = findViewById(R.id.edit1);
        Button button1 = findViewById(R.id.button1);
        Toast.makeText(this, " NAVEEN ", Toast.LENGTH_SHORT).show();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= edit1.getText().toString();
                int kg= Integer.parseInt(s);
                double pond = 2.205 * kg;
                view1.setText("the value in ponds is: " + pond);
                view2.setText("successfull");
            }
        });
    }


}
