package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface r30 {
    boolean nullSafe() default true;

    Class value();
}
