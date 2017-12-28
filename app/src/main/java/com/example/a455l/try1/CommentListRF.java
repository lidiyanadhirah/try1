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


public class CommentListRF extends ArrayAdapter<CommentRF> {
    private Activity context;
    List<CommentRF> commentRFs;

    //Create constructor
    public CommentListRF(Activity context, List<CommentRF> commentRFs) {
        super(context, R.layout.list_layout, commentRFs);
        this.context = context;
        this.commentRFs = commentRFs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewComment = (TextView) listViewItem.findViewById(R.id.textViewComment);

        CommentRF commentRF = commentRFs.get(position);
        textViewName.setText(commentRF.getUserName());
        textViewComment.setText(commentRF.getUserComment());

        return listViewItem;
    }
}
