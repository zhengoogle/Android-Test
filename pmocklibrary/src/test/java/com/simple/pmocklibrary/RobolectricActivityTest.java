package com.simple.pmocklibrary;

import android.app.Activity;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.android.controller.ActivityController;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(AndroidJUnit4.class)
public class RobolectricActivityTest {
    @Test
    public void testOnCreateNotNull() {
        ActivityController<RobolectricActivity> controller = Robolectric.buildActivity(RobolectricActivity.class);
        Activity activity = controller.create().destroy().get();

        assertThat(activity).isNotNull();
    }
}
