package com.example.primeiraaplicacao;

import static com.example.primeiraaplicacao.R.id.edtIdade;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtPrimeiroNome,edtSegundoNome,edtIdade;
    Button bttApresentar,bttLimpar;
    Button btnFechar;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPrimeiroNome = findViewById(R.id.edtPrimeiroNome);
        edtSegundoNome = findViewById(R.id.edtSegundoNome);
        edtIdade = findViewById(R.id.edtIdade);
        bttApresentar = findViewById(R.id.bttApresentar);
        bttLimpar = findViewById(R.id.bttLimpar);
        tvResult = findViewById(R.id.tvResult);
        btnFechar = findViewById(R.id.btnFechar);

        bttApresentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Bem vindo " + edtPrimeiroNome.getText() + " " + edtSegundoNome.getText() +"\n Você tem " + edtIdade.getText() +" de idade");

                //comando para fechar o teclado após a digitação
                InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                if(imm.isActive())
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);

            }
        });



        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        bttLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtPrimeiroNome.setText("");
                edtSegundoNome.setText("");
                edtIdade.setText("");
                edtPrimeiroNome.requestFocus();
                tvResult.setText("");
            }
        });


    }
}