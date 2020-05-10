package com.myproject.my_podpiska2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class screen1Activity extends AppCompatActivity {
    private EditText EdTxName;
    private EditText EdTxMail;
    private TextView TxPod;
    private Button CleanBtn;
    private Button SendBtn;
    private TextView Comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        init();
        SendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NameStr = EdTxName.getText().toString();
                String MailStr = EdTxMail.getText().toString();
                Comment.setText("Подписка успешно оформлена для" + "  " + NameStr +"  " +"на электронный адрес" + "  " + MailStr);
            }

        });

        CleanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Comment.setText(null);
                EdTxName.setText(null);
                EdTxMail.setText(null);
                EdTxName.setFocusableInTouchMode(true); EdTxName.requestFocus();
            }
        });
    }

    private void init() {
        EdTxName = findViewById(R.id.EdTxName);
        EdTxMail = findViewById(R.id.EdTxMail);
        TxPod = findViewById(R.id.TxPod);
        CleanBtn = findViewById(R.id.CleanBtn);
        SendBtn = findViewById(R.id.SendBtn);
        Comment = findViewById(R.id.Comment);
    }

}
