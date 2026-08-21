package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class xp0 implements CharSequence {
    public char[] c;
    public String d;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.c[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.c, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.d == null) {
            this.d = new String(this.c);
        }
        return this.d;
    }
}
