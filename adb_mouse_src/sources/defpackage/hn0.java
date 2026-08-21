package defpackage;

import android.widget.TextView;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class hn0 implements vy {
    public final /* synthetic */ ki0 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ ln0 e;
    public final /* synthetic */ int f;

    public /* synthetic */ hn0(ki0 ki0Var, TextView textView, ln0 ln0Var, int i) {
        this.c = ki0Var;
        this.d = textView;
        this.e = ln0Var;
        this.f = i;
    }

    @Override // defpackage.vy
    public final Object h(Object obj) {
        String str = (String) obj;
        str.getClass();
        int i = ByteBuffer.wrap(InetAddress.getByName(str).getAddress()).getInt();
        ki0 ki0Var = this.c;
        String str2 = (String) ki0Var.d;
        str2.getClass();
        if (Integer.compare(i ^ Integer.MIN_VALUE, ByteBuffer.wrap(InetAddress.getByName(str2).getAddress()).getInt() ^ Integer.MIN_VALUE) > 0) {
            ki0Var.d = str;
            this.d.setText(this.e.k().getString(R.string.scanning, str + ':' + this.f));
        }
        return nw0.a;
    }
}
