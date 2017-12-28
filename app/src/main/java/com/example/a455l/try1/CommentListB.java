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


public class CommentListB extends ArrayAdapter<CommentB> {
    private Activity context;
    List<CommentB> commentBs;

    //Create constructor
    public CommentListB(Activity context, List<CommentB> commentBs) {
        super(context, R.layout.list_layout, commentBs);
        this.context = context;
        this.commentBs = commentBs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewComment = (TextView) listViewItem.findViewById(R.id.textViewComment);

        CommentB commentB = commentBs.get(position);
        textViewName.setText(commentB.getUserName());
        textViewComment.setText(commentB.getUserComment());

        return listViewItem;
    }
}
