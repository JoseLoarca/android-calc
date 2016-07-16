package org.jcloarca.androidcalc;

import android.app.Application;

/**
 * Created by JCLoarca on 7/16/2016 1:05 AM.
 */
public class AndroidCalcApp extends Application {

    private final static String URL_ABOUT = "https://about.me/joseloarca";

    public String getUrlAbout() {
        return URL_ABOUT;
    }

}
