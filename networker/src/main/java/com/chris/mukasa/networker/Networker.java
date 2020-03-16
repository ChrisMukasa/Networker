package com.chris.mukasa.networker;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.util.Objects;

/**
 **** This Library is the property for Chris Simba Mukasa
 **** Email: mukasa.chris7@gmail.com
 **** Phone: +243-994-802-444
 **** R.D.Congo
 **** Edition March 2020
 **** Mobile Developer Enthusiast
 */
public class Networker
{
    public static boolean check(Context context)
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT)
            networkInfo = Objects.requireNonNull(connectivityManager).getActiveNetworkInfo();

        return  (networkInfo != null && networkInfo.isConnected());
    }
}
