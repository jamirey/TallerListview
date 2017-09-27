package com.example.usuario.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Circulo extends AppCompatActivity {

    private EditText Area;
    private Resources resource;
    private Intent In;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        Area = (EditText)findViewById(R.id.Resultado);
        resource=this.getResources();
    }

    public void Calcular (View view){

        double res;
        double radio;

        int area = Integer.parseInt(Area.getText().toString());

        res = 3.1416 * Math.pow(area,2);

        Resultado obj = new Resultado("Area del Circulo",res,area);
        obj.guardar();
        In= new Intent(Circulo.this, VistaCalculo.class);
        In.putExtra("TituloOperaciones",resource.getString(R.string.circulo));
        In.putExtra("textResultado","Area: "+obj.getResultado());
        startActivity(In);

    }
}
