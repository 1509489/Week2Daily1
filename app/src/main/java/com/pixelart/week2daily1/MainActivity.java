package com.pixelart.week2daily1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etSearch;
    private Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSearch = findViewById(R.id.etSearch);
        btnSearch = findViewById(R.id.btnSearch);
    }

    public void onSearch(View view) {
        String data = etSearch.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.setAction("sending data");
        intent.putExtra("search", data);
        startActivity(intent);
    }
}
