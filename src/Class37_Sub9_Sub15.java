/* Class37_Sub9_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub9_Sub15 extends Class37_Sub9 {
    public static JString aJString_3158 = Class37_Sub2.method332((byte) 105,
            "Loaded sprites");
    public static Class15 aClass15_3159;
    public static JString aJString_3160;
    public static JString aJString_3162;
    public static int anInt3163;
    public static JString aJString_3164;
    public static JString aJString_3165;
    public static int anInt3166;
    public static int anInt3167;
    public static JString aJString_3168 = Class37_Sub2.method332((byte) 121,
            "Create a free account");
    public static int anInt3169;
    public static JString aJString_3170 = Class37_Sub2.method332((byte) 118,
            "Keine Antwort vom Anmelde)2Server)3");
    public static int anInt3171;
    public static int anInt3173;
    public static int anInt3174;
    public static Stream[] aStreamArray3175;
    public static int anInt3176;
    public static int anInt3177;
    public static JString aJString_3178;
    public static int anInt3180;
    public static JString aJString_3181;
    public static int anInt3182;

    static {
        aJString_3165 = Class37_Sub2.method332((byte) 108, "yellow:");
        anInt3169 = 0;
        aJString_3164 = aJString_3158;
        aJString_3160 = (Class37_Sub2.method332((byte) 111,
                "Startseite auf (WSpielkonto wiederherstellen(W)3"));
        aStreamArray3175 = new Stream[2048];
        aJString_3162 = aJString_3168;
        aJString_3178 = aJString_3165;
        aJString_3181 = aJString_3165;
        anInt3182 = 0;
    }

    public int[][] anIntArrayArray3157;
    public int anInt3161 = 0;
    public int[] anIntArray3172;
    public int[] anIntArray3179;

    public Class37_Sub9_Sub15() {
        super(1, true);
    }

    public static void method822(byte i) {
        for (Class37_Sub6 class37_sub6 = (Class37_Sub6) Class76.aClass13_1423.method94(
                    -35); class37_sub6 != null;
                class37_sub6 = (Class37_Sub6) Class76.aClass13_1423.method102(
                        (byte) 67)) {
            int i_0_ = class37_sub6.anInt1884;

            if (Class37_Sub10.method927(i_0_, 27323)) {
                boolean bool = true;
                Class18[] class18s = Class37_Sub9_Sub29.aClass18ArrayArray3454[i_0_];

                for (int i_1_ = 0; i_1_ < class18s.length; i_1_++) {
                    if (class18s[i_1_] != null) {
                        bool = class18s[i_1_].aBoolean374;

                        break;
                    }
                }

                if (!bool) {
                    int i_2_ = (int) class37_sub6.aLong818;
                    Class18 class18 = Class37_Sub9_Sub14.method820(i_2_,
                            i ^ 0x1060);

                    if (class18 != null) {
                        Class73.method1274(class18, -1);
                    }
                }
            }
        }

        anInt3173++;

        if (i != 96) {
            method825(100);
        }
    }

    public int[] method761(int i, int i_3_) {
        int[] is = aClass38_1966.method1049(i_3_, true);

        if (i >= -125) {
            anIntArray3172 = null;
        }

        anInt3180++;
while_71_: 
        do {
            if (aClass38_1966.aBoolean850) {
                int[] is_4_ = this.method760(i_3_, 0, -81);
                int i_5_ = anInt3161;

                do {
                    if (i_5_ != 2) {
                        if (i_5_ != 1) {
                            break;
                        }
                    } else {
                        for (i_5_ = 0;
                                ((Class32.anInt743 ^ 0xffffffff) < (i_5_ ^
                                0xffffffff)); i_5_++) {
                            int i_6_ = is_4_[i_5_];
                            int i_7_;

                            for (i_7_ = 1;
                                    i_7_ < (-1 + anIntArrayArray3157.length);
                                    i_7_++) {
                                if ((anIntArrayArray3157[i_7_][0] ^ 0xffffffff) < (i_6_ ^
                                        0xffffffff)) {
                                    break;
                                }
                            }

                            int[] is_8_ = anIntArrayArray3157[-1 + i_7_];
                            int[] is_9_ = anIntArrayArray3157[i_7_];
                            int i_10_ = method826(-28401, -2 + i_7_)[1];
                            int i_11_ = is_8_[1];
                            int i_12_ = is_9_[1];
                            int i_13_ = method826(-28401, 1 + i_7_)[1];
                            int i_14_ = i_11_ + -i_10_ + (-i_12_ + i_13_);
                            int i_15_ = (((-is_8_[0] + i_6_) << -467335092) / (is_9_[0] +
                                -is_8_[0]));
                            int i_16_ = (i_15_ * i_15_) >> 494001356;
                            int i_17_ = i_10_ - (i_11_ - -i_14_);
                            int i_18_ = i_12_ + -i_10_;
                            int i_19_ = ((((i_15_ * i_14_) >> 1275534700) * i_16_) >> 1956249356);
                            int i_20_ = (i_17_ * i_16_) >> 974423468;
                            int i_21_ = i_11_;
                            int i_22_ = (i_15_ * i_18_) >> 1437217740;
                            is[i_5_] = i_21_ + ((i_22_ + i_19_) - -i_20_);
                        }

                        break while_71_;
                    }

                    for (i_5_ = 0;
                            (Class32.anInt743 ^ 0xffffffff) < (i_5_ ^
                            0xffffffff); i_5_++) {
                        int i_23_ = is_4_[i_5_];
                        int i_24_;

                        for (i_24_ = 1;
                                (((anIntArrayArray3157.length - 1) ^
                                0xffffffff) < (i_24_ ^ 0xffffffff)); i_24_++) {
                            if (anIntArrayArray3157[i_24_][0] > i_23_) {
                                break;
                            }
                        }

                        int[] is_25_ = anIntArrayArray3157[i_24_];
                        int[] is_26_ = anIntArrayArray3157[i_24_ - 1];
                        int i_27_ = (((i_23_ - is_26_[0]) << -558772308) / (-is_26_[0] +
                            is_25_[0]));
                        int i_28_ = ((-(Class37_Sub4_Sub7_Sub2.anIntArray3711[0xff &
                            (i_27_ >> -1533740891)]) + 4096) >> -37631935);
                        int i_29_ = 4096 - i_28_;
                        is[i_5_] = (((i_29_ * is_26_[1]) -
                            -(is_25_[1] * i_28_)) >> -1233495572);
                    }

                    break while_71_;
                } while (false);

                for (i_5_ = 0;
                        (Class32.anInt743 ^ 0xffffffff) < (i_5_ ^ 0xffffffff);
                        i_5_++) {
                    int i_30_ = is_4_[i_5_];
                    int i_31_;

                    for (i_31_ = 1; (anIntArrayArray3157.length - 1) > i_31_;
                            i_31_++) {
                        if ((i_30_ ^ 0xffffffff) > (anIntArrayArray3157[i_31_][0] ^
                                0xffffffff)) {
                            break;
                        }
                    }

                    int[] is_32_ = anIntArrayArray3157[i_31_];
                    int[] is_33_ = anIntArrayArray3157[-1 + i_31_];
                    int i_34_ = (((i_30_ - is_33_[0]) << -1609325812) / (-is_33_[0] +
                        is_32_[0]));
                    int i_35_ = -i_34_ + 4096;
                    is[i_5_] = (((i_35_ * is_33_[1]) - -(is_32_[1] * i_34_)) >> -661043220);
                }
            }
        } while (false);

        return is;
    }

    public static void method823(Applet_Sub1 applet_sub1, int i) {
        if (i != 0) {
            method823(null, -20);
        }

        anInt3174++;

        if (Class37_Sub4_Sub13.aBoolean2799) {
            PacketParser.method838(applet_sub1, i + 13634);
        } else {
            if ((Class37_Sub9_Sub28.anInt3440 == 1) &&
                    ((Class33.anInt764 ^ 0xffffffff) <= -716) &&
                    ((Class37_Sub13.anInt2113 ^ 0xffffffff) <= -454)) {
                Class52.aBoolean1050 = !Class52.aBoolean1050;

                if (!Class52.aBoolean1050) {
                    Class38.method1054(ItemDef.aJString_2508, 255,
                        (byte) 87, false, Class54.aClass15_Sub1_1060,
                        Class37_Sub9_Sub33.aJString_3524);
                } else {
                    Class37_Sub9_Sub4.method778(false);
                }
            }

            if (Class32.anInt740 != 5) {
                Class37_Sub9_Sub34.anInt3558++;

                if ((Class32.anInt740 ^ 0xffffffff) == -11) {
                    if (((Class10.anInt193 ^ 0xffffffff) != -3) &&
                            (Class37_Sub9_Sub25.anInt3382 == 0)) {
                        if ((Class37_Sub9_Sub28.anInt3440 ^ 0xffffffff) == -2) {
                            int i_36_ = 5;
                            int i_37_ = 100;
                            int i_38_ = 463;
                            int i_39_ = 35;

                            if ((Class33.anInt764 >= i_36_) &&
                                    ((i_37_ + i_36_) >= Class33.anInt764) &&
                                    ((i_38_ ^ 0xffffffff) >= (Class37_Sub13.anInt2113 ^
                                    0xffffffff)) &&
                                    ((i_38_ - -i_39_) >= Class37_Sub13.anInt2113)) {
                                Class37_Sub9_Sub9.method800(4594);

                                return;
                            }
                        }

                        if (Class37_Sub9.aClass22_1954 != null) {
                            Class37_Sub9_Sub9.method800(4594);
                        }
                    }

                    int i_40_ = Class37_Sub9_Sub28.anInt3440;
                    int i_41_ = Class37_Sub13.anInt2113;
                    int i_42_ = Class33.anInt764;

                    if ((Class18.anInt339 ^ 0xffffffff) == -1) {
                        boolean bool = false;
                        int i_43_ = 291;
                        int i_44_ = 302;

                        if ((i_40_ == 1) && (i_42_ >= (-75 + i_44_)) &&
                                (((i_44_ + 75) ^ 0xffffffff) <= (i_42_ ^
                                0xffffffff)) &&
                                (((i_43_ - 20) ^ 0xffffffff) >= (i_41_ ^
                                0xffffffff)) &&
                                ((i_41_ ^ 0xffffffff) >= ((i_43_ + 20) ^
                                0xffffffff))) {
                            Class37_Sub9_Sub31.anInt3495 = 0;
                            Class18.anInt339 = 3;
                        }

                        if ((Class37_Sub9_Sub17.anInt3219 ^ 0xffffffff) != -1) {
                            while (Class46.method1106(i)) {
                                if ((Class37_Sub4_Sub3.anInt2560 ^ 0xffffffff) == -85) {
                                    bool = true;

                                    break;
                                }
                            }
                        }

                        i_44_ = 462;

                        if (bool ||
                                (((i_40_ ^ 0xffffffff) == -2) &&
                                ((i_42_ ^ 0xffffffff) <= ((i_44_ + -75) ^
                                0xffffffff)) &&
                                (((75 + i_44_) ^ 0xffffffff) <= (i_42_ ^
                                0xffffffff)) &&
                                (((i_43_ + -20) ^ 0xffffffff) >= (i_41_ ^
                                0xffffffff)) &&
                                (((20 + i_43_) ^ 0xffffffff) <= (i_41_ ^
                                0xffffffff)))) {
                            Class37_Sub9_Sub33.aJString_3521 = Canvas_Sub1.aJString_56;

                            Class37_Sub9_Sub33.aJString_3528 = ItemDef.aJString_2444;

                            Class37_Sub9_Sub33.aJString_3520 = ItemDef.aJString_2422;
                            Class18.anInt339 = 2;
                            Class37_Sub9_Sub31.anInt3495 = 0;
                        }
                    } else if (Class18.anInt339 == 2) {
                        int i_45_ = 302;
                        int i_46_ = 231;
                        i_46_ += 30;

                        int i_47_ = 321;

                        if ((i_40_ == 1) &&
                                (((i_46_ + -15) ^ 0xffffffff) >= (i_41_ ^
                                0xffffffff)) &&
                                ((i_41_ ^ 0xffffffff) > (i_46_ ^ 0xffffffff))) {
                            Class37_Sub9_Sub31.anInt3495 = 0;
                        }

                        i_46_ += 15;

                        if ((i_40_ == 1) && ((i_46_ - 15) <= i_41_) &&
                                (i_41_ < i_46_)) {
                            Class37_Sub9_Sub31.anInt3495 = 1;
                        }

                        i_46_ += 15;

                        if ((i_40_ == 1) &&
                                (((i_45_ + -75) ^ 0xffffffff) >= (i_42_ ^
                                0xffffffff)) &&
                                (((75 + i_45_) ^ 0xffffffff) <= (i_42_ ^
                                0xffffffff)) &&
                                (((-20 + i_47_) ^ 0xffffffff) >= (i_41_ ^
                                0xffffffff)) &&
                                ((i_41_ ^ 0xffffffff) >= ((20 + i_47_) ^
                                0xffffffff))) {
                            Class37_Sub9_Sub33.aJString_3526 = Class37_Sub9_Sub33.aJString_3526.method167(-1)
                                                                                               .method164(70);

                            if ((Class37_Sub9_Sub33.aJString_3526.method172(
                                        (byte) 38) ^ 0xffffffff) == -1) {
                                Class32_Sub1.method293((byte) -126,
                                    (ItemDef.aJString_2438),
                                    (ItemDef.aJString_2516),
                                    Login.aJString_787);
                            } else if ((Class37_Sub9_Sub33.aJString_3525.method172(
                                        (byte) 38) ^ 0xffffffff) == -1) {
                                Class32_Sub1.method293((byte) -125,
                                    ItemDef.aJString_2461,
                                    ItemDef.aJString_2490,
                                    Class37_Sub18.aJString_2191);
                            } else {
                                Class32_Sub1.method293((byte) -126,
                                    (ItemDef.aJString_2450),
                                    (ItemDef.aJString_2488),
                                    Class76.aJString_1432);
                                Class37_Sub4_Sub3.method461(20, 27931);
                            }
                        } else {
                            i_45_ = 462;

                            if (((i_40_ ^ 0xffffffff) == -2) &&
                                    ((i_45_ + -75) <= i_42_) &&
                                    (((75 + i_45_) ^ 0xffffffff) <= (i_42_ ^
                                    0xffffffff)) &&
                                    (((-20 + i_47_) ^ 0xffffffff) >= (i_41_ ^
                                    0xffffffff)) &&
                                    (((20 + i_47_) ^ 0xffffffff) <= (i_41_ ^
                                    0xffffffff))) {
                                Class37_Sub9_Sub33.aJString_3526 = Class37_Sub9_Sub33.aJString_3524;
                                Class18.anInt339 = 0;

                                Class37_Sub9_Sub33.aJString_3525 = Class37_Sub9_Sub33.aJString_3524;
                            }

                            while (Class46.method1106(i)) {
                                boolean bool = false;

                                for (int i_48_ = 0;
                                        ((i_48_ ^ 0xffffffff) > (Class45.aJString_972.method172(
                                            (byte) 38) ^ 0xffffffff));
                                        i_48_++) {
                                    if ((Class88.anInt1600 ^ 0xffffffff) == (Class45.aJString_972.method161(
                                                i_48_, 115) ^ 0xffffffff)) {
                                        bool = true;

                                        break;
                                    }
                                }

                                if ((Class37_Sub9_Sub31.anInt3495 ^ 0xffffffff) != -1) {
                                    if (Class37_Sub9_Sub31.anInt3495 == 1) {
                                        if (((Class37_Sub4_Sub3.anInt2560 ^
                                                0xffffffff) == -86) &&
                                                ((Class37_Sub9_Sub33.aJString_3525.method172(
                                                    (byte) 38) ^ 0xffffffff) < -1)) {
                                            Class37_Sub9_Sub33.aJString_3525 = (Class37_Sub9_Sub33.aJString_3525.method169(0,
                                                    0,
                                                    -1 +
                                                    (Class37_Sub9_Sub33.aJString_3525.method172(
                                                        (byte) 38))));
                                        }

                                        if (((Class37_Sub4_Sub3.anInt2560 ^
                                                0xffffffff) == -85) ||
                                                (Class37_Sub4_Sub3.anInt2560 == 80)) {
                                            Class37_Sub9_Sub31.anInt3495 = 0;
                                        }

                                        if (((Class37_Sub9_Sub17.anInt3219 ^
                                                0xffffffff) != -1) &&
                                                ((Class37_Sub4_Sub3.anInt2560 ^
                                                0xffffffff) == -85)) {
                                            Class37_Sub9_Sub33.aJString_3526 = Class37_Sub9_Sub33.aJString_3526.method167(i ^
                                                    0xffffffff).method164(70);

                                            if (Class37_Sub9_Sub33.aJString_3526.method172(
                                                        (byte) 38) == 0) {
                                                Class32_Sub1.method293((byte) -125,
                                                    (ItemDef.aJString_2438),
                                                    (ItemDef.aJString_2516),
                                                    Login.aJString_787);
                                            } else {
                                                if ((Class37_Sub9_Sub33.aJString_3525.method172(
                                                            (byte) 38) ^
                                                        0xffffffff) == -1) {
                                                    Class32_Sub1.method293((byte) -125,
                                                        (ItemDef.aJString_2461),
                                                        (ItemDef.aJString_2490),
                                                        (Class37_Sub18.aJString_2191));
                                                } else {
                                                    Class32_Sub1.method293((byte) -128,
                                                        (ItemDef.aJString_2450),
                                                        (ItemDef.aJString_2488),
                                                        (Class76.aJString_1432));
                                                    Class37_Sub4_Sub3.method461(20,
                                                        27931);

                                                    break;
                                                }

                                                break;
                                            }

                                            break;
                                        }

                                        if (bool &&
                                                (Class37_Sub9_Sub33.aJString_3525.method172(
                                                    (byte) 38) < 20)) {
                                            Class37_Sub9_Sub33.aJString_3525 = (Class37_Sub9_Sub33.aJString_3525.method144(Class88.anInt1600,
                                                    false));
                                        }
                                    }
                                } else {
                                    if (((Class37_Sub4_Sub3.anInt2560 ^
                                            0xffffffff) == -86) &&
                                            (Class37_Sub9_Sub33.aJString_3526.method172(
                                                (byte) 38) > 0)) {
                                        Class37_Sub9_Sub33.aJString_3526 = (Class37_Sub9_Sub33.aJString_3526.method169(0,
                                                0,
                                                (Class37_Sub9_Sub33.aJString_3526.method172(
                                                    (byte) 38) - 1)));
                                    }

                                    if (((Class37_Sub4_Sub3.anInt2560 ^
                                            0xffffffff) == -85) ||
                                            (Class37_Sub4_Sub3.anInt2560 == 80)) {
                                        Class37_Sub9_Sub31.anInt3495 = 1;
                                    }

                                    if (bool &&
                                            ((Class37_Sub9_Sub33.aJString_3526.method172(
                                                (byte) 38) ^ 0xffffffff) > -13)) {
                                        Class37_Sub9_Sub33.aJString_3526 = (Class37_Sub9_Sub33.aJString_3526.method144(Class88.anInt1600,
                                                false));
                                    }
                                }
                            }
                        }
                    } else if (Class18.anInt339 == 3) {
                        int i_49_ = 382;
                        int i_50_ = 321;

                        if ((i_40_ == 1) &&
                                ((i_42_ ^ 0xffffffff) <= ((-75 + i_49_) ^
                                0xffffffff)) && ((i_49_ + 75) >= i_42_) &&
                                (i_41_ >= (i_50_ + -20)) &&
                                ((i_41_ ^ 0xffffffff) >= ((20 + i_50_) ^
                                0xffffffff))) {
                            Class18.anInt339 = 0;
                        }
                    }
                }
            }
        }
    }

    public void method824(byte i) {
        anInt3171++;

        int[] is = anIntArrayArray3157[0];
        int[] is_51_ = anIntArrayArray3157[-2 + anIntArrayArray3157.length];
        int i_52_ = -34 % ((i - -32) / 41);
        int[] is_53_ = anIntArrayArray3157[1];
        int[] is_54_ = anIntArrayArray3157[anIntArrayArray3157.length - 1];
        anIntArray3179 = new int[] {
                -is_53_[0] + is[0] + is[0], is[1] - -is[1] + -is_53_[1]
            };
        anIntArray3172 = new int[] {
                is_51_[0] + (is_51_[0] - is_54_[0]),
                is_51_[1] - (is_54_[1] - is_51_[1])
            };
    }

    public void method750(Stream stream, int i, boolean bool) {
        if ((i ^ 0xffffffff) == -1) {
            anInt3161 = stream.readByte(126);
            anIntArrayArray3157 = new int[stream.readByte(125)][2];

            for (int i_55_ = 0; anIntArrayArray3157.length > i_55_; i_55_++) {
                anIntArrayArray3157[i_55_][0] = stream.readShort();
                anIntArrayArray3157[i_55_][1] = stream.readShort();
            }
        }

        anInt3176++;

        if (bool != true) {
            anInt3182 = -49;
        }
    }

    public void method752(int i) {
        anInt3166++;

        if (anIntArrayArray3157 == null) {
            anIntArrayArray3157 = new int[][] {new int[2],
                    { 4096, 4096 }
                };
        }

        if (anIntArrayArray3157.length < 2) {
            throw new RuntimeException(
                "Curve operation requires at least two markers");
        }

        if ((anInt3161 ^ 0xffffffff) == -3) {
            method824((byte) 42);
        }

        Class37_Sub9_Sub28.method884(i ^ 0x7d);

        if (i != -2) {
            aJString_3160 = null;
        }
    }

    public static void method825(int i) {
        aJString_3165 = null;
        aJString_3170 = null;
        aJString_3164 = null;
        aJString_3181 = null;
        aJString_3162 = null;
        aJString_3158 = null;
        aStreamArray3175 = null;
        aClass15_3159 = null;
        aJString_3160 = null;

        if (i == 7605) {
            aJString_3178 = null;
            aJString_3168 = null;
        }
    }

    public int[] method826(int i, int i_56_) {
        anInt3163++;

        if (i_56_ < 0) {
            return anIntArray3179;
        }

        if ((i_56_ ^ 0xffffffff) <= (anIntArrayArray3157.length ^ 0xffffffff)) {
            return anIntArray3172;
        }

        if (i != -28401) {
            aJString_3158 = null;
        }

        return anIntArrayArray3157[i_56_];
    }
}
