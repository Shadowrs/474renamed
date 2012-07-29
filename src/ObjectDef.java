/* ObjectDef - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.io.*;

public class ObjectDef extends Class37_Sub4 {
    public static int anInt2695;
    public static int anInt2697;
    public static int anInt2703;
    public static JString aJString_2704;
    public static int anInt2710;
    public static int[] anIntArray2712;
    public static int anInt2716;
    public static int anInt2720;
    public static int totalObjectsLoaded;
    public static int anInt2722;
    public static JString aJString_2723 = Class37_Sub2.method332((byte) 125,
            "gelb:");
    public static int anInt2724;
    public static int anInt2729;
    public static int anInt2734;
    public static Class37_Sub19 aClass37_Sub19_2735;
    public static boolean aBoolean2736 = false;
    public static int anInt2742;
    public static int anInt2748;
    public static JString aJString_2752;

    static {
        anInt2734 = 0;

        aJString_2752 = Class37_Sub2.method332((byte) 126,
                " from your ignore list first)3");
        aJString_2704 = aJString_2752;
    }

    public JString name;
    public JString[] contextMenu;
    public int scaleFactor_X;
    public int scaleFactor_Y;
    public int scaleFactor_Z;
    public int tileWidth;
    public int tileDepth;
    public int soundId;
    public int soundRange;
    public int id;
    public int animation;
    public boolean ProjectileBlocked;
    public int anInt2692;
    public int anInt2693;
    public boolean aBoolean2694 = true;
    public int anInt2698;
    public int anInt2699;
    public int[] anIntArray2701;
    public int[] anIntArray2702;
    public int anInt2706;
    public int anInt2707;
    public int anInt2708;
    public short[] aShortArray2711;
    public int anInt2713;
    public int[] anIntArray2714;
    public short[] aShortArray2715;
    public int anInt2717;
    public short[] aShortArray2718;
    public int anInt2719;
    public int anInt2725;
    public int anInt2726;
    public int anInt2727;
    public boolean aBoolean2728;
    public int[] anIntArray2732;
    public boolean aBoolean2737;
    public int anInt2738;
    public int anInt2739;
    public int anInt2740;
    public short[] aShortArray2741;
    public boolean aBoolean2744;
    public boolean aBoolean2747;
    public int anInt2749;
    public boolean aBoolean2750;

    public ObjectDef() {
        contextMenu = new JString[5];
        anInt2707 = -1;
        soundRange = 0;
        anInt2698 = -1;
        anInt2713 = 0;
        anInt2719 = -1;
        scaleFactor_X = 128;
        anInt2706 = -1;
        anInt2692 = 0;
        anInt2693 = -1;
        ProjectileBlocked = true;
        anInt2708 = 0;
        anInt2725 = 16;
        scaleFactor_Z = 128;
        aBoolean2728 = false;
        tileWidth = 1;
        anInt2726 = -1;
        anInt2727 = 0;
        soundId = -1;
        anInt2738 = 0;
        anInt2699 = -1;
        aBoolean2737 = false;
        anInt2740 = 2;
        anInt2717 = 0;
        anInt2739 = 0;
        tileDepth = 1;
        aBoolean2744 = false;
        animation = -1;
        aBoolean2747 = false;
        name = Class37_Sub9_Sub16.aJString_3204;
        anInt2749 = 0;
        aBoolean2750 = false;
        scaleFactor_Y = 128;
    }

    public ObjectDef method681(byte i) {
        int i_0_ = -1;
        anInt2729++;

        if ((anInt2707 ^ 0xffffffff) == 0) {
            if (anInt2693 != -1) {
                i_0_ = Class37_Sub23.anIntArray2237[anInt2693];
            }
        } else {
            i_0_ = Stream.method983(anInt2707, 111);
        }

        if (i <= 88) {
            method685(53);
        }

        if (((i_0_ ^ 0xffffffff) > -1) || (anIntArray2702.length <= i_0_) ||
                (anIntArray2702[i_0_] == -1)) {
            return null;
        }

        return Class37_Sub9_Sub8.method794(anIntArray2702[i_0_], 28067);
    }

    public Class37_Sub4_Sub7_Sub6 method682(int i, int i_1_, int i_2_,
        int i_3_, int[][] is, int i_4_, int i_5_,
        Class37_Sub4_Sub12 class37_sub4_sub12, int i_6_) {
        try {
            anInt2748++;

            long l;

            if (anIntArray2732 != null) {
                l = (long) ((id << -1667699286) -
                    -(i_2_ << -2059436253) + i_6_);
            } else {
                l = (long) ((id << 1009862442) + i_6_);
            }

            Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = ((Class37_Sub4_Sub7_Sub6) Class37_Sub4_Sub12.aClass65_2770.method1181((byte) 96,
                    l));

            if (i_5_ <= 5) {
                contextMenu = null;
            }

            if (class37_sub4_sub7_sub6 == null) {
                Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = method689(i_2_,
                        -76, i_6_);

                if (class37_sub4_sub7_sub4 == null) {
                    return null;
                }

                class37_sub4_sub7_sub6 = class37_sub4_sub7_sub4.method518(anInt2717 +
                        64, (5 * anInt2739) + 768, -50, -10, -50, true, true);
                Class37_Sub4_Sub12.aClass65_2770.method1179(l, -4,
                    class37_sub4_sub7_sub6);
            }

            if ((class37_sub4_sub12 == null) && (anInt2698 == -1)) {
                return class37_sub4_sub7_sub6;
            }

            if (class37_sub4_sub12 != null) {
                class37_sub4_sub7_sub6 = class37_sub4_sub12.method694(i_3_,
                        i_6_, 1524262960, class37_sub4_sub7_sub6);
            } else {
                class37_sub4_sub7_sub6 = class37_sub4_sub7_sub6.method559(true);
            }

            if (anInt2698 >= 0) {
                class37_sub4_sub7_sub6 = class37_sub4_sub7_sub6.method548(is,
                        i_1_, i_4_, i, false, anInt2698);
            }

            return class37_sub4_sub7_sub6;
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("lh.J(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' +
                ((is != null) ? "{...}" : "null") + ',' + i_4_ + ',' + i_5_ +
                ',' + ((class37_sub4_sub12 != null) ? "{...}" : "null") + ',' +
                i_6_ + ')'));
        }
    }

    public Class37_Sub4_Sub7_Sub6 method683(int i, int[][] is, int i_7_,
        int i_8_, int i_9_, boolean bool, int i_10_) {
        long l;

        if (anIntArray2732 != null) {
            l = (long) (i +
                ((i_10_ << -201244381) + (id << 1728420074)));
        } else {
            l = (long) (i + (id << 471355402));
        }

        anInt2722++;

        Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = ((Class37_Sub4_Sub7_Sub6) Class72.aClass65_1371.method1181((byte) 109,
                l));

        if (class37_sub4_sub7_sub6 == null) {
            Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = method689(i_10_,
                    -91, i);

            if (class37_sub4_sub7_sub4 == null) {
                return null;
            }

            class37_sub4_sub7_sub6 = class37_sub4_sub7_sub4.method518(64 -
                    -anInt2717, (5 * anInt2739) + 768, -50, -10, -50,
                    ((anInt2698 ^ 0xffffffff) <= -1), false);
            Class72.aClass65_1371.method1179(l, -4, class37_sub4_sub7_sub6);
        }

        if (bool != true) {
            anInt2727 = -69;
        }

        if (anInt2698 >= 0) {
            class37_sub4_sub7_sub6 = class37_sub4_sub7_sub6.method548(is, i_7_,
                    i_8_, i_9_, true, anInt2698);
        }

        return class37_sub4_sub7_sub6;
    }

    public static void method684(int i) {
        aClass37_Sub19_2735 = null;
        anIntArray2712 = null;
        aJString_2704 = null;

        if (i != 6989) {
            aJString_2723 = null;
        }

        aJString_2723 = null;
        aJString_2752 = null;
    }

    public void method685(int i) {
        if (anInt2726 == -1) {
            anInt2726 = 0;

            if ((anIntArray2701 != null) && ((anIntArray2732 == null) || (anIntArray2732[0] == 10))) {
                anInt2726 = 1;
            }

            for (int i_11_ = 0; i_11_ < 5; i_11_++) {
                if (contextMenu[i_11_] != null) {
                    anInt2726 = 1;
                }
            }
        }

        if (anInt2719 == -1) {
            anInt2719 = (anInt2740 != 0) ? 1 : 0;
        }

        int i_12_ = -113 % ((i - -10) / 47);
        anInt2695++;
    }

    public boolean method686(int i, int i_13_) {
        anInt2724++;

        if (i_13_ != -13979) {
            method682(-71, 71, -113, -14, null, -123, 68, null, 26);
        }

        if (anIntArray2732 == null) {
            if (anIntArray2701 == null) {
                return true;
            }

            if ((i ^ 0xffffffff) != -11) {
                return true;
            }

            boolean bool = true;

            for (int i_14_ = 0; anIntArray2701.length > i_14_; i_14_++)
                bool &= (Class37_Sub9_Sub24.aClass15_3365.method115(-9350,
                    anIntArray2701[i_14_] & 0xffff, 0));

            return bool;
        }

        for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > (anIntArray2732.length ^ 0xffffffff); i_15_++) {
            if ((anIntArray2732[i_15_] ^ 0xffffffff) == (i ^ 0xffffffff)) {
                return (Class37_Sub9_Sub24.aClass15_3365.method115(i_13_ + 4629, anIntArray2701[i_15_] & 0xffff, 0));
            }
        }

        return true;
    }

    public boolean method687(int i) {
        anInt2716++;

        if (anIntArray2702 == null) {
            if ((soundId == -1) && (anIntArray2714 == null)) {
                return false;
            }

            return true;
        }

        if (i != -9383) {
            anInt2708 = -42;
        }

        for (int i_16_ = 0;
                (anIntArray2702.length ^ 0xffffffff) < (i_16_ ^ 0xffffffff);
                i_16_++) {
            if (anIntArray2702[i_16_] != -1) {
                ObjectDef objectdef_17_ = Class37_Sub9_Sub8.method794(anIntArray2702[i_16_],
                        28067);

                if (((objectdef_17_.soundId ^ 0xffffffff) != 0) ||
                        (objectdef_17_.anIntArray2714 != null)) {
                    return true;
                }
            }
        }

        return false;
    }

    public Class37_Sub4_Sub7 method688(int i, int i_18_, int i_19_, int i_20_,
        int i_21_, int[][] is, int i_22_) {
        anInt2742++;

        long l;

        if (anIntArray2732 == null) {
            l = (long) ((id << 1836452042) + i_22_);
        } else {
            l = (long) (i_22_ + (i_19_ << -1947126301) +
                (id << -818655158));
        }

        Class37_Sub4_Sub7 class37_sub4_sub7 = ((Class37_Sub4_Sub7) Class39.aClass65_867.method1181((byte) 108,
                l));

        if (i_18_ != 64) {
            return null;
        }

        if (class37_sub4_sub7 == null) {
            Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = method689(i_19_,
                    i_18_ + -182, i_22_);

            if (class37_sub4_sub7_sub4 == null) {
                return null;
            }

            if (aBoolean2737) {
                class37_sub4_sub7_sub4.aShort3760 = (short) (anInt2717 + 64);

                class37_sub4_sub7_sub4.aShort3793 = (short) ((5 * anInt2739) +
                    768);
                class37_sub4_sub7 = class37_sub4_sub7_sub4;
                class37_sub4_sub7_sub4.method538();
            } else {
                class37_sub4_sub7 = class37_sub4_sub7_sub4.method518(anInt2717 +
                        64, (anInt2739 * 5) + 768, -50, -10, -50,
                        anInt2698 >= 0, false);
            }

            Class39.aClass65_867.method1179(l, i_18_ ^ ~0x43, class37_sub4_sub7);
        }

        if (aBoolean2737) {
            class37_sub4_sub7 = ((Class37_Sub4_Sub7_Sub4) class37_sub4_sub7).method532();
        }

        if ((anInt2698 ^ 0xffffffff) <= -1) {
            if (!(class37_sub4_sub7 instanceof Class37_Sub4_Sub7_Sub6)) {
                if (class37_sub4_sub7 instanceof Class37_Sub4_Sub7_Sub4) {
                    class37_sub4_sub7 = ((Class37_Sub4_Sub7_Sub4) class37_sub4_sub7).method531(is,
                            i_21_, i_20_, i, true, anInt2698);
                }
            } else {
                class37_sub4_sub7 = ((Class37_Sub4_Sub7_Sub6) class37_sub4_sub7).method548(is,
                        i_21_, i_20_, i, true, anInt2698);
            }
        }

        return class37_sub4_sub7;
    }

    public Class37_Sub4_Sub7_Sub4 method689(int i, int i_23_, int i_24_) {
        Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = null;
        anInt2703++;

        if (anIntArray2732 != null) {
            int i_25_ = -1;

            for (int i_26_ = 0; anIntArray2732.length > i_26_; i_26_++) {
                if (anIntArray2732[i_26_] == i) {
                    i_25_ = i_26_;

                    break;
                }
            }

            if ((i_25_ ^ 0xffffffff) == 0) {
                return null;
            }

            int i_27_ = anIntArray2701[i_25_];
            boolean bool = (i_24_ > 3) ^ aBoolean2750;

            if (bool) {
                i_27_ += 65536;
            }

            class37_sub4_sub7_sub4 = ((Class37_Sub4_Sub7_Sub4) Class37_Sub9_Sub23.aClass65_3346.method1181((byte) 45,
                    (long) i_27_));

            if (class37_sub4_sub7_sub4 == null) {
                class37_sub4_sub7_sub4 = Class37_Sub4_Sub7_Sub4.method529((Class37_Sub9_Sub24.aClass15_3365),
                        i_27_ & 0xffff, 0);

                if (class37_sub4_sub7_sub4 == null) {
                    return null;
                }

                if (bool) {
                    class37_sub4_sub7_sub4.method539();
                }

                Class37_Sub9_Sub23.aClass65_3346.method1179((long) i_27_, -4,
                    class37_sub4_sub7_sub4);
            }
        } else {
            if ((i ^ 0xffffffff) != -11) {
                return null;
            }

            if (anIntArray2701 == null) {
                return null;
            }

            boolean bool = aBoolean2750;

            if (((i ^ 0xffffffff) == -3) && (i_24_ > 3)) {
                bool = !bool;
            }

            int i_28_ = anIntArray2701.length;

            for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
                int i_30_ = anIntArray2701[i_29_];

                if (bool) {
                    i_30_ += 65536;
                }

                class37_sub4_sub7_sub4 = ((Class37_Sub4_Sub7_Sub4) Class37_Sub9_Sub23.aClass65_3346.method1181((byte) 20,
                        (long) i_30_));

                if (class37_sub4_sub7_sub4 == null) {
                    class37_sub4_sub7_sub4 = Class37_Sub4_Sub7_Sub4.method529((Class37_Sub9_Sub24.aClass15_3365),
                            i_30_ & 0xffff, 0);

                    if (class37_sub4_sub7_sub4 == null) {
                        return null;
                    }

                    if (bool) {
                        class37_sub4_sub7_sub4.method539();
                    }

                    Class37_Sub9_Sub23.aClass65_3346.method1179((long) i_30_,
                        -4, class37_sub4_sub7_sub4);
                }

                if ((i_28_ ^ 0xffffffff) < -2) {
                    Applet_Sub1.aClass37_Sub4_Sub7_Sub4Array36[i_29_] = class37_sub4_sub7_sub4;
                }
            }

            if ((i_28_ ^ 0xffffffff) < -2) {
                class37_sub4_sub7_sub4 = (new Class37_Sub4_Sub7_Sub4(Applet_Sub1.aClass37_Sub4_Sub7_Sub4Array36,
                        i_28_));
            }
        }

        if (i_23_ >= -32) {
            aJString_2723 = null;
        }

        boolean bool;

        if ((scaleFactor_Y == 128) && ((scaleFactor_Z ^ 0xffffffff) == -129) &&
                ((scaleFactor_X ^ 0xffffffff) == -129)) {
            bool = false;
        } else {
            bool = true;
        }

        boolean bool_31_;

        if ((anInt2713 == 0) && (anInt2738 == 0) && (anInt2749 == 0)) {
            bool_31_ = false;
        } else {
            bool_31_ = true;
        }

        Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_32_ = new Class37_Sub4_Sub7_Sub4(class37_sub4_sub7_sub4,
                (i_24_ == 0) && !bool && !bool_31_, aShortArray2718 == null,
                aShortArray2741 == null, true);

        if (((i ^ 0xffffffff) == -5) && (i_24_ > 3)) {
            class37_sub4_sub7_sub4_32_.method524(256);
            class37_sub4_sub7_sub4_32_.method520(45, 0, -45);
        }

        i_24_ &= 0x3;

        if ((i_24_ ^ 0xffffffff) == -2) {
            class37_sub4_sub7_sub4_32_.method521();
        } else if (i_24_ == 2) {
            class37_sub4_sub7_sub4_32_.method533();
        } else if (i_24_ == 3) {
            class37_sub4_sub7_sub4_32_.method519();
        }

        if (aShortArray2718 != null) {
            for (int i_33_ = 0; i_33_ < aShortArray2718.length; i_33_++)
                class37_sub4_sub7_sub4_32_.method535(aShortArray2718[i_33_],
                    aShortArray2715[i_33_]);
        }

        if (aShortArray2741 != null) {
            for (int i_34_ = 0; i_34_ < aShortArray2741.length; i_34_++)
                class37_sub4_sub7_sub4_32_.method525(aShortArray2741[i_34_],
                    aShortArray2711[i_34_]);
        }

        if (bool) {
            class37_sub4_sub7_sub4_32_.method534(scaleFactor_Y, scaleFactor_Z, scaleFactor_X);
        }

        if (bool_31_) {
            class37_sub4_sub7_sub4_32_.method520(anInt2713, anInt2738, anInt2749);
        }

        return class37_sub4_sub7_sub4_32_;
    }

    public void method690(int objectProperties, Stream stream) {
        if (objectProperties == 1) {
            int i_36_ = stream.readByte(121);

            if (i_36_ > 0) {
                if ((anIntArray2701 != null) && !Class79.aBoolean1469) {
                    stream.bufferLocation += (i_36_ * 3);
                } else {
                    anIntArray2701 = new int[i_36_];
                    anIntArray2732 = new int[i_36_];

                    for (int i_37_ = 0; (i_37_ ^ 0xffffffff) > (i_36_ ^ 0xffffffff); i_37_++) {
                        anIntArray2701[i_37_] = (stream.readShort(Class37_Sub4_Sub7_Sub1_Sub1.method502(19276, 19265)));
                        anIntArray2732[i_37_] = stream.readByte(120);
                    }
                }
            }
        } else if (objectProperties != 2) {
            if (objectProperties == 5) {
                int i_38_ = stream.readByte(117);
		
                if ((i_38_ ^ 0xffffffff) < -1) {
                    if ((anIntArray2701 != null) && !Class79.aBoolean1469) {
                        stream.bufferLocation += (i_38_ * 2);
                    } else {
                        anIntArray2732 = null;
                        anIntArray2701 = new int[i_38_];

                        for (int i_39_ = 0; i_39_ < i_38_; i_39_++)
                            anIntArray2701[i_39_] = stream.readShort(-123);
                    }
                }
            } else if (objectProperties != 14) {
                if (objectProperties == 15) {
                    tileDepth = stream.readByte(118);
                } else if (objectProperties != 17) {
                    if (objectProperties == 18) {
                        ProjectileBlocked = false;
                    } else if (objectProperties != 19) {
                        if (objectProperties == 21) {
                            anInt2698 = 0;
                        } else if (objectProperties == 22) {
                            aBoolean2737 = true;
                        } else if (objectProperties != 23) {
                            if (objectProperties != 24) {
                                if (objectProperties == 27) {
                                    anInt2740 = 1;
                                } else if (objectProperties == 28) {
                                    anInt2725 = stream.readByte(126);
                                } else if (objectProperties == 29) {
                                    anInt2717 = stream.readSignedByte((byte) 124);
                                } else if (objectProperties != 39) {
                                    if (((objectProperties ^ 0xffffffff) > -31) || (objectProperties >= 35)) {
                                        if (objectProperties != 40) {
                                            if (objectProperties != 41) {
                                                if (objectProperties == 60) {
                                                    anInt2699 = stream.readShort(-124);
                                                } else if (objectProperties == 62) {
                                                    aBoolean2750 = true;
                                                } else if (objectProperties == 64) {
                                                    aBoolean2694 = false;
                                                } else if (objectProperties != 65) {
                                                    if (objectProperties != 66) {
                                                        if (objectProperties == 67) {
                                                            scaleFactor_X = (stream.readShort(-127));
                                                        } else if (objectProperties != 68) {
                                                            if (objectProperties == 69) {
                                                                anInt2708 = (stream.readByte(19276 - 19150));
                                                            } else if (objectProperties == 70) {
                                                                anInt2713 = (stream.readSignedShort((byte) -38));
                                                            } else if (objectProperties != 71) {
                                                                if (objectProperties == 72) {
                                                                    anInt2749 = (stream.readSignedShort((byte) 110));
                                                                } else if (objectProperties == 73) {
                                                                    aBoolean2728 = true;
                                                                } else if (objectProperties != 74) {
                                                                    if (objectProperties == 75) {
                                                                        anInt2719 = stream.readByte(119);
                                                                    } else if (objectProperties != 77) {
                                                                        if (objectProperties == 78) {
                                                                            soundId = stream.readShort(19276 - 19401);
                                                                            soundRange = stream.readByte(119);
                                                                        } else if (objectProperties == 79) {
                                                                            anInt2727 = stream.readShort(88);
                                                                            anInt2692 = stream.readShort(19276 ^ ~0x4b53);
                                                                            soundRange = stream.readByte(126);

                                                                            int i_40_ = stream.readByte(19276 ^ 0x4b34);
                                                                            anIntArray2714 = new int[i_40_];

                                                                            for (int i_41_ = 0; (i_40_ ^ 0xffffffff) < (i_41_ ^ 0xffffffff); i_41_++)
                                                                                anIntArray2714[i_41_] = stream.readShort(-123);
                                                                        } else if (objectProperties == 81) {
                                                                            anInt2698 = 256 * stream.readByte(121);
                                                                        }
                                                                    } else {
                                                                        anInt2707 = stream.readShort(-121);

                                                                        if (anInt2707 == 65535) {
                                                                            anInt2707 = -1;
                                                                        }

                                                                        anInt2693 = stream.readShort(-124);

                                                                        if (anInt2693 == 65535) {
                                                                            anInt2693 = -1;
                                                                        }

                                                                        int i_42_ = stream.readByte(125);

                                                                        anIntArray2702 = new int[i_42_ + 1];

                                                                        for (int i_43_ = 0; (i_42_ ^ 0xffffffff) <= (i_43_ ^ 0xffffffff); i_43_++) {
                                                                            anIntArray2702[i_43_] = stream.readShort(9);

                                                                            if ((anIntArray2702[i_43_] ^
                                                                                    0xffffffff) == -65536) {
                                                                                anIntArray2702[i_43_] = -1;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    aBoolean2744 = true;
                                                                }
                                                            } else {
                                                                anInt2738 = (stream.readSignedShort((byte) -52));
                                                            }
                                                        } else {
                                                            anInt2706 = (stream.readShort(-124));
                                                        }
                                                    } else {
                                                        scaleFactor_Z = (stream.readShort(19276 +
                                                                -19305));
                                                    }
                                                } else {
                                                    scaleFactor_Y = stream.readShort(-127);
                                                }
                                            } else {
                                                int i_44_ = stream.readByte(119);

                                                aShortArray2711 = new short[i_44_];

                                                aShortArray2741 = new short[i_44_];

                                                for (int i_45_ = 0; ((i_44_ ^ 0xffffffff) < (i_45_ ^ 0xffffffff)); i_45_++) {
                                                    aShortArray2741[i_45_] = (short) (stream.readShort(-120));

                                                    aShortArray2711[i_45_] = (short) (stream.readShort(Class37_Sub4_Sub7_Sub1_Sub1.method502(
                                                                19276, -19276)));
                                                }
                                            }
                                        } else {
                                            int i_46_ = stream.readByte(117);
                                            aShortArray2715 = new short[i_46_];
                                            aShortArray2718 = new short[i_46_];

                                            for (int i_47_ = 0; ((i_47_ ^ 0xffffffff) > (i_46_ ^ 0xffffffff)); i_47_++) {
                                                aShortArray2718[i_47_] = (short) (stream.readShort(-125));
                                                aShortArray2715[i_47_] = (short) (stream.readShort(14));
                                            }
                                        }
                                    } else {
                                        contextMenu[objectProperties - 30] = stream.readString();

                                        if (contextMenu[objectProperties - 30].method159(Stream.aJString_2059,(byte) 113)) {
                                            contextMenu[objectProperties - 30] = null;
                                        }
                                    }
                                } else {
                                    anInt2739 = 5 * stream.readSignedByte((byte) 100);
                                }
                            } else {
                                animation = stream.readShort(-128);

                                if ((animation ^ 0xffffffff) == -65536) {
                                    animation = -1;
                                }
                            }
                        } else {
                            aBoolean2747 = true;
                        }
                    } else {
                        anInt2726 = stream.readByte(119);
                    }
                } else {
                    ProjectileBlocked = false;
                    anInt2740 = 0;
                }
            } else {
                tileWidth = stream.readByte(19276 - 19158);
            }
        } else {
            name = stream.readString();
        }
        totalObjectsLoaded++;
    }

    public void dump(BufferedWriter writer) throws Exception {
	String name_ = (new String(name.getString()));
	if (name_ != null) {
		writer.write("ObjectId " + id + " Name: " + name_);
		writer.newLine();
	} else {
		writer.write("ObjectId " + id + " Name: NULL");
		writer.newLine();
	}
	if (contextMenu == null) {
		writer.write("ContextMenu: NULL");
		writer.newLine();
	} else {
		for (int i = 0; i < contextMenu.length; ++i) {
			try {
				String context_ = (new String(contextMenu[i].getString()));
				writer.write("ContextMenu[" + i + "]: " + context_);
			} catch (Exception e) {
				writer.write("ContextMenu[" + i + "]: NULL");
			}
			writer.newLine();
		}
	}
	writer.write("ScaleX_Factor: " + scaleFactor_X);
	writer.newLine();
	writer.write("ScaleY_Factor: " + scaleFactor_Y);
	writer.newLine();
	writer.write("ScaleZ_Factor: " + scaleFactor_Z);
	writer.newLine();
	writer.write("tileWidth: " + tileWidth);
	writer.newLine();
	writer.write("tileDepth: " + tileDepth);
	writer.newLine();
	writer.write("soundId: " + soundId);
	writer.newLine();
	writer.write("soundRange: " + soundRange);
	writer.newLine();
	writer.write("animation: " + animation); 
	writer.newLine();
	writer.write("anInt2692: " + anInt2692);
	writer.newLine();
	writer.write("anInt2693: " + anInt2693);
	writer.newLine();
	writer.write("anInt2698: " + anInt2698);
	writer.newLine();
	writer.write("anInt2699: " + anInt2699);
	writer.newLine();
	writer.write("anInt2706: " + anInt2706);
	writer.newLine();
	writer.write("anInt2707: " + anInt2707);
	writer.newLine();
	writer.write("anInt2708: " + anInt2708);
	writer.newLine();
	writer.write("anInt2713: " + anInt2713); 
	writer.newLine();
	writer.write("anInt2717: " + anInt2717); 
	writer.newLine();
	writer.write("anInt2719: " + anInt2719); 
	writer.newLine();
	writer.write("anInt2725: " + anInt2725); 
	writer.newLine();
	writer.write("anInt2726: " + anInt2726); 
	writer.newLine();
	writer.write("anInt2727: " + anInt2727); 
	writer.newLine();
	writer.write("anInt2738: " + anInt2738); 
	writer.newLine();
	writer.write("anInt2739: " + anInt2739);
	writer.newLine(); 
	writer.write("anInt2740: " + anInt2740);
	writer.newLine();
	writer.write("anInt2749: " + anInt2749);
	writer.newLine();
	writer.write("aBoolean2694: " + aBoolean2694);
	writer.newLine();
	writer.write("ProjectileBlocked: " + ProjectileBlocked);
	writer.newLine();
	writer.write("aBoolean2728: " + aBoolean2728);
	writer.newLine();
	writer.write("aBoolean2737: " + aBoolean2737);
	writer.newLine();
	writer.write("aBoolean2744: " + aBoolean2744);
	writer.newLine();
	writer.write("aBoolean2747: " + aBoolean2747);
	writer.newLine();
	writer.write("aBoolean2750: " + aBoolean2750);
	writer.newLine();
	if (anIntArray2701 == null) {
		writer.write("anIntArray2701: NULL");
		writer.newLine();
	} else {
		for (int i = 0; i < anIntArray2701.length; ++i) {
			try {
				writer.write("anIntArray2701[" + i + "]: " + anIntArray2701[i]);
			} catch (Exception e) {
				writer.write("anIntArray2701[" + i + "]:  NULL");
			}
			writer.newLine();
		}
	}

	if (anIntArray2702 == null) {
		writer.write("anIntArray2702: NULL");
		writer.newLine();
	} else {
		for (int i = 0; i < anIntArray2702.length; ++i) {
			try {
				writer.write("anIntArray2702[" + i + "]: " + anIntArray2702[i]);
			} catch (Exception e) {
				writer.write("anIntArray2702[" + i + "]:  NULL");
			}
			writer.newLine();
		}
	}

	if (anIntArray2714 == null) {
		writer.write("anIntArray2714: NULL");
		writer.newLine();
	} else {
		for (int i = 0; i < anIntArray2714.length; ++i) {
			try {
				writer.write("anIntArray2714[" + i + "]: " + anIntArray2714[i]);
			} catch (Exception e) {
				writer.write("anIntArray2714[" + i + "]:  NULL");
			}
			writer.newLine();
		}
	}

	if (anIntArray2732 == null) {
		writer.write("anIntArray2732: NULL");
		writer.newLine();
	} else {
		for (int i = 0; i < anIntArray2732.length; ++i) {
			try {
				writer.write("anIntArray2732[" + i + "]: " + anIntArray2732[i]);
			} catch (Exception e) {
				writer.write("anIntArray2732[" + i + "]:  NULL");
			}
			writer.newLine();
		}
	}

	if (anIntArray2714 == null) {
		writer.write("anIntArray2714: NULL");
		writer.newLine();
	} else {
		for (int i = 0; i < anIntArray2714.length; ++i) {
			try {
				writer.write("anIntArray2714[" + i + "]: " + anIntArray2714[i]);
			} catch (Exception e) {
				writer.write("anIntArray2714[" + i + "]:  NULL");
			}
			writer.newLine();
		}
	}

	if (aShortArray2711 == null) {
		writer.write("aShortArray2711: NULL");
		writer.newLine();
	} else {
		for (int i = 0; i < aShortArray2711.length; ++i) {
			try {
				writer.write("aShortArray2711[" + i + "]: " + aShortArray2711[i]);
			} catch (Exception e) {
				writer.write("aShortArray2711[" + i + "]:  NULL");
			}
			writer.newLine();
		}
	}

	if (aShortArray2715 == null) {
		writer.write("aShortArray2715: NULL");
		writer.newLine();
	} else {
		for (int i = 0; i < aShortArray2715.length; ++i) {
			try {
				writer.write("aShortArray2715[" + i + "]: " + aShortArray2715[i]);
			} catch (Exception e) {
				writer.write("aShortArray2715[" + i + "]:  NULL");
			}
			writer.newLine();
		}
	}

	if (aShortArray2718 == null) {
		writer.write("aShortArray2718: NULL");
		writer.newLine();
	} else {
		for (int i = 0; i < aShortArray2718.length; ++i) {
			try {
				writer.write("aShortArray2718[" + i + "]: " + aShortArray2718[i]);
			} catch (Exception e) {
				writer.write("aShortArray2718[" + i + "]:  NULL");
			}
			writer.newLine();
		}
	}

	if (aShortArray2741 == null) {
		writer.write("aShortArray2741: NULL");
		writer.newLine();
	} else {
		for (int i = 0; i < aShortArray2741.length; ++i) {
			try {
				writer.write("aShortArray2741[" + i + "]: " + aShortArray2741[i]);
			} catch (Exception e) {
				writer.write("aShortArray2741[" + i + "]:  NULL");
			}
			writer.newLine();
		}
	}
	writer.write("------------------------------------------------------");
	writer.newLine();
    }

    public void dump() {
	System.out.print("ID: " + id + " NAME: " + new String((name.getString())) + " Array: [");
	if (anIntArray2732 == null) {
		System.out.println("]: NULL");
	} else {
		for (int i = 0; i < anIntArray2732.length; i++)
			System.out.print(", " + anIntArray2732[i]);
		System.out.println(" ].");
	}
    }

    public void method691(Stream stream) {
        
	for (;;) {
            int objectProperties = stream.readByte(118);

            if (objectProperties == 0) {
                break;
            }

            method690(objectProperties, stream);
        }
        anInt2720++;
    }

    public boolean method692(int i) {
        anInt2710++;

        if (anIntArray2701 == null) {
            return true;
        }

        boolean bool = true;
        int i_49_ = -59 % ((14 - i) / 53);

        for (int i_50_ = 0;
                (anIntArray2701.length ^ 0xffffffff) < (i_50_ ^ 0xffffffff);
                i_50_++)
            bool &= Class37_Sub9_Sub24.aClass15_3365.method115(-9350,
                anIntArray2701[i_50_] & 0xffff, 0);

        return bool;
    }
}
