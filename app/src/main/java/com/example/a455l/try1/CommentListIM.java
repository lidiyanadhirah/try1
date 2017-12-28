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


public class CommentListIM extends ArrayAdapter<CommentTP> {
    private Activity context;
    List<CommentTP> commentTPs;

    //Create constructor
    public CommentListIM(Activity context, List<CommentTP> commentTPs) {
        super(context, R.layout.list_layout, commentTPs);
        this.context = context;
        this.commentTPs = commentTPs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewComment = (TextView) listViewItem.findViewById(R.id.textViewComment);

        CommentTP commentTP = commentTPs.get(position);
        textViewName.setText(commentTP.getUserName());
        textViewComment.setText(commentTP.getUserComment());

        return listViewItem;
    }
}
