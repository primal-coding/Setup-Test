package net.motion.in.stillness.esprit.setuptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void testMethod(){

        int tester = 1+1;
        int dbltester = 2+2;

        int finaltester = tester + dbltester;
    }
}
