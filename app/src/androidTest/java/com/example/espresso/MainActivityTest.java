package com.example.espresso;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SmallTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class MainActivityTest {
//
//    @Rule
//    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);
//
//    @Test
//    @SmallTest
//    public void TextView_Test() {
//        onView(withId(R.id.txt_hello)).check(matches(withText("Hello World!")));
//    }
//
//    @Test
//    @SmallTest
//    public void EditText_Test() {
//        onView(withId(R.id.edt_hello)).perform(typeText("Hello there"), closeSoftKeyboard()).check(matches(isDisplayed()));
//    }
//
//    @Test
//    @SmallTest
//    public void Button_Test() {
//        onView(withId(R.id.btn)).perform(click()).check(matches(isClickable()));
//    }
}
