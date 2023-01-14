package com.example.surfacegeneration.UI;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MySV extends SurfaceView implements Runnable {
    private Context pContext;
    private Paint pPaint;
    private SurfaceHolder pHolder;
    private boolean running;
    private Thread pThread;

    public MySV(Context context) {
        super(context);
        init(context);
    }

    public MySV(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MySV(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        this.pContext = context;
        this.pHolder = getHolder();
        this.pPaint = new Paint();
        pPaint.setColor(Color.DKGRAY);

        this.resume();

    }

    public void pause() {
        running = false;
        try {
            // Stop the thread (rejoin the main thread)
            pThread.join();
        } catch (InterruptedException e) {
            String str = e.getMessage();
        }
    }

    public void resume() {
        this.running = true;
        this.pThread = new Thread(this);
        this.pThread.start();

    }

    @Override
    public void run() {
        Canvas canvas;
        while (running){
            if(this.pHolder.getSurface().isValid()){
                canvas = pHolder.lockCanvas();
                canvas.save();
                canvas.drawColor(Color.WHITE);
                pPaint.setTextSize(25.0f);
                canvas.drawText("txt",100.0f,100.0f,pPaint);
                pPaint.setStrokeWidth(10.f);
                canvas.drawPoint(10.0f,10.0f,pPaint);
                canvas.restore();
                pHolder.unlockCanvasAndPost(canvas);
            }
        }
    }
}
