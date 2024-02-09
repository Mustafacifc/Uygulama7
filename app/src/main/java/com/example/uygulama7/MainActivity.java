package com.example.uygulama7;

import androidx.appcompat.app.AppCompatActivity;

import android.health.connect.datatypes.units.Mass;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextYas;
    Button buttonKaydet;
    TextView textViewSonuc,textViewMass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextYas=findViewById(R.id.editTextYas);
        Button buttonKaydet=findViewById(R.id.buttonKaydet);
        TextView textViewSonuc=findViewById(R.id.textViewSonuc);
        EditText editTextMaas=findViewById(R.id.editTextMaas);
        buttonKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int yas =Integer.parseInt(editTextYas.getText().toString());
                int maas =Integer.parseInt(editTextMaas.getText().toString());
                personel Personel=new personel();
                Personel.setYas(yas);
                Personel.setMaas(maas);
                textViewSonuc.setText("Yaş"+Personel.getYas()+"Maaş"+Personel.getMaas());
            }
        });
    }
}