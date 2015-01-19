package com.example.t_fukuoka.travisgradletest;

import android.app.Application;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(AndroidJUnit4.class)
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    @Test
    public void sample(){
        // ここのテストは成功
        assertThat(1 + 1, is(2));
    }

    @Test
    public void sample2(){
        // ここのテストは失敗するのでエラーとなる
        // assertThat(1 + 3, is(2));

        // ここのテストは成功
        assertThat(1 + 1, is(2));
    }
}