/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.Component;


public class Class17 {
    public static int anInt296;
    public static int anInt299;
    public static Class58 aClass58_300 = new Class58();
    public static int anInt302;
    public static int anInt303;
    public static int anInt304;
    public static int anInt305;
    public static int anInt306;
    public static int[] anIntArray307 = new int[99];
    public static JString aJString_308;
    public static JString aJString_310;
    public static JString aJString_311;
    public static Class65 aClass65_312;
    public static JString aJString_313;
    public static Class37_Sub4_Sub9_Sub2_Sub1 aClass37_Sub4_Sub9_Sub2_Sub1_315;
    public static Class13 aClass13_316;
    public static JString aJString_317;

    static {
        int i = 0;

        for (int i_47_ = 0; i_47_ < 99; i_47_++) {
            int i_48_ = i_47_ + 1;
            int i_49_ = (int) ((double) i_48_ +
                (Math.pow(2.0, (double) i_48_ / 7.0) * 300.0));
            i += i_49_;
            anIntArray307[i_47_] = i / 4;
        }

        aJString_308 = Class37_Sub2.method332((byte) 105, "glow2:");
        aJString_310 = aJString_308;
        aJString_311 = aJString_308;
        aJString_313 = Class37_Sub2.method332((byte) 124, "::qa_op_test");
        aClass65_312 = new Class65(50);
        aClass13_316 = new Class13(32);
        aJString_317 = Class37_Sub2.method332((byte) 102, "");
    }

    public int[] anIntArray297;
    public Class37_Sub9 aClass37_Sub9_298;
    public Class37_Sub9 aClass37_Sub9_301;
    public int[] anIntArray309;
    public Class37_Sub9[] aClass37_Sub9Array314;

    public Class17() {
        anIntArray297 = new int[0];
        anIntArray309 = new int[0];
        aClass37_Sub9_301 = new Class37_Sub9_Sub14();
        aClass37_Sub9_298 = new Class37_Sub9_Sub14();

        aClass37_Sub9Array314 = new Class37_Sub9[] {
                aClass37_Sub9_301, aClass37_Sub9_298
            };
    }

    public Class17(Stream stream) {
        int i = stream.readByte(123);
        Class13 class13 = new Class13(64);
        Class13 class13_28_ = new Class13(64);
        Class13 class13_29_ = new Class13(64);
        aClass37_Sub9Array314 = new Class37_Sub9[i];

        int[][] is = new int[i][];

        for (int i_30_ = 0; i > i_30_; i_30_++) {
            Class37_Sub9 class37_sub9 = Class37_Sub9_Sub3.method772(stream,
                    true);
            int i_31_ = class37_sub9.method757(75);
            int i_32_ = class37_sub9.method758(-30563);

            if (i_31_ >= 0) {
                int i_33_ = i_31_;

                if (((i_33_ ^ 0xffffffff) <= -1) &&
                        (class13_28_.method100((byte) 49, (long) i_33_) == null)) {
                    class13_28_.method101(new Class37_Sub10(i_33_), false,
                        (long) i_33_);
                }
            }

            if ((i_32_ ^ 0xffffffff) <= -1) {
                int i_34_ = i_32_;

                if ((i_34_ >= 0) &&
                        (class13_29_.method100((byte) 89, (long) i_34_) == null)) {
                    class13_29_.method101(new Class37_Sub10(i_34_), false,
                        (long) i_34_);
                }
            }

            int i_35_ = class37_sub9.aClass37_Sub9Array1947.length;
            is[i_30_] = new int[i_35_];

            for (int i_36_ = 0; i_35_ > i_36_; i_36_++)
                is[i_30_][i_36_] = stream.readByte(120);

            class13.method101(class37_sub9, false, (long) class37_sub9.anInt1955);
            aClass37_Sub9Array314[i_30_] = class37_sub9;
        }

        for (int i_37_ = 0; (i ^ 0xffffffff) < (i_37_ ^ 0xffffffff); i_37_++) {
            Class37_Sub9 class37_sub9 = aClass37_Sub9Array314[i_37_];
            int i_38_ = class37_sub9.aClass37_Sub9Array1947.length;

            for (int i_39_ = 0; i_38_ > i_39_; i_39_++) {
                Class37_Sub9 class37_sub9_40_ = ((Class37_Sub9) class13.method100((byte) 34,
                        (long) is[i_37_][i_39_]));
                class37_sub9.aClass37_Sub9Array1947[i_39_] = class37_sub9_40_;
            }

            is[i_37_] = null;
        }

        aClass37_Sub9_301 = ((Class37_Sub9) class13.method100((byte) 108,
                (long) stream.readByte(118)));

        aClass37_Sub9_298 = ((Class37_Sub9) class13.method100((byte) 47,
                (long) stream.readByte(118)));

        Object object = null;
        Object object_41_ = null;
        anIntArray297 = new int[class13_28_.method97(108)];
        anIntArray309 = new int[class13_29_.method97(94)];

        Class37[] class37s = new Class37[class13_28_.method97(93)];
        Class37[] class37s_42_ = new Class37[class13_29_.method97(78)];
        class13_28_.method96(0, class37s);

        Object object_43_ = null;
        class13_29_.method96(0, class37s_42_);

        for (int i_44_ = 0;
                (class37s.length ^ 0xffffffff) < (i_44_ ^ 0xffffffff);
                i_44_++)
            anIntArray297[i_44_] = ((Class37_Sub10) class37s[i_44_]).anInt1990;

        Object object_45_ = null;

        for (int i_46_ = 0; class37s_42_.length > i_46_; i_46_++)
            anIntArray309[i_46_] = ((Class37_Sub10) class37s_42_[i_46_]).anInt1990;
    }

