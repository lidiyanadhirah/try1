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


public class CommentListMRJ extends ArrayAdapter<CommentMRJ> {
    private Activity context;
    List<CommentMRJ> commentMRJs;

    //Create constructor
    public CommentListMRJ(Activity context, List<CommentMRJ> commentMRJs) {
        super(context, R.layout.list_layout, commentMRJs);
        this.context = context;
        this.commentMRJs = commentMRJs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewComment = (TextView) listViewItem.findViewById(R.id.textViewComment);

        CommentMRJ commentMRJ = commentMRJs.get(position);
        textViewName.setText(commentMRJ.getUserName());
        textViewComment.setText(commentMRJ.getUserComment());

        return listViewItem;
    }
}
