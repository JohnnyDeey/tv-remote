package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class i6 {
    public Object a;
    public Object b;
    public Object c;
    public Serializable d;
    public Object e;
    public Serializable f;

    public i6(Set set, String str, String str2) {
        Set unmodifiableSet;
        if (set == null) {
            unmodifiableSet = Collections.EMPTY_SET;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.a = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.c = str;
        this.d = str2;
        this.e = fo0.a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.b = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw qo0.l(it);
    }

    public static boolean b(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i) {
        int c = sr0.c(context, R.attr.colorControlHighlight);
        int b = sr0.b(context, R.attr.colorButtonNormal);
        int[] iArr = sr0.b;
        int[] iArr2 = sr0.d;
        int b2 = oi.b(c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, sr0.c, sr0.f}, new int[]{b, b2, oi.b(c, i), i});
    }

    public static LayerDrawable e(lj0 lj0Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c = lj0Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable c2 = lj0Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c instanceof BitmapDrawable) && c.getIntrinsicWidth() == dimensionPixelSize && c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c2 instanceof BitmapDrawable) && c2.getIntrinsicWidth() == dimensionPixelSize && c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void g(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = j6.b;
        }
        mutate.setColorFilter(j6.c(i, mode));
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            c.o("Property \"autoMetadata\" has not been set");
        }
    }

    public t9 c() {
        String str;
        if (((String) this.a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((yt) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.e) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new t9((String) this.a, (Integer) this.b, (yt) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        c.o("Missing required properties:".concat(str));
        return null;
    }

    public ColorStateList f(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return mn.q(context, R.color.abc_tint_edittext);
        }
        if (i == 2131165290) {
            return mn.q(context, R.color.abc_tint_switch_track);
        }
        if (i == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d = sr0.d(context, R.attr.colorSwitchThumbNormal);
            if (d != null && d.isStateful()) {
                int[] iArr3 = sr0.b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = sr0.e;
                iArr2[1] = sr0.c(context, R.attr.colorControlActivated);
                iArr[2] = sr0.f;
                iArr2[2] = d.getDefaultColor();
            } else {
                iArr[0] = sr0.b;
                iArr2[0] = sr0.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = sr0.e;
                iArr2[1] = sr0.c(context, R.attr.colorControlActivated);
                iArr[2] = sr0.f;
                iArr2[2] = sr0.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i == R.drawable.abc_btn_default_mtrl_shape) {
            return d(context, sr0.c(context, R.attr.colorButtonNormal));
        }
        if (i == R.drawable.abc_btn_borderless_material) {
            return d(context, 0);
        }
        if (i == R.drawable.abc_btn_colored_material) {
            return d(context, sr0.c(context, R.attr.colorAccent));
        }
        if (i != 2131165285 && i != R.drawable.abc_spinner_textfield_background_material) {
            if (b((int[]) this.b, i)) {
                return sr0.d(context, R.attr.colorControlNormal);
            }
            if (b((int[]) this.e, i)) {
                return mn.q(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.f, i)) {
                return mn.q(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return mn.q(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        return mn.q(context, R.color.abc_tint_spinner);
    }
}
