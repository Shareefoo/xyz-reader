package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {

    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {

        URL url = null;

        try {
//            url = new URL("https://go.udacity.com/xyz-reader-json");
            url = new URL("");

        } catch (MalformedURLException e) {
            e.printStackTrace();
            Log.e(TAG, "Error fetching the url, trying to fetch the alternative url");

            // try fetching another url
            try {
                url = new URL("https://raw.githubusercontent.com/SuperAwesomeness/XYZReader/master/data.json");

            } catch (MalformedURLException e2) {
                e2.printStackTrace();
                Log.e(TAG, "Error fetching the alternative url");
            }
        }

        BASE_URL = url;
    }
}
