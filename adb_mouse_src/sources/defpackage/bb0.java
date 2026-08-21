package defpackage;

import android.util.Log;
import android.view.MotionEvent;
import java.io.Closeable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class bb0 implements Closeable {
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean j;
    public int k;
    public final r3 c = new r3();
    public long l = System.currentTimeMillis();

    public final void a(MotionEvent motionEvent, int i) {
        double ceil;
        double ceil2;
        int i2;
        float pow = (float) Math.pow(2.0d, (i - 50) / 40.0d);
        float x = motionEvent.getX() * pow;
        float y = motionEvent.getY() * pow;
        int pointerId = motionEvent.getPointerId(0);
        long currentTimeMillis = System.currentTimeMillis();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked != 6) {
                                Log.e("MSE ", "Unexpected: " + motionEvent);
                                return;
                            }
                            this.c.a();
                            return;
                        }
                        this.d = x;
                        this.e = y;
                        r3 r3Var = this.c;
                        synchronized (r3Var) {
                            r3Var.f = true;
                            o3 o3Var = r3Var.c;
                            if (o3Var != null) {
                                o3Var.f(r3Var.d.a(0, 0, r3Var.e, true));
                            } else {
                                k20.p0("session");
                                throw null;
                            }
                        }
                        this.j = false;
                        return;
                    }
                    this.j = false;
                    this.c.a();
                    return;
                }
                if (pointerId != this.k) {
                    this.k = pointerId;
                    this.d = x;
                    this.e = y;
                    return;
                }
                if (currentTimeMillis - this.l > 10) {
                    if (this.j && Math.abs(this.h - motionEvent.getX()) >= 8.0f && Math.abs(this.i - motionEvent.getY()) >= 8.0f) {
                        this.j = false;
                    }
                    float f = (x - this.d) + this.f;
                    this.f = f;
                    this.g = (y - this.e) + this.g;
                    if (f > 0.0f) {
                        ceil = Math.floor(f);
                    } else {
                        ceil = Math.ceil(f);
                    }
                    float f2 = (float) ceil;
                    this.f -= f2;
                    float f3 = this.g;
                    double d = f3;
                    if (f3 > 0.0f) {
                        ceil2 = Math.floor(d);
                    } else {
                        ceil2 = Math.ceil(d);
                    }
                    float f4 = (float) ceil2;
                    this.g -= f4;
                    int i3 = -127;
                    if (f2 > 127.0f) {
                        i2 = 127;
                    } else if (f2 < -127.0f) {
                        i2 = -127;
                    } else {
                        i2 = (int) f2;
                    }
                    if (f4 > 127.0f) {
                        i3 = 127;
                    } else if (f4 >= -127.0f) {
                        i3 = (int) f4;
                    }
                    r3 r3Var2 = this.c;
                    synchronized (r3Var2) {
                        o3 o3Var2 = r3Var2.c;
                        if (o3Var2 != null) {
                            o3Var2.e(r3Var2.d.a(i2, i3, r3Var2.e, r3Var2.f));
                        } else {
                            k20.p0("session");
                            throw null;
                        }
                    }
                    this.d = x;
                    this.e = y;
                    this.l = currentTimeMillis;
                    return;
                }
                return;
            }
            if (this.j && Math.abs(this.h - ((int) motionEvent.getX())) < 8.0f && Math.abs(this.i - ((int) motionEvent.getY())) < 8.0f) {
                r3 r3Var3 = this.c;
                synchronized (r3Var3) {
                    r3Var3.e = true;
                    o3 o3Var3 = r3Var3.c;
                    if (o3Var3 != null) {
                        o3Var3.f(r3Var3.d.a(0, 0, true, r3Var3.f));
                    } else {
                        k20.p0("session");
                        throw null;
                    }
                }
                r3 r3Var4 = this.c;
                synchronized (r3Var4) {
                    r3Var4.e = false;
                    o3 o3Var4 = r3Var4.c;
                    if (o3Var4 != null) {
                        o3Var4.f(r3Var4.d.a(0, 0, false, r3Var4.f));
                    } else {
                        k20.p0("session");
                        throw null;
                    }
                }
            }
            this.j = false;
            this.c.a();
            this.f = 0.0f;
            this.g = 0.0f;
            return;
        }
        this.d = x;
        this.e = y;
        this.h = motionEvent.getX();
        this.i = motionEvent.getY();
        this.j = true;
    }

    public final void b(o3 o3Var) {
        o3Var.getClass();
        r3 r3Var = this.c;
        r3Var.getClass();
        r3Var.c = o3Var;
        cb0 cb0Var = r3Var.d;
        o3Var.f(cb0Var.a.c(q80.T(new td0("id", Integer.valueOf(cb0Var.b)), new td0("command", "register"), new td0("bus", "usb"), new td0("descriptor", new int[]{5, 1, 9, 2, 161, 1, 9, 1, 161, 0, 5, 9, 9, 1, 9, 2, 21, 0, 37, 1, 149, 8, 117, 1, 129, 2, 5, 1, 9, 48, 9, 49, 9, 56, 21, 129, 37, 127, 117, 8, 149, 3, 129, 6, 192, 192}))));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }
}
