package com.example.wiehan.kate_app_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Two_ScenFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_scen_four);

        Button viewVitalsButton = (Button) findViewById(R.id.viewVitalsButtonScenFour);

        viewVitalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_Vitals_ScenFour.class);
                startActivity(intent);
            }
        });
    }
    }

