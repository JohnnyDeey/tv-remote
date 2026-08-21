package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class ce implements jt {
    public final /* synthetic */ int c;
    public final String d;

    public /* synthetic */ ce(String str, int i) {
        this.c = i;
        this.d = str;
    }

    @Override // defpackage.jt
    public boolean d(CharSequence charSequence, int i, int i2, gw0 gw0Var) {
        if (TextUtils.equals(charSequence.subSequence(i, i2), this.d)) {
            gw0Var.c = (gw0Var.c & 3) | 4;
            return false;
        }
        return true;
    }

    public String toString() {
        switch (this.c) {
            case 2:
                return "<" + this.d + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.jt
    public Object b() {
        return this;
    }
}
