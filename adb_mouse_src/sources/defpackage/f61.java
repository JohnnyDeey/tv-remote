package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class f61 implements c2, it0 {
    public final int c;
    public final Object d;

    public f61(Context context) {
        int g = j4.g(context, 0);
        this.d = new f4(new ContextThemeWrapper(context, j4.g(context, g)));
        this.c = g;
    }

    @Override // defpackage.c2
    public boolean a(View view) {
        ((BottomSheetBehavior) this.d).B(this.c);
        return true;
    }

    public j4 b() {
        int i;
        ListAdapter listAdapter;
        f4 f4Var = (f4) this.d;
        ContextThemeWrapper contextThemeWrapper = f4Var.a;
        ContextThemeWrapper contextThemeWrapper2 = f4Var.a;
        j4 j4Var = new j4(contextThemeWrapper, this.c);
        View view = f4Var.e;
        i4 i4Var = j4Var.h;
        if (view != null) {
            i4Var.w = view;
        } else {
            CharSequence charSequence = f4Var.d;
            if (charSequence != null) {
                i4Var.d = charSequence;
                TextView textView = i4Var.u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = f4Var.c;
            if (drawable != null) {
                i4Var.s = drawable;
                ImageView imageView = i4Var.t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    i4Var.t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = f4Var.f;
        if (charSequence2 != null) {
            i4Var.e = charSequence2;
            TextView textView2 = i4Var.v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = f4Var.g;
        if (charSequence3 != null) {
            i4Var.c(-1, charSequence3, f4Var.h);
        }
        CharSequence charSequence4 = f4Var.i;
        if (charSequence4 != null) {
            i4Var.c(-2, charSequence4, f4Var.j);
        }
        if (f4Var.m != null || f4Var.n != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) f4Var.b.inflate(i4Var.A, (ViewGroup) null);
            if (f4Var.r) {
                listAdapter = new c4(f4Var, contextThemeWrapper2, i4Var.B, f4Var.m, alertController$RecycleListView);
            } else {
                if (f4Var.s) {
                    i = i4Var.C;
                } else {
                    i = i4Var.D;
                }
                listAdapter = f4Var.n;
                if (listAdapter == null) {
                    listAdapter = new ArrayAdapter(contextThemeWrapper2, i, R.id.text1, f4Var.m);
                }
            }
            i4Var.x = listAdapter;
            i4Var.y = f4Var.t;
            if (f4Var.o != null) {
                alertController$RecycleListView.setOnItemClickListener(new d4(f4Var, i4Var));
            } else if (f4Var.u != null) {
                alertController$RecycleListView.setOnItemClickListener(new e4(f4Var, alertController$RecycleListView, i4Var));
            }
            if (f4Var.s) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (f4Var.r) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            i4Var.f = alertController$RecycleListView;
        }
        View view2 = f4Var.p;
        if (view2 != null) {
            i4Var.g = view2;
            i4Var.h = false;
        }
        j4Var.setCancelable(f4Var.k);
        if (f4Var.k) {
            j4Var.setCanceledOnTouchOutside(true);
        }
        j4Var.setOnCancelListener(null);
        j4Var.setOnDismissListener(null);
        x90 x90Var = f4Var.l;
        if (x90Var != null) {
            j4Var.setOnKeyListener(x90Var);
        }
        return j4Var;
    }

    public void c() {
        f4 f4Var = (f4) this.d;
        f4Var.i = f4Var.a.getText(R.string.cancel);
        f4Var.j = null;
    }

    public void d(int i, DialogInterface.OnClickListener onClickListener) {
        f4 f4Var = (f4) this.d;
        f4Var.g = f4Var.a.getText(i);
        f4Var.h = onClickListener;
    }

    public void e(int i) {
        f4 f4Var = (f4) this.d;
        f4Var.d = f4Var.a.getText(i);
    }

    public j4 f() {
        j4 b = b();
        b.show();
        return b;
    }

    public String g(pa1 pa1Var) {
        String str;
        n61 n61Var = (n61) this.d;
        int i = this.c;
        try {
            if (n61Var.E != null) {
                v41 v41Var = n61Var.E;
                String packageName = n61Var.C.getPackageName();
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 6) {
                                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                                } else {
                                    str = "START_CONNECTION";
                                }
                            } else {
                                str = "IS_FEATURE_SUPPORTED";
                            }
                        } else {
                            str = "CONSUME_ASYNC";
                        }
                    } else {
                        str = "ACKNOWLEDGE_PURCHASE";
                    }
                } else {
                    str = "LAUNCH_BILLING_FLOW";
                }
                k61 k61Var = new k61(pa1Var);
                t41 t41Var = (t41) v41Var;
                Parcel a = t41Var.a();
                a.writeString(packageName);
                a.writeString(str);
                int i2 = s41.a;
                a.writeStrongBinder(k61Var);
                try {
                    t41Var.b.transact(1, a, null, 1);
                    a.recycle();
                    return "billingOverrideService.getBillingOverride";
                } catch (Throwable th) {
                    a.recycle();
                    throw th;
                }
            }
            throw null;
        } catch (Exception e) {
            n61Var.D(95, 28, v61.p);
            m51.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            pa1Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override // defpackage.it0
    public boolean k(r6 r6Var, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.it0
    public ft0 l(r6 r6Var) {
        go0 go0Var = (go0) r6Var.d;
        if (go0Var != null && wg0.i(go0Var) == this.c) {
            return new r6(this, 22, (byte[]) r6Var.e);
        }
        c.p(go0Var, "Invalid algorithm: ");
        return null;
    }

    public /* synthetic */ f61(int i, Object obj) {
        this.d = obj;
        this.c = i;
    }

    public f61(jj jjVar, int i) {
        wv0.p(jjVar);
        this.d = jjVar;
        this.c = i;
    }

    public f61(int i, u20 u20Var) {
        if (!ht0.C(i)) {
            c.k("'signatureScheme'");
            throw null;
        }
        this.c = i;
        this.d = u20Var;
    }

    public f61() {
        this.c = 1;
        this.d = Collections.singletonList(null);
    }

    public f61(ArrayList arrayList) {
        this.c = 0;
        this.d = arrayList;
    }
}