    public static void method182(boolean bool) {
        anInt304++;

        do {
            try {
                if (Class37_Sub7.anInt1904 == 1) {
                    int i = Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method371((byte) 111);

                    if (((i ^ 0xffffffff) < -1) &&
                            Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method376(
                                81)) {
                        i -= Class37_Sub5.anInt1877;

                        if ((i ^ 0xffffffff) > -1) {
                            i = 0;
                        }

                        Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method384(i,
                            (byte) 82);

                        break;
                    }

                    Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method363(127);
                    Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method357(-1);
                    RSSocket.aClass73_489 = null;
                    ObjectDef.aClass37_Sub19_2735 = null;

                    if (Class84.aClass15_1534 == null) {
                        Class37_Sub7.anInt1904 = 0;
                    } else {
                        Class37_Sub7.anInt1904 = 2;
                    }
                }

                if (bool == false) {
                    break;
                }

                method188(null, null, 67, 40, 36);
            } catch (Exception exception) {
                exception.printStackTrace();
                Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method363(127);
                RSSocket.aClass73_489 = null;
                ObjectDef.aClass37_Sub19_2735 = null;
                Class84.aClass15_1534 = null;
                Class37_Sub7.anInt1904 = 0;

                break;
            }

            break;
        } while (false);
    }

    public int[] method183(int i, float f, int i_0_, boolean bool,
        Class15 class15, boolean bool_1_, Interface3 interface3) {
        try {
            Class37_Sub4_Sub15.aClass15_2859 = class15;

            int[] is = new int[i_0_ * i];
            PacketParser.anInterface3_3265 = interface3;
            anInt303++;
            Class37_Sub9_Sub10.method803(i, -98, i_0_);

            for (int i_2_ = 0; i_2_ < aClass37_Sub9Array314.length; i_2_++)
                aClass37_Sub9Array314[i_2_].method751(i, i_0_, -10);

            if (bool_1_ != true) {
                return null;
            }

            int i_3_ = 0;
            int i_4_;
            int i_5_;
            int i_6_;

            if (bool) {
                i_6_ = -1;
                i_4_ = -1;
                i_5_ = i_0_ + -1;
            } else {
                i_4_ = 1;
                i_5_ = 0;
                i_6_ = i_0_;
            }

            for (int i_7_ = 0; (i ^ 0xffffffff) < (i_7_ ^ 0xffffffff);
                    i_7_++) {
                int[] is_8_;
                int[] is_9_;
                int[] is_10_;

                if (aClass37_Sub9_301.aBoolean1943) {
                    int[] is_11_ = aClass37_Sub9_301.method761(-127, i_7_);
                    is_10_ = is_11_;
                    is_8_ = is_11_;
                    is_9_ = is_11_;
                } else {
                    int[][] is_12_ = aClass37_Sub9_301.method759((byte) 127,
                            i_7_);
                    is_8_ = is_12_[1];
                    is_9_ = is_12_[2];
                    is_10_ = is_12_[0];
                }

                for (int i_13_ = i_5_;
                        (i_6_ ^ 0xffffffff) != (i_13_ ^ 0xffffffff);
                        i_13_ += i_4_) {
                    int i_14_ = is_10_[i_13_] >> -542541692;
                    int i_15_ = is_9_[i_13_] >> -1425764476;

                    if ((i_15_ ^ 0xffffffff) < -256) {
                        i_15_ = 255;
                    }

                    int i_16_ = is_8_[i_13_] >> -282237532;

                    if (i_16_ > 255) {
                        i_16_ = 255;
                    }

                    if (i_14_ > 255) {
                        i_14_ = 255;
                    }

                    if (i_16_ < 0) {
                        i_16_ = 0;
                    }

                    if ((i_14_ ^ 0xffffffff) > -1) {
                        i_14_ = 0;
                    }

                    if ((i_15_ ^ 0xffffffff) > -1) {
                        i_15_ = 0;
                    }

                    is[i_3_++] = Class37_Sub4_Sub9_Sub4.method671(((i_16_ << 971350120) +
                            ((i_14_ << 2130121872) - -i_15_)), f);
                }
            }

            for (int i_17_ = 0;
                    ((i_17_ ^ 0xffffffff) > (aClass37_Sub9Array314.length ^
                    0xffffffff)); i_17_++)
                aClass37_Sub9Array314[i_17_].method755((byte) 113);

            return is;
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("ed.D(" + i + ',' + f + ',' + i_0_ + ',' + bool + ',' +
                ((class15 != null) ? "{...}" : "null") + ',' + bool_1_ + ',' +
                ((interface3 != null) ? "{...}" : "null") + ')'));
        }
    }

    public static void method184(boolean bool, int i, int i_18_, int i_19_,
        Class15_Sub1 class15_sub1, byte i_20_, int i_21_) {
        anInt306++;

        long l = (long) ((i_21_ << -1350430544) + i);
        Class37_Sub4_Sub13 class37_sub4_sub13 = (Class37_Sub4_Sub13) Class6.aClass13_139.method100((byte) 90,
                l);

        if (class37_sub4_sub13 == null) {
            class37_sub4_sub13 = (Class37_Sub4_Sub13) aClass13_316.method100((byte) 92,
                    l);

            if (i_19_ != -1350430544) {
                anIntArray307 = null;
            }

            if (class37_sub4_sub13 == null) {
                class37_sub4_sub13 = (Class37_Sub4_Sub13) Class37_Sub4_Sub18.aClass13_2905.method100((byte) 82,
                        l);

                if (class37_sub4_sub13 != null) {
                    if (bool) {
                        class37_sub4_sub13.method438(false);
                        Class6.aClass13_139.method101(class37_sub4_sub13,
                            false, l);
                        Class37_Sub4_Sub7_Sub1_Sub1.anInt3953++;
                        Class37_Sub9_Sub26.anInt3396--;
                    }
                } else {
                    if (!bool) {
                        class37_sub4_sub13 = ((Class37_Sub4_Sub13) Class37_Sub9_Sub20.aClass13_3297.method100((byte) 37,
                                l));

                        if (class37_sub4_sub13 != null) {
                            return;
                        }
                    }

                    class37_sub4_sub13 = new Class37_Sub4_Sub13();
                    class37_sub4_sub13.anInt2790 = i_18_;
                    class37_sub4_sub13.aClass15_Sub1_2801 = class15_sub1;
                    class37_sub4_sub13.aByte2788 = i_20_;

                    if (bool) {
                        Class6.aClass13_139.method101(class37_sub4_sub13,
                            false, l);
                        Class37_Sub4_Sub7_Sub1_Sub1.anInt3953++;
                    } else {
                        Class4.aClass77_92.method1293(464, class37_sub4_sub13);
                        Class37_Sub4_Sub18.aClass13_2905.method101(class37_sub4_sub13,
                            false, l);
                        Class37_Sub9_Sub26.anInt3396++;
                    }
                }
            }
        }
    }

    public static Class37_Sub4_Sub17 method185(int i, int i_22_) {
        anInt302++;

        Class37_Sub4_Sub17 class37_sub4_sub17 = ((Class37_Sub4_Sub17) Class52_Sub1.aClass65_2299.method1181((byte) 60,
                (long) i_22_));

        if (class37_sub4_sub17 != null) {
            return class37_sub4_sub17;
        }

        byte[] is = Class37_Sub16.aClass15_2152.method131(i_22_, i, i ^ 0x4);
        class37_sub4_sub17 = new Class37_Sub4_Sub17();

        if (is != null) {
            class37_sub4_sub17.method727(new Stream(is), false);
        }

        Class52_Sub1.aClass65_2299.method1179((long) i_22_, -4,
            class37_sub4_sub17);

        return class37_sub4_sub17;
    }

    public boolean method186(Interface3 interface3, Class15 class15, byte i) {
        try {
            anInt296++;

            if (i > -67) {
                method188(null, null, 6, 119, 52);
            }

            for (int i_23_ = 0; anIntArray297.length > i_23_; i_23_++) {
                if (!class15.method112(anIntArray297[i_23_], -17104)) {
                    return false;
                }
            }

            for (int i_24_ = 0;
                    (anIntArray309.length ^ 0xffffffff) < (i_24_ ^ 0xffffffff);
                    i_24_++) {
                if (!interface3.method10(anIntArray309[i_24_], 44)) {
                    return false;
                }
            }

            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("ed.E(" + ((interface3 != null) ? "{...}" : "null") + ',' +
                ((class15 != null) ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    public static void method187(boolean bool) {
        aClass37_Sub4_Sub9_Sub2_Sub1_315 = null;

        if (bool == false) {
            aJString_308 = null;
            anIntArray307 = null;
            aClass13_316 = null;
            aJString_310 = null;
            aJString_313 = null;
            aJString_317 = null;
            aClass65_312 = null;
            aJString_311 = null;
            aClass58_300 = null;
        }
    }

    public static Class24 method188(Component component, Signlink class51,
        int i, int i_25_, int i_26_) {
        try {
            anInt299++;

            if ((Class33.anInt765 ^ 0xffffffff) == -1) {
                throw new IllegalStateException();
            }

            if (((i_26_ ^ 0xffffffff) > i_25_) || (i_26_ >= 2)) {
                throw new IllegalArgumentException();
            }

            if ((i ^ 0xffffffff) > -257) {
                i = 256;
            }

            try {
                Class24 class24 = (Class24) Class.forName("Class24_Sub2")
                                                 .newInstance();
                class24.anInt624 = i;

                class24.anIntArray606 = new int[256 * ((!Class37_Sub4_Sub10.aBoolean2690)
                    ? 1 : 2)];
                class24.method237(component);
                class24.anInt623 = (~0x3ff & i) - -1024;

                if ((class24.anInt623 ^ 0xffffffff) < -16385) {
                    class24.anInt623 = 16384;
                }

                class24.method246(class24.anInt623);

                if (((Class37_Sub4_Sub6.anInt2622 ^ 0xffffffff) < -1) &&
                        (Class2.aClass47_77 == null)) {
                    Class2.aClass47_77 = new Class47();
                    Class2.aClass47_77.aClass51_991 = class51;
                    class51.createResource(Class2.aClass47_77,
                        Class37_Sub4_Sub6.anInt2622, (byte) 65);
                }

                if (Class2.aClass47_77 != null) {
                    if (Class2.aClass47_77.aClass24Array996[i_26_] != null) {
                        throw new IllegalArgumentException();
                    }

                    Class2.aClass47_77.aClass24Array996[i_26_] = class24;
                }

                return class24;
            } catch (Throwable throwable) {
                try {
                    Class24_Sub1 class24_sub1 = new Class24_Sub1(class51, i_26_);

                    class24_sub1.anIntArray606 = (new int[((!Class37_Sub4_Sub10.aBoolean2690)
                        ? 1 : 2) * 256]);
                    class24_sub1.anInt624 = i;
                    class24_sub1.method237(component);
                    class24_sub1.anInt623 = 16384;
                    class24_sub1.method246(class24_sub1.anInt623);

                    if ((Class37_Sub4_Sub6.anInt2622 > 0) &&
                            (Class2.aClass47_77 == null)) {
                        Class2.aClass47_77 = new Class47();
                        Class2.aClass47_77.aClass51_991 = class51;
                        class51.createResource(Class2.aClass47_77,
                            Class37_Sub4_Sub6.anInt2622, (byte) 65);
                    }

                    if (Class2.aClass47_77 != null) {
                        if (Class2.aClass47_77.aClass24Array996[i_26_] != null) {
                            throw new IllegalArgumentException();
                        }

                        Class2.aClass47_77.aClass24Array996[i_26_] = class24_sub1;
                    }

                    return class24_sub1;
                } catch (Throwable throwable_27_) {
                    return new Class24();
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("ed.G(" + ((component != null) ? "{...}" : "null") + ',' +
                ((class51 != null) ? "{...}" : "null") + ',' + i + ',' + i_25_ +
                ',' + i_26_ + ')'));
        }
    }
}
