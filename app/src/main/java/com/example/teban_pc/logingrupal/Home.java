package com.example.teban_pc.logingrupal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView txtUsuario;
    TextView txtClave;
    Button btnLogin;
    Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtUsuario=(TextView) findViewById(R.id.txtUsuario);
        txtClave=(TextView) findViewById(R.id.txtClave);
        btnLogin=(Button) findViewById(R.id.btnLogin);
        btnCancelar=(Button) findViewById(R.id.btnCancelar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void mostrarMensaje(View view){
        String Usser="jtorresp";
        String Pass="123456";

        String usuario=txtUsuario.getText().toString();
        String contrasena=txtClave.getText().toString();

        switch(view.getId()){
            case(R.id.btnLogin):
                if(usuario.equals(Usser) && contrasena.equals(Pass)){
                    Intent irVentana = new Intent(this, Home.class);
                    irVentana.putExtra("nombre_01",Usser);
                    irVentana.putExtra("nombre_01",Pass);
                    startActivity(irVentana);
                }else {
                    Intent irVentana = new Intent(this, Error.class);
                    startActivity(irVentana);
                }
                break;
            case(R.id.btnCancelar):
                txtUsuario.setText(null);
                txtClave.setText(null);
                break;
        }
    }

}
