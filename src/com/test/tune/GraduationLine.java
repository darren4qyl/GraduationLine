package com.test.tune;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;

public class GraduationLine extends View {
	private static final int TEXT_SIZE = 18;
	 
    private float mDensity;
    private int mWidth, mHeight;
	public GraduationLine(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		mDensity = getContext().getResources().getDisplayMetrics().density;
	}
	@Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        mWidth = getWidth();
        mHeight = getHeight();
        super.onLayout(changed, left, top, right, bottom);
    }
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
	}
	private void drawScaleLine(Canvas canvas) {
        canvas.save();
 
        Paint linePaint = new Paint();
        linePaint.setStrokeWidth(2);
        linePaint.setColor(Color.BLACK);
 
        TextPaint textPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setTextSize(TEXT_SIZE * mDensity);
 
        int width = mWidth, drawCount = 0;
        float xPosition = 0, textWidth = Layout.getDesiredWidth("0", textPaint);
 
        for (int i = 0; drawCount <= 4 * width; i++) {
          /*  int numSize = String.valueOf(mValue + i).length();
 
            xPosition = (width / 2 - mMove) + i * mLineDivider * mDensity;
            if (xPosition + getPaddingRight() < mWidth) {
                if ((mValue + i) % mModType == 0) {
                    canvas.drawLine(xPosition, getPaddingTop(), xPosition, mDensity * ITEM_MAX_HEIGHT, linePaint);
 
                    if (mValue + i <= mMaxValue) {
                        switch (mModType) {
                        case MOD_TYPE_HALF:
                            canvas.drawText(String.valueOf((mValue + i) / 2), countLeftStart(mValue + i, xPosition, textWidth), getHeight() - textWidth, textPaint);
                            break;
                        case MOD_TYPE_ONE:
                            canvas.drawText(String.valueOf(mValue + i), xPosition - (textWidth * numSize / 2), getHeight() - textWidth, textPaint);
                            break;
 
                        default:
                            break;
                        }
                    }
                } else {
                    canvas.drawLine(xPosition, getPaddingTop(), xPosition, mDensity * ITEM_MIN_HEIGHT, linePaint);
                }
            }
 
            xPosition = (width / 2 - mMove) - i * mLineDivider * mDensity;
            if (xPosition > getPaddingLeft()) {
                if ((mValue - i) % mModType == 0) {
                    canvas.drawLine(xPosition, getPaddingTop(), xPosition, mDensity * ITEM_MAX_HEIGHT, linePaint);
 
                    if (mValue - i >= 0) {
                        switch (mModType) {
                        case MOD_TYPE_HALF:
                            canvas.drawText(String.valueOf((mValue - i) / 2), countLeftStart(mValue - i, xPosition, textWidth), getHeight() - textWidth, textPaint);
                            break;
                        case MOD_TYPE_ONE:
                            canvas.drawText(String.valueOf(mValue - i), xPosition - (textWidth * numSize / 2), getHeight() - textWidth, textPaint);
                            break;
 
                        default:
                            break;
                        }
                    }
                } else {
                    canvas.drawLine(xPosition, getPaddingTop(), xPosition, mDensity * ITEM_MIN_HEIGHT, linePaint);
                }
            }
 
            drawCount += 2 * mLineDivider * mDensity;*/
        }
 
        canvas.restore();
    }
 
}
