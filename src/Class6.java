/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.Component;

import java.util.zip.Inflater;


public class Class6 {
    public static JString aJString_134;
    public static JString aJString_135 = Class37_Sub2.method332((byte) 114,
            " more options");
    public static int anInt136;
    public static int anInt137;
    public static Class13 aClass13_139;
    public static JString aJString_140;
    public static JString aJString_141;
    public static int anInt142;
    public static JString aJString_143 = aJString_135;
    public static JString aJString_144;
    public static JString aJString_145;
    public static int anInt146;
    public static JS5 aClass15_147;

    static {
        aJString_141 = Class37_Sub2.method332((byte) 120, "scroll:");
        aJString_134 = aJString_141;
        aJString_140 = aJString_141;
        aClass13_139 = new Class13(4096);
        aJString_144 = Class37_Sub2.method332((byte) 121,
                "Ung-Ultiges Anmelde)2Paket)3");
        aJString_145 = Class37_Sub2.method332((byte) 105, "Versteckt");
    }

    public Inflater anInflater138;

    public Class6() {
        this(-1, 1000000, 1000000);
    }

    public Class6(int i, int i_0_, int i_1_) {
        /* empty */
    }

    public void method58(byte i, byte[] is, Stream stream) {
        try {
            anInt136++;

            if (((stream.buffer[stream.bufferLocation] ^
                    0xffffffff) != -32) ||
                    ((stream.buffer[stream.bufferLocation -
                    -1] ^ 0xffffffff) != 116)) {
                throw new RuntimeException("Invalid GZIP header!");
            }

            if (anInflater138 == null) {
                anInflater138 = new Inflater(true);
            }

            try {
                anInflater138.setInput(stream.buffer,
                    stream.bufferLocation + 10,
                    -18 +
                    (-stream.bufferLocation +
                    (stream.buffer).length));
                anInflater138.inflate(is);

                if (i != 126) {
                    aJString_135 = null;
                }
            } catch (Exception exception) {
                anInflater138.reset();
                throw new RuntimeException("Invalid GZIP compressed data!");
            }

            anInflater138.reset();
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("bh.C(" + i + ',' + ((is != null) ? "{...}" : "null") + ',' +
                ((stream != null) ? "{...}" : "null") + ')'));
        }
    }

    public static void method59(int i) {
        if (i == 1000000) {
            aJString_144 = null;
            aJString_140 = null;
            aJString_143 = null;
            aJString_145 = null;
            aClass15_147 = null;
            aJString_135 = null;
            aClass13_139 = null;
            aJString_141 = null;
            aJString_134 = null;
        }
    }

    public static void method60(int i, Component component) {
        component.removeMouseListener(Class65.aClass9_1221);

        if (i != 593) {
            aJString_141 = null;
        }

        component.removeMouseMotionListener(Class65.aClass9_1221);
        anInt142++;
        component.removeFocusListener(Class65.aClass9_1221);
        Class71.anInt1356 = 0;
    }

    public static Class37_Sub4_Sub9_Sub3 method61(int i, int i_2_, int i_3_,
        JS5 class15) {
        anInt137++;

        if (!Class37_Sub12.method1001(i_3_, class15, (byte) 124, i_2_)) {
            return null;
        }

        if (i < 93) {
            return null;
        }

        return Class33.method299(-115);
    }
}
