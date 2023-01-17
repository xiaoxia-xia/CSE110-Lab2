package edu.ucsd.cse110.lab2;

import static org.junit.Assert.assertEquals;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class BetterMainActvityTest {
    @Test
    public void test_one_plus_one(){
        var scenario = ActivityScenario.launch(MainActivity.class);
        scenario.moveToState(Lifecycle.State.CREATED);
        scenario.moveToState(Lifecycle.State.STARTED);

        scenario.onActivity(activity -> {
            Button one = (Button) activity.findViewById(R.id.btn_one);
            Button plu = (Button) activity.findViewById(R.id.btn_plus);
            Button equ = (Button) activity.findViewById(R.id.btn_equals);
            one.performClick();
            plu.performClick();
            one.performClick();
            equ.performClick();


            TextView result = activity.findViewById(R.id.display);
            assertEquals("2", result.getText().toString());
        });
    }
}
