package com.tw.sampleCurrencyConverter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class  HelloAndroidActivity extends Activity {

    private static String TAG = "sampleCurrencyConverter";

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
        setContentView(R.layout.main);
        final EditText dollar = (EditText) findViewById(R.id.dollar);
        final EditText shillings = (EditText) findViewById(R.id.shillings);

        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(dollar.getText().toString().isEmpty() && shillings.getText().toString().isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(),"Alert!",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }

}

