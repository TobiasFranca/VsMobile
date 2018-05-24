package com.tfsystem.vsmobile.Views;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.tfsystem.vsmobile.R;

public class LoginActivity extends AppCompatActivity {

    EditText txtUsuario;
    EditText txtSenha;
    Button btnLogar;
    Button btnConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Login");

        txtUsuario = findViewById(R.id.txtUsuario);
        txtSenha = findViewById(R.id.txtSenha);
        btnLogar = findViewById((R.id.btnLogin));
        btnConfig = findViewById((R.id.btnConfigurar));
    }

    public void Logar(View v){

        if(txtUsuario.getText().equals("tobias") || txtSenha.getText().equals("123")){

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else{

            Toast.makeText(this, "Usuário ou senha inválido.", Toast.LENGTH_SHORT).show();
        }

    }

    public void Configurar(View v){
        Intent intent = new Intent(this, ConfiguracaoActivity.class);
        startActivity(intent);
    }
}
