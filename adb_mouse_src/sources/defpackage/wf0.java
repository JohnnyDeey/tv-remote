package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wf0 {
    public final byte[] a;

    static {
        new wf0(yp0.e("http/1.1"));
        new wf0(yp0.e("spdy/1"));
        new wf0(yp0.e("spdy/2"));
        new wf0(yp0.e("spdy/3"));
        new wf0(yp0.e("stun.turn"));
        new wf0(yp0.e("stun.nat-discovery"));
        new wf0(yp0.e("h2"));
        new wf0(yp0.e("h2c"));
        new wf0(yp0.e("webrtc"));
        new wf0(yp0.e("c-webrtc"));
        new wf0(yp0.e("ftp"));
        new wf0(yp0.e("imap"));
        new wf0(yp0.e("pop3"));
        new wf0(yp0.e("managesieve"));
        new wf0(yp0.e("coap"));
        new wf0(yp0.e("xmpp-client"));
        new wf0(yp0.e("xmpp-server"));
        new wf0(yp0.e("acme-tls/1"));
        new wf0(yp0.e("mqtt"));
        new wf0(yp0.e("dot"));
        new wf0(yp0.e("ntske/1"));
        new wf0(yp0.e("sunrpc"));
        new wf0(yp0.e("h3"));
        new wf0(yp0.e("smb"));
        new wf0(yp0.e("irc"));
        new wf0(yp0.e("nntp"));
        new wf0(yp0.e("nnsp"));
        new wf0(yp0.e("doq"));
    }

    public wf0(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length >= 1 && bArr.length <= 255) {
                this.a = bArr;
                return;
            } else {
                c.k("'bytes' must have length from 1 to 255");
                throw null;
            }
        }
        c.k("'bytes' cannot be null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wf0) {
            if (Arrays.equals(this.a, ((wf0) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return f20.K(this.a);
    }
}
