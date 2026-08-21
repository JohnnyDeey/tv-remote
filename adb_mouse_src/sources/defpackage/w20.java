package defpackage;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class w20 extends SecureRandom {
    public w20(sb0 sb0Var, SecureRandom secureRandom) {
        super(new v20(secureRandom, sb0Var.m("SHA-512")), secureRandom.getProvider());
    }
}
