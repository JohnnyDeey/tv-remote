package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class lt extends k20 {
    public final TextView G;
    public final gt H;
    public boolean I;

    public lt(TextView textView) {
        super(18);
        this.G = textView;
        this.I = true;
        this.H = new gt(textView);
    }

    @Override // defpackage.k20
    public final InputFilter[] B(InputFilter[] inputFilterArr) {
        if (!this.I) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof gt) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            gt gtVar = this.H;
            if (i4 < length2) {
                if (inputFilterArr[i4] == gtVar) {
                    return inputFilterArr;
                }
                i4++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = gtVar;
                return inputFilterArr3;
            }
        }
    }

    @Override // defpackage.k20
    public final boolean L() {
        return this.I;
    }

    @Override // defpackage.k20
    public final void f0(boolean z) {
        if (z) {
            TextView textView = this.G;
            textView.setTransformationMethod(t0(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.k20
    public final void g0(boolean z) {
        this.I = z;
        TextView textView = this.G;
        textView.setTransformationMethod(t0(textView.getTransformationMethod()));
        textView.setFilters(B(textView.getFilters()));
    }

    @Override // defpackage.k20
    public final TransformationMethod t0(TransformationMethod transformationMethod) {
        if (this.I) {
            if (transformationMethod instanceof pt) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new pt(transformationMethod);
        }
        if (transformationMethod instanceof pt) {
            return ((pt) transformationMethod).c;
        }
        return transformationMethod;
    }
}
