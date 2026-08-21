package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class z3 implements Closeable {
    public y3 c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public final ConcurrentLinkedQueue h = new ConcurrentLinkedQueue();

    public static byte[] a(String str) {
        byte[] bytes = str.getBytes(qg.a);
        bytes.getClass();
        ByteBuffer order = ByteBuffer.allocate(bytes.length + 5).order(ByteOrder.LITTLE_ENDIAN);
        order.put((byte) 0);
        order.putInt(bytes.length);
        order.put(bytes);
        byte[] array = order.array();
        array.getClass();
        return array;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y3 y3Var = this.c;
        if (y3Var != null) {
            try {
                try {
                    if (this.g) {
                        y3Var.a(this.e, this.f);
                        this.g = false;
                    }
                    y3 y3Var2 = this.c;
                    if (y3Var2 != null) {
                        y3Var2.close();
                    } else {
                        k20.p0("protocol");
                        throw null;
                    }
                } catch (Exception e) {
                    Log.w("ERR", mn.Q(e));
                    y3 y3Var3 = this.c;
                    if (y3Var3 != null) {
                        y3Var3.close();
                    } else {
                        k20.p0("protocol");
                        throw null;
                    }
                }
            } catch (Throwable th) {
                y3 y3Var4 = this.c;
                if (y3Var4 == null) {
                    k20.p0("protocol");
                    throw null;
                }
                y3Var4.close();
                throw th;
            }
        }
    }
}
