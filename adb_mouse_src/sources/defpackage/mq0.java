package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class mq0 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f = {MenuItem.class};
    public final /* synthetic */ int c = 0;
    public Object d;
    public Object e;

    public mq0(da0 da0Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.e = da0Var;
        this.d = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.c) {
            case 0:
                Object obj = this.d;
                Method method = (Method) this.e;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.d).onMenuItemClick(((da0) this.e).i(menuItem));
        }
    }

    public /* synthetic */ mq0() {
    }
}
