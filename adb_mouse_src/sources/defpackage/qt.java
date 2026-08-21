package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class qt implements q10 {
    public final boolean c;

    public qt(boolean z) {
        this.c = z;
    }

    @Override // defpackage.q10
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.q10
    public final cc0 d() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.c) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
