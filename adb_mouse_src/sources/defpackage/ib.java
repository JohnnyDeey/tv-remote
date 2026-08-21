package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes.dex */
public final class ib extends mn {
    public static final s n;
    public static final s o;
    public static final s p;
    public static final s q;
    public static final s r;
    public static final s s;
    public static final s t;
    public static final s u;
    public static final Hashtable v;
    public static final Hashtable w;
    public static final ib x;
    public final Hashtable l;
    public final Hashtable m;

    static {
        s k = qo0.k("2.5.4.6");
        n = k;
        s k2 = qo0.k("2.5.4.10");
        s k3 = qo0.k("2.5.4.11");
        s k4 = qo0.k("2.5.4.12");
        s k5 = qo0.k("2.5.4.3");
        new s("2.5.4.5").v();
        s v2 = new s("2.5.4.9").v();
        s k6 = qo0.k("2.5.4.5");
        o = k6;
        s k7 = qo0.k("2.5.4.7");
        s k8 = qo0.k("2.5.4.8");
        s k9 = qo0.k("2.5.4.4");
        s k10 = qo0.k("2.5.4.42");
        s k11 = qo0.k("2.5.4.43");
        s k12 = qo0.k("2.5.4.44");
        s k13 = qo0.k("2.5.4.45");
        s k14 = qo0.k("2.5.4.13");
        s k15 = qo0.k("2.5.4.15");
        s k16 = qo0.k("2.5.4.17");
        s k17 = qo0.k("2.5.4.46");
        p = k17;
        s k18 = qo0.k("2.5.4.65");
        s k19 = qo0.k("2.5.4.72");
        s sVar = x11.g;
        s v3 = sVar.q("1").v();
        q = v3;
        s v4 = sVar.q("2").v();
        s v5 = sVar.q("3").v();
        s v6 = sVar.q("4").v();
        s v7 = sVar.q("5").v();
        s k20 = qo0.k("1.3.36.8.3.14");
        s k21 = qo0.k("2.5.4.16");
        new s("2.5.4.54").v();
        s sVar2 = x11.a;
        r = sVar2;
        s sVar3 = x11.b;
        s sVar4 = x11.c;
        s sVar5 = od0.j;
        s = sVar5;
        s sVar6 = od0.k;
        s sVar7 = od0.l;
        s sVar8 = new s("0.9.2342.19200300.100.1.25");
        t = sVar8;
        s sVar9 = new s("0.9.2342.19200300.100.1.1");
        s sVar10 = new s("1.3.6.1.4.1.311.60.2.1.3");
        u = sVar10;
        s sVar11 = new s("1.3.6.1.4.1.311.60.2.1.2");
        s sVar12 = new s("1.3.6.1.4.1.311.60.2.1.1");
        Hashtable hashtable = new Hashtable();
        v = hashtable;
        Hashtable hashtable2 = new Hashtable();
        w = hashtable2;
        hashtable.put(k, "C");
        hashtable.put(k2, "O");
        hashtable.put(k4, "T");
        hashtable.put(k3, "OU");
        hashtable.put(k5, "CN");
        hashtable.put(k7, "L");
        hashtable.put(k8, "ST");
        hashtable.put(k6, "SERIALNUMBER");
        hashtable.put(sVar5, "E");
        hashtable.put(sVar8, "DC");
        hashtable.put(sVar9, "UID");
        hashtable.put(v2, "STREET");
        hashtable.put(k9, "SURNAME");
        hashtable.put(k10, "GIVENNAME");
        hashtable.put(k11, "INITIALS");
        hashtable.put(k12, "GENERATION");
        hashtable.put(k14, "DESCRIPTION");
        hashtable.put(k19, "ROLE");
        hashtable.put(sVar7, "unstructuredAddress");
        hashtable.put(sVar6, "unstructuredName");
        hashtable.put(k13, "UniqueIdentifier");
        hashtable.put(k17, "DN");
        hashtable.put(k18, "Pseudonym");
        hashtable.put(k21, "PostalAddress");
        hashtable.put(k20, "NameAtBirth");
        hashtable.put(v6, "CountryOfCitizenship");
        hashtable.put(v7, "CountryOfResidence");
        hashtable.put(v5, "Gender");
        hashtable.put(v4, "PlaceOfBirth");
        hashtable.put(v3, "DateOfBirth");
        hashtable.put(k16, "PostalCode");
        hashtable.put(k15, "BusinessCategory");
        hashtable.put(sVar2, "TelephoneNumber");
        hashtable.put(sVar3, "Name");
        hashtable.put(sVar4, "organizationIdentifier");
        hashtable.put(sVar10, "jurisdictionCountry");
        hashtable.put(sVar11, "jurisdictionState");
        hashtable.put(sVar12, "jurisdictionLocality");
        hashtable2.put("c", k);
        hashtable2.put("o", k2);
        hashtable2.put("t", k4);
        hashtable2.put("ou", k3);
        hashtable2.put("cn", k5);
        hashtable2.put("l", k7);
        hashtable2.put("st", k8);
        hashtable2.put("sn", k9);
        hashtable2.put("serialnumber", k6);
        hashtable2.put("street", v2);
        hashtable2.put("emailaddress", sVar5);
        hashtable2.put("dc", sVar8);
        hashtable2.put("e", sVar5);
        hashtable2.put("uid", sVar9);
        hashtable2.put("surname", k9);
        hashtable2.put("givenname", k10);
        hashtable2.put("initials", k11);
        hashtable2.put("generation", k12);
        hashtable2.put("description", k14);
        hashtable2.put("role", k19);
        hashtable2.put("unstructuredaddress", sVar7);
        hashtable2.put("unstructuredname", sVar6);
        hashtable2.put("uniqueidentifier", k13);
        hashtable2.put("dn", k17);
        hashtable2.put("pseudonym", k18);
        hashtable2.put("postaladdress", k21);
        hashtable2.put("nameatbirth", k20);
        hashtable2.put("countryofcitizenship", v6);
        hashtable2.put("countryofresidence", v7);
        hashtable2.put("gender", v5);
        hashtable2.put("placeofbirth", v4);
        hashtable2.put("dateofbirth", v3);
        hashtable2.put("postalcode", k16);
        hashtable2.put("businesscategory", k15);
        hashtable2.put("telephonenumber", sVar2);
        hashtable2.put("name", sVar3);
        hashtable2.put("organizationidentifier", sVar4);
        hashtable2.put("jurisdictioncountry", sVar10);
        hashtable2.put("jurisdictionstate", sVar11);
        hashtable2.put("jurisdictionlocality", sVar12);
        x = new ib();
    }

