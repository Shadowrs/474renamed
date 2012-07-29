/* Class37_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub25 extends Class37 {
    public static JString aJString_2274 = Class37_Sub2.method332((byte) 110,
            "::noclip");
    public static JString aJString_2275;
    public static int anInt2276;
    public static JString aJString_2279;
    public static short[][] aShortArrayArray2280 = {
            new short[0], new short[0], new short[0], new short[0], new short[0]
        };
    public static int anInt2281;
    public static JString aJString_2284 = Class37_Sub2.method332((byte) 120,
            "<col=ffff00>");
    public static Class18 aClass18_2285;
    public static int anInt2286;
    public static int anInt2287;
    public static int anInt2288;
    public static int anInt2289;
    public static int anInt2290;
    public static Class37_Sub4_Sub9_Sub3[] aClass37_Sub4_Sub9_Sub3Array2291;

    static {
        aJString_2279 = Class37_Sub2.method332((byte) 114, "FULL");
        aJString_2275 = aJString_2279;
        anInt2290 = 0;
    }

    public int[] anIntArray2277;
    public int anInt2278;
    public int anInt2282;
    public int[][] anIntArrayArray2283;

    public Class37_Sub25(int i, byte[] is) {
        anInt2278 = i;

        Stream stream = new Stream(is);
        anInt2282 = stream.readByte(117);
        anIntArrayArray2283 = new int[anInt2282][];
        anIntArray2277 = new int[anInt2282];

        for (int i_49_ = 0; i_49_ < anInt2282; i_49_++)
            anIntArray2277[i_49_] = stream.readByte(116);

        for (int i_50_ = 0; i_50_ < anInt2282; i_50_++)
            anIntArrayArray2283[i_50_] = new int[stream.readByte(123)];

        for (int i_51_ = 0; anInt2282 > i_51_; i_51_++) {
            for (int i_52_ = 0;
                    ((i_52_ ^ 0xffffffff) > (anIntArrayArray2283[i_51_].length ^
                    0xffffffff)); i_52_++)
                anIntArrayArray2283[i_51_][i_52_] = stream.readByte(124);
        }
    }

    public static boolean method1042(int i, Class18 class18) {
        anInt2276++;

        int i_0_ = class18.anInt376;

        if ((i_0_ ^ 0xffffffff) == -206) {
            ObjectDef.anInt2734 = 250;

            return true;
        }

        if ((i_0_ >= 300) && ((i_0_ ^ 0xffffffff) >= -314)) {
            int i_1_ = (-300 + i_0_) / 2;
            int i_2_ = i_0_ & 0x1;
            Class57.aClass29_1098.method271(i ^ ~0x5a, i_2_ == 1, i_1_);
        }

        if ((i_0_ >= 314) && ((i_0_ ^ 0xffffffff) >= -324)) {
            int i_3_ = (i_0_ + -314) / 2;
            int i_4_ = i_0_ & 0x1;
            Class57.aClass29_1098.method267(i_3_, i_4_ == 1, (byte) -69);
        }

        if (i != 3) {
            method1043(-94, -86, null, 18, -110, -126);
        }

        if ((i_0_ ^ 0xffffffff) == -325) {
            Class57.aClass29_1098.method263((byte) 55, false);
        }

        if (i_0_ == 325) {
            Class57.aClass29_1098.method263((byte) 55, true);
        }

        if (i_0_ == 326) {
            Class42.aStream_Sub1_936.writePacket(-1494101117, 27);
            Class57.aClass29_1098.method264(Class42.aStream_Sub1_936, -1);
            Class37.anInt811++;

            return true;
        }

        return false;
    }

    public static void method1043(int i, int i_5_,
        Class37_Sub4_Sub9_Sub3 class37_sub4_sub9_sub3, int i_6_, int i_7_,
        int i_8_) {
        anInt2289++;

        if (class37_sub4_sub9_sub3 != null) {
            int i_9_ = (0x7ff &
                (Class37_Sub14.anInt2127 - -Class37_Sub9_Sub37.anInt3590));
            int i_10_ = (i_5_ * i_5_) + (i_8_ * i_8_);

            if (i_10_ <= 6400) {
                int i_11_ = Class37_Sub4_Sub9_Sub4.anIntArray3910[i_9_];
                int i_12_ = Class37_Sub4_Sub9_Sub4.anIntArray3929[i_9_];
                i_12_ = (256 * i_12_) / (Class78.anInt1458 - -256);
                i_11_ = (256 * i_11_) / (256 + Class78.anInt1458);

                if (i_6_ != 94) {
                    method1046(-50, -14, -60, 49, null, 113, 29, 103, 82, null);
                }

                int i_13_ = ((i_5_ * i_12_) + (i_11_ * i_8_)) >> -2145658864;
                int i_14_ = ((i_8_ * i_12_) + -(i_5_ * i_11_)) >> -526910832;

                if ((i_10_ ^ 0xffffffff) < -2501) {
                    class37_sub4_sub9_sub3.method633(Canvas_Sub1.aClass37_Sub4_Sub9_Sub1_47,
                        ((94 + i_7_ + i_13_) -
                        ((class37_sub4_sub9_sub3.anInt3906 / 2) - 4)),
                        (-(class37_sub4_sub9_sub3.anInt3905 / 2) + -i_14_ +
                        (i - -83) + -4));
                } else {
                    class37_sub4_sub9_sub3.method653(((4 +
                        (94 + (i_7_ + i_13_))) -
                        (class37_sub4_sub9_sub3.anInt3906 / 2)),
                        (-(class37_sub4_sub9_sub3.anInt3905 / 2) +
                        ((i + 83) - (i_14_ + 4))));
                }
            }
        }
    }

    public static void method1044(int i, Class18 class18, byte i_15_, int i_16_) {
        anInt2288++;

        if (i_15_ != -69) {
            method1046(52, -14, -102, 81, null, -61, 74, -128, 117, null);
        }

        if ((Class37_Sub7.aClass18_1894 == null) &&
                !Class37_Sub20.aBoolean2220 &&
                ((class18 != null) &&
                (Class37_Sub9_Sub25.method874(-122, class18) != null))) {
            Class37_Sub7.aClass18_1894 = class18;

            Class77.aClass18_1452 = Class37_Sub9_Sub25.method874(i_15_ ^ 0x38,
                    class18);
            Class37_Sub9_Sub37.aBoolean3591 = false;
            Class37_Sub4_Sub7_Sub1_Sub1.anInt3957 = i;
            Class37_Sub4_Sub7.anInt2640 = 0;
            Class37_Sub9_Sub15.anInt3182 = i_16_;
        }
    }

    public static boolean method1045(int i, int i_17_) {
        anInt2287++;

        if ((i ^ 0xffffffff) > -33) {
            return false;
        }

        int i_18_ = 26 / ((-49 - i_17_) / 46);

        if ((i ^ 0xffffffff) == -128) {
            return false;
        }

        if ((i >= 129) && (i <= 159)) {
            return false;
        }

        return true;
    }

    public static void method1046(int i, int i_19_, int i_20_, int i_21_,
        Class20 class20, int i_22_, int i_23_, int i_24_, int i_25_,
        Class67 class67) {
        try {
            if (i_20_ < -114) {
                anInt2281++;

                ObjectDef objectdef = Class37_Sub9_Sub8.method794(i_24_,
                        28067);
                int i_26_;
                int i_27_;

                if ((i_22_ == 1) || (i_22_ == 3)) {
                    i_27_ = objectdef.tileDepth;
                    i_26_ = objectdef.tileWidth;
                } else {
                    i_26_ = objectdef.tileDepth;
                    i_27_ = objectdef.tileWidth;
                }

                int i_28_;
                int i_29_;

                if (((i_27_ + i_25_) ^ 0xffffffff) < -105) {
                    i_28_ = i_25_;
                    i_29_ = 1 + i_25_;
                } else {
                    i_28_ = i_25_ + (i_27_ >> 1120339297);
                    i_29_ = ((1 + i_27_) >> 1895317665) + i_25_;
                }

                int i_30_ = (i_25_ << 1877368039) + (i_27_ << -1707351258);
                int i_31_;
                int i_32_;

                if (((i_23_ - -i_26_) ^ 0xffffffff) >= -105) {
                    i_32_ = (i_26_ >> -678265631) + i_23_;
                    i_31_ = i_23_ + ((i_26_ + 1) >> -1721432511);
                } else {
                    i_31_ = 1 + i_23_;
                    i_32_ = i_23_;
                }

                int[][] is = Class64.anIntArrayArrayArray1217[i_21_];
                int i_33_ = ((is[i_29_][i_31_] + is[i_29_][i_32_] +
                    (is[i_28_][i_32_] - -is[i_28_][i_31_])) >> 384657346);
                int i_34_ = (i_26_ << -1235543866) + (i_23_ << -1826973721);
                int i_35_ = (((i_24_ << -590717426) + i_25_ +
                    (i_23_ << -328852665)) - -1073741824);

                if ((objectdef.anInt2726 ^ 0xffffffff) == -1) {
                    i_35_ += -2147483648;
                }

                int i_36_ = i_19_ + (i_22_ << -113673370);

                if (objectdef.anInt2719 == 1) {
                    i_36_ += 256;
                }

                if (i_19_ == 22) {
                    Class37_Sub4_Sub7 class37_sub4_sub7;

                    if ((objectdef.animation != -1) ||
                            (objectdef.anIntArray2702 != null)) {
                        class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i_24_,
                                22, i_22_, i_21_, i_25_, i_23_,
                                (objectdef.animation), true, null);
                    } else {
                        class37_sub4_sub7 = objectdef.method683(i_22_,
                                is, i_30_, i_33_, i_34_, true, 22);
                    }

                    class67.method1225(i, i_25_, i_23_, i_33_,
                        class37_sub4_sub7, i_35_, i_36_);

                    if ((objectdef.anInt2740 ^ 0xffffffff) == -2) {
                        class20.method222(26108, i_23_, i_25_);
                    }
                } else if ((i_19_ == 10) || ((i_19_ ^ 0xffffffff) == -12)) {
                    Class37_Sub4_Sub7 class37_sub4_sub7;

                    if ((objectdef.animation == -1) &&
                            (objectdef.anIntArray2702 == null)) {
                        class37_sub4_sub7 = objectdef.method683(i_22_,
                                is, i_30_, i_33_, i_34_, true, 10);
                    } else {
                        class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i_24_,
                                10, i_22_, i_21_, i_25_, i_23_,
                                (objectdef.animation), true, null);
                    }

                    if (class37_sub4_sub7 != null) {
                        class67.method1203(i, i_25_, i_23_, i_33_, i_27_,
                            i_26_, class37_sub4_sub7,
                            (((i_19_ ^ 0xffffffff) != -12) ? 0 : 256), i_35_,
                            i_36_);
                    }

                    if ((objectdef.anInt2740 ^ 0xffffffff) != -1) {
                        class20.method223(i_23_, i_26_, -1, i_27_, i_25_,
                            objectdef.ProjectileBlocked);
                    }
                } else if ((i_19_ ^ 0xffffffff) <= -13) {
                    Class37_Sub4_Sub7 class37_sub4_sub7;

                    if ((objectdef.animation == -1) &&
                            (objectdef.anIntArray2702 == null)) {
                        class37_sub4_sub7 = objectdef.method683(i_22_,
                                is, i_30_, i_33_, i_34_, true, i_19_);
                    } else {
                        class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i_24_,
                                i_19_, i_22_, i_21_, i_25_, i_23_,
                                (objectdef.animation), true, null);
                    }

                    class67.method1203(i, i_25_, i_23_, i_33_, 1, 1,
                        class37_sub4_sub7, 0, i_35_, i_36_);

                    if (objectdef.anInt2740 != 0) {
                        class20.method223(i_23_, i_26_, -1, i_27_, i_25_,
                            objectdef.ProjectileBlocked);
                    }
                } else if (i_19_ == 0) {
                    Class37_Sub4_Sub7 class37_sub4_sub7;

                    if (((objectdef.animation ^ 0xffffffff) != 0) ||
                            (objectdef.anIntArray2702 != null)) {
                        class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i_24_,
                                0, i_22_, i_21_, i_25_, i_23_,
                                (objectdef.animation), true, null);
                    } else {
                        class37_sub4_sub7 = objectdef.method683(i_22_,
                                is, i_30_, i_33_, i_34_, true, 0);
                    }

                    class67.method1193(i, i_25_, i_23_, i_33_,
                        class37_sub4_sub7, null,
                        Class37_Sub14.anIntArray2126[i_22_], 0, i_35_, i_36_);

                    if (objectdef.anInt2740 != 0) {
                        class20.method217(i_23_, (byte) -128,
                            objectdef.ProjectileBlocked, i_19_, i_25_, i_22_);
                    }
                } else if ((i_19_ ^ 0xffffffff) == -2) {
                    Class37_Sub4_Sub7 class37_sub4_sub7;

                    if (((objectdef.animation ^ 0xffffffff) != 0) ||
                            (objectdef.anIntArray2702 != null)) {
                        class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i_24_,
                                1, i_22_, i_21_, i_25_, i_23_,
                                (objectdef.animation), true, null);
                    } else {
                        class37_sub4_sub7 = objectdef.method683(i_22_,
                                is, i_30_, i_33_, i_34_, true, 1);
                    }

                    class67.method1193(i, i_25_, i_23_, i_33_,
                        class37_sub4_sub7, null,
                        (Class37_Sub9_Sub35.anIntArray3561[i_22_]), 0, i_35_,
                        i_36_);

                    if (objectdef.anInt2740 != 0) {
                        class20.method217(i_23_, (byte) 50,
                            objectdef.ProjectileBlocked, i_19_, i_25_, i_22_);
                    }
                } else if ((i_19_ ^ 0xffffffff) == -3) {
                    int i_37_ = (i_22_ + 1) & 0x3;
                    Class37_Sub4_Sub7 class37_sub4_sub7;
                    Class37_Sub4_Sub7 class37_sub4_sub7_38_;

                    if (((objectdef.animation ^ 0xffffffff) != 0) ||
                            (objectdef.anIntArray2702 != null)) {
                        class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i_24_,
                                2, i_22_ + 4, i_21_, i_25_, i_23_,
                                (objectdef.animation), true, null);

                        class37_sub4_sub7_38_ = new Class37_Sub4_Sub7_Sub5(i_24_,
                                2, i_37_, i_21_, i_25_, i_23_,
                                (objectdef.animation), true, null);
                    } else {
                        class37_sub4_sub7 = objectdef.method683(4 -
                                -i_22_, is, i_30_, i_33_, i_34_, true, 2);

                        class37_sub4_sub7_38_ = objectdef.method683(i_37_,
                                is, i_30_, i_33_, i_34_, true, 2);
                    }

                    class67.method1193(i, i_25_, i_23_, i_33_,
                        class37_sub4_sub7, class37_sub4_sub7_38_,
                        Class37_Sub14.anIntArray2126[i_22_],
                        Class37_Sub14.anIntArray2126[i_37_], i_35_, i_36_);

                    if ((objectdef.anInt2740 ^ 0xffffffff) != -1) {
                        class20.method217(i_23_, (byte) -109,
                            objectdef.ProjectileBlocked, i_19_, i_25_, i_22_);
                    }
                } else if (i_19_ == 3) {
                    Class37_Sub4_Sub7 class37_sub4_sub7;

                    if ((objectdef.animation == -1) &&
                            (objectdef.anIntArray2702 == null)) {
                        class37_sub4_sub7 = objectdef.method683(i_22_,
                                is, i_30_, i_33_, i_34_, true, 3);
                    } else {
                        class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i_24_,
                                3, i_22_, i_21_, i_25_, i_23_,
                                (objectdef.animation), true, null);
                    }

                    class67.method1193(i, i_25_, i_23_, i_33_,
                        class37_sub4_sub7, null,
                        (Class37_Sub9_Sub35.anIntArray3561[i_22_]), 0, i_35_,
                        i_36_);

                    if (objectdef.anInt2740 != 0) {
                        class20.method217(i_23_, (byte) 43,
                            objectdef.ProjectileBlocked, i_19_, i_25_, i_22_);
                    }
                } else if (i_19_ == 9) {
                    Class37_Sub4_Sub7 class37_sub4_sub7;

                    if (((objectdef.animation ^ 0xffffffff) != 0) ||
                            (objectdef.anIntArray2702 != null)) {
                        class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i_24_,
                                i_19_, i_22_, i_21_, i_25_, i_23_,
                                (objectdef.animation), true, null);
                    } else {
                        class37_sub4_sub7 = objectdef.method683(i_22_,
                                is, i_30_, i_33_, i_34_, true, i_19_);
                    }

                    class67.method1203(i, i_25_, i_23_, i_33_, 1, 1,
                        class37_sub4_sub7, 0, i_35_, i_36_);

                    if ((objectdef.anInt2740 ^ 0xffffffff) != -1) {
                        class20.method223(i_23_, i_26_, -1, i_27_, i_25_,
                            objectdef.ProjectileBlocked);
                    }
                } else if ((i_19_ ^ 0xffffffff) == -5) {
                    Class37_Sub4_Sub7 class37_sub4_sub7;

                    if (((objectdef.animation ^ 0xffffffff) != 0) ||
                            (objectdef.anIntArray2702 != null)) {
                        class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i_24_,
                                4, i_22_, i_21_, i_25_, i_23_,
                                (objectdef.animation), true, null);
                    } else {
                        class37_sub4_sub7 = objectdef.method683(i_22_,
                                is, i_30_, i_33_, i_34_, true, 4);
                    }

                    class67.method1201(i, i_25_, i_23_, i_33_,
                        class37_sub4_sub7, null,
                        Class37_Sub14.anIntArray2126[i_22_], 0, 0, 0, i_35_,
                        i_36_);
                } else if ((i_19_ ^ 0xffffffff) == -6) {
                    int i_39_ = class67.method1230(i, i_25_, i_23_);
                    int i_40_ = 16;

                    if (i_39_ != 0) {
                        i_40_ = (Class37_Sub9_Sub8.method794((i_39_ >> -452803794) &
                                0x7fff, 28067).anInt2725);
                    }

                    Class37_Sub4_Sub7 class37_sub4_sub7;

                    if (((objectdef.animation ^ 0xffffffff) != 0) ||
                            (objectdef.anIntArray2702 != null)) {
                        class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i_24_,
                                4, i_22_, i_21_, i_25_, i_23_,
                                (objectdef.animation), true, null);
                    } else {
                        class37_sub4_sub7 = objectdef.method683(i_22_,
                                is, i_30_, i_33_, i_34_, true, 4);
                    }

                    class67.method1201(i, i_25_, i_23_, i_33_,
                        class37_sub4_sub7, null,
                        Class37_Sub14.anIntArray2126[i_22_], 0,
                        RSApplet.anIntArray171[i_22_] * i_40_,
                        i_40_ * (Class37_Sub9_Sub4.anIntArray2983[i_22_]),
                        i_35_, i_36_);
                } else if (i_19_ == 6) {
                    int i_41_ = 8;
                    int i_42_ = class67.method1230(i, i_25_, i_23_);

                    if ((i_42_ ^ 0xffffffff) != -1) {
                        i_41_ = (Class37_Sub9_Sub8.method794((0x1fffc7b8 &
                                i_42_) >> 130697006, 28067).anInt2725) / 2;
                    }

                    Class37_Sub4_Sub7 class37_sub4_sub7;

                    if ((objectdef.animation != -1) ||
                            (objectdef.anIntArray2702 != null)) {
                        class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i_24_,
                                4, i_22_ - -4, i_21_, i_25_, i_23_,
                                (objectdef.animation), true, null);
                    } else {
                        class37_sub4_sub7 = objectdef.method683(i_22_ -
                                -4, is, i_30_, i_33_, i_34_, true, 4);
                    }

                    class67.method1201(i, i_25_, i_23_, i_33_,
                        class37_sub4_sub7, null, 256, i_22_,
                        Class44.anIntArray965[i_22_] * i_41_,
                        (Class37_Sub9_Sub9.anIntArray3081[i_22_] * i_41_),
                        i_35_, i_36_);
                } else if (i_19_ == 7) {
                    int i_43_ = 0x3 & (2 + i_22_);
                    Class37_Sub4_Sub7 class37_sub4_sub7;

                    if (((objectdef.animation ^ 0xffffffff) != 0) ||
                            (objectdef.anIntArray2702 != null)) {
                        class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i_24_,
                                4, i_43_ - -4, i_21_, i_25_, i_23_,
                                (objectdef.animation), true, null);
                    } else {
                        class37_sub4_sub7 = objectdef.method683(i_43_ -
                                -4, is, i_30_, i_33_, i_34_, true, 4);
                    }

                    class67.method1201(i, i_25_, i_23_, i_33_,
                        class37_sub4_sub7, null, 256, i_43_, 0, 0, i_35_, i_36_);
                } else if ((i_19_ ^ 0xffffffff) == -9) {
                    int i_44_ = 8;
                    int i_45_ = class67.method1230(i, i_25_, i_23_);

                    if (i_45_ != 0) {
                        i_44_ = (Class37_Sub9_Sub8.method794((0x1fffebb7 &
                                i_45_) >> -885144786, 28067).anInt2725) / 2;
                    }

                    int i_46_ = 0x3 & (i_22_ + 2);
                    Class37_Sub4_Sub7 class37_sub4_sub7;
                    Class37_Sub4_Sub7 class37_sub4_sub7_47_;

                    if ((objectdef.animation == -1) &&
                            (objectdef.anIntArray2702 == null)) {
                        class37_sub4_sub7 = objectdef.method683(4 +
                                i_22_, is, i_30_, i_33_, i_34_, true, 4);

                        class37_sub4_sub7_47_ = objectdef.method683(i_46_ -
                                -4, is, i_30_, i_33_, i_34_, true, 4);
                    } else {
                        class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i_24_,
                                4, i_22_ + 4, i_21_, i_25_, i_23_,
                                (objectdef.animation), true, null);

                        class37_sub4_sub7_47_ = new Class37_Sub4_Sub7_Sub5(i_24_,
                                4, 4 + i_46_, i_21_, i_25_, i_23_,
                                (objectdef.animation), true, null);
                    }

                    class67.method1201(i, i_25_, i_23_, i_33_,
                        class37_sub4_sub7, class37_sub4_sub7_47_, 256, i_22_,
                        i_44_ * Class44.anIntArray965[i_22_],
                        i_44_ * (Class37_Sub9_Sub9.anIntArray3081[i_22_]),
                        i_35_, i_36_);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("wf.A(" + i + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' +
                ((class20 != null) ? "{...}" : "null") + ',' + i_22_ + ',' +
                i_23_ + ',' + i_24_ + ',' + i_25_ + ',' +
                ((class67 != null) ? "{...}" : "null") + ')'));
        }
    }

    public static void method1047(byte i) {
        aShortArrayArray2280 = null;
        aJString_2279 = null;
        aJString_2274 = null;
        aClass18_2285 = null;
        aClass37_Sub4_Sub9_Sub3Array2291 = null;

        int i_48_ = -120 % ((51 - i) / 61);
        aJString_2284 = null;
        aJString_2275 = null;
    }
}
