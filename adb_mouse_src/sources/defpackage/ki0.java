package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ki0 implements Serializable {
    public final /* synthetic */ int c = 0;
    public Object d;

    public ki0(String str) {
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.d = compile;
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return String.valueOf(this.d);
            default:
                String pattern = ((Pattern) this.d).toString();
                pattern.getClass();
                return pattern;
        }
    }

    public /* synthetic */ ki0() {
    }
}
