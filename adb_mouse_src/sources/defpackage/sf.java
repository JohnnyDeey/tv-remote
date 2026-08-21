package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Base64;
import android.util.Log;
import android.widget.TextView;
import androidx.preference.Preference;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class sf implements uc0, ke0, tq0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sf(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.tq0
    public Object a() {
        SQLiteDatabase a;
        byte[] decode;
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 7:
                fl0 fl0Var = ((cx0) obj).i;
                a = fl0Var.a();
                a.beginTransaction();
                try {
                    a.compileStatement("DELETE FROM log_event_dropped").execute();
                    a.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + fl0Var.d.d()).execute();
                    a.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                l3 l3Var = (l3) obj;
                a = ((fl0) l3Var.d).a();
                a.beginTransaction();
                try {
                    Cursor rawQuery = a.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (rawQuery.moveToNext()) {
                            b8 a2 = ca.a();
                            a2.S(rawQuery.getString(1));
                            a2.f = cf0.b(rawQuery.getInt(2));
                            String string = rawQuery.getString(3);
                            if (string == null) {
                                decode = null;
                            } else {
                                decode = Base64.decode(string, 0);
                            }
                            a2.e = decode;
                            arrayList.add(a2.o());
                        }
                        rawQuery.close();
                        a.setTransactionSuccessful();
                        a.endTransaction();
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            ((b8) l3Var.e).Q((ca) obj2, 1, false);
                        }
                        return null;
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                } finally {
                }
        }
    }

    @Override // defpackage.uc0
    public Object b() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 1:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    oi0 oi0Var = ri0.a;
                    f40.k("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + ri0.b(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    f40.k("Failed to invoke constructor '" + ri0.b(constructor) + "' with no args", e3.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    return vw0.a.a(cls);
                } catch (Exception e4) {
                    f40.k(qo0.q("Unable to create instance of ", cls, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), e4);
                    return null;
                }
        }
    }

    @Override // defpackage.ke0
    public void c(Preference preference) {
        ln0 ln0Var = (ln0) this.d;
        Context h = ln0Var.h();
        h.getClass();
        f61 f61Var = new f61(h);
        f61Var.e(R.string.help);
        ((f4) f61Var.d).f = Html.fromHtml(ln0Var.l(R.string.help_text), 0);
        f61Var.d(android.R.string.ok, null);
        TextView textView = (TextView) f61Var.f().findViewById(android.R.id.message);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public tf d(b8 b8Var) {
        InputStream inputStream;
        uf ufVar = (uf) this.d;
        URL url = (URL) b8Var.d;
        String D = wv0.D("CctTransportBackend");
        if (Log.isLoggable(D, 4)) {
            Log.i(D, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(ufVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) b8Var.f;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    i81 i81Var = ufVar.a;
                    p9 p9Var = (p9) b8Var.e;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    y30 y30Var = (y30) i81Var.d;
                    e40 e40Var = new e40(bufferedWriter, y30Var.c, y30Var.d, y30Var.e, y30Var.f);
                    e40Var.e(p9Var);
                    e40Var.g();
                    e40Var.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String D2 = wv0.D("CctTransportBackend");
                    if (Log.isLoggable(D2, 4)) {
                        Log.i(D2, String.format("Status Code: %d", valueOf));
                    }
                    wv0.v("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    wv0.v("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new tf(responseCode, null, 0L);
                        }
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        try {
                            if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                                inputStream = new GZIPInputStream(inputStream2);
                            } else {
                                inputStream = inputStream2;
                            }
                            try {
                                tf tfVar = new tf(responseCode, null, x9.a(new BufferedReader(new InputStreamReader(inputStream))).a);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                return tfVar;
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        return new tf(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                } finally {
                }
            } finally {
            }
        } catch (cu e) {
            e = e;
            wv0.x("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new tf(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            wv0.x("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new tf(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            wv0.x("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new tf(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            wv0.x("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new tf(400, null, 0L);
        }
    }

    public boolean e(i81 i81Var, int i, Bundle bundle) {
        jk jkVar;
        l6 l6Var = (l6) this.d;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((b20) i81Var.d).f();
                Parcelable parcelable = (Parcelable) ((b20) i81Var.d).c();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        b20 b20Var = (b20) i81Var.d;
        ClipData clipData = new ClipData(b20Var.b(), new ClipData.Item(b20Var.e()));
        if (i2 >= 31) {
            jkVar = new i81(clipData, 2);
        } else {
            kk kkVar = new kk();
            kkVar.d = clipData;
            kkVar.e = 2;
            jkVar = kkVar;
        }
        jkVar.m(b20Var.i());
        jkVar.setExtras(bundle);
        if (ry0.i(l6Var, jkVar.build()) != null) {
            return false;
        }
        return true;
    }
}
