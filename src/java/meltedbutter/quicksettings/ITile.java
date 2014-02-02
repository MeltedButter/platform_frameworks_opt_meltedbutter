
package meltedbutter.quicksettings;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public interface ITile {
    public boolean construct(Context context, FrameLayout top, ImageView image, TextView text);
}
