package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class kr0 {
    public float c;
    public final WeakReference e;
    public ir0 f;
    public final TextPaint a = new TextPaint(1);
    public final yg b = new yg(1, this);
    public boolean d = true;

    public kr0(bh bhVar) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(bhVar);
    }

    public final float a(String str) {
        float measureText;
        if (!this.d) {
            return this.c;
        }
        TextPaint textPaint = this.a;
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.c = measureText;
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.c;
    }
}
