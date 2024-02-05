package com.vedruna.proyectofinalmultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    private TextView user;
    private TextView pass;
    private TextView message;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // Inicializar las variables
        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        message = findViewById(R.id.message);
        /*
        login = findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {

        });*/
    }

    public void login(View view) {
        // Obtener el usuario y la contraseña ingresados
        String usuario = user.getText().toString();
        String password = pass.getText().toString();

        // Verificar si el usuario y la contraseña son "admin"
        if (usuario.equals("admin") && password.equals("admin")) {
            message.setVisibility(View.VISIBLE);
            message.setText("Usuario y contraseña correctos");

            // Intent para pasar a la segunda ventana
            Intent intent = new Intent(this, FrameLayaout.class);

            // Iniciar la segunda ventana y finalizar la primera
            startActivity(intent);
            finish();
        } else {
            // Mensajes de error
            message.setVisibility(view.VISIBLE);
            message.setText("Usuario o contraseña incorrectos");
        }
    }

    public void entrar(View view) {
        // Obtener el usuario y la contraseña ingresados
        String usuario = user.getText().toString();
        String password = pass.getText().toString();

        // Verificar si el usuario y la contraseña son "admin"
        if (usuario.equals("admin") && password.equals("admin")) {
            message.setVisibility(View.VISIBLE);
            message.setText("Usuario y contraseña correctos");

            // Intent para pasar a la segunda ventana
            Intent intent = new Intent(this, FrameLayaout.class);

            // Iniciar la segunda ventana y finalizar la primera
            startActivity(intent);
            finish();
        } else {
            // Mensajes de error
            message.setVisibility(view.VISIBLE);
            message.setText("Usuario o contraseña incorrectos");
        }
    }
}