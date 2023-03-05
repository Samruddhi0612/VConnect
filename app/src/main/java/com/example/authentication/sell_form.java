package com.example.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class sell_form extends AppCompatActivity {

    // creating variables for our edit text
    //private EditText courseNameEdt, courseDurationEdt, courseDescriptionEdt;

    // creating variable for button
    //private Button submitCourseBtn;
    //private Button image;

    // creating a strings for storing
    // our values from edittext fields.
    //private String courseName, courseDuration, courseDescription;

    // creating a variable
    // for firebasefirestore.
    //private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_form);

        // getting our instance
        // from Firebase Firestore.
//        db = FirebaseFirestore.getInstance();
//
//        // initializing our edittext and buttons
//        courseNameEdt = findViewById(R.id.item_name);
//        courseDescriptionEdt = findViewById(R.id.item_desc);
//        courseDurationEdt = findViewById(R.id.item_price);
//        submitCourseBtn = findViewById(R.id.submit);
//        image = findViewById(R.id.upload_image);
//
////        image.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                startActivity(new Intent(sell_form.this,Upload_image_sell.class));
////            }
////        });
//        // adding on click listener for button
//        submitCourseBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                // getting data from edittext fields.
//                courseName = courseNameEdt.getText().toString();
//                courseDescription = courseDescriptionEdt.getText().toString();
//                courseDuration = courseDurationEdt.getText().toString();
//
//                // validating the text fields if empty or not.
//                if (TextUtils.isEmpty(courseName)) {
//                    courseNameEdt.setError("Please enter item name");
//                } else if (TextUtils.isEmpty(courseDescription)) {
//                    courseDescriptionEdt.setError("Please enter description");
//                } else if (TextUtils.isEmpty(courseDuration)) {
//                    courseDurationEdt.setError("Please enter price");
//                } else {
//                    // calling method to add data to Firebase Firestore.
//                    addDataToFirestore(courseName, courseDescription, courseDuration);
//                }
//            }
//        });
//    }
//
//    private void addDataToFirestore(String courseName, String courseDescription, String courseDuration) {
//
//        // creating a collection reference
//        // for our Firebase Firestore database.
//        CollectionReference dbCourses = db.collection("Selling");
//
//        // adding our data to our courses object class.
//        User seller = new User(courseName, courseDescription, courseDuration);
//
//        // below method is use to add data to Firebase Firestore.
//        dbCourses.add(seller).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
//            @Override
//            public void onSuccess(DocumentReference documentReference) {
//                // after the data addition is successful
//                // we are displaying a success toast message.
//                Toast.makeText(sell_form.this, "Your Item has been added!", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(sell_form.this,Option.class));
//            }
//        }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//                // this method is called when the data addition process is failed.
//                // displaying a toast message when data addition is failed.
//                Toast.makeText(sell_form.this, "Fail to add item \n" + e, Toast.LENGTH_SHORT).show();
//            }
//        });
//
//


    }
}