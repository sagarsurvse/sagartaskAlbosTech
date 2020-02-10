package com.mustofin.sagar.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.content.Context;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.media.MediaPlayer;
import android.widget.TextView;
import android.app.NotificationChannel;
import androidx.core.app.NotificationCompat;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;


import com.mustofin.sagar.R;

public class Fragment1 extends Fragment {


    /**
     *  Created by sagar on 9/2/2020.
     */

    public TextView stateOnOff;
    public ToggleButton toggleButton,toggleButton1;

    private static final String ARG_PARAM = "";

    public static Fragment1 newInstance() {
        Fragment1 fragment = new Fragment1();
        return fragment;
    }

    public static Fragment1 newInstance(String param) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM, param);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.teman_dekat_fragment, container, false);




        toggleButton = view.findViewById(R.id.toggle1);

        toggleButton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                if(isChecked){
                    Toast toast=Toast.makeText(getContext(),"ring 1",Toast.LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();


                        NotificationManager mNotificationManager = (NotificationManager) getContext().getSystemService(Context.NOTIFICATION_SERVICE);
                        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                            NotificationChannel channel = new NotificationChannel("001",
                                    "sagar",
                                    NotificationManager.IMPORTANCE_DEFAULT);
                            channel.setDescription("this is sagar");

                            mNotificationManager.createNotificationChannel(channel);
                        }
                        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getContext(), "001")
                                .setSmallIcon(R.mipmap.ic_launcher) // notification icon
                                .setContentText("check Notification ring 1")// message for notification
                                .setSubText("notification 1")
                                .setAutoCancel(true);

                                mBuilder.setDefaults(Notification.FLAG_ONLY_ALERT_ONCE);
                                // clear notification after click
                        Intent intent = new Intent(getContext(), Fragment1.class);
                        PendingIntent pi = PendingIntent.getActivity(getContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
                        mBuilder.setContentIntent(pi);
                        MediaPlayer mp= MediaPlayer.create(getContext(), R.raw.inflicted);
                        mp.start();
                        mNotificationManager.notify(0, mBuilder.build());

                }else{


                }
            }
        });


        toggleButton1 = view.findViewById(R.id.toggle2);

        toggleButton1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                if(isChecked){
                    Toast toast=Toast.makeText(getContext(),"ring 2",Toast.LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();

                    NotificationManager mNotificationManager = (NotificationManager) getContext().getSystemService(Context.NOTIFICATION_SERVICE);
                    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                        NotificationChannel channel = new NotificationChannel("002",
                                "sagar2",
                                NotificationManager.IMPORTANCE_DEFAULT);
                        channel.setDescription("this is sagar2");

                        mNotificationManager.createNotificationChannel(channel);
                    }
                    NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getContext(), "002")
                            .setSmallIcon(R.mipmap.ic_launcher) // notification icon
                            .setContentText("check Notification ring 2")// message for notification
                            .setSubText("notification 2")
                            .setAutoCancel(true);

                    mBuilder.setDefaults(Notification.FLAG_ONLY_ALERT_ONCE);
                    // clear notification after click
                    Intent intent = new Intent(getContext(), Fragment1.class);
                    PendingIntent pi = PendingIntent.getActivity(getContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
                    mBuilder.setContentIntent(pi);
                    MediaPlayer mp= MediaPlayer.create(getContext(), R.raw.martiangun);
                    mp.start();
                    mNotificationManager.notify(0, mBuilder.build());

                }else{


                }
            }
        });



        return view;
    }
}
