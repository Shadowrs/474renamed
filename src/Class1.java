/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class1 {
    public static JString aJString_57;
    public static int anInt58;
    public static Class37_Sub3_Sub2 aClass37_Sub3_Sub2_59;
    public static int anInt60;
    public static Class18 aClass18_61;
    public static int anInt62;
    public static byte[][][] aByteArrayArrayArray63 = new byte[4][104][104];
    public static int anInt64;
    public static int anInt65;
    public static JString aJString_66;
    public static volatile int anInt67 = 0;
    public static JString aJString_68;
    public static int[] anIntArray69;
    public static JString aJString_70;
    public static JString aJString_71;
    public static JString aJString_72;

    static {
        aJString_66 = Class37_Sub2.method332((byte) 119,
                "Ein kostenloses Spielkonto erstellen)3");
        anInt62 = 0;
        aJString_70 = Class37_Sub2.method332((byte) 111, "hel");
        aJString_68 = Class37_Sub2.method332((byte) 127, "Loaded wordpack");
        aJString_57 = aJString_68;

        aJString_72 = Class37_Sub2.method332((byte) 125,
                "Ung-Ultige Session)2ID)3");
        aJString_71 = Class37_Sub2.method332((byte) 119, "leuchten1:");
    }

    public static void method39(int i, int i_0_, int i_1_, int i_2_, int i_3_,
        int i_4_, int i_5_, int i_6_) {
        anInt58++;

        if (i_5_ >= -4) {
            anIntArray69 = null;
        }

        if (Class37_Sub10.method927(i_0_, 27323)) {
            Class26.method258(i_3_, i, i_1_, i_2_, i_4_, -1, (byte) -45, i_6_,
                Class37_Sub9_Sub29.aClass18ArrayArray3454[i_0_]);
        }
    }

    public static Class37_Sub15 method40(Class15 class15, int i, byte i_7_) {
        anInt64++;

        if (i_7_ >= -20) {
            anInt62 = -117;
        }

        byte[] is = class15.method111(i, (byte) 94);

        if (is == null) {
            return null;
        }

        return new Class37_Sub15(is);
    }

    public static void method41(int i) {
        aJString_72 = null;
        aJString_70 = null;
        aJString_71 = null;
        anIntArray69 = null;
        aByteArrayArrayArray63 = null;
        aClass37_Sub3_Sub2_59 = null;

        if (i != -1788) {
            aJString_71 = null;
        }

        aJString_66 = null;
        aJString_57 = null;
        aClass18_61 = null;
        aJString_68 = null;
    }

    public static void method42(byte i) {
        if (i >= -91) {
            anIntArray69 = null;
        }

        for (Class37_Sub7 class37_sub7 = (Class37_Sub7) Class37_Sub4.aClass58_1857.method1155(
                    0); class37_sub7 != null;
                class37_sub7 = (Class37_Sub7) Class37_Sub4.aClass58_1857.method1162(
                        (byte) 44)) {
            if (class37_sub7.aObjectDef_1901 != null) {
                class37_sub7.method744(-870);
            }
        }

        anInt60++;
    }
}
