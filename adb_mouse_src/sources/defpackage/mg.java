package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class mg implements vv {
    public final fw d;
    public final dl a = st.c;
    public final int b = -2;
    public final fe c = fe.c;
    public final int e = 32;

    public mg(fw fwVar) {
        this.d = fwVar;
    }

    @Override // defpackage.vv
    public final Object a(xv xvVar, rk rkVar) {
        Object l = k20.l(new ig(xvVar, this, null), rkVar);
        if (l == ml.c) {
            return l;
        }
        return nw0.a;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add("concurrency=" + this.e);
        st stVar = st.c;
        dl dlVar = this.a;
        if (dlVar != stVar) {
            arrayList.add("context=" + dlVar);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        fe feVar = fe.c;
        fe feVar2 = this.c;
        if (feVar2 != feVar) {
            arrayList.add("onBufferOverflow=" + feVar2);
        }
        return mg.class.getSimpleName() + '[' + gi.p0(arrayList, null, 62) + ']';
    }
}
