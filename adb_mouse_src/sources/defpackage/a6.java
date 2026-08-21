package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class a6 implements Window.Callback {
    public final Window.Callback c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ g6 g;

    public a6(g6 g6Var, Window.Callback callback) {
        this.g = g6Var;
        if (callback != null) {
            this.c = callback;
        } else {
            c.k("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.d = true;
            callback.onContentChanged();
        } finally {
            this.d = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.c.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.c.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        f01.a(this.c, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.c.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.e;
        Window.Callback callback = this.c;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.g.t(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r5 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            android.view.Window$Callback r0 = r5.c
            boolean r0 = r0.dispatchKeyShortcutEvent(r6)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r6.getKeyCode()
            g6 r5 = r5.g
            r5.z()
            j01 r2 = r5.p
            r3 = 0
            if (r2 == 0) goto L3d
            i01 r2 = r2.i
            if (r2 != 0) goto L1d
        L1b:
            r0 = r3
            goto L39
        L1d:
            w90 r2 = r2.f
            if (r2 == 0) goto L1b
            int r4 = r6.getDeviceId()
            android.view.KeyCharacterMap r4 = android.view.KeyCharacterMap.load(r4)
            int r4 = r4.getKeyboardType()
            if (r4 == r1) goto L31
            r4 = r1
            goto L32
        L31:
            r4 = r3
        L32:
            r2.setQwertyMode(r4)
            boolean r0 = r2.performShortcut(r0, r6, r3)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r5 = r1
            goto L6b
        L3d:
            f6 r0 = r5.N
            if (r0 == 0) goto L52
            int r2 = r6.getKeyCode()
            boolean r0 = r5.E(r0, r2, r6)
            if (r0 == 0) goto L52
            f6 r5 = r5.N
            if (r5 == 0) goto L3b
            r5.l = r1
            goto L3b
        L52:
            f6 r0 = r5.N
            if (r0 != 0) goto L6a
            f6 r0 = r5.y(r3)
            r5.F(r0, r6)
            int r2 = r6.getKeyCode()
            boolean r5 = r5.E(r0, r2, r6)
            r0.k = r3
            if (r5 == 0) goto L6a
            goto L3b
        L6a:
            r5 = r3
        L6b:
            if (r5 == 0) goto L6e
            goto L6f
        L6e:
            return r3
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.c.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.c.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.c.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.c.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.c.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.c.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.d) {
            this.c.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0 && !(menu instanceof w90)) {
            return false;
        }
        return this.c.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.c.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.c.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.c.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            g6 g6Var = this.g;
            g6Var.z();
            j01 j01Var = g6Var.p;
            if (j01Var != null) {
                ArrayList arrayList = j01Var.m;
                if (true != j01Var.l) {
                    j01Var.l = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        c.a();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f) {
            this.c.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        g6 g6Var = this.g;
        if (i == 108) {
            g6Var.z();
            j01 j01Var = g6Var.p;
            if (j01Var != null) {
                ArrayList arrayList = j01Var.m;
                if (j01Var.l) {
                    j01Var.l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        c.a();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == 0) {
            f6 y = g6Var.y(i);
            if (y.m) {
                g6Var.r(y, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        g01.a(this.c, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        w90 w90Var;
        if (menu instanceof w90) {
            w90Var = (w90) menu;
        } else {
            w90Var = null;
        }
        if (i == 0 && w90Var == null) {
            return false;
        }
        if (w90Var != null) {
            w90Var.x = true;
        }
        boolean onPreparePanel = this.c.onPreparePanel(i, view, menu);
        if (w90Var != null) {
            w90Var.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        w90 w90Var = this.g.y(0).h;
        if (w90Var != null) {
            d(list, w90Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return e01.a(this.c, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.c.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.c.onWindowFocusChanged(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, v2, lp0, u90] */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        boolean z;
        ViewGroup viewGroup;
        Context context;
        g6 g6Var = this.g;
        Context context2 = g6Var.m;
        if (i != 0) {
            return e01.b(this.c, callback, i);
        }
        l3 l3Var = new l3(context2, callback);
        v2 v2Var = g6Var.v;
        if (v2Var != null) {
            v2Var.a();
        }
        r6 r6Var = new r6(g6Var, 4, l3Var);
        g6Var.z();
        j01 j01Var = g6Var.p;
        int i2 = 1;
        if (j01Var != null) {
            i01 i01Var = j01Var.i;
            if (i01Var != null) {
                i01Var.a();
            }
            j01Var.c.setHideOnContentScrollEnabled(false);
            j01Var.f.e();
            i01 i01Var2 = new i01(j01Var, j01Var.f.getContext(), r6Var);
            w90 w90Var = i01Var2.f;
            w90Var.w();
            try {
                if (((l3) i01Var2.g.d).s(i01Var2, w90Var)) {
                    j01Var.i = i01Var2;
                    i01Var2.h();
                    j01Var.f.c(i01Var2);
                    j01Var.a(true);
                } else {
                    i01Var2 = null;
                }
                g6Var.v = i01Var2;
            } finally {
                w90Var.v();
            }
        }
        if (g6Var.v == null) {
            dz0 dz0Var = g6Var.z;
            if (dz0Var != null) {
                dz0Var.b();
            }
            v2 v2Var2 = g6Var.v;
            if (v2Var2 != null) {
                v2Var2.a();
            }
            if (g6Var.w == null) {
                if (g6Var.J) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        pk pkVar = new pk(context2, 0);
                        pkVar.getTheme().setTo(newTheme);
                        context2 = pkVar;
                    }
                    g6Var.w = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    g6Var.x = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    g6Var.x.setContentView(g6Var.w);
                    g6Var.x.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    g6Var.w.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    g6Var.x.setHeight(-2);
                    g6Var.y = new t5(g6Var, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) g6Var.B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        g6Var.z();
                        j01 j01Var2 = g6Var.p;
                        if (j01Var2 != null) {
                            context = j01Var2.b();
                        } else {
                            context = null;
                        }
                        if (context != null) {
                            context2 = context;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        g6Var.w = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (g6Var.w != null) {
                dz0 dz0Var2 = g6Var.z;
                if (dz0Var2 != null) {
                    dz0Var2.b();
                }
                g6Var.w.e();
                Context context3 = g6Var.w.getContext();
                ActionBarContextView actionBarContextView = g6Var.w;
                ?? obj = new Object();
                obj.e = context3;
                obj.f = actionBarContextView;
                obj.g = r6Var;
                w90 w90Var2 = new w90(actionBarContextView.getContext());
                w90Var2.l = 1;
                obj.j = w90Var2;
                w90Var2.e = obj;
                if (((l3) r6Var.d).s(obj, w90Var2)) {
                    obj.h();
                    g6Var.w.c(obj);
                    g6Var.v = obj;
                    if (g6Var.A && (viewGroup = g6Var.B) != null && viewGroup.isLaidOut()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ActionBarContextView actionBarContextView2 = g6Var.w;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        dz0 a = ry0.a(g6Var.w);
                        a.a(1.0f);
                        g6Var.z = a;
                        a.d(new v5(i2, g6Var));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        g6Var.w.setVisibility(0);
                        if (g6Var.w.getParent() instanceof View) {
                            View view = (View) g6Var.w.getParent();
                            WeakHashMap weakHashMap = ry0.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (g6Var.x != null) {
                        g6Var.n.getDecorView().post(g6Var.y);
                    }
                } else {
                    g6Var.v = null;
                }
            }
            g6Var.H();
            g6Var.v = g6Var.v;
        }
        g6Var.H();
        v2 v2Var3 = g6Var.v;
        if (v2Var3 == null) {
            return null;
        }
        return l3Var.f(v2Var3);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.c.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
