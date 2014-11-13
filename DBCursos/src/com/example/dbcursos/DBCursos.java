package com.example.dbcursos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class DBCursos extends Activity {
	private EditText eMatricula, eNombre, eCorreo, eDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button vAlmacenar = (Button) findViewById(R.id.agregar);
		Button vReporte = (Button) findViewById(R.id.ralumnos);
		Button vSalir = (Button) findViewById(R.id.salir);
		vAlmacenar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.d("DBCursos Log", "Antes tomar datos");
				eNombre = (EditText) findViewById(R.id.eNombre);
				eMatricula = (EditText) findViewById(R.id.eMatricula);
				eCorreo = (EditText) findViewById(R.id.eCorreo);
				eDireccion = (EditText) findViewById(R.id.eDireccion);
				
				Intent msg = new Intent(v.getContext(), AlmacenarAlumno.class);
				msg.putExtra("matr", eMatricula.getText().toString());
				msg.putExtra("nom", eNombre.getText().toString());
				msg.putExtra("corr", eCorreo.getText().toString());
				msg.putExtra("dir", eDireccion.getText().toString());
				startActivityForResult(msg, 0);
			} // del metodo onClick
		}); // vAlmacenar clicklistener
		vReporte.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.d("DBCursos Log", "Ir al reporte");
				Intent msg = new Intent(v.getContext(), ReporteAlumnos.class);
				startActivity(msg);
			}
		});
		vSalir.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.d("DBCursos Log", "Salir de app");
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode == RESULT_OK) {
			// Si todo bien hacemos accion #1
		}
	}
}
