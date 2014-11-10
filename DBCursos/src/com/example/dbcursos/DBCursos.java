package com.example.dbcursos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DBCursos extends Activity {
	private EditText eMatricula, eNombre, eEdad, eDireccion;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button vAlmacenar = (Button) findViewById(R.id.button1);
		Button vReporte = (Button) findViewById(R.id.button2);
		Button vSalir = (Button) findViewById(R.id.button3);
		vAlmacenar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.d("DBCursos Log", "Antes tomar datos");
				eNombre = (EditText) findViewById(R.id.editText1);
				eMatricula = (EditText) findViewById(R.id.EditText03);
				eEdad = (EditText) findViewById(R.id.EditText01);
				eDireccion = (EditText) findViewById(R.id.EditText02);
				
				Intent msg = new Intent(v.getContext(), AlmacenarAlumno.class);
				msg.putExtra("matr", eDireccion.getText().toString());
				msg.putExtra("nom", eNombre.getText().toString());
				msg.putExtra("edad", eEdad.getText().toString());
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
	} // onCreate

	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode == RESULT_OK) {
			// Si todo bien hacemos accion #1
		}
	}
}