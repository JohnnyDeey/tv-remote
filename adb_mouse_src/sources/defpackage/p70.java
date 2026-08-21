package defpackage;

import android.util.Log;
import java.io.Writer;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class p70 extends Writer {
    public final /* synthetic */ int c;
    public final StringBuilder d;
    public final CharSequence e;

    public p70() {
        this.c = 0;
        this.d = new StringBuilder(128);
        this.e = "FragmentManager";
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.c) {
            case 1:
                this.d.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    public void c() {
        StringBuilder sb = this.d;
        if (sb.length() > 0) {
            Log.d((String) this.e, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.c) {
            case 0:
                c();
                return;
            default:
                return;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.c) {
            case 0:
                c();
                return;
            default:
                return;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3 = this.c;
        StringBuilder sb = this.d;
        switch (i3) {
            case 0:
                for (int i4 = 0; i4 < i2; i4++) {
                    char c = cArr[i + i4];
                    if (c == '\n') {
                        c();
                    } else {
                        sb.append(c);
                    }
                }
                return;
            default:
                xp0 xp0Var = (xp0) this.e;
                xp0Var.c = cArr;
                xp0Var.d = null;
                sb.append((CharSequence) xp0Var, i, i2 + i);
                return;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        switch (this.c) {
            case 1:
                this.d.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        switch (this.c) {
            case 1:
                this.d.append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i, int i2) {
        switch (this.c) {
            case 1:
                this.d.append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence, java.lang.Object] */
    public p70(StringBuilder sb) {
        this.c = 1;
        this.e = new Object();
        this.d = sb;
    }

    @Override // java.io.Writer
    public void write(int i) {
        switch (this.c) {
            case 1:
                this.d.append((char) i);
                return;
            default:
                super.write(i);
                return;
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        switch (this.c) {
            case 1:
                Objects.requireNonNull(str);
                this.d.append((CharSequence) str, i, i2 + i);
                return;
            default:
                super.write(str, i, i2);
                return;
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
