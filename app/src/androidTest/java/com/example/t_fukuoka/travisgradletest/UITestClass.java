package com.example.t_fukuoka.travisgradletest;

import android.test.ActivityInstrumentationTestCase2;

import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by t_fukuoka on 15/01/19.
 */
public class UITestClass extends ActivityInstrumentationTestCase2 <MainActivity>{

    public UITestClass() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // For each test method invocation, the Activity will not actually be created
        // until the first time this method is called.
        getActivity();
    }

    @Test
    public void testButtonClick() {
        // MainActivityのボタンクリック後にToastを表示する動作のテスト
        onView(withId(R.id.button)).perform(click());
    }
}
