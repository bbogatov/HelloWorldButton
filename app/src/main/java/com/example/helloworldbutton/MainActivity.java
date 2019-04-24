package com.example.helloworldbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button helloWorldButton = findViewById(R.id.button);

        helloWorldButton.setOnClickListener(v -> {
            ViewGroup viewGroup = (ViewGroup) helloWorldButton.getParent();
            viewGroup.removeView(helloWorldButton);
        });


    }
}
