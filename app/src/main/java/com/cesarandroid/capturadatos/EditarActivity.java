package com.cesarandroid.capturadatos;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditarActivity extends AppCompatActivity {

    EditText fehcaamostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar);


        final TextView nombre = (TextView) findViewById(R.id.nomb);
        final TextView fecha = (TextView) findViewById(R.id.fecha);
        final TextView telefono = (TextView) findViewById(R.id.telf);
        final TextView email = (TextView) findViewById(R.id.emal);
        final  TextView descripcion = (TextView) findViewById(R.id.descri);
        Button Bante = (Button) findViewById(R.id.Banterior);

        /** Mandamos a llamar los id del los TextView en donde se recibira la cadena */
        Bundle bundle = this.getIntent().getExtras();
        nombre.setText("Su nombre es: "   + bundle.getString("Nombre"));
        fecha.setText("Fecha:  "  +bundle.getString("Fecha"));
        telefono.setText("Su Telefono es: "  + bundle.getString("Telefono"));
        email.setText("Su Email es: "  + bundle.getString("Email"));
        descripcion.setText("Descripcion es: "  + bundle.getString("Descripcion"));

        /** Mandamos a llamar al boton siguiente*/

        Bante.setOnClickListener(new Button.OnClickListener(){

            /** Metodo OnClik del Boton siguiente en el cual se estan pasando las cadenas que se camputen y pasarla en la
             siguiente actividad*/
            @Override
            public void onClick(View v){

                onBackPressed();
            }
        });




    }



}
