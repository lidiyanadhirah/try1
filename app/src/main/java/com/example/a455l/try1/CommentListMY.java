package com.example.a455l.try1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by A455L on 19/12/2017.
 */


public class CommentListMY extends ArrayAdapter<CommentMY> {
    private Activity context;
    List<CommentMY> commentMYs;

    //Create constructor
    public CommentListMY(Activity context, List<CommentMY> commentMYs) {
        super(context, R.layout.list_layout, commentMYs);
        this.context = context;
        this.commentMYs = commentMYs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewComment = (TextView) listViewItem.findViewById(R.id.textViewComment);

        CommentMY commentMY = commentMYs.get(position);
        textViewName.setText(commentMY.getUserName());
        textViewComment.setText(commentMY.getUserComment());

        return listViewItem;
    }
}
