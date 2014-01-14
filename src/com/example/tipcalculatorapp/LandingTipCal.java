package com.example.tipcalculatorapp;

import com.example.tipcalculatorapp.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LandingTipCal extends Activity {

	EditText etBillAmountEntered = null;
	TextView afterTipLabel = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_landing_tip_cal);
		etBillAmountEntered = (EditText) findViewById(R.id.etEnterAmountID);
		afterTipLabel= (TextView) findViewById(R.id.textView1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.landing_tip_cal, menu);
		return true;
	}

    public void calculateTip(View v){
    	
    	Double beforeTipAmount = Double.valueOf(etBillAmountEntered.getText().toString());
    	//That's how to get the "AMOUNT" entered by the user in the 'EditText' view for amount
    	
    	String textOfButton = ((Button)v).getText().toString();
    	// That's how to get the button text
    	String[] split = textOfButton.split("%");
    	Double tipPercentage = Double.valueOf(split[0]);// calculate the TIP
    	
     
    	Double afterTipAmount = (double) ((beforeTipAmount*tipPercentage)/100);
    	// calculating final amount using the TIP
        
    	afterTipLabel.setText(String.valueOf(afterTipAmount));
        // Printing it to textview label on the android screen
        
    }

}
