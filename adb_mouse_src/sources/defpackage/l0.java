package defpackage;

import android.view.KeyEvent;
import svarzee.android.apps.adb_mouse.MainActivity;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements vy {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l0(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.vy
    public final Object h(Object obj) {
        int i = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                if (obj == ((s0) obj2)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            default:
                cq cqVar = ((MainActivity) obj2).A;
                gr grVar = (gr) obj;
                int i2 = MainActivity.E;
                grVar.getClass();
                int ordinal = grVar.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5) {
                                    np npVar = new np(new KeyEvent(0, 21));
                                    cqVar.getClass();
                                    cqVar.a.i(npVar);
                                }
                            } else {
                                np npVar2 = new np(new KeyEvent(0, 20));
                                cqVar.getClass();
                                cqVar.a.i(npVar2);
                            }
                        } else {
                            np npVar3 = new np(new KeyEvent(0, 22));
                            cqVar.getClass();
                            cqVar.a.i(npVar3);
                        }
                    } else {
                        np npVar4 = new np(new KeyEvent(0, 19));
                        cqVar.getClass();
                        cqVar.a.i(npVar4);
                    }
                } else {
                    np npVar5 = new np(new KeyEvent(0, 66));
                    cqVar.getClass();
                    cqVar.a.i(npVar5);
                }
                return nw0.a;
        }
    }
}
