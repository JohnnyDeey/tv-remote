package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class px0 extends qx0 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    /* JADX WARN: Type inference failed for: r5v5, types: [ox0, rx0] */
    public px0(px0 px0Var, n8 n8Var) {
        rx0 rx0Var;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = px0Var.c;
        this.d = px0Var.d;
        this.e = px0Var.e;
        this.f = px0Var.f;
        this.g = px0Var.g;
        this.h = px0Var.h;
        this.i = px0Var.i;
        String str = px0Var.k;
        this.k = str;
        if (str != null) {
            n8Var.put(str, this);
        }
        matrix.set(px0Var.j);
        ArrayList arrayList = px0Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof px0) {
                this.b.add(new px0((px0) obj, n8Var));
            } else {
                if (obj instanceof ox0) {
                    ox0 ox0Var = (ox0) obj;
                    ?? rx0Var2 = new rx0(ox0Var);
                    rx0Var2.e = 0.0f;
                    rx0Var2.g = 1.0f;
                    rx0Var2.h = 1.0f;
                    rx0Var2.i = 0.0f;
                    rx0Var2.j = 1.0f;
                    rx0Var2.k = 0.0f;
                    rx0Var2.l = Paint.Cap.BUTT;
                    rx0Var2.m = Paint.Join.MITER;
                    rx0Var2.n = 4.0f;
                    rx0Var2.d = ox0Var.d;
                    rx0Var2.e = ox0Var.e;
                    rx0Var2.g = ox0Var.g;
                    rx0Var2.f = ox0Var.f;
                    rx0Var2.c = ox0Var.c;
                    rx0Var2.h = ox0Var.h;
                    rx0Var2.i = ox0Var.i;
                    rx0Var2.j = ox0Var.j;
                    rx0Var2.k = ox0Var.k;
                    rx0Var2.l = ox0Var.l;
                    rx0Var2.m = ox0Var.m;
                    rx0Var2.n = ox0Var.n;
                    rx0Var = rx0Var2;
                } else if (obj instanceof nx0) {
                    rx0Var = new rx0((nx0) obj);
                } else {
                    c.o("Unknown object in the tree!");
                    throw null;
                }
                this.b.add(rx0Var);
                Object obj2 = rx0Var.b;
                if (obj2 != null) {
                    n8Var.put(obj2, rx0Var);
                }
            }
        }
    }

    @Override // defpackage.qx0
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((qx0) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.qx0
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                z |= ((qx0) arrayList.get(i)).b(iArr);
                i++;
            } else {
                return z;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public px0() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
