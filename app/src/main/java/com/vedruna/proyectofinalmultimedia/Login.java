package com.vedruna.proyectofinalmultimedia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class Login extends AppCompatActivity {
    private TextView user;
    private TextView pass;
    private TextView message;
    private Button login;

    //ATRIBUTOS LOGIN GOOGLE
    private static final int RC_SIGN_IN = 1;

    private GoogleSignInClient mGoogleSignInClient;

    private FirebaseAuth mAuth;

    SignInButton signInButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // Inicializar las variables
        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        message = findViewById(R.id.message);
        signInButton= findViewById(R.id.btnGoogle);

        mAuth = FirebaseAuth.getInstance();

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        /*
        login = findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {

        });*/
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }

    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                // Google Sign In was successful, authenticate with Firebase
                GoogleSignInAccount account = task.getResult(ApiException.class);
                firebaseAuthWithGoogle(account.getIdToken());
            } catch (ApiException e) {
                // Google Sign In failed, update UI appropriately
                Toast.makeText(Login.this, "Inicio de Google fallido", Toast.LENGTH_SHORT).show();

            }
        }
    }

    private void firebaseAuthWithGoogle(String idToken) {
        AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            goHome();
                            FirebaseUser user = mAuth.getCurrentUser();
                            updateUI(user);
                        } else {
                            Toast.makeText(Login.this, "Autenticacion Firebase fallida", Toast.LENGTH_SHORT).show();
                            updateUI(null);
                        }
                    }
                });
    }

    private void updateUI(FirebaseUser user) {
        user= mAuth.getCurrentUser();
        if(user!=null){
            goHome();
        }
    }

    private void goHome() {
        Intent intent=new Intent(this, FrameLayaout.class);
        startActivity(intent);
        finish();
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
        String usuario = user.getText().toString().trim();
        String password = pass.getText().toString();

        // Verificar si el usuario y la contraseña son "admin"
        if (usuario.equals("admin") && password.equals("admin")) {
            // Mostrar Toast de inicio de sesión correcta
            Toast.makeText(this, "Sesión iniciada", Toast.LENGTH_SHORT).show();

            // Intent para pasar a la segunda ventana
            Intent intent = new Intent(this, FrameLayaout.class);

            // Iniciar la segunda ventana y finalizar la primera
            startActivity(intent);
            finish();
        } else {
            // Mensajes de error
            // Mostrar Toast de inicio de sesión correcta
            Toast.makeText(this, "Usario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
}