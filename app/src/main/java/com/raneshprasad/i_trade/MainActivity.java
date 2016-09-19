package com.raneshprasad.i_trade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button log_btn;
    Button create_btn;
    Button view_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hullo", Toast.LENGTH_LONG).show();
        log_btn = (Button) findViewById(R.id.button_log);
        create_btn = (Button) findViewById(R.id.button_signup);
        view_btn = (Button) findViewById(R.id.button_view);
        Toast.makeText(this, "HI", Toast.LENGTH_LONG).show();
        view_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Tab1.class);
                startActivity(i);
            }
        });
    }
}
