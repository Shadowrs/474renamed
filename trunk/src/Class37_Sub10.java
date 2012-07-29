/* Class37_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub10 extends Class37 {
    public static int anInt1980;
    public static JString aJString_1981 = Class37_Sub2.method332((byte) 111,
            "slide:");
    public static JString aJString_1982;
    public static JString aJString_1983 = aJString_1981;
    public static JString aJString_1984;
    public static int anInt1985;
    public static int anInt1986 = 0;
    public static int anInt1987;
    public static JString aJString_1988;
    public static int anInt1989;
    public static int anInt1991;
    public static int anInt1992;
    public static int anInt1993;
    public static JString aJString_1994;
    public static int anInt1995;
    public static JString aJString_1996;
    public static JString aJString_1997;
    public static JString aJString_1998;
    public static JString aJString_1999;
    public static JString aJString_2000;

    static {
        aJString_1984 = Class37_Sub2.method332((byte) 105,
                "Service unavailable)3");

        aJString_1988 = Class37_Sub2.method332((byte) 123,
                "Could not complete login)3");

        aJString_1996 = Class37_Sub2.method332((byte) 121, "Loading sprites )2 ");
        aJString_1994 = aJString_1988;
        aJString_1998 = aJString_1996;
        aJString_2000 = aJString_1984;
        aJString_1999 = aJString_1981;

        aJString_1982 = Class37_Sub2.method332((byte) 109,
                "Prepared sound engine");
        aJString_1997 = aJString_1982;
    }

    public int anInt1990;

    public Class37_Sub10() {
        /* empty */
    }

    public Class37_Sub10(int i) {
        anInt1990 = i;
    }

    public static void method925(byte i) {
        aJString_1983 = null;
        aJString_1998 = null;
        aJString_1996 = null;
        aJString_1982 = null;

        int i_0_ = 5 % ((i - -62) / 48);
        aJString_1999 = null;
        aJString_2000 = null;
        aJString_1994 = null;
        aJString_1997 = null;
        aJString_1984 = null;
        aJString_1981 = null;
        aJString_1988 = null;
    }

    public static void method926(boolean bool) {
        if (bool != true) {
            method925((byte) 66);
        }

        synchronized (Class37_Sub4_Sub10.anObject2686) {
            if (Class37_Sub9_Sub22.anInt3327 == 0) {
                Class80.aClass51_1508.createResource(new Class8(), 5, (byte) 65);
            }

            Class37_Sub9_Sub22.anInt3327 = 600;
        }

        anInt1993++;
    }

    public static boolean method927(int i, int i_1_) {
        anInt1995++;

        if (Class15_Sub1.aBooleanArray1754[i]) {
            return true;
        }

        if (!Class37_Sub4_Sub14.aClass15_2805.method125((byte) -92, i)) {
            return false;
        }

        int i_2_ = Class37_Sub4_Sub14.aClass15_2805.method129(i_1_ ^ 0x4dab, i);

        if ((i_2_ ^ 0xffffffff) == -1) {
            Class15_Sub1.aBooleanArray1754[i] = true;

            return true;
        }

        if (Class37_Sub9_Sub29.aClass18ArrayArray3454[i] == null) {
            Class37_Sub9_Sub29.aClass18ArrayArray3454[i] = new Class18[i_2_];
        }

        if (i_1_ != 27323) {
            aJString_1998 = null;
        }

        for (int i_3_ = 0; i_2_ > i_3_; i_3_++) {
            if (Class37_Sub9_Sub29.aClass18ArrayArray3454[i][i_3_] == null) {
                byte[] is = Class37_Sub4_Sub14.aClass15_2805.method131(i_3_, i,
                        i_1_ ^ 0x6aba);

                if (is != null) {
                    Class37_Sub9_Sub29.aClass18ArrayArray3454[i][i_3_] = new Class18();

                    Class37_Sub9_Sub29.aClass18ArrayArray3454[i][i_3_].anInt402 = (i << 1382429264) -
                        -i_3_;

                    if (is[0] == -1) {
                        Class37_Sub9_Sub29.aClass18ArrayArray3454[i][i_3_].method201(false,
                            new Stream(is));
                    } else {
                        Class37_Sub9_Sub29.aClass18ArrayArray3454[i][i_3_].method196((byte) 0,
                            new Stream(is));
                    }
                }
            }
        }

        Class15_Sub1.aBooleanArray1754[i] = true;

        return true;
    }

    public static void method928(byte i, int i_4_) {
        anInt1991++;

        if (method927(i_4_, 27323)) {
            Class18[] class18s = Class37_Sub9_Sub29.aClass18ArrayArray3454[i_4_];

            for (int i_5_ = 0;
                    (i_5_ ^ 0xffffffff) > (class18s.length ^ 0xffffffff);
                    i_5_++) {
                Class18 class18 = class18s[i_5_];

                if (class18 != null) {
                    class18.anInt323 = 0;
                    class18.anInt443 = 0;
                }
            }

            if (i != 27) {
                aJString_1988 = null;
            }
        }
    }

    public static void method929(byte i) {

        if (Class37_Sub9_Sub17.packetId == 205) {
            int i_6_ = Class83.packetStream.method978(117);
            int i_7_ = ((i_6_ >> -2133359132) & 0x7) + Class50.anInt1028;
            int i_8_ = Class65.anInt1231 - -(0x7 & i_6_);
            int i_9_ = Class83.packetStream.method980(-119);
            int i_10_ = Class83.packetStream.method978(i ^ ~0x62);
            int i_11_ = 0xf & (i_10_ >> 540681572);
            int i_12_ = 0x7 & i_10_;
            int i_13_ = Class83.packetStream.method978(125);

            if (((i_7_ ^ 0xffffffff) <= -1) && ((i_8_ ^ 0xffffffff) <= -1) &&
                    (i_7_ < 104) && ((i_8_ ^ 0xffffffff) > -105)) {
                int i_14_ = 1 + i_11_;

                if ((((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]) ^
                        0xffffffff) <= ((i_7_ - i_14_) ^ 0xffffffff)) &&
                        (((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]) ^
                        0xffffffff) >= ((i_7_ + i_14_) ^ 0xffffffff)) &&
                        (((-i_14_ + i_8_) ^ 0xffffffff) >= ((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]) ^
                        0xffffffff)) &&
                        ((i_8_ + i_14_) >= (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0])) &&
                        (Class43.anInt957 != 0) && ((i_12_ ^ 0xffffffff) < -1) &&
                        (Class37_Sub3_Sub1.anInt2329 < 50)) {
                    Class46.anIntArray988[Class37_Sub3_Sub1.anInt2329] = i_9_;

                    Class37_Sub4_Sub10.anIntArray2681[(Class37_Sub3_Sub1.anInt2329)] = i_12_;

                    Class83.anIntArray1520[Class37_Sub3_Sub1.anInt2329] = i_13_;

                    Class37_Sub9_Sub32.aClass11Array3505[(Class37_Sub3_Sub1.anInt2329)] = null;

                    Class37_Sub4_Sub13.anIntArray2800[(Class37_Sub3_Sub1.anInt2329)] = i_11_ +
                        (i_7_ << -225119088) + (i_8_ << 1793531528);
                    Class37_Sub3_Sub1.anInt2329++;
                }
            }
        }

        anInt1992++;

        if (Class37_Sub9_Sub17.packetId == 28) {
            int i_15_ = Class83.packetStream.method984(-1739943584);
            int i_16_ = Class83.packetStream.method952((byte) -118);
            int i_17_ = Class50.anInt1028 + ((i_16_ & 0x7c) >> 13196612);
            int i_18_ = Class65.anInt1231 - -(0x7 & i_16_);

            if (((i_17_ ^ 0xffffffff) <= -1) && (i_18_ >= 0) && (i_17_ < 104) &&
                    ((i_18_ ^ 0xffffffff) > -105)) {
                Class58 class58 = (Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[Class37_Sub9_Sub1.anInt2916][i_17_][i_18_]);

                if (class58 != null) {
                    for (Class37_Sub4_Sub7_Sub3 class37_sub4_sub7_sub3 = ((Class37_Sub4_Sub7_Sub3) class58.method1155(i +
                                28)); class37_sub4_sub7_sub3 != null;
                            class37_sub4_sub7_sub3 = ((Class37_Sub4_Sub7_Sub3) class58.method1162(
                                    (byte) 88))) {
                        if (((i_15_ & 0x7fff) ^ 0xffffffff) == (class37_sub4_sub7_sub3.anInt3752 ^
                                0xffffffff)) {
                            class37_sub4_sub7_sub3.method322(false);

                            break;
                        }
                    }

                    if (class58.method1155(0) == null) {
                        Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[Class37_Sub9_Sub1.anInt2916][i_17_][i_18_] = null;
                    }

                    Class37_Sub2.method335(i_18_, i_17_, 19938);
                }
            }
        } else if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -56) {
            int i_19_ = Class83.packetStream.method952((byte) 92);
            int i_20_ = 0x3 & i_19_;
            int i_21_ = i_19_ >> 2081610338;
            int i_22_ = Class30.anIntArray719[i_21_];
            int i_23_ = Class83.packetStream.method978(123);
            int i_24_ = Class50.anInt1028 + ((0x73 & i_23_) >> 1094297092);
            int i_25_ = (i_23_ & 0x7) + Class65.anInt1231;
            int i_26_ = Class83.packetStream.method980(-123);

            if (((i_24_ ^ 0xffffffff) <= -1) && ((i_25_ ^ 0xffffffff) <= -1) &&
                    ((i_24_ ^ 0xffffffff) > -104) && (i_25_ < 103)) {
                if (i_22_ == 0) {
                    Class75 class75 = Class38.aClass67_847.method1232((Class37_Sub9_Sub1.anInt2916),
                            i_24_, i_25_);

                    if (class75 != null) {
                        int i_27_ = (0x1fffd2df & class75.anInt1411) >> 833327150;

                        if (i_21_ != 2) {
                            class75.aClass37_Sub4_Sub7_1404 = (new Class37_Sub4_Sub7_Sub5(i_27_,
                                    i_21_, i_20_, Class37_Sub9_Sub1.anInt2916,
                                    i_24_, i_25_, i_26_, false,
                                    class75.aClass37_Sub4_Sub7_1404));
                        } else {
                            class75.aClass37_Sub4_Sub7_1404 = (new Class37_Sub4_Sub7_Sub5(i_27_,
                                    2, i_20_ + 4, Class37_Sub9_Sub1.anInt2916,
                                    i_24_, i_25_, i_26_, false,
                                    class75.aClass37_Sub4_Sub7_1404));

                            class75.aClass37_Sub4_Sub7_1407 = (new Class37_Sub4_Sub7_Sub5(i_27_,
                                    2, 0x3 & (1 + i_20_),
                                    Class37_Sub9_Sub1.anInt2916, i_24_, i_25_,
                                    i_26_, false,
                                    class75.aClass37_Sub4_Sub7_1407));
                        }
                    }
                }

                if (i_22_ == 1) {
                    Class41 class41 = Class38.aClass67_847.method1214((Class37_Sub9_Sub1.anInt2916),
                            i_24_, i_25_);

                    if (class41 != null) {
                        int i_28_ = (class41.anInt911 >> 1449620046) & 0x7fff;

                        if ((i_21_ != 4) && (i_21_ != 5)) {
                            if ((i_21_ ^ 0xffffffff) == -7) {
                                class41.aClass37_Sub4_Sub7_892 = (new Class37_Sub4_Sub7_Sub5(i_28_,
                                        4, i_20_ + 4,
                                        Class37_Sub9_Sub1.anInt2916, i_24_,
                                        i_25_, i_26_, false,
                                        class41.aClass37_Sub4_Sub7_892));
                            } else if ((i_21_ ^ 0xffffffff) != -8) {
                                if (i_21_ == 8) {
                                    class41.aClass37_Sub4_Sub7_892 = (new Class37_Sub4_Sub7_Sub5(i_28_,
                                            4, 4 + i_20_,
                                            Class37_Sub9_Sub1.anInt2916, i_24_,
                                            i_25_, i_26_, false,
                                            class41.aClass37_Sub4_Sub7_892));

                                    class41.aClass37_Sub4_Sub7_887 = (new Class37_Sub4_Sub7_Sub5(i_28_,
                                            4, (0x3 & (2 + i_20_)) - -4,
                                            Class37_Sub9_Sub1.anInt2916, i_24_,
                                            i_25_, i_26_, false,
                                            class41.aClass37_Sub4_Sub7_887));
                                }
                            } else {
                                class41.aClass37_Sub4_Sub7_892 = (new Class37_Sub4_Sub7_Sub5(i_28_,
                                        4, ((i_20_ + 2) & 0x3) + 4,
                                        Class37_Sub9_Sub1.anInt2916, i_24_,
                                        i_25_, i_26_, false,
                                        class41.aClass37_Sub4_Sub7_892));
                            }
                        } else {
                            class41.aClass37_Sub4_Sub7_892 = (new Class37_Sub4_Sub7_Sub5(i_28_,
                                    4, i_20_, Class37_Sub9_Sub1.anInt2916,
                                    i_24_, i_25_, i_26_, false,
                                    class41.aClass37_Sub4_Sub7_892));
                        }
                    }
                }

                if (i_22_ == 2) {
                    if ((i_21_ ^ 0xffffffff) == -12) {
                        i_21_ = 10;
                    }

                    Class27 class27 = Class38.aClass67_847.method1207((Class37_Sub9_Sub1.anInt2916),
                            i_24_, i_25_);

                    if (class27 != null) {
                        class27.aClass37_Sub4_Sub7_670 = (new Class37_Sub4_Sub7_Sub5((class27.anInt673 &
                                0x1fffff5e) >> -2065642386, i_21_, i_20_,
                                Class37_Sub9_Sub1.anInt2916, i_24_, i_25_,
                                i_26_, false, class27.aClass37_Sub4_Sub7_670));
                    }
                }

                if (i_22_ == 3) {
                    Class39 class39 = Class38.aClass67_847.method1223((Class37_Sub9_Sub1.anInt2916),
                            i_24_, i_25_);

                    if (class39 != null) {
                        class39.aClass37_Sub4_Sub7_857 = (new Class37_Sub4_Sub7_Sub5(0x7fff &
                                (class39.anInt868 >> -439465778), 22, i_20_,
                                Class37_Sub9_Sub1.anInt2916, i_24_, i_25_,
                                i_26_, false, class39.aClass37_Sub4_Sub7_857));
                    }
                }
            }
        } else if (Class37_Sub9_Sub17.packetId == 38) {
            int i_29_ = Class83.packetStream.method978(i ^ ~0x65);
            int i_30_ = Class65.anInt1231 - -(0x7 & i_29_);
            int i_31_ = (0x7 & (i_29_ >> -1232710396)) + Class50.anInt1028;
            int i_32_ = (i_31_ +
                Class83.packetStream.method982((byte) 116));
            int i_33_ = (Class83.packetStream.method982((byte) 116) +
                i_30_);
            int i_34_ = Class83.packetStream.method931((byte) 116);
            int i_35_ = Class83.packetStream.method980(-13);
            int i_36_ = 4 * Class83.packetStream.method978(125);
            int i_37_ = 4 * Class83.packetStream.method978(124);
            int i_38_ = Class83.packetStream.method980(-121);
            int i_39_ = Class83.packetStream.method980(105);
            int i_40_ = Class83.packetStream.method978(i + 146);
            int i_41_ = Class83.packetStream.method978(i ^ ~0x67);

            if ((i_31_ >= 0) && (i_30_ >= 0) && (i_31_ < 104) && (i_30_ < 104) &&
                    (i_32_ >= 0) && ((i_33_ ^ 0xffffffff) <= -1) &&
                    ((i_32_ ^ 0xffffffff) > -105) &&
                    ((i_33_ ^ 0xffffffff) > -105) &&
                    ((i_35_ ^ 0xffffffff) != -65536)) {
                i_33_ = (128 * i_33_) + 64;
                i_31_ = (128 * i_31_) - -64;
                i_30_ = 64 + (128 * i_30_);

                Class37_Sub4_Sub7_Sub2 class37_sub4_sub7_sub2 = (new Class37_Sub4_Sub7_Sub2(i_35_,
                        Class37_Sub9_Sub1.anInt2916, i_31_, i_30_,
                        -i_36_ +
                        JString.method153(Class37_Sub9_Sub1.anInt2916,
                            -169496123, i_30_, i_31_),
                        i_38_ + Class37_Sub7.anInt1898,
                        Class37_Sub7.anInt1898 + i_39_, i_40_, i_41_, i_34_,
                        i_37_));
                i_32_ = 64 + (128 * i_32_);
                class37_sub4_sub7_sub2.method514(i_32_,
                    i_38_ + Class37_Sub7.anInt1898, true, i_33_,
                    JString.method153(Class37_Sub9_Sub1.anInt2916, -169496123,
                        i_33_, i_32_) + -i_37_);
                Class37_Sub9_Sub5.aClass58_2994.method1149((byte) -111,
                    class37_sub4_sub7_sub2);
            }
        } else if (Class37_Sub9_Sub17.packetId == 49) {
            int i_42_ = Class83.packetStream.method978(127);
            int i_43_ = Class50.anInt1028 - -((0x72 & i_42_) >> -849112764);
            int i_44_ = (i_42_ & 0x7) + Class65.anInt1231;
            int i_45_ = Class83.packetStream.method980(-127);
            int i_46_ = Class83.packetStream.method978(118);
            int i_47_ = Class83.packetStream.method980(i + 129);

            if ((i_43_ >= 0) && ((i_44_ ^ 0xffffffff) <= -1) && (i_43_ < 104) &&
                    ((i_44_ ^ 0xffffffff) > -105)) {
                i_44_ = (128 * i_44_) - -64;
                i_43_ = 64 + (128 * i_43_);

                Class37_Sub4_Sub7_Sub7 class37_sub4_sub7_sub7 = (new Class37_Sub4_Sub7_Sub7(i_45_,
                        Class37_Sub9_Sub1.anInt2916, i_43_, i_44_,
                        -i_46_ +
                        JString.method153(Class37_Sub9_Sub1.anInt2916,
                            -169496123, i_44_, i_43_), i_47_,
                        Class37_Sub7.anInt1898));
                RSSocket.aClass58_481.method1149((byte) -105,
                    class37_sub4_sub7_sub7);
            }
        } else {
            if (i != -28) {
                aJString_1984 = null;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -189) {
                int i_48_ = Class83.packetStream.method978(126);
                int i_49_ = i_48_ >> -2064302590;
                int i_50_ = 0x3 & i_48_;
                int i_51_ = Class30.anIntArray719[i_49_];
                int i_52_ = Class83.packetStream.method984(-1739943584);
                int i_53_ = Class83.packetStream.method967(255);
                int i_54_ = (0x7 & (i_53_ >> 1788275460)) + Class50.anInt1028;
                int i_55_ = Class65.anInt1231 + (i_53_ & 0x7);

                if ((i_54_ >= 0) && ((i_55_ ^ 0xffffffff) <= -1) &&
                        (i_54_ < 104) && ((i_55_ ^ 0xffffffff) > -105)) {
                    Class37_Sub9_Sub1.method764(i_50_, i_52_, i_49_, i_51_,
                        Class37_Sub9_Sub1.anInt2916, i + 154, i_55_, -1, i_54_,
                        0);
                }
            } else if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -192) {
                int i_56_ = Class83.packetStream.method978(120);
                int i_57_ = Class50.anInt1028 -
                    -((i_56_ & 0x75) >> -1746747516);
                int i_58_ = (0x7 & i_56_) + Class65.anInt1231;
                int i_59_ = Class83.packetStream.method980(i ^
                        ~0x53);
                int i_60_ = Class83.packetStream.method980(i ^ 0x5);
                int i_61_ = Class83.packetStream.method984(-1739943584);

                if (((i_57_ ^ 0xffffffff) <= -1) &&
                        ((i_58_ ^ 0xffffffff) <= -1) &&
                        ((i_57_ ^ 0xffffffff) > -105) &&
                        ((i_58_ ^ 0xffffffff) > -105) &&
                        ((Class37_Sub9_Sub5.anInt2998 ^ 0xffffffff) != (i_60_ ^
                        0xffffffff))) {
                    Class37_Sub4_Sub7_Sub3 class37_sub4_sub7_sub3 = new Class37_Sub4_Sub7_Sub3();
                    class37_sub4_sub7_sub3.anInt3737 = i_61_;
                    class37_sub4_sub7_sub3.anInt3752 = i_59_;

                    if ((Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[Class37_Sub9_Sub1.anInt2916][i_57_][i_58_]) == null) {
                        Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[Class37_Sub9_Sub1.anInt2916][i_57_][i_58_] = new Class58();
                    }

                    Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[Class37_Sub9_Sub1.anInt2916][i_57_][i_58_].method1149((byte) -112,
                        class37_sub4_sub7_sub3);
                    Class37_Sub2.method335(i_58_, i_57_, i + 19966);
                }
            } else if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -221) {
                int i_62_ = Class83.packetStream.method978(127);
                int i_63_ = (0x7 & i_62_) + Class65.anInt1231;
                int i_64_ = ((i_62_ & 0x74) >> 1408189316) + Class50.anInt1028;
                int i_65_ = Class83.packetStream.method980(-120);
                int i_66_ = Class83.packetStream.method980(117);
                int i_67_ = Class83.packetStream.method980(i ^
                        0x66);

                if (((i_64_ ^ 0xffffffff) <= -1) &&
                        ((i_63_ ^ 0xffffffff) <= -1) && (i_64_ < 104) &&
                        (i_63_ < 104)) {
                    Class58 class58 = (Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[Class37_Sub9_Sub1.anInt2916][i_64_][i_63_]);

                    if (class58 != null) {
                        for (Class37_Sub4_Sub7_Sub3 class37_sub4_sub7_sub3 = ((Class37_Sub4_Sub7_Sub3) class58.method1155(
                                    0)); class37_sub4_sub7_sub3 != null;
                                class37_sub4_sub7_sub3 = ((Class37_Sub4_Sub7_Sub3) class58.method1162(
                                        (byte) 91))) {
                            if (((class37_sub4_sub7_sub3.anInt3752 ^
                                    0xffffffff) == ((i_65_ & 0x7fff) ^
                                    0xffffffff)) &&
                                    ((i_66_ ^ 0xffffffff) == (class37_sub4_sub7_sub3.anInt3737 ^
                                    0xffffffff))) {
                                class37_sub4_sub7_sub3.anInt3737 = i_67_;

                                break;
                            }
                        }

                        Class37_Sub2.method335(i_63_, i_64_, i + 19966);
                    }
                }
            } else if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -87) {
                int i_68_ = Class83.packetStream.method932((byte) 77);
                int i_69_ = i_68_ >> 1029027554;
                int i_70_ = 0x3 & i_68_;
                int i_71_ = Class30.anIntArray719[i_69_];
                int i_72_ = Class83.packetStream.method932((byte) 112);
                int i_73_ = (i_72_ & 0x7) + Class65.anInt1231;
                int i_74_ = ((i_72_ >> -1873767228) & 0x7) + Class50.anInt1028;

                if ((i_74_ >= 0) && (i_73_ >= 0) &&
                        ((i_74_ ^ 0xffffffff) > -105) &&
                        ((i_73_ ^ 0xffffffff) > -105)) {
                    Class37_Sub9_Sub1.method764(i_70_, -1, i_69_, i_71_,
                        Class37_Sub9_Sub1.anInt2916, 92, i_73_, -1, i_74_, 0);
                }
            } else if (Class37_Sub9_Sub17.packetId == 7) {
                int i_75_ = Class83.packetStream.method978(127);
                int i_76_ = (0x7 & i_75_) + Class65.anInt1231;
                int i_77_ = Class50.anInt1028 + ((0x74 & i_75_) >> 923973252);
                int i_78_ = Class83.packetStream.method980(i ^
                        0x6c);
                int i_79_ = Class83.packetStream.method956(i ^
                        ~0x19);

                if (((i_77_ ^ 0xffffffff) <= -1) && (i_76_ >= 0) &&
                        (i_77_ < 104) && ((i_76_ ^ 0xffffffff) > -105)) {
                    Class37_Sub4_Sub7_Sub3 class37_sub4_sub7_sub3 = new Class37_Sub4_Sub7_Sub3();
                    class37_sub4_sub7_sub3.anInt3737 = i_79_;
                    class37_sub4_sub7_sub3.anInt3752 = i_78_;

                    if ((Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[Class37_Sub9_Sub1.anInt2916][i_77_][i_76_]) == null) {
                        Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[Class37_Sub9_Sub1.anInt2916][i_77_][i_76_] = new Class58();
                    }

                    Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[Class37_Sub9_Sub1.anInt2916][i_77_][i_76_].method1149((byte) -109,
                        class37_sub4_sub7_sub3);
                    Class37_Sub2.method335(i_76_, i_77_, i + 19966);
                }
            } else if (Class37_Sub9_Sub17.packetId == 18) {
                int i_80_ = Class83.packetStream.method978(118);
                int i_81_ = 0x3 & i_80_;
                int i_82_ = i_80_ >> -1030237918;
                int i_83_ = Class30.anIntArray719[i_82_];
                int i_84_ = Class83.packetStream.method940(true);
                int i_85_ = Class83.packetStream.method982((byte) 116);
                int i_86_ = Class83.packetStream.method952((byte) 105);
                int i_87_ = Class50.anInt1028 + ((i_86_ & 0x7c) >> 1745254660);
                int i_88_ = (i_86_ & 0x7) + Class65.anInt1231;
                int i_89_ = Class83.packetStream.method984(i +
                        -1739943556);
                int i_90_ = Class83.packetStream.method980(-119);
                int i_91_ = Class83.packetStream.method984(-1739943584);
                int i_92_ = Class83.packetStream.method975(i + 30);
                int i_93_ = Class83.packetStream.method941((byte) 101);
                int i_94_ = Class83.packetStream.method938(112);
                Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2;

                if ((i_91_ ^ 0xffffffff) == (Class37_Sub9_Sub5.anInt2998 ^
                        0xffffffff)) {
                    class37_sub4_sub7_sub1_sub2 = Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234;
                } else {
                    class37_sub4_sub7_sub1_sub2 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_91_];
                }

                if (class37_sub4_sub7_sub1_sub2 != null) {
                    ObjectDef objectdef = Class37_Sub9_Sub8.method794(i_90_,
                            28067);
                    int i_95_;
                    int i_96_;

                    if ((i_81_ == 1) || (i_81_ == 3)) {
                        i_96_ = objectdef.tileWidth;
                        i_95_ = objectdef.tileDepth;
                    } else {
                        i_95_ = objectdef.tileWidth;
                        i_96_ = objectdef.tileDepth;
                    }

                    int i_97_ = (i_95_ >> -1902479327) + i_87_;
                    int i_98_ = (i_96_ >> -1880983103) + i_88_;
                    int i_99_ = i_88_ + ((1 + i_96_) >> 1068585345);
                    int[][] is = (Class64.anIntArrayArrayArray1217[Class37_Sub9_Sub1.anInt2916]);
                    int i_100_ = i_87_ + ((i_95_ - -1) >> 1732742113);
                    int i_101_ = (i_87_ << 171369287) - -(i_95_ << 1064533158);
                    int i_102_ = ((is[i_100_][i_99_] +
                        ((is[i_97_][i_98_] + is[i_100_][i_98_]) -
                        -is[i_97_][i_99_])) >> -506927582);
                    int i_103_ = (i_96_ << -1379011898) +
                        (i_88_ << 1001948839);
                    Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = objectdef.method683(i_81_,
                            is, i_101_, i_102_, i_103_, true, i_82_);

                    if (class37_sub4_sub7_sub6 != null) {
                        if (i_85_ < i_93_) {
                            int i_104_ = i_93_;
                            i_93_ = i_85_;
                            i_85_ = i_104_;
                        }

                        if (i_94_ > i_84_) {
                            int i_105_ = i_94_;
                            i_94_ = i_84_;
                            i_84_ = i_105_;
                        }

                        Class37_Sub9_Sub1.method764(0, -1, 0, i_83_,
                            (Class37_Sub9_Sub1.anInt2916), 104, i_88_,
                            i_89_ + 1, i_87_, 1 + i_92_);

                        class37_sub4_sub7_sub1_sub2.aClass37_Sub4_Sub7_Sub6_3967 = class37_sub4_sub7_sub6;

                        class37_sub4_sub7_sub1_sub2.anInt3982 = Class37_Sub7.anInt1898 +
                            i_92_;
                        class37_sub4_sub7_sub1_sub2.anInt3994 = i_85_ + i_87_;
                        class37_sub4_sub7_sub1_sub2.anInt3981 = i_88_ - -i_94_;

                        class37_sub4_sub7_sub1_sub2.anInt3966 = Class37_Sub7.anInt1898 +
                            i_89_;

                        class37_sub4_sub7_sub1_sub2.anInt3995 = (128 * i_88_) +
                            (64 * i_96_);

                        class37_sub4_sub7_sub1_sub2.anInt3987 = (128 * i_87_) +
                            (64 * i_95_);
                        class37_sub4_sub7_sub1_sub2.anInt3975 = i_88_ + i_84_;
                        class37_sub4_sub7_sub1_sub2.anInt3964 = i_102_;
                        class37_sub4_sub7_sub1_sub2.anInt3962 = i_87_ + i_93_;
                    }
                }
            }
        }
    }
}
