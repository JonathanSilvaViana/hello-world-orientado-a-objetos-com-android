package com.blabla.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //define o texto que ocupa a textview
        String tx = "Aplicativo android";

        TextView texto = (TextView)findViewById(R.id.texto);

        texto.setText(tx);


    }
}
