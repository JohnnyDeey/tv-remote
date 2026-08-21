package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class v80 extends LinearLayout {
    public final ArrayList c;
    public final ArrayList d;
    public final i81 e;
    public final m20 f;
    public Integer[] g;
    public pp0 h;
    public rp0 i;
    public int j;
    public tp0 k;
    public boolean l;

    /* JADX WARN: Type inference failed for: r0v25, types: [tp0, java.lang.Object] */
    public v80(Context context, AttributeSet attributeSet) {
        super(r21.Q(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        pp0 b;
        int next;
        XmlResourceParser xml;
        int next2;
        tp0 tp0Var;
        this.c = new ArrayList();
        this.d = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.e = new i81(27, materialButtonToggleGroup);
        this.f = new m20(1, materialButtonToggleGroup);
        this.l = true;
        Context context2 = getContext();
        TypedArray X = k20.X(context2, attributeSet, mg0.m, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (X.hasValue(2)) {
            int resourceId = X.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
                try {
                    ?? obj = new Object();
                    obj.c = new int[10];
                    obj.d = new sb0[10];
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next2 = xml.next();
                        if (next2 == 2) {
                            break;
                        }
                    } while (next2 != 1);
                    if (next2 == 2) {
                        if (xml.getName().equals("selector")) {
                            obj.a(context2, xml, asAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        tp0Var = obj;
                        this.k = tp0Var;
                    } else {
                        throw new XmlPullParserException("No start tag found");
                    }
                } finally {
                }
            }
            tp0Var = null;
            this.k = tp0Var;
        }
        if (X.hasValue(4)) {
            rp0 b2 = rp0.b(context2, X, 4);
            this.i = b2;
            if (b2 == null) {
                qp0 qp0Var = new qp0(on0.a(context2, X.getResourceId(4, 0), X.getResourceId(5, 0), new k0(0.0f)).a());
                this.i = qp0Var.a != 0 ? new rp0(qp0Var) : null;
            }
        }
        if (X.hasValue(3)) {
            k0 k0Var = new k0(0.0f);
            int resourceId2 = X.getResourceId(3, 0);
            if (resourceId2 == 0) {
                b = pp0.b(on0.c(X, 3, k0Var));
            } else if (!context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                b = pp0.b(on0.c(X, 3, k0Var));
            } else {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    try {
                        b = new pp0();
                        AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next == 2) {
                            if (xml2.getName().equals("selector")) {
                                b.d(context2, xml2, asAttributeSet2, context2.getTheme());
                            }
                            xml2.close();
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b = pp0.b(k0Var);
                }
            }
            this.h = b;
        }
        this.j = X.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(X.getBoolean(0, true));
        X.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int i;
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i2 - 1);
                if (this.j <= 0) {
                    i = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    i = 0;
                }
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(this.j - i);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = this.j - i;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                } else {
                    layoutParams3.setMarginEnd(0);
                    layoutParams3.setMarginStart(0);
                    layoutParams3.leftMargin = 0;
                    layoutParams3.rightMargin = 0;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.l = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.e);
        this.c.add(materialButton.getShapeAppearanceModel());
        this.d.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        int i;
        MaterialButton materialButton;
        MaterialButton materialButton2;
        int allowedWidthDecrease;
        float max;
        if (this.k != null && getChildCount() != 0) {
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = Integer.MAX_VALUE;
            for (int i3 = firstVisibleChildIndex; i3 <= lastVisibleChildIndex; i3++) {
                if (c(i3)) {
                    int i4 = 0;
                    if (c(i3) && this.k != null) {
                        MaterialButton materialButton3 = (MaterialButton) getChildAt(i3);
                        tp0 tp0Var = this.k;
                        int width = materialButton3.getWidth();
                        int i5 = -width;
                        for (int i6 = 0; i6 < tp0Var.a; i6++) {
                            sp0 sp0Var = (sp0) tp0Var.d[i6].c;
                            int i7 = sp0Var.a;
                            float f = sp0Var.b;
                            if (i7 == 2) {
                                max = Math.max(i5, f);
                            } else if (i7 == 1) {
                                max = Math.max(i5, width * f);
                            }
                            i5 = (int) max;
                        }
                        int max2 = Math.max(0, i5);
                        int i8 = i3 - 1;
                        while (true) {
                            materialButton = null;
                            if (i8 >= 0) {
                                if (c(i8)) {
                                    materialButton2 = (MaterialButton) getChildAt(i8);
                                    break;
                                }
                                i8--;
                            } else {
                                materialButton2 = null;
                                break;
                            }
                        }
                        if (materialButton2 == null) {
                            allowedWidthDecrease = 0;
                        } else {
                            allowedWidthDecrease = materialButton2.getAllowedWidthDecrease();
                        }
                        int childCount = getChildCount();
                        int i9 = i3 + 1;
                        while (true) {
                            if (i9 >= childCount) {
                                break;
                            }
                            if (c(i9)) {
                                materialButton = (MaterialButton) getChildAt(i9);
                                break;
                            }
                            i9++;
                        }
                        if (materialButton != null) {
                            i4 = materialButton.getAllowedWidthDecrease();
                        }
                        i4 = Math.min(max2, allowedWidthDecrease + i4);
                    }
                    if (i3 != firstVisibleChildIndex && i3 != lastVisibleChildIndex) {
                        i4 /= 2;
                    }
                    i2 = Math.min(i2, i4);
                }
            }
            for (int i10 = firstVisibleChildIndex; i10 <= lastVisibleChildIndex; i10++) {
                if (c(i10)) {
                    ((MaterialButton) getChildAt(i10)).setSizeChange(this.k);
                    MaterialButton materialButton4 = (MaterialButton) getChildAt(i10);
                    if (i10 != firstVisibleChildIndex && i10 != lastVisibleChildIndex) {
                        i = i2 * 2;
                    } else {
                        i = i2;
                    }
                    materialButton4.setWidthChangeMax(i);
                }
            }
        }
    }

    public final boolean c(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.x;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.x = null;
                materialButton.u = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.g = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [qp0, java.lang.Object] */
    public final void e() {
        boolean z;
        boolean z2;
        qp0 qp0Var;
        boolean z3;
        boolean z4;
        int i;
        rp0 rp0Var;
        if ((this.h != null || this.i != null) && this.l) {
            this.l = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            for (int i2 = 0; i2 < childCount; i2++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    if (i2 == firstVisibleChildIndex) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i2 == lastVisibleChildIndex) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    rp0 rp0Var2 = this.i;
                    if (rp0Var2 == null || (!z && !z2)) {
                        rp0Var2 = (rp0) this.d.get(i2);
                    }
                    if (rp0Var2 == null) {
                        qp0Var = new qp0((on0) this.c.get(i2));
                    } else {
                        ?? obj = new Object();
                        int i3 = rp0Var2.a;
                        obj.a = i3;
                        obj.b = rp0Var2.b;
                        int[][] iArr = rp0Var2.c;
                        int[][] iArr2 = new int[iArr.length];
                        obj.c = iArr2;
                        on0[] on0VarArr = rp0Var2.d;
                        obj.d = new on0[on0VarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i3);
                        System.arraycopy(on0VarArr, 0, obj.d, 0, obj.a);
                        obj.e = rp0Var2.e;
                        obj.f = rp0Var2.f;
                        obj.g = rp0Var2.g;
                        obj.h = rp0Var2.h;
                        qp0Var = obj;
                    }
                    if (getOrientation() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (getLayoutDirection() == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                        if (z) {
                            i = 5;
                        } else {
                            i = 0;
                        }
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        if (z) {
                            i = 3;
                        } else {
                            i = 0;
                        }
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i4 = ~i;
                    pp0 pp0Var = this.h;
                    if ((i4 | 1) == i4) {
                        qp0Var.e = pp0Var;
                    }
                    if ((i4 | 2) == i4) {
                        qp0Var.f = pp0Var;
                    }
                    if ((i4 | 4) == i4) {
                        qp0Var.g = pp0Var;
                    }
                    if ((i4 | 8) == i4) {
                        qp0Var.h = pp0Var;
                    }
                    if (qp0Var.a == 0) {
                        rp0Var = null;
                    } else {
                        rp0Var = new rp0(qp0Var);
                    }
                    if (rp0Var.d()) {
                        materialButton.setStateListShapeAppearanceModel(rp0Var);
                    } else {
                        materialButton.setShapeAppearanceModel(rp0Var.c());
                    }
                }
            }
        }
    }

    public tp0 getButtonSizeChange() {
        return this.k;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.g;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public al getInnerCornerSize() {
        return this.h.b;
    }

    public pp0 getInnerCornerSizeStateList() {
        return this.h;
    }

    public on0 getShapeAppearance() {
        rp0 rp0Var = this.i;
        if (rp0Var == null) {
            return null;
        }
        return rp0Var.c();
    }

    public int getSpacing() {
        return this.j;
    }

    public rp0 getStateListShapeAppearance() {
        return this.i;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.c.remove(indexOfChild);
            this.d.remove(indexOfChild);
        }
        this.l = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(tp0 tp0Var) {
        if (this.k != tp0Var) {
            this.k = tp0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(al alVar) {
        this.h = pp0.b(alVar);
        this.l = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(pp0 pp0Var) {
        this.h = pp0Var;
        this.l = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.l = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(on0 on0Var) {
        rp0 rp0Var;
        qp0 qp0Var = new qp0(on0Var);
        if (qp0Var.a == 0) {
            rp0Var = null;
        } else {
            rp0Var = new rp0(qp0Var);
        }
        this.i = rp0Var;
        this.l = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.j = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(rp0 rp0Var) {
        this.i = rp0Var;
        this.l = true;
        e();
        invalidate();
    }
}
