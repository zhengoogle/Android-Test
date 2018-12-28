package com.simple.espressolibrary;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Espresso
 * developer doc
 * ---https://developer.android.com/training/testing/espresso/
 * example
 * ---https://github.com/chiuki/espresso-samples
 * ---https://github.com/hitherejoe/Android-Boilerplate
 * ---https://github.com/vgrec/EspressoExamples
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspressoActivityTest {
    EspressoActivity mActivity;

    @Rule
    public ActivityTestRule<EspressoActivity> mActivityRule
            = new ActivityTestRule<>(EspressoActivity.class);

    @Test
    public void espressoActivityTest() {
        // get lunch activity
        mActivity = mActivityRule.getActivity();
        // 通过text匹配
        onView(withText("Say hello!")).perform(click());
        closeSoftKeyboard();

        onView(withText(R.string.ae_tv_text)).perform(click());

        onView(withId(R.id.ae_tv_test)).perform(click());

        // Use the ViewAssertions methods to check.
        onView(withId(R.id.ae_tv_test)).check(matches(withText(R.string.ae_tv_text)));

        // runOnUiThread
        try {
            mActivityRule.runOnUiThread(new Runnable() {
                @Override
                public void run() {

                }
            });
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
