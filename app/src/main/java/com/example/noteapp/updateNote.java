package com.example.noteapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

public class updateNote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_note);


      /*  public void updateNote(final Note note) {
            final AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Name");
            final View customLayout = getLayoutInflater().inflate(R.layout.dialog, null);
            builder.setView(customLayout);
            builder.setPositiveButton(
                    "Update",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            updateTitle = customLayout.findViewById(R.id.update_title);

                            db.collection("notes").document(note.getId()).update("User Name", updateTitle.getText().toString())
                                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                                        @Override
                                        public void onSuccess(Void aVoid) {
                                            Log.d("n", "DocumentSnapshot successfully updated!");
                                        }
                                    })
                                    .addOnFailureListener(new OnFailureListener() {
                                        @Override
                                        public void onFailure(@NonNull Exception e) {
                                            Log.w("dareen", "Error updating document", e);
                                        }
                                    });
                        }
                    });
            AlertDialog dialog = builder.create();
            dialog.show();
        }

    }*/
    }
}