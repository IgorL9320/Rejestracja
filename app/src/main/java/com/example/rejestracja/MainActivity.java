package com.example.rejestracja;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText haslo;
    private TextView komunikat;
    private Button zatwierdz;
    private EditText haslo2;

    protected void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        haslo = findViewById(R.id.haslo);
        haslo2 = findViewById(R.id.haslo2);;
        komunikat = findViewById(R.id.komunikat);
        zatwierdz = findViewById(R.id.zatwierdz);

        haslo.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        haslo2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        zatwierdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emaill = email.getText().toString().trim();
                String hasloo = haslo.getText().toString().trim();
                String hasloo2 = haslo2.getText().toString().trim();
                if (!emaill.contains("@")){
                    komunikat.setText("Nieprawidłowy email");
                } else if (!hasloo.equals(hasloo2)) {
                    komunikat.setText("Hasła nie są takie same");
                }else{
                    komunikat.setText("Witaj"+emaill);
                }
            }
        });
    }


}