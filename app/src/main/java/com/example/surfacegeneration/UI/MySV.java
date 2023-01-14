package com.example.surfacegeneration.UI;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class MySV extends SurfaceView implements Runnable{
    public MySV(Context context) {
        super(context);
    }

    public MySV(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MySV(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void run() {

    }
}
