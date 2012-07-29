/* Class37_Sub4_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub4_Sub18 extends Class37_Sub4 {
    public static JString aJString_2886;
    public static int anInt2888;
    public static Class65 aClass65_2891;
    public static int anInt2892;
    public static int anInt2894;
    public static JString aJString_2896 = Class37_Sub2.method332((byte) 125,
            "Der Anmelde)2Server ist offline)3");
    public static int anInt2898;
    public static JString aJString_2899;
    public static Class13 aClass13_2905;
    public static JString aJString_2906;
    public static Class15 aClass15_2907;
    public static JString aJString_2908;
    public static JString aJString_2909;
    public static JString aJString_2910;

    static {
        aJString_2886 = Class37_Sub2.method332((byte) 110, "Existing User");
        aJString_2899 = aJString_2886;
        aClass65_2891 = new Class65(100);
        aClass13_2905 = new Class13(4096);

        aJString_2910 = (Class37_Sub2.method332((byte) 102,
                "Diese Betatest)2Welt ist nur f-Ur eingeladene"));
        aJString_2909 = Class37_Sub2.method332((byte) 103, "::clientdrop");

        aJString_2906 = Class37_Sub2.method332((byte) 106,
                "Loading )2 please wait)3");
        aJString_2908 = aJString_2906;
    }

    public int anInt2885;
    public int anInt2887;
    public short[] aShortArray2889;
    public short[] aShortArray2890;
    public int anInt2893;
    public int anInt2895 = 128;
    public int anInt2897;
    public int anInt2900;
    public int anInt2901;
    public int anInt2902;
    public short[] aShortArray2903;
    public short[] aShortArray2904;

    public Class37_Sub4_Sub18() {
        anInt2887 = 0;
        anInt2885 = 0;
        anInt2897 = -1;
        anInt2900 = 0;
        anInt2893 = 128;
    }

    public static void method729(int i) {
        if (i != -6) {
            aJString_2909 = null;
        }

        aJString_2896 = null;
        aClass13_2905 = null;
        aJString_2906 = null;
        aJString_2908 = null;
        aJString_2909 = null;
        aJString_2899 = null;
        aJString_2910 = null;
        aClass65_2891 = null;
        aClass15_2907 = null;
        aJString_2886 = null;
    }

    public static Class37_Sub4_Sub14 method730(int i, int i_0_) {
        anInt2894++;

        Class37_Sub4_Sub14 class37_sub4_sub14 = ((Class37_Sub4_Sub14) Class37_Sub9_Sub4.aClass65_2973.method1181((byte) 113,
                (long) i_0_));

        if (class37_sub4_sub14 != null) {
            return class37_sub4_sub14;
        }

        byte[] is = Class37_Sub9_Sub24.aClass15_3364.method131(i_0_, 16, 1);
        class37_sub4_sub14 = new Class37_Sub4_Sub14();

        if (i != -9094) {
            aJString_2896 = null;
        }

        if (is != null) {
            class37_sub4_sub14.method709((byte) 114, new Stream(is));
        }

        Class37_Sub9_Sub4.aClass65_2973.method1179((long) i_0_, -4,
            class37_sub4_sub14);

        return class37_sub4_sub14;
    }

    public Class37_Sub4_Sub7_Sub6 method731(int i, boolean bool) {
        anInt2888++;

        Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = ((Class37_Sub4_Sub7_Sub6) Class37_Sub9_Sub31.aClass65_3489.method1181((byte) 77,
                (long) anInt2902));

        if (class37_sub4_sub7_sub6 == null) {
            Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = Class37_Sub4_Sub7_Sub4.method529(Class73.aClass15_1389,
                    anInt2901, 0);

            if (class37_sub4_sub7_sub4 == null) {
                return null;
            }

            if (aShortArray2904 != null) {
                for (int i_1_ = 0;
                        ((aShortArray2904.length ^ 0xffffffff) < (i_1_ ^
                        0xffffffff)); i_1_++)
                    class37_sub4_sub7_sub4.method535(aShortArray2904[i_1_],
                        aShortArray2903[i_1_]);
            }

            if (aShortArray2890 != null) {
                for (int i_2_ = 0; i_2_ < aShortArray2890.length; i_2_++)
                    class37_sub4_sub7_sub4.method525(aShortArray2890[i_2_],
                        aShortArray2889[i_2_]);
            }

            class37_sub4_sub7_sub6 = class37_sub4_sub7_sub4.method518(anInt2900 +
                    64, anInt2887 + 850, -30, -50, -30, true, true);
            Class37_Sub9_Sub31.aClass65_3489.method1179((long) anInt2902, -4,
                class37_sub4_sub7_sub6);
        }

        Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6_3_;

        if ((anInt2897 != -1) && (i != -1)) {
            class37_sub4_sub7_sub6_3_ = Class37_Sub9_Sub22.method861(-39,
                    anInt2897).method695(class37_sub4_sub7_sub6, i, true);
        } else {
            class37_sub4_sub7_sub6_3_ = class37_sub4_sub7_sub6.method542(true);
        }

        if ((anInt2895 != 128) || ((anInt2893 ^ 0xffffffff) != -129)) {
            class37_sub4_sub7_sub6_3_.method552(anInt2895, anInt2893, anInt2895);
        }

        if (bool != true) {
            return null;
        }

        if (anInt2885 != 0) {
            if (anInt2885 == 90) {
                class37_sub4_sub7_sub6_3_.method553();
            }

            if ((anInt2885 ^ 0xffffffff) == -181) {
                class37_sub4_sub7_sub6_3_.method553();
                class37_sub4_sub7_sub6_3_.method553();
            }

            if ((anInt2885 ^ 0xffffffff) == -271) {
                class37_sub4_sub7_sub6_3_.method553();
                class37_sub4_sub7_sub6_3_.method553();
                class37_sub4_sub7_sub6_3_.method553();
            }
        }

        return class37_sub4_sub7_sub6_3_;
    }

    public void method732(Stream stream, int i) {
        for (;;) {
            int i_4_ = stream.readByte(i ^ ~0xcd);

            if ((i_4_ ^ 0xffffffff) == -1) {
                break;
            }

            method733((byte) -71, i_4_, stream);
        }

        anInt2892++;

        if (i != -181) {
            aJString_2906 = null;
        }
    }

    public void method733(byte i, int i_5_, Stream stream) {
        int i_6_ = -83 % ((28 - i) / 58);

        if (i_5_ == 1) {
            anInt2901 = stream.readShort();
        } else if ((i_5_ ^ 0xffffffff) == -3) {
            anInt2897 = stream.readShort();
        } else if ((i_5_ ^ 0xffffffff) != -5) {
            if ((i_5_ ^ 0xffffffff) == -6) {
                anInt2893 = stream.readShort();
            } else if ((i_5_ ^ 0xffffffff) == -7) {
                anInt2885 = stream.readShort();
            } else if (i_5_ != 7) {
                if (i_5_ != 8) {
                    if (i_5_ != 40) {
                        if (i_5_ == 41) {
                            int i_7_ = stream.readByte(116);
                            aShortArray2890 = new short[i_7_];
                            aShortArray2889 = new short[i_7_];

                            for (int i_8_ = 0;
                                    (i_7_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff);
                                    i_8_++) {
                                aShortArray2890[i_8_] = (short) stream.readShort();

                                aShortArray2889[i_8_] = (short) stream.readShort();
                            }
                        }
                    } else {
                        int i_9_ = stream.readByte(117);
                        aShortArray2904 = new short[i_9_];
                        aShortArray2903 = new short[i_9_];

                        for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
                            aShortArray2904[i_10_] = (short) stream.readShort();

                            aShortArray2903[i_10_] = (short) stream.readShort();
                        }
                    }
                } else {
                    anInt2887 = stream.readByte(120);
                }
            } else {
                anInt2900 = stream.readByte(125);
            }
        } else {
            anInt2895 = stream.readShort();
        }

        anInt2898++;
    }
}
