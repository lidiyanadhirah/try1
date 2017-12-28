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


public class CommentListPE extends ArrayAdapter<CommentPE> {
    private Activity context;
    List<CommentPE> commentPEs;

    //Create constructor
    public CommentListPE(Activity context, List<CommentPE> commentPEs) {
        super(context, R.layout.list_layout, commentPEs);
        this.context = context;
        this.commentPEs = commentPEs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewComment = (TextView) listViewItem.findViewById(R.id.textViewComment);

        CommentPE commentPE = commentPEs.get(position);
        textViewName.setText(commentPE.getUserName());
        textViewComment.setText(commentPE.getUserComment());

        return listViewItem;
    }
}
