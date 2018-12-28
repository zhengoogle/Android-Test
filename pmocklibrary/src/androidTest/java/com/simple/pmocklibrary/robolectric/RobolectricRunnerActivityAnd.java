package com.simple.pmocklibrary.robolectric;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

import com.simple.pmocklibrary.R;
import com.simple.pmocklibrary.robolectric.RobolectricRunnerActivity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Runner
 * ---http://robolectric.org/
 */
@RunWith(RobolectricTestRunner.class)
public class RobolectricRunnerActivityAnd {
    @Test
    public void robolectricRunnerActivityTest() {
        RobolectricRunnerActivity activity =
                Robolectric.setupActivity(RobolectricRunnerActivity.class);

        activity.rraBtnTest.performClick();

        assertThat(activity.message.getText()).isEqualTo("RRR");
    }

    @Test
    public void robolectricRunnerActivityTest1() throws Exception {
        Activity activity = Robolectric.setupActivity(RobolectricRunnerActivity.class);

        Button button = (Button) activity.findViewById(R.id.rra_btn_test);
        TextView results = (TextView) activity.findViewById(R.id.rra_tv_test);
        String string = results.getText().toString();

        button.performClick();
        Assert.assertEquals("RRR", string);
    }
}


