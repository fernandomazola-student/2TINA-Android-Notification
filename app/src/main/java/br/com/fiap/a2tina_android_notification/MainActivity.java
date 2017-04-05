package br.com.fiap.a2tina_android_notification;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this);

        notificationBuilder.setContentTitle("Titulo da notification");
        notificationBuilder.setContentText("Aqui vai a mensagem");
        notificationBuilder.setSmallIcon(R.mipmap.ic_launcher);
        notificationBuilder.setVibrate(new long[]{100, 500, 100, 250, 100, 500 });
        notificationBuilder.setOngoing(true);
        
        notificationManager.notify(100, notificationBuilder.build());
    }
}
