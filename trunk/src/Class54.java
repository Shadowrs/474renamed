/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class54 {
    public static boolean[] aBooleanArray1058 = new boolean[8];
    public static int anInt1059;
    public static Class15_Sub1 aClass15_Sub1_1060;
    public static JString aJString_1061 = Class37_Sub2.method332((byte) 106,
            " )2> <col=ffffff>");
    public static int anInt1062;
    public static int anInt1063;

    public static void method1138(boolean bool) {
        aBooleanArray1058 = null;

        if (bool != false) {
            aClass15_Sub1_1060 = null;
        }

        aClass15_Sub1_1060 = null;
        aJString_1061 = null;
    }

    public static void method1139(int i, int i_0_, Class18[] class18s,
        int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
        anInt1063++;
        Class37_Sub4_Sub9.method589(i_3_, i_1_, i_6_, i_2_);
        Class37_Sub4_Sub9_Sub4.method674();

        int i_8_ = 0;

        if (i_4_ != -26787) {
            method1139(-23, -37, null, 16, -5, 35, -94, 118, -100, -101);
        }

        for (; class18s.length > i_8_; i_8_++) {
            Class18 class18 = class18s[i_8_];

            if ((class18 != null) &&
                    ((class18.anInt394 == i_7_) ||
                    ((i_7_ == -1412584499) &&
                    (class18 == Class37_Sub7.aClass18_1894)))) {
                int i_9_;

                if (i_0_ == -1) {
                    Class71.anIntArray1364[Class37_Sub9_Sub37.anInt3597] = class18.anInt329 -
                        -i;

                    Class43.anIntArray961[Class37_Sub9_Sub37.anInt3597] = i_5_ +
                        class18.anInt415;

                    PacketStream.anIntArray3611[(Class37_Sub9_Sub37.anInt3597)] = class18.anInt441;

                    Class37_Sub4_Sub7_Sub7.anIntArray3842[(Class37_Sub9_Sub37.anInt3597)] = class18.anInt353;
                    i_9_ = Class37_Sub9_Sub37.anInt3597++;
                } else {
                    i_9_ = i_0_;
                }

                class18.anInt343 = Class37_Sub7.anInt1898;
                class18.anInt458 = i_9_;

                if (!class18.aBoolean374 || !Class66.method1188(0, class18)) {
                    if (class18.anInt376 > 0) {
                        Class46.method1102(class18, i_4_ ^ ~0x68a8);
                    }

                    int i_10_ = i + class18.anInt329;
                    int i_11_ = class18.anInt320;
                    int i_12_ = class18.anInt415 - -i_5_;

                    if (class18 == Class37_Sub7.aClass18_1894) {
                        if ((i_7_ != -1412584499) && !class18.aBoolean372) {
                            Class32.anInt742 = i_5_;
                            Class78.aClass18Array1456 = class18s;
                            Class37_Sub4_Sub4.anInt2588 = i;

                            continue;
                        }

                        if (!class18.aBoolean372) {
                            i_11_ = 128;
                        }

                        if (Class37_Sub9_Sub37.aBoolean3591 &&
                                Class32.aBoolean746) {
                            int i_13_ = Class37_Sub4_Sub7_Sub7.anInt3851;
                            i_13_ -= Class37_Sub4_Sub7_Sub1_Sub1.anInt3957;

                            if ((Class37_Sub4_Sub7_Sub1_Sub2.anInt3977 ^
                                    0xffffffff) < (i_13_ ^ 0xffffffff)) {
                                i_13_ = Class37_Sub4_Sub7_Sub1_Sub2.anInt3977;
                            }

                            int i_14_ = Class37_Sub9_Sub1.anInt2914;

                            if (((i_13_ + class18.anInt441) ^ 0xffffffff) < ((Class37_Sub4_Sub7_Sub1_Sub2.anInt3977 +
                                    Class77.aClass18_1452.anInt441) ^
                                    0xffffffff)) {
                                i_13_ = (-class18.anInt441 +
                                    (Class77.aClass18_1452.anInt441 +
                                    (Class37_Sub4_Sub7_Sub1_Sub2.anInt3977)));
                            }

                            i_10_ = i_13_;
                            i_14_ -= Class37_Sub9_Sub15.anInt3182;

                            if (Class59.anInt1134 > i_14_) {
                                i_14_ = Class59.anInt1134;
                            }

                            if ((class18.anInt353 + i_14_) > (Class59.anInt1134 +
                                    Class77.aClass18_1452.anInt353)) {
                                i_14_ = (Class59.anInt1134 -
                                    -Class77.aClass18_1452.anInt353 -
                                    class18.anInt353);
                            }

                            i_12_ = i_14_;
                        }
                    }

                    int i_15_;
                    int i_16_;
                    int i_17_;
                    int i_18_;

                    if ((class18.anInt354 ^ 0xffffffff) != -3) {
                        if ((class18.anInt354 ^ 0xffffffff) == -10) {
                            int i_19_ = i_10_;
                            int i_20_ = i_12_;
                            int i_21_ = i_10_ + class18.anInt441;

                            if (i_19_ > i_21_) {
                                int i_22_ = i_19_;
                                i_19_ = i_21_;
                                i_21_ = i_22_;
                            }

                            i_16_ = (((i_19_ ^ 0xffffffff) >= (i_3_ ^
                                0xffffffff)) ? i_3_ : i_19_);
                            i_15_ = (((++i_21_ ^ 0xffffffff) <= (i_6_ ^
                                0xffffffff)) ? i_6_ : i_21_);

                            int i_23_ = i_12_ + class18.anInt353;

                            if ((i_23_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff)) {
                                int i_24_ = i_20_;
                                i_20_ = i_23_;
                                i_23_ = i_24_;
                            }

                            i_23_++;
                            i_18_ = (i_2_ > i_23_) ? i_23_ : i_2_;
                            i_17_ = (((i_20_ ^ 0xffffffff) < (i_1_ ^
                                0xffffffff)) ? i_20_ : i_1_);
                        } else {
                            i_16_ = (((i_10_ ^ 0xffffffff) >= (i_3_ ^
                                0xffffffff)) ? i_3_ : i_10_);
                            i_17_ = (((i_12_ ^ 0xffffffff) < (i_1_ ^
                                0xffffffff)) ? i_12_ : i_1_);

                            int i_25_ = i_10_ - -class18.anInt441;
                            i_15_ = (i_6_ > i_25_) ? i_25_ : i_6_;

                            int i_26_ = class18.anInt353 + i_12_;
                            i_18_ = (i_2_ <= i_26_) ? i_2_ : i_26_;
                        }
                    } else {
                        i_15_ = i_6_;
                        i_16_ = i_3_;
                        i_17_ = i_1_;
                        i_18_ = i_2_;
                    }

                    if (!class18.aBoolean374 ||
                            (((i_15_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff)) &&
                            (i_17_ < i_18_))) {
                        if ((class18.anInt376 ^ 0xffffffff) != -1) {
                            if (class18.anInt376 == 1337) {
                                Class84.anInt1531 = i_10_;
                                Class60.anInt1154 = i_12_;
                                Class37_Sub15.method1008(class18.anInt353,
                                    i_4_ ^ ~0x79f8, class18.anInt441, i_12_,
                                    i_10_);
                                Class37_Sub4_Sub9.method589(i_3_, i_1_, i_6_,
                                    i_2_);

                                continue;
                            }

                            if (class18.anInt376 == 1338) {
                                Class77.method1290(i_9_, i_12_, i_10_, 6853);
                                Class37_Sub4_Sub9.method589(i_3_, i_1_, i_6_,
                                    i_2_);

                                continue;
                            }
                        }

                        int i_27_ = Class37_Sub4_Sub7_Sub7.anInt3851;
                        int i_28_ = Class37_Sub9_Sub1.anInt2914;

                        if (!Class37_Sub20.aBoolean2220 &&
                                ((i_16_ ^ 0xffffffff) >= (i_27_ ^ 0xffffffff)) &&
                                (i_28_ >= i_17_) && (i_27_ < i_15_) &&
                                ((i_18_ ^ 0xffffffff) < (i_28_ ^ 0xffffffff))) {
                            Class39.method1061(class18, false, i_27_ - i_10_,
                                i_28_ - i_12_);
                        }

                        if (class18.anInt354 == 0) {
                            if (!class18.aBoolean374 &&
                                    Class66.method1188(0, class18) &&
                                    (Class42.aClass18_942 != class18)) {
                                continue;
                            }

                            if (!class18.aBoolean374) {
                                if (class18.anInt432 > (class18.anInt348 -
                                        class18.anInt353)) {
                                    class18.anInt432 = -class18.anInt353 +
                                        class18.anInt348;
                                }

                                if (class18.anInt432 < 0) {
                                    class18.anInt432 = 0;
                                }
                            }

                            method1139(i_10_ - class18.anInt371, i_9_,
                                class18s, i_17_, i_18_, i_16_, -26787,
                                -class18.anInt432 + i_12_, i_15_,
                                class18.anInt402);

                            if (class18.aClass18Array450 != null) {
                                method1139(i_10_ - class18.anInt371, i_9_,
                                    class18.aClass18Array450, i_17_, i_18_,
                                    i_16_, -26787, -class18.anInt432 + i_12_,
                                    i_15_, class18.anInt402);
                            }

                            Class37_Sub6 class37_sub6 = ((Class37_Sub6) (Class76.aClass13_1423.method100((byte) 28,
                                    (long) class18.anInt402)));

                            if (class37_sub6 != null) {
                                if (((class37_sub6.anInt1882 ^ 0xffffffff) == -1) &&
                                        ((Class37_Sub4_Sub7_Sub7.anInt3851 ^
                                        0xffffffff) <= (i_16_ ^ 0xffffffff)) &&
                                        (Class37_Sub9_Sub1.anInt2914 >= i_17_) &&
                                        (Class37_Sub4_Sub7_Sub7.anInt3851 < i_15_) &&
                                        ((Class37_Sub9_Sub1.anInt2914 ^
                                        0xffffffff) > (i_18_ ^ 0xffffffff)) &&
                                        !Class37_Sub20.aBoolean2220 &&
                                        !Class37_Sub3_Sub1.aBoolean2328) {
                                    Class37_Sub9_Sub13.anInt3134 = 1;

                                    Class37_Sub9_Sub14.aJStringArray3151[0] = Class37_Sub9_Sub23.aJString_3347;

                                    Class37_Sub9_Sub20.anIntArray3300[0] = 1004;

                                    Class37_Sub9_Sub37.aJStringArray3593[0] = Class37_Sub9_Sub8.aJString_3045;
                                }

                                Class37_Sub23.method1030(i_10_,
                                    (class37_sub6.anInt1884), i_15_, i_17_,
                                    (byte) 111, i_12_, i_9_, i_18_, i_16_);
                            }

                            Class37_Sub4_Sub9.method589(i_3_, i_1_, i_6_, i_2_);
                            Class37_Sub4_Sub9_Sub4.method674();
                        }

                        if (Class37_Sub9_Sub36.aBooleanArray3587[i_9_] ||
                                ((Class37_Sub4_Sub13.anInt2793 ^ 0xffffffff) < -2)) {
                            if ((class18.anInt354 == 0) &&
                                    !class18.aBoolean374 &&
                                    (class18.anInt348 > class18.anInt353)) {
                                Class32_Sub1.method297(class18.anInt432,
                                    (class18.anInt441 + i_10_),
                                    class18.anInt348, i_12_, class18.anInt353,
                                    true);
                            }

                            if (class18.anInt354 != 1) {
                                if ((class18.anInt354 ^ 0xffffffff) == -3) {
                                    int i_29_ = 0;

                                    for (int i_30_ = 0;
                                            ((i_30_ ^ 0xffffffff) > (class18.anInt353 ^
                                            0xffffffff)); i_30_++) {
                                        for (int i_31_ = 0;
                                                i_31_ < class18.anInt441;
                                                i_31_++) {
                                            int i_32_ = ((i_31_ * (32 +
                                                class18.anInt423)) + i_10_);
                                            int i_33_ = (i_12_ -
                                                -(i_30_ * (32 -
                                                -(class18.anInt426))));

                                            if ((i_29_ ^ 0xffffffff) > -21) {
                                                i_33_ += (class18.anIntArray424[i_29_]);
                                                i_32_ += (class18.anIntArray448[i_29_]);
                                            }

                                            if (class18.anIntArray356[i_29_] <= 0) {
                                                if ((class18.anIntArray342 != null) &&
                                                        ((i_29_ ^ 0xffffffff) > -21)) {
                                                    Class37_Sub4_Sub9_Sub3 class37_sub4_sub9_sub3 =
                                                        (class18.method198(i_29_,
                                                            (byte) -107));

                                                    if (class37_sub4_sub9_sub3 != null) {
                                                        class37_sub4_sub9_sub3.method653(i_32_,
                                                            i_33_);
                                                    } else if (Class27.aBoolean672) {
                                                        Class73.method1274(class18,
                                                            -1);
                                                    }
                                                }
                                            } else {
                                                boolean bool = false;
                                                int i_34_ = ((class18.anIntArray356[i_29_]) +
                                                    -1);
                                                boolean bool_35_ = false;

                                                if (((i_3_ < (32 + i_32_)) &&
                                                        ((i_6_ ^ 0xffffffff) < (i_32_ ^
                                                        0xffffffff)) &&
                                                        (i_1_ < (32 + i_33_)) &&
                                                        ((i_2_ ^ 0xffffffff) < (i_33_ ^
                                                        0xffffffff))) ||
                                                        ((class18 == (Class37_Sub25.aClass18_2285)) &&
                                                        ((Class37_Sub9.anInt1979) == i_29_))) {
                                                    Class37_Sub4_Sub9_Sub3 class37_sub4_sub9_sub3;

                                                    if ((((Class37_Sub14.anInt2122) ^
                                                            0xffffffff) != -2) ||
                                                            ((RSApplet.anInt174 ^
                                                            0xffffffff) != (i_29_ ^
                                                            0xffffffff)) ||
                                                            ((Class37_Sub9_Sub21.anInt3317) != (class18.anInt402))) {
                                                        class37_sub4_sub9_sub3 = (Class37_Sub4_Sub7_Sub1_Sub2.method507(i_34_,
                                                                1, false,
                                                                false,
                                                                (class18.anIntArray422[i_29_]),
                                                                3153952));
                                                    } else {
                                                        class37_sub4_sub9_sub3 = (Class37_Sub4_Sub7_Sub1_Sub2.method507(i_34_,
                                                                2, false,
                                                                false,
                                                                (class18.anIntArray422[i_29_]),
                                                                0));
                                                    }

                                                    if (class37_sub4_sub9_sub3 != null) {
                                                        if (((Class37_Sub25.aClass18_2285) != class18) ||
                                                                (i_29_ != (Class37_Sub9.anInt1979))) {
                                                            if ((class18 == (Class37_Sub4_Sub13.aClass18_2797)) &&
                                                                    ((Class2.anInt75) == i_29_)) {
                                                                class37_sub4_sub9_sub3.method634(i_32_,
                                                                    i_33_, 128);
                                                            } else {
                                                                class37_sub4_sub9_sub3.method653(i_32_,
                                                                    i_33_);
                                                            }
                                                        } else {
                                                            int i_36_ = (-(Stream.anInt2009) +
                                                                (Class37_Sub4_Sub7_Sub7.anInt3851));

                                                            if (((i_36_ ^
                                                                    0xffffffff) > -6) &&
                                                                    (i_36_ > -5)) {
                                                                i_36_ = 0;
                                                            }

                                                            int i_37_ = (-(Class37_Sub4_Sub12.anInt2784) +
                                                                (Class37_Sub9_Sub1.anInt2914));

                                                            if (((i_37_ ^
                                                                    0xffffffff) > -6) &&
                                                                    ((i_37_ ^
                                                                    0xffffffff) < 4)) {
                                                                i_37_ = 0;
                                                            }

                                                            if ((Class79.anInt1495) < 5) {
                                                                i_37_ = 0;
                                                                i_36_ = 0;
                                                            }

                                                            class37_sub4_sub9_sub3.method634(i_36_ +
                                                                i_32_,
                                                                i_37_ + i_33_,
                                                                128);

                                                            if (i_7_ != -1) {
                                                                Class18 class18_38_ =
                                                                    (class18s[(i_7_ &
                                                                    0xffff)]);
                                                                int i_39_ = (Class37_Sub4_Sub9.anInt2664);
                                                                int i_40_ = (Class37_Sub4_Sub9.anInt2663);

                                                                if ((((i_37_ +
                                                                        i_33_) ^
                                                                        0xffffffff) > (i_40_ ^
                                                                        0xffffffff)) &&
                                                                        (((class18_38_.anInt432) ^
                                                                        0xffffffff) < -1)) {
                                                                    int i_41_ = (((Class37_Sub9_Sub37.anInt3589) * (-i_33_ +
                                                                        i_40_ +
                                                                        -i_37_)) / 3);

                                                                    if (((Class37_Sub9_Sub37.anInt3589) * 10) < i_41_) {
                                                                        i_41_ = 10 * Class37_Sub9_Sub37.anInt3589;
                                                                    }

                                                                    if ((class18_38_.anInt432) < i_41_) {
                                                                        i_41_ = class18_38_.anInt432;
                                                                    }

                                                                    Class37_Sub4_Sub12.anInt2784 += i_41_;

                                                                    class18_38_.anInt432 -= i_41_;
                                                                    Class73.method1274(class18_38_,
                                                                        -1);
                                                                }

                                                                if ((((32 +
                                                                        (i_37_ +
                                                                        i_33_)) ^
                                                                        0xffffffff) < (i_39_ ^
                                                                        0xffffffff)) &&
                                                                        ((class18_38_.anInt432) < ((class18_38_.anInt348) +
                                                                        -class18_38_.anInt353))) {
                                                                    int i_42_ = ((((-i_39_ +
                                                                        (32 +
                                                                        i_33_)) -
                                                                        -i_37_) * Class37_Sub9_Sub37.anInt3589) / 3);

                                                                    if ((10 * (Class37_Sub9_Sub37.anInt3589)) < i_42_) {
                                                                        i_42_ = 10 * Class37_Sub9_Sub37.anInt3589;
                                                                    }

                                                                    if (((class18_38_.anInt348) +
                                                                            (-class18_38_.anInt353 +
                                                                            -class18_38_.anInt432)) < i_42_) {
                                                                        i_42_ = (class18_38_.anInt348 +
                                                                            -class18_38_.anInt353) -
                                                                            class18_38_.anInt432;
                                                                    }

                                                                    class18_38_.anInt432 += i_42_;

                                                                    Class37_Sub4_Sub12.anInt2784 -= i_42_;
                                                                    Class73.method1274(class18_38_,
                                                                        -1);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        Class73.method1274(class18,
                                                            i_4_ ^ 0x68a2);
                                                    }
                                                }
                                            }

                                            i_29_++;
                                        }
                                    }
                                } else if (class18.anInt354 == 3) {
                                    int i_43_;

                                    if (!Class37_Sub4_Sub3.method470(class18, 4)) {
                                        i_43_ = class18.anInt442;

                                        if ((Class42.aClass18_942 == class18) &&
                                                (class18.anInt396 != 0)) {
                                            i_43_ = class18.anInt396;
                                        }
                                    } else {
                                        i_43_ = class18.anInt404;

                                        if ((Class42.aClass18_942 == class18) &&
                                                (class18.anInt417 != 0)) {
                                            i_43_ = class18.anInt417;
                                        }
                                    }

                                    if ((i_11_ ^ 0xffffffff) == -1) {
                                        if (!class18.aBoolean321) {
                                            Class37_Sub4_Sub9.method595(i_10_,
                                                i_12_, class18.anInt441,
                                                class18.anInt353, i_43_);
                                        } else {
                                            Class37_Sub4_Sub9.method578(i_10_,
                                                i_12_, class18.anInt441,
                                                class18.anInt353, i_43_);
                                        }
                                    } else if (class18.aBoolean321) {
                                        Class37_Sub4_Sub9.method586(i_10_,
                                            i_12_, class18.anInt441,
                                            class18.anInt353, i_43_,
                                            256 - (0xff & i_11_));
                                    } else {
                                        Class37_Sub4_Sub9.method588(i_10_,
                                            i_12_, class18.anInt441,
                                            class18.anInt353, i_43_,
                                            256 + -(i_11_ & 0xff));
                                    }
                                } else if (class18.anInt354 == 4) {
                                    Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1 =
                                        class18.method200(i_4_ ^ 0x68df);

                                    if (class37_sub4_sub9_sub2_sub1 == null) {
                                        if (Class27.aBoolean672) {
                                            Class73.method1274(class18, -1);
                                        }
                                    } else {
                                        JString jstring = class18.aJString_411;
                                        int i_44_;

                                        if (!Class37_Sub4_Sub3.method470(
                                                    class18, 4)) {
                                            i_44_ = class18.anInt442;

                                            if ((class18 == Class42.aClass18_942) &&
                                                    ((class18.anInt396 ^
                                                    0xffffffff) != -1)) {
                                                i_44_ = class18.anInt396;
                                            }
                                        } else {
                                            i_44_ = class18.anInt404;

                                            if ((Class42.aClass18_942 == class18) &&
                                                    (class18.anInt417 != 0)) {
                                                i_44_ = class18.anInt417;
                                            }

                                            if (class18.aJString_377.method172(
                                                        (byte) 38) > 0) {
                                                jstring = class18.aJString_377;
                                            }
                                        }

                                        if (class18.aBoolean374 &&
                                                ((class18.anInt367 ^
                                                0xffffffff) != 0)) {
                                            ItemDef itemdef = (Class46.method1108(class18.anInt367,
                                                    (byte) 100));
                                            jstring = (itemdef.aJString_2458);

                                            if (jstring == null) {
                                                jstring = (Class37_Sub9_Sub17.aJString_3226);
                                            }

                                            if (((itemdef.anInt2493 == 1) ||
                                                    (class18.anInt368 != 1)) &&
                                                    (class18.anInt368 != -1)) {
                                                jstring = (Class37_Sub9_Sub27.method881(125,
                                                        (new JString[] {
                                                            (Class37_Sub4_Sub2.aJString_2537),
                                                            jstring,
                                                            (Class37_Sub9_Sub23.aJString_3350),
                                                            (PacketStream.method994(
                                                                class18.anInt368,
                                                                3))
                                                        })));
                                            }
                                        }

                                        if (Class79.aClass18_1489 == class18) {
                                            i_44_ = class18.anInt442;
                                            jstring = Class14.aJString_234;
                                        }

                                        if (!class18.aBoolean374) {
                                            jstring = (Class37_Sub9_Sub25.method873((byte) -88,
                                                    class18, jstring));
                                        }

                                        class37_sub4_sub9_sub2_sub1.method619(jstring,
                                            i_10_, i_12_, class18.anInt441,
                                            class18.anInt353, i_44_,
                                            (!class18.aBoolean403) ? (-1) : 0,
                                            class18.anInt406, class18.anInt379,
                                            class18.anInt420);
                                    }
                                } else if (class18.anInt354 == 5) {
                                    if (class18.aBoolean374) {
                                        Class37_Sub4_Sub9_Sub3 class37_sub4_sub9_sub3;

                                        if ((class18.anInt367 ^ 0xffffffff) == 0) {
                                            class37_sub4_sub9_sub3 = class18.method194(false,
                                                    6021);
                                        } else {
                                            class37_sub4_sub9_sub3 = (Class37_Sub4_Sub7_Sub1_Sub2.method507(class18.anInt367,
                                                    class18.anInt449, false,
                                                    false, class18.anInt368,
                                                    class18.anInt335));
                                        }

                                        if (class37_sub4_sub9_sub3 != null) {
                                            int i_45_ = (class37_sub4_sub9_sub3.anInt3906);
                                            int i_46_ = (class37_sub4_sub9_sub3.anInt3905);

                                            if (class18.aBoolean336) {
                                                Class37_Sub4_Sub9.method592(i_10_,
                                                    i_12_,
                                                    i_10_ + class18.anInt441,
                                                    class18.anInt353 + i_12_);

                                                int i_47_ = (((class18.anInt353 +
                                                    i_46_) - 1) / i_46_);
                                                int i_48_ = ((-1 - -i_45_ +
                                                    class18.anInt441) / i_45_);

                                                for (int i_49_ = 0;
                                                        i_48_ > i_49_;
                                                        i_49_++) {
                                                    for (int i_50_ = 0;
                                                            ((i_47_ ^
                                                            0xffffffff) < (i_50_ ^
                                                            0xffffffff));
                                                            i_50_++) {
                                                        if (class18.anInt398 == 0) {
                                                            if ((i_11_ ^
                                                                    0xffffffff) == -1) {
                                                                class37_sub4_sub9_sub3.method653((i_10_ +
                                                                    (i_45_ * i_49_)),
                                                                    (i_12_ +
                                                                    (i_46_ * i_50_)));
                                                            } else {
                                                                class37_sub4_sub9_sub3.method634((i_10_ -
                                                                    -(i_45_ * i_49_)),
                                                                    (i_12_ -
                                                                    -(i_46_ * i_50_)),
                                                                    (256 +
                                                                    -(i_11_ &
                                                                    0xff)));
                                                            }
                                                        } else {
                                                            class37_sub4_sub9_sub3.method646((i_10_ +
                                                                (i_45_ * i_49_) +
                                                                (i_45_ / 2)),
                                                                ((i_46_ / 2) +
                                                                ((i_50_ * i_46_) +
                                                                i_12_)),
                                                                (class18.anInt398),
                                                                4096);
                                                        }
                                                    }
                                                }

                                                Class37_Sub4_Sub9.method589(i_3_,
                                                    i_1_, i_6_, i_2_);
                                            } else {
                                                int i_51_ = ((class18.anInt441 * 4096) / i_45_);

                                                if (class18.anInt398 != 0) {
                                                    class37_sub4_sub9_sub3.method646((i_10_ -
                                                        -(class18.anInt441 / 2)),
                                                        (i_12_ +
                                                        (class18.anInt353 / 2)),
                                                        class18.anInt398, i_51_);
                                                } else if (i_11_ == 0) {
                                                    if (((i_45_ ^ 0xffffffff) == (class18.anInt441 ^
                                                            0xffffffff)) &&
                                                            ((class18.anInt353 ^
                                                            0xffffffff) == (i_46_ ^
                                                            0xffffffff))) {
                                                        class37_sub4_sub9_sub3.method653(i_10_,
                                                            i_12_);
                                                    } else {
                                                        class37_sub4_sub9_sub3.method638(i_10_,
                                                            i_12_,
                                                            class18.anInt441,
                                                            class18.anInt353);
                                                    }
                                                } else {
                                                    class37_sub4_sub9_sub3.method636(i_10_,
                                                        i_12_,
                                                        class18.anInt441,
                                                        class18.anInt353,
                                                        (-(i_11_ & 0xff) + 256));
                                                }
                                            }
                                        } else if (Class27.aBoolean672) {
                                            Class73.method1274(class18, -1);
                                        }
                                    } else {
                                        Class37_Sub4_Sub9_Sub3 class37_sub4_sub9_sub3 =
                                            (class18.method194(Class37_Sub4_Sub3.method470(
                                                    class18, 4), 6021));

                                        if (class37_sub4_sub9_sub3 == null) {
                                            if (Class27.aBoolean672) {
                                                Class73.method1274(class18,
                                                    (i_4_ ^ 0x68a2));
                                            }
                                        } else {
                                            class37_sub4_sub9_sub3.method653(i_10_,
                                                i_12_);
                                        }
                                    }
                                } else if (class18.anInt354 == 6) {
                                    int i_52_ = 0;
                                    boolean bool = Class37_Sub4_Sub3.method470(class18,
                                            4);
                                    Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 =
                                        null;
                                    int i_53_;

                                    if (!bool) {
                                        i_53_ = class18.anInt390;
                                    } else {
                                        i_53_ = class18.anInt419;
                                    }

                                    if ((class18.anInt367 ^ 0xffffffff) != 0) {
                                        ItemDef itemdef = Class46.method1108((class18.anInt367),
                                                (byte) 84);

                                        if (itemdef != null) {
                                            itemdef = (itemdef.method453(class18.anInt368,
                                                    -78));

                                            class37_sub4_sub7_sub6 = (itemdef.method451((byte) -114,
                                                    1));

                                            if (class37_sub4_sub7_sub6 == null) {
                                                Class73.method1274(class18, -1);
                                            } else {
                                                class37_sub4_sub7_sub6.method555();
                                                i_52_ = (class37_sub4_sub7_sub6.anInt2627) / 2;
                                            }
                                        }
                                    } else if (class18.anInt408 != 5) {
                                        if ((i_53_ ^ 0xffffffff) == 0) {
                                            class37_sub4_sub7_sub6 = (class18.method190(i_4_ +
                                                    26908, -1, null, bool,
                                                    (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass29_3985)));

                                            if ((class37_sub4_sub7_sub6 == null) &&
                                                    Class27.aBoolean672) {
                                                Class73.method1274(class18, -1);
                                            }
                                        } else {
                                            Class37_Sub4_Sub12 class37_sub4_sub12 =
                                                (Class37_Sub9_Sub22.method861(i_4_ +
                                                    26910, i_53_));

                                            class37_sub4_sub7_sub6 = (class18.method190(124,
                                                    class18.anInt443,
                                                    class37_sub4_sub12, bool,
                                                    (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass29_3985)));

                                            if ((class37_sub4_sub7_sub6 == null) &&
                                                    Class27.aBoolean672) {
                                                Class73.method1274(class18, -1);
                                            }
                                        }
                                    } else if (class18.anInt369 != 0) {
                                        class37_sub4_sub7_sub6 = Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.method493(true);
                                    } else {
                                        class37_sub4_sub7_sub6 = (Class57.aClass29_1098.method272(null,
                                                -1, -256, -1, null));
                                    }

                                    if (class37_sub4_sub7_sub6 != null) {
                                        Class37_Sub4_Sub9_Sub4.method668(((class18.anInt441 / 2) +
                                            (i_10_ + class18.anInt380)),
                                            (class18.anInt431 +
                                            (class18.anInt353 / 2) + i_12_));

                                        int i_54_ = ((class18.anInt387 * (Class37_Sub4_Sub9_Sub4.anIntArray3910[class18.anInt319])) >> -1428547440);
                                        int i_55_ = (((Class37_Sub4_Sub9_Sub4.anIntArray3929[class18.anInt319]) * class18.anInt387) >> 1523352048);

                                        if (!class18.aBoolean374) {
                                            class37_sub4_sub7_sub6.method544(0,
                                                class18.anInt405, 0,
                                                class18.anInt319, 0, i_54_,
                                                i_55_);
                                        } else if (!class18.aBoolean364) {
                                            class37_sub4_sub7_sub6.method544(0,
                                                class18.anInt405,
                                                class18.anInt359,
                                                class18.anInt319,
                                                class18.anInt395,
                                                class18.anInt410 +
                                                (i_54_ + i_52_),
                                                i_55_ - -class18.anInt410);
                                        } else {
                                            class37_sub4_sub7_sub6.method557(0,
                                                class18.anInt405,
                                                class18.anInt359,
                                                class18.anInt319,
                                                class18.anInt395,
                                                i_54_ -
                                                (-i_52_ - class18.anInt410),
                                                class18.anInt410 + i_55_,
                                                class18.anInt387);
                                        }

                                        Class37_Sub4_Sub9_Sub4.method659();
                                    }
                                } else {
                                    if (class18.anInt354 == 7) {
                                        Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1 =
                                            class18.method200(i_4_ ^ 0x68ec);

                                        if (class37_sub4_sub9_sub2_sub1 == null) {
                                            if (Class27.aBoolean672) {
                                                Class73.method1274(class18, -1);
                                            }

                                            continue;
                                        }

                                        int i_56_ = 0;

                                        for (int i_57_ = 0;
                                                ((class18.anInt353 ^
                                                0xffffffff) < (i_57_ ^
                                                0xffffffff)); i_57_++) {
                                            for (int i_58_ = 0;
                                                    class18.anInt441 > i_58_;
                                                    i_58_++) {
                                                if ((class18.anIntArray356[i_56_]) > 0) {
                                                    ItemDef itemdef =
                                                        (Class46.method1108((class18.anIntArray356[i_56_]) -
                                                            1, (byte) 108));
                                                    JString jstring;

                                                    if ((((itemdef.anInt2493) ^
                                                            0xffffffff) == -2) ||
                                                            ((class18.anIntArray422[i_56_]) != 1)) {
                                                        jstring = (Class37_Sub9_Sub27.method881(110,
                                                                (new JString[] {
                                                                    (Class37_Sub4_Sub2.aJString_2537),
                                                                    (itemdef.aJString_2458),
                                                                    (Class37_Sub9_Sub23.aJString_3350),
                                                                    (PacketStream.method994(
                                                                        (class18.anIntArray422[i_56_]),
                                                                        3))
                                                                })));
                                                    } else {
                                                        jstring = (Class37_Sub9_Sub27.method881(4,
                                                                (new JString[] {
                                                                    (Class37_Sub4_Sub2.aJString_2537),
                                                                    (itemdef.aJString_2458),
                                                                    (Class37_Sub9_Sub22.aJString_3332)
                                                                })));
                                                    }

                                                    int i_59_ = ((i_58_ * (class18.anInt423 +
                                                        115)) + i_10_);
                                                    int i_60_ = ((i_57_ * (12 +
                                                        (class18.anInt426))) +
                                                        i_12_);

                                                    if ((class18.anInt406 ^
                                                            0xffffffff) != -1) {
                                                        if ((class18.anInt406 ^
                                                                0xffffffff) != -2) {
                                                            class37_sub4_sub9_sub2_sub1.method603(jstring,
                                                                (-1 +
                                                                (i_59_ +
                                                                (class18.anInt441))),
                                                                i_60_,
                                                                (class18.anInt442),
                                                                ((!(class18.aBoolean403))
                                                                ? (-1) : 0));
                                                        } else {
                                                            class37_sub4_sub9_sub2_sub1.method606(jstring,
                                                                (i_59_ +
                                                                ((class18.anInt441) / 2)),
                                                                i_60_,
                                                                (class18.anInt442),
                                                                ((!(class18.aBoolean403))
                                                                ? (-1) : 0));
                                                        }
                                                    } else {
                                                        class37_sub4_sub9_sub2_sub1.method607(jstring,
                                                            i_59_, i_60_,
                                                            class18.anInt442,
                                                            ((class18.aBoolean403)
                                                            ? 0 : (-1)));
                                                    }
                                                }

                                                i_56_++;
                                            }
                                        }
                                    }

                                    if (((class18.anInt354 ^ 0xffffffff) == -9) &&
                                            (RSSocket.aClass18_491 == class18) &&
                                            ((Class65.anInt1241 ^ 0xffffffff) == (Class37_Sub9_Sub2.anInt2935 ^
                                            0xffffffff))) {
                                        int i_61_ = 0;
                                        Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1 =
                                            (Class17.aClass37_Sub4_Sub9_Sub2_Sub1_315);
                                        JString jstring = class18.aJString_411;

                                        jstring = (Class37_Sub9_Sub25.method873((byte) -80,
                                                class18, jstring));

                                        int i_62_ = 0;

                                        while (jstring.method172((byte) 38) > 0) {
                                            int i_63_ = (jstring.method156(-122,
                                                    (Class37_Sub9_Sub11.aJString_3107)));
                                            JString jstring_64_;

                                            if (i_63_ != -1) {
                                                jstring_64_ = jstring.method169(0,
                                                        0, i_63_);
                                                jstring = (jstring.method158(i_63_ +
                                                        4, i_4_ + 26786));
                                            } else {
                                                jstring_64_ = jstring;
                                                jstring = (Class37_Sub9_Sub8.aJString_3045);
                                            }

                                            int i_65_ = class37_sub4_sub9_sub2_sub1.method617(jstring_64_);

                                            if ((i_65_ ^ 0xffffffff) < (i_61_ ^
                                                    0xffffffff)) {
                                                i_61_ = i_65_;
                                            }

                                            i_62_ += (1 +
                                            (class37_sub4_sub9_sub2_sub1.anInt3889));
                                        }

                                        int i_66_ = (5 + i_12_) -
                                            -class18.anInt353;
                                        i_62_ += 7;

                                        if ((i_66_ + i_62_) > i_2_) {
                                            i_66_ = -i_62_ + i_2_;
                                        }

                                        i_61_ += 6;

                                        int i_67_ = ((i_10_ +
                                            (class18.anInt441 + -5)) - i_61_);

                                        if (((5 + i_10_) ^ 0xffffffff) < (i_67_ ^
                                                0xffffffff)) {
                                            i_67_ = 5 + i_10_;
                                        }

                                        if (((i_61_ + i_67_) ^ 0xffffffff) < (i_6_ ^
                                                0xffffffff)) {
                                            i_67_ = i_6_ - i_61_;
                                        }

                                        Class37_Sub4_Sub9.method578(i_67_,
                                            i_66_, i_61_, i_62_, 16777120);
                                        Class37_Sub4_Sub9.method595(i_67_,
                                            i_66_, i_61_, i_62_, 0);
                                        jstring = class18.aJString_411;

                                        int i_68_ = (i_66_ +
                                            ((class37_sub4_sub9_sub2_sub1.anInt3889) -
                                            -2));

                                        jstring = (Class37_Sub9_Sub25.method873((byte) -46,
                                                class18, jstring));

                                        while ((jstring.method172((byte) 38) ^
                                                0xffffffff) < -1) {
                                            int i_69_ = (jstring.method156(106,
                                                    (Class37_Sub9_Sub11.aJString_3107)));
                                            JString jstring_70_;

                                            if (i_69_ == -1) {
                                                jstring_70_ = jstring;
                                                jstring = (Class37_Sub9_Sub8.aJString_3045);
                                            } else {
                                                jstring_70_ = jstring.method169(0,
                                                        0, i_69_);
                                                jstring = (jstring.method158(i_69_ -
                                                        -4, i_4_ ^ 0x68a2));
                                            }

                                            class37_sub4_sub9_sub2_sub1.method607(jstring_70_,
                                                i_67_ - -3, i_68_, 0, -1);

                                            i_68_ += ((class37_sub4_sub9_sub2_sub1.anInt3889) -
                                            -1);
                                        }
                                    }

                                    if (class18.anInt354 == 9) {
                                        if (class18.anInt337 != 1) {
                                            int i_71_ = ((class18.anInt441 < 0)
                                                ? (-class18.anInt441)
                                                : class18.anInt441);
                                            int i_72_ = i_71_;
                                            int i_73_ = (((class18.anInt353 ^
                                                0xffffffff) <= -1)
                                                ? class18.anInt353
                                                : (-class18.anInt353));

                                            if (i_72_ < i_73_) {
                                                i_72_ = i_73_;
                                            }

                                            if ((i_72_ ^ 0xffffffff) != -1) {
                                                int i_74_ = ((class18.anInt353 << 1335405680) / i_72_);
                                                int i_75_ = i_12_ + -i_1_;
                                                int i_76_ = ((class18.anInt441 << 311118480) / i_72_);

                                                if (i_76_ >= i_74_) {
                                                    i_76_ = -i_76_;
                                                } else {
                                                    i_74_ = -i_74_;
                                                }

                                                int i_77_ = ((1 +
                                                    (i_76_ * class18.anInt337)) >> 1330221105);
                                                int i_78_ = i_10_ + -i_3_;
                                                int i_79_ = ((i_74_ * class18.anInt337) >> -1786251023);
                                                int i_80_ = ((class18.anInt337 * i_76_) >> -2072552239);
                                                int i_81_ = (class18.anInt441 +
                                                    (i_78_ - -i_79_));
                                                int i_82_ = i_79_ + i_78_;
                                                int i_83_ = ((class18.anInt337 * i_74_) +
                                                    1) >> -1394709167;
                                                int i_84_ = -i_83_ + i_78_;
                                                int i_85_ = i_80_ + i_75_;
                                                int i_86_ = (class18.anInt441 +
                                                    (i_78_ - i_83_));
                                                int i_87_ = i_75_ + -i_77_;
                                                int i_88_ = (class18.anInt353 +
                                                    (i_75_ - i_77_));
                                                int i_89_ = i_75_ +
                                                    (class18.anInt353 + i_80_);
                                                Class37_Sub4_Sub9_Sub4.method665(i_82_,
                                                    i_84_, i_86_);
                                                Class37_Sub4_Sub9_Sub4.method670(i_85_,
                                                    i_87_, i_88_, i_82_, i_84_,
                                                    i_86_, class18.anInt442);
                                                Class37_Sub4_Sub9_Sub4.method665(i_82_,
                                                    i_86_, i_81_);
                                                Class37_Sub4_Sub9_Sub4.method670(i_85_,
                                                    i_88_, i_89_, i_82_, i_86_,
                                                    i_81_, class18.anInt442);
                                            }
                                        } else {
                                            Class37_Sub4_Sub9.method577(i_10_,
                                                i_12_,
                                                i_10_ + class18.anInt441,
                                                i_12_ - -class18.anInt353,
                                                class18.anInt442);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void method1140(int i) {
        Class37_Sub9_Sub27.aClass55_3417.anInt1079 = 0;
        Class37_Sub9_Sub16.anInt3192 = 0;
        PacketParser.aLong3250 = 0L;
        Class37_Sub20.aBoolean2217 = true;
        Class78.aBoolean1464 = true;
        anInt1059++;
        Class37_Sub23.method1028(-101);
        Class37_Sub9_Sub13.anInt3134 = 0;
        Class37_Sub16.anInt2151 = -1;
        Class37_Sub9_Sub30.anInt3480 = 0;
        Class37_Sub9_Sub17.packetId = -1;
        Class37_Sub20.aBoolean2220 = false;
        Class18.anInt438 = 0;
        Class37_Sub4_Sub12.anInt2767 = 0;
        Class37_Sub3_Sub3.anInt2388 = 0;
        Class88.anInt1604 = 0;
        Class13.anInt224 = 0;
        Client.anInt1726 = 0;
        Class37_Sub9_Sub1.anInt2913 = 0;
        Class37_Sub7.anInt1899 = 0;
        Class80.anInt1502 = 0;
        Class42.anInt947 = 0;
        Class39.anInt869 = 0;
        Stream.anInt2069 = 0;
        Class37_Sub23.anInt2236 = 0;
        Class37_Sub9_Sub2.anInt2936 = 0;
        Class37_Sub4_Sub15.anInt2839 = 0;
        Class37_Sub9_Sub32.anInt3501 = 0;
        Class37_Sub4_Sub15.anInt2840 = 0;
        Class37_Sub9_Sub20.anInt3280 = 0;
        Class37_Sub9_Sub7.anInt3043 = 0;
        Class65.anInt1223 = 0;
        PacketParser.anInt3259 = 0;
        Class37_Sub4_Sub7_Sub5.anInt3815 = 0;
        ItemDef.anInt2513 = 0;
        Class71.anInt1366 = 0;
        JString.anInt1678 = 0;
        Class37_Sub9_Sub6.anInt3019 = 0;
        Class37_Sub9_Sub34.anInt3540 = 0;
        Class80.anInt1506 = 0;
        Class87.anInt1591 = 0;
        Class42.anInt918 = 0;
        RSApplet.anInt185 = 0;
        Class76.anInt1425 = 0;
        Class15_Sub1.anInt1745 = 0;
        Class14.anInt249 = 0;
        Class37_Sub4_Sub17.anInt2884 = 0;
        Class37_Sub4_Sub17.anInt2876 = 0;
        Class37_Sub3_Sub1.anInt2330 = 0;
        Class37_Sub4_Sub10.anInt2669 = 0;
        Class37_Sub9_Sub8.anInt3050 = 0;
        JString.anInt1647 = 0;
        Class37_Sub9_Sub33.anInt3513 = 0;
        JString.anInt1671 = 0;
        Class3.anInt85 = 0;
        Class15_Sub1.anInt1740 = 0;
        Class37_Sub9_Sub2.anInt2925 = 0;
        Class36.anInt806 = 0;
        Class42.anInt915 = 0;
        Class88.anInt1606 = 0;
        Class46.anInt984 = 0;
        Class37_Sub9.anInt1953 = 0;
        Class14.anInt251 = 0;
        Login.anInt794 = 0;
        Class37_Sub3_Sub3.anInt2378 = 0;
        Class37_Sub9_Sub15.anInt3166 = 0;
        Class37_Sub9_Sub4.anInt2976 = 0;
        Class15_Sub1.anInt1744 = 0;
        Class37_Sub3_Sub3.anInt2362 = 0;
        Class56.anInt1091 = 0;
        Class37_Sub9_Sub16.anInt3200 = 0;
        Class26.anInt654 = 0;
        ObjectDef.anInt2703 = 0;
        Applet_Sub1.anInt29 = 0;
        JString.anInt1668 = 0;
        Class58.anInt1116 = 0;
        Class68.anInt1326 = 0;
        JString.anInt1673 = 0;
        Applet_Sub1.anInt23 = 0;
        Class15.anInt295 = 0;
        Class37_Sub4_Sub4.anInt2589 = 0;
        Class37_Sub4_Sub12.anInt2764 = 0;
        Class37_Sub12.anInt2094 = 0;
        Applet_Sub1.anInt42 = 0;
        Class37_Sub9_Sub28.anInt3423 = 0;
        Class82.anInt1707 = 0;
        Class37_Sub7.anInt1915 = 0;
        Class24.anInt621 = 0;
        RSApplet.anInt189 = 0;
        JString.anInt1667 = 0;
        Class66.anInt1248 = 0;
        Class37_Sub25.anInt2276 = 0;
        Client.anInt1733 = 0;
        Class15.anInt289 = 0;
        Class18.anInt384 = 0;
        Stream.anInt2060 = 0;
        Class32_Sub1.anInt1776 = 0;
        Class15.anInt258 = 0;
        Class37_Sub9_Sub8.anInt3049 = 0;
        Client.anInt1729 = 0;
        Class65.anInt1239 = 0;
        Class37_Sub17.anInt2166 = 0;
        Class37_Sub3_Sub3.anInt2356 = 0;
        Class15.anInt268 = 0;
        Class37_Sub3_Sub3.anInt2349 = 0;
        ItemDef.anInt2456 = 0;
        Class42.anInt937 = 0;
        Class37_Sub9_Sub27.anInt3412 = 0;
        JString.anInt1658 = 0;
        Stream.anInt2054 = 0;
        Class32_Sub1.anInt1775 = 0;
        ObjectDef.anInt2716 = 0;
        Class37_Sub3_Sub3.anInt2384 = 0;
        Class25.anInt639 = 0;
        Class37_Sub9_Sub34.anInt3543 = 0;
        RSApplet.anInt188 = 0;
        Applet_Sub1.anInt32 = 0;
        Class37_Sub8.anInt1934 = 0;
        Class6.anInt137 = 0;
        Class37_Sub9_Sub26.anInt3394 = 0;
        Class37_Sub4_Sub3.anInt2544 = 0;
        Class87.anInt1584 = 0;
        Class37_Sub9_Sub18.anInt3231 = 0;
        Class82.anInt1699 = 0;
        Class37_Sub3_Sub1.anInt2313 = 0;
        Class62.anInt1175 = 0;
        Class37_Sub9_Sub16.anInt3194 = 0;
        Class37_Sub9_Sub22.anInt3335 = 0;
        Class85.anInt1540 = 0;
        Class60.anInt1139 = 0;
        Class37_Sub9_Sub30.anInt3474 = 0;
        Class37_Sub9_Sub12.anInt3124 = 0;
        Class14.anInt236 = 0;
        Class37_Sub9_Sub8.anInt3047 = 0;
        Class37_Sub9_Sub1.anInt2922 = 0;
        Stream.anInt2058 = 0;
        Class32.anInt731 = 0;
        ObjectDef.anInt2695 = 0;
        ItemDef.anInt2486 = 0;
        Class15.anInt281 = 0;
        Stream.anInt2034 = 0;
        Class37_Sub4_Sub2.anInt2518 = 0;
        Class37_Sub4.anInt1860 = 0;
        Client.anInt1724 = 0;
        Class37_Sub9_Sub13.anInt3138 = 0;
        Class37_Sub9_Sub9.anInt3074 = 0;
        Class37_Sub9_Sub37.anInt3601 = 0;
        Class37_Sub9_Sub31.anInt3483 = 0;
        Class37_Sub9_Sub2.anInt2926 = 0;
        Class37_Sub9_Sub33.anInt3515 = 0;
        Class33.anInt747 = 0;
        Stream.anInt2049 = 0;
        JString.anInt1676 = 0;
        Class37_Sub3_Sub3.anInt2375 = 0;
        Class37_Sub3_Sub3.anInt2367 = 0;
        ItemDef.anInt2463 = 0;
        Class37_Sub9_Sub28.anInt3426 = 0;
        Class37_Sub9_Sub37.anInt3595 = 0;
        Class72.anInt1373 = 0;
        Class62.anInt1176 = 0;
        Class15_Sub1.anInt1759 = 0;
        RSSocket.anInt477 = 0;
        Class37_Sub9_Sub26.anInt3393 = 0;
        Class37_Sub9_Sub34.anInt3534 = 0;
        Class29.anInt703 = 0;
        Class50.anInt1024 = 0;
        Class37_Sub4_Sub16.anInt2867 = 0;
        Class25.anInt643 = 0;
        Class37_Sub9.anInt1976 = 0;
        Class42.anInt914 = 0;
        Class37_Sub3_Sub3.anInt2337 = 0;
        Class13.anInt217 = 0;
        Class37_Sub3_Sub3.anInt2365 = 0;
        Class37_Sub9_Sub14.anInt3155 = 0;
        Class37_Sub3_Sub3.anInt2354 = 0;
        Class37_Sub9_Sub8.anInt3060 = 0;
        Class37_Sub9.anInt1962 = 0;
        Class20.anInt533 = 0;
        Class37_Sub3_Sub3.anInt2338 = 0;
        Class84.anInt1533 = 0;
        Class37_Sub9_Sub22.anInt3322 = 0;
        Class89.anInt1620 = 0;
        Class3.anInt90 = 0;
        Class42.anInt946 = 0;
        Class37_Sub9.anInt1977 = 0;
        Applet_Sub1.anInt27 = 0;
        Stream.anInt2045 = 0;
        Class15.anInt292 = 0;
        Class8.anInt167 = 0;
        Class37_Sub9_Sub3.anInt2945 = 0;
        Class87.anInt1589 = 0;
        Class37_Sub9_Sub3.anInt2948 = 0;
        Class37_Sub9.anInt1958 = 0;
        Class37_Sub4_Sub7_Sub2.anInt3707 = 0;
        JString.anInt1644 = 0;
        Class37_Sub9_Sub31.anInt3486 = 0;
        Applet_Sub1.anInt20 = 0;
        Class20.anInt537 = 0;
        Class39.anInt870 = 0;
        Class37_Sub4_Sub7_Sub2.anInt3719 = 0;
        JString.anInt1666 = 0;
        Class37_Sub4_Sub3.anInt2546 = 0;
        Stream.anInt2050 = 0;
        Class37_Sub9.anInt1944 = 0;
        Applet_Sub1.anInt17 = 0;
        Class37_Sub4.anInt1843 = 0;
        Class37_Sub4_Sub7_Sub1_Sub2.anInt3997 = 0;
        Login.anInt778 = 0;
        Class20.anInt546 = 0;
        Class2.anInt74 = 0;
        Class37_Sub9.anInt1974 = 0;
        Class37_Sub4.anInt1861 = 0;
        Class37_Sub4.anInt1855 = 0;
        Stream.anInt2037 = 0;
        Applet_Sub1.anInt6 = 0;
        Class17.anInt305 = 0;
        Class17.anInt302 = 0;
        Class37.anInt816 = 0;
        Class21.anInt564 = 0;
        Class22.anInt576 = 0;
        Class37_Sub3_Sub3.anInt2357 = 0;
        Class58.anInt1127 = 0;
        Class32_Sub1.anInt1783 = 0;
        Class37_Sub9_Sub6.anInt3016 = 0;
        Class37_Sub4_Sub15.anInt2843 = 0;
        Class37_Sub9_Sub2.anInt2937 = 0;
        Class37_Sub9_Sub4.anInt2964 = 0;
        Class37_Sub9_Sub34.anInt3548 = 0;
        Class37_Sub4.anInt1854 = 0;
        Class37_Sub9_Sub36.anInt3575 = 0;
        JString.anInt1662 = 0;
        RSSocket.anInt482 = 0;
        ItemDef.anInt2432 = 0;
        Class37_Sub9_Sub29.anInt3446 = 0;
        Class37_Sub9_Sub4.anInt2974 = 0;
        Class41.anInt888 = 0;
        Class18.anInt345 = 0;
        Class37_Sub12.anInt2089 = 0;
        Class3.anInt84 = 0;
        Class37_Sub9_Sub20.anInt3277 = 0;
        Class52_Sub1.anInt2308 = 0;
        Class37_Sub9_Sub11.anInt3096 = 0;
        Stream.anInt2047 = 0;
        JString.anInt1681 = 0;
        Class37_Sub9_Sub22.anInt3331 = 0;
        Class37_Sub4.anInt1850 = 0;
        Class37_Sub9_Sub6.anInt3014 = 0;
        JString.anInt1656 = 0;
        Class69.anInt1340 = 0;
        Class39.anInt853 = 0;
        Class72.anInt1374 = 0;
        PacketParser.anInt3270 = 0;
        Class85.anInt1574 = 0;
        Class38.anInt826 = 0;
        Applet_Sub1.anInt28 = 0;
        Class37_Sub9_Sub21.anInt3316 = 0;
        Class37_Sub9_Sub16.anInt3184 = 0;
        Class37_Sub12.anInt2075 = 0;
        Class37_Sub4.anInt1846 = 0;
        Applet_Sub1.anInt7 = 0;
        Class69.anInt1337 = 0;
        Canvas_Sub1.anInt52 = 0;
        Class15.anInt275 = 0;
        Stream.anInt2042 = 0;
        RSApplet.anInt179 = 0;
        Class79.anInt1485 = 0;
        Class15_Sub1.anInt1756 = 0;
        Class37.anInt823 = 0;
        Class18.anInt361 = 0;
        Class37.anInt811 = 0;
        Class37_Sub9_Sub8.anInt3046 = 0;
        JString.anInt1637 = 0;
        Class55.anInt1075 = 0;
        Class37_Sub1.anInt1799 = 0;
        Class33.anInt760 = 0;
        Class20.anInt541 = 0;
        Class37_Sub3_Sub3.anInt2397 = 0;
        Class55.anInt1068 = 0;
        Class83.anInt1517 = 0;
        Stream.anInt2019 = 0;
        Class38.anInt829 = 0;
        Class43.anInt952 = 0;
        Class37_Sub3_Sub3.anInt2368 = 0;
        Class15.anInt280 = 0;
        Class32_Sub1.anInt1771 = 0;
        Class37_Sub4.anInt1847 = 0;
        Class37_Sub4_Sub10.anInt2671 = 0;
        Class37_Sub3_Sub3.anInt2363 = 0;
        Class37_Sub4_Sub4.anInt2567 = 0;
        Class60.anInt1158 = 0;
        Client.anInt1720 = 0;
        Class37_Sub3_Sub1.anInt2314 = 0;
        Client.anInt1725 = 0;
        Class37_Sub9_Sub16.anInt3205 = 0;
        Class37_Sub9_Sub20.anInt3288 = 0;
        Stream.anInt2005 = 0;
        ObjectDef.anInt2722 = 0;
        Applet_Sub1.anInt14 = 0;
        Class37_Sub3_Sub3.anInt2345 = 0;
        Class21.anInt567 = 0;
        Class39.anInt860 = 0;
        Class77.anInt1441 = 0;
        Class37_Sub9_Sub36.anInt3570 = 0;
        Class37_Sub3_Sub3.anInt2361 = 0;
        Class15.anInt288 = 0;
        Class37_Sub4_Sub8.anInt2653 = 0;
        Class37_Sub8.anInt1930 = 0;
        Stream.anInt2057 = 0;
        Class20.anInt549 = 0;
        Class37_Sub9_Sub20.anInt3290 = 0;
        Class15.anInt264 = 0;
        Class37_Sub4_Sub7.anInt2630 = 0;
        Class78.anInt1461 = 0;
        Class37_Sub4_Sub7_Sub7.anInt3841 = 0;
        Stream.anInt2052 = 0;
        Class37_Sub9_Sub32.anInt3498 = 0;
        Class37_Sub4_Sub13.anInt2795 = 0;
        Class37_Sub9_Sub15.anInt3180 = 0;
        Class15.anInt267 = 0;
        Class37_Sub3_Sub3.anInt2360 = 0;
        Client.anInt1717 = 0;
        Stream.anInt2003 = 0;
        Class37_Sub3_Sub3.anInt2393 = 0;
        Class37_Sub9_Sub34.anInt3532 = 0;
        Class37_Sub9_Sub12.anInt3120 = 0;
        Class37_Sub9_Sub29.anInt3441 = 0;
        Class37_Sub9_Sub15.anInt3176 = 0;
        Class37_Sub9_Sub15.anInt3177 = 0;
        Class37_Sub4_Sub12.anInt2771 = 0;
        Class42.anInt922 = 0;
        Class37_Sub9_Sub5.anInt2993 = 0;
        Class71.anInt1357 = 0;
        Class37_Sub4_Sub13.anInt2796 = 0;
        Class37_Sub4_Sub10.anInt2670 = 0;
        Class37_Sub3_Sub3.anInt2353 = 0;
        Class37_Sub4_Sub13.anInt2789 = 0;
        Class85.anInt1546 = 0;
        Class37_Sub9_Sub28.anInt3424 = 0;
        Class37_Sub5.anInt1869 = 0;
        Class37_Sub4_Sub7_Sub5.anInt3809 = 0;
        Class71.anInt1368 = 0;
        PacketParser.anInt3256 = 0;
        Class37_Sub9_Sub7.anInt3036 = 0;
        Class37_Sub4_Sub7_Sub7.anInt3845 = 0;
        Class69.anInt1348 = 0;
        Class37_Sub9_Sub17.anInt3210 = 0;
        Class46.anInt979 = 0;
        Class37_Sub9_Sub13.anInt3127 = 0;
        Class22.anInt589 = 0;
        Class77.anInt1451 = 0;
        Class73.anInt1387 = 0;
        anInt1063 = 0;
        Stream.anInt2074 = 0;
        Class37_Sub4_Sub3.anInt2551 = 0;
        Class37_Sub9_Sub9.anInt3079 = i;
        Class37_Sub4_Sub7.anInt2634 = 0;
        Class37_Sub4.anInt1858 = 0;
        Class37_Sub9_Sub23.anInt3349 = 0;
        Stream.anInt2027 = 0;
        Class15.anInt285 = 0;
        Class38.anInt848 = 0;
        JString.anInt1670 = 0;
        Class37_Sub9_Sub27.anInt3398 = 0;
        RSSocket.anInt461 = 0;
        Class37_Sub4_Sub7_Sub1.anInt3656 = 0;
        Applet_Sub1.anInt2 = 0;
        JString.anInt1675 = 0;
        Class37_Sub9_Sub22.anInt3323 = 0;
        Class37_Sub9_Sub36.anInt3586 = 0;
        PacketStream.anInt3629 = 0;
        Class37_Sub9_Sub3.anInt2950 = 0;
        Class88.anInt1597 = 0;
        Class45.anInt976 = 0;
        Class21.anInt566 = 0;
        Stream.anInt2002 = 0;
        Class21.anInt563 = 0;
        Class37_Sub4_Sub18.anInt2894 = 0;
        Class58.anInt1118 = 0;
        Class37_Sub9_Sub4.anInt2969 = 0;
        Class37_Sub9_Sub11.anInt3097 = 0;
        Class87.anInt1593 = 0;
        Applet_Sub1.anInt1 = 0;
        Stream.anInt2065 = 0;
        Class10.anInt190 = 0;
        Class37_Sub8.anInt1935 = 0;
        Class37_Sub9_Sub22.anInt3343 = 0;
        Class49.anInt1007 = 0;
        ItemDef.anInt2481 = 0;
        Class37_Sub9_Sub4.anInt2961 = 0;
        Class37_Sub9_Sub14.anInt3152 = 0;
        Class68.anInt1328 = 0;
        Class37_Sub10.anInt1993 = 0;
        Stream.anInt2020 = 0;
        Class37_Sub9_Sub6.anInt3026 = 0;
        Class37_Sub9_Sub26.anInt3392 = 0;
        Class37_Sub16.anInt2153 = 0;
        Class37_Sub9_Sub30.anInt3471 = 0;
        Class68.anInt1321 = 0;
        Class37_Sub5.anInt1870 = 0;
        JString.anInt1641 = 0;
        Class37_Sub9_Sub24.anInt3363 = 0;
        ItemDef.anInt2448 = 0;
        Class38.anInt833 = 0;
        Class37_Sub4_Sub7_Sub3.anInt3753 = 0;
        Stream.anInt2043 = 0;
        Class79.anInt1468 = 0;
        Class24.anInt614 = 0;
        Class83.anInt1512 = 0;
        Class82.anInt1708 = 0;
        Class37_Sub9_Sub8.anInt3065 = 0;
        ObjectDef.anInt2724 = 0;
        Class37_Sub9_Sub20.anInt3291 = 0;
        Class32_Sub1.anInt1772 = 0;
        Class37_Sub9_Sub36.anInt3574 = 0;
        Class32_Sub1.anInt1777 = 0;
        Class37_Sub9_Sub27.anInt3408 = 0;
        Class37_Sub5.anInt1864 = 0;
        Class37_Sub9_Sub29.anInt3445 = 0;
        Class37_Sub9_Sub16.anInt3209 = 0;
        Class37_Sub9_Sub10.anInt3088 = 0;
        JString.anInt1636 = 0;
        Class65.anInt1234 = 0;
        Class82.anInt1706 = 0;
        Class37_Sub17.anInt2162 = 0;
        Stream.anInt2039 = 0;
        Class39.anInt856 = 0;
        Class82.anInt1704 = 0;
        Class37_Sub9_Sub31.anInt3481 = 0;
        Class76.anInt1424 = 0;
        RSSocket.anInt465 = 0;
        Class64.anInt1215 = 0;
        anInt1062 = 0;
        Class13.anInt223 = 0;
        Class15_Sub1.anInt1755 = 0;
        Class37_Sub9_Sub33.anInt3517 = 0;
        Class37_Sub10.anInt1989 = 0;
        Stream.anInt2068 = 0;
        Class83.anInt1516 = 0;
        Class37_Sub9_Sub13.anInt3125 = 0;
        Class37_Sub4_Sub16.anInt2866 = 0;
        Class79.anInt1477 = 0;
        Class37_Sub9_Sub24.anInt3366 = 0;
        Class24.anInt599 = 0;
        Class33.anInt750 = 0;
        Class37_Sub3_Sub3.anInt2369 = 0;
        Class37_Sub9_Sub37.anInt3607 = 0;
        Class37_Sub4_Sub7_Sub2.anInt3709 = 0;
        Class37_Sub9_Sub16.anInt3203 = 0;
        Class37_Sub4_Sub12.anInt2768 = 0;
        Class24.anInt619 = 0;
        Class37_Sub9_Sub36.anInt3571 = 0;
        Class24.anInt608 = 0;
        Class37_Sub23.anInt2231 = 0;
        Class37_Sub9_Sub35.anInt3569 = 0;
        JString.anInt1680 = 0;
        Class58.anInt1122 = 0;
        Class1.anInt60 = 0;
        Class37_Sub9_Sub16.anInt3196 = 0;
        Class37_Sub9_Sub33.anInt3510 = 0;
        Class55.anInt1074 = 0;
        Class37_Sub3_Sub1.anInt2323 = 0;
        Applet_Sub1.anInt18 = 0;
        Stream.anInt2040 = 0;
        Class37_Sub12.anInt2101 = 0;
        Class37_Sub9_Sub34.anInt3542 = 0;
        Class37_Sub9_Sub15.anInt3174 = 0;
        Class37_Sub25.anInt2281 = 0;
        Class42.anInt930 = 0;
        Canvas_Sub1.anInt51 = 0;
        Class69.anInt1334 = 0;
        Class37_Sub4_Sub12.anInt2765 = 0;
        JString.anInt1649 = 0;
        Class37_Sub9_Sub10.anInt3086 = 0;
        Class37_Sub4_Sub2.anInt2522 = 0;
        Class22.anInt586 = 0;
        Class37_Sub9_Sub20.anInt3289 = 0;
        Class37_Sub9_Sub21.anInt3318 = 0;
        JString.anInt1654 = 0;
        Class37_Sub4_Sub15.anInt2817 = 0;
        ItemDef.anInt2492 = 0;
        Class37_Sub10.anInt1995 = 0;
        Class59.anInt1137 = 0;
        Class33.anInt757 = 0;
        Applet_Sub1.anInt26 = 0;
        Class37_Sub9_Sub27.anInt3419 = 0;
        Class8.anInt159 = 0;
        Class39.anInt854 = 0;
        Class38.anInt852 = 0;
        Class37_Sub3_Sub1.anInt2319 = 0;
        Class37_Sub7.anInt1893 = 0;
        Class37_Sub4_Sub7_Sub1.anInt3644 = 0;
        Class62.anInt1174 = 0;
        Class52.anInt1052 = 0;
        Class32.anInt739 = 0;
        Class83.anInt1514 = 0;
        Class37_Sub9_Sub3.anInt2947 = 0;
        Stream.anInt2048 = 0;
        JString.anInt1642 = 0;
        Stream.anInt2072 = 0;
        Class37_Sub9_Sub5.anInt2989 = 0;
        Class82.anInt1712 = 0;
        Applet_Sub1.anInt25 = 0;
        Class37_Sub4_Sub12.anInt2772 = 0;
        Class37_Sub9_Sub17.anInt3220 = 0;
        JString.anInt1672 = 0;
        Class66.anInt1257 = 0;
        Class65.anInt1227 = 0;
        RSSocket.anInt464 = 0;
        JString.anInt1640 = 0;
        Class30.anInt722 = 0;
        Class26.anInt653 = 0;
        Class37_Sub3_Sub3.anInt2352 = 0;
        Class37_Sub9_Sub14.anInt3147 = 0;
        Class76.anInt1434 = 0;
        Class73.anInt1383 = 0;
        Class24.anInt607 = 0;
        Class37_Sub4_Sub3.anInt2550 = 0;
        Class46.anInt982 = 0;
        Class64.anInt1211 = 0;
        Class37_Sub9_Sub20.anInt3276 = 0;
        Class24.anInt601 = 0;
        Class37_Sub9.anInt1965 = 0;
        Class37_Sub9_Sub3.anInt2953 = 0;
        RSSocket.anInt467 = 0;
        Class37_Sub4_Sub5.anInt2600 = 0;
        Class15.anInt279 = 0;
        Class15.anInt291 = 0;
        Class37_Sub9_Sub25.anInt3383 = 0;
        Class33.anInt763 = 0;
        Class37_Sub23.anInt2226 = 0;
        Class37_Sub15.anInt2131 = 0;
        Class37_Sub9_Sub20.anInt3294 = 0;
        Class37_Sub9_Sub34.anInt3536 = 0;
        ItemDef.anInt2500 = 0;
        JString.anInt1683 = 0;
        Class38.anInt825 = 0;
        Class15_Sub1.anInt1748 = 0;
        RuntimeException_Sub1.anInt1630 = 0;
        RuntimeException_Sub1.anInt1631 = 0;
        Class4.anInt106 = 0;
        Class32_Sub1.anInt1781 = 0;
        Class37_Sub9_Sub37.anInt3600 = 0;
        Class37_Sub3_Sub1.anInt2318 = 0;
        JString.anInt1635 = 0;
        RSApplet.anInt184 = 0;
        Class52_Sub1.anInt2301 = 0;
        Class37_Sub3_Sub3.anInt2348 = 0;
        Client.anInt1723 = 0;
        Class58.anInt1123 = 0;
        Class32_Sub1.anInt1773 = 0;
        Stream.anInt2026 = 0;
        Class58.anInt1112 = 0;
        Class18.anInt437 = 0;
        Class18.anInt373 = 0;
        Class37_Sub14.anInt2124 = 0;
        Class37_Sub9_Sub36.anInt3581 = 0;
        Class39.anInt862 = 0;
        Class37_Sub16.anInt2149 = 0;
        Class37_Sub9_Sub14.anInt3146 = 0;
        Class37_Sub9_Sub21.anInt3307 = 0;
        Class14.anInt239 = 0;
        Class87.anInt1585 = 0;
        Class37_Sub6.anInt1883 = 0;
        Class37_Sub3_Sub3.anInt2344 = 0;
        ItemDef.anInt2427 = 0;
        Class2.anInt73 = 0;
        PacketStream.anInt3616 = 0;
        Class73.anInt1381 = 0;
        Class37_Sub9_Sub3.anInt2938 = 0;
        Class84.anInt1529 = 0;
        Class18.anInt446 = 0;
        Class37_Sub9_Sub27.anInt3409 = 0;
        Class37_Sub2.anInt1812 = 0;
        Class37_Sub7.anInt1911 = 0;
        Class36.anInt801 = 0;
        Class37_Sub3_Sub3.anInt2359 = 0;
        Class45.anInt971 = 0;
        Class37_Sub4_Sub8.anInt2647 = 0;
        Class42.anInt924 = 0;
        PacketParser.anInt3268 = 0;
        Class24.anInt622 = 0;
        ItemDef.anInt2472 = 0;
        Class42.anInt916 = 0;
        Class37_Sub4_Sub18.anInt2888 = 0;
        Class37_Sub9_Sub1.anInt2921 = 0;
        Class52.anInt1049 = 0;
        Class37_Sub15.anInt2142 = 0;
        Class15.anInt287 = 0;
        Class24.anInt610 = 0;
        Class18.anInt392 = 0;
        Class58.anInt1107 = 0;
        Class37_Sub4_Sub4.anInt2580 = 0;
        RSApplet.anInt175 = 0;
        Class37_Sub4_Sub7_Sub1_Sub1.anInt3958 = 0;
        Stream.anInt2051 = 0;
        RSApplet.anInt170 = 0;
        Class82.anInt1695 = 0;
        Class37_Sub4_Sub7_Sub1_Sub2.anInt3968 = 0;
        Class37_Sub4_Sub18.anInt2898 = 0;
        Class37_Sub9_Sub26.anInt3386 = 0;
        Stream.anInt2036 = 0;
        Class17.anInt296 = 0;
        Class37_Sub4_Sub4.anInt2563 = 0;
        Class37_Sub9_Sub15.anInt3167 = 0;
        Class37_Sub9_Sub32.anInt3500 = 0;
        Class37_Sub9.anInt1975 = 0;
        JString.anInt1651 = 0;
        Class13.anInt218 = 0;
        Class72.anInt1372 = 0;
        Class58.anInt1105 = 0;
        Stream.anInt2056 = 0;
        Class37_Sub9_Sub32.anInt3502 = 0;
        JString.anInt1652 = 0;
        Stream.anInt2029 = 0;
        Class73.anInt1390 = 0;
        Class37_Sub4_Sub7_Sub2.anInt3716 = 0;
        Class37_Sub9_Sub23.anInt3353 = 0;
        Class37_Sub9_Sub29.anInt3451 = 0;
        Class37_Sub4_Sub2.anInt2529 = 0;
        Class37_Sub3_Sub3.anInt2381 = 0;
        Class37_Sub8.anInt1924 = 0;
        Class22.anInt578 = 0;
        Class37_Sub9_Sub21.anInt3304 = 0;
        Class72.anInt1370 = 0;
        Class37_Sub9_Sub12.anInt3114 = 0;
        Class37_Sub9_Sub25.anInt3384 = 0;
        Class37_Sub4_Sub7_Sub1.anInt3672 = 0;
        Class6.anInt142 = 0;
        Class29.anInt706 = 0;
        Class37_Sub4_Sub7_Sub1_Sub2.anInt3986 = 0;
        Class37_Sub4_Sub7_Sub1_Sub1.anInt3946 = 0;
        Class36.anInt804 = 0;
        Class37_Sub9_Sub5.anInt2990 = 0;
        Applet_Sub1.anInt33 = 0;
        Class37_Sub4_Sub8.anInt2655 = 0;
        Class37_Sub9_Sub12.anInt3122 = 0;
        Class37_Sub25.anInt2289 = 0;
        Class71.anInt1361 = 0;
        Class37_Sub9_Sub15.anInt3171 = 0;
        Stream.anInt2013 = 0;
        Stream.anInt2010 = 0;
        Class38.anInt834 = 0;
        Class37_Sub4_Sub8.anInt2646 = 0;
        Class20.anInt536 = 0;
        Class37_Sub9_Sub28.anInt3432 = 0;
        Class37_Sub2.anInt1824 = 0;
        Class30.anInt723 = 0;
        PacketStream.anInt3612 = 0;
        Class21.anInt562 = 0;
        Class58.anInt1120 = 0;
        JString.anInt1657 = 0;
        Applet_Sub1.anInt39 = 0;
        Class14.anInt244 = 0;
        Class37_Sub4_Sub7_Sub1_Sub2.anInt3963 = 0;
        Class56.anInt1085 = 0;
        Class38.anInt839 = 0;
        Canvas_Sub1.anInt49 = 0;
        Class37_Sub9_Sub17.anInt3221 = 0;
        Class29.anInt698 = 0;
        Class37_Sub9_Sub27.anInt3413 = 0;
        Class15.anInt265 = 0;
        Class45.anInt975 = 0;
        Class1.anInt58 = 0;
        Stream.anInt2053 = 0;
        Class37_Sub2.anInt1835 = 0;
        Class37_Sub9_Sub4.anInt2960 = 0;
        RSApplet.anInt187 = 0;
        Class60.anInt1143 = 0;
        Class18.anInt351 = 0;
        Class65.anInt1220 = 0;
        PacketStream.anInt3617 = 0;
        Class13.anInt222 = 0;
        Class37_Sub9_Sub11.anInt3104 = 0;
        Class29.anInt715 = 0;
        Class71.anInt1355 = 0;
        Class30.anInt718 = 0;
        Class37_Sub4_Sub15.anInt2826 = 0;
        Class65.anInt1222 = 0;
        JString.anInt1653 = 0;
        Class24.anInt598 = 0;
        Class37_Sub9_Sub28.anInt3421 = 0;
        Class15.anInt274 = 0;
        JString.anInt1665 = 0;
        Class37_Sub9.anInt1950 = 0;
        Class82.anInt1697 = 0;
        Class37_Sub9_Sub6.anInt3015 = 0;
        Class37_Sub4_Sub5.anInt2593 = 0;
        Class84.anInt1535 = 0;
        Class37_Sub9_Sub5.anInt2992 = 0;
        Class37_Sub3_Sub3.anInt2358 = 0;
        Class37_Sub9_Sub29.anInt3458 = 0;
        Class65.anInt1224 = 0;
        Class86.anInt1580 = 0;
        Class15.anInt282 = 0;
        Class37_Sub10.anInt1991 = 0;
        Class13.anInt219 = 0;
        Class37_Sub4_Sub7_Sub1_Sub1.anInt3939 = 0;
        Class37_Sub7.anInt1897 = 0;
        Class3.anInt88 = 0;
        Class20.anInt547 = 0;
        Class52_Sub1.anInt2296 = 0;
        Class13.anInt228 = 0;
        Class36.anInt798 = 0;
        PacketParser.anInt3267 = 0;
        Applet_Sub1.anInt34 = 0;
        Class32_Sub1.anInt1787 = 0;
        Class37_Sub3_Sub3.anInt2386 = 0;
        Class37.anInt812 = 0;
        Class37_Sub9_Sub28.anInt3429 = 0;
        Class37_Sub9.anInt1961 = 0;
        Class37_Sub4_Sub4.anInt2566 = 0;
        Class36.anInt802 = 0;
        RuntimeException_Sub1.anInt1629 = 0;
        Class37_Sub4_Sub12.anInt2753 = 0;
        PacketParser.anInt3251 = 0;
        Stream.anInt2064 = 0;
        Class77.anInt1443 = 0;
        Class37_Sub9_Sub23.anInt3352 = 0;
        Class37_Sub9_Sub6.anInt3007 = 0;
        Applet_Sub1.anInt31 = 0;
        RSSocket.anInt478 = 0;
        Stream.anInt2024 = 0;
        Class37_Sub1.anInt1805 = 0;
        Class37_Sub9_Sub10.anInt3084 = 0;
        PacketParser.anInt3266 = 0;
        Class37.anInt822 = 0;
        Stream.anInt2007 = 0;
        Class15.anInt261 = 0;
        Class37_Sub10.anInt1992 = 0;
        Applet_Sub1.anInt22 = 0;
        Class13.anInt227 = 0;
        Class37_Sub9_Sub13.anInt3132 = 0;
        Class37_Sub4_Sub2.anInt2532 = 0;
        Class37_Sub9_Sub18.anInt3241 = 0;
        Class37_Sub9_Sub30.anInt3478 = 0;
        Class47.anInt990 = 0;
        Class29.anInt694 = 0;
        Class82.anInt1711 = 0;
        Class37_Sub9.anInt1960 = 0;
        Class37_Sub4_Sub5.anInt2592 = 0;
        JString.anInt1685 = 0;
        Class37_Sub3_Sub1.anInt2315 = 0;
        Class21.anInt565 = 0;
        Class37_Sub3_Sub3.anInt2347 = 0;
        Class14.anInt246 = 0;
        Class37_Sub9_Sub11.anInt3105 = 0;
        Class22.anInt570 = 0;
        Class37_Sub20.anInt2208 = 0;
        Class82.anInt1716 = 0;
        Class66.anInt1253 = 0;
        Class4.anInt99 = 0;
        Class37_Sub3_Sub3.anInt2392 = 0;
        Class37_Sub9_Sub7.anInt3038 = 0;
        Class37_Sub9_Sub30.anInt3469 = 0;
        Class4.anInt95 = 0;
        Class15_Sub1.anInt1739 = 0;
        Class37_Sub9_Sub29.anInt3456 = 0;
        Class37_Sub4_Sub12.anInt2779 = 0;
        Class37_Sub7.anInt1900 = 0;
        Class37_Sub4_Sub18.anInt2892 = 0;
        Class37_Sub4_Sub2.anInt2530 = 0;
        Class37_Sub3_Sub1.anInt2325 = 0;
        Class37_Sub9_Sub6.anInt3008 = 0;
        Class15.anInt257 = 0;
        Class37_Sub9_Sub3.anInt2951 = 0;
        Class38.anInt845 = 0;
        Class15.anInt293 = 0;
        Class37_Sub9_Sub8.anInt3062 = 0;
        JString.anInt1674 = 0;
        Class37_Sub9.anInt1963 = 0;
        Class37_Sub9_Sub34.anInt3550 = 0;
        ObjectDef.anInt2729 = 0;
        Class37_Sub9_Sub8.anInt3067 = 0;
        Class20.anInt532 = 0;
        Class37_Sub2.anInt1820 = 0;
        Class37_Sub4_Sub4.anInt2569 = 0;
        Class37_Sub4_Sub7_Sub3.anInt3742 = 0;
        Applet_Sub1.anInt41 = 0;
        Class37_Sub4_Sub12.anInt2781 = 0;
        RuntimeException_Sub1.anInt1623 = 0;
        Applet_Sub1.anInt15 = 0;
        Class37_Sub4_Sub4.anInt2577 = 0;
        Class42.anInt935 = 0;
        Login.anInt792 = 0;
        Class37_Sub9_Sub20.anInt3275 = 0;
        Class15.anInt272 = 0;
        Class37_Sub1.anInt1800 = 0;
        Class37_Sub9_Sub13.anInt3136 = 0;
        RSSocket.anInt476 = 0;
        Class37_Sub4_Sub7_Sub1_Sub2.anInt3976 = 0;
        Class82.anInt1709 = 0;
        Class37_Sub23.anInt2223 = 0;
        Class29.anInt704 = 0;
        Class37_Sub4_Sub8.anInt2648 = 0;
        Class37_Sub9_Sub37.anInt3603 = 0;
        Class62.anInt1171 = 0;
        Class30.anInt725 = 0;
        RSApplet.anInt186 = 0;
        Class37_Sub3_Sub1.anInt2322 = 0;
        Applet_Sub1.anInt9 = 0;
        Class37_Sub5.anInt1865 = 0;
        Class73.anInt1394 = 0;
        Class37_Sub4_Sub14.anInt2803 = 0;
        Class20.anInt544 = 0;
        Class37_Sub4_Sub15.anInt2838 = 0;
        ItemDef.anInt2474 = 0;
        Class24.anInt602 = 0;
        Class37_Sub4_Sub14.anInt2807 = 0;
        ObjectDef.anInt2710 = 0;
        Class37_Sub7.anInt1919 = 0;
        Class33.anInt758 = 0;
        Class37_Sub9_Sub4.anInt2963 = 0;
        JString.anInt1655 = 0;
        Class37.anInt819 = 0;
        PacketParser.anInt3264 = 0;
        Class1.anInt64 = 0;
        Class37_Sub9_Sub27.anInt3403 = 0;
        Class37_Sub13.anInt2107 = 0;
        Class37_Sub4_Sub3.anInt2559 = 0;
        Class49.anInt1009 = 0;
        Stream.anInt2066 = 0;
        Stream.anInt2022 = 0;
        Class46.anInt983 = 0;
        Class37_Sub9_Sub17.anInt3214 = 0;
        ObjectDef.anInt2742 = 0;
        Class37_Sub9_Sub34.anInt3531 = 0;
        Class18.anInt412 = 0;
        Class37_Sub4_Sub15.anInt2850 = 0;
        Class2.anInt76 = 0;
        Class37_Sub4_Sub7_Sub1_Sub2.anInt3972 = 0;
        Class82.anInt1705 = 0;
        Class37_Sub9_Sub5.anInt2985 = 0;
        Applet_Sub1.anInt11 = 0;
        PacketStream.anInt3622 = 0;
        Stream.anInt2063 = 0;
        Class37_Sub9_Sub22.anInt3338 = 0;
        Class37_Sub9_Sub13.anInt3133 = 0;
        Class37_Sub10.anInt1987 = 0;
        Class42.anInt948 = 0;
        Class58.anInt1103 = 0;
        Class42.anInt933 = 0;
        Class37_Sub9_Sub18.anInt3232 = 0;
        Class49.anInt1004 = 0;
        JString.anInt1677 = 0;
        Login.anInt793 = 0;
        Class37_Sub9_Sub20.anInt3293 = 0;
        Class87.anInt1586 = 0;
        Class37_Sub9_Sub18.anInt3229 = 0;
        Class29.anInt716 = 0;
        Class37_Sub9_Sub15.anInt3163 = 0;
        PacketParser.anInt3249 = 0;
        Class37_Sub9_Sub34.anInt3529 = 0;
        Applet_Sub1.anInt5 = 0;
        Class37_Sub9_Sub27.anInt3405 = 0;
        JString.anInt1684 = 0;
        Class25.anInt635 = 0;
        PacketStream.anInt3619 = 0;
        Class37_Sub4_Sub7_Sub3.anInt3743 = 0;
        Class37_Sub4_Sub7_Sub7.anInt3852 = 0;
        PacketStream.anInt3624 = 0;
        Class37_Sub9_Sub22.anInt3339 = 0;
        Class58.anInt1119 = 0;
        Stream.anInt2046 = 0;
        Class85.anInt1543 = 0;
        Class37_Sub4_Sub16.anInt2868 = 0;
        Class37_Sub25.anInt2288 = 0;
        Class37_Sub23.anInt2229 = 0;
        RuntimeException_Sub1.anInt1628 = 0;
        Class37_Sub9_Sub21.anInt3311 = 0;
        Class33.anInt755 = 0;
        Class20.anInt550 = 0;
        ItemDef.anInt2423 = 0;
        Class49.anInt1010 = 0;
        Class37_Sub9_Sub2.anInt2929 = 0;
        Class37_Sub9_Sub22.anInt3328 = 0;
        Stream.anInt2070 = 0;
        Class43.anInt955 = 0;
        Class15_Sub1.anInt1736 = 0;
        Class37_Sub2.anInt1814 = 0;
        Class14.anInt243 = 0;
        Class37_Sub4_Sub7_Sub3.anInt3744 = 0;
        Class65.anInt1233 = 0;
        Class37_Sub4.anInt1845 = 0;
        Class37_Sub9_Sub17.anInt3213 = 0;
        Class43.anInt954 = 0;
        Class37_Sub9_Sub9.anInt3078 = 0;
        Class32_Sub1.anInt1784 = 0;
        Class82.anInt1694 = 0;
        Class32_Sub1.anInt1788 = 0;
        Class20.anInt552 = 0;
        Class77.anInt1453 = 0;
        PacketStream.anInt3615 = 0;
        Class76.anInt1422 = 0;
        Class37_Sub9_Sub10.anInt3083 = 0;
        Class37_Sub9_Sub7.anInt3039 = 0;
        JString.anInt1661 = 0;
        Class20.anInt534 = 0;
        Class10.anInt192 = 0;
        Class73.anInt1382 = 0;
        Stream.anInt2008 = 0;
        Class15.anInt286 = 0;
        Class20.anInt538 = 0;
        Class37_Sub4_Sub3.anInt2547 = 0;
        Class26.anInt650 = 0;
        Class37_Sub15.anInt2143 = 0;
        Stream.anInt2016 = 0;
        Class37_Sub4_Sub15.anInt2845 = 0;
        Class37_Sub4_Sub10.anInt2687 = 0;
        RuntimeException_Sub1.anInt1622 = 0;
        Class37_Sub4_Sub17.anInt2881 = 0;
        Class37_Sub20.anInt2211 = 0;
        Class47.anInt992 = 0;
        Class37_Sub9_Sub24.anInt3362 = 0;
        Class37_Sub9_Sub24.anInt3375 = 0;
        Class37_Sub9_Sub7.anInt3044 = 0;
        Class37_Sub9_Sub25.anInt3378 = 0;
        Class37_Sub3_Sub3.anInt2346 = 0;
        Stream.anInt2011 = 0;
        Class62.anInt1172 = 0;
        Class58.anInt1124 = 0;
        Class37.anInt817 = 0;
        Class66.anInt1244 = 0;
        Applet_Sub1.anInt10 = 0;
        Class8.anInt164 = 0;
        ObjectDef.totalObjectsLoaded = 0;
        Class37_Sub9_Sub9.anInt3075 = 0;
        Class78.anInt1460 = 0;
        Class37_Sub9_Sub30.anInt3473 = 0;
        ItemDef.anInt2425 = 0;
        Class76.anInt1426 = 0;
        Class24.anInt612 = 0;
        Class37_Sub7.anInt1916 = 0;
        Class37_Sub4_Sub12.anInt2763 = 0;
        Class37_Sub4_Sub3.anInt2543 = 0;
        Class71.anInt1367 = 0;
        Class37_Sub9_Sub22.anInt3341 = 0;
        Class37_Sub9_Sub29.anInt3448 = 0;
        Class37_Sub3_Sub3.anInt2342 = 0;
        Class37_Sub3_Sub1.anInt2312 = 0;
        Class37_Sub8.anInt1942 = 0;
        Class20.anInt540 = 0;
        Class37_Sub4_Sub3.anInt2548 = 0;
        Class37_Sub9_Sub20.anInt3284 = 0;
        Class55.anInt1065 = 0;
        Class37_Sub9_Sub33.anInt3514 = 0;
        Class37_Sub9_Sub11.anInt3109 = 0;
        Class37_Sub18.anInt2195 = 0;
        Class20.anInt531 = 0;
        Stream.anInt2012 = 0;
        Client.anInt1732 = 0;
        Class37_Sub9_Sub24.anInt3373 = 0;
        Class6.anInt136 = 0;
        Class32_Sub1.anInt1778 = 0;
        Class37_Sub4_Sub10.anInt2685 = 0;
        Class37_Sub9_Sub11.anInt3102 = 0;
        Class37_Sub9.anInt1978 = 0;
        Class37_Sub9_Sub9.anInt3070 = 0;
        Class37_Sub9_Sub33.anInt3511 = 0;
        Class37_Sub9.anInt1972 = 0;
        Class37_Sub9_Sub30.anInt3467 = 0;
        Class37_Sub9_Sub15.anInt3173 = 0;
        RSSocket.anInt469 = 0;
        Class37_Sub9.anInt1952 = 0;
        Class37_Sub3_Sub3.anInt2399 = 0;
        Class37_Sub9_Sub14.anInt3153 = 0;
        PacketStream.anInt3621 = 0;
        Class37_Sub4_Sub4.anInt2587 = 0;
        Class37_Sub4_Sub7.anInt2629 = 0;
        Class10.anInt195 = 0;
        Class37_Sub9_Sub18.anInt3246 = 0;
        Class24.anInt611 = 0;
        Class37_Sub9_Sub26.anInt3395 = 0;
        Class37_Sub9_Sub9.anInt3073 = 0;
        Class37_Sub9_Sub13.anInt3128 = 0;
        Class82.anInt1703 = 0;
        Class37_Sub1.anInt1801 = 0;
        Stream.anInt2033 = 0;
        Class37_Sub9_Sub9.anInt3071 = 0;
        Class77.anInt1448 = 0;
        Class37_Sub9_Sub18.anInt3242 = 0;
        Class77.anInt1446 = 0;
        Class37_Sub4_Sub3.anInt2553 = 0;
        Class17.anInt303 = 0;
        Class37_Sub9_Sub6.anInt3021 = 0;
        Class24.anInt620 = 0;
        Class37_Sub18.anInt2199 = 0;
        Class68.anInt1325 = 0;
        Class37_Sub9_Sub32.anInt3497 = 0;
        Applet_Sub1.anInt40 = 0;
        Class15.anInt266 = 0;
        Class37_Sub9_Sub36.anInt3578 = 0;
        Class36.anInt805 = 0;
        Class50.anInt1019 = 0;
        Canvas_Sub1.anInt48 = 0;
        Class37_Sub4_Sub8.anInt2644 = 0;
        RSApplet.anInt182 = 0;
        Class86.anInt1582 = 0;
        Class37_Sub9_Sub7.anInt3035 = 0;
        Stream.anInt2035 = 0;
        Class17.anInt306 = 0;
        RSSocket.anInt473 = 0;
        Class37_Sub9_Sub10.anInt3085 = 0;
        Class37_Sub4_Sub15.anInt2812 = 0;
        Class37_Sub9_Sub32.anInt3499 = 0;
        Class32_Sub1.anInt1774 = 0;
        Class29.anInt708 = 0;
        Class66.anInt1264 = 0;
        Class37_Sub4_Sub7_Sub1_Sub2.anInt3970 = 0;
        Class45.anInt973 = 0;
        Class24.anInt600 = 0;
        Client.anInt1730 = 0;
        Class37_Sub9_Sub33.anInt3516 = 0;
        Class37_Sub4_Sub15.anInt2841 = 0;
        Class85.anInt1571 = 0;
        Class37_Sub4_Sub7_Sub1_Sub1.anInt3949 = 0;
        Class37_Sub3_Sub3.anInt2398 = 0;
        Class46.anInt986 = 0;
        Class37_Sub4_Sub7.anInt2631 = 0;
        Client.anInt1718 = 0;
        Class37_Sub4_Sub4.anInt2574 = 0;
        Class41.anInt901 = 0;
        Class37_Sub4_Sub7_Sub1.anInt3695 = 0;
        Class37_Sub4_Sub7_Sub1_Sub1.anInt3941 = 0;
        Class82.anInt1700 = 0;
        Class37_Sub15.anInt2140 = 0;
        RSApplet.anInt181 = 0;
        Stream.anInt2067 = 0;
        anInt1059 = 0;
        Stream.anInt2030 = 0;
        Class52_Sub1.anInt2294 = 0;
        Class15.anInt262 = 0;
        Class15.anInt269 = 0;
        Class37_Sub9_Sub34.anInt3553 = 0;
        ObjectDef.anInt2720 = 0;
        Class37_Sub9_Sub21.anInt3303 = 0;
        Class43.anInt951 = 0;
        Stream.anInt2061 = 0;
        Class18.anInt388 = 0;
        Class37_Sub9_Sub2.anInt2934 = 0;
        Stream.anInt2015 = 0;
        Class37_Sub9_Sub1.anInt2915 = 0;
        RSApplet.anInt183 = 0;
        Class37_Sub9_Sub26.anInt3388 = 0;
        Class37_Sub9_Sub3.anInt2952 = 0;
        Class37_Sub9_Sub5.anInt2987 = 0;
        Class37_Sub9_Sub34.anInt3535 = 0;
        Class37_Sub4_Sub3.anInt2542 = 0;
        Class37_Sub9_Sub24.anInt3368 = 0;
        Class37_Sub25.anInt2287 = 0;
        Stream.anInt2073 = 0;
        Applet_Sub1.anInt19 = 0;
        Stream.anInt2017 = 0;
        PacketStream.anInt3623 = 0;
        Client.anInt1731 = 0;
        Class8.anInt163 = 0;
        Class37_Sub9_Sub30.anInt3463 = 0;
        JString.anInt1663 = 0;
        Class37_Sub15.anInt2133 = 0;
        Class37_Sub4_Sub7_Sub1.anInt3671 = 0;
        Class66.anInt1246 = 0;
        JString.anInt1648 = 0;
        Class29.anInt712 = 0;
        Class4.anInt100 = 0;
        Class37_Sub4_Sub10.anInt2679 = 0;
        Class32_Sub1.anInt1791 = 0;
        Class65.anInt1230 = 0;
        Class18.anInt459 = 0;
        JString.anInt1643 = 0;
        Class29.anInt701 = 0;
        Class36.anInt795 = 0;
        Class37_Sub9_Sub37.anInt3605 = 0;
        Class37_Sub9_Sub24.anInt3372 = 0;
        Class37_Sub3_Sub3.anInt2336 = 0;
        Class79.anInt1490 = 0;
        Class58.anInt1108 = 0;
        Class58.anInt1113 = 0;
        Class15_Sub1.anInt1749 = 0;
        Class43.anInt960 = 0;
        Class37_Sub9_Sub21.anInt3310 = 0;
        Class37_Sub3_Sub3.anInt2374 = 0;
        Class37_Sub9_Sub13.anInt3137 = 0;
        Class57.anInt1100 = 0;
        Stream.anInt2028 = 0;
        Class37_Sub15.anInt2137 = 0;
        Class37_Sub4_Sub15.anInt2848 = 0;
        Class17.anInt299 = 0;
        Class58.anInt1121 = 0;
        Class37_Sub4_Sub7_Sub1.anInt3685 = 0;
        Class15_Sub1.anInt1752 = 0;
        Class10.anInt200 = 0;
        Class37_Sub4_Sub12.anInt2778 = 0;
        Class37_Sub4_Sub2.anInt2538 = 0;
        Applet_Sub1.anInt37 = 0;
        Class37_Sub9_Sub7.anInt3028 = 0;
        Class20.anInt530 = 0;
        Class37.anInt810 = 0;
        Class37_Sub9_Sub6.anInt3011 = 0;
        Class37_Sub9_Sub25.anInt3379 = 0;
        Class37_Sub9_Sub10.anInt3089 = 0;
        Stream.anInt2071 = 0;
        Class17.anInt304 = 0;
        ItemDef.anInt2434 = 0;
        Class37_Sub4_Sub5.anInt2591 = 0;
        Class46.anInt981 = 0;
        Class37_Sub9_Sub16.anInt3183 = 0;
        Class37_Sub23.anInt2230 = 0;
        Class60.anInt1157 = 0;
        Class37_Sub4_Sub7.anInt2632 = 0;
        Class4.anInt101 = 0;
        Class37_Sub3_Sub3.anInt2341 = 0;
        Applet_Sub1.anInt16 = 0;
        Class37_Sub9_Sub12.anInt3118 = 0;
        Class37_Sub9_Sub35.anInt3565 = 0;
        Class69.anInt1344 = 0;
        ObjectDef.anInt2748 = 0;
        Class37_Sub9_Sub27.anInt3418 = -1;
        ObjectDef.anInt2734 = 0;
        Class37_Sub9_Sub16.anInt3201 = 0;
        Class45.anInt977 = -1;
        Class37_Sub9_Sub21.anInt3321 = 0;
        Class42.aStream_Sub1_936.currentIndex = 0;
        Class83.packetStream.currentIndex = 0;
        Class58.method1156(8, 0);

        for (int i_90_ = 0; (i_90_ ^ 0xffffffff) > -101; i_90_++)
            Stream.aJStringArray2041[i_90_] = null;

        RSSocket.anInt487 = 0;
        Class37_Sub9_Sub36.anInt3584 = 0;
        Class37_Sub3_Sub1.anInt2329 = 0;
        Class37_Sub14.anInt2122 = 0;
        Class79.anInt1474 = 0;
        Class37_Sub9_Sub9.anInt3077 = (int) (Math.random() * 100.0) + -50;
        Class37_Sub4_Sub5.aBoolean2595 = false;
        Class37_Sub9_Sub23.anInt3358 = (int) (Math.random() * 110.0) + -55;
        Class37_Sub14.anInt2127 = 0x7ff & ((int) (20.0 * Math.random()) + -10);
        Class8.anInt168 = 0;
        Class37_Sub9_Sub37.anInt3590 = (int) (120.0 * Math.random()) - 60;
        Class78.anInt1458 = (int) (Math.random() * 30.0) - 20;
        Class76.anInt1436 = 0;
        Class37_Sub9_Sub35.anInt3564 = -1;
        Class83.anInt1518 = (int) (Math.random() * 80.0) + -40;
        Class82.anInt1687 = 0;

        for (int i_91_ = 0; (i_91_ ^ 0xffffffff) > -2049; i_91_++) {
            Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_91_] = null;
            Class37_Sub9_Sub15.aStreamArray3175[i_91_] = null;
        }

        for (int i_92_ = 0; (i_92_ ^ 0xffffffff) > -32769; i_92_++)
            Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_92_] = null;

        Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[2047] = new Class37_Sub4_Sub7_Sub1_Sub2();
        Class37_Sub9_Sub5.aClass58_2994.method1154(64);
        RSSocket.aClass58_481.method1154(64);

        for (int i_93_ = 0; i_93_ < 4; i_93_++) {
            for (int i_94_ = 0; (i_94_ ^ 0xffffffff) > -105; i_94_++) {
                for (int i_95_ = 0; (i_95_ ^ 0xffffffff) > -105; i_95_++)
                    Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[i_93_][i_94_][i_95_] = null;
            }
        }

        Class37_Sub9_Sub28.aClass58_3427 = new Class58();
        Class37_Sub4_Sub12.anInt2783 = 0;
        RSApplet.anInt173 = 0;

        for (int i_96_ = 0; i_96_ < Class1.anInt65; i_96_++) {
            Class37_Sub4_Sub14 class37_sub4_sub14 = Class37_Sub4_Sub18.method730(-9094,
                    i_96_);

            if ((class37_sub4_sub14 != null) &&
                    (class37_sub4_sub14.anInt2808 == 0)) {
                Class80.anIntArray1503[i_96_] = 0;
                Class37_Sub23.anIntArray2237[i_96_] = 0;
            }
        }

        for (int i_97_ = 0;
                ((i_97_ ^ 0xffffffff) > (Class37_Sub8.anIntArray1939.length ^
                0xffffffff)); i_97_++)
            Class37_Sub8.anIntArray1939[i_97_] = -1;

        if ((Class32.anInt733 ^ 0xffffffff) != 0) {
            Class37_Sub9_Sub24.method871(Class32.anInt733, false);
        }

        for (Class37_Sub6 class37_sub6 = (Class37_Sub6) Class76.aClass13_1423.method94(
                    -106); class37_sub6 != null;
                class37_sub6 = (Class37_Sub6) Class76.aClass13_1423.method102(
                        (byte) 25))
            PacketStream.method992(-1494101117, class37_sub6, true);

        Class32.anInt733 = -1;
        Class76.aClass13_1423 = new Class13(8);
        Class37_Sub9_Sub13.anInt3134 = 0;
        Class79.aClass18_1489 = null;
        Class37_Sub20.aBoolean2220 = false;
        Class57.aClass29_1098.method270(null, false, (byte) -96, new int[5], -1);

        for (int i_98_ = 0; (i_98_ ^ 0xffffffff) > -9; i_98_++) {
            Class75.aJStringArray1413[i_98_] = null;
            aBooleanArray1058[i_98_] = false;
        }

        Class87.method1328(true);
        Class10.aBoolean197 = true;

        for (int i_99_ = 0; (i_99_ ^ 0xffffffff) > -101; i_99_++)
            Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_99_] = true;

        Class14.aClass37_Sub18Array240 = null;
        Login.anInt783 = 0;
        Class14.aJString_252 = null;

        for (int i_100_ = 0; i_100_ < 6; i_100_++)
            Class37_Sub4_Sub8.aClass62Array2643[i_100_] = new Class62();
    }
}