    public ib() {
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = v;
        Enumeration keys = hashtable2.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable.put(nextElement, hashtable2.get(nextElement));
        }
        this.m = hashtable;
        Hashtable hashtable3 = new Hashtable();
        Hashtable hashtable4 = w;
        Enumeration keys2 = hashtable4.keys();
        while (keys2.hasMoreElements()) {
            Object nextElement2 = keys2.nextElement();
            hashtable3.put(nextElement2, hashtable4.get(nextElement2));
        }
        this.l = hashtable3;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.s X(java.lang.String r7) {
        /*
            r6 = this;
            r4 = 0
            r5 = 4
            r1 = 1
            r2 = 0
            java.lang.String r3 = "OID."
            r0 = r7
            boolean r7 = r0.regionMatches(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L18
            s r6 = new s
            r7 = 4
            java.lang.String r7 = r0.substring(r7)
            r6.<init>(r7)
            return r6
        L18:
            java.util.concurrent.ConcurrentHashMap r7 = defpackage.s.e
            int r7 = r0.length()
            r1 = 16385(0x4001, float:2.296E-41)
            r2 = 0
            if (r7 > r1) goto L38
            boolean r7 = defpackage.s.w(r0)
            if (r7 == 0) goto L38
            byte[] r7 = defpackage.s.z(r0)
            int r1 = r7.length
            r3 = 4096(0x1000, float:5.74E-42)
            if (r1 > r3) goto L38
            s r1 = new s
            r1.<init>(r7, r0)
            goto L39
        L38:
            r1 = r2
        L39:
            if (r1 == 0) goto L3c
            return r1
        L3c:
            java.lang.String r7 = defpackage.yp0.c(r0)
            java.util.Hashtable r6 = r6.l
            java.lang.Object r6 = r6.get(r7)
            s r6 = (defpackage.s) r6
            if (r6 == 0) goto L4b
            return r6
        L4b:
            java.lang.String r6 = "Unknown object id - "
            java.lang.String r7 = " - passed to distinguished name"
            java.lang.String r6 = defpackage.qo0.r(r6, r0, r7)
            defpackage.c.k(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib.X(java.lang.String):s");
    }
}
