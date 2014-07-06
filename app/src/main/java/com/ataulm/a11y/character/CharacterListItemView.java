package com.ataulm.a11y.character;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ataulm.a11y.R;

public class CharacterListItemView extends LinearLayout {

    private ImageView profileImageView;
    private TextView nameTextView;

    public CharacterListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CharacterListItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onFinishInflate() {
        setOrientation(HORIZONTAL);

        profileImageView = (ImageView) findViewById(R.id.profile_character_list_item_image);
        nameTextView = (TextView) findViewById(R.id.name_character_list_item_text);
    }

    public void updateWith(Character character) {
        nameTextView.setText(character.getName());
        profileImageView.setImageResource(character.getProfileDrawableResId());
    }

}
