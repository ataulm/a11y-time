package com.ataulm.a11y.character;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.ataulm.a11y.R;

import java.util.List;

public class CharacterAdapter extends BaseAdapter {

    private List<Character> characters;

    private CharacterAdapter(List<Character> characters) {
        this.characters = characters;
    }

    public static CharacterAdapter newInstance() {
        return new CharacterAdapter(CharacterRepository.fetchAll());
    }

    @Override
    public int getCount() {
        return characters.size();
    }

    @Override
    public Character getItem(int position) {
        return characters.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = newCharacterListItemView(parent);
        }
        ((CharacterListItemView) itemView).updateWith(getItem(position));
        return itemView;
    }

    private View newCharacterListItemView(ViewGroup parent) {
        return LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item_character_list, parent, false);
    }

}
