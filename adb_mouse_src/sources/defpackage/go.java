package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.a;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class go implements tq0, dl0, ke0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ go(fl0 fl0Var, Object obj, ca caVar, int i) {
        this.c = i;
        this.f = fl0Var;
        this.d = obj;
        this.e = caVar;
    }

    @Override // defpackage.tq0
    public Object a() {
        io ioVar = (io) this.f;
        ca caVar = (ca) this.e;
        t9 t9Var = (t9) this.d;
        fl0 fl0Var = ioVar.d;
        fl0Var.getClass();
        af0 af0Var = caVar.c;
        String str = t9Var.a;
        String str2 = caVar.a;
        String D = wv0.D("SQLiteEventStore");
        if (Log.isLoggable(D, 3)) {
            Log.d(D, "Storing event with priority=" + af0Var + ", name=" + str + " for destination " + str2);
        }
        ((Long) fl0Var.c(new go(fl0Var, (Object) t9Var, caVar, 1))).getClass();
        ioVar.a.Q(caVar, 1, false);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, i6] */
    @Override // defpackage.dl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go.apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ke0
    public void c(Preference preference) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        ln0 ln0Var = (ln0) this.f;
        EditTextPreference editTextPreference = (EditTextPreference) this.e;
        i81 i81Var = (i81) this.d;
        qk qkVar = null;
        View inflate = View.inflate(ln0Var.h(), R.layout.ip_search_dialog, null);
        View findViewById = inflate.findViewById(R.id.ip_search_progress_bar);
        TextView textView = (TextView) inflate.findViewById(R.id.ip_search_scanning_text);
        View findViewById2 = inflate.findViewById(R.id.ip_search_found_header);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ip_search_found_container);
        Context h = ln0Var.h();
        h.getClass();
        f61 f61Var = new f61(h);
        String l = ln0Var.l(R.string.automatic_search);
        f4 f4Var = (f4) f61Var.d;
        f4Var.d = l;
        f4Var.p = inflate;
        f61Var.c();
        f4Var.k = false;
        j4 f = f61Var.f();
        ArrayList arrayList = new ArrayList();
        a aVar = ln0Var.P;
        aVar.getClass();
        AtomicReference atomicReference = aVar.a;
        loop0: while (true) {
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl == null) {
                l30 l30Var = new l30();
                ho hoVar = yq.a;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(aVar, wv0.Q(l30Var, p80.a.g));
                while (!atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                ho hoVar2 = yq.a;
                r21.D(lifecycleCoroutineScopeImpl, p80.a.g, new zp(lifecycleCoroutineScopeImpl, qkVar, 2), 2);
                break loop0;
            }
            break;
        }
        final mp0 D = r21.D(lifecycleCoroutineScopeImpl, null, new kn0(ln0Var, findViewById, textView, i81Var, arrayList, editTextPreference, findViewById2, linearLayout, f, null), 3);
        f.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: gn0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                mp0.this.j(null);
            }
        });
    }

    public /* synthetic */ go(Object obj, Object obj2, Object obj3, int i) {
        this.c = i;
        this.f = obj;
        this.e = obj2;
        this.d = obj3;
    }
}
