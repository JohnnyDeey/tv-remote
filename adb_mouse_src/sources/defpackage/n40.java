package defpackage;

import android.util.Log;
import android.view.KeyEvent;
import java.io.Closeable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class n40 implements Closeable {
    public static final ki0 d = new ki0("[0-9A-Za-z,<.> \\n\\t`~\\-_=+\\[{\\]}\\\\|;:'\"/?!@#$%^&*()]");
    public static final ki0 e = new ki0("\\A[0-9A-Za-z,<.> \\n\\t`~\\-_=+\\[{\\]}\\\\|;:'\"/?!@#$%^&*()]*\\z");
    public final p3 c = new p3(0);

    public final void a(KeyEvent keyEvent) {
        int i;
        int keyCode = keyEvent.getKeyCode();
        StringBuilder sb = new StringBuilder();
        sb.append(keyCode);
        sb.append(' ');
        sb.append(keyEvent);
        Log.d("KEY", sb.toString());
        if (keyEvent.isShiftPressed()) {
            i = 225;
        } else {
            i = 0;
        }
        p3 p3Var = this.c;
        if (7 <= keyCode && keyCode < 8) {
            p3Var.b(i, 39);
            return;
        }
        if (8 <= keyCode && keyCode < 17) {
            p3Var.b(i, keyCode + 22);
            return;
        }
        if (19 <= keyCode && keyCode < 20) {
            p3Var.b(i, 82);
            return;
        }
        if (20 <= keyCode && keyCode < 21) {
            p3Var.b(i, 81);
            return;
        }
        if (21 <= keyCode && keyCode < 22) {
            p3Var.b(i, 80);
            return;
        }
        if (22 <= keyCode && keyCode < 23) {
            p3Var.b(i, 79);
            return;
        }
        if (29 <= keyCode && keyCode < 55) {
            p3Var.b(i, keyCode - 25);
            return;
        }
        if (55 <= keyCode && keyCode < 56) {
            p3Var.b(i, 54);
            return;
        }
        if (56 <= keyCode && keyCode < 57) {
            p3Var.b(i, 55);
            return;
        }
        if (62 <= keyCode && keyCode < 63) {
            p3Var.a(44);
            return;
        }
        if (66 <= keyCode && keyCode < 67) {
            p3Var.a(40);
            return;
        }
        if (67 <= keyCode && keyCode < 68) {
            p3Var.a(42);
            return;
        }
        if (68 <= keyCode && keyCode < 69) {
            p3Var.b(i, 53);
            return;
        }
        if (69 <= keyCode && keyCode < 70) {
            p3Var.b(i, 45);
            return;
        }
        if (70 <= keyCode && keyCode < 71) {
            p3Var.b(i, 46);
            return;
        }
        if (71 <= keyCode && keyCode < 72) {
            p3Var.b(i, 47);
            return;
        }
        if (72 <= keyCode && keyCode < 73) {
            p3Var.b(i, 48);
            return;
        }
        if (73 <= keyCode && keyCode < 74) {
            p3Var.b(i, 49);
            return;
        }
        if (74 <= keyCode && keyCode < 75) {
            p3Var.b(i, 51);
            return;
        }
        if (75 <= keyCode && keyCode < 76) {
            p3Var.b(i, 52);
        } else if (76 <= keyCode && keyCode < 77) {
            p3Var.b(i, 56);
        }
    }

    public final void b(String str) {
        boolean z;
        Log.d("KEY", "[text]");
        if (str.length() <= 255) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = new Object[0];
        if (z) {
            ki0 ki0Var = e;
            ki0Var.getClass();
            Object[] objArr2 = new Object[0];
            if (((Pattern) ki0Var.d).matcher(str).matches()) {
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    p3 p3Var = this.c;
                    if ('0' <= charAt && charAt < '1') {
                        p3Var.a(39);
                    } else if ('1' <= charAt && charAt < ':') {
                        p3Var.a(charAt - 19);
                    } else if ('A' <= charAt && charAt < '[') {
                        p3Var.b(225, charAt - '=');
                    } else if ('a' <= charAt && charAt < '{') {
                        p3Var.a(charAt - ']');
                    } else if (charAt == ',') {
                        p3Var.a(54);
                    } else if (charAt == '<') {
                        p3Var.b(225, 54);
                    } else if (charAt == '.') {
                        p3Var.a(55);
                    } else if (charAt == '>') {
                        p3Var.b(225, 55);
                    } else if (charAt != ' ' && charAt != '\n' && charAt != '\t') {
                        if (charAt == '`') {
                            p3Var.a(53);
                        } else if (charAt == '~') {
                            p3Var.b(225, 53);
                        } else if (charAt == '-') {
                            p3Var.a(45);
                        } else if (charAt == '_') {
                            p3Var.b(225, 45);
                        } else if (charAt == '=') {
                            p3Var.a(46);
                        } else if (charAt == '+') {
                            p3Var.b(225, 46);
                        } else if (charAt == '[') {
                            p3Var.a(47);
                        } else if (charAt == '{') {
                            p3Var.b(225, 47);
                        } else if (charAt == ']') {
                            p3Var.a(48);
                        } else if (charAt == '}') {
                            p3Var.b(225, 48);
                        } else if (charAt == '\\') {
                            p3Var.a(49);
                        } else if (charAt == '|') {
                            p3Var.b(225, 49);
                        } else if (charAt == ';') {
                            p3Var.a(51);
                        } else if (charAt == ':') {
                            p3Var.b(225, 51);
                        } else if (charAt == '\'') {
                            p3Var.a(52);
                        } else if (charAt == '\"') {
                            p3Var.b(225, 52);
                        } else if (charAt == '/') {
                            p3Var.a(56);
                        } else if (charAt == '?') {
                            p3Var.b(225, 56);
                        } else if (charAt == '!') {
                            p3Var.b(225, 30);
                        } else if (charAt == '@') {
                            p3Var.b(225, 31);
                        } else if (charAt == '#') {
                            p3Var.b(225, 32);
                        } else if (charAt == '$') {
                            p3Var.b(225, 33);
                        } else if (charAt == '%') {
                            p3Var.b(225, 34);
                        } else if (charAt == '^') {
                            p3Var.b(225, 35);
                        } else if (charAt == '&') {
                            p3Var.b(225, 36);
                        } else if (charAt == '*') {
                            p3Var.b(225, 37);
                        } else if (charAt == '(') {
                            p3Var.b(225, 38);
                        } else if (charAt == ')') {
                            p3Var.b(225, 39);
                        }
                    } else {
                        p3Var.a(44);
                    }
                }
                return;
            }
            c.k(mi0.G("Text contains illegal characters", objArr2));
            return;
        }
        c.k(mi0.G("Text too long", objArr));
    }

    public final void c(o3 o3Var) {
        o3Var.getClass();
        p3 p3Var = this.c;
        p3Var.getClass();
        p3Var.d = o3Var;
        o3Var.f(((k00) ((i81) p3Var.e).d).c(q80.T(new td0("id", 0), new td0("command", "register"), new td0("bus", "usb"), new td0("descriptor", new int[]{5, 1, 9, 6, 161, 1, 5, 7, 25, 0, 41, 255, 21, 0, 37, 255, 149, 2, 117, 8, 129, 0, 192}))));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }
}
