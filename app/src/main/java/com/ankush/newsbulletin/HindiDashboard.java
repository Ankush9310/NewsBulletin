package com.ankush.newsbulletin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HindiDashboard extends AppCompatActivity {

    ImageButton btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_dashboard);

        btn1 = (ImageButton) findViewById(R.id.btn1);
        btn2 = (ImageButton) findViewById(R.id.btn2);
        btn3 = (ImageButton) findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webviewIntent = new Intent(HindiDashboard.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://www.jagran.com/");
                startActivity(webviewIntent);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webviewIntent = new Intent(HindiDashboard.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://www.abplive.com/");
                startActivity(webviewIntent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webviewIntent = new Intent(HindiDashboard.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://www.livehindustan.com/");
                startActivity(webviewIntent);
            }
        });
    }
}
