package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ah extends f1 {
    public static final Rect o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final vj0 p = new Object();
    public static final os q = new Object();
    public final AccessibilityManager h;
    public final Chip i;
    public wu j;
    public final /* synthetic */ Chip n;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public ah(Chip chip, Chip chip2) {
        this.n = chip;
        this.i = chip2;
        this.h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        WeakHashMap weakHashMap = ry0.a;
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.f1
    public final i81 b(View view) {
        if (this.j == null) {
            this.j = new wu(this);
        }
        return this.j;
    }

    @Override // defpackage.f1
    public final void d(View view, s1 s1Var) {
        boolean z;
        AccessibilityNodeInfo accessibilityNodeInfo = s1Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.n;
        bh bhVar = chip.g;
        if (bhVar != null && bhVar.b0) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        s1Var.i(chip.getAccessibilityClassName());
        s1Var.j(chip.getText());
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        o(i, false);
        q(i, 8);
        return true;
    }

    public final s1 k(int i) {
        boolean z;
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        s1 s1Var = new s1(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        s1Var.i("android.view.View");
        Rect rect = o;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        AccessibilityNodeInfo accessibilityNodeInfo = s1Var.a;
        CharSequence charSequence = "";
        if (i == 1) {
            Chip chip2 = this.n;
            CharSequence closeIconContentDescription = chip2.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip2.getText();
                Context context = chip2.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, charSequence).trim());
            }
            closeIconTouchBoundsInt = chip2.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            s1Var.b(m1.e);
            accessibilityNodeInfo.setEnabled(chip2.isEnabled());
            s1Var.i(Button.class.getName());
        } else {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.y);
        }
        if (s1Var.g() == null && obtain.getContentDescription() == null) {
            f40.f("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.e;
        s1Var.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(chip.getContext().getPackageName());
                    s1Var.b = i;
                    obtain.setSource(chip, i);
                    if (this.k == i) {
                        obtain.setAccessibilityFocused(true);
                        s1Var.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        s1Var.a(64);
                    }
                    if (this.l == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        s1Var.a(2);
                    } else if (obtain.isFocusable()) {
                        s1Var.a(1);
                    }
                    obtain.setFocused(z);
                    int[] iArr = this.g;
                    chip.getLocationOnScreen(iArr);
                    Rect rect3 = this.d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        s1Var.f(rect3);
                        rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                    }
                    Rect rect4 = this.f;
                    if (chip.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                        if (rect3.intersect(rect4)) {
                            obtain.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                                Object parent = chip.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view = (View) parent;
                                        if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view.getParent();
                                    } else if (parent != null) {
                                        accessibilityNodeInfo.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return s1Var;
                }
                f40.f("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                return null;
            }
            f40.f("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        f40.f("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        return null;
    }

    public final void l(ArrayList arrayList) {
        bh bhVar;
        arrayList.add(0);
        Rect rect = Chip.y;
        Chip chip = this.n;
        if (chip.c() && (bhVar = chip.g) != null && bhVar.V && chip.j != null) {
            arrayList.add(1);
        }
    }

    public final boolean m(int i, Rect rect) {
        Object obj;
        s1 s1Var;
        boolean z;
        int i2;
        Object obj2;
        s1 s1Var2;
        int lastIndexOf;
        Object obj3;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        vo0 vo0Var = new vo0();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            vo0Var.b(((Integer) arrayList.get(i3)).intValue(), k(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.l;
        int i5 = Integer.MIN_VALUE;
        if (i4 == Integer.MIN_VALUE) {
            s1Var = null;
        } else {
            int k = wv0.k(vo0Var.e, i4, vo0Var.c);
            if (k < 0 || (obj = vo0Var.d[k]) == f20.p) {
                obj = null;
            }
            s1Var = (s1) obj;
        }
        vj0 vj0Var = p;
        os osVar = q;
        Chip chip = this.i;
        int i6 = -1;
        if (i != 1 && i != 2) {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                c.k("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i7 = this.l;
            if (i7 != Integer.MIN_VALUE) {
                n(i7).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130) {
                                rect2.set(0, -1, width, -1);
                            } else {
                                c.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                        } else {
                            rect2.set(-1, 0, -1, height);
                        }
                    } else {
                        rect2.set(0, height, width, height);
                    }
                } else {
                    rect2.set(width, 0, width, height);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i == 130) {
                            rect3.offset(0, -(rect2.height() + 1));
                        } else {
                            c.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                    } else {
                        rect3.offset(-(rect2.width() + 1), 0);
                    }
                } else {
                    rect3.offset(0, rect2.height() + 1);
                }
            } else {
                rect3.offset(rect2.width() + 1, 0);
            }
            osVar.getClass();
            int i8 = vo0Var.e;
            Rect rect4 = new Rect();
            s1Var2 = null;
            for (int i9 = 0; i9 < i8; i9++) {
                s1 s1Var3 = (s1) vo0Var.d[i9];
                if (s1Var3 != s1Var) {
                    vj0Var.getClass();
                    s1Var3.f(rect4);
                    if (mn.B(i, rect2, rect4)) {
                        if (mn.B(i, rect2, rect3) && !mn.c(i, rect2, rect4, rect3)) {
                            if (!mn.c(i, rect2, rect3, rect4)) {
                                int C = mn.C(i, rect2, rect4);
                                int D = mn.D(i, rect2, rect4);
                                int i10 = (D * D) + (C * 13 * C);
                                int C2 = mn.C(i, rect2, rect3);
                                int D2 = mn.D(i, rect2, rect3);
                                if (i10 >= (D2 * D2) + (C2 * 13 * C2)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        s1Var2 = s1Var3;
                    }
                }
            }
            i2 = 0;
        } else {
            WeakHashMap weakHashMap = ry0.a;
            if (chip.getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            osVar.getClass();
            int i11 = vo0Var.e;
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList2.add((s1) vo0Var.d[i12]);
            }
            Collections.sort(arrayList2, new jw(vj0Var, z));
            if (i != 1) {
                if (i == 2) {
                    int size = arrayList2.size();
                    if (s1Var == null) {
                        lastIndexOf = -1;
                    } else {
                        lastIndexOf = arrayList2.lastIndexOf(s1Var);
                    }
                    int i13 = lastIndexOf + 1;
                    if (i13 < size) {
                        obj3 = arrayList2.get(i13);
                    } else {
                        obj3 = null;
                    }
                    i2 = 0;
                    obj2 = obj3;
                } else {
                    c.k("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
            } else {
                i2 = 0;
                int size2 = arrayList2.size();
                if (s1Var != null) {
                    size2 = arrayList2.indexOf(s1Var);
                }
                int i14 = size2 - 1;
                if (i14 >= 0) {
                    obj2 = arrayList2.get(i14);
                } else {
                    obj2 = null;
                }
            }
            s1Var2 = (s1) obj2;
        }
        s1 s1Var4 = s1Var2;
        if (s1Var4 != null) {
            int i15 = vo0Var.e;
            int i16 = i2;
            while (true) {
                if (i16 >= i15) {
                    break;
                }
                if (vo0Var.d[i16] == s1Var4) {
                    i6 = i16;
                    break;
                }
                i16++;
            }
            i5 = vo0Var.c[i6];
        }
        return p(i5);
    }

    public final s1 n(int i) {
        if (i == -1) {
            Chip chip = this.i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
            s1 s1Var = new s1(obtain);
            WeakHashMap weakHashMap = ry0.a;
            chip.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                f40.f("Views cannot have both real and virtual children");
                return null;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                s1Var.a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
            }
            return s1Var;
        }
        return k(i);
    }

    public final void o(int i, boolean z) {
        int[] iArr;
        Chip chip = this.n;
        if (i == 1) {
            chip.o = z;
        }
        bh bhVar = chip.g;
        boolean z2 = chip.o;
        boolean z3 = false;
        if (bhVar.W != null) {
            if (z2) {
                iArr = new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled};
            } else {
                iArr = bh.Q0;
            }
            z3 = bhVar.R(iArr);
        }
        if (z3) {
            chip.refreshDrawableState();
        }
    }

    public final boolean p(int i) {
        int i2;
        Chip chip = this.i;
        if ((chip.isFocused() || chip.requestFocus()) && (i2 = this.l) != i) {
            if (i2 != Integer.MIN_VALUE) {
                j(i2);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            this.l = i;
            o(i, true);
            q(i, 8);
            return true;
        }
        return false;
    }

    public final void q(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i != Integer.MIN_VALUE && this.h.isEnabled() && (parent = (view = this.i).getParent()) != null) {
            if (i != -1) {
                obtain = AccessibilityEvent.obtain(i2);
                s1 n = n(i);
                obtain.getText().add(n.g());
                AccessibilityNodeInfo accessibilityNodeInfo = n.a;
                obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
                obtain.setScrollable(accessibilityNodeInfo.isScrollable());
                obtain.setPassword(accessibilityNodeInfo.isPassword());
                obtain.setEnabled(accessibilityNodeInfo.isEnabled());
                obtain.setChecked(accessibilityNodeInfo.isChecked());
                if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                    f40.f("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                    return;
                } else {
                    obtain.setClassName(accessibilityNodeInfo.getClassName());
                    obtain.setSource(view, i);
                    obtain.setPackageName(view.getContext().getPackageName());
                }
            } else {
                obtain = AccessibilityEvent.obtain(i2);
                view.onInitializeAccessibilityEvent(obtain);
            }
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }
}
