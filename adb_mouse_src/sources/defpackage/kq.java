package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.b;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class kq extends gx implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final hq W;
    public final iq X;
    public int Y;
    public int Z;
    public boolean a0;
    public boolean b0;
    public int c0;
    public boolean d0;
    public final i81 e0;
    public Dialog f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;

    public kq() {
        new l9(4, this);
        this.W = new hq(this);
        this.X = new iq(this);
        this.Y = 0;
        this.Z = 0;
        this.a0 = true;
        this.b0 = true;
        this.c0 = -1;
        this.e0 = new i81(17, this);
        this.j0 = false;
    }

    @Override // defpackage.gx
    public void A() {
        this.E = true;
        Dialog dialog = this.f0;
        if (dialog != null) {
            this.g0 = false;
            dialog.show();
            View decorView = this.f0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.gx
    public void B() {
        this.E = true;
        Dialog dialog = this.f0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.gx
    public final void D(Bundle bundle) {
        Bundle bundle2;
        this.E = true;
        if (this.f0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // defpackage.gx
    public final void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.E(layoutInflater, viewGroup, bundle);
        if (this.G == null && this.f0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f0.onRestoreInstanceState(bundle2);
        }
    }

    public Dialog M() {
        if (vx.F(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new ej(H(), this.Z);
    }

    @Override // defpackage.gx
    public final wv0 b() {
        return new jq(this, new ex(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.g0) {
            if (vx.F(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            if (!this.h0) {
                this.h0 = true;
                this.i0 = false;
                Dialog dialog = this.f0;
                if (dialog != null) {
                    dialog.setOnDismissListener(null);
                    this.f0.dismiss();
                }
                this.g0 = true;
                if (this.c0 >= 0) {
                    vx j = j();
                    int i = this.c0;
                    if (i >= 0) {
                        j.v(new ux(j, i), true);
                        this.c0 = -1;
                        return;
                    } else {
                        c.k(qo0.m("Bad id: ", i));
                        return;
                    }
                }
                hc hcVar = new hc(j());
                hcVar.p = true;
                vx vxVar = this.t;
                if (vxVar != null && vxVar != hcVar.q) {
                    throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
                }
                hcVar.b(new ey(3, this));
                hcVar.d(true);
            }
        }
    }

    @Override // defpackage.gx
    public final void r() {
        this.E = true;
    }

    @Override // defpackage.gx
    public final void t(Context context) {
        super.t(context);
        this.R.d(this.e0);
        if (!this.i0) {
            this.h0 = false;
        }
    }

    @Override // defpackage.gx
    public void u(Bundle bundle) {
        boolean z;
        super.u(bundle);
        new Handler();
        if (this.y == 0) {
            z = true;
        } else {
            z = false;
        }
        this.b0 = z;
        if (bundle != null) {
            this.Y = bundle.getInt("android:style", 0);
            this.Z = bundle.getInt("android:theme", 0);
            this.a0 = bundle.getBoolean("android:cancelable", true);
            this.b0 = bundle.getBoolean("android:showsDialog", this.b0);
            this.c0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.gx
    public final void w() {
        this.E = true;
        Dialog dialog = this.f0;
        if (dialog != null) {
            this.g0 = true;
            dialog.setOnDismissListener(null);
            this.f0.dismiss();
            if (!this.h0) {
                onDismiss(this.f0);
            }
            this.f0 = null;
            this.j0 = false;
        }
    }

    @Override // defpackage.gx
    public final void x() {
        this.E = true;
        if (!this.i0 && !this.h0) {
            this.h0 = true;
        }
        b bVar = this.R;
        bVar.getClass();
        b.a("removeObserver");
        a70 a70Var = (a70) bVar.b.c(this.e0);
        if (a70Var == null) {
            return;
        }
        a70Var.d();
        a70Var.b(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0044, B:21:0x004e, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0066), top: B:9:0x001a }] */
    @Override // defpackage.gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater y(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.y(r8)
            boolean r0 = r7.b0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L98
            boolean r3 = r7.d0
            if (r3 == 0) goto L11
            goto L98
        L11:
            if (r0 != 0) goto L14
            goto L6f
        L14:
            boolean r0 = r7.j0
            if (r0 != 0) goto L6f
            r0 = 0
            r3 = 1
            r7.d0 = r3     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.M()     // Catch: java.lang.Throwable -> L4c
            r7.f0 = r4     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.b0     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L66
            int r5 = r7.Y     // Catch: java.lang.Throwable -> L4c
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4c
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4c
        L3e:
            android.content.Context r4 = r7.h()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L4e
            android.app.Dialog r5 = r7.f0     // Catch: java.lang.Throwable -> L4c
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4c
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r8 = move-exception
            goto L6c
        L4e:
            android.app.Dialog r4 = r7.f0     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.a0     // Catch: java.lang.Throwable -> L4c
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.f0     // Catch: java.lang.Throwable -> L4c
            hq r5 = r7.W     // Catch: java.lang.Throwable -> L4c
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.f0     // Catch: java.lang.Throwable -> L4c
            iq r5 = r7.X     // Catch: java.lang.Throwable -> L4c
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4c
            r7.j0 = r3     // Catch: java.lang.Throwable -> L4c
            goto L69
        L66:
            r3 = 0
            r7.f0 = r3     // Catch: java.lang.Throwable -> L4c
        L69:
            r7.d0 = r0
            goto L6f
        L6c:
            r7.d0 = r0
            throw r8
        L6f:
            boolean r0 = defpackage.vx.F(r2)
            if (r0 == 0) goto L8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8b:
            android.app.Dialog r7 = r7.f0
            if (r7 == 0) goto Lc3
            android.content.Context r7 = r7.getContext()
            android.view.LayoutInflater r7 = r8.cloneInContext(r7)
            return r7
        L98:
            boolean r0 = defpackage.vx.F(r2)
            if (r0 == 0) goto Lc3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r7 = r7.b0
            if (r7 != 0) goto Lba
            java.lang.String r7 = "mShowsDialog = false: "
            java.lang.String r7 = r7.concat(r0)
            android.util.Log.d(r1, r7)
            return r8
        Lba:
            java.lang.String r7 = "mCreatingDialog = true: "
            java.lang.String r7 = r7.concat(r0)
            android.util.Log.d(r1, r7)
        Lc3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq.y(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // defpackage.gx
    public void z(Bundle bundle) {
        Dialog dialog = this.f0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.Y;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.Z;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.a0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.b0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.c0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
