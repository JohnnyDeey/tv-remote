package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class m6 {
    public final TextView a;
    public final i81 b;

    public m6(TextView textView) {
        this.a = textView;
        this.b = new i81(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((k20) this.b.d).B(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, ng0.i, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((k20) this.b.d).f0(z);
    }

    public final void d(boolean z) {
        ((k20) this.b.d).g0(z);
    }
}
