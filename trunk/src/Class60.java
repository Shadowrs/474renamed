/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class60 {
    public static int anInt1139;
    public static int anInt1140;
    public static JString aJString_1141;
    public static JString aJString_1142 = null;
    public static int anInt1143;
    public static long aLong1144;
    public static JString aJString_1145;
    public static JString aJString_1146;
    public static JString aJString_1147;
    public static JString[] aJStringArray1148;
    public static JString aJString_1150;
    public static Class15_Sub1 aClass15_Sub1_1151;
    public static Class37_Sub4_Sub13 aClass37_Sub4_Sub13_1152;
    public static JString aJString_1153;
    public static int anInt1154;
    public static JString aJString_1155;
    public static JString aJString_1156;
    public static int anInt1157;
    public static int anInt1158;
    public static JString aJString_1159;

    static {
        anInt1140 = 0;

        aJString_1141 = Class37_Sub2.method332((byte) 101,
                " from your friend list first)3");

        aJString_1146 = Class37_Sub2.method332((byte) 117,
                "da dieser Computer gegen unsere ");

        aJString_1150 = Class37_Sub2.method332((byte) 112, "Members only world");
        aJString_1153 = aJString_1150;
        aJString_1145 = aJString_1141;
        aJString_1155 = Class37_Sub2.method332((byte) 109, "wave2:");
        aJString_1156 = Class37_Sub2.method332((byte) 105, "Art");
        aJString_1147 = aJString_1155;
        anInt1154 = -1;
        aJStringArray1148 = new JString[1000];
        aJString_1159 = aJString_1155;
    }

    public int[] anIntArray1149;

    public Class60(int[] is) {
        int i;

        for (i = 1; ((is.length >> -1462635743) + is.length) >= i; i <<= 1) {
            /* empty */
        }

        anIntArray1149 = new int[i + i];

        for (int i_9_ = 0; ((i + i) ^ 0xffffffff) < (i_9_ ^ 0xffffffff);
                i_9_++)
            anIntArray1149[i_9_] = -1;

        for (int i_10_ = 0; (is.length ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
                i_10_++) {
            int i_11_;

            for (i_11_ = is[i_10_] & (-1 + i);
                    anIntArray1149[i_11_ + (i_11_ - -1)] != -1;
                    i_11_ = (i - 1) & (i_11_ + 1)) {
                /* empty */
            }

            anIntArray1149[i_11_ + i_11_] = is[i_10_];
            anIntArray1149[(i_11_ + i_11_) - -1] = i_10_;
        }
    }

    public static void method1165(int i, JS5 class15) {
        Class86.aClass15_1578 = class15;

        if (i != 24434) {
            aJStringArray1148 = null;
        }

        anInt1139++;
    }

    public static void method1166(int i, boolean bool, int i_0_,
        Class37_Sub4_Sub12 class37_sub4_sub12, int i_1_, int i_2_) {
        anInt1158++;

        if ((Class37_Sub3_Sub1.anInt2329 < 50) &&
                ((class37_sub4_sub12.anIntArray2757 != null) &&
                (class37_sub4_sub12.anIntArray2757.length > i))) {
            int i_3_ = class37_sub4_sub12.anIntArray2757[i];

            if (i_3_ != 0) {
                if (i_0_ != -27816) {
                    aJString_1145 = null;
                }

                int i_4_ = 0xf & i_3_;
                int i_5_ = i_3_ >> -713941144;
                int i_6_ = (i_3_ >> -1321261692) & 0x7;

                if (i_4_ == 0) {
                    if (bool) {
                        Class66.method1190((byte) -100, 0, i_6_, i_5_);
                    }
                } else if ((Class43.anInt957 ^ 0xffffffff) != -1) {
                    int i_7_ = (-64 + i_1_) / 128;
                    Class46.anIntArray988[Class37_Sub3_Sub1.anInt2329] = i_5_;

                    Class37_Sub4_Sub10.anIntArray2681[(Class37_Sub3_Sub1.anInt2329)] = i_6_;

                    int i_8_ = (i_2_ + -64) / 128;
                    Class83.anIntArray1520[Class37_Sub3_Sub1.anInt2329] = 0;

                    Class37_Sub9_Sub32.aClass11Array3505[(Class37_Sub3_Sub1.anInt2329)] = null;

                    Class37_Sub4_Sub13.anIntArray2800[(Class37_Sub3_Sub1.anInt2329)] = ((i_8_ << 1918055752) +
                        (i_7_ << 853605456)) - -i_4_;
                    Class37_Sub3_Sub1.anInt2329++;
                }
            }
        }
    }

    public static void method1167(int i) {
        aJString_1155 = null;
        aJString_1150 = null;
        aClass37_Sub4_Sub13_1152 = null;
        aJStringArray1148 = null;
        aJString_1147 = null;
        aJString_1141 = null;
        aClass15_Sub1_1151 = null;
        aJString_1153 = null;
        aJString_1146 = null;
        aJString_1142 = null;
        aJString_1159 = null;

        if (i != 24932) {
            method1165(-2, null);
        }

        aJString_1156 = null;
        aJString_1145 = null;
    }

    public int method1168(int i, int i_12_) {
        anInt1143++;

        int i_13_ = (anIntArray1149.length >> -1186476959) + i;
        int i_14_ = i_13_ & i_12_;

        for (;;) {
            int i_15_ = anIntArray1149[i_14_ - (-i_14_ - 1)];

            if ((i_15_ ^ 0xffffffff) == 0) {
                return -1;
            }

            if ((i_12_ ^ 0xffffffff) == (anIntArray1149[i_14_ + i_14_] ^
                    0xffffffff)) {
                return i_15_;
            }

            i_14_ = i_13_ & (i_14_ + 1);
        }
    }
}
