package com.example.thomychanca.finalthomy.util.logging;

import android.util.Log;

import timber.log.Timber;

/**
 * Created by thomychanca on 12/03/2017.
 */

public class CrashRepostingTree extends Timber.Tree {
    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
        /*if (priority== Log.VERBOSE||priority==Log.DEBUG){

        }*/
    }
}
