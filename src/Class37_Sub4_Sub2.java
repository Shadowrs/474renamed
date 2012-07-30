/* Class37_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub4_Sub2 extends Class37_Sub4 {
    public static int anInt2518;
    public static long aLong2521 = 0L;
    public static int anInt2522;
    public static JString aJString_2526 = Class37_Sub2.method332((byte) 116,
            "This world is running a closed Beta)3");
    public static long[] aLongArray2528 = new long[32];
    public static int anInt2529;
    public static int anInt2530;
    public static int anInt2532;
    public static int[] anIntArray2534;
    public static JString aJString_2537 = Class37_Sub2.method332((byte) 125,
            "<col=ff9040>");
    public static int anInt2538;
    public static JString aJString_2539 = aJString_2526;
    public int anInt2519;
    public int anInt2520;
    public int anInt2523;
    public int anInt2524;
    public boolean aBoolean2525 = false;
    public Class17 aClass17_2527;
    public int anInt2531;
    public int[] anIntArray2533;
    public int anInt2535;
    public boolean aBoolean2536;
    public boolean aBoolean2540;
    public float aFloat2541;

    public Class37_Sub4_Sub2(Stream stream) {
        aClass17_2527 = new Class17(stream);

        int i = stream.readByte(127);
        aBoolean2540 = ((0x2 & i) ^ 0xffffffff) != -1;
        aBoolean2536 = (0x1 & i) != 0;
        anInt2531 = stream.readByte(124);
        anInt2519 = stream.readShort();
        anInt2523 = stream.readByte(121);

        if (anInt2523 == 255) {
            anInt2523 = 256;
        }

        int i_23_ = stream.readByte(126);
        int i_24_ = stream.readByte(125);
        anInt2520 = (i_23_ >> -118381690) & 0x3;
        anInt2535 = 0x3 & (i_24_ >> 1604718438);
        anInt2524 = (0x3f & i_24_) - 6;
        stream.readByte(121);
        stream.readByte(126);
    }

    public Class37_Sub4_Sub2() {
        aClass17_2527 = new Class17();
        aBoolean2536 = true;
        anInt2531 = 1;
    }

    public boolean method455(JS5 class15, Interface3 interface3,
        boolean bool) {
        try {
            anInt2538++;

            if (bool != true) {
                method455(null, null, false);
            }

            return aClass17_2527.method186(interface3, class15, (byte) -83);
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("ac.F(" + ((class15 != null) ? "{...}" : "null") + ',' +
                ((interface3 != null) ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    public static Class37_Sub4_Sub9_Sub3[] method456(int i, int i_0_,
        JS5 class15, byte i_1_) {
        anInt2530++;

        if (i_1_ <= 44) {
            aLong2521 = 0L;
        }

        if (!Class37_Sub12.method1001(i, class15, (byte) 124, i_0_)) {
            return null;
        }

        return Class37_Sub4_Sub7.method492(124);
    }

    public int[] method457(int i, Interface3 interface3, JS5 class15,
        int i_2_) {
        try {
            anInt2518++;

            if (!aClass17_2527.method186(interface3, class15, (byte) -89)) {
                return null;
            }

            int i_3_ = -98 % ((-44 - i) / 60);
            int i_4_ = (((anInt2531 ^ 0xffffffff) >= (i_2_ ^ 0xffffffff))
                ? anInt2531 : i_2_);

            return aClass17_2527.method183(i_4_, 1.0F, i_4_, false, class15,
                true, interface3);
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("ac.B(" + i + ',' + ((interface3 != null) ? "{...}" : "null") +
                ',' + ((class15 != null) ? "{...}" : "null") + ',' + i_2_ +
                ')'));
        }
    }

    public void method458(int i, int i_5_) {
        anInt2532++;

        if (anIntArray2533 != null) {
            if (i_5_ != 64) {
                method457(-3, null, null, 107);
            }

            if ((anInt2535 ^ 0xffffffff) != -1) {
                if ((anIntArray2534 == null) ||
                        (anIntArray2534.length < anIntArray2533.length)) {
                    anIntArray2534 = new int[anIntArray2533.length];
                }

                int i_6_;

                if (anIntArray2533.length != 4096) {
                    i_6_ = 128;
                } else {
                    i_6_ = 64;
                }

                int i_7_ = i_6_ * (i * anInt2524);

                if (anInt2535 == 2) {
                    i_7_ = -i_7_;
                }

                int i_8_ = anIntArray2533.length;
                int i_9_ = -1 + i_8_;

                for (int i_10_ = 0; i_10_ < i_8_; i_10_++) {
                    int i_11_ = (i_10_ - -i_7_) & i_9_;
                    anIntArray2534[i_10_] = anIntArray2533[i_11_];
                }

                int[] is = anIntArray2533;
                anIntArray2533 = anIntArray2534;
                anIntArray2534 = is;
            }

            if (anInt2520 != 0) {
                if ((anIntArray2534 == null) ||
                        (anIntArray2534.length < anIntArray2533.length)) {
                    anIntArray2534 = new int[anIntArray2533.length];
                }

                int i_12_ = anIntArray2533.length;
                int i_13_;

                if ((anIntArray2533.length ^ 0xffffffff) != -4097) {
                    i_13_ = 128;
                } else {
                    i_13_ = 64;
                }

                int i_14_ = anInt2524 * i;

                if (anInt2520 == 1) {
                    i_14_ = -i_14_;
                }

                int i_15_ = i_13_ + -1;

                for (int i_16_ = 0;
                        (i_12_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff);
                        i_16_ += i_13_) {
                    for (int i_17_ = 0;
                            (i_13_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff);
                            i_17_++) {
                        int i_18_ = i_16_ - -i_17_;
                        int i_19_ = ((i_17_ + i_14_) & i_15_) + i_16_;
                        anIntArray2534[i_18_] = anIntArray2533[i_19_];
                    }
                }

                int[] is = anIntArray2533;
                anIntArray2533 = anIntArray2534;
                anIntArray2534 = is;
            }
        }
    }

    public int[] method459(int i, float f, Interface3 interface3,
        JS5 class15, int i_20_) {
        try {
            anInt2529++;

            if ((anIntArray2533 == null) || (aFloat2541 != f)) {
                if (!aClass17_2527.method186(interface3, class15, (byte) -90)) {
                    return null;
                }

                int i_21_ = (anInt2531 <= i_20_) ? anInt2531 : i_20_;

                anIntArray2533 = aClass17_2527.method183(i_21_, f, i_21_, true,
                        class15, true, interface3);
                aFloat2541 = f;
            }

            if (i != -10538) {
                anInt2524 = -52;
            }

            return anIntArray2533;
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("ac.A(" + i + ',' + f + ',' +
                ((interface3 != null) ? "{...}" : "null") + ',' +
                ((class15 != null) ? "{...}" : "null") + ',' + i_20_ + ')'));
        }
    }

    public static void method460(int i) {
        aLongArray2528 = null;
        aJString_2537 = null;

        int i_22_ = -22 / ((-45 - i) / 32);
        aJString_2526 = null;
        aJString_2539 = null;
        anIntArray2534 = null;
    }
}
