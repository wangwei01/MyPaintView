package com.example.wangwei.mypaintview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wangwei on 2017/7/6.
 */

public class MyCustomView extends View {
    Paint paint;

    public MyCustomView(Context context) {
        super(context);
    }

    public MyCustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    public MyCustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyCustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //这里处理测量的数据
        setMeasuredDimension(200,200);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.YELLOW);
        canvas.drawRect(200,200,getWidth(),getHeight(),paint);
        paint.setColor(Color.BLUE);
        paint.setTextSize(20);
        paint.getTextBounds("s",0,0,new Rect());
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float v = fontMetrics.descent - fontMetrics.ascent;
        canvas.drawText("ss",0,getHeight()/2,paint);
    }
}
