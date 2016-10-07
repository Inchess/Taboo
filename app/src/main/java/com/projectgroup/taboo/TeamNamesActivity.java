package com.projectgroup.taboo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

/**
 * Created by tomasz.kubit on 2016-10-04.
 */

public class TeamNamesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_names);
    }

    public void addMorePlayers_redTeam(View view) {

    }

    public void addMorePlayers_blueTeam(View view) {

    }

    public void goFurther(View view) {
    }

    public void practise(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.text_to_practise);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
