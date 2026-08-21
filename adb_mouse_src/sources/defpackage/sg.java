package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class sg extends f1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sg(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.f1
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).f);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // defpackage.f1
    public final void d(View view, s1 s1Var) {
        int i;
        String l;
        RecyclerView recyclerView;
        int i2 = this.d;
        int i3 = -1;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        Object obj = this.e;
        switch (i2) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = s1Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.g);
                accessibilityNodeInfo.setChecked(checkableImageButton.f);
                return;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = s1Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i4 = MaterialButtonToggleGroup.s;
                if (view instanceof MaterialButton) {
                    int i5 = 0;
                    for (int i6 = 0; i6 < materialButtonToggleGroup.getChildCount(); i6++) {
                        if (materialButtonToggleGroup.getChildAt(i6) == view) {
                            i = i5;
                            accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).q));
                            return;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i6) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i6).getVisibility() != 8) {
                                i5++;
                            }
                        }
                    }
                }
                i = -1;
                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).q));
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, s1Var.a);
                c90 c90Var = (c90) obj;
                if (c90Var.h0.getVisibility() == 0) {
                    l = c90Var.l(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    l = c90Var.l(R.string.mtrl_picker_toggle_to_day_selection);
                }
                s1Var.b(new m1(l, 16));
                return;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo3 = s1Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).z);
                return;
            default:
                we0 we0Var = (we0) obj;
                we0Var.g.d(view, s1Var);
                RecyclerView recyclerView2 = we0Var.f;
                recyclerView2.getClass();
                di0 I = RecyclerView.I(view);
                if (I != null && (recyclerView = I.r) != null) {
                    i3 = recyclerView.F(I);
                }
                gh0 adapter = recyclerView2.getAdapter();
                if (adapter instanceof te0) {
                    ((te0) adapter).i(i3);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.f1
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 4:
                return ((we0) this.e).g.g(view, i, bundle);
            default:
                return super.g(view, i, bundle);
        }
    }
}
