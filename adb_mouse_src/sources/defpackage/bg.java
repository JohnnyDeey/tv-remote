package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class bg extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bg(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((eh) obj).h);
            case 6:
                return Float.valueOf(((eh) obj).i);
            case 7:
                return Float.valueOf(((gh) obj).h);
            case 8:
                return Float.valueOf(((gh) obj).i);
            case 9:
                return Float.valueOf(((nr) obj).b());
            case 10:
                return Float.valueOf(((SwitchCompat) obj).B);
            case 11:
                return Float.valueOf(kz0.a.B((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                eg egVar = (eg) obj;
                PointF pointF = (PointF) obj2;
                egVar.getClass();
                egVar.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                egVar.b = round;
                int i = egVar.f + 1;
                egVar.f = i;
                if (i == egVar.g) {
                    kz0.a(egVar.e, egVar.a, round, egVar.c, egVar.d);
                    egVar.f = 0;
                    egVar.g = 0;
                    return;
                }
                return;
            case 1:
                eg egVar2 = (eg) obj;
                PointF pointF2 = (PointF) obj2;
                egVar2.getClass();
                egVar2.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                egVar2.d = round2;
                int i2 = egVar2.g + 1;
                egVar2.g = i2;
                if (egVar2.f == i2) {
                    kz0.a(egVar2.e, egVar2.a, egVar2.b, egVar2.c, round2);
                    egVar2.f = 0;
                    egVar2.g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                kz0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                kz0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                kz0.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 5:
                eh ehVar = (eh) obj;
                float floatValue = ((Float) obj2).floatValue();
                ehVar.h = floatValue;
                int i3 = (int) (floatValue * 5400.0f);
                kv kvVar = ehVar.e;
                ArrayList arrayList = (ArrayList) ehVar.b;
                or orVar = (or) arrayList.get(0);
                float f = ehVar.h * 1520.0f;
                orVar.a = (-20.0f) + f;
                orVar.b = f;
                for (int i4 = 0; i4 < 4; i4++) {
                    orVar.b = (kvVar.getInterpolation(d6.h(i3, eh.k[i4], 667)) * 250.0f) + orVar.b;
                    orVar.a = (kvVar.getInterpolation(d6.h(i3, eh.l[i4], 667)) * 250.0f) + orVar.a;
                }
                float f2 = orVar.a;
                float f3 = orVar.b;
                orVar.a = (((f3 - f2) * ehVar.i) + f2) / 360.0f;
                orVar.b = f3 / 360.0f;
                int i5 = 0;
                while (true) {
                    if (i5 < 4) {
                        float h = d6.h(i3, eh.m[i5], 333);
                        if (h > 0.0f && h < 1.0f) {
                            int i6 = i5 + ehVar.g;
                            int[] iArr = ehVar.f.e;
                            int length = i6 % iArr.length;
                            int length2 = (length + 1) % iArr.length;
                            ((or) arrayList.get(0)).c = g8.a(kvVar.getInterpolation(h), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[length2])).intValue();
                        } else {
                            i5++;
                        }
                    }
                }
                ((t10) ehVar.a).invalidateSelf();
                return;
            case 6:
                ((eh) obj).i = ((Float) obj2).floatValue();
                return;
            case 7:
                gh ghVar = (gh) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                ghVar.h = floatValue2;
                int i7 = (int) (floatValue2 * 6000.0f);
                TimeInterpolator timeInterpolator = ghVar.e;
                ArrayList arrayList2 = (ArrayList) ghVar.b;
                or orVar2 = (or) arrayList2.get(0);
                float f4 = ghVar.h * 1080.0f;
                int[] iArr2 = gh.l;
                float f5 = 0.0f;
                for (int i8 : iArr2) {
                    f5 += timeInterpolator.getInterpolation(d6.h(i7, i8, 500)) * 90.0f;
                }
                orVar2.f = f4 + f5;
                float interpolation = timeInterpolator.getInterpolation(d6.h(i7, 0, 3000)) - timeInterpolator.getInterpolation(d6.h(i7, 3000, 3000));
                orVar2.a = 0.0f;
                float[] fArr = gh.m;
                float E = r21.E(fArr[0], fArr[1], interpolation);
                orVar2.b = E;
                float f6 = ghVar.i;
                if (f6 > 0.0f) {
                    orVar2.b = (1.0f - f6) * E;
                }
                int i9 = 0;
                while (true) {
                    if (i9 < iArr2.length) {
                        float h2 = d6.h(i7, iArr2[i9], 100);
                        if (h2 >= 0.0f && h2 <= 1.0f) {
                            int i10 = i9 + ghVar.g;
                            int[] iArr3 = ghVar.f.e;
                            int length3 = i10 % iArr3.length;
                            int length4 = (length3 + 1) % iArr3.length;
                            ((or) arrayList2.get(0)).c = g8.a(timeInterpolator.getInterpolation(h2), Integer.valueOf(iArr3[length3]), Integer.valueOf(iArr3[length4])).intValue();
                        } else {
                            i9++;
                        }
                    }
                }
                ((t10) ghVar.a).invalidateSelf();
                return;
            case 8:
                ((gh) obj).i = ((Float) obj2).floatValue();
                return;
            case 9:
                nr nrVar = (nr) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                if (nrVar.k != floatValue3) {
                    nrVar.k = floatValue3;
                    nrVar.invalidateSelf();
                    return;
                }
                return;
            case 10:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
            case 11:
                kz0.a.N((View) obj, ((Float) obj2).floatValue());
                return;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}
