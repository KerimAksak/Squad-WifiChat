package com.example.abdulkerimaksak.squad;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class ConnectActivity extends AppCompatActivity {


    Button btnOnOff, btnDiscover, btnSend;
    ListView listView;
    TextView read_msg_box, connectionStatus;
    EditText writeMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        initialWork();
    }

    private void initialWork() {
        btnOnOff = (Button) findViewById(R.id.btn_onOff);
        btnDiscover = (Button) findViewById(R.id.btn_discover);
        btnSend = (Button) findViewById(R.id.btn_send);
        listView = (ListView) findViewById(R.id.listView);
        read_msg_box = (TextView)findViewById(R.id.tv_readText);
        connectionStatus = (TextView)findViewById(R.id.tv_connectionStatus);
        writeMsg = (EditText)findViewById(R.id.writeMsg);
    }
}
