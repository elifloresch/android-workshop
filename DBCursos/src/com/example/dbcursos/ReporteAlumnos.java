package com.example.dbcursos;

import java.util.Locale;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ReporteAlumnos extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.ralumnos);
//		// Selecciona informacion para generar un reporte de alumnos
////		TextView view = (TextView) findViewById(R.id.reportealumnos);
////		Button regresar = (Button) findViewById(R.id.regresar);
//		regresar.setOnClickListener(new OnClickListener() {
//			public void onClick(View arg) {
//				setResult(RESULT_OK, null);
//				finish();
//			}
//		});
//		SQLiteDatabase db;
//		Log.v("Conn BD", "Momentos antes de obtener datos...");
//		db = openOrCreateDatabase("cursoeval.db",
//				SQLiteDatabase.CREATE_IF_NECESSARY, null);
//		db.setVersion(1);
//		db.setLocale(Locale.getDefault());
//		db.setLockingEnabled(true);
//		Cursor cur = db.query("alumnos", null, null, null, null, null, null);
//		cur.moveToFirst();
//		while (cur.isAfterLast() == false) {
//			view.append("\n" + cur.getString(1));
//			cur.moveToNext();
//		}
//		cur.close();
//		/*
//		 * - Actualizar un campo de la tabla - ContentValues updateAlumnos = new
//		 * ContentValues(); updateAlumnos.put("email", "jwagner@uabc.edu.mx");
//		 * db.update("alumnos", updateAlumnos, "matricula=?", new String[]
//		 * {Long.toString(matricula)}); - Eliminar un elemento de la tabla -
//		 * db.delete("alumnos", "id=?", new String[]
//		 * {Long.toString(matricula)});
//		 */
	} // onCreate
}