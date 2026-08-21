package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class eq {
    public final Executor a;
    public final mf0 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public fq[] g;
    public byte[] h;

    public eq(AssetManager assetManager, Executor executor, mf0 mf0Var, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = mf0Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            bArr = k20.q;
        } else {
            switch (i) {
                case 24:
                case 25:
                    bArr = k20.u;
                    break;
                case 26:
                    bArr = k20.t;
                    break;
                case 27:
                    bArr = k20.s;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = k20.r;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.b.f();
                return null;
            }
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.a.execute(new Runnable() { // from class: dq
            @Override // java.lang.Runnable
            public final void run() {
                eq.this.b.h(i, serializable);
            }
        });
    }
}
