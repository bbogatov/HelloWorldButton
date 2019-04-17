package com.example.helloworldbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button helloWorldButton = (Button) findViewById(R.id.button);

        helloWorldButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup viewGroup = (ViewGroup) helloWorldButton.getParent();
                viewGroup.removeView(helloWorldButton);
            }
        });

    }
}
