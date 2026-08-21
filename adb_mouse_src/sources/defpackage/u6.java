package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class u6 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        jk jkVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                jkVar = new i81(clipData, 3);
            } else {
                kk kkVar = new kk();
                kkVar.d = clipData;
                kkVar.e = 3;
                jkVar = kkVar;
            }
            ry0.i(textView, jkVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        jk jkVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            jkVar = new i81(clipData, 3);
        } else {
            kk kkVar = new kk();
            kkVar.d = clipData;
            kkVar.e = 3;
            jkVar = kkVar;
        }
        ry0.i(view, jkVar.build());
        return true;
    }
}
