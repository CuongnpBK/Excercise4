package com.example.nguye.excercise4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnChao, btnTamBiet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adđControls();
        addEvents();

    }

    private void addEvents() {
        btnChao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Xin Chào!",Toast.LENGTH_SHORT).show();
            }
        });
        btnTamBiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Tạm Biệt!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void adđControls() {
        btnChao = (Button) findViewById(R.id.btnChao);
        btnTamBiet = (Button) findViewById(R.id.btnTamBiet);
    }
}
