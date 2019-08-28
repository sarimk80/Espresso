package com.example.espresso;


import androidx.fragment.app.testing.FragmentScenario;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SmallTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class FirstFragmentTest {

    @Test
    @SmallTest
    public void TestNavigation() {
        final NavController mockNavController = mock(NavController.class);

        FragmentScenario<FirstFragment> fragmentScenario = FragmentScenario.launchInContainer(FirstFragment.class);

        fragmentScenario.onFragment(fragment -> Navigation.setViewNavController(fragment.requireView(), mockNavController));

        onView(withId(R.id.btn)).perform(click());

        verify(mockNavController).navigate(R.id.action_firstFragment_to_secondFragment);

    }
}
