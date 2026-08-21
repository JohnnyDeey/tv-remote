package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class uu0 extends pu0 {
    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            g40Var.i();
            return;
        }
        if (!(number instanceof Float)) {
            number = Float.valueOf(number.floatValue());
        }
        g40Var.p(number);
    }
}
