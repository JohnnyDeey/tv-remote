package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class jf extends ui {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(jf.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public jf(ff ffVar, Throwable th, boolean z) {
        super(th, z);
        this._resumed$volatile = 0;
    }
}
