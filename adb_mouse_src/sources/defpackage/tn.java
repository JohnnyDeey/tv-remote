package defpackage;

import android.text.TextPaint;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class tn {
    public static final ThreadLocal b = new ThreadLocal();
    public final TextPaint a;

    public tn() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
