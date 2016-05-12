package com.example.asus.day27_myview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by asus on 2016/5/10.
 */
public class MyView extends View {
    private Paint mpaint;

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initpaint();
    }

    private void initpaint() {
        mpaint=  new Paint();

        mpaint.setAntiAlias(true);
        mpaint.setDither(true);


    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        mpaint.setColor(Color.CYAN);
        mpaint.setStyle(Paint.Style.STROKE);
        mpaint.setStrokeWidth(10);
        canvas.drawCircle(400, 400, 200, mpaint);
    }

    public MyView(Context context) {
        super(context);


    }
}
