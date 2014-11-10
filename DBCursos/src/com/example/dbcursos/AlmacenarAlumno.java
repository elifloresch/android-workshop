package com.example.dbcursos;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

public class AlmacenarAlumno extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Bundle extras = getIntent().getExtras();
		Log.d("AlmacenarAlumno", "Recuperando datos enviados");
		if (extras != null) {
			String eMatr = (String) extras.getString("matr").toString();
			String eNombre = (String) extras.getString("nom").toString();
			String eCorreo = (String) extras.getString("edad").toString();
			String eDireccion = (String) extras.getString("dir").toString();
			agregarAlumno(eMatr, eNombre, eCorreo, eDireccion);
			setResult(RESULT_OK, null);
		} else { // Regresa un Error...
			Log.e("Error DBCursos", "No hay datos");
			setResult(RESULT_CANCELED, null);
		}
		finish(); // Regresar control a la actividad principal
	} // del metodo onCreate

	private void agregarAlumno(String matr, String nom, String corr, String dir) {
		DatabaseHelper dbHelper = new DatabaseHelper(this);
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		Log.d("AlmacenarAlumno", "Agrega matricula: " + matr);
		ContentValues cv = new ContentValues();
		cv.put(DatabaseHelper.MATRICULA, matr);
		cv.put(DatabaseHelper.ALUMNO, nom);
		cv.put(DatabaseHelper.AL_EDAD, corr);
		cv.put(DatabaseHelper.AL_DIR, dir);
		db.insert("alumnos", DatabaseHelper.MATRICULA, cv);
		db.close();
	}
}
