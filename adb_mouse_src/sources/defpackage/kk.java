package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class kk implements jk, lk {
    public final /* synthetic */ int c = 0;
    public ClipData d;
    public int e;
    public int f;
    public Uri g;
    public Bundle h;

    public kk(kk kkVar) {
        ClipData clipData = kkVar.d;
        clipData.getClass();
        this.d = clipData;
        int i = kkVar.e;
        if (i >= 0) {
            if (i <= 5) {
                this.e = i;
                int i2 = kkVar.f;
                if ((i2 & 1) == i2) {
                    this.f = i2;
                    this.g = kkVar.g;
                    this.h = kkVar.h;
                    return;
                }
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
            Locale locale = Locale.US;
            c.k("source is out of range of [0, 5] (too high)");
            throw null;
        }
        Locale locale2 = Locale.US;
        c.k("source is out of range of [0, 5] (too low)");
        throw null;
    }

    @Override // defpackage.lk
    public ClipData b() {
        return this.d;
    }

    @Override // defpackage.jk
    public mk build() {
        return new mk(new kk(this));
    }

    @Override // defpackage.lk
    public int h() {
        return this.f;
    }

    @Override // defpackage.lk
    public ContentInfo i() {
        return null;
    }

    @Override // defpackage.jk
    public void m(Uri uri) {
        this.g = uri;
    }

    @Override // defpackage.lk
    public int n() {
        return this.e;
    }

    @Override // defpackage.jk
    public void q(int i) {
        this.f = i;
    }

    @Override // defpackage.jk
    public void setExtras(Bundle bundle) {
        this.h = bundle;
    }

    public String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.c) {
            case 1:
                Uri uri = this.g;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.d.getDescription());
                sb.append(", source=");
                int i = this.e;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        str = String.valueOf(i);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb.append(str);
                sb.append(", flags=");
                int i2 = this.f;
                if ((i2 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i2);
                }
                sb.append(valueOf);
                String str3 = "";
                if (uri == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str2);
                if (this.h != null) {
                    str3 = ", hasExtras";
                }
                return qo0.s(sb, str3, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ kk() {
    }
}
