package cse340.doodle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * TODO Extend or modify this class as you wish as part of Activity3
 */
public class MyView extends DrawView {
    /**
     * Constructor for a basic Draw View
     *
     * @param context The Context the view is running in, through which it can access the current theme, resources, etc.
     * @param brush   A paint object for styling when drawing
     */
    public MyView(Context context, Paint brush) {
        super(context, brush);
    }

    /**
     * Draw something on the Canvas
     * @param canvas the canvas that is drawn upon
     */
    protected void onDraw(Canvas canvas) {
    }
}
