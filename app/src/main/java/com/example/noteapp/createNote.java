package com.example.noteapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class createNote extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    EditText notes_title;
    EditText notes_content;
    Button notes_save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_note);

        notes_title = findViewById(R.id.notes_title_text);
        notes_content = findViewById(R.id.notes_content_text);
        notes_save = findViewById(R.id.save_note_btn);
    }

    public  void saveToFirebase (View v){

        String title = notes_title .getText().toString();
        String content = notes_content.getText().toString();
        Map<String, Object> note = new HashMap<>();//notes
        if(!title.isEmpty() && !content.isEmpty()) {
            note.put("title",title);//notes
            note.put("content",content);

//notes
            db.collection("notes")
                    .add(note)
                    .addOnSuccessListener(documentReference -> {
                        Log.e("n", "Data added successfully to database: ");
                        openMainScreen();
                    })
                    .addOnFailureListener(e -> Log.e("n", "Failed to add database", e));

        }else {
            Toast.makeText(this,"please fill feilds" , Toast.LENGTH_SHORT).show();
        }
    }
    public  void  openMainScreen(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}