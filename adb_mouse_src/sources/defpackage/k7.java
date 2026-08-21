package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class k7 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public k7(TextView textView, Typeface typeface, int i) {
        this.c = 0;
        this.e = textView;
        this.f = typeface;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        Object obj = this.e;
        int i2 = this.d;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ((TextView) obj).setTypeface((Typeface) obj2, i2);
                return;
            case 1:
                ((BottomSheetBehavior) obj2).E((View) obj, i2, false);
                return;
            case 2:
                zi ziVar = (zi) obj2;
                Object obj3 = ((d3) obj).c;
                String str = (String) ziVar.a.get(Integer.valueOf(i2));
                if (str != null) {
                    h3 h3Var = (h3) ziVar.e.get(str);
                    if (h3Var != null) {
                        c3 c3Var = h3Var.a;
                        if (ziVar.d.remove(str)) {
                            c3Var.a(obj3);
                            return;
                        }
                        return;
                    }
                    ziVar.g.remove(str);
                    ziVar.f.put(str, obj3);
                    return;
                }
                return;
            default:
                ((zi) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                return;
        }
    }

    public /* synthetic */ k7(zi ziVar, int i, Object obj, int i2) {
        this.c = i2;
        this.f = ziVar;
        this.d = i;
        this.e = obj;
    }

    public k7(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.c = 1;
        this.f = bottomSheetBehavior;
        this.e = view;
        this.d = i;
    }
}
