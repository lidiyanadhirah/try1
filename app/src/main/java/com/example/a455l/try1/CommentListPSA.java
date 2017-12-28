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


public class CommentListPSA extends ArrayAdapter<CommentPSA> {
    private Activity context;
    List<CommentPSA> commentPSAs;

    //Create constructor
    public CommentListPSA(Activity context, List<CommentPSA> commentPSAs) {
        super(context, R.layout.list_layout, commentPSAs);
        this.context = context;
        this.commentPSAs = commentPSAs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewComment = (TextView) listViewItem.findViewById(R.id.textViewComment);

        CommentPSA commentPSA = commentPSAs.get(position);
        textViewName.setText(commentPSA.getUserName());
        textViewComment.setText(commentPSA.getUserComment());

        return listViewItem;
    }
}
