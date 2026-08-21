package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class rp0 {
    public final int a;
    public final on0 b;
    public final int[][] c;
    public final on0[] d;
    public final pp0 e;
    public final pp0 f;
    public final pp0 g;
    public final pp0 h;

    public rp0(qp0 qp0Var) {
        this.a = qp0Var.a;
        this.b = qp0Var.b;
        this.c = qp0Var.c;
        this.d = qp0Var.d;
        this.e = qp0Var.e;
        this.f = qp0Var.f;
        this.g = qp0Var.g;
        this.h = qp0Var.h;
    }

    public static void a(qp0 qp0Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        int[] iArr = mg0.t;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        on0 a = on0.a(context, obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), new k0(0.0f)).a();
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i = 0;
                        for (int i2 = 0; i2 < attributeCount; i2++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                            if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                int i3 = i + 1;
                                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i] = attributeNameResource;
                                i = i3;
                            }
                        }
                        qp0Var.a(StateSet.trimStateSet(iArr2, i), a);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [qp0, java.lang.Object] */
    public static rp0 b(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        ?? obj = new Object();
        obj.b();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            obj.b();
        }
        try {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                if (xml.getName().equals("selector")) {
                    a(obj, context, xml, asAttributeSet, context.getTheme());
                }
                xml.close();
                if (obj.a == 0) {
                    return null;
                }
                return new rp0(obj);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final on0 c() {
        on0 on0Var = this.b;
        pp0 pp0Var = this.h;
        pp0 pp0Var2 = this.g;
        pp0 pp0Var3 = this.f;
        pp0 pp0Var4 = this.e;
        if (pp0Var4 == null && pp0Var3 == null && pp0Var2 == null && pp0Var == null) {
            return on0Var;
        }
        nn0 f = on0Var.f();
        if (pp0Var4 != null) {
            f.e = pp0Var4.b;
        }
        if (pp0Var3 != null) {
            f.f = pp0Var3.b;
        }
        if (pp0Var2 != null) {
            f.h = pp0Var2.b;
        }
        if (pp0Var != null) {
            f.g = pp0Var.b;
        }
        return f.a();
    }

    public final boolean d() {
        pp0 pp0Var;
        pp0 pp0Var2;
        pp0 pp0Var3;
        pp0 pp0Var4;
        if (this.a > 1 || (((pp0Var = this.e) != null && pp0Var.a > 1) || (((pp0Var2 = this.f) != null && pp0Var2.a > 1) || (((pp0Var3 = this.g) != null && pp0Var3.a > 1) || ((pp0Var4 = this.h) != null && pp0Var4.a > 1))))) {
            return true;
        }
        return false;
    }
}
