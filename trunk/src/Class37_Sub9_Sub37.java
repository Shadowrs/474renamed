/* Class37_Sub9_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.Font;


public class Class37_Sub9_Sub37 extends Class37_Sub9 {
    public static JString aJString_3588;
    public static int anInt3589;
    public static int anInt3590;
    public static boolean aBoolean3591 = false;
    public static JString aJString_3592;
    public static JString[] aJStringArray3593;
    public static int anInt3595;
    public static JString aJString_3596 = Class37_Sub2.method332((byte) 126,
            "flash1:");
    public static int anInt3597;
    public static int anInt3600;
    public static int anInt3601;
    public static int anInt3602;
    public static int anInt3603;
    public static int anInt3605;
    public static Font aFont3606;
    public static int anInt3607;
    public static JString aJString_3608;

    static {
        aJStringArray3593 = new JString[500];
        anInt3589 = 0;
        aJString_3592 = aJString_3596;
        anInt3590 = 0;
        anInt3602 = 0;
        aJString_3588 = aJString_3596;
        anInt3597 = 0;
        aJString_3608 = Class37_Sub2.method332((byte) 126, "VOLL");
    }

    public int anInt3594 = -1;
    public int anInt3598;
    public int anInt3599;
    public int[] anIntArray3604;

    public Class37_Sub9_Sub37() {
        super(0, false);
    }

    public static void method921(int i) {
        aJString_3596 = null;
        aJString_3608 = null;

        if (i >= -91) {
            aJString_3596 = null;
        }

        aJString_3592 = null;
        aJString_3588 = null;
        aJStringArray3593 = null;
        aFont3606 = null;
    }

    public int method758(int i) {
        if (i != -30563) {
            return -78;
        }

        anInt3605++;

        return anInt3594;
    }

    public boolean method922(int i) {
        anInt3607++;

        if (anIntArray3604 != null) {
            return true;
        }

        if (i <= 50) {
            return false;
        }

        if ((anInt3594 ^ 0xffffffff) <= -1) {
            int i_0_ = ((!PacketParser.anInterface3_3265.method8(-113,
                    anInt3594)) ? 128 : 64);

            anIntArray3604 = PacketParser.anInterface3_3265.method7((byte) -106,
                    anInt3594);
            anInt3598 = i_0_;
            anInt3599 = i_0_;

            if (anIntArray3604 == null) {
                return false;
            }

            return true;
        }

        return false;
    }

    public static void method923(int i, Class18[] class18s, int i_1_) {
        if (i != -7251) {
            anInt3597 = -71;
        }

        for (int i_2_ = 0; class18s.length > i_2_; i_2_++) {
            Class18 class18 = class18s[i_2_];

            if (class18 != null) {
                if ((class18.anInt354 ^ 0xffffffff) == -1) {
                    if (class18.aClass18Array450 != null) {
                        method923(-7251, class18.aClass18Array450, i_1_);
                    }

                    Class37_Sub6 class37_sub6 = ((Class37_Sub6) Class76.aClass13_1423.method100((byte) 67,
                            (long) class18.anInt402));

                    if (class37_sub6 != null) {
                        Class26.method259(class37_sub6.anInt1884, i_1_,
                            i ^ 0x1c2f);
                    }
                }

                if ((i_1_ == 0) && (class18.anObjectArray333 != null)) {
                    Class37_Sub8 class37_sub8 = new Class37_Sub8();
                    class37_sub8.aClass18_1925 = class18;
                    class37_sub8.anObjectArray1938 = class18.anObjectArray333;
                    Class43.method1092(class37_sub8, (byte) 112);
                }

                if (((i_1_ ^ 0xffffffff) == -2) &&
                        (class18.anObjectArray407 != null)) {
                    if ((class18.anInt334 ^ 0xffffffff) <= -1) {
                        Class18 class18_3_ = Class37_Sub9_Sub14.method820(class18.anInt402,
                                4096);

                        if ((class18_3_ == null) ||
                                (class18_3_.aClass18Array450 == null) ||
                                ((class18_3_.aClass18Array450.length ^
                                0xffffffff) >= (class18.anInt334 ^ 0xffffffff)) ||
                                (class18_3_.aClass18Array450[class18.anInt334] != class18)) {
                            continue;
                        }
                    }

                    Class37_Sub8 class37_sub8 = new Class37_Sub8();
                    class37_sub8.anObjectArray1938 = class18.anObjectArray407;
                    class37_sub8.aClass18_1925 = class18;
                    Class43.method1092(class37_sub8, (byte) 121);
                }
            }
        }

        anInt3603++;
    }

    public static JString method924(Class18 class18, byte i) {
        anInt3595++;

        if ((Class10.method85(RuntimeException_Sub1.method1339(class18, 25),
                    false) ^ 0xffffffff) == -1) {
            return null;
        }

        if ((class18.aJString_360 == null) ||
                ((class18.aJString_360.trim((byte) -99).length((byte) 38) ^
                0xffffffff) == -1)) {
            if (Class37_Sub3_Sub1.aBoolean2328) {
                return Class37_Sub9_Sub11.aJString_3095;
            }

            return null;
        }

        int i_4_ = 0 % ((i - 15) / 41);

        return class18.aJString_360;
    }

    public void method750(Stream stream, int i, boolean bool) {
        anInt3600++;

        if (bool == true) {
            if (i == 0) {
                anInt3594 = stream.readShort();
            }
        }
    }

    public int[][] method759(byte i, int i_5_) {
        anInt3601++;

        int[][] is = aClass33_1946.method298(false, i_5_);

        if (aClass33_1946.aBoolean767 && method922(118)) {
            int i_6_ = (((Class37_Sub14.anInt2121 == anInt3598) ? i_5_
                                                                : ((i_5_ * anInt3598) / Class37_Sub14.anInt2121)) * anInt3599);
            int[] is_7_ = is[0];
            int[] is_8_ = is[2];
            int[] is_9_ = is[1];

            if (anInt3599 == AbstractDrawingArea.anInt743) {
                for (int i_10_ = 0; AbstractDrawingArea.anInt743 > i_10_; i_10_++) {
                    int i_11_ = anIntArray3604[i_6_++];
                    is_8_[i_10_] = (Class37_Sub4_Sub7.method490(255, i_11_) << -858600444);
                    is_9_[i_10_] = (Class37_Sub4_Sub7.method490(65280, i_11_) >> 1892842148);

                    is_7_[i_10_] = Class37_Sub4_Sub7.method490(i_11_ >> -284068532,
                            4080);
                }
            } else {
                for (int i_12_ = 0; AbstractDrawingArea.anInt743 > i_12_; i_12_++) {
                    int i_13_ = (anInt3599 * i_12_) / AbstractDrawingArea.anInt743;
                    int i_14_ = anIntArray3604[i_13_ + i_6_];
                    is_8_[i_12_] = (Class37_Sub4_Sub7.method490(255, i_14_) << 1548203268);

                    is_9_[i_12_] = Class37_Sub4_Sub7.method490(4080,
                            i_14_ >> -2119705340);

                    is_7_[i_12_] = Class37_Sub4_Sub7.method490(i_14_ >> 844129676,
                            4080);
                }
            }
        }

        if (i < 111) {
            aJString_3596 = null;
        }

        return is;
    }
}
