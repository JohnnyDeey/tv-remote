package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.b;
import androidx.lifecycle.a;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class ej extends Dialog implements s50, yl0 {
    public a c;
    public final jy d;
    public final b e;

    public ej(Context context, int i) {
        super(context, i);
        this.d = new jy(this);
        this.e = new b(new x2(6, this));
    }

    public static void b(ej ejVar) {
        super.onBackPressed();
    }

    @Override // defpackage.yl0
    public final l5 a() {
        return (l5) this.d.c;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.addContentView(view, layoutParams);
    }

    public final void c() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // defpackage.s50
    public final a e() {
        a aVar = this.c;
        if (aVar == null) {
            a aVar2 = new a(this);
            this.c = aVar2;
            return aVar2;
        }
        return aVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.e.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            b bVar = this.e;
            bVar.getClass();
            bVar.e = onBackInvokedDispatcher;
            bVar.c(bVar.g);
        }
        this.d.d(bundle);
        a aVar = this.c;
        if (aVar == null) {
            aVar = new a(this);
            this.c = aVar;
        }
        aVar.d(l50.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.d.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        a aVar = this.c;
        if (aVar == null) {
            aVar = new a(this);
            this.c = aVar;
        }
        aVar.d(l50.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        a aVar = this.c;
        if (aVar == null) {
            aVar = new a(this);
            this.c = aVar;
        }
        aVar.d(l50.ON_DESTROY);
        this.c = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.setContentView(view, layoutParams);
    }
}
