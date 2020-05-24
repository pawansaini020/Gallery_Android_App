package com.example.p.mrmrsmksaini;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        //toolbar and back sign----------------------------------
        getSupportActionBar().setTitle("Feedback");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // end

        //email send----------------------------------------------------

        final EditText to = (EditText) findViewById(R.id.email);
        final EditText subject = (EditText) findViewById(R.id.subject);
        final EditText message = (EditText) findViewById(R.id.message);

        final Button sendE = (Button) findViewById(R.id.send);
        sendE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String tos = to.getText().toString();
                String subS = subject.getText().toString();
                String mesS = message.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,new String[]{ tos});
                email.putExtra(Intent.EXTRA_SUBJECT, subS);
                email.putExtra(Intent.EXTRA_TEXT, mesS);

                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email,"Choose app to send mail"));


            }
        });

        // end----------------------------------------------------------------------------

    }
}
