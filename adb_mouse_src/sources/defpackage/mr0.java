package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class mr0 extends f1 {
    public final TextInputLayout d;

    public mr0(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // defpackage.f1
    public final void d(View view, s1 s1Var) {
        CharSequence charSequence;
        boolean z;
        String str;
        AccessibilityNodeInfo accessibilityNodeInfo = s1Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z2 = textInputLayout.x0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        if (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) {
            z = false;
        } else {
            z = true;
        }
        if (!isEmpty2) {
            str = hint.toString();
        } else {
            str = "";
        }
        op0 op0Var = textInputLayout.d;
        s7 s7Var = op0Var.d;
        if (s7Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(s7Var);
            accessibilityNodeInfo.setTraversalAfter(s7Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(op0Var.f);
        }
        if (!isEmpty) {
            s1Var.j(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            s1Var.j(str);
            if (!z2 && placeholderText != null) {
                s1Var.j(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            s1Var.j(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                if (i >= 26) {
                    accessibilityNodeInfo.setHintText(str);
                } else {
                    accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
                }
            } else {
                if (!isEmpty) {
                    str = ((Object) charSequence) + ", " + str;
                }
                s1Var.j(str);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                s1Var.h(4, isEmpty);
            }
        }
        if (charSequence == null || charSequence.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        s7 s7Var2 = textInputLayout.m.y;
        if (s7Var2 != null) {
            accessibilityNodeInfo.setLabelFor(s7Var2);
        }
        textInputLayout.e.b().m(s1Var);
    }

    @Override // defpackage.f1
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.e.b().n(accessibilityEvent);
    }
}
