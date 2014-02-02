
package meltedbutter.quicksettings;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

abstract class AbstractTile implements ITile, View.OnClickListener, View.OnLongClickListener {
    protected Context mContext;
    protected FrameLayout mTop;
    protected ImageView mImage;
    protected TextView mText;

    @Override
    public boolean construct(Context context, FrameLayout top, ImageView image, TextView text) {
        mContext = context;
        mTop = top;
        mImage = image;
        mText = text;

        top.setOnClickListener(this);
        if (hasLongClick()) {
            top.setOnLongClickListener(this);
        }

        return prepare();
    }
    
    /**
     * Sub-classes should override these.
     */

    /**
     * @return Whether or not the tile should be shown
     */
    abstract protected boolean prepare();

    public abstract void onClick(View view);

    /**
     * Not dynamic. Only checked on construction.
     */
    protected boolean hasLongClick() {
        return false;
    }

    @Override
    public boolean onLongClick(View view) {
        return false;
    }
}
