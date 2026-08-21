package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class j4 extends ej implements DialogInterface, i5 {
    public g6 f;
    public final h6 g;
    public final i4 h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [h6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j4(android.view.ContextThemeWrapper r5, int r6) {
        /*
            r4 = this;
            int r6 = g(r5, r6)
            r0 = 1
            r1 = 2130903467(0x7f0301ab, float:1.7413753E38)
            if (r6 != 0) goto L19
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L1a
        L19:
            r2 = r6
        L1a:
            r4.<init>(r5, r2)
            h6 r2 = new h6
            r2.<init>()
            r4.g = r2
            s5 r2 = r4.d()
            if (r6 != 0) goto L38
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L38:
            r5 = r2
            g6 r5 = (defpackage.g6) r5
            r5.U = r6
            r2.c()
            i4 r5 = new i4
            android.content.Context r6 = r4.getContext()
            android.view.Window r0 = r4.getWindow()
            r5.<init>(r6, r4, r0)
            r4.h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j4.<init>(android.view.ContextThemeWrapper, int):void");
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.ej, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        g6 g6Var = (g6) d();
        g6Var.v();
        ((ViewGroup) g6Var.B.findViewById(android.R.id.content)).addView(view, layoutParams);
        g6Var.o.a(g6Var.n.getCallback());
    }

    public final s5 d() {
        if (this.f == null) {
            q5 q5Var = s5.c;
            this.f = new g6(getContext(), getWindow(), this, this);
        }
        return this.f;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return k20.p(this.g, getWindow().getDecorView(), this, keyEvent);
    }

    public final void f(Bundle bundle) {
        d().a();
        super.onCreate(bundle);
        d().c();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        g6 g6Var = (g6) d();
        g6Var.v();
        return g6Var.n.findViewById(i);
    }

    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().l(charSequence);
    }

    public final boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        g6 g6Var = (g6) d();
        if (g6Var.p != null) {
            g6Var.z();
            g6Var.p.getClass();
            g6Var.A(0);
        }
    }

    @Override // defpackage.ej, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        ListAdapter listAdapter;
        int i3;
        int i4;
        View findViewById;
        View findViewById2;
        f(bundle);
        i4 i4Var = this.h;
        i4Var.b.setContentView(i4Var.z);
        Context context = i4Var.a;
        Window window = i4Var.c;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view = i4Var.g;
        if (view == null) {
            view = null;
        }
        int i5 = 0;
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !i4.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (i4Var.h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (i4Var.f != null) {
                ((LinearLayout.LayoutParams) ((x50) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b = i4.b(findViewById7, findViewById4);
        ViewGroup b2 = i4.b(findViewById8, findViewById5);
        ViewGroup b3 = i4.b(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        i4Var.r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        i4Var.r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(android.R.id.message);
        i4Var.v = textView;
        if (textView != null) {
            CharSequence charSequence = i4Var.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                i4Var.r.removeView(i4Var.v);
                if (i4Var.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) i4Var.r.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(i4Var.r);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(i4Var.f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b2.setVisibility(8);
                }
            }
        }
        Button button = (Button) b3.findViewById(android.R.id.button1);
        i4Var.i = button;
        f2 f2Var = i4Var.G;
        button.setOnClickListener(f2Var);
        boolean isEmpty = TextUtils.isEmpty(i4Var.j);
        Button button2 = i4Var.i;
        if (isEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(i4Var.j);
            i4Var.i.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) b3.findViewById(android.R.id.button2);
        i4Var.l = button3;
        button3.setOnClickListener(f2Var);
        boolean isEmpty2 = TextUtils.isEmpty(i4Var.m);
        Button button4 = i4Var.l;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(i4Var.m);
            i4Var.l.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) b3.findViewById(android.R.id.button3);
        i4Var.o = button5;
        button5.setOnClickListener(f2Var);
        boolean isEmpty3 = TextUtils.isEmpty(i4Var.p);
        Button button6 = i4Var.o;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(i4Var.p);
            i4Var.o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = i4Var.i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = i4Var.l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = i4Var.o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            b3.setVisibility(8);
        }
        if (i4Var.w != null) {
            b.addView(i4Var.w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            i4Var.t = (ImageView) window.findViewById(android.R.id.icon);
            if (!TextUtils.isEmpty(i4Var.d) && i4Var.E) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                i4Var.u = textView2;
                textView2.setText(i4Var.d);
                Drawable drawable = i4Var.s;
                if (drawable != null) {
                    i4Var.t.setImageDrawable(drawable);
                } else {
                    i4Var.u.setPadding(i4Var.t.getPaddingLeft(), i4Var.t.getPaddingTop(), i4Var.t.getPaddingRight(), i4Var.t.getPaddingBottom());
                    i4Var.t.setVisibility(8);
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                i4Var.t.setVisibility(8);
                b.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (b != null && b.getVisibility() != 8) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (b3.getVisibility() != 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && (findViewById2 = b2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = i4Var.r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (i4Var.e == null && i4Var.f == null) {
                findViewById = null;
            } else {
                findViewById = b.findViewById(R.id.titleDividerNoCustom);
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            View findViewById10 = b2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = i4Var.f;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            int paddingLeft = alertController$RecycleListView.getPaddingLeft();
            if (i2 != 0) {
                i3 = alertController$RecycleListView.getPaddingTop();
            } else {
                i3 = alertController$RecycleListView.c;
            }
            int paddingRight = alertController$RecycleListView.getPaddingRight();
            if (z3) {
                i4 = alertController$RecycleListView.getPaddingBottom();
            } else {
                i4 = alertController$RecycleListView.d;
            }
            alertController$RecycleListView.setPadding(paddingLeft, i3, paddingRight, i4);
        }
        if (!z2) {
            View view2 = i4Var.f;
            if (view2 == null) {
                view2 = i4Var.r;
            }
            if (view2 != null) {
                if (z3) {
                    i5 = 2;
                }
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = ry0.a;
                view2.setScrollIndicators(i2 | i5, 3);
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = i4Var.f;
        if (alertController$RecycleListView2 != null && (listAdapter = i4Var.x) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i6 = i4Var.y;
            if (i6 > -1) {
                alertController$RecycleListView2.setItemChecked(i6, true);
                alertController$RecycleListView2.setSelection(i6);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.h.r;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.h.r;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.ej, android.app.Dialog
    public final void onStop() {
        super.onStop();
        g6 g6Var = (g6) d();
        g6Var.z();
        j01 j01Var = g6Var.p;
        if (j01Var != null) {
            j01Var.t = false;
            ez0 ez0Var = j01Var.s;
            if (ez0Var != null) {
                ez0Var.a();
            }
        }
    }

    @Override // defpackage.ej, android.app.Dialog
    public final void setContentView(int i) {
        c();
        d().h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().l(getContext().getString(i));
    }

    @Override // defpackage.ej, android.app.Dialog
    public final void setContentView(View view) {
        c();
        d().i(view);
    }

    @Override // defpackage.ej, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        d().j(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        h(charSequence);
        i4 i4Var = this.h;
        i4Var.d = charSequence;
        TextView textView = i4Var.u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
