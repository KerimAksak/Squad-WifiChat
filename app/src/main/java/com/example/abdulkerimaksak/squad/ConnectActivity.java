package com.example.abdulkerimaksak.squad;

import android.content.Context;
import android.content.res.Configuration;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ConnectActivity extends AppCompatActivity {


    Button btnOnOff, btnDiscover, btnSend;
    ListView listView;
    TextView read_msg_box, connectionStatus;
    EditText writeMsg;

    WifiManager wifiManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        initialWork();
        exqListener();
    }



    private void exqListener() {//wifi open/close
        btnOnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(wifiManager.isWifiEnabled()) {
                    wifiManager.setWifiEnabled(false);
                    Toast toast = Toast.makeText(getApplicationContext(), "Wi-fi kapatıldı.", Toast.LENGTH_SHORT);
                    toast.show();
                    btnOnOff.setText("Wifi Aç");
                }else{
                    wifiManager.setWifiEnabled(true);
                    Toast toast = Toast.makeText(getApplicationContext(), "Wi-fi açıldı.", Toast.LENGTH_SHORT);
                    toast.show();
                    btnOnOff.setText("Wifi Kapat");
                }
            }
        });
    }

    private void initialWork() {
        btnOnOff = (Button) findViewById(R.id.btn_onOff);
        btnDiscover = (Button) findViewById(R.id.btn_discover);
        btnSend = (Button) findViewById(R.id.btn_send);
        listView = (ListView) findViewById(R.id.listView);
        read_msg_box = (TextView)findViewById(R.id.tv_readText);
        connectionStatus = (TextView)findViewById(R.id.tv_connectionStatus);
        writeMsg = (EditText)findViewById(R.id.writeMsg);

        wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
    }
}
