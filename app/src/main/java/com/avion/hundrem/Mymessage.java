package com.avion.hundrem;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class Mymessage extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        showllotification(remoteMessage.getNotification().getTitle(), remoteMessage.getNotification().getBody());
    }

    public void showllotification (String title, String message){
    NotificationCompat.Builder builder = new NotificationCompat.Builder ( this,"notify")
            .setContentTitle(title)
            .setSmallIcon (R.drawable.off)
            .setAutoCancel(true)
            .setContentText(message);

    NotificationManagerCompat manager = NotificationManagerCompat. from (this);
    manager.notify(999, builder.build());






    }
}
