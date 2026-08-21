package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* loaded from: classes.dex */
public final class j implements fz0 {
    public static final i[] d = new i[0];
    public boolean a;
    public int b;
    public Object c;

    public j(int i) {
        i[] iVarArr;
        if (i >= 0) {
            if (i == 0) {
                iVarArr = d;
            } else {
                iVarArr = new i[i];
            }
            this.c = iVarArr;
            this.b = 0;
            this.a = false;
            return;
        }
        c.k("'initialCapacity' must not be negative");
        throw null;
    }

    public static i[] e(i[] iVarArr) {
        if (iVarArr.length < 1) {
            return d;
        }
        return (i[]) iVarArr.clone();
    }

    @Override // defpackage.fz0
    public void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.h = null;
        ActionBarContextView.b(actionBarContextView, this.b);
    }

    @Override // defpackage.fz0
    public void b() {
        this.a = true;
    }

    @Override // defpackage.fz0
    public void c() {
        ActionBarContextView.a((ActionBarContextView) this.c);
        this.a = false;
    }

    public void d(i iVar) {
        if (iVar != null) {
            i[] iVarArr = (i[]) this.c;
            int length = iVarArr.length;
            boolean z = true;
            int i = this.b + 1;
            if (i <= length) {
                z = false;
            }
            if (this.a | z) {
                i[] iVarArr2 = new i[Math.max(iVarArr.length, (i >> 1) + i)];
                System.arraycopy((i[]) this.c, 0, iVarArr2, 0, this.b);
                this.c = iVarArr2;
                this.a = false;
            }
            ((i[]) this.c)[this.b] = iVar;
            this.b = i;
            return;
        }
        c.g("'element' cannot be null");
    }

    public i f(int i) {
        if (i < this.b) {
            return ((i[]) this.c)[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.b);
    }

    public i[] g() {
        int i = this.b;
        if (i == 0) {
            return d;
        }
        i[] iVarArr = (i[]) this.c;
        if (iVarArr.length == i) {
            this.a = true;
            return iVarArr;
        }
        i[] iVarArr2 = new i[i];
        System.arraycopy(iVarArr, 0, iVarArr2, 0, i);
        return iVarArr2;
    }

    public j() {
        this(10);
    }

    public j(int i, boolean z) {
        this.c = null;
        this.b = i;
        this.a = z;
    }
}
