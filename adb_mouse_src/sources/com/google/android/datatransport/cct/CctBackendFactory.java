package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import defpackage.ku0;
import defpackage.ql;
import defpackage.r9;
import defpackage.uf;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
@Keep
/* loaded from: classes.dex */
public class CctBackendFactory {
    public ku0 create(ql qlVar) {
        Context context = ((r9) qlVar).a;
        r9 r9Var = (r9) qlVar;
        return new uf(context, r9Var.b, r9Var.c);
    }
}
