package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class dm0 implements em0 {
    public final ScrollFeedbackProvider c;

    public dm0(NestedScrollView nestedScrollView) {
        this.c = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.em0
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.c.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.em0
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.c.onScrollProgress(i, i2, i3, i4);
    }
}
