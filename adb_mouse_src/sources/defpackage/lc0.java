package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class lc0 extends pu0 {
    public static final kc0 b = new kc0(new lc0(0), 0);
    public final /* synthetic */ int a;

    public /* synthetic */ lc0(int i) {
        this.a = i;
    }

    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        switch (this.a) {
            case 0:
                g40Var.p((Number) obj);
                return;
            case 1:
                Number number = (Number) obj;
                if (number == null) {
                    g40Var.i();
                    return;
                }
                double doubleValue = number.doubleValue();
                k00.a(doubleValue);
                g40Var.n(doubleValue);
                return;
            case 2:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    g40Var.i();
                    return;
                }
                float floatValue = number2.floatValue();
                k00.a(floatValue);
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(floatValue);
                }
                g40Var.p(number2);
                return;
            default:
                g40Var.i();
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
