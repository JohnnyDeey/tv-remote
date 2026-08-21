package defpackage;

import java.io.Writer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class uv0 extends pu0 {
    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        String str;
        boolean z = ((AtomicBoolean) obj).get();
        g40Var.r();
        g40Var.a();
        Writer writer = g40Var.c;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
    }
}
