package defpackage;

/* loaded from: classes.dex */
public final class w11 {
    public final String a;
    public final char b;
    public int c;

    public w11(String str, char c) {
        int i;
        if (c != '\"' && c != '\\') {
            this.a = str;
            this.b = c;
            if (str.length() < 1) {
                i = 0;
            } else {
                i = -1;
            }
            this.c = i;
            return;
        }
        c.k("reserved separator character");
        throw null;
    }

    public final String a() {
        int i = this.c;
        String str = this.a;
        if (i >= str.length()) {
            return null;
        }
        int i2 = this.c + 1;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int i3 = this.c + 1;
            this.c = i3;
            if (i3 < str.length()) {
                char charAt = str.charAt(this.c);
                if (z) {
                    z = false;
                } else if (charAt == '\"') {
                    z2 = !z2;
                } else if (z2) {
                    continue;
                } else if (charAt == '\\') {
                    z = true;
                } else if (charAt == this.b) {
                    break;
                }
            } else if (z || z2) {
                c.k("badly formatted directory string");
                return null;
            }
        }
        return str.substring(i2, this.c);
    }
}
