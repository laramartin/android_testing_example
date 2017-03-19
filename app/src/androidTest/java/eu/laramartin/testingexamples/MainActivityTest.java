package eu.laramartin.testingexamples;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by lara on 19.03.17.
 */
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void display_goodbye_when_button_click() {

        onView(withText("Hello World!")).check(matches(isDisplayed()));
        onView(withText("My button")).perform(click());
        onView(withText("goodbye")).check(matches(isDisplayed()));
    }
}