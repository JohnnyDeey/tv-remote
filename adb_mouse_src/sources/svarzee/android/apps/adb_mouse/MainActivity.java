package svarzee.android.apps.adb_mouse;

import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Keep;
import defpackage.bq;
import defpackage.cq;
import defpackage.f4;
import defpackage.f40;
import defpackage.f5;
import defpackage.f61;
import defpackage.fp;
import defpackage.i80;
import defpackage.i81;
import defpackage.j4;
import defpackage.jy0;
import defpackage.l0;
import defpackage.l80;
import defpackage.mn;
import defpackage.np;
import defpackage.o80;
import defpackage.ok;
import defpackage.ox;
import defpackage.ph;
import defpackage.pp;
import defpackage.r21;
import defpackage.rs;
import defpackage.ry0;
import defpackage.ss;
import defpackage.tc;
import defpackage.vc;
import defpackage.ve0;
import defpackage.wv0;
import defpackage.xp;
import defpackage.zy;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import svarzee.android.apps.adb_mouse.MainActivity;
import svarzee.android.apps.adb_mouse.SettingsActivity;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class MainActivity extends f5 {
    public static final /* synthetic */ int E = 0;
    public o80 B;
    public j4 C;
    public j4 D;
    public final cq A = new cq();

    @Keep
    private SharedPreferences.OnSharedPreferenceChangeListener sharedPreferencesChangeListener = new Object();

    /* JADX WARN: Type inference failed for: r5v1, types: [ji0, java.lang.Object] */
    @Override // defpackage.f5, androidx.activity.a, defpackage.dj, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i = 1;
        l().g(1);
        setContentView(R.layout.activity_main);
        View findViewById = findViewById(R.id.linear_layout_bot);
        f40 f40Var = new f40(3);
        WeakHashMap weakHashMap = ry0.a;
        jy0.c(findViewById, f40Var);
        final ImageView imageView = (ImageView) findViewById(R.id.image_view_status);
        final TextView textView = (TextView) findViewById(R.id.text_view_status);
        final int i2 = 0;
        SharedPreferences sharedPreferences = getSharedPreferences(ve0.a(this), 0);
        sharedPreferences.getClass();
        i81 i81Var = new i81(12, sharedPreferences);
        final ?? obj = new Object();
        obj.c = sharedPreferences.getInt("mouse_sensitivity", 50);
        setRequestedOrientation(!sharedPreferences.getBoolean("horizontal_orientation", false) ? 1 : 0);
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: m80
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                int i3 = MainActivity.E;
                Log.d("CFG", "Changed " + str);
                if (str != null) {
                    int hashCode = str.hashCode();
                    MainActivity mainActivity = MainActivity.this;
                    if (hashCode != -1571829195) {
                        if (hashCode != -994186747) {
                            if (hashCode != 3367) {
                                if (hashCode != 3446913 || !str.equals("port")) {
                                    return;
                                }
                            } else if (!str.equals("ip")) {
                                return;
                            }
                            Log.d("CFG", str + ' ' + sharedPreferences2.getString(str, null));
                            String string = sharedPreferences2.getString("ip", "");
                            string.getClass();
                            String string2 = sharedPreferences2.getString("port", "5555");
                            string2.getClass();
                            int parseInt = Integer.parseInt(string2);
                            cq cqVar = mainActivity.A;
                            fp fpVar = new fp(string, parseInt);
                            cqVar.getClass();
                            cqVar.a.i(fpVar);
                            return;
                        }
                        if (str.equals("mouse_sensitivity")) {
                            Log.d("CFG", str + ' ' + sharedPreferences2.getInt(str, 0));
                            obj.c = sharedPreferences2.getInt(str, 0);
                            return;
                        }
                        return;
                    }
                    if (str.equals("horizontal_orientation")) {
                        Log.d("CFG", str + ' ' + sharedPreferences2.getBoolean(str, false));
                        mainActivity.setRequestedOrientation(!sharedPreferences2.getBoolean(str, false) ? 1 : 0);
                    }
                }
            }
        };
        this.sharedPreferencesChangeListener = onSharedPreferenceChangeListener;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        if (sharedPreferences.getString("priv_key", null) == null || sharedPreferences.getString("pub_key", null) == null) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            generateKeyPair.getClass();
            PrivateKey privateKey = generateKeyPair.getPrivate();
            privateKey.getClass();
            sharedPreferences.edit().putString("priv_key", wv0.y(privateKey)).apply();
            PublicKey publicKey = generateKeyPair.getPublic();
            publicKey.getClass();
            sharedPreferences.edit().putString("pub_key", wv0.y(publicKey)).apply();
        }
        if (!sharedPreferences.getBoolean("dont_show_readme", false)) {
            boolean z = App.c;
            if (!App.c) {
                View inflate = View.inflate(this, R.layout.checkbox_dialog, null);
                ((CheckBox) inflate.findViewById(R.id.checkbox_dialog_checkbox)).setOnCheckedChangeListener(new i80(i, i81Var));
                TextView textView2 = (TextView) inflate.findViewById(R.id.checkbox_dialog_text);
                textView2.setText(Html.fromHtml(getString(R.string.help_text), 0));
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                f61 f61Var = new f61(this);
                f61Var.e(R.string.readme);
                ((f4) f61Var.d).p = inflate;
                f61Var.d(R.string.ok, null);
                f61Var.f();
                App.c = true;
            }
        }
        findViewById(R.id.relative_layout_pad).setOnTouchListener(new View.OnTouchListener() { // from class: n80
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                mn mnVar;
                int i3 = MainActivity.E;
                view.performClick();
                if (motionEvent.getAction() == 0) {
                    view.performHapticFeedback(4);
                }
                MainActivity mainActivity = MainActivity.this;
                cq cqVar = mainActivity.A;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.getClass();
                op opVar = new op(obtain, obj.c);
                cqVar.getClass();
                cqVar.a.i(opVar);
                mn mnVar2 = null;
                if (motionEvent.getAction() == 0) {
                    o80 o80Var = mainActivity.B;
                    if (o80Var != null) {
                        mnVar = o80Var.c;
                    } else {
                        mnVar = null;
                    }
                    if (k20.c(mnVar, x3.l)) {
                        mainActivity.t();
                    }
                }
                if (motionEvent.getAction() == 0) {
                    o80 o80Var2 = mainActivity.B;
                    if (o80Var2 != null) {
                        mnVar2 = o80Var2.c;
                    }
                    if (k20.c(mnVar2, w3.l)) {
                        mainActivity.s();
                        return true;
                    }
                    return true;
                }
                return true;
            }
        });
        DpadView dpadView = (DpadView) findViewById(R.id.dpad_view);
        dpadView.setOnSectionClick(new l0(1, this));
        ((Button) findViewById(R.id.settings_button)).setOnClickListener(new View.OnClickListener(this) { // from class: e80
            public final /* synthetic */ MainActivity d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                MainActivity mainActivity = this.d;
                switch (i3) {
                    case 0:
                        int i4 = MainActivity.E;
                        view.performHapticFeedback(1);
                        mainActivity.startActivity(new Intent(mainActivity, (Class<?>) SettingsActivity.class));
                        return;
                    default:
                        int i5 = MainActivity.E;
                        view.performHapticFeedback(1);
                        cq cqVar = mainActivity.A;
                        pp ppVar = new pp(2);
                        cqVar.getClass();
                        cqVar.a.i(ppVar);
                        return;
                }
            }
        });
        final Button button = (Button) findViewById(R.id.toggle_dpad_button);
        button.setOnClickListener(new ph(2, dpadView));
        final Button button2 = (Button) findViewById(R.id.home_button);
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: e80
            public final /* synthetic */ MainActivity d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                MainActivity mainActivity = this.d;
                switch (i3) {
                    case 0:
                        int i4 = MainActivity.E;
                        view.performHapticFeedback(1);
                        mainActivity.startActivity(new Intent(mainActivity, (Class<?>) SettingsActivity.class));
                        return;
                    default:
                        int i5 = MainActivity.E;
                        view.performHapticFeedback(1);
                        cq cqVar = mainActivity.A;
                        pp ppVar = new pp(2);
                        cqVar.getClass();
                        cqVar.a.i(ppVar);
                        return;
                }
            }
        });
        final Button button3 = (Button) findViewById(R.id.keyboard);
        button3.setOnClickListener(new rs(i81Var, this, 2));
        button3.setOnLongClickListener(new View.OnLongClickListener() { // from class: f80
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i3 = MainActivity.E;
                view.performHapticFeedback(0);
                final MainActivity mainActivity = MainActivity.this;
                View inflate2 = View.inflate(mainActivity, svarzee.android.apps.adb_mouse.R.layout.edit_text_dialog_layout, null);
                final EditText editText = (EditText) inflate2.findViewById(svarzee.android.apps.adb_mouse.R.id.dialog_edit_text);
                f61 f61Var2 = new f61(mainActivity);
                f61Var2.e(svarzee.android.apps.adb_mouse.R.string.paste_text);
                ((f4) f61Var2.d).p = inflate2;
                f61Var2.d(R.string.ok, new DialogInterface.OnClickListener() { // from class: h80
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        Collection collection;
                        int i5 = MainActivity.E;
                        String obj2 = editText.getText().toString();
                        int length = obj2.length();
                        MainActivity mainActivity2 = mainActivity;
                        if (length > 255) {
                            f61 f61Var3 = new f61(mainActivity2);
                            f61Var3.e(svarzee.android.apps.adb_mouse.R.string.invalid_input);
                            f4 f4Var = (f4) f61Var3.d;
                            f4Var.f = f4Var.a.getText(svarzee.android.apps.adb_mouse.R.string.text_too_long);
                            f61Var3.d(R.string.ok, null);
                            f61Var3.f();
                            return;
                        }
                        ki0 ki0Var = n40.e;
                        ki0Var.getClass();
                        if (!((Pattern) ki0Var.d).matcher(obj2).matches()) {
                            String replaceAll = ((Pattern) n40.d.d).matcher(obj2).replaceAll("");
                            replaceAll.getClass();
                            int length2 = replaceAll.length();
                            if (length2 != 0) {
                                if (length2 != 1) {
                                    int length3 = replaceAll.length();
                                    if (length3 > 128) {
                                        length3 = 128;
                                    }
                                    collection = new LinkedHashSet(q80.S(length3));
                                    for (int i6 = 0; i6 < replaceAll.length(); i6++) {
                                        collection.add(Character.valueOf(replaceAll.charAt(i6)));
                                    }
                                } else {
                                    collection = Collections.singleton(Character.valueOf(replaceAll.charAt(0)));
                                    collection.getClass();
                                }
                            } else {
                                collection = wt.c;
                            }
                            String p0 = gi.p0(collection, null, 63);
                            f61 f61Var4 = new f61(mainActivity2);
                            f61Var4.e(svarzee.android.apps.adb_mouse.R.string.invalid_input);
                            ((f4) f61Var4.d).f = mainActivity2.getString(svarzee.android.apps.adb_mouse.R.string.unsupported_characters, p0);
                            f61Var4.d(R.string.ok, null);
                            f61Var4.f();
                            return;
                        }
                        cq cqVar = mainActivity2.A;
                        sp spVar = new sp(obj2);
                        cqVar.getClass();
                        cqVar.a.i(spVar);
                    }
                });
                f61Var2.c();
                f61Var2.f();
                return true;
            }
        });
        i().a(this, new ox(this));
        cq cqVar = this.A;
        final int i3 = 0;
        zy zyVar = new zy(this) { // from class: k80
            public final /* synthetic */ MainActivity d;

            {
                this.d = this;
            }

            @Override // defpackage.zy
            public final Object g(Object obj2, Object obj3) {
                int i4 = i3;
                nw0 nw0Var = nw0.a;
                switch (i4) {
                    case 0:
                        final String str = (String) obj2;
                        final int intValue = ((Integer) obj3).intValue();
                        int i5 = MainActivity.E;
                        str.getClass();
                        final int i6 = 0;
                        final ImageView imageView2 = imageView;
                        final MainActivity mainActivity = this.d;
                        final TextView textView3 = textView;
                        final Button button4 = button;
                        final Button button5 = button2;
                        final Button button6 = button3;
                        mainActivity.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i7 = i6;
                                Button button7 = button6;
                                Button button8 = button5;
                                Button button9 = button4;
                                int i8 = intValue;
                                String str2 = str;
                                TextView textView4 = textView3;
                                MainActivity mainActivity2 = mainActivity;
                                ImageView imageView3 = imageView2;
                                switch (i7) {
                                    case 0:
                                        int i9 = MainActivity.E;
                                        imageView3.setColorFilter(mainActivity2.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView4.setTextColor(mainActivity2.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str2.length() == 0) {
                                            textView4.setText(mainActivity2.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView4.setText(mainActivity2.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str2 + ':' + i8));
                                        }
                                        button9.setEnabled(false);
                                        button8.setEnabled(false);
                                        button7.setEnabled(false);
                                        return;
                                    case 1:
                                        int i10 = MainActivity.E;
                                        imageView3.setColorFilter(mainActivity2.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView4.setTextColor(mainActivity2.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView4.setText(mainActivity2.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str2 + ':' + i8));
                                        button9.setEnabled(true);
                                        button8.setEnabled(true);
                                        button7.setEnabled(true);
                                        mainActivity2.B = new o80(str2, i8, v3.l);
                                        if (!mainActivity2.isFinishing() && !mainActivity2.isDestroyed() && (j4Var = mainActivity2.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity2.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i11 = MainActivity.E;
                                        imageView3.setColorFilter(mainActivity2.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView4.setTextColor(mainActivity2.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView4.setText(mainActivity2.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str2 + ':' + i8));
                                        button9.setEnabled(false);
                                        button8.setEnabled(false);
                                        button7.setEnabled(false);
                                        mainActivity2.B = new o80(str2, i8, w3.l);
                                        cq cqVar2 = mainActivity2.A;
                                        cqVar2.getClass();
                                        cqVar2.a.i(lp.a);
                                        mainActivity2.s();
                                        return;
                                    default:
                                        int i12 = MainActivity.E;
                                        imageView3.setColorFilter(mainActivity2.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView4.setTextColor(mainActivity2.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView4.setText(mainActivity2.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str2 + ':' + i8));
                                        button9.setEnabled(false);
                                        button8.setEnabled(false);
                                        button7.setEnabled(false);
                                        mainActivity2.B = new o80(str2, i8, x3.l);
                                        mainActivity2.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                    case 1:
                        final String str2 = (String) obj2;
                        final int intValue2 = ((Integer) obj3).intValue();
                        int i7 = MainActivity.E;
                        str2.getClass();
                        final int i8 = 3;
                        final ImageView imageView3 = imageView;
                        final MainActivity mainActivity2 = this.d;
                        final TextView textView4 = textView;
                        final Button button7 = button;
                        final Button button8 = button2;
                        final Button button9 = button3;
                        mainActivity2.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i72 = i8;
                                Button button72 = button9;
                                Button button82 = button8;
                                Button button92 = button7;
                                int i82 = intValue2;
                                String str22 = str2;
                                TextView textView42 = textView4;
                                MainActivity mainActivity22 = mainActivity2;
                                ImageView imageView32 = imageView3;
                                switch (i72) {
                                    case 0:
                                        int i9 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str22.length() == 0) {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str22 + ':' + i82));
                                        }
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        return;
                                    case 1:
                                        int i10 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str22 + ':' + i82));
                                        button92.setEnabled(true);
                                        button82.setEnabled(true);
                                        button72.setEnabled(true);
                                        mainActivity22.B = new o80(str22, i82, v3.l);
                                        if (!mainActivity22.isFinishing() && !mainActivity22.isDestroyed() && (j4Var = mainActivity22.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity22.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i11 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, w3.l);
                                        cq cqVar2 = mainActivity22.A;
                                        cqVar2.getClass();
                                        cqVar2.a.i(lp.a);
                                        mainActivity22.s();
                                        return;
                                    default:
                                        int i12 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, x3.l);
                                        mainActivity22.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                    case 2:
                        final String str3 = (String) obj2;
                        final int intValue3 = ((Integer) obj3).intValue();
                        int i9 = MainActivity.E;
                        str3.getClass();
                        final int i10 = 2;
                        final ImageView imageView4 = imageView;
                        final MainActivity mainActivity3 = this.d;
                        final TextView textView5 = textView;
                        final Button button10 = button;
                        final Button button11 = button2;
                        final Button button12 = button3;
                        mainActivity3.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i72 = i10;
                                Button button72 = button12;
                                Button button82 = button11;
                                Button button92 = button10;
                                int i82 = intValue3;
                                String str22 = str3;
                                TextView textView42 = textView5;
                                MainActivity mainActivity22 = mainActivity3;
                                ImageView imageView32 = imageView4;
                                switch (i72) {
                                    case 0:
                                        int i92 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str22.length() == 0) {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str22 + ':' + i82));
                                        }
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        return;
                                    case 1:
                                        int i102 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str22 + ':' + i82));
                                        button92.setEnabled(true);
                                        button82.setEnabled(true);
                                        button72.setEnabled(true);
                                        mainActivity22.B = new o80(str22, i82, v3.l);
                                        if (!mainActivity22.isFinishing() && !mainActivity22.isDestroyed() && (j4Var = mainActivity22.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity22.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i11 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, w3.l);
                                        cq cqVar2 = mainActivity22.A;
                                        cqVar2.getClass();
                                        cqVar2.a.i(lp.a);
                                        mainActivity22.s();
                                        return;
                                    default:
                                        int i12 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, x3.l);
                                        mainActivity22.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                    default:
                        final String str4 = (String) obj2;
                        final int intValue4 = ((Integer) obj3).intValue();
                        int i11 = MainActivity.E;
                        str4.getClass();
                        final int i12 = 1;
                        final ImageView imageView5 = imageView;
                        final MainActivity mainActivity4 = this.d;
                        final TextView textView6 = textView;
                        final Button button13 = button;
                        final Button button14 = button2;
                        final Button button15 = button3;
                        mainActivity4.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i72 = i12;
                                Button button72 = button15;
                                Button button82 = button14;
                                Button button92 = button13;
                                int i82 = intValue4;
                                String str22 = str4;
                                TextView textView42 = textView6;
                                MainActivity mainActivity22 = mainActivity4;
                                ImageView imageView32 = imageView5;
                                switch (i72) {
                                    case 0:
                                        int i92 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str22.length() == 0) {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str22 + ':' + i82));
                                        }
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        return;
                                    case 1:
                                        int i102 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str22 + ':' + i82));
                                        button92.setEnabled(true);
                                        button82.setEnabled(true);
                                        button72.setEnabled(true);
                                        mainActivity22.B = new o80(str22, i82, v3.l);
                                        if (!mainActivity22.isFinishing() && !mainActivity22.isDestroyed() && (j4Var = mainActivity22.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity22.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i112 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, w3.l);
                                        cq cqVar2 = mainActivity22.A;
                                        cqVar2.getClass();
                                        cqVar2.a.i(lp.a);
                                        mainActivity22.s();
                                        return;
                                    default:
                                        int i122 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, x3.l);
                                        mainActivity22.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                }
            }
        };
        cqVar.getClass();
        cqVar.i = zyVar;
        cq cqVar2 = this.A;
        final int i4 = 1;
        zy zyVar2 = new zy(this) { // from class: k80
            public final /* synthetic */ MainActivity d;

            {
                this.d = this;
            }

            @Override // defpackage.zy
            public final Object g(Object obj2, Object obj3) {
                int i42 = i4;
                nw0 nw0Var = nw0.a;
                switch (i42) {
                    case 0:
                        final String str = (String) obj2;
                        final int intValue = ((Integer) obj3).intValue();
                        int i5 = MainActivity.E;
                        str.getClass();
                        final int i6 = 0;
                        final ImageView imageView2 = imageView;
                        final MainActivity mainActivity = this.d;
                        final TextView textView3 = textView;
                        final Button button4 = button;
                        final Button button5 = button2;
                        final Button button6 = button3;
                        mainActivity.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i72 = i6;
                                Button button72 = button6;
                                Button button82 = button5;
                                Button button92 = button4;
                                int i82 = intValue;
                                String str22 = str;
                                TextView textView42 = textView3;
                                MainActivity mainActivity22 = mainActivity;
                                ImageView imageView32 = imageView2;
                                switch (i72) {
                                    case 0:
                                        int i92 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str22.length() == 0) {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str22 + ':' + i82));
                                        }
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        return;
                                    case 1:
                                        int i102 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str22 + ':' + i82));
                                        button92.setEnabled(true);
                                        button82.setEnabled(true);
                                        button72.setEnabled(true);
                                        mainActivity22.B = new o80(str22, i82, v3.l);
                                        if (!mainActivity22.isFinishing() && !mainActivity22.isDestroyed() && (j4Var = mainActivity22.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity22.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i112 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, w3.l);
                                        cq cqVar22 = mainActivity22.A;
                                        cqVar22.getClass();
                                        cqVar22.a.i(lp.a);
                                        mainActivity22.s();
                                        return;
                                    default:
                                        int i122 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, x3.l);
                                        mainActivity22.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                    case 1:
                        final String str2 = (String) obj2;
                        final int intValue2 = ((Integer) obj3).intValue();
                        int i7 = MainActivity.E;
                        str2.getClass();
                        final int i8 = 3;
                        final ImageView imageView3 = imageView;
                        final MainActivity mainActivity2 = this.d;
                        final TextView textView4 = textView;
                        final Button button7 = button;
                        final Button button8 = button2;
                        final Button button9 = button3;
                        mainActivity2.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i72 = i8;
                                Button button72 = button9;
                                Button button82 = button8;
                                Button button92 = button7;
                                int i82 = intValue2;
                                String str22 = str2;
                                TextView textView42 = textView4;
                                MainActivity mainActivity22 = mainActivity2;
                                ImageView imageView32 = imageView3;
                                switch (i72) {
                                    case 0:
                                        int i92 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str22.length() == 0) {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str22 + ':' + i82));
                                        }
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        return;
                                    case 1:
                                        int i102 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str22 + ':' + i82));
                                        button92.setEnabled(true);
                                        button82.setEnabled(true);
                                        button72.setEnabled(true);
                                        mainActivity22.B = new o80(str22, i82, v3.l);
                                        if (!mainActivity22.isFinishing() && !mainActivity22.isDestroyed() && (j4Var = mainActivity22.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity22.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i112 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, w3.l);
                                        cq cqVar22 = mainActivity22.A;
                                        cqVar22.getClass();
                                        cqVar22.a.i(lp.a);
                                        mainActivity22.s();
                                        return;
                                    default:
                                        int i122 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, x3.l);
                                        mainActivity22.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                    case 2:
                        final String str3 = (String) obj2;
                        final int intValue3 = ((Integer) obj3).intValue();
                        int i9 = MainActivity.E;
                        str3.getClass();
                        final int i10 = 2;
                        final ImageView imageView4 = imageView;
                        final MainActivity mainActivity3 = this.d;
                        final TextView textView5 = textView;
                        final Button button10 = button;
                        final Button button11 = button2;
                        final Button button12 = button3;
                        mainActivity3.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i72 = i10;
                                Button button72 = button12;
                                Button button82 = button11;
                                Button button92 = button10;
                                int i82 = intValue3;
                                String str22 = str3;
                                TextView textView42 = textView5;
                                MainActivity mainActivity22 = mainActivity3;
                                ImageView imageView32 = imageView4;
                                switch (i72) {
                                    case 0:
                                        int i92 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str22.length() == 0) {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str22 + ':' + i82));
                                        }
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        return;
                                    case 1:
                                        int i102 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str22 + ':' + i82));
                                        button92.setEnabled(true);
                                        button82.setEnabled(true);
                                        button72.setEnabled(true);
                                        mainActivity22.B = new o80(str22, i82, v3.l);
                                        if (!mainActivity22.isFinishing() && !mainActivity22.isDestroyed() && (j4Var = mainActivity22.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity22.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i112 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, w3.l);
                                        cq cqVar22 = mainActivity22.A;
                                        cqVar22.getClass();
                                        cqVar22.a.i(lp.a);
                                        mainActivity22.s();
                                        return;
                                    default:
                                        int i122 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, x3.l);
                                        mainActivity22.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                    default:
                        final String str4 = (String) obj2;
                        final int intValue4 = ((Integer) obj3).intValue();
                        int i11 = MainActivity.E;
                        str4.getClass();
                        final int i12 = 1;
                        final ImageView imageView5 = imageView;
                        final MainActivity mainActivity4 = this.d;
                        final TextView textView6 = textView;
                        final Button button13 = button;
                        final Button button14 = button2;
                        final Button button15 = button3;
                        mainActivity4.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i72 = i12;
                                Button button72 = button15;
                                Button button82 = button14;
                                Button button92 = button13;
                                int i82 = intValue4;
                                String str22 = str4;
                                TextView textView42 = textView6;
                                MainActivity mainActivity22 = mainActivity4;
                                ImageView imageView32 = imageView5;
                                switch (i72) {
                                    case 0:
                                        int i92 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str22.length() == 0) {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str22 + ':' + i82));
                                        }
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        return;
                                    case 1:
                                        int i102 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str22 + ':' + i82));
                                        button92.setEnabled(true);
                                        button82.setEnabled(true);
                                        button72.setEnabled(true);
                                        mainActivity22.B = new o80(str22, i82, v3.l);
                                        if (!mainActivity22.isFinishing() && !mainActivity22.isDestroyed() && (j4Var = mainActivity22.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity22.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i112 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, w3.l);
                                        cq cqVar22 = mainActivity22.A;
                                        cqVar22.getClass();
                                        cqVar22.a.i(lp.a);
                                        mainActivity22.s();
                                        return;
                                    default:
                                        int i122 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, x3.l);
                                        mainActivity22.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                }
            }
        };
        cqVar2.getClass();
        cqVar2.j = zyVar2;
        cq cqVar3 = this.A;
        final int i5 = 2;
        zy zyVar3 = new zy(this) { // from class: k80
            public final /* synthetic */ MainActivity d;

            {
                this.d = this;
            }

            @Override // defpackage.zy
            public final Object g(Object obj2, Object obj3) {
                int i42 = i5;
                nw0 nw0Var = nw0.a;
                switch (i42) {
                    case 0:
                        final String str = (String) obj2;
                        final int intValue = ((Integer) obj3).intValue();
                        int i52 = MainActivity.E;
                        str.getClass();
                        final int i6 = 0;
                        final ImageView imageView2 = imageView;
                        final MainActivity mainActivity = this.d;
                        final TextView textView3 = textView;
                        final Button button4 = button;
                        final Button button5 = button2;
                        final Button button6 = button3;
                        mainActivity.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i72 = i6;
                                Button button72 = button6;
                                Button button82 = button5;
                                Button button92 = button4;
                                int i82 = intValue;
                                String str22 = str;
                                TextView textView42 = textView3;
                                MainActivity mainActivity22 = mainActivity;
                                ImageView imageView32 = imageView2;
                                switch (i72) {
                                    case 0:
                                        int i92 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str22.length() == 0) {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str22 + ':' + i82));
                                        }
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        return;
                                    case 1:
                                        int i102 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str22 + ':' + i82));
                                        button92.setEnabled(true);
                                        button82.setEnabled(true);
                                        button72.setEnabled(true);
                                        mainActivity22.B = new o80(str22, i82, v3.l);
                                        if (!mainActivity22.isFinishing() && !mainActivity22.isDestroyed() && (j4Var = mainActivity22.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity22.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i112 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, w3.l);
                                        cq cqVar22 = mainActivity22.A;
                                        cqVar22.getClass();
                                        cqVar22.a.i(lp.a);
                                        mainActivity22.s();
                                        return;
                                    default:
                                        int i122 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, x3.l);
                                        mainActivity22.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                    case 1:
                        final String str2 = (String) obj2;
                        final int intValue2 = ((Integer) obj3).intValue();
                        int i7 = MainActivity.E;
                        str2.getClass();
                        final int i8 = 3;
                        final ImageView imageView3 = imageView;
                        final MainActivity mainActivity2 = this.d;
                        final TextView textView4 = textView;
                        final Button button7 = button;
                        final Button button8 = button2;
                        final Button button9 = button3;
                        mainActivity2.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i72 = i8;
                                Button button72 = button9;
                                Button button82 = button8;
                                Button button92 = button7;
                                int i82 = intValue2;
                                String str22 = str2;
                                TextView textView42 = textView4;
                                MainActivity mainActivity22 = mainActivity2;
                                ImageView imageView32 = imageView3;
                                switch (i72) {
                                    case 0:
                                        int i92 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str22.length() == 0) {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str22 + ':' + i82));
                                        }
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        return;
                                    case 1:
                                        int i102 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str22 + ':' + i82));
                                        button92.setEnabled(true);
                                        button82.setEnabled(true);
                                        button72.setEnabled(true);
                                        mainActivity22.B = new o80(str22, i82, v3.l);
                                        if (!mainActivity22.isFinishing() && !mainActivity22.isDestroyed() && (j4Var = mainActivity22.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity22.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i112 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, w3.l);
                                        cq cqVar22 = mainActivity22.A;
                                        cqVar22.getClass();
                                        cqVar22.a.i(lp.a);
                                        mainActivity22.s();
                                        return;
                                    default:
                                        int i122 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, x3.l);
                                        mainActivity22.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                    case 2:
                        final String str3 = (String) obj2;
                        final int intValue3 = ((Integer) obj3).intValue();
                        int i9 = MainActivity.E;
                        str3.getClass();
                        final int i10 = 2;
                        final ImageView imageView4 = imageView;
                        final MainActivity mainActivity3 = this.d;
                        final TextView textView5 = textView;
                        final Button button10 = button;
                        final Button button11 = button2;
                        final Button button12 = button3;
                        mainActivity3.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i72 = i10;
                                Button button72 = button12;
                                Button button82 = button11;
                                Button button92 = button10;
                                int i82 = intValue3;
                                String str22 = str3;
                                TextView textView42 = textView5;
                                MainActivity mainActivity22 = mainActivity3;
                                ImageView imageView32 = imageView4;
                                switch (i72) {
                                    case 0:
                                        int i92 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str22.length() == 0) {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str22 + ':' + i82));
                                        }
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        return;
                                    case 1:
                                        int i102 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str22 + ':' + i82));
                                        button92.setEnabled(true);
                                        button82.setEnabled(true);
                                        button72.setEnabled(true);
                                        mainActivity22.B = new o80(str22, i82, v3.l);
                                        if (!mainActivity22.isFinishing() && !mainActivity22.isDestroyed() && (j4Var = mainActivity22.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity22.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i112 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, w3.l);
                                        cq cqVar22 = mainActivity22.A;
                                        cqVar22.getClass();
                                        cqVar22.a.i(lp.a);
                                        mainActivity22.s();
                                        return;
                                    default:
                                        int i122 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, x3.l);
                                        mainActivity22.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                    default:
                        final String str4 = (String) obj2;
                        final int intValue4 = ((Integer) obj3).intValue();
                        int i11 = MainActivity.E;
                        str4.getClass();
                        final int i12 = 1;
                        final ImageView imageView5 = imageView;
                        final MainActivity mainActivity4 = this.d;
                        final TextView textView6 = textView;
                        final Button button13 = button;
                        final Button button14 = button2;
                        final Button button15 = button3;
                        mainActivity4.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i72 = i12;
                                Button button72 = button15;
                                Button button82 = button14;
                                Button button92 = button13;
                                int i82 = intValue4;
                                String str22 = str4;
                                TextView textView42 = textView6;
                                MainActivity mainActivity22 = mainActivity4;
                                ImageView imageView32 = imageView5;
                                switch (i72) {
                                    case 0:
                                        int i92 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str22.length() == 0) {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str22 + ':' + i82));
                                        }
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        return;
                                    case 1:
                                        int i102 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str22 + ':' + i82));
                                        button92.setEnabled(true);
                                        button82.setEnabled(true);
                                        button72.setEnabled(true);
                                        mainActivity22.B = new o80(str22, i82, v3.l);
                                        if (!mainActivity22.isFinishing() && !mainActivity22.isDestroyed() && (j4Var = mainActivity22.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity22.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i112 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, w3.l);
                                        cq cqVar22 = mainActivity22.A;
                                        cqVar22.getClass();
                                        cqVar22.a.i(lp.a);
                                        mainActivity22.s();
                                        return;
                                    default:
                                        int i122 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, x3.l);
                                        mainActivity22.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                }
            }
        };
        cqVar3.getClass();
        cqVar3.k = zyVar3;
        cq cqVar4 = this.A;
        final int i6 = 3;
        zy zyVar4 = new zy(this) { // from class: k80
            public final /* synthetic */ MainActivity d;

            {
                this.d = this;
            }

            @Override // defpackage.zy
            public final Object g(Object obj2, Object obj3) {
                int i42 = i6;
                nw0 nw0Var = nw0.a;
                switch (i42) {
                    case 0:
                        final String str = (String) obj2;
                        final int intValue = ((Integer) obj3).intValue();
                        int i52 = MainActivity.E;
                        str.getClass();
                        final int i62 = 0;
                        final ImageView imageView2 = imageView;
                        final MainActivity mainActivity = this.d;
                        final TextView textView3 = textView;
                        final Button button4 = button;
                        final Button button5 = button2;
                        final Button button6 = button3;
                        mainActivity.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i72 = i62;
                                Button button72 = button6;
                                Button button82 = button5;
                                Button button92 = button4;
                                int i82 = intValue;
                                String str22 = str;
                                TextView textView42 = textView3;
                                MainActivity mainActivity22 = mainActivity;
                                ImageView imageView32 = imageView2;
                                switch (i72) {
                                    case 0:
                                        int i92 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str22.length() == 0) {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str22 + ':' + i82));
                                        }
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        return;
                                    case 1:
                                        int i102 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str22 + ':' + i82));
                                        button92.setEnabled(true);
                                        button82.setEnabled(true);
                                        button72.setEnabled(true);
                                        mainActivity22.B = new o80(str22, i82, v3.l);
                                        if (!mainActivity22.isFinishing() && !mainActivity22.isDestroyed() && (j4Var = mainActivity22.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity22.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i112 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, w3.l);
                                        cq cqVar22 = mainActivity22.A;
                                        cqVar22.getClass();
                                        cqVar22.a.i(lp.a);
                                        mainActivity22.s();
                                        return;
                                    default:
                                        int i122 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, x3.l);
                                        mainActivity22.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                    case 1:
                        final String str2 = (String) obj2;
                        final int intValue2 = ((Integer) obj3).intValue();
                        int i7 = MainActivity.E;
                        str2.getClass();
                        final int i8 = 3;
                        final ImageView imageView3 = imageView;
                        final MainActivity mainActivity2 = this.d;
                        final TextView textView4 = textView;
                        final Button button7 = button;
                        final Button button8 = button2;
                        final Button button9 = button3;
                        mainActivity2.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i72 = i8;
                                Button button72 = button9;
                                Button button82 = button8;
                                Button button92 = button7;
                                int i82 = intValue2;
                                String str22 = str2;
                                TextView textView42 = textView4;
                                MainActivity mainActivity22 = mainActivity2;
                                ImageView imageView32 = imageView3;
                                switch (i72) {
                                    case 0:
                                        int i92 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str22.length() == 0) {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str22 + ':' + i82));
                                        }
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        return;
                                    case 1:
                                        int i102 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str22 + ':' + i82));
                                        button92.setEnabled(true);
                                        button82.setEnabled(true);
                                        button72.setEnabled(true);
                                        mainActivity22.B = new o80(str22, i82, v3.l);
                                        if (!mainActivity22.isFinishing() && !mainActivity22.isDestroyed() && (j4Var = mainActivity22.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity22.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i112 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, w3.l);
                                        cq cqVar22 = mainActivity22.A;
                                        cqVar22.getClass();
                                        cqVar22.a.i(lp.a);
                                        mainActivity22.s();
                                        return;
                                    default:
                                        int i122 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, x3.l);
                                        mainActivity22.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                    case 2:
                        final String str3 = (String) obj2;
                        final int intValue3 = ((Integer) obj3).intValue();
                        int i9 = MainActivity.E;
                        str3.getClass();
                        final int i10 = 2;
                        final ImageView imageView4 = imageView;
                        final MainActivity mainActivity3 = this.d;
                        final TextView textView5 = textView;
                        final Button button10 = button;
                        final Button button11 = button2;
                        final Button button12 = button3;
                        mainActivity3.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i72 = i10;
                                Button button72 = button12;
                                Button button82 = button11;
                                Button button92 = button10;
                                int i82 = intValue3;
                                String str22 = str3;
                                TextView textView42 = textView5;
                                MainActivity mainActivity22 = mainActivity3;
                                ImageView imageView32 = imageView4;
                                switch (i72) {
                                    case 0:
                                        int i92 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str22.length() == 0) {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str22 + ':' + i82));
                                        }
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        return;
                                    case 1:
                                        int i102 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str22 + ':' + i82));
                                        button92.setEnabled(true);
                                        button82.setEnabled(true);
                                        button72.setEnabled(true);
                                        mainActivity22.B = new o80(str22, i82, v3.l);
                                        if (!mainActivity22.isFinishing() && !mainActivity22.isDestroyed() && (j4Var = mainActivity22.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity22.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i112 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, w3.l);
                                        cq cqVar22 = mainActivity22.A;
                                        cqVar22.getClass();
                                        cqVar22.a.i(lp.a);
                                        mainActivity22.s();
                                        return;
                                    default:
                                        int i122 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, x3.l);
                                        mainActivity22.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                    default:
                        final String str4 = (String) obj2;
                        final int intValue4 = ((Integer) obj3).intValue();
                        int i11 = MainActivity.E;
                        str4.getClass();
                        final int i12 = 1;
                        final ImageView imageView5 = imageView;
                        final MainActivity mainActivity4 = this.d;
                        final TextView textView6 = textView;
                        final Button button13 = button;
                        final Button button14 = button2;
                        final Button button15 = button3;
                        mainActivity4.runOnUiThread(new Runnable() { // from class: g80
                            @Override // java.lang.Runnable
                            public final void run() {
                                j4 j4Var;
                                j4 j4Var2;
                                int i72 = i12;
                                Button button72 = button15;
                                Button button82 = button14;
                                Button button92 = button13;
                                int i82 = intValue4;
                                String str22 = str4;
                                TextView textView42 = textView6;
                                MainActivity mainActivity22 = mainActivity4;
                                ImageView imageView32 = imageView5;
                                switch (i72) {
                                    case 0:
                                        int i92 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_error));
                                        if (str22.length() == 0) {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_not_configured));
                                        } else {
                                            textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connecting_to, str22 + ':' + i82));
                                        }
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        return;
                                    case 1:
                                        int i102 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_success));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_connected_to, str22 + ':' + i82));
                                        button92.setEnabled(true);
                                        button82.setEnabled(true);
                                        button72.setEnabled(true);
                                        mainActivity22.B = new o80(str22, i82, v3.l);
                                        if (!mainActivity22.isFinishing() && !mainActivity22.isDestroyed() && (j4Var = mainActivity22.C) != null && j4Var.isShowing() && (j4Var2 = mainActivity22.C) != null) {
                                            j4Var2.dismiss();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i112 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_approve_key, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, w3.l);
                                        cq cqVar22 = mainActivity22.A;
                                        cqVar22.getClass();
                                        cqVar22.a.i(lp.a);
                                        mainActivity22.s();
                                        return;
                                    default:
                                        int i122 = MainActivity.E;
                                        imageView32.setColorFilter(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setTextColor(mainActivity22.getColor(svarzee.android.apps.adb_mouse.R.color.status_warning));
                                        textView42.setText(mainActivity22.getString(svarzee.android.apps.adb_mouse.R.string.status_text_pairing_required, str22 + ':' + i82));
                                        button92.setEnabled(false);
                                        button82.setEnabled(false);
                                        button72.setEnabled(false);
                                        mainActivity22.B = new o80(str22, i82, x3.l);
                                        mainActivity22.t();
                                        return;
                                }
                            }
                        });
                        return nw0Var;
                }
            }
        };
        cqVar4.getClass();
        cqVar4.l = zyVar4;
        cq cqVar5 = this.A;
        l80 l80Var = new l80(i2, this);
        cqVar5.getClass();
        cqVar5.m = l80Var;
        String string = sharedPreferences.getString("priv_key", null);
        if (string == null) {
            string = "";
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        tc tcVar = vc.c;
        PrivateKey generatePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(tcVar.a(string)));
        generatePrivate.getClass();
        String string2 = sharedPreferences.getString("pub_key", null);
        if (string2 == null) {
            string2 = "";
        }
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(tcVar.a(string2)));
        generatePublic.getClass();
        KeyPair keyPair = new KeyPair(generatePublic, generatePrivate);
        cq cqVar6 = this.A;
        cqVar6.getClass();
        ok okVar = cqVar6.f;
        r21.D(okVar, null, new xp(cqVar6, null), 3);
        r21.D(okVar, null, new bq(cqVar6, keyPair, null), 3);
        cq cqVar7 = this.A;
        String string3 = sharedPreferences.getString("ip", "");
        string3.getClass();
        String string4 = sharedPreferences.getString("port", "5555");
        string4.getClass();
        fp fpVar = new fp(string3, Integer.parseInt(string4));
        cqVar7.getClass();
        cqVar7.a.i(fpVar);
    }

    @Override // defpackage.f5, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            this.A.b();
        } catch (Exception e) {
            Log.e("ERR", "Error closing dispatcher: ".concat(mn.Q(e)));
        }
        getSharedPreferences(ve0.a(this), 0).unregisterOnSharedPreferenceChangeListener(this.sharedPreferencesChangeListener);
    }

    @Override // defpackage.f5, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4) {
            cq cqVar = this.A;
            if (i != 24) {
                if (i == 25) {
                    pp ppVar = new pp(16);
                    cqVar.getClass();
                    cqVar.a.i(ppVar);
                    return true;
                }
                return true;
            }
            pp ppVar2 = new pp(8);
            cqVar.getClass();
            cqVar.a.i(ppVar2);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4) {
            cq cqVar = this.A;
            if (i != 24) {
                if (i != 25) {
                    np npVar = new np(keyEvent);
                    cqVar.getClass();
                    cqVar.a.i(npVar);
                    return true;
                }
                pp ppVar = new pp(16);
                cqVar.getClass();
                cqVar.a.i(ppVar);
                return true;
            }
            pp ppVar2 = new pp(8);
            cqVar.getClass();
            cqVar.a.i(ppVar2);
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void s() {
        if (!isFinishing() && !isDestroyed()) {
            j4 j4Var = this.C;
            if (j4Var == null || !j4Var.isShowing()) {
                f61 f61Var = new f61(this);
                f61Var.e(R.string.key_approval_required);
                f4 f4Var = (f4) f61Var.d;
                f4Var.f = f4Var.a.getText(R.string.key_approval_message);
                f61Var.d(R.string.retry, new DialogInterface.OnClickListener() { // from class: j80
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        cq cqVar = MainActivity.this.A;
                        cqVar.getClass();
                        cqVar.a.i(lp.a);
                    }
                });
                f61Var.c();
                this.C = f61Var.f();
            }
        }
    }

    public final void t() {
        if (!isFinishing() && !isDestroyed()) {
            j4 j4Var = this.D;
            int i = 1;
            if (j4Var == null || !j4Var.isShowing()) {
                View inflate = View.inflate(this, R.layout.pairing_dialog_layout, null);
                EditText editText = (EditText) inflate.findViewById(R.id.pairing_code_edit_text);
                EditText editText2 = (EditText) inflate.findViewById(R.id.pairing_port_edit_text);
                f61 f61Var = new f61(this);
                f4 f4Var = (f4) f61Var.d;
                f61Var.e(R.string.pairing_required);
                f4Var.f = f4Var.a.getText(R.string.pairing_message);
                f4Var.p = inflate;
                f61Var.d(R.string.pair, new ss(editText, editText2, this, i));
                f61Var.c();
                this.D = f61Var.f();
            }
        }
    }
}
