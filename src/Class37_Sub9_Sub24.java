/* Class37_Sub9_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub9_Sub24 extends Class37_Sub9 {
    public static int anInt3361 = 0;
    public static int anInt3362;
    public static int anInt3363;
    public static Class15 aClass15_3364;
    public static Class15 aClass15_3365;
    public static int anInt3366;
    public static int anInt3368;
    public static JString aJString_3370;
    public static JString aJString_3371;
    public static int anInt3372;
    public static int anInt3373;
    public static JString aJString_3374 = Class37_Sub2.method332((byte) 125,
            "Location");
    public static int anInt3375;
    public static volatile boolean aBoolean3376;
    public static int anInt3377;

    static {
        aJString_3371 = aJString_3374;
        aJString_3370 = Class37_Sub2.method332((byte) 124, " (X");
        aBoolean3376 = false;
    }

    public int anInt3360 = 1;
    public int anInt3367;
    public int anInt3369 = 204;

    public Class37_Sub9_Sub24() {
        super(0, true);
        anInt3367 = 1;
    }

    public static void method867(boolean bool) {
        aClass15_3365 = null;
        aClass15_3364 = null;
        aJString_3370 = null;
        aJString_3374 = null;

        if (bool == false) {
            aJString_3371 = null;
        }
    }

    public static void method868(int i) {
        anInt3366++;

        int i_0_ = Class37_Sub4_Sub7_Sub2.aClass37_Sub4_Sub9_Sub2_Sub1_3724.method617(Class37_Sub9_Sub28.aJString_3439);

        if (i <= 68) {
            method870(-54, (byte) 2);
        }

        for (int i_1_ = 0;
                (i_1_ ^ 0xffffffff) > (Class37_Sub9_Sub13.anInt3134 ^
                0xffffffff); i_1_++) {
            int i_2_ = (Class37_Sub4_Sub7_Sub2.aClass37_Sub4_Sub9_Sub2_Sub1_3724.method617(Class37_Sub4_Sub7_Sub1_Sub2.method510(
                        i_1_, 80)));

            if (i_0_ < i_2_) {
                i_0_ = i_2_;
            }
        }

        i_0_ += 8;
        anInt3377 = i_0_;
        Class37_Sub20.aBoolean2220 = true;
        Class37_Sub5.anInt1878 = (15 * Class37_Sub9_Sub13.anInt3134) + 22;

        int i_3_ = (15 * Class37_Sub9_Sub13.anInt3134) - -21;
        int i_4_ = Class33.anInt764 + -(i_0_ / 2);
        int i_5_ = Class37_Sub13.anInt2113;

        if (((i_4_ + i_0_) ^ 0xffffffff) < -766) {
            i_4_ = 765 - i_0_;
        }

        if (i_4_ < 0) {
            i_4_ = 0;
        }

        if (((i_5_ + i_3_) ^ 0xffffffff) < -504) {
            i_5_ = 503 - i_3_;
        }

        if (i_5_ < 0) {
            i_5_ = 0;
        }

        Class37_Sub4_Sub13.anInt2794 = i_4_;
        Class15_Sub1.anInt1753 = i_5_;
    }

    public static boolean method869(int i, int i_6_) {
        if (i_6_ != 0) {
            aBoolean3376 = false;
        }

        anInt3368++;

        if ((0x1 & (i >> -734384001)) == 0) {
            return false;
        }

        return true;
    }

    public static JString method870(int i, byte i_7_) {
        anInt3362++;

        if (i_7_ != -114) {
            return null;
        }

        return Class32.method289(127, 10, i, false);
    }

    public static void method871(int i, boolean bool) {
        anInt3375++;

        if ((i != -1) && Class15_Sub1.aBooleanArray1754[i]) {
            Class37_Sub4_Sub14.aClass15_2805.method124(i, 99);

            if (Class37_Sub9_Sub29.aClass18ArrayArray3454[i] != null) {
                boolean bool_8_ = true;

                for (int i_9_ = 0;
                        ((Class37_Sub9_Sub29.aClass18ArrayArray3454[i].length ^
                        0xffffffff) < (i_9_ ^ 0xffffffff)); i_9_++) {
                    if (Class37_Sub9_Sub29.aClass18ArrayArray3454[i][i_9_] != null) {
                        if (((Class37_Sub9_Sub29.aClass18ArrayArray3454[i][i_9_].anInt354) ^
                                0xffffffff) != -3) {
                            Class37_Sub9_Sub29.aClass18ArrayArray3454[i][i_9_] = null;
                        } else {
                            bool_8_ = false;
                        }
                    }
                }

                if (bool_8_) {
                    Class37_Sub9_Sub29.aClass18ArrayArray3454[i] = null;
                }

                Class15_Sub1.aBooleanArray1754[i] = bool;
            }
        }
    }

    public void method750(Stream stream, int i, boolean bool) {
        if (bool == true) {
            int i_10_ = i;
while_90_: 
            do {
                do {
                    if (i_10_ != 0) {
                        if ((i_10_ ^ 0xffffffff) != -2) {
                            if (i_10_ == 2) {
                                break;
                            }

                            break while_90_;
                        }
                    } else {
                        anInt3367 = stream.readByte(126);

                        break while_90_;
                    }

                    anInt3360 = stream.readByte(126);

                    break while_90_;
                } while (false);

                anInt3369 = stream.readShort(-119);
            } while (false);

            anInt3373++;
        }
    }

    public int[] method761(int i, int i_11_) {
        if (i >= -125) {
            anInt3367 = 105;
        }

        int[] is = aClass38_1966.method1049(i_11_, true);

        if (aClass38_1966.aBoolean850) {
            int i_12_ = 0;

            for (; (i_12_ ^ 0xffffffff) > (Class32.anInt743 ^ 0xffffffff);
                    i_12_++) {
                int i_13_ = Class37_Sub4_Sub16.anIntArray2871[i_11_];
                int i_14_ = Class84.anIntArray1528[i_12_];
                int i_15_ = (i_13_ * anInt3360) >> 1514864364;
                int i_16_ = i_14_ % (4096 / anInt3367) * anInt3367;
                int i_17_ = (anInt3367 * i_14_) >> 1023399980;
                int i_18_ = i_13_ % (4096 / anInt3360) * anInt3360;

                if (i_18_ < anInt3369) {
                    for (i_17_ -= i_15_; i_17_ < 0; i_17_ += 4) {
                        /* empty */
                    }

                    for (; i_17_ > 3; i_17_ -= 4) {
                        /* empty */
                    }

                    if ((i_17_ ^ 0xffffffff) != -2) {
                        is[i_12_] = 0;

                        continue;
                    }

                    if (anInt3369 > i_16_) {
                        is[i_12_] = 0;

                        continue;
                    }
                }

                if ((anInt3369 ^ 0xffffffff) < (i_16_ ^ 0xffffffff)) {
                    for (i_17_ -= i_15_; (i_17_ ^ 0xffffffff) > -1;
                            i_17_ += 4) {
                        /* empty */
                    }

                    for (; (i_17_ ^ 0xffffffff) < -4; i_17_ -= 4) {
                        /* empty */
                    }

                    if (i_17_ > 0) {
                        is[i_12_] = 0;

                        continue;
                    }
                }

                is[i_12_] = 4096;
            }
        }

        anInt3363++;

        return is;
    }
}
