package com.example.dbcursos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "cursoeval.db";
	private static final int DATABASE_VERSION = 1;
	private static final String TABLE_NAME = "alumnos";
	public static final String MATRICULA = "matricula";
	public static final String ALUMNO = "nombre";
	public static final String AL_CORREO = "correo";
	public static final String AL_DIR = "direccion";

	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE " + TABLE_NAME + " (" + MATRICULA
				+ " INTEGER PRIMARY KEY NOT NULL," + ALUMNO + " TEXT NOT NULL,"
				+ AL_CORREO + " TEXT NOT NULL," + AL_DIR + " TEXT NOT NULL);");
	} // onCreate

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.v("DBCursos Log", "Actualizando la BD");
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
		onCreate(db);
	}// onUpgrade
} // DatabaseHelper
