package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class qu implements zu {
    public final /* synthetic */ int c;
    public final yf0 d;

    public /* synthetic */ qu(yf0 yf0Var, int i) {
        this.c = i;
        this.d = yf0Var;
    }

    @Override // defpackage.yf0
    public final Object get() {
        int i = this.c;
        yf0 yf0Var = this.d;
        switch (i) {
            case 0:
                String packageName = ((Context) yf0Var.get()).getPackageName();
                if (packageName == null) {
                    c.g("Cannot return null from a non-@Nullable @Provides method");
                    return null;
                }
                return packageName;
            default:
                return new bm0(Integer.valueOf(bm0.f).intValue(), (Context) yf0Var.get(), "com.google.android.datatransport.events");
        }
    }
}
