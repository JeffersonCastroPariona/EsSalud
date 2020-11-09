package com.jcastro.essalud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button btnIngresar;
    EditText txtUsuario, txtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIngresar = findViewById(R.id.btnIngresar);
        txtUsuario = findViewById(R.id.txtUsuario);
        txtPassword = findViewById(R.id.txtPassword);



        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtUsuario.getText().toString().equals("") || txtPassword.getText().toString().equals("")){

                    Toast toast = Toast.makeText(MainActivity.this, "Usted debe llenar todos los Campos", Toast.LENGTH_LONG);
                    toast.show();
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Advertencia");
                    builder.setMessage("Usted debe llenar todos los Campos");
                    builder.setPositiveButton("Aceptar", null);

                    AlertDialog dialog = builder.create();
                    dialog.show();


                }else{

                    Intent intent = new Intent(MainActivity.this, BasedeDatos.class);
                    startActivity(intent);



                }

            }
        });
}

