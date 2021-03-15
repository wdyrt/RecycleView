package com.didiik.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Tambah extends AppCompatActivity {

    EditText editnama, editulasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tambah);

        editnama = findViewById(R.id.nama);
        editulasan = findViewById(R.id.ulasan);

        findViewById(R.id.tambah).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editnama.getText().toString();
                String ulasan = editulasan.getText().toString();
                Intent i = new Intent(v.getContext(), MainActivity.class);
                i.putExtra("nama", nama);
                i.putExtra("ulasan", ulasan);
                setResult(Activity.RESULT_OK, i);
                finish();
            }
        });
    }
}
