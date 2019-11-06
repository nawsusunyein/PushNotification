package com.example.pushnotification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NotiMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noti_message);

        //Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String title = extras.getString("NOTI_TITLE");
            String message = extras.getString("NOTI_CONTENT");
            TextView titleTextView = (TextView) findViewById(R.id.txtNotiTitle);
            TextView messageTextView = (TextView) findViewById(R.id.txtNotiContent);
            titleTextView.setText(title.toString());
            messageTextView.setText(message.toString());
        }
    }

}
