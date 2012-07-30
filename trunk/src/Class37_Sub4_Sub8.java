/* Class37_Sub4_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub4_Sub8 extends Class37_Sub4 {
    public static int anInt2642;
    public static Class62[] aClass62Array2643 = new Class62[6];
    public static int anInt2644;
    public static int anInt2646;
    public static int anInt2647;
    public static int anInt2648;
    public static int anInt2653;
    public static int anInt2655;
    public static JString aJString_2657 = Class37_Sub2.method332((byte) 115,
            "Fallen lassen");

    static {
        anInt2642 = 0;
    }

    public int anInt2645 = -1;
    public int anInt2649 = 0;
    public int anInt2650;
    public int anInt2651;
    public int anInt2652;
    public int anInt2654;
    public int anInt2656 = -1;
    public boolean aBoolean2658 = true;
    public int anInt2659;
    public int anInt2660;

    public void method571(int i) {
        if ((anInt2656 ^ 0xffffffff) != i) {
            method572(false, anInt2656);
            anInt2654 = anInt2660;
            anInt2650 = anInt2652;
            anInt2659 = anInt2651;
        }

        anInt2648++;
        method572(false, anInt2649);
    }

    public void method572(boolean bool, int i) {
        anInt2655++;

        double d = (double) (0xff & i) / 256.0;
        double d_0_ = (double) ((0xff05 & i) >> -1449796024) / 256.0;

        if (bool == false) {
            double d_1_ = 0.0;
            double d_2_ = 0.0;
            double d_3_ = (double) ((i >> -1528034032) & 0xff) / 256.0;
            double d_4_ = d_3_;

            if (d_4_ > d_0_) {
                d_4_ = d_0_;
            }

            double d_5_ = d_3_;

            if (d_0_ > d_5_) {
                d_5_ = d_0_;
            }

            if (d > d_5_) {
                d_5_ = d;
            }

            if (d_4_ > d) {
                d_4_ = d;
            }

            double d_6_ = (d_4_ + d_5_) / 2.0;
            anInt2652 = (int) (d_6_ * 256.0);

            if (anInt2652 >= 0) {
                if (anInt2652 > 255) {
                    anInt2652 = 255;
                }
            } else {
                anInt2652 = 0;
            }

            if (d_5_ != d_4_) {
                if (d_6_ < 0.5) {
                    d_2_ = (-d_4_ + d_5_) / (d_5_ + d_4_);
                }

                if (d_5_ != d_3_) {
                    if (d_0_ != d_5_) {
                        if (d == d_5_) {
                            d_1_ = 4.0 + ((-d_0_ + d_3_) / (d_5_ - d_4_));
                        }
                    } else {
                        d_1_ = ((-d_3_ + d) / (-d_4_ + d_5_)) + 2.0;
                    }
                } else {
                    d_1_ = (-d + d_0_) / (-d_4_ + d_5_);
                }

                if (d_6_ >= 0.5) {
                    d_2_ = (d_5_ - d_4_) / ((-d_5_ + 2.0) - d_4_);
                }
            }

            anInt2651 = (int) (d_2_ * 256.0);
            d_1_ /= 6.0;
            anInt2660 = (int) (d_1_ * 256.0);

            if (anInt2651 >= 0) {
                if ((anInt2651 ^ 0xffffffff) < -256) {
                    anInt2651 = 255;
                }
            } else {
                anInt2651 = 0;
            }
        }
    }

    public void method573(int i, int i_7_, int i_8_, Stream stream) {
        anInt2653++;

        if (i_8_ != 1) {
            if ((i_8_ ^ 0xffffffff) == -3) {
                anInt2645 = stream.readByte(119);
            } else if (i_8_ != 3) {
                if ((i_8_ ^ 0xffffffff) != -6) {
                    if (i_8_ == 7) {
                        anInt2656 = stream.read3Bytes(-26256544);
                    }
                } else {
                    aBoolean2658 = false;
                }
            } else {
                anInt2645 = stream.readShort();

                if ((anInt2645 ^ 0xffffffff) == -65536) {
                    anInt2645 = -1;
                }
            }
        } else {
            anInt2649 = stream.read3Bytes(-26256544);
        }

        int i_9_ = 49 % ((i - 44) / 43);
    }

    public static void method574(int i, boolean bool, int i_10_) {
        anInt2647++;

        if (((Class37_Sub9_Sub17.anInt3223 ^ 0xffffffff) != -1) &&
                ((i_10_ ^ 0xffffffff) != 0)) {
            JS5.method120(Class37_Sub9_Sub17.anInt3223, 0, false, -15793,
                Class36.aClass15_Sub1_796, i_10_);
            Class55.aBoolean1071 = true;
        }

        if (bool != true) {
            anInt2642 = 25;
        }
    }

    public void method575(int i, Stream stream, int i_11_) {
        int i_12_ = -91 / ((-72 - i) / 32);
        anInt2644++;

        for (;;) {
            int i_13_ = stream.readByte(116);

            if (i_13_ == 0) {
                break;
            }

            method573(-57, i_11_, i_13_, stream);
        }
    }

    public static void method576(int i) {
        aJString_2657 = null;

        int i_14_ = 116 % (-i / 36);
        aClass62Array2643 = null;
    }
}
