package com.example.unittesting

import androidx.core.content.MimeTypeFilter.matches
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

    @get:Rule
    val activityScenario= activityScenarioRule<MainActivity>()

    @Test
    fun tesSubmitData(){
        onView(withId(R.id.data_txtvw)).perform(click()).perform(typeText("Vinay Lakshmi"));
        onView(withId(R.id.description_txtvw)).perform(click()).perform(typeText("Mandira"));
        hideKeyboard()
        onView(withId(R.id.submit_data)).perform(click());
    }

    fun hideKeyboard() {
        onView(ViewMatchers.isRoot()).perform(ViewActions.closeSoftKeyboard())
    }
}