package com.example.vedikajadhav.draganddraw;

import android.graphics.PointF;

/**
 * Created by Vedika Jadhav on 4/17/2015.
 */
public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin) {
        mOrigin = mCurrent = origin;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }

    public PointF getOrigin() {
        return mOrigin;
    }
}
