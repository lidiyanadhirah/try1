package com.example.a455l.try1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ReviewBarokah extends AppCompatActivity {

    EditText editTextName;
    EditText editTextComment;
    Button buttonAdd;
    Button back;

    DatabaseReference databaseComments;

    List<CommentB> commentBList;
    ListView listViewComments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barokah_layout);

        databaseComments = FirebaseDatabase.getInstance().getReference("commentBs");

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextComment = (EditText) findViewById(R.id.editTextComment);
        buttonAdd = (Button) findViewById(R.id.buttonAddComment);

        listViewComments = (ListView) findViewById(R.id.ListViewComment);
        commentBList = new ArrayList<>();

        buttonAdd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                addComment();
            }
        });




    }


    private void addComment() {
        //get artistname and convert to string from editextname
        String name = editTextName.getText().toString().trim();
        String comment = editTextComment.getText().toString().trim();

        //check if the name is not empty
        if (!TextUtils.isEmpty(name)) {
            //if exist push data to firebase database
            //store inside id in database
            //every time data stored the id will be unique
            String id = databaseComments.push().getKey();
            //store
            CommentB comments = new CommentB(id, name, comment);
            //store artist inside unique id
            databaseComments.child(id).setValue(comments);
            Toast.makeText(this, "Comment added", Toast.LENGTH_LONG).show();

        } else {
            //if the name is empty
            //if the value is not given displaying a toast
            Toast.makeText(this, "Please enter your Name & Comment", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        //attaching value event listener
        databaseComments.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                //clearing the previous artist list
                commentBList.clear();

                //iterating through all the nodes
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    //getting artist
                    CommentB commentB = postSnapshot.getValue(CommentB.class);
                    //adding artist to the list
                    commentBList.add(commentB);
                }

                //creating adapter
                CommentListB commentAdapter = new CommentListB(ReviewBarokah.this, commentBList);
                //attaching adapter to the listview
                listViewComments.setAdapter(commentAdapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
    public void onClick(View v) {
// TODO Auto-generated method stub

    }

}
