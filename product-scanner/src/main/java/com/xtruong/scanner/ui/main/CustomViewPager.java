package com.xtruong.scanner.ui.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

/**
 * Created by truongtx on 8/26/2019
 */
public class CustomViewPager extends ViewPager {

    private boolean enabled = false;

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return this.enabled && super.onTouchEvent(event) && performClick();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return this.enabled && super.onInterceptTouchEvent(event);

    }

    @Override
    public boolean performClick() {
        return this.enabled && super.performClick();
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}