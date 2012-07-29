/* Class37_Sub9_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.Component;

import java.lang.reflect.Method;


public class Class37_Sub9_Sub32 extends Class37_Sub9 {
    public static int anInt3497;
    public static int anInt3498;
    public static int anInt3499;
    public static int anInt3500;
    public static int anInt3501;
    public static int anInt3502;
    public static Class65 aClass65_3503 = new Class65(50);
    public static JString aJString_3504;
    public static Class11[] aClass11Array3505;
    public static JString aJString_3506;
    public static JString aJString_3507 = Class37_Sub2.method332((byte) 103,
            "Fehler bei der Verbindung zum Server)3");
    public static JString aJString_3508;
    public static int anInt3509 = 0;

    static {
        aJString_3508 = Class37_Sub2.method332((byte) 126, "sl_flags");

        aJString_3504 = Class37_Sub2.method332((byte) 121, "Loaded title screen");
        aClass11Array3505 = new Class11[50];
        aJString_3506 = aJString_3504;
    }

    public Class37_Sub9_Sub32() {
        super(1, false);
    }

    public int[][] method759(byte i, int i_0_) {
        anInt3500++;

        int[][] is = aClass33_1946.method298(false, i_0_);
        int[] is_1_ = is[1];
        int[] is_2_ = is[0];

        if (i < 111) {
            return null;
        }

        int[] is_3_ = is[2];

        if (aClass33_1946.aBoolean767) {
            for (int i_4_ = 0; Class32.anInt743 > i_4_; i_4_++) {
                method900(-111, i_4_, i_0_);

                int[][] is_5_ = this.method762(0, Class37_Sub9_Sub9.anInt3072,
                        (byte) -95);
                is_2_[i_4_] = is_5_[0][Class37_Sub6.anInt1880];
                is_1_[i_4_] = is_5_[1][Class37_Sub6.anInt1880];
                is_3_[i_4_] = is_5_[2][Class37_Sub6.anInt1880];
            }
        }

        return is;
    }

    public static void method897(int i) {
        aJString_3508 = null;
        aJString_3504 = null;
        aJString_3506 = null;

        if (i == 50) {
            aClass11Array3505 = null;
            aClass65_3503 = null;
            aJString_3507 = null;
        }
    }

    public static void method898(int i, Component component) {
        if (i != 0) {
            method898(-47, null);
        }

        anInt3502++;

        Method method = Signlink.aMethod1035;

        if (method != null) {
            try {
                method.invoke(component, new Object[] { Boolean.FALSE });
            } catch (Throwable throwable) {
                /* empty */
            }
        }

        component.addKeyListener(Class37_Sub9_Sub13.aClass21_3126);
        component.addFocusListener(Class37_Sub9_Sub13.aClass21_3126);
    }

    public static void method899(byte i) {
        Class37_Sub9_Sub1.anIntArrayArrayArray2924 = null;
        Class81.anIntArray1510 = null;
        Class37_Sub9_Sub12.anIntArray3113 = null;
        Class52_Sub1.aByteArrayArrayArray2306 = null;
        Class15.aByteArrayArrayArray283 = null;
        anInt3499++;
        Class55.anIntArray1064 = null;
        Class84.aByteArrayArrayArray1526 = null;
        Class68.anIntArrayArray1329 = null;
        Class37_Sub4_Sub17.anIntArray2872 = null;
        Class10.anIntArray196 = null;
        Class37_Sub3_Sub3.aByteArrayArrayArray2391 = null;
        Class37_Sub9_Sub26.aByteArrayArrayArray3391 = null;

        int i_6_ = -8 / ((i - 48) / 46);
    }

    public void method900(int i, int i_7_, int i_8_) {
        int i_9_ = Class84.anIntArray1528[i_7_];
        int i_10_ = 72 % ((i - -52) / 45);
        anInt3501++;

        int i_11_ = Class37_Sub4_Sub16.anIntArray2871[i_8_];
        float f = (float) Math.atan2((double) (-2048 + i_9_),
                (double) (i_11_ + -2048));

        if (((double) f >= -3.141592653589793) &&
                ((double) f <= -2.356194490192345)) {
            Class37_Sub9_Sub9.anInt3072 = i_8_;
            Class37_Sub6.anInt1880 = i_7_;
        } else if (!((double) f <= -1.5707963267948966) ||
                !((double) f >= -2.356194490192345)) {
            if (!((double) f <= -0.7853981633974483) ||
                    !((double) f >= -1.5707963267948966)) {
                if (!(f <= 0.0F) || !((double) f >= -0.7853981633974483)) {
                    if (!(f >= 0.0F) || !((double) f <= 0.7853981633974483)) {
                        if (!((double) f >= 0.7853981633974483) ||
                                !((double) f <= 1.5707963267948966)) {
                            if (!((double) f >= 1.5707963267948966) ||
                                    !((double) f <= 2.356194490192345)) {
                                if (((double) f >= 2.356194490192345) &&
                                        ((double) f <= 3.141592653589793)) {
                                    Class37_Sub6.anInt1880 = -i_7_ +
                                        Class32.anInt743;
                                    Class37_Sub9_Sub9.anInt3072 = i_8_;
                                }
                            } else {
                                Class37_Sub6.anInt1880 = i_8_;

                                Class37_Sub9_Sub9.anInt3072 = -i_7_ +
                                    Class37_Sub14.anInt2121;
                            }
                        } else {
                            Class37_Sub6.anInt1880 = Class32.anInt743 + -i_8_;

                            Class37_Sub9_Sub9.anInt3072 = -i_7_ +
                                Class37_Sub14.anInt2121;
                        }
                    } else {
                        Class37_Sub6.anInt1880 = -i_7_ + Class32.anInt743;

                        Class37_Sub9_Sub9.anInt3072 = -i_8_ +
                            Class37_Sub14.anInt2121;
                    }
                } else {
                    Class37_Sub9_Sub9.anInt3072 = -i_8_ +
                        Class37_Sub14.anInt2121;
                    Class37_Sub6.anInt1880 = i_7_;
                }
            } else {
                Class37_Sub6.anInt1880 = -i_8_ + Class32.anInt743;
                Class37_Sub9_Sub9.anInt3072 = i_7_;
            }
        } else {
            Class37_Sub9_Sub9.anInt3072 = i_7_;
            Class37_Sub6.anInt1880 = i_8_;
        }

        Class37_Sub9_Sub9.anInt3072 &= Class37_Sub4_Sub7_Sub1_Sub2.anInt3989;
        Class37_Sub6.anInt1880 &= Applet_Sub1.anInt12;
    }

    public int[] method761(int i, int i_12_) {
        anInt3498++;

        if (i >= -125) {
            aClass11Array3505 = null;
        }

        int[] is = aClass38_1966.method1049(i_12_, true);

        if (aClass38_1966.aBoolean850) {
            for (int i_13_ = 0;
                    (Class32.anInt743 ^ 0xffffffff) < (i_13_ ^ 0xffffffff);
                    i_13_++) {
                method900(56, i_13_, i_12_);

                int[] is_14_ = this.method760(Class37_Sub9_Sub9.anInt3072, 0,
                        -108);
                is[i_13_] = is_14_[Class37_Sub6.anInt1880];
            }
        }

        return is;
    }

    public void method750(Stream stream, int i, boolean bool) {
        if (i == 0) {
            aBoolean1943 = stream.readByte(116) == 1;
        }

        anInt3497++;

        if (bool != true) {
            aJString_3507 = null;
        }
    }
}
