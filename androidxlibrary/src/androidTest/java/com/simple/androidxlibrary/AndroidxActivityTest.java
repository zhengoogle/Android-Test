package com.simple.androidxlibrary;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Androidx test
 * developer doc
 * ---https://developer.android.com/reference/androidx/test/packages
 * example
 * ---https://github.com/googlesamples/android-testing
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class AndroidxActivityTest {
    AndroidxActivity mActivity;

    @Rule
    public ActivityScenarioRule<AndroidxActivity> mActivityRule
            = new ActivityScenarioRule<>(AndroidxActivity.class);

    @Test
    public void espressoActivityTest() {
        // get lunch activity
//        mActivity = mActivityRule.getActivity();
        // 通过text匹配
        onView(withText("Say hello!")).perform(click());
        closeSoftKeyboard();

        onView(withText(R.string.aa_tv_text)).perform(click());

        onView(withId(R.id.aa_tv_test)).perform(click());

        // Use the ViewAssertions methods to check.
        onView(withId(R.id.aa_tv_test)).check(matches(withText(R.string.aa_tv_text)));

        // runOnUiThread
//        try {
//            mActivityRule.runOnUiThread(new Runnable() {
//                @Override
//                public void run() {
//
//                }
//            });
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
    }
}