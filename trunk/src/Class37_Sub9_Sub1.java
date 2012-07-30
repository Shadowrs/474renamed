/* Class37_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub9_Sub1 extends Class37_Sub9 {
    public static JString aJString_2911;
    public static JString aJString_2912;
    public static int anInt2913;
    public static int anInt2914 = 0;
    public static int anInt2915;
    public static int anInt2916;
    public static JString aJString_2917 = Class37_Sub2.method332((byte) 122,
            "Spiel)2Engine wird gestartet)3)3)3");
    public static int[] anIntArray2918;
    public static int[] anIntArray2919;
    public static boolean[] aBooleanArray2920;
    public static int anInt2921;
    public static int anInt2922;
    public static JString aJString_2923;
    public static int[][][] anIntArrayArrayArray2924;

    static {
        aJString_2911 = null;
        aBooleanArray2920 = new boolean[100];
        anIntArray2918 = new int[32];
        aJString_2912 = null;
        aJString_2923 = Class37_Sub2.method332((byte) 124, "::fpsoff");
    }

    public Class37_Sub9_Sub1() {
        super(3, false);
    }

    public void method750(Stream stream, int i, boolean bool) {
        if (i == 0) {
            aBoolean1943 = (stream.readByte(122) ^ 0xffffffff) == -2;
        }

        anInt2921++;

        if (bool != true) {
            method750(null, 55, false);
        }
    }

    public int[][] method759(byte i, int i_0_) {
        anInt2913++;

        if (i < 111) {
            return null;
        }

        int[][] is = aClass33_1946.method298(false, i_0_);

        if (aClass33_1946.aBoolean767) {
            int[] is_1_ = this.method760(i_0_, 2, -105);
            int[][] is_2_ = this.method762(0, i_0_, (byte) -83);
            int[][] is_3_ = this.method762(1, i_0_, (byte) -119);
            int[] is_4_ = is[2];
            int[] is_5_ = is_2_[0];
            int[] is_6_ = is_2_[1];
            int[] is_7_ = is[1];
            int[] is_8_ = is_2_[2];
            int[] is_9_ = is[0];
            int[] is_10_ = is_3_[0];
            int[] is_11_ = is_3_[1];
            int[] is_12_ = is_3_[2];

            for (int i_13_ = 0;
                    (AbstractDrawingArea.anInt743 ^ 0xffffffff) < (i_13_ ^ 0xffffffff);
                    i_13_++) {
                int i_14_ = is_1_[i_13_];

                if ((i_14_ ^ 0xffffffff) != -4097) {
                    if (i_14_ != 0) {
                        int i_15_ = 4096 - i_14_;

                        is_9_[i_13_] = (((is_10_[i_13_] * i_15_) +
                            (i_14_ * is_5_[i_13_])) >> -878713172);

                        is_7_[i_13_] = (((i_14_ * is_6_[i_13_]) -
                            -(i_15_ * is_11_[i_13_])) >> 1031544940);

                        is_4_[i_13_] = (((i_15_ * is_12_[i_13_]) +
                            (i_14_ * is_8_[i_13_])) >> -1296662932);
                    } else {
                        is_9_[i_13_] = is_10_[i_13_];
                        is_7_[i_13_] = is_11_[i_13_];
                        is_4_[i_13_] = is_12_[i_13_];
                    }
                } else {
                    is_9_[i_13_] = is_5_[i_13_];
                    is_7_[i_13_] = is_6_[i_13_];
                    is_4_[i_13_] = is_8_[i_13_];
                }
            }
        }

        return is;
    }

    public static void method763(byte i) {
        aJString_2912 = null;

        int i_16_ = 113 % ((43 - i) / 55);
        anIntArrayArrayArray2924 = null;
        aBooleanArray2920 = null;
        aJString_2917 = null;
        anIntArray2918 = null;
        anIntArray2919 = null;
        aJString_2911 = null;
        aJString_2923 = null;
    }

    public static void method764(int i, int i_17_, int i_18_, int i_19_,
        int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_) {
        int i_26_ = 47 / ((27 - i_21_) / 52);
        anInt2922++;

        Class37_Sub2 class37_sub2 = (Class37_Sub2) Class37_Sub9_Sub28.aClass58_3427.method1155(0);
        Class37_Sub2 class37_sub2_27_ = null;

        for (; class37_sub2 != null;
                class37_sub2 = (Class37_Sub2) Class37_Sub9_Sub28.aClass58_3427.method1162(
                        (byte) 89)) {
            if (((class37_sub2.anInt1813 ^ 0xffffffff) == (i_20_ ^ 0xffffffff)) &&
                    (class37_sub2.anInt1836 == i_24_) &&
                    (class37_sub2.anInt1829 == i_22_) &&
                    (i_19_ == class37_sub2.anInt1815)) {
                class37_sub2_27_ = class37_sub2;

                break;
            }
        }

        if (class37_sub2_27_ == null) {
            class37_sub2_27_ = new Class37_Sub2();
            class37_sub2_27_.anInt1829 = i_22_;
            class37_sub2_27_.anInt1813 = i_20_;
            class37_sub2_27_.anInt1836 = i_24_;
            class37_sub2_27_.anInt1815 = i_19_;
            Class37_Sub4_Sub7.method489(class37_sub2_27_, (byte) -80);
            Class37_Sub9_Sub28.aClass58_3427.method1149((byte) -122,
                class37_sub2_27_);
        }

        class37_sub2_27_.anInt1833 = i;
        class37_sub2_27_.anInt1837 = i_17_;
        class37_sub2_27_.anInt1816 = i_25_;
        class37_sub2_27_.anInt1828 = i_23_;
        class37_sub2_27_.anInt1823 = i_18_;
    }

    public int[] method761(int i, int i_28_) {
        anInt2915++;

        if (i >= -125) {
            aJString_2912 = null;
        }

        int[] is = aClass38_1966.method1049(i_28_, true);

        if (aClass38_1966.aBoolean850) {
            int[] is_29_ = this.method760(i_28_, 0, -98);
            int[] is_30_ = this.method760(i_28_, 1, -51);
            int[] is_31_ = this.method760(i_28_, 2, -71);

            for (int i_32_ = 0;
                    (i_32_ ^ 0xffffffff) > (AbstractDrawingArea.anInt743 ^ 0xffffffff);
                    i_32_++) {
                int i_33_ = is_31_[i_32_];

                if ((i_33_ ^ 0xffffffff) == -4097) {
                    is[i_32_] = is_29_[i_32_];
                } else if ((i_33_ ^ 0xffffffff) == -1) {
                    is[i_32_] = is_30_[i_32_];
                } else {
                    is[i_32_] = (((4096 + -i_33_) * is_30_[i_32_]) +
                        (is_29_[i_32_] * i_33_)) >> -158419956;
                }
            }
        }

        return is;
    }
}
