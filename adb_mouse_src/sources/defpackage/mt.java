package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class mt extends k20 {
    public final lt G;

    public mt(TextView textView) {
        super(18);
        this.G = new lt(textView);
    }

    @Override // defpackage.k20
    public final InputFilter[] B(InputFilter[] inputFilterArr) {
        boolean z;
        if (zs.k != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return inputFilterArr;
        }
        return this.G.B(inputFilterArr);
    }

    @Override // defpackage.k20
    public final boolean L() {
        return this.G.I;
    }

    @Override // defpackage.k20
    public final void f0(boolean z) {
        boolean z2;
        if (zs.k != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return;
        }
        this.G.f0(z);
    }

    @Override // defpackage.k20
    public final void g0(boolean z) {
        boolean z2;
        if (zs.k != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        lt ltVar = this.G;
        if (!z2) {
            ltVar.I = z;
        } else {
            ltVar.g0(z);
        }
    }

    @Override // defpackage.k20
    public final TransformationMethod t0(TransformationMethod transformationMethod) {
        boolean z;
        if (zs.k != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return transformationMethod;
        }
        return this.G.t0(transformationMethod);
    }
}
