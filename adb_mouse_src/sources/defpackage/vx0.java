package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class vx0 extends mx0 {
    public static final PorterDuff.Mode l = PorterDuff.Mode.SRC_IN;
    public tx0 d;
    public PorterDuffColorFilter e;
    public ColorFilter f;
    public boolean g;
    public boolean h;
    public final float[] i;
    public final Matrix j;
    public final Rect k;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, tx0] */
    public vx0() {
        this.h = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = l;
        constantState.b = new sx0();
        this.d = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.k;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f;
            if (colorFilter == null) {
                colorFilter = this.e;
            }
            Matrix matrix = this.j;
            canvas.getMatrix(matrix);
            float[] fArr = this.i;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int width = (int) (rect.width() * abs);
            int min = Math.min(2048, width);
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                tx0 tx0Var = this.d;
                Bitmap bitmap = tx0Var.f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != tx0Var.f.getHeight()) {
                    tx0Var.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    tx0Var.k = true;
                }
                boolean z = this.h;
                tx0 tx0Var2 = this.d;
                if (!z) {
                    tx0Var2.f.eraseColor(0);
                    Canvas canvas2 = new Canvas(tx0Var2.f);
                    sx0 sx0Var = tx0Var2.b;
                    sx0Var.a(sx0Var.g, sx0.p, canvas2, min, min2);
                } else if (tx0Var2.k || tx0Var2.g != tx0Var2.c || tx0Var2.h != tx0Var2.d || tx0Var2.j != tx0Var2.e || tx0Var2.i != tx0Var2.b.getRootAlpha()) {
                    tx0 tx0Var3 = this.d;
                    tx0Var3.f.eraseColor(0);
                    Canvas canvas3 = new Canvas(tx0Var3.f);
                    sx0 sx0Var2 = tx0Var3.b;
                    sx0Var2.a(sx0Var2.g, sx0.p, canvas3, min, min2);
                    tx0 tx0Var4 = this.d;
                    tx0Var4.g = tx0Var4.c;
                    tx0Var4.h = tx0Var4.d;
                    tx0Var4.i = tx0Var4.b.getRootAlpha();
                    tx0Var4.j = tx0Var4.e;
                    tx0Var4.k = false;
                }
                tx0 tx0Var5 = this.d;
                if (tx0Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (tx0Var5.l == null) {
                        Paint paint2 = new Paint();
                        tx0Var5.l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    tx0Var5.l.setAlpha(tx0Var5.b.getRootAlpha());
                    tx0Var5.l.setColorFilter(colorFilter);
                    paint = tx0Var5.l;
                }
                canvas.drawBitmap(tx0Var5.f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.d.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.d.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.c != null) {
            return new ux0(this.c.getConstantState());
        }
        this.d.a = getChangingConfigurations();
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.d.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.d.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13, types: [ox0, java.lang.Object, rx0] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        Paint.Cap cap;
        int i6;
        Paint.Join join;
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        tx0 tx0Var = this.d;
        tx0Var.b = new sx0();
        TypedArray j = hi0.j(resources, theme, attributeSet, f20.c);
        tx0 tx0Var2 = this.d;
        sx0 sx0Var = tx0Var2.b;
        if (!hi0.f(xmlPullParser, "tintMode")) {
            i = -1;
        } else {
            i = j.getInt(6, -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case 15:
                            mode = PorterDuff.Mode.SCREEN;
                            break;
                        case 16:
                            mode = PorterDuff.Mode.ADD;
                            break;
                    }
                } else {
                    mode = PorterDuff.Mode.SRC_ATOP;
                }
            }
        } else {
            mode = PorterDuff.Mode.SRC_OVER;
        }
        tx0Var2.d = mode;
        ColorStateList colorStateList = null;
        int i7 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            j.getValue(1, typedValue);
            int i8 = typedValue.type;
            if (i8 != 2) {
                if (i8 >= 28 && i8 <= 31) {
                    colorStateList = ColorStateList.valueOf(typedValue.data);
                } else {
                    Resources resources2 = j.getResources();
                    int resourceId = j.getResourceId(1, 0);
                    ThreadLocal threadLocal = ni.a;
                    try {
                        colorStateList = ni.a(resources2, resources2.getXml(resourceId), theme);
                    } catch (Exception e) {
                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    }
                }
            } else {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            tx0Var2.c = colorStateList2;
        }
        boolean z = tx0Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = j.getBoolean(5, z);
        }
        tx0Var2.e = z;
        float f = sx0Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = j.getFloat(7, f);
        }
        sx0Var.j = f;
        float f2 = sx0Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = j.getFloat(8, f2);
        }
        sx0Var.k = f2;
        if (sx0Var.j > 0.0f) {
            if (f2 > 0.0f) {
                sx0Var.h = j.getDimension(3, sx0Var.h);
                float dimension = j.getDimension(2, sx0Var.i);
                sx0Var.i = dimension;
                if (sx0Var.h > 0.0f) {
                    if (dimension > 0.0f) {
                        float alpha = sx0Var.getAlpha();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                            alpha = j.getFloat(4, alpha);
                        }
                        sx0Var.setAlpha(alpha);
                        String string = j.getString(0);
                        if (string != null) {
                            sx0Var.m = string;
                            sx0Var.o.put(string, sx0Var);
                        }
                        j.recycle();
                        tx0Var.a = getChangingConfigurations();
                        tx0Var.k = true;
                        tx0 tx0Var3 = this.d;
                        sx0 sx0Var2 = tx0Var3.b;
                        ArrayDeque arrayDeque = new ArrayDeque();
                        px0 px0Var = sx0Var2.g;
                        n8 n8Var = sx0Var2.o;
                        arrayDeque.push(px0Var);
                        int eventType = xmlPullParser.getEventType();
                        int depth = xmlPullParser.getDepth() + 1;
                        boolean z2 = true;
                        while (eventType != i7 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                            if (eventType == 2) {
                                String name = xmlPullParser.getName();
                                px0 px0Var2 = (px0) arrayDeque.peek();
                                i2 = depth;
                                if ("path".equals(name)) {
                                    ?? rx0Var = new rx0();
                                    rx0Var.e = 0.0f;
                                    rx0Var.g = 1.0f;
                                    rx0Var.h = 1.0f;
                                    rx0Var.i = 0.0f;
                                    rx0Var.j = 1.0f;
                                    rx0Var.k = 0.0f;
                                    Paint.Cap cap2 = Paint.Cap.BUTT;
                                    rx0Var.l = cap2;
                                    Paint.Join join2 = Paint.Join.MITER;
                                    rx0Var.m = join2;
                                    rx0Var.n = 4.0f;
                                    TypedArray j2 = hi0.j(resources, theme, attributeSet, f20.e);
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                        String string2 = j2.getString(0);
                                        if (string2 != null) {
                                            rx0Var.b = string2;
                                        }
                                        String string3 = j2.getString(2);
                                        if (string3 != null) {
                                            rx0Var.a = r21.k(string3);
                                        }
                                        rx0Var.f = hi0.d(j2, xmlPullParser, theme, "fillColor", 1);
                                        float f3 = rx0Var.h;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                            f3 = j2.getFloat(12, f3);
                                        }
                                        rx0Var.h = f3;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null) {
                                            i5 = j2.getInt(8, -1);
                                        } else {
                                            i5 = -1;
                                        }
                                        Paint.Cap cap3 = rx0Var.l;
                                        if (i5 != 0) {
                                            if (i5 != 1) {
                                                if (i5 != 2) {
                                                    cap = cap3;
                                                } else {
                                                    cap = Paint.Cap.SQUARE;
                                                }
                                            } else {
                                                cap = Paint.Cap.ROUND;
                                            }
                                        } else {
                                            cap = cap2;
                                        }
                                        rx0Var.l = cap;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null) {
                                            i6 = j2.getInt(9, -1);
                                        } else {
                                            i6 = -1;
                                        }
                                        Paint.Join join3 = rx0Var.m;
                                        if (i6 != 0) {
                                            if (i6 != 1) {
                                                if (i6 != 2) {
                                                    join = join3;
                                                } else {
                                                    join = Paint.Join.BEVEL;
                                                }
                                            } else {
                                                join = Paint.Join.ROUND;
                                            }
                                        } else {
                                            join = join2;
                                        }
                                        rx0Var.m = join;
                                        float f4 = rx0Var.n;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                            f4 = j2.getFloat(10, f4);
                                        }
                                        rx0Var.n = f4;
                                        rx0Var.d = hi0.d(j2, xmlPullParser, theme, "strokeColor", 3);
                                        float f5 = rx0Var.g;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                            f5 = j2.getFloat(11, f5);
                                        }
                                        rx0Var.g = f5;
                                        float f6 = rx0Var.e;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                            f6 = j2.getFloat(4, f6);
                                        }
                                        rx0Var.e = f6;
                                        float f7 = rx0Var.j;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                            f7 = j2.getFloat(6, f7);
                                        }
                                        rx0Var.j = f7;
                                        float f8 = rx0Var.k;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                            f8 = j2.getFloat(7, f8);
                                        }
                                        rx0Var.k = f8;
                                        float f9 = rx0Var.i;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                            f9 = j2.getFloat(5, f9);
                                        }
                                        rx0Var.i = f9;
                                        int i9 = rx0Var.c;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                            i9 = j2.getInt(13, i9);
                                        }
                                        rx0Var.c = i9;
                                    }
                                    j2.recycle();
                                    px0Var2.b.add(rx0Var);
                                    if (rx0Var.getPathName() != null) {
                                        n8Var.put(rx0Var.getPathName(), rx0Var);
                                    }
                                    tx0Var3.a = tx0Var3.a;
                                    z2 = false;
                                    c = '\b';
                                } else {
                                    c = '\b';
                                    if ("clip-path".equals(name)) {
                                        rx0 rx0Var2 = new rx0();
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                            TypedArray j3 = hi0.j(resources, theme, attributeSet, f20.f);
                                            String string4 = j3.getString(0);
                                            if (string4 != null) {
                                                rx0Var2.b = string4;
                                            }
                                            String string5 = j3.getString(1);
                                            if (string5 != null) {
                                                rx0Var2.a = r21.k(string5);
                                            }
                                            if (!hi0.f(xmlPullParser, "fillType")) {
                                                i4 = 0;
                                            } else {
                                                i4 = j3.getInt(2, 0);
                                            }
                                            rx0Var2.c = i4;
                                            j3.recycle();
                                        }
                                        px0Var2.b.add(rx0Var2);
                                        if (rx0Var2.getPathName() != null) {
                                            n8Var.put(rx0Var2.getPathName(), rx0Var2);
                                        }
                                        tx0Var3.a = tx0Var3.a;
                                    } else if ("group".equals(name)) {
                                        px0 px0Var3 = new px0();
                                        TypedArray j4 = hi0.j(resources, theme, attributeSet, f20.d);
                                        float f10 = px0Var3.c;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                                            f10 = j4.getFloat(5, f10);
                                        }
                                        px0Var3.c = f10;
                                        px0Var3.d = j4.getFloat(1, px0Var3.d);
                                        px0Var3.e = j4.getFloat(2, px0Var3.e);
                                        float f11 = px0Var3.f;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                            f11 = j4.getFloat(3, f11);
                                        }
                                        px0Var3.f = f11;
                                        float f12 = px0Var3.g;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                            f12 = j4.getFloat(4, f12);
                                        }
                                        px0Var3.g = f12;
                                        float f13 = px0Var3.h;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                            f13 = j4.getFloat(6, f13);
                                        }
                                        px0Var3.h = f13;
                                        float f14 = px0Var3.i;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                            f14 = j4.getFloat(7, f14);
                                        }
                                        px0Var3.i = f14;
                                        String string6 = j4.getString(0);
                                        if (string6 != null) {
                                            px0Var3.k = string6;
                                        }
                                        px0Var3.c();
                                        j4.recycle();
                                        px0Var2.b.add(px0Var3);
                                        arrayDeque.push(px0Var3);
                                        if (px0Var3.getGroupName() != null) {
                                            n8Var.put(px0Var3.getGroupName(), px0Var3);
                                        }
                                        tx0Var3.a = tx0Var3.a;
                                    }
                                }
                                i3 = 1;
                            } else {
                                i2 = depth;
                                c = '\b';
                                i3 = 1;
                                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                    arrayDeque.pop();
                                }
                            }
                            eventType = xmlPullParser.next();
                            i7 = i3;
                            depth = i2;
                        }
                        if (!z2) {
                            this.e = a(tx0Var.c, tx0Var.d);
                            return;
                        }
                        throw new XmlPullParserException("no path defined");
                    }
                    throw new XmlPullParserException(j.getPositionDescription() + "<vector> tag requires height > 0");
                }
                throw new XmlPullParserException(j.getPositionDescription() + "<vector> tag requires width > 0");
            }
            throw new XmlPullParserException(j.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(j.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.d.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            tx0 tx0Var = this.d;
            if (tx0Var != null) {
                sx0 sx0Var = tx0Var.b;
                if (sx0Var.n == null) {
                    sx0Var.n = Boolean.valueOf(sx0Var.g.a());
                }
                if (!sx0Var.n.booleanValue()) {
                    ColorStateList colorStateList = this.d.c;
                    if (colorStateList == null || !colorStateList.isStateful()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, tx0] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            tx0 tx0Var = this.d;
            ?? constantState = new Drawable.ConstantState();
            constantState.c = null;
            constantState.d = l;
            if (tx0Var != null) {
                constantState.a = tx0Var.a;
                sx0 sx0Var = new sx0(tx0Var.b);
                constantState.b = sx0Var;
                if (tx0Var.b.e != null) {
                    sx0Var.e = new Paint(tx0Var.b.e);
                }
                if (tx0Var.b.d != null) {
                    constantState.b.d = new Paint(tx0Var.b.d);
                }
                constantState.c = tx0Var.c;
                constantState.d = tx0Var.d;
                constantState.e = tx0Var.e;
            }
            this.d = constantState;
            this.g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        tx0 tx0Var = this.d;
        ColorStateList colorStateList = tx0Var.c;
        if (colorStateList != null && (mode = tx0Var.d) != null) {
            this.e = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        sx0 sx0Var = tx0Var.b;
        if (sx0Var.n == null) {
            sx0Var.n = Boolean.valueOf(sx0Var.g.a());
        }
        if (sx0Var.n.booleanValue()) {
            boolean b = tx0Var.b.g.b(iArr);
            tx0Var.k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.d.b.getRootAlpha() != i) {
            this.d.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.d.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        tx0 tx0Var = this.d;
        if (tx0Var.c != colorStateList) {
            tx0Var.c = colorStateList;
            this.e = a(colorStateList, tx0Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        tx0 tx0Var = this.d;
        if (tx0Var.d != mode) {
            tx0Var.d = mode;
            this.e = a(tx0Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public vx0(tx0 tx0Var) {
        this.h = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.d = tx0Var;
        this.e = a(tx0Var.c, tx0Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
