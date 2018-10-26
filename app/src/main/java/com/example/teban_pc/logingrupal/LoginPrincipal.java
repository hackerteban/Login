package com.example.teban_pc.logingrupal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class LoginPrincipal extends AppCompatActivity {

    TextView txtUsuario;
    TextView txtClave;
    Button btnLogin;
    Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_principal);
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
                    irVentana.putExtra("usuario",Usser);
                    irVentana.putExtra("contraseña",Pass);
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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
