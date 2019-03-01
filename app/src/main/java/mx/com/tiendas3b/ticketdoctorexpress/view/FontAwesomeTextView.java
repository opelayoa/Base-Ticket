package mx.com.tiendas3b.ticketdoctorexpress.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.Gravity;

public class FontAwesomeTextView extends android.support.v7.widget.AppCompatTextView {

    Context context;
    Typeface typeface;

    public FontAwesomeTextView(Context context) {
        super(context);
        this.context = context;
        this.typeface = Typeface.createFromAsset(context.getAssets(), "fonts/fontawesome_font_v5.ttf");
        createView();
    }

    public FontAwesomeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        this.typeface = Typeface.createFromAsset(context.getAssets(), "fonts/fontawesome_font_v5.ttf");
        createView();
    }

    public FontAwesomeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
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
