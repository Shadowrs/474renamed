/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class38 {
    public static JString aJString_824;
    public static int anInt825;
    public static int anInt826;
    public static JString aJString_827;
    public static int anInt829;
    public static JString aJString_830;
    public static JString aJString_831 = Class37_Sub2.method332((byte) 111, " ");
    public static int anInt833;
    public static int anInt834;
    public static JString aJString_835;
    public static int anInt837 = 2;
    public static int anInt839;
    public static JString aJString_840;
    public static JString aJString_842;
    public static JString aJString_843;
    public static int anInt845;
    public static JString aJString_846;
    public static Class67 aClass67_847;
    public static int anInt848;
    public static int anInt851;
    public static int anInt852;

    static {
        aJString_827 = aJString_831;

        aJString_840 = Class37_Sub2.method332((byte) 127,
                "Login limit exceeded)3");

        aJString_824 = Class37_Sub2.method332((byte) 119,
                " is already on your ignore list)3");
        aJString_843 = Class37_Sub2.method332((byte) 122, ":duelreq:");
        aJString_835 = aJString_840;
        aJString_830 = Class37_Sub2.method332((byte) 122, "<col=80ff00>");
        anInt851 = 0;

        aJString_842 = Class37_Sub2.method332((byte) 114, "Titelbild geladen)3");
        aJString_846 = aJString_824;
    }

    public int anInt828 = 0;
    public Class58 aClass58_832;
    public Class37_Sub16[] aClass37_Sub16Array836;
    public int anInt838;
    public int anInt841 = -1;
    public int[][] anIntArrayArray844;
    public int anInt849;
    public boolean aBoolean850;

    public Class38(int i, int i_40_, int i_41_) {
        aClass58_832 = new Class58();
        aBoolean850 = false;
        aClass37_Sub16Array836 = new Class37_Sub16[i_40_];
        anInt849 = i_40_;
        anInt838 = i;
        anIntArrayArray844 = new int[i][i_41_];
    }

    public static void method1048(int i) {
        if (i == -15581) {
            for (Class37_Sub7 class37_sub7 = (Class37_Sub7) Class37_Sub4.aClass58_1857.method1155(
                        0); class37_sub7 != null;
                    class37_sub7 = (Class37_Sub7) Class37_Sub4.aClass58_1857.method1162(
                            (byte) 78)) {
                if (class37_sub7.aClass37_Sub3_Sub4_1896 != null) {
                    Class1.aClass37_Sub3_Sub2_59.method353(class37_sub7.aClass37_Sub3_Sub4_1896);
                    class37_sub7.aClass37_Sub3_Sub4_1896 = null;
                }

                if (class37_sub7.aClass37_Sub3_Sub4_1917 != null) {
                    Class1.aClass37_Sub3_Sub2_59.method353(class37_sub7.aClass37_Sub3_Sub4_1917);
                    class37_sub7.aClass37_Sub3_Sub4_1917 = null;
                }
            }

            anInt825++;
            Class37_Sub4.aClass58_1857.method1154(64);
        }
    }

    public int[] method1049(int i, boolean bool) {
        anInt826++;

        if (bool != true) {
            anIntArrayArray844 = null;
        }

        if (anInt849 != anInt838) {
            if (anInt838 != 1) {
                Class37_Sub16 class37_sub16 = aClass37_Sub16Array836[i];

                if (aBoolean850 = class37_sub16 == null) {
                    if ((anInt838 ^ 0xffffffff) >= (anInt828 ^ 0xffffffff)) {
                        Class37_Sub16 class37_sub16_0_ = (Class37_Sub16) aClass58_832.method1157(false);

                        class37_sub16 = new Class37_Sub16(i,
                                class37_sub16_0_.anInt2156);

                        aClass37_Sub16Array836[class37_sub16_0_.anInt2148] = null;
                        class37_sub16_0_.method322(false);
                    } else {
                        class37_sub16 = new Class37_Sub16(i, anInt828);
                        anInt828++;
                    }

                    aClass37_Sub16Array836[i] = class37_sub16;
                }

                aClass58_832.method1150(9282, class37_sub16);

                return anIntArrayArray844[class37_sub16.anInt2156];
            }

            aBoolean850 = (anInt841 ^ 0xffffffff) != (i ^ 0xffffffff);
            anInt841 = i;

            return anIntArrayArray844[0];
        }

        aBoolean850 = aClass37_Sub16Array836[i] == null;
        aClass37_Sub16Array836[i] = RSSocket.aClass37_Sub16_472;

        return anIntArrayArray844[i];
    }

    public static int method1050(int i, int i_1_, Class18 class18) {
        anInt852++;

        if ((class18.anIntArrayArray434 == null) ||
                ((i_1_ ^ 0xffffffff) <= (class18.anIntArrayArray434.length ^
                0xffffffff))) {
            return -2;
        }

        try {
            int i_2_ = 0;
            int[] is = class18.anIntArrayArray434[i_1_];

            if (i != -29842) {
                aJString_830 = null;
            }

            int i_3_ = 0;
            int i_4_ = 0;

            for (;;) {
                int i_5_ = is[i_3_++];
                int i_6_ = 0;
                int i_7_ = 0;

                if ((i_5_ ^ 0xffffffff) == -1) {
                    return i_2_;
                }

                if ((i_5_ ^ 0xffffffff) == -16) {
                    i_7_ = 1;
                }

                if ((i_5_ ^ 0xffffffff) == -2) {
                    i_6_ = Class82.anIntArray1696[is[i_3_++]];
                }

                if ((i_5_ ^ 0xffffffff) == -3) {
                    i_6_ = Class68.anIntArray1324[is[i_3_++]];
                }

                if (i_5_ == 3) {
                    i_6_ = Class37_Sub12.anIntArray2104[is[i_3_++]];
                }

                if ((i_5_ ^ 0xffffffff) == -17) {
                    i_7_ = 2;
                }

                if ((i_5_ ^ 0xffffffff) == -18) {
                    i_7_ = 3;
                }

                if ((i_5_ ^ 0xffffffff) == -5) {
                    int i_8_ = is[i_3_++] << -2062183792;
                    i_8_ += is[i_3_++];

                    Class18 class18_9_ = Class37_Sub9_Sub14.method820(i_8_, 4096);
                    int i_10_ = is[i_3_++];

                    if ((i_10_ != -1) &&
                            (!Class46.method1108(i_10_, (byte) 124).aBoolean2509 ||
                            Class37_Sub4_Sub13.aBoolean2791)) {
                        for (int i_11_ = 0;
                                i_11_ < class18_9_.anIntArray356.length;
                                i_11_++) {
                            if (((1 + i_10_) ^ 0xffffffff) == (class18_9_.anIntArray356[i_11_] ^
                                    0xffffffff)) {
                                i_6_ += class18_9_.anIntArray422[i_11_];
                            }
                        }
                    }
                }

                if (i_5_ == 5) {
                    i_6_ = Class37_Sub23.anIntArray2237[is[i_3_++]];
                }

                if (i_5_ == 6) {
                    i_6_ = (Class17.anIntArray307[-1 +
                        Class68.anIntArray1324[is[i_3_++]]]);
                }

                if ((i_5_ ^ 0xffffffff) == -8) {
                    i_6_ = ((Class37_Sub23.anIntArray2237[is[i_3_++]] * 100) / 46875);
                }

                if ((i_5_ ^ 0xffffffff) == -9) {
                    i_6_ = (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3978);
                }

                if (i_5_ == 9) {
                    for (int i_12_ = 0; i_12_ < 25; i_12_++) {
                        if (Class37_Sub4_Sub7_Sub3.aBooleanArray3748[i_12_]) {
                            i_6_ += Class68.anIntArray1324[i_12_];
                        }
                    }
                }

                if (i_5_ == 10) {
                    int i_13_ = is[i_3_++] << 20671440;
                    i_13_ += is[i_3_++];

                    Class18 class18_14_ = Class37_Sub9_Sub14.method820(i_13_,
                            4096);
                    int i_15_ = is[i_3_++];

                    if ((i_15_ != -1) &&
                            (!Class46.method1108(i_15_, (byte) 80).aBoolean2509 ||
                            Class37_Sub4_Sub13.aBoolean2791)) {
                        for (int i_16_ = 0;
                                i_16_ < class18_14_.anIntArray356.length;
                                i_16_++) {
                            if (((i_15_ - -1) ^ 0xffffffff) == (class18_14_.anIntArray356[i_16_] ^
                                    0xffffffff)) {
                                i_6_ = 999999999;

                                break;
                            }
                        }
                    }
                }

                if ((i_5_ ^ 0xffffffff) == -12) {
                    i_6_ = Class37_Sub4_Sub16.anInt2864;
                }

                if (i_5_ == 12) {
                    i_6_ = Class33.anInt761;
                }

                if ((i_5_ ^ 0xffffffff) == -14) {
                    int i_17_ = Class37_Sub23.anIntArray2237[is[i_3_++]];
                    int i_18_ = is[i_3_++];
                    i_6_ = (((i_17_ & (1 << i_18_)) ^ 0xffffffff) != -1) ? 1 : 0;
                }

                if ((i_5_ ^ 0xffffffff) == -15) {
                    int i_19_ = is[i_3_++];
                    i_6_ = Stream.method983(i_19_, 124);
                }

                if ((i_5_ ^ 0xffffffff) == -19) {
                    i_6_ = (Class37_Sub18.anInt2200 +
                        ((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666) >> -909385657));
                }

                if ((i_5_ ^ 0xffffffff) == -20) {
                    i_6_ = ((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642) >> 413310695) -
                        -Class15_Sub1.anInt1738;
                }

                if (i_5_ == 20) {
                    i_6_ = is[i_3_++];
                }

                if ((i_7_ ^ 0xffffffff) != -1) {
                    i_4_ = i_7_;
                } else {
                    if (i_4_ == 0) {
                        i_2_ += i_6_;
                    }

                    if ((i_4_ ^ 0xffffffff) == -2) {
                        i_2_ -= i_6_;
                    }

                    if (((i_4_ ^ 0xffffffff) == -3) && (i_6_ != 0)) {
                        i_2_ /= i_6_;
                    }

                    if (i_4_ == 3) {
                        i_2_ *= i_6_;
                    }

                    i_4_ = 0;
                }
            }
        } catch (Exception exception) {
            return -1;
        }
    }

    public static void method1051(int i) {
        aJString_824 = null;
        aClass67_847 = null;
        aJString_840 = null;

        if (i <= -122) {
            aJString_842 = null;
            aJString_843 = null;
            aJString_846 = null;
            aJString_831 = null;
            aJString_830 = null;
            aJString_827 = null;
            aJString_835 = null;
        }
    }

    public static void method1052(JString jstring, int i, int i_20_,
        JString jstring_21_, JString jstring_22_) {
        do {
            try {
                for (int i_23_ = 99; (i_23_ ^ 0xffffffff) < -1; i_23_--) {
                    Class41.anIntArray902[i_23_] = Class41.anIntArray902[-1 +
                        i_23_];

                    Class37_Sub9_Sub29.aJStringArray3450[i_23_] = Class37_Sub9_Sub29.aJStringArray3450[-1 +
                        i_23_];

                    Stream.aJStringArray2041[i_23_] = Stream.aJStringArray2041[-1 +
                        i_23_];

                    Class37_Sub12.aJStringArray2093[i_23_] = Class37_Sub12.aJStringArray2093[-1 +
                        i_23_];
                }

                anInt845++;
                Class77.anInt1447 = Class83.anInt1515;
                Class8.anInt168++;
                Class41.anIntArray902[0] = i;
                Class37_Sub9_Sub29.aJStringArray3450[0] = jstring;
                Stream.aJStringArray2041[0] = jstring_21_;
                Class37_Sub12.aJStringArray2093[0] = jstring_22_;

                if (i_20_ > 36) {
                    break;
                }

                aJString_827 = null;
            } catch (RuntimeException runtimeexception) {
                throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                    ("lc.J(" + ((jstring != null) ? "{...}" : "null") + ',' +
                    i + ',' + i_20_ + ',' +
                    ((jstring_21_ != null) ? "{...}" : "null") + ',' +
                    ((jstring_22_ != null) ? "{...}" : "null") + ')'));
            }

            break;
        } while (false);
    }

    public int[][] method1053(int i) {
        anInt848++;

        if ((anInt849 ^ 0xffffffff) != (anInt838 ^ 0xffffffff)) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }

        if (i <= 16) {
            return null;
        }

        for (int i_24_ = 0; anInt838 > i_24_; i_24_++)
            aClass37_Sub16Array836[i_24_] = RSSocket.aClass37_Sub16_472;

        return anIntArrayArray844;
    }

    public static void method1054(JString jstring, int i, byte i_25_,
        boolean bool, Class15 class15, JString jstring_26_) {
        try {
            anInt834++;

            int i_27_ = class15.method123((byte) 32, jstring);

            if (i_25_ <= 31) {
                aJString_842 = null;
            }

            int i_28_ = class15.method128(jstring_26_, -91, i_27_);
            Class15.method120(i, i_28_, bool, -15793, class15, i_27_);
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("lc.I(" + ((jstring != null) ? "{...}" : "null") + ',' + i +
                ',' + i_25_ + ',' + bool + ',' +
                ((class15 != null) ? "{...}" : "null") + ',' +
                ((jstring_26_ != null) ? "{...}" : "null") + ')'));
        }
    }

    public static void method1055(byte i) {
        Class83.packetStream.method993(false);
        anInt833++;

        int i_29_ = Class83.packetStream.method996(8, 14);

        if ((i_29_ ^ 0xffffffff) > (Class76.anInt1436 ^ 0xffffffff)) {
            for (int i_30_ = i_29_; Class76.anInt1436 > i_30_; i_30_++)
                Applet_Sub1.anIntArray30[Class37_Sub9_Sub21.anInt3306++] = Class37_Sub4_Sub16.anIntArray2869[i_30_];
        }

        if (i == -12) {
            if ((Class76.anInt1436 ^ 0xffffffff) > (i_29_ ^ 0xffffffff)) {
                throw new RuntimeException("gnpov1");
            }

            Class76.anInt1436 = 0;

            for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > (i_29_ ^ 0xffffffff);
                    i_31_++) {
                int i_32_ = Class37_Sub4_Sub16.anIntArray2869[i_31_];
                Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_32_]);
                int i_33_ = Class83.packetStream.method996(1,
                        i ^ ~0x39);

                if ((i_33_ ^ 0xffffffff) == -1) {
                    Class37_Sub4_Sub16.anIntArray2869[Class76.anInt1436++] = i_32_;

                    class37_sub4_sub7_sub1_sub1.anInt3641 = Class37_Sub7.anInt1898;
                } else {
                    int i_34_ = Class83.packetStream.method996(2, 60);

                    if ((i_34_ ^ 0xffffffff) == -1) {
                        Class37_Sub4_Sub16.anIntArray2869[Class76.anInt1436++] = i_32_;

                        class37_sub4_sub7_sub1_sub1.anInt3641 = Class37_Sub7.anInt1898;

                        Class36.anIntArray809[Class37_Sub9_Sub11.anInt3098++] = i_32_;
                    } else if ((i_34_ ^ 0xffffffff) == -2) {
                        Class37_Sub4_Sub16.anIntArray2869[Class76.anInt1436++] = i_32_;

                        class37_sub4_sub7_sub1_sub1.anInt3641 = Class37_Sub7.anInt1898;

                        int i_35_ = Class83.packetStream.method996(3,
                                99);
                        class37_sub4_sub7_sub1_sub1.method495(false, i + -3511,
                            i_35_);

                        int i_36_ = Class83.packetStream.method996(1,
                                118);

                        if (i_36_ == 1) {
                            Class36.anIntArray809[Class37_Sub9_Sub11.anInt3098++] = i_32_;
                        }
                    } else if (i_34_ == 2) {
                        Class37_Sub4_Sub16.anIntArray2869[Class76.anInt1436++] = i_32_;

                        class37_sub4_sub7_sub1_sub1.anInt3641 = Class37_Sub7.anInt1898;

                        int i_37_ = Class83.packetStream.method996(3,
                                i ^ ~0x3e);
                        class37_sub4_sub7_sub1_sub1.method495(true, i ^ 0xdc9,
                            i_37_);

                        int i_38_ = Class83.packetStream.method996(3,
                                43);
                        class37_sub4_sub7_sub1_sub1.method495(true, -3523, i_38_);

                        int i_39_ = Class83.packetStream.method996(1,
                                98);

                        if ((i_39_ ^ 0xffffffff) == -2) {
                            Class36.anIntArray809[Class37_Sub9_Sub11.anInt3098++] = i_32_;
                        }
                    } else if ((i_34_ ^ 0xffffffff) == -4) {
                        Applet_Sub1.anIntArray30[Class37_Sub9_Sub21.anInt3306++] = i_32_;
                    }
                }
            }
        }
    }

    public static void method1056(boolean bool) {
        if (bool != true) {
            aJString_830 = null;
        }

        anInt829++;

        if (Signlink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
            Class37_Sub5.anIntArray1879[188] = 71;
            Class37_Sub5.anIntArray1879[186] = 57;
            Class37_Sub5.anIntArray1879[189] = 26;
            Class37_Sub5.anIntArray1879[223] = 28;
            Class37_Sub5.anIntArray1879[191] = 73;
            Class37_Sub5.anIntArray1879[192] = 58;
            Class37_Sub5.anIntArray1879[220] = 74;
            Class37_Sub5.anIntArray1879[222] = 59;
            Class37_Sub5.anIntArray1879[190] = 72;
            Class37_Sub5.anIntArray1879[187] = 27;
            Class37_Sub5.anIntArray1879[221] = 43;
            Class37_Sub5.anIntArray1879[219] = 42;
        } else {
            if (Signlink.aMethod1035 == null) {
                Class37_Sub5.anIntArray1879[222] = 59;
                Class37_Sub5.anIntArray1879[192] = 58;
            } else {
                Class37_Sub5.anIntArray1879[520] = 59;
                Class37_Sub5.anIntArray1879[222] = 58;
                Class37_Sub5.anIntArray1879[192] = 28;
            }

            Class37_Sub5.anIntArray1879[92] = 74;
            Class37_Sub5.anIntArray1879[46] = 72;
            Class37_Sub5.anIntArray1879[93] = 43;
            Class37_Sub5.anIntArray1879[47] = 73;
            Class37_Sub5.anIntArray1879[45] = 26;
            Class37_Sub5.anIntArray1879[61] = 27;
            Class37_Sub5.anIntArray1879[59] = 57;
            Class37_Sub5.anIntArray1879[91] = 42;
            Class37_Sub5.anIntArray1879[44] = 71;
        }
    }

    public void method1057(byte i) {
        anInt839++;

        if (i == -92) {
            for (int i_42_ = 0; (anInt838 ^ 0xffffffff) < (i_42_ ^ 0xffffffff);
                    i_42_++)
                anIntArrayArray844[i_42_] = null;

            aClass37_Sub16Array836 = null;
            anIntArrayArray844 = null;
            aClass58_832.method1154(64);
            aClass58_832 = null;
        }
    }
}
