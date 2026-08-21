package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class yg extends mi0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yg(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.mi0
    public final void I(int i) {
        switch (this.d) {
            case 0:
                return;
            default:
                kr0 kr0Var = (kr0) this.e;
                kr0Var.d = true;
                bh bhVar = (bh) kr0Var.e.get();
                if (bhVar != null) {
                    bhVar.A();
                    bhVar.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.mi0
    public final void J(Typeface typeface, boolean z) {
        CharSequence text;
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                bh bhVar = chip.g;
                if (bhVar.N0) {
                    text = bhVar.P;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z) {
                    kr0 kr0Var = (kr0) obj;
                    kr0Var.d = true;
                    bh bhVar2 = (bh) kr0Var.e.get();
                    if (bhVar2 != null) {
                        bhVar2.A();
                        bhVar2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void k0(int i) {
    }
}
