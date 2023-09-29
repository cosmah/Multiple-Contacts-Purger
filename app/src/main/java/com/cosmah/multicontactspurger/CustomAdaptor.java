package com.cosmah.multicontactspurger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdaptor extends ArrayAdapter<String> {
    private List<String> dataList;
    private Context context;

    public CustomAdaptor(Context context, List<String> dataList){
        super(context, R.layout.list_item, dataList);
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list_item, parent,false);
        }

        //get the current item from the list
        String currentItem = dataList.get(position);

        //set the item text in the text view
        TextView itemTextView = convertView.findViewById(R.id.itemTextView);
        itemTextView.setText(currentItem);

        return convertView;
    }
}
