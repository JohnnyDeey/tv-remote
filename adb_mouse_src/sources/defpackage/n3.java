package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class n3 implements Closeable {
    public Socket c;
    public OutputStream d;
    public DataInputStream e;

    public final r21 a() {
        byte[] bArr = new byte[24];
        DataInputStream dataInputStream = this.e;
        if (dataInputStream != null) {
            dataInputStream.readFully(bArr);
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byte[] bArr2 = new byte[4];
            order.get(bArr2);
            int i = order.getInt();
            int i2 = order.getInt();
            int i3 = order.getInt();
            int i4 = order.getInt();
            byte[] bArr3 = new byte[4];
            order.get(bArr3);
            byte[] bArr4 = new byte[4];
            for (int i5 = 0; i5 < 4; i5++) {
                bArr4[i5] = (byte) (~bArr2[i5]);
            }
            if (Arrays.equals(bArr3, bArr4)) {
                Charset charset = qg.a;
                String str = new String(bArr2, charset);
                byte[] bytes = str.getBytes(charset);
                bytes.getClass();
                if (bytes.length == 4) {
                    byte[] bArr5 = new byte[i3];
                    DataInputStream dataInputStream2 = this.e;
                    if (dataInputStream2 != null) {
                        dataInputStream2.readFully(bArr5);
                        int i6 = 0;
                        for (int i7 = 0; i7 < i3; i7++) {
                            i6 += bArr5[i7] & 255;
                        }
                        if (i6 != i4 && i4 != 0) {
                            c.k("Failed requirement.");
                            return null;
                        }
                        switch (str.hashCode()) {
                            case 2020776:
                                if (str.equals("AUTH")) {
                                    f0.d.getClass();
                                    iu iuVar = f0.i;
                                    iuVar.getClass();
                                    p0 p0Var = new p0(iuVar);
                                    while (p0Var.hasNext()) {
                                        f0 f0Var = (f0) p0Var.next();
                                        if (f0Var.c == i) {
                                            return new g0(f0Var, bArr5);
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                break;
                            case 2071675:
                                if (str.equals("CLSE")) {
                                    return new oe(i, i2);
                                }
                                break;
                            case 2073761:
                                if (str.equals("CNXN")) {
                                    return new ve(new String(bArr5, qg.a), i, i2);
                                }
                                break;
                            case 2427668:
                                if (str.equals("OKAY")) {
                                    return new qc0(i, i2);
                                }
                                break;
                            case 2432586:
                                if (str.equals("OPEN")) {
                                    return new rc0(new String(bArr5, qg.a), i);
                                }
                                break;
                            case 2555816:
                                if (str.equals("STLS")) {
                                    return new kl0(i);
                                }
                                break;
                            case 2673292:
                                if (str.equals("WRTE")) {
                                    return new zz0(bArr5, i, i2);
                                }
                                break;
                        }
                        c.k("Unknown command: ".concat(str));
                        return null;
                    }
                    k20.p0("input");
                    throw null;
                }
                c.k("Command must be exactly 4 bytes");
                return null;
            }
            c.k("Magic must be equal command ^ 0xffffffff");
            return null;
        }
        k20.p0("input");
        throw null;
    }

    public final void b(r21 r21Var) {
        s3 N = r21Var.N();
        q3 q3Var = N.a;
        int i = q3Var.d;
        ByteBuffer allocate = ByteBuffer.allocate(i + 24);
        byte[] bytes = q3Var.a.getBytes(qg.a);
        bytes.getClass();
        int length = bytes.length;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) (~bytes[i2]);
        }
        ByteBuffer order = ByteBuffer.allocate(24).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bytes);
        order.putInt(q3Var.b);
        order.putInt(q3Var.c);
        order.putInt(i);
        order.putInt(q3Var.e);
        order.put(bArr);
        byte[] array = order.array();
        array.getClass();
        allocate.put(array);
        allocate.put(N.b);
        byte[] array2 = allocate.array();
        array2.getClass();
        OutputStream outputStream = this.d;
        if (outputStream != null) {
            outputStream.write(array2);
            OutputStream outputStream2 = this.d;
            if (outputStream2 != null) {
                outputStream2.flush();
                return;
            } else {
                k20.p0("output");
                throw null;
            }
        }
        k20.p0("output");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Socket socket = this.c;
        if (socket != null) {
            try {
                socket.close();
            } catch (Exception e) {
                Log.e("ERR", mn.Q(e));
            }
        }
    }
}
