package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class a20 implements b20 {
    public final InputContentInfo c;

    public a20(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.c = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.b20
    public final ClipDescription b() {
        return this.c.getDescription();
    }

    @Override // defpackage.b20
    public final Object c() {
        return this.c;
    }

    @Override // defpackage.b20
    public final Uri e() {
        return this.c.getContentUri();
    }

    @Override // defpackage.b20
    public final void f() {
        this.c.requestPermission();
    }

    @Override // defpackage.b20
    public final Uri i() {
        return this.c.getLinkUri();
    }

    public a20(Object obj) {
        this.c = (InputContentInfo) obj;
    }
}
