package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.CompoundButton;
import android.widget.TextView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class l5 {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public /* synthetic */ l5(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        k5 k5Var = (k5) this.f;
        Drawable checkMarkDrawable = k5Var.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(k5Var.getDrawableState());
                }
                k5Var.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (this.d) {
            Bundle bundle = (Bundle) this.a;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.a;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.a;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.a = null;
            return bundle2;
        }
        c.o("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            java.lang.Object r7 = r7.f
            r0 = r7
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r7 = r0.getContext()
            int[] r2 = defpackage.ng0.m
            b8 r7 = defpackage.b8.J(r7, r8, r2, r9)
            java.lang.Object r1 = r7.d
            r6 = r1
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            android.content.Context r1 = r0.getContext()
            java.lang.Object r3 = r7.d
            r4 = r3
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r3 = r8
            r5 = r9
            defpackage.ry0.l(r0, r1, r2, r3, r4, r5)
            r8 = 1
            boolean r9 = r6.hasValue(r8)     // Catch: java.lang.Throwable -> L3c
            r1 = 0
            if (r9 == 0) goto L3f
            int r8 = r6.getResourceId(r8, r1)     // Catch: java.lang.Throwable -> L3c
            if (r8 == 0) goto L3f
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3f
            android.graphics.drawable.Drawable r8 = defpackage.r21.r(r9, r8)     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3f
            r0.setButtonDrawable(r8)     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3f
            goto L56
        L3c:
            r0 = move-exception
            r8 = r0
            goto L7c
        L3f:
            boolean r8 = r6.hasValue(r1)     // Catch: java.lang.Throwable -> L3c
            if (r8 == 0) goto L56
            int r8 = r6.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L3c
            if (r8 == 0) goto L56
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L3c
            android.graphics.drawable.Drawable r8 = defpackage.r21.r(r9, r8)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonDrawable(r8)     // Catch: java.lang.Throwable -> L3c
        L56:
            r8 = 2
            boolean r9 = r6.hasValue(r8)     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L64
            android.content.res.ColorStateList r8 = r7.y(r8)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonTintList(r8)     // Catch: java.lang.Throwable -> L3c
        L64:
            r8 = 3
            boolean r9 = r6.hasValue(r8)     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L78
            r9 = -1
            int r8 = r6.getInt(r8, r9)     // Catch: java.lang.Throwable -> L3c
            r9 = 0
            android.graphics.PorterDuff$Mode r8 = defpackage.lr.c(r8, r9)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonTintMode(r8)     // Catch: java.lang.Throwable -> L3c
        L78:
            r7.N()
            return
        L7c:
            r7.N()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5.d(android.util.AttributeSet, int):void");
    }

    public void e(String str, xl0 xl0Var) {
        Object obj;
        sl0 sl0Var = (sl0) this.f;
        pl0 b = sl0Var.b(str);
        if (b != null) {
            obj = b.d;
        } else {
            pl0 pl0Var = new pl0(str, xl0Var);
            sl0Var.f++;
            pl0 pl0Var2 = sl0Var.d;
            if (pl0Var2 == null) {
                sl0Var.c = pl0Var;
                sl0Var.d = pl0Var;
            } else {
                pl0Var2.e = pl0Var;
                pl0Var.f = pl0Var2;
                sl0Var.d = pl0Var;
            }
            obj = null;
        }
        if (((xl0) obj) == null) {
            return;
        }
        c.k("SavedStateProvider with the given key is already registered");
    }

    public l5() {
        this.f = new sl0();
        this.e = true;
    }
}
