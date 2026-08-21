package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class wu extends i81 {
    public final /* synthetic */ ah f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(ah ahVar) {
        super(1);
        this.f = ahVar;
    }

    @Override // defpackage.i81
    public final boolean A(int i, int i2, Bundle bundle) {
        int i3;
        ah ahVar = this.f;
        Chip chip = ahVar.i;
        if (i != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    boolean z = false;
                    if (i2 != 64) {
                        if (i2 != 128) {
                            Chip chip2 = ahVar.n;
                            if (i2 == 16) {
                                if (i == 0) {
                                    return chip2.performClick();
                                }
                                if (i == 1) {
                                    chip2.playSoundEffect(0);
                                    View.OnClickListener onClickListener = chip2.j;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(chip2);
                                        z = true;
                                    }
                                    if (chip2.u) {
                                        chip2.t.q(1, 1);
                                    }
                                }
                            }
                            return z;
                        }
                        if (ahVar.k != i) {
                            return false;
                        }
                        ahVar.k = Integer.MIN_VALUE;
                        chip.invalidate();
                        ahVar.q(i, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = ahVar.h;
                    if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = ahVar.k) == i) {
                        return false;
                    }
                    if (i3 != Integer.MIN_VALUE) {
                        ahVar.k = Integer.MIN_VALUE;
                        chip.invalidate();
                        ahVar.q(i3, 65536);
                    }
                    ahVar.k = i;
                    chip.invalidate();
                    ahVar.q(i, 32768);
                    return true;
                }
                return ahVar.j(i);
            }
            return ahVar.p(i);
        }
        WeakHashMap weakHashMap = ry0.a;
        return chip.performAccessibilityAction(i2, bundle);
    }

    @Override // defpackage.i81
    public final s1 r(int i) {
        return new s1(AccessibilityNodeInfo.obtain(this.f.n(i).a));
    }

    @Override // defpackage.i81
    public final s1 s(int i) {
        int i2;
        ah ahVar = this.f;
        if (i == 2) {
            i2 = ahVar.k;
        } else {
            i2 = ahVar.l;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return r(i2);
    }
}
