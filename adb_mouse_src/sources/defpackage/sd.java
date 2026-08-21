package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class sd {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;

    public sd(Context context, XmlResourceParser xmlResourceParser) {
        this.a = 1;
        this.d = new ArrayList();
        this.c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), gg0.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.b = obtainStyledAttributes.getResourceId(index, this.b);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.c);
                this.c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new zj().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [td, java.lang.Object] */
    public td a() {
        ?? obj = new Object();
        obj.a = this.b;
        obj.b = this.c;
        obj.c = (String) this.d;
        return obj;
    }

    public void b() {
        for (int i = 0; i < this.b; i++) {
            c0 c0Var = ((c0[]) this.d)[i];
            short[] sArr = new short[256];
            System.arraycopy((short[]) c0Var.e, 0, sArr, 0, 256);
            int i2 = 1;
            for (int i3 = 128; i3 >= 2; i3 >>= 1) {
                int i4 = 0;
                while (i4 < 256) {
                    int i5 = i2 + 1;
                    short s = k20.p[i2];
                    int i6 = i4;
                    while (i6 < i4 + i3) {
                        int i7 = i6 + i3;
                        short i8 = gi0.i(sArr[i7] * s);
                        sArr[i7] = (short) (sArr[i6] - i8);
                        sArr[i6] = (short) (sArr[i6] + i8);
                        i6++;
                    }
                    i4 = i6 + i3;
                    i2 = i5;
                }
            }
            c0Var.e = sArr;
            c0Var.p();
        }
    }

    public byte[] c() {
        byte[] bArr = new byte[this.c];
        for (int i = 0; i < this.b; i++) {
            c0 c0Var = ((c0[]) this.d)[i];
            for (int i2 = 0; i2 < 256; i2++) {
                short s = (short) (r5[i2] - 3329);
                ((short[]) c0Var.e)[i2] = (short) (s + ((s >> 15) & 3329));
            }
            byte[] bArr2 = new byte[384];
            for (int i3 = 0; i3 < 128; i3++) {
                short[] sArr = (short[]) c0Var.e;
                int i4 = i3 * 2;
                short s2 = sArr[i4];
                short s3 = sArr[i4 + 1];
                int i5 = i3 * 3;
                bArr2[i5] = (byte) s2;
                bArr2[i5 + 1] = (byte) ((s2 >> 8) | (s3 << 4));
                bArr2[i5 + 2] = (byte) (s3 >> 4);
            }
            c0Var.getClass();
            System.arraycopy(bArr2, 0, bArr, i * 384, 384);
        }
        return bArr;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                int i = this.b;
                StringBuilder sb = new StringBuilder("[");
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(((c0[]) this.d)[i2].toString());
                    if (i2 != i - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public sd(rj rjVar) {
        this.a = 2;
        int i = rjVar.a;
        this.b = i;
        this.c = rjVar.b;
        this.d = new c0[i];
        for (int i2 = 0; i2 < this.b; i2++) {
            ((c0[]) this.d)[i2] = new c0(rjVar);
        }
    }

    public sd(View view) {
        this.a = 3;
        this.d = view;
    }

    public /* synthetic */ sd() {
        this.a = 0;
    }
}
