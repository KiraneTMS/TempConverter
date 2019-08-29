package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }

    private void initComponent() {
        final EditText edtCelcius = findViewById(R.id.edtCelcius);

        findViewById(R.id.btnConvert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.edtKelvin)).setText(String.valueOf(celcToKelvin(Double.parseDouble(edtCelcius.getText().toString()))));
                ((TextView) findViewById(R.id.edtFahrenheit)).setText(String.valueOf(celcToFahrenheit(Double.parseDouble(edtCelcius.getText().toString()))));
                ((TextView) findViewById(R.id.edtReamur)).setText(String.valueOf(celcToReamur(Double.parseDouble(edtCelcius.getText().toString()))));
            }
        });
    }

    private double celcToKelvin(double celc) {
        return celc + 273.15;
    }

    private double celcToFahrenheit(double celc) {
        return (celc * 9 / 5) + 32;
    }

    private double celcToReamur(double celc) {
        return celc * 0.8;
    }
}
