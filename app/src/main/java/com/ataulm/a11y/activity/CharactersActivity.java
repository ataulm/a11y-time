package com.ataulm.a11y.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.ataulm.a11y.R;
import com.ataulm.a11y.character.CharacterAdapter;

public class CharactersActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);

        ListView listView = (ListView) findViewById(R.id.character_list);
        listView.setAdapter(CharacterAdapter.newInstance());
    }

}
