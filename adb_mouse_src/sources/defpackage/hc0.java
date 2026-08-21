package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class hc0 {
    public Context a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public int h;
    public boolean i;
    public r6 j;
    public boolean k;
    public Bundle l;
    public String m;
    public boolean n;
    public Notification o;
    public ArrayList p;

    public static CharSequence a(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final void b(r6 r6Var) {
        if (this.j != r6Var) {
            this.j = r6Var;
            if (((hc0) r6Var.d) != this) {
                r6Var.d = this;
                b(r6Var);
            }
        }
    }
}
