
package meltedbutter.quicksettings;

import android.view.View;
import android.widget.Toast;

public class HelloTile extends AbstractTile {
    private Toast mToast;

    @Override
    protected void prepare() {
        mImage.setImageResource(android.R.drawable.ic_dialog_info);
        mText.setText("SAY HELLO");
        mToast = Toast.makeText(mContext, "Hello, World!", Toast.LENGTH_SHORT);
    }

    @Override
    public void onClick(View v) {
        mToast.show();
        mTop.setVisibility(View.GONE);
        mControls.closeShade();
    }
}
