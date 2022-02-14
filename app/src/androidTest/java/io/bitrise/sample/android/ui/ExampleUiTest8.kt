package io.bitrise.sample.android.ui

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import io.bitrise.sample.android.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class HelloWorldEspressoTest8 {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun helloWorldIsVisible() {
        Thread.sleep(2000)
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }

    @Test
    fun helloWorldIsVisible2() {
        Thread.sleep(2000)
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }

    @Test
    fun helloWorldIsVisible3() {
        Thread.sleep(2000)
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }

    @Test
    fun helloWorldIsVisible4() {
        Thread.sleep(2000)
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }

    @Test
    fun helloWorldIsVisible5() {
        Thread.sleep(2000)
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }

    @Test
    fun helloWorldIsVisible6() {
        Thread.sleep(2000)
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }

    @Test
    fun helloWorldIsVisible7() {
        Thread.sleep(2000)
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }

    @Test
    fun helloWorldIsVisible8() {
        Thread.sleep(2000)
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }

    @Test
    fun helloWorldIsVisible9() {
        Thread.sleep(2000)
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }

    @Test
    fun helloWorldIsVisible10() {
        Thread.sleep(2000)
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }
}
