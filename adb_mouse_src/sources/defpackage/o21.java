package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class o21 extends ObjectInputStream {
    public static final HashSet e;
    public final Class c;
    public boolean d;

    static {
        HashSet hashSet = new HashSet();
        e = hashSet;
        hashSet.add("java.util.TreeMap");
        hashSet.add("java.lang.Integer");
        hashSet.add("java.lang.Number");
        hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
        hashSet.add("java.util.ArrayList");
        hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
        hashSet.add("[B");
        hashSet.add("java.util.LinkedList");
        hashSet.add("java.util.Stack");
        hashSet.add("java.util.Vector");
        hashSet.add("[Ljava.lang.Object;");
        hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
    }

    public o21(Class cls, ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
        this.d = false;
        this.c = cls;
    }

    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) {
        if (!this.d) {
            if (objectStreamClass.getName().equals(this.c.getName())) {
                this.d = true;
            } else {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
        } else if (!e.contains(objectStreamClass.getName())) {
            throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
        }
        return super.resolveClass(objectStreamClass);
    }
}
