package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ue0 {
    public static final Class[] e = {Context.class, AttributeSet.class};
    public static final HashMap f = new HashMap();
    public final Context a;
    public final ve0 c;
    public final Object[] b = new Object[2];
    public final String[] d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public ue0(Context context, ve0 ve0Var) {
        this.a = context;
        this.c = ve0Var;
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) {
        Class<?> cls;
        HashMap hashMap = f;
        Constructor<?> constructor = (Constructor) hashMap.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.a.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        cls = null;
                        ClassNotFoundException e2 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e3) {
                                e2 = e3;
                            }
                        }
                        if (cls == null) {
                            if (e2 == null) {
                                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e2;
                        }
                        constructor = cls.getConstructor(e);
                        constructor.setAccessible(true);
                        hashMap.put(str, constructor);
                    }
                    cls = Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(e);
                    constructor.setAccessible(true);
                    hashMap.put(str, constructor);
                } catch (ClassNotFoundException e4) {
                    throw e4;
                }
            } catch (Exception e5) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e5);
                throw inflateException;
            }
        }
        Object[] objArr = this.b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return a(str, this.d, attributeSet);
            }
            return a(str, null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    public final PreferenceGroup c(XmlResourceParser xmlResourceParser) {
        int next;
        PreferenceGroup preferenceGroup;
        synchronized (this.b) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.b[0] = this.a;
            do {
                try {
                    try {
                        next = xmlResourceParser.next();
                        if (next == 2) {
                            break;
                        }
                    } catch (InflateException e2) {
                        throw e2;
                    }
                } catch (IOException e3) {
                    InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e3.getMessage());
                    inflateException.initCause(e3);
                    throw inflateException;
                } catch (XmlPullParserException e4) {
                    InflateException inflateException2 = new InflateException(e4.getMessage());
                    inflateException2.initCause(e4);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next == 2) {
                preferenceGroup = (PreferenceGroup) b(xmlResourceParser.getName(), asAttributeSet);
                preferenceGroup.k(this.c);
                d(xmlResourceParser, preferenceGroup, asAttributeSet);
            } else {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
        }
        return preferenceGroup;
    }

    public final void d(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) {
        long j;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if ("intent".equals(name)) {
                        try {
                            preference.o = Intent.parseIntent(this.a.getResources(), xmlPullParser, attributeSet);
                        } catch (IOException e2) {
                            XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException.initCause(e2);
                            throw xmlPullParserException;
                        }
                    } else if ("extra".equals(name)) {
                        Resources resources = this.a.getResources();
                        if (preference.q == null) {
                            preference.q = new Bundle();
                        }
                        resources.parseBundleExtra("extra", attributeSet, preference.q);
                        try {
                            int depth2 = xmlPullParser.getDepth();
                            while (true) {
                                int next2 = xmlPullParser.next();
                                if (next2 != 1 && (next2 != 3 || xmlPullParser.getDepth() > depth2)) {
                                }
                            }
                        } catch (IOException e3) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e3);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference b = b(name, attributeSet);
                        PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                        if (!preferenceGroup.Q.contains(b)) {
                            if (b.n != null) {
                                PreferenceGroup preferenceGroup2 = preferenceGroup;
                                while (true) {
                                    PreferenceGroup preferenceGroup3 = preferenceGroup2.K;
                                    if (preferenceGroup3 == null) {
                                        break;
                                    } else {
                                        preferenceGroup2 = preferenceGroup3;
                                    }
                                }
                                String str = b.n;
                                if (preferenceGroup2.y(str) != null) {
                                    Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                                }
                            }
                            int i = b.i;
                            if (i == Integer.MAX_VALUE) {
                                if (preferenceGroup.R) {
                                    int i2 = preferenceGroup.S;
                                    preferenceGroup.S = i2 + 1;
                                    if (i2 != i) {
                                        b.i = i2;
                                        te0 te0Var = b.I;
                                        if (te0Var != null) {
                                            Handler handler = te0Var.h;
                                            l9 l9Var = te0Var.i;
                                            handler.removeCallbacks(l9Var);
                                            handler.post(l9Var);
                                        }
                                    }
                                }
                                if (b instanceof PreferenceGroup) {
                                    ((PreferenceGroup) b).R = preferenceGroup.R;
                                }
                            }
                            int binarySearch = Collections.binarySearch(preferenceGroup.Q, b);
                            if (binarySearch < 0) {
                                binarySearch = (binarySearch * (-1)) - 1;
                            }
                            boolean w = preferenceGroup.w();
                            if (b.x == w) {
                                b.x = !w;
                                b.i(b.w());
                                b.h();
                            }
                            synchronized (preferenceGroup) {
                                preferenceGroup.Q.add(binarySearch, b);
                            }
                            ve0 ve0Var = preferenceGroup.d;
                            String str2 = b.n;
                            if (str2 != null && preferenceGroup.P.containsKey(str2)) {
                                j = ((Long) preferenceGroup.P.get(str2)).longValue();
                                preferenceGroup.P.remove(str2);
                            } else {
                                synchronized (ve0Var) {
                                    j = ve0Var.b;
                                    ve0Var.b = 1 + j;
                                }
                            }
                            b.e = j;
                            b.f = true;
                            try {
                                b.k(ve0Var);
                                b.f = false;
                                if (b.K == null) {
                                    b.K = preferenceGroup;
                                    if (preferenceGroup.T) {
                                        b.j();
                                    }
                                    te0 te0Var2 = preferenceGroup.I;
                                    if (te0Var2 != null) {
                                        Handler handler2 = te0Var2.h;
                                        l9 l9Var2 = te0Var2.i;
                                        handler2.removeCallbacks(l9Var2);
                                        handler2.post(l9Var2);
                                    }
                                } else {
                                    c.o("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                                    return;
                                }
                            } catch (Throwable th) {
                                b.f = false;
                                throw th;
                            }
                        }
                        d(xmlPullParser, b, attributeSet);
                    }
                }
            } else {
                return;
            }
        }
    }
}
