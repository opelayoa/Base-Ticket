package mx.com.tiendas3b.ticketdoctorexpress.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.Button;

public class FontAwesomeButton extends android.support.v7.widget.AppCompatButton {

    Context context;
    Typeface typeface;

    public FontAwesomeButton(Context context) {
        super(context);
        this.context = context;
        this.typeface = Typeface.createFromAsset(context.getAssets(), "fonts/fontawesome_font_v5.ttf");
        createView();
    }

    public FontAwesomeButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        this.typeface = Typeface.createFromAsset(context.getAssets(), "fonts/fontawesome_font_v5.ttf");
        createView();
    }

    public FontAwesomeButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        this.typeface = Typeface.createFromAsset(context.getAssets(), "fonts/fontawesome_font_v5.ttf");
        createView();
    }

    private void createView() {
        setGravity(Gravity.CENTER);
        setTypeface(typeface);
    }

}
