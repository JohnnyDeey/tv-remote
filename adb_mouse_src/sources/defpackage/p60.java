package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class p60 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ t60 d;

    public /* synthetic */ p60(t60 t60Var, int i) {
        this.c = i;
        this.d = t60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        t60 t60Var = this.d;
        switch (i) {
            case 0:
                wr wrVar = t60Var.e;
                if (wrVar != null) {
                    wrVar.setListSelectionHidden(true);
                    wrVar.requestLayout();
                    return;
                }
                return;
            default:
                wr wrVar2 = t60Var.e;
                if (wrVar2 != null && wrVar2.isAttachedToWindow() && t60Var.e.getCount() > t60Var.e.getChildCount() && t60Var.e.getChildCount() <= t60Var.o) {
                    t60Var.B.setInputMethodMode(2);
                    t60Var.d();
                    return;
                }
                return;
        }
    }
}
