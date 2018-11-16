package com.thynkbeyond.listinloop;

import android.content.Context;
import android.support.v17.leanback.widget.VerticalGridView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class GradesGrid extends VerticalGridView {
    public GradesGrid(Context context) {
        this(context, null);
    }

    public GradesGrid(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GradesGrid(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void requestChildFocus(View child, View focused) {
        Log.i("Sanjeev","requestChildFocus");
        super.requestChildFocus(child, focused);
    }
}
