package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class zg extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public zg(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        bh bhVar = this.a.g;
        if (bhVar != null) {
            bhVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
