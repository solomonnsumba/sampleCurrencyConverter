package com.tw.sampleCurrencyConverter;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowToast;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)

public class HelloActivityTest {

    private HelloAndroidActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = new HelloAndroidActivity();
        activity.onCreate(null);
    }

    @Test
    public void testTextDisplayed() {

        TextView text = (TextView) activity.findViewById(R.id.sampleText);
        assertEquals("Hello sampleCurrencyConverter!", text.getText().toString());
    }

    @Test
    public void testNonValues() {
        View dollar = (EditText) activity.findViewById(R.id.dollar);
        View shillings = (EditText) activity.findViewById(R.id.shillings);

        Button submit = (Button)activity.findViewById(R.id.submit);

        submit.performClick();
        assertEquals("Alert!", ShadowToast.getTextOfLatestToast());

    }
}