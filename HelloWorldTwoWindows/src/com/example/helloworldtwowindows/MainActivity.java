package com.example.helloworldtwowindows;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final EditText nameEditText = (EditText) findViewById(R.id.editText1);
		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Log.d("HelloWorld", "My name is "
						+ nameEditText.getText().toString());

				// Inject the package of params for the second activity to
				// receive them.
				Bundle bundle = new Bundle();
				// Key / Values
				bundle.putString("NAME", nameEditText.getText().toString());
				bundle.putString("EDAD", "Twenty");
				bundle.putString("EDAD", "jm@gmail.com");

				// INTENT indicates to which activity the transaction is
				// intended to.
				// INTENT is a mechanism to call the next / another activity.
				// Data is transferred or passed through bundles.
				// It also helps to communicate with other apps.
				// We could say that it is the mechanism of communication
				// between components (activites, apps)
				Intent intent = new Intent(MainActivity.this, Result.class);
				intent.putExtras(bundle);

				// Call or pass the control to the INTENT (Result Window)
				startActivity(intent);
			}
		});
	}
}
