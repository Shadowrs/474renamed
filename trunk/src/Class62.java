/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class62 {
    public static int anInt1171;
    public static int anInt1172;
    public static int anInt1174;
    public static int anInt1175;
    public static int anInt1176;
    public static Class13 aClass13_1177 = new Class13(512);
    public static int[] anIntArray1180;
    public static JString aJString_1181;
    public static int[] anIntArray1183 = new int[500];
    public static Class13 aClass13_1185;

    static {
        aJString_1181 = (Class37_Sub2.method332((byte) 121,
                "Wir vermuten)1 dass Ihr Konto gestohlen wurde"));
    }

    public int anInt1173;
    public int anInt1178;
    public byte aByte1179;
    public int anInt1182;
    public int anInt1184;
    public int anInt1186;

    public Class62() {
        /* empty */
    }

    public Class62(Stream stream) {
        aByte1179 = stream.method982((byte) 97);
        anInt1182 = stream.method980(103);
        anInt1173 = stream.readInt(-27);
        anInt1186 = stream.readInt(-59);
        anInt1184 = stream.readInt(-115);
        anInt1178 = stream.readInt(-69);
    }

    public static void method1170(int i) {
        aClass13_1185 = null;
        anIntArray1183 = null;
        anIntArray1180 = null;
        aJString_1181 = null;

        if (i >= -90) {
            anIntArray1180 = null;
        }

        aClass13_1177 = null;
    }

    public int method1171(int i) {
        if (i != 1) {
            return -104;
        }

        anInt1175++;

        return aByte1179 & 0x7;
    }

    public int method1172(byte i) {
        anInt1171++;

        if (i < 24) {
            method1170(11);
        }

        if ((aByte1179 & 0x8) == 8) {
            return 1;
        }

        return 0;
    }

    public static void method1173(int i) {
        Class42.aStream_Sub1_936.method989(-1494101117, 151);
        Class37_Sub9_Sub34.anInt3542++;

        if (i != -9) {
            anIntArray1183 = null;
        }

        anInt1176++;

        for (Class37_Sub6 class37_sub6 = (Class37_Sub6) Class76.aClass13_1423.method94(
                    -52); class37_sub6 != null;
                class37_sub6 = (Class37_Sub6) Class76.aClass13_1423.method102(
                        (byte) 54)) {
            if (((class37_sub6.anInt1882 ^ 0xffffffff) == -1) ||
                    (class37_sub6.anInt1882 == 3)) {
                PacketStream.method992(-1494101117, class37_sub6, true);
            }
        }

        if (Class79.aClass18_1489 != null) {
            Class73.method1274(Class79.aClass18_1489, -1);
            Class79.aClass18_1489 = null;
        }
    }
}
