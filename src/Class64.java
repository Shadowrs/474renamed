/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class64 {
    public static JString aJString_1209;
    public static Class65 aClass65_1210;
    public static int anInt1211;
    public static Class37_Sub4_Sub9_Sub3 aClass37_Sub4_Sub9_Sub3_1212;
    public static int anInt1213 = 0;
    public static int anInt1214;
    public static int anInt1215;
    public static boolean aBoolean1216;
    public static int[][][] anIntArrayArrayArray1217;
    public static JString aJString_1218;

    static {
        aJString_1209 = Class37_Sub2.method332((byte) 105,
                "Bitte versuchen Sie es in ");
        aBoolean1216 = false;
        aJString_1218 = null;
        anIntArrayArrayArray1217 = new int[4][105][105];
        aClass65_1210 = new Class65(64);
    }

    public static void method1175(RSSocket class19, int i, boolean bool) {
        if (Class43.aClass19_950 != null) {
            try {
                Class43.aClass19_950.killThread((byte) -128);
            } catch (Exception exception) {
                /* empty */
            }

            Class43.aClass19_950 = null;
        }

        Class43.aClass19_950 = class19;
        Class37_Sub4.method437(151, bool);
        Class37_Sub9.anInt1956 = i;
        Class49.aStream_1006 = null;
        Class37_Sub9_Sub17.aStream_3224.bufferLocation = 0;
        Class60.aClass37_Sub4_Sub13_1152 = null;
        anInt1211++;

        for (;;) {
            Class37_Sub4_Sub13 class37_sub4_sub13 = (Class37_Sub4_Sub13) Class17.aClass13_316.method94(122);

            if (class37_sub4_sub13 == null) {
                break;
            }

            Class6.aClass13_139.method101(class37_sub4_sub13, false,
                class37_sub4_sub13.aLong818);
            Class37_Sub9_Sub12.anInt3121--;
            Class37_Sub4_Sub7_Sub1_Sub1.anInt3953++;
        }

        for (;;) {
            Class37_Sub4_Sub13 class37_sub4_sub13 = ((Class37_Sub4_Sub13) Class37_Sub9_Sub20.aClass13_3297.method94(-115));

            if (class37_sub4_sub13 == null) {
                break;
            }

            ISAAC.aClass77_92.method1288(-1454, class37_sub4_sub13);
            Class37_Sub4_Sub18.aClass13_2905.method101(class37_sub4_sub13,
                false, (class37_sub4_sub13.aLong818));
            Class37_Sub9_Sub26.anInt3396++;
            Class45.anInt974--;
        }

        if (Class75.aByte1409 != 0) {
            try {
                Stream stream = new Stream(4);
                stream.writeByte(4);
                stream.writeByte(Class75.aByte1409);
                stream.writeShort(848881960, 0);
                Class43.aClass19_950.write(0, (byte) 126,
                    stream.buffer, 4);
            } catch (java.io.IOException ioexception) {
                try {
                    Class43.aClass19_950.killThread((byte) -128);
                } catch (Exception exception) {
                    /* empty */
                }

                Class43.aClass19_950 = null;
                Class37_Sub4_Sub12.anInt2785++;
            }
        }

        Class59.anInt1129 = 0;
        Class60.aLong1144 = Class71.method1263((byte) -80);
    }

    public static void method1176(byte i) {
        if (i == 25) {
            anIntArrayArrayArray1217 = null;
            aClass37_Sub4_Sub9_Sub3_1212 = null;
            aJString_1218 = null;
            aJString_1209 = null;
            aClass65_1210 = null;
        }
    }
}
