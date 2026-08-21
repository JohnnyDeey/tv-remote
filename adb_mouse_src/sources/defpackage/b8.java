package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import java.util.zip.Adler32;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class b8 implements b20, et0, it0, ft0, rs0, zu {
    public static volatile b8 g;
    public static final Object h = new Object();
    public static b8 i;
    public final /* synthetic */ int c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: Code restructure failed: missing block: B:181:0x02f1, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0518  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.math.BigInteger] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v38, types: [is, gs] */
    /* JADX WARN: Type inference failed for: r6v23, types: [k20] */
    /* JADX WARN: Type inference failed for: r8v5, types: [is, hs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b8(defpackage.rd r22, defpackage.jk0 r23) {
        /*
            Method dump skipped, instructions count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8.<init>(rd, jk0):void");
    }

    public static b8 C(Context context) {
        if (g == null) {
            synchronized (h) {
                try {
                    if (g == null) {
                        g = new b8(context);
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public static b8 J(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new b8(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public static int O(b8 b8Var, int i2, int i3, byte[] bArr, int i4, int i5) {
        int i6 = 0;
        int i7 = 0;
        while (i6 < i3 && i7 < i4) {
            byte b = bArr[i7];
            int i8 = b & 15;
            i7++;
            int i9 = (b & 255) >> 4;
            if (i5 == 2) {
                if (i8 < 15) {
                    ((int[]) b8Var.d)[i2 + i6] = 2 - (i8 - (((i8 * 205) >> 10) * 5));
                    i6++;
                }
                if (i9 < 15 && i6 < i3) {
                    ((int[]) b8Var.d)[i2 + i6] = 2 - (i9 - (((i9 * 205) >> 10) * 5));
                    i6++;
                }
            } else if (i5 == 4) {
                if (i8 < 9) {
                    ((int[]) b8Var.d)[i2 + i6] = 4 - i8;
                    i6++;
                }
                if (i9 < 9 && i6 < i3) {
                    ((int[]) b8Var.d)[i2 + i6] = 4 - i9;
                    i6++;
                }
            }
        }
        return i6;
    }

    public static int P(b8 b8Var, int i2, int i3, byte[] bArr, int i4) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            int i7 = i6 + 3;
            if (i7 > i4) {
                break;
            }
            int i8 = (((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255)) & 8388607;
            if (i8 < 8380417) {
                ((int[]) b8Var.d)[i2 + i5] = i8;
                i5++;
            }
            i6 = i7;
        }
        return i5;
    }

    public static boolean q(Editable editable, KeyEvent keyEvent, boolean z) {
        hw0[] hw0VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (hw0VarArr = (hw0[]) editable.getSpans(selectionStart, selectionEnd, hw0.class)) != null && hw0VarArr.length > 0) {
                for (hw0 hw0Var : hw0VarArr) {
                    int spanStart = editable.getSpanStart(hw0Var);
                    int spanEnd = editable.getSpanEnd(hw0Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Drawable A(int i2) {
        int resourceId;
        Drawable d;
        if (((TypedArray) this.d).hasValue(i2) && (resourceId = ((TypedArray) this.d).getResourceId(i2, 0)) != 0) {
            j6 a = j6.a();
            Context context = (Context) this.f;
            synchronized (a) {
                d = a.a.d(context, resourceId, true);
            }
            return d;
        }
        return null;
    }

    public Typeface B(int i2, int i3, j7 j7Var) {
        int resourceId = ((TypedArray) this.d).getResourceId(i2, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.e) == null) {
                this.e = new TypedValue();
            }
            Context context = (Context) this.f;
            TypedValue typedValue = (TypedValue) this.e;
            ThreadLocal threadLocal = pj0.a;
            if (context.isRestricted()) {
                return null;
            }
            return pj0.a(context, resourceId, typedValue, i3, j7Var, true, false);
        }
        return null;
    }

    public int D(int i2) {
        xg xgVar = (xg) this.e;
        if (i2 >= 0) {
            int childCount = ((fh0) this.d).a.getChildCount();
            int i3 = i2;
            while (i3 < childCount) {
                int b = i2 - (i3 - xgVar.b(i3));
                if (b == 0) {
                    while (xgVar.d(i3)) {
                        i3++;
                    }
                    return i3;
                }
                i3 += b;
            }
            return -1;
        }
        return -1;
    }

    public View E(int i2) {
        return ((fh0) this.d).a.getChildAt(i2);
    }

    public int F() {
        return ((fh0) this.d).a.getChildCount();
    }

    public boolean G(CharSequence charSequence, int i2, int i3, gw0 gw0Var) {
        int i4;
        if ((gw0Var.c & 3) == 0) {
            tn tnVar = (tn) this.f;
            ra0 b = gw0Var.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.d).getShort(a + b.a);
            }
            tnVar.getClass();
            ThreadLocal threadLocal = tn.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            boolean hasGlyph = tnVar.a.hasGlyph(sb.toString());
            int i5 = gw0Var.c & 4;
            if (hasGlyph) {
                i4 = i5 | 2;
            } else {
                i4 = i5 | 1;
            }
            gw0Var.c = i4;
        }
        if ((gw0Var.c & 3) != 2) {
            return false;
        }
        return true;
    }

    public void H(View view) {
        ((ArrayList) this.f).add(view);
        fh0 fh0Var = (fh0) this.d;
        di0 I = RecyclerView.I(view);
        if (I != null) {
            View view2 = I.a;
            RecyclerView recyclerView = fh0Var.a;
            int i2 = I.q;
            if (i2 != -1) {
                I.p = i2;
            } else {
                WeakHashMap weakHashMap = ry0.a;
                I.p = view2.getImportantForAccessibility();
            }
            if (recyclerView.L()) {
                I.q = 4;
                recyclerView.u0.add(I);
            } else {
                WeakHashMap weakHashMap2 = ry0.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean I(int i2, rj rjVar, ak akVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        gd gdVar = (gd) this.e;
        int[] iArr = akVar.p0;
        int[] iArr2 = akVar.t;
        gdVar.a = iArr[0];
        gdVar.b = iArr[1];
        gdVar.c = akVar.q();
        gdVar.d = akVar.k();
        gdVar.i = false;
        gdVar.j = i2;
        if (gdVar.a == 3) {
            z = true;
        } else {
            z = false;
        }
        if (gdVar.b == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && akVar.W > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && akVar.W > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && iArr2[0] == 4) {
            gdVar.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            gdVar.b = 1;
        }
        rjVar.c(akVar, gdVar);
        akVar.O(gdVar.e);
        akVar.L(gdVar.f);
        akVar.E = gdVar.h;
        akVar.I(gdVar.g);
        gdVar.j = 0;
        return gdVar.i;
    }

    public void K(int i2, byte[] bArr) {
        byte[] bArr2 = new byte[8];
        int i3 = ((rj) this.e).d;
        if (i3 == 2) {
            for (int i4 = 0; i4 < 32; i4++) {
                int i5 = i4 * 8;
                int[] iArr = (int[]) this.d;
                byte b = (byte) (i3 - iArr[i5]);
                bArr2[0] = b;
                byte b2 = (byte) (i3 - iArr[i5 + 1]);
                bArr2[1] = b2;
                byte b3 = (byte) (i3 - iArr[i5 + 2]);
                bArr2[2] = b3;
                bArr2[3] = (byte) (i3 - iArr[i5 + 3]);
                bArr2[4] = (byte) (i3 - iArr[i5 + 4]);
                bArr2[5] = (byte) (i3 - iArr[i5 + 5]);
                bArr2[6] = (byte) (i3 - iArr[i5 + 6]);
                bArr2[7] = (byte) (i3 - iArr[i5 + 7]);
                int i6 = (i4 * 3) + i2;
                bArr[i6] = (byte) ((b2 << 3) | b | (b3 << 6));
                bArr[i6 + 1] = (byte) ((bArr2[2] >> 2) | (bArr2[3] << 1) | (bArr2[4] << 4) | (bArr2[5] << 7));
                bArr[i6 + 2] = (byte) ((bArr2[5] >> 1) | (bArr2[6] << 2) | (bArr2[7] << 5));
            }
            return;
        }
        if (i3 == 4) {
            for (int i7 = 0; i7 < 128; i7++) {
                int i8 = i7 * 2;
                int[] iArr2 = (int[]) this.d;
                byte b4 = (byte) (i3 - iArr2[i8]);
                bArr2[0] = b4;
                byte b5 = (byte) (i3 - iArr2[i8 + 1]);
                bArr2[1] = b5;
                bArr[i2 + i7] = (byte) ((b5 << 4) | b4);
            }
            return;
        }
        f40.f("Eta needs to be 2 or 4!");
    }

    public void L(int i2, byte[] bArr) {
        int i3 = ((rj) this.e).d;
        int i4 = 0;
        if (i3 == 2) {
            while (i4 < 32) {
                int i5 = (i4 * 3) + i2;
                int i6 = i4 * 8;
                byte b = bArr[i5];
                int[] iArr = (int[]) this.d;
                iArr[i6] = b & 7;
                int i7 = i6 + 1;
                int i8 = b & 255;
                iArr[i7] = (i8 >> 3) & 7;
                int i9 = i6 + 2;
                int i10 = bArr[i5 + 1] & 255;
                iArr[i9] = (i8 >> 6) | ((i10 << 2) & 7);
                int i11 = i6 + 3;
                iArr[i11] = (i10 >> 1) & 7;
                int i12 = i6 + 4;
                iArr[i12] = (i10 >> 4) & 7;
                int i13 = i6 + 5;
                int i14 = bArr[i5 + 2] & 255;
                iArr[i13] = (i10 >> 7) | ((i14 << 1) & 7);
                int i15 = i6 + 6;
                iArr[i15] = (i14 >> 2) & 7;
                int i16 = i6 + 7;
                iArr[i16] = (i14 >> 5) & 7;
                iArr[i6] = i3 - iArr[i6];
                iArr[i7] = i3 - iArr[i7];
                iArr[i9] = i3 - iArr[i9];
                iArr[i11] = i3 - iArr[i11];
                iArr[i12] = i3 - iArr[i12];
                iArr[i13] = i3 - iArr[i13];
                iArr[i15] = i3 - iArr[i15];
                iArr[i16] = i3 - iArr[i16];
                i4++;
            }
            return;
        }
        if (i3 == 4) {
            while (i4 < 128) {
                int i17 = i4 * 2;
                byte b2 = bArr[i2 + i4];
                int[] iArr2 = (int[]) this.d;
                iArr2[i17] = b2 & 15;
                int i18 = i17 + 1;
                iArr2[i18] = (b2 & 255) >> 4;
                iArr2[i17] = i3 - iArr2[i17];
                iArr2[i18] = i3 - iArr2[i18];
                i4++;
            }
        }
    }

    public Object M(CharSequence charSequence, int i2, int i3, int i4, boolean z, jt jtVar) {
        int i5;
        ta0 ta0Var;
        char c;
        kt ktVar = new kt((ta0) ((l3) this.e).e);
        int codePointAt = Character.codePointAt(charSequence, i2);
        int i6 = 0;
        boolean z2 = true;
        int i7 = i2;
        loop0: while (true) {
            i5 = i7;
            while (i7 < i3 && i6 < i4 && z2) {
                SparseArray sparseArray = ktVar.c.a;
                if (sparseArray == null) {
                    ta0Var = null;
                } else {
                    ta0Var = (ta0) sparseArray.get(codePointAt);
                }
                if (ktVar.a != 2) {
                    if (ta0Var == null) {
                        ktVar.a();
                        c = 1;
                    } else {
                        ktVar.a = 2;
                        ktVar.c = ta0Var;
                        ktVar.f = 1;
                        c = 2;
                    }
                } else {
                    if (ta0Var != null) {
                        ktVar.c = ta0Var;
                        ktVar.f++;
                    } else {
                        if (codePointAt == 65038) {
                            ktVar.a();
                        } else if (codePointAt != 65039) {
                            ta0 ta0Var2 = ktVar.c;
                            if (ta0Var2.b != null) {
                                if (ktVar.f == 1) {
                                    if (ktVar.b()) {
                                        ktVar.d = ktVar.c;
                                        ktVar.a();
                                    } else {
                                        ktVar.a();
                                    }
                                } else {
                                    ktVar.d = ta0Var2;
                                    ktVar.a();
                                }
                                c = 3;
                            } else {
                                ktVar.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                }
                ktVar.e = codePointAt;
                if (c != 1) {
                    if (c != 2) {
                        if (c == 3) {
                            if (z || !G(charSequence, i5, i7, ktVar.d.b)) {
                                z2 = jtVar.d(charSequence, i5, i7, ktVar.d.b);
                                i6++;
                            }
                        }
                    } else {
                        int charCount = Character.charCount(codePointAt) + i7;
                        if (charCount < i3) {
                            codePointAt = Character.codePointAt(charSequence, charCount);
                        }
                        i7 = charCount;
                    }
                } else {
                    i7 = Character.charCount(Character.codePointAt(charSequence, i5)) + i5;
                    if (i7 < i3) {
                        codePointAt = Character.codePointAt(charSequence, i7);
                    }
                }
            }
        }
        if (ktVar.a == 2 && ktVar.c.b != null && ((ktVar.f > 1 || ktVar.b()) && i6 < i4 && z2 && (z || !G(charSequence, i5, i7, ktVar.c.b)))) {
            jtVar.d(charSequence, i5, i7, ktVar.c.b);
        }
        return jtVar.b();
    }

    public void N() {
        ((TypedArray) this.d).recycle();
    }

    public void Q(ca caVar, int i2, boolean z) {
        Long l;
        aa aaVar = (aa) this.e;
        Context context = (Context) this.f;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = caVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        af0 af0Var = caVar.c;
        adler32.update(allocate.putInt(cf0.a(af0Var)).array());
        byte[] bArr = caVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        wv0.v("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", caVar);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((fl0) this.d).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(cf0.a(af0Var))});
        try {
            if (rawQuery.moveToNext()) {
                l = Long.valueOf(rawQuery.getLong(0));
            } else {
                l = 0L;
            }
            rawQuery.close();
            long longValue = l.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aaVar.a(af0Var, longValue, i2));
            Set set = ((ba) aaVar.b.get(af0Var)).c;
            if (set.contains(zl0.c)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(zl0.e)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(zl0.d)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i2);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", cf0.a(af0Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {caVar, Integer.valueOf(value), Long.valueOf(aaVar.a(af0Var, longValue, i2)), l, Integer.valueOf(i2)};
            String D = wv0.D("JobInfoScheduler");
            if (Log.isLoggable(D, 3)) {
                Log.d(D, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, i6] */
    public void R(s9 s9Var) {
        f40 f40Var = new f40(17);
        lu0 lu0Var = (lu0) this.f;
        ca caVar = (ca) this.d;
        bu buVar = (bu) this.e;
        io ioVar = lu0Var.c;
        b8 a = ca.a();
        a.S(caVar.a);
        a.f = af0.c;
        a.e = caVar.b;
        ca o = a.o();
        ?? obj = new Object();
        obj.f = new HashMap();
        obj.d = Long.valueOf(lu0Var.a.d());
        obj.e = Long.valueOf(lu0Var.b.d());
        obj.a = "PLAY_BILLING_LIBRARY";
        obj.c = new yt(buVar, s9Var.a.b());
        obj.b = null;
        ioVar.b.execute(new fo(ioVar, o, f40Var, obj.c()));
    }

    public void S(String str) {
        if (str != null) {
            this.d = str;
        } else {
            c.g("Null backendName");
        }
    }

    public void T(bk bkVar, int i2, int i3, int i4) {
        bkVar.getClass();
        int i5 = bkVar.b0;
        int i6 = bkVar.c0;
        bkVar.b0 = 0;
        bkVar.c0 = 0;
        bkVar.O(i3);
        bkVar.L(i4);
        if (i5 < 0) {
            bkVar.b0 = 0;
        } else {
            bkVar.b0 = i5;
        }
        if (i6 < 0) {
            bkVar.c0 = 0;
        } else {
            bkVar.c0 = i6;
        }
        bk bkVar2 = (bk) this.f;
        bkVar2.t0 = i2;
        bkVar2.U();
    }

    public void U(View view) {
        if (((ArrayList) this.f).remove(view)) {
            fh0 fh0Var = (fh0) this.d;
            di0 I = RecyclerView.I(view);
            if (I != null) {
                RecyclerView recyclerView = fh0Var.a;
                int i2 = I.p;
                if (recyclerView.L()) {
                    I.q = i2;
                    recyclerView.u0.add(I);
                } else {
                    View view2 = I.a;
                    WeakHashMap weakHashMap = ry0.a;
                    view2.setImportantForAccessibility(i2);
                }
                I.p = 0;
            }
        }
    }

    public void V(short s, byte[] bArr) {
        int i2;
        jp0 jp0Var = (jp0) this.f;
        int i3 = ((rj) this.e).d;
        if (i3 == 2) {
            jp0Var.getClass();
            i2 = 1;
        } else if (i3 == 4) {
            jp0Var.getClass();
            i2 = 2;
        } else {
            f40.f("Wrong Dilithium Eta!");
            return;
        }
        jp0Var.getClass();
        ik0 ik0Var = (ik0) jp0Var.e;
        int i4 = i2 * 136;
        byte[] bArr2 = new byte[i4];
        ik0Var.i(ik0Var.e);
        ik0Var.update(bArr, 0, bArr.length);
        ik0Var.update(new byte[]{(byte) s, (byte) (s >> 8)}, 0, 2);
        ik0Var.l(bArr2, 0, i4);
        int O = O(this, 0, 256, bArr2, i4, i3);
        while (O < 256) {
            ik0Var.l(bArr2, 0, 136);
            O += O(this, O, 256 - O, bArr2, 136, i3);
        }
    }

    public void W(bk bkVar) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.clear();
        int size = bkVar.q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ak akVar = (ak) bkVar.q0.get(i2);
            int[] iArr = akVar.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(akVar);
            }
        }
        bkVar.s0.b = true;
    }

    public void X(Throwable th) {
        boolean z = th instanceof TimeoutException;
        n61 n61Var = (n61) this.f;
        if (z) {
            n61Var.D(102, 28, v61.p);
            m51.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            n61Var.D(95, 28, v61.p);
            m51.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((gj0) this.e).run();
    }

    @Override // defpackage.ft0
    public ho0 a() {
        return (ho0) this.e;
    }

    @Override // defpackage.b20
    public ClipDescription b() {
        return (ClipDescription) this.e;
    }

    @Override // defpackage.b20
    public Object c() {
        return null;
    }

    @Override // defpackage.et0
    public byte[] d(go0 go0Var, byte[] bArr) {
        try {
            try {
                rd rdVar = (rd) this.d;
                if (((Signature) this.f) == null) {
                    Signature n = ((sb0) rdVar.c).n("NoneWithRSA");
                    this.f = n;
                    n.initSign((PrivateKey) this.e, (SecureRandom) rdVar.d);
                }
                Signature signature = (Signature) this.f;
                if (go0Var != null) {
                    if (go0Var.b == 1) {
                        k4 k4Var = new k4(ht0.t(go0Var.a), im.c);
                        byte[] e = f20.e(bArr);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        new nm(k4Var, new t(e)).j(new v(byteArrayOutputStream), true);
                        bArr = byteArrayOutputStream.toByteArray();
                    } else {
                        throw new IllegalStateException("Invalid algorithm: " + go0Var);
                    }
                }
                signature.update(bArr, 0, bArr.length);
                byte[] sign = signature.sign();
                this.f = null;
                return sign;
            } catch (GeneralSecurityException e2) {
                throw new us0((short) 80, null, e2);
            }
        } catch (Throwable th) {
            this.f = null;
            throw th;
        }
    }

    @Override // defpackage.b20
    public Uri e() {
        return (Uri) this.d;
    }

    @Override // defpackage.ft0
    public boolean g() {
        try {
            return ((Signature) this.d).verify((byte[]) this.f);
        } catch (SignatureException e) {
            f40.a(80, e, null);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [xh, java.lang.Object] */
    @Override // defpackage.yf0
    public Object get() {
        switch (this.c) {
            case 21:
                return new b8((Context) ((yf0) this.d).get(), (fl0) ((yf0) this.e).get(), (aa) ((g00) this.f).get(), 14, false);
            default:
                return new lu0(new Object(), new g00(18), (io) ((rd) this.d).get(), (cx0) ((vt0) this.e).get(), (l3) ((l3) this.f).get());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if ("SunMSCAPI".equals(r7.getName()) != false) goto L17;
     */
    @Override // defpackage.et0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.u20 h(defpackage.go0 r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.e
            java.security.PrivateKey r0 = (java.security.PrivateKey) r0
            java.lang.Object r1 = r7.d
            rd r1 = (defpackage.rd) r1
            r2 = 0
            if (r8 == 0) goto L50
            short r3 = r8.b
            r4 = 1
            if (r4 != r3) goto L50
            java.lang.String r3 = "SunMSCAPI"
            java.security.Provider r5 = java.security.Security.getProvider(r3)
            if (r5 == 0) goto L50
            java.lang.Object r5 = r7.f     // Catch: java.security.GeneralSecurityException -> L47
            java.security.Signature r5 = (java.security.Signature) r5     // Catch: java.security.GeneralSecurityException -> L47
            if (r5 != 0) goto L31
            java.lang.Object r5 = r1.c     // Catch: java.security.GeneralSecurityException -> L47
            sb0 r5 = (defpackage.sb0) r5     // Catch: java.security.GeneralSecurityException -> L47
            java.lang.String r6 = "NoneWithRSA"
            java.security.Signature r5 = r5.n(r6)     // Catch: java.security.GeneralSecurityException -> L47
            r7.f = r5     // Catch: java.security.GeneralSecurityException -> L47
            java.lang.Object r6 = r1.d     // Catch: java.security.GeneralSecurityException -> L47
            java.security.SecureRandom r6 = (java.security.SecureRandom) r6     // Catch: java.security.GeneralSecurityException -> L47
            r5.initSign(r0, r6)     // Catch: java.security.GeneralSecurityException -> L47
        L31:
            java.lang.Object r7 = r7.f     // Catch: java.security.GeneralSecurityException -> L47
            java.security.Signature r7 = (java.security.Signature) r7     // Catch: java.security.GeneralSecurityException -> L47
            java.security.Provider r7 = r7.getProvider()     // Catch: java.security.GeneralSecurityException -> L47
            if (r7 == 0) goto L46
            java.lang.String r7 = r7.getName()     // Catch: java.security.GeneralSecurityException -> L47
            boolean r7 = r3.equals(r7)     // Catch: java.security.GeneralSecurityException -> L47
            if (r7 == 0) goto L46
            goto L47
        L46:
            return r2
        L47:
            java.lang.String r7 = defpackage.r21.v(r8)
            u20 r7 = r1.u(r7, r2, r0, r4)
            return r7
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8.h(go0):u20");
    }

    @Override // defpackage.b20
    public Uri i() {
        return (Uri) this.f;
    }

    @Override // defpackage.rs0
    public fs0 j() {
        return new g30(1, this);
    }

    @Override // defpackage.it0
    public boolean k(r6 r6Var, byte[] bArr) {
        go0 go0Var = (go0) r6Var.d;
        try {
            if (((Signature) this.f) == null) {
                Signature n = ((sb0) ((rd) this.d).c).n("NoneWithRSA");
                this.f = n;
                n.initVerify((PublicKey) this.e);
            }
            Signature signature = (Signature) this.f;
            if (go0Var != null) {
                if (go0Var.b == 1) {
                    k4 k4Var = new k4(ht0.t(go0Var.a), im.c);
                    byte[] e = f20.e(bArr);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    new nm(k4Var, new t(e)).j(new v(byteArrayOutputStream), true);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    signature.update(byteArray, 0, byteArray.length);
                } else {
                    throw new IllegalStateException("Invalid algorithm: " + go0Var);
                }
            } else {
                signature.update(bArr, 0, bArr.length);
            }
            return signature.verify((byte[]) r6Var.e);
        } catch (GeneralSecurityException e2) {
            f40.j("unable to process signature: ", e2.getMessage(), e2);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if ("SunMSCAPI".equals(r7.getName()) != false) goto L15;
     */
    @Override // defpackage.it0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ft0 l(defpackage.r6 r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.e
            java.security.PublicKey r0 = (java.security.PublicKey) r0
            java.lang.Object r1 = r7.d
            rd r1 = (defpackage.rd) r1
            java.lang.Object r2 = r8.d
            go0 r2 = (defpackage.go0) r2
            r3 = 0
            if (r2 == 0) goto L55
            short r4 = r2.b
            r5 = 1
            if (r4 != r5) goto L55
            java.lang.String r4 = "SunMSCAPI"
            java.security.Provider r5 = java.security.Security.getProvider(r4)
            if (r5 == 0) goto L55
            java.lang.Object r5 = r7.f     // Catch: java.security.GeneralSecurityException -> L45
            java.security.Signature r5 = (java.security.Signature) r5     // Catch: java.security.GeneralSecurityException -> L45
            if (r5 != 0) goto L31
            java.lang.Object r5 = r1.c     // Catch: java.security.GeneralSecurityException -> L45
            sb0 r5 = (defpackage.sb0) r5     // Catch: java.security.GeneralSecurityException -> L45
            java.lang.String r6 = "NoneWithRSA"
            java.security.Signature r5 = r5.n(r6)     // Catch: java.security.GeneralSecurityException -> L45
            r7.f = r5     // Catch: java.security.GeneralSecurityException -> L45
            r5.initVerify(r0)     // Catch: java.security.GeneralSecurityException -> L45
        L31:
            java.lang.Object r7 = r7.f     // Catch: java.security.GeneralSecurityException -> L45
            java.security.Signature r7 = (java.security.Signature) r7     // Catch: java.security.GeneralSecurityException -> L45
            java.security.Provider r7 = r7.getProvider()     // Catch: java.security.GeneralSecurityException -> L45
            if (r7 == 0) goto L55
            java.lang.String r7 = r7.getName()     // Catch: java.security.GeneralSecurityException -> L45
            boolean r7 = r4.equals(r7)     // Catch: java.security.GeneralSecurityException -> L45
            if (r7 == 0) goto L55
        L45:
            r1.getClass()
            java.lang.String r7 = defpackage.r21.v(r2)
            java.lang.Object r8 = r8.e
            byte[] r8 = (byte[]) r8
            b8 r7 = r1.v(r7, r3, r8, r0)
            return r7
        L55:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8.l(r6):ft0");
    }

    public void m(View view, int i2, boolean z) {
        int D;
        RecyclerView recyclerView = ((fh0) this.d).a;
        if (i2 < 0) {
            D = recyclerView.getChildCount();
        } else {
            D = D(i2);
        }
        ((xg) this.e).e(D, z);
        if (z) {
            H(view);
        }
        recyclerView.addView(view, D);
        RecyclerView.I(view);
    }

    public void n(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        int D;
        RecyclerView recyclerView = ((fh0) this.d).a;
        if (i2 < 0) {
            D = recyclerView.getChildCount();
        } else {
            D = D(i2);
        }
        ((xg) this.e).e(D, z);
        if (z) {
            H(view);
        }
        di0 I = RecyclerView.I(view);
        if (I != null) {
            if (!I.j() && !I.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I + recyclerView.y());
            }
            I.j &= -257;
        }
        recyclerView.attachViewToParent(view, D, layoutParams);
    }

    public ca o() {
        String str;
        if (((String) this.d) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((af0) this.f) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new ca((String) this.d, (byte[]) this.e, (af0) this.f);
        }
        c.o("Missing required properties:".concat(str));
        return null;
    }

    public ls p(byte[] bArr) {
        ls g2;
        is isVar = (is) this.f;
        int f = (isVar.f() + 7) / 8;
        byte b = bArr[0];
        boolean z = true;
        if (b != 0) {
            if (b != 2 && b != 3) {
                if (b != 4) {
                    if (b != 6 && b != 7) {
                        c.j(Integer.toString(b, 16), "Invalid point encoding 0x");
                        return null;
                    }
                    if (bArr.length == (f * 2) + 1) {
                        BigInteger d = kd.d(bArr, 1, f);
                        BigInteger d2 = kd.d(bArr, f + 1, f);
                        boolean testBit = d2.testBit(0);
                        if (b != 7) {
                            z = false;
                        }
                        if (testBit == z) {
                            g2 = isVar.a(d, d2);
                            if (!g2.g(false)) {
                                c.k("Invalid point coordinates");
                                return null;
                            }
                        } else {
                            c.k("Inconsistent Y coordinate in hybrid encoding");
                            return null;
                        }
                    } else {
                        c.k("Incorrect length for hybrid encoding");
                        return null;
                    }
                } else if (bArr.length == (f * 2) + 1) {
                    g2 = isVar.a(kd.d(bArr, 1, f), kd.d(bArr, f + 1, f));
                    if (!g2.g(false)) {
                        c.k("Invalid point coordinates");
                        return null;
                    }
                } else {
                    c.k("Incorrect length for uncompressed encoding");
                    return null;
                }
            } else if (bArr.length == f + 1) {
                g2 = isVar.c(b & 1, kd.d(bArr, 1, f));
                if (!g2.g(true)) {
                    c.k("Invalid point");
                    return null;
                }
            } else {
                c.k("Incorrect length for compressed encoding");
                return null;
            }
        } else if (bArr.length == 1) {
            g2 = isVar.g();
        } else {
            c.k("Incorrect length for infinity encoding");
            return null;
        }
        if (b != 0 && g2.h()) {
            c.k("Invalid infinity encoding");
            return null;
        }
        return g2;
    }

    public void r(int i2) {
        di0 I;
        int D = D(i2);
        ((xg) this.e).f(D);
        RecyclerView recyclerView = ((fh0) this.d).a;
        View childAt = recyclerView.getChildAt(D);
        if (childAt != null && (I = RecyclerView.I(childAt)) != null) {
            if (I.j() && !I.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + I + recyclerView.y());
            }
            I.a(256);
        }
        recyclerView.detachViewFromParent(D);
    }

    public void s(Bundle bundle) {
        HashSet hashSet = (HashSet) this.e;
        String string = ((Context) this.f).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (x10.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    t((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Object t(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.d;
        if (wg0.r()) {
            try {
                wg0.a(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                try {
                    x10 x10Var = (x10) cls.getDeclaredConstructor(null).newInstance(null);
                    List<Class> a = x10Var.a();
                    if (!a.isEmpty()) {
                        for (Class cls2 : a) {
                            if (!hashMap.containsKey(cls2)) {
                                t(cls2, hashSet);
                            }
                        }
                    }
                    obj = x10Var.b((Context) this.f);
                    hashSet.remove(cls);
                    hashMap.put(cls, obj);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            } else {
                obj = hashMap.get(cls);
            }
            return obj;
        }
        throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
    }

    public String toString() {
        switch (this.c) {
            case 5:
                return ((xg) this.e).toString() + ", hidden list:" + ((ArrayList) this.f).size();
            case 18:
                StringBuilder sb = new StringBuilder("[");
                int i2 = 0;
                while (true) {
                    int[] iArr = (int[]) this.d;
                    if (i2 < iArr.length) {
                        sb.append(iArr[i2]);
                        if (i2 != ((int[]) this.d).length - 1) {
                            sb.append(", ");
                        }
                        i2++;
                    } else {
                        sb.append("]");
                        return sb.toString();
                    }
                }
            case 27:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.d);
                sb2.append('{');
                jp0 jp0Var = (jp0) ((jp0) this.e).e;
                String str = "";
                while (jp0Var != null) {
                    Object obj = jp0Var.d;
                    sb2.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    jp0Var = (jp0) jp0Var.e;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(wh whVar, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.d;
        uf0 uf0Var = new uf0(byteArrayOutputStream, hashMap, (HashMap) this.e, (vc0) this.f);
        vc0 vc0Var = (vc0) hashMap.get(wh.class);
        if (vc0Var != null) {
            vc0Var.a(whVar, uf0Var);
        } else {
            throw new RuntimeException("No encoder for " + wh.class);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c10, java.lang.Object] */
    public c10 v(i81 i81Var) {
        gk0 gk0Var = (gk0) this.d;
        byte[] bArr = (byte[]) this.f;
        byte[] bArr2 = (byte[]) this.e;
        ?? obj = new Object();
        if (256 <= ((Integer) ex0.a.get("SHA-512")).intValue()) {
            i81Var.getClass();
            obj.a = gk0Var;
            obj.e = i81Var;
            obj.f = 256;
            int intValue = ((Integer) c10.i.get("SHA-512")).intValue();
            obj.g = intValue;
            byte[] t = i81Var.t();
            if (t.length >= (256 + 7) / 8) {
                byte[] a = ex0.a(gk0Var, f20.i(t, bArr2, bArr), intValue);
                obj.b = a;
                byte[] bArr3 = new byte[a.length + 1];
                System.arraycopy(a, 0, bArr3, 1, a.length);
                obj.c = ex0.a(gk0Var, bArr3, intValue);
                obj.d = 1L;
                return obj;
            }
            c.o("Insufficient entropy provided by entropy source");
            return null;
        }
        c.k("Requested security strength is not supported by the derivation function");
        return null;
    }

    public View w(int i2) {
        return ((fh0) this.d).a.getChildAt(D(i2));
    }

    public int x() {
        return ((fh0) this.d).a.getChildCount() - ((ArrayList) this.f).size();
    }

    public ColorStateList y(int i2) {
        int resourceId;
        ColorStateList q;
        TypedArray typedArray = (TypedArray) this.d;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0 && (q = mn.q((Context) this.f, resourceId)) != null) {
            return q;
        }
        return typedArray.getColorStateList(i2);
    }

    public Drawable z(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.d;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0) {
            return r21.r((Context) this.f, resourceId);
        }
        return typedArray.getDrawable(i2);
    }

    @Override // defpackage.b20
    public void f() {
    }

    public /* synthetic */ b8(int i2) {
        this.c = i2;
    }

    public b8(rd rdVar, PrivateKey privateKey) {
        this.c = 10;
        this.f = null;
        if (privateKey == null) {
            c.g("privateKey");
            throw null;
        }
        this.d = rdVar;
        this.e = privateKey;
    }

    public b8(rd rdVar, PublicKey publicKey) {
        this.c = 11;
        this.f = null;
        if (rdVar == null) {
            c.g("crypto");
            throw null;
        }
        if (publicKey == null) {
            c.g("publicKey");
            throw null;
        }
        this.d = rdVar;
        this.e = publicKey;
    }

    public b8(rj rjVar) {
        this.c = 18;
        this.d = new int[256];
        this.e = rjVar;
        jp0 jp0Var = (jp0) rjVar.h;
        this.f = jp0Var;
        jp0Var.getClass();
    }

    public /* synthetic */ b8(Object obj, Object obj2, Object obj3, int i2) {
        this.c = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ b8(Object obj, Object obj2, Object obj3, int i2, boolean z) {
        this.c = i2;
        this.f = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public b8(Signature signature, byte[] bArr) {
        this.c = 12;
        this.d = signature;
        ho0 ho0Var = new ho0();
        ho0Var.d = signature;
        this.e = ho0Var;
        this.f = bArr;
    }

    public b8(String str) {
        this.c = 27;
        jp0 jp0Var = new jp0(11, false);
        this.e = jp0Var;
        this.f = jp0Var;
        this.d = str;
    }

    public b8(ca caVar, bu buVar, os osVar, lu0 lu0Var) {
        this.c = 24;
        this.d = caVar;
        this.e = buVar;
        this.f = lu0Var;
    }

    public b8(fh0 fh0Var) {
        this.c = 5;
        this.d = fh0Var;
        this.e = new xg();
        this.f = new ArrayList();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x010e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c3  */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Throwable, android.graphics.Bitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b8(defpackage.hc0 r30) {
        /*
            Method dump skipped, instructions count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8.<init>(hc0):void");
    }

    public b8(Context context, TypedArray typedArray) {
        this.c = 22;
        this.f = context;
        this.d = typedArray;
    }

    public b8(Runnable runnable) {
        this.c = 15;
        this.f = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.e = runnable;
    }

    public b8(Context context, LocationManager locationManager) {
        this.c = 26;
        this.e = new Object();
        this.f = context;
        this.d = locationManager;
    }

    public b8(Context context) {
        this.c = 0;
        this.f = context.getApplicationContext();
        this.e = new HashSet();
        this.d = new HashMap();
    }

    public b8(bk bkVar) {
        this.c = 2;
        this.d = new ArrayList();
        this.e = new Object();
        this.f = bkVar;
    }

    public b8(l3 l3Var, g00 g00Var, tn tnVar, Set set) {
        this.c = 8;
        this.d = g00Var;
        this.e = l3Var;
        this.f = tnVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            M(str, 0, str.length(), 1, true, new ce(str, 1));
        }
    }
}
