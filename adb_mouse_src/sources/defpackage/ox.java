package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import svarzee.android.apps.adb_mouse.MainActivity;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ox {
    public boolean a;
    public final CopyOnWriteArrayList b;
    public ky c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public ox(boolean z) {
        this.a = z;
        this.b = new CopyOnWriteArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ox(MainActivity mainActivity) {
        this(true);
        this.d = 1;
        this.e = mainActivity;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ox(vx vxVar) {
        this(false);
        this.d = 0;
        this.e = vxVar;
    }
}
