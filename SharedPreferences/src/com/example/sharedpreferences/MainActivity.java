package com.example.sharedpreferences;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void saveData(View view) {
		// R = App Resources
		// android.R. => Resource in the device, in the OS
		EditText textName = (EditText) findViewById(R.id.editText1);
		EditText textAge = (EditText) findViewById(R.id.EditText01);
		EditText textAddress = (EditText) findViewById(R.id.EditText02);

		// Context.MODE_PRIVATE -> Only my app (on this package) will have
		// access to the shared_pref file.
		SharedPreferences prefs = getSharedPreferences(
				"shared_preferences_register", Context.MODE_PRIVATE);

		SharedPreferences.Editor editor = prefs.edit();
		editor.putString("name", textName.getText().toString());
		editor.putString("age", textAge.getText().toString());
		editor.putString("address", textAddress.getText().toString());
		editor.commit();

		// Retrieve data
		String name = prefs.getString("name", "is null");
		String age = prefs.getString("age", "is null");
		String address = prefs.getString("address", "is null");

		// Display a little pop-up for a few seconds.
		Toast.makeText(
				this,
				"Persisted - Name: " + name + " age: " + age + " address: "
						+ address, Toast.LENGTH_SHORT).show();
	}
}
