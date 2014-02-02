
package meltedbutter.quicksettings;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

abstract class AbstractTile implements ITile, View.OnClickListener, View.OnLongClickListener {
    protected Context mContext;
    protected ITileControls mControls;
    protected FrameLayout mTop;
    protected ImageView mImage;
    protected TextView mText;

    @Override
    public void construct(Context context, ITileControls controls, FrameLayout top, ImageView image, TextView text) {
        mContext = context;
        mControls = controls;
        mTop = top;
        mImage = image;
        mText = text;

        top.setOnClickListener(this);
        if (hasLongClick()) {
            top.setOnLongClickListener(this);
        }

        prepare();
    }
    
    /**
     * Sub-classes should override these.
     */

    abstract protected void prepare();

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
