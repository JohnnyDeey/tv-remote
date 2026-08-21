package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class t60 implements bo0 {
    public static final Method C;
    public static final Method D;
    public boolean A;
    public final q6 B;
    public final Context c;
    public ListAdapter d;
    public wr e;
    public int h;
    public int i;
    public boolean k;
    public boolean l;
    public boolean m;
    public q60 p;
    public View q;
    public AdapterView.OnItemClickListener r;
    public AdapterView.OnItemSelectedListener s;
    public final Handler x;
    public Rect z;
    public final int f = -2;
    public int g = -2;
    public final int j = 1002;
    public int n = 0;
    public final int o = Integer.MAX_VALUE;
    public final p60 t = new p60(this, 1);
    public final s60 u = new s60(0, this);
    public final r60 v = new r60(this);
    public final p60 w = new p60(this, 0);
    public final Rect y = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                C = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                D = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [q6, android.widget.PopupWindow] */
    public t60(Context context, AttributeSet attributeSet, int i, int i2) {
        Drawable drawable;
        int resourceId;
        this.c = context;
        this.x = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ng0.o, i, 0);
        this.h = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.i = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.k = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ng0.s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = r21.r(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.B = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public wr a(Context context, boolean z) {
        return new wr(context, z);
    }

    @Override // defpackage.bo0
    public final boolean b() {
        return this.B.isShowing();
    }

    public final int c() {
        return this.h;
    }

    @Override // defpackage.bo0
    public final void d() {
        int i;
        boolean z;
        int makeMeasureSpec;
        int i2;
        int i3;
        boolean z2;
        wr wrVar;
        int i4;
        int i5;
        wr wrVar2 = this.e;
        Context context = this.c;
        int i6 = 1;
        q6 q6Var = this.B;
        if (wrVar2 == null) {
            wr a = a(context, !this.A);
            this.e = a;
            a.setAdapter(this.d);
            this.e.setOnItemClickListener(this.r);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new xr(i6, this));
            this.e.setOnScrollListener(this.v);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.s;
            if (onItemSelectedListener != null) {
                this.e.setOnItemSelectedListener(onItemSelectedListener);
            }
            q6Var.setContentView(this.e);
        }
        Drawable background = q6Var.getBackground();
        Rect rect = this.y;
        int i7 = 0;
        if (background != null) {
            background.getPadding(rect);
            int i8 = rect.top;
            i = rect.bottom + i8;
            if (!this.k) {
                this.i = -i8;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        if (q6Var.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        int a2 = n60.a(q6Var, this.q, this.i, z);
        int i9 = this.f;
        if (i9 == -1) {
            i3 = a2 + i;
        } else {
            int i10 = this.g;
            if (i10 != -2) {
                if (i10 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a3 = this.e.a(makeMeasureSpec, a2);
            if (a3 > 0) {
                i2 = this.e.getPaddingBottom() + this.e.getPaddingTop() + i;
            } else {
                i2 = 0;
            }
            i3 = a3 + i2;
        }
        if (q6Var.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        q6Var.setWindowLayoutType(this.j);
        if (q6Var.isShowing()) {
            if (this.q.isAttachedToWindow()) {
                int i11 = this.g;
                if (i11 == -1) {
                    i11 = -1;
                } else if (i11 == -2) {
                    i11 = this.q.getWidth();
                }
                if (i9 == -1) {
                    if (z2) {
                        i9 = i3;
                    } else {
                        i9 = -1;
                    }
                    int i12 = this.g;
                    if (z2) {
                        if (i12 == -1) {
                            i5 = -1;
                        } else {
                            i5 = 0;
                        }
                        q6Var.setWidth(i5);
                        q6Var.setHeight(0);
                    } else {
                        if (i12 == -1) {
                            i7 = -1;
                        }
                        q6Var.setWidth(i7);
                        q6Var.setHeight(-1);
                    }
                } else if (i9 == -2) {
                    i9 = i3;
                }
                q6Var.setOutsideTouchable(true);
                int i13 = i11;
                View view = this.q;
                int i14 = this.h;
                int i15 = this.i;
                if (i13 < 0) {
                    i4 = -1;
                } else {
                    i4 = i13;
                }
                if (i9 < 0) {
                    i9 = -1;
                }
                q6Var.update(view, i14, i15, i4, i9);
                return;
            }
            return;
        }
        int i16 = this.g;
        if (i16 == -1) {
            i16 = -1;
        } else if (i16 == -2) {
            i16 = this.q.getWidth();
        }
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = i3;
        }
        q6Var.setWidth(i16);
        q6Var.setHeight(i9);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = C;
            if (method != null) {
                try {
                    method.invoke(q6Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            o60.b(q6Var, true);
        }
        q6Var.setOutsideTouchable(true);
        q6Var.setTouchInterceptor(this.u);
        if (this.m) {
            q6Var.setOverlapAnchor(this.l);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = D;
            if (method2 != null) {
                try {
                    method2.invoke(q6Var, this.z);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            o60.a(q6Var, this.z);
        }
        q6Var.showAsDropDown(this.q, this.h, this.i, this.n);
        this.e.setSelection(-1);
        if ((!this.A || this.e.isInTouchMode()) && (wrVar = this.e) != null) {
            wrVar.setListSelectionHidden(true);
            wrVar.requestLayout();
        }
        if (!this.A) {
            this.x.post(this.w);
        }
    }

    @Override // defpackage.bo0
    public final void dismiss() {
        q6 q6Var = this.B;
        q6Var.dismiss();
        q6Var.setContentView(null);
        this.e = null;
        this.x.removeCallbacks(this.t);
    }

    public final Drawable e() {
        return this.B.getBackground();
    }

    @Override // defpackage.bo0
    public final wr h() {
        return this.e;
    }

    public final void i(Drawable drawable) {
        this.B.setBackgroundDrawable(drawable);
    }

    public final void k(int i) {
        this.i = i;
        this.k = true;
    }

    public final void m(int i) {
        this.h = i;
    }

    public final int o() {
        if (!this.k) {
            return 0;
        }
        return this.i;
    }

    public void q(ListAdapter listAdapter) {
        q60 q60Var = this.p;
        if (q60Var == null) {
            this.p = new q60(this);
        } else {
            ListAdapter listAdapter2 = this.d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(q60Var);
            }
        }
        this.d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.p);
        }
        wr wrVar = this.e;
        if (wrVar != null) {
            wrVar.setAdapter(this.d);
        }
    }

    public final void r(int i) {
        Drawable background = this.B.getBackground();
        if (background != null) {
            Rect rect = this.y;
            background.getPadding(rect);
            this.g = rect.left + rect.right + i;
            return;
        }
        this.g = i;
    }
}
