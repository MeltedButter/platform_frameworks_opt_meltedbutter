
package meltedbutter.quicksettings;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public interface ITile {
    public void construct(Context context, ITileControls controls, FrameLayout top, ImageView image, TextView text);
}
