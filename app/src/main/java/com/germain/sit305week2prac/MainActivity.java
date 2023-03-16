package com.germain.sit305week2prac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    EditText myEditText;
    TextView myTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connect button var to actual button
        myButton = findViewById(R.id.button);
        myEditText = findViewById(R.id.editTextTextPersonName);
        myTextView = findViewById(R.id.textView2);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputValue = myEditText.getText().toString();
                myTextView.setText("Yo\n" + inputValue);
                Toast.makeText(MainActivity.this, "Hello "+inputValue, Toast.LENGTH_LONG).show();
                Log.v("check message", "Hellooo");
            }
        });

    }
}