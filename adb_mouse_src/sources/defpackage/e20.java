package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class e20 {
    public int a;
    public int b;
    public Object c;
    public final Object d;
    public final Object e;

    public e20(View view) {
        this.e = new int[2];
        this.d = view;
    }

    public void a(int i, boolean z, byte[] bArr) {
        int length = bArr.length - i;
        mq mqVar = (mq) this.e;
        if (length >= mqVar.b()) {
            byte[] bArr2 = (byte[]) this.c;
            mqVar.update(bArr2, 0, bArr2.length);
            mqVar.d((byte) (this.a >>> 24));
            mqVar.d((byte) (this.a >>> 16));
            mqVar.d((byte) (this.a >>> 8));
            mqVar.d((byte) this.a);
            mqVar.d((byte) (this.b >>> 8));
            mqVar.d((byte) this.b);
            mqVar.d((byte) -1);
            byte[] bArr3 = (byte[]) this.d;
            mqVar.update(bArr3, 0, bArr3.length);
            mqVar.c(i, bArr);
            if (z) {
                this.b++;
                return;
            }
            return;
        }
        c.k("target length is less than digest size.");
    }

    public void b(m11 m11Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((q01) it.next()).a.c() & 8) != 0) {
                ((View) this.d).setTranslationY(x4.c(this.b, 0, r3.a.b()));
                return;
            }
        }
    }

    public e20(byte[] bArr, byte[] bArr2, mq mqVar) {
        this.c = bArr;
        this.d = bArr2;
        this.e = mqVar;
    }
}
