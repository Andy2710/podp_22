package com.myproject.my_podpiska2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class screen1Activity extends AppCompatActivity {
    private EditText edTxName;
    private EditText edTxMail;
    private TextView txPod;
    private Button cleanBtn;
    private Button sendBtn;
    private TextView comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        init();
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameStr = edTxName.getText().toString();
                String mailStr = edTxMail.getText().toString();
                String userInfo = getString(R.string.welcome_msg, nameStr, mailStr);
                comment.setText(userInfo);

            }

        });

        cleanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comment.setText("");
                edTxName.getText().clear();
                edTxMail.getText().clear();
                edTxName.setFocusableInTouchMode(true); edTxName.requestFocus();
            }
        });
    }

    private void init() {
        edTxName = findViewById(R.id.edTxName);
        edTxMail = findViewById(R.id.edTxMail);
        txPod = findViewById(R.id.txPod);
        cleanBtn = findViewById(R.id.cleanBtn);
        sendBtn = findViewById(R.id.sendBtn);
        comment = findViewById(R.id.comment);
    }

}
