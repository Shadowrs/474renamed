/* Class37_Sub9_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub9_Sub11 extends Class37_Sub9 {
    public static int anInt3094;
    public static JString aJString_3095;
    public static int anInt3096;
    public static int anInt3097;
    public static int anInt3098 = 0;
    public static Class15 aClass15_3099;
    public static JString aJString_3100;
    public static int anInt3102;
    public static JString aJString_3103;
    public static int anInt3104;
    public static int anInt3105;
    public static int anInt3106;
    public static JString aJString_3107;
    public static int anInt3109;

    static {
        aJString_3095 = Class37_Sub2.method332((byte) 113, "Hidden)2use");
        aJString_3100 = Class37_Sub2.method332((byte) 112, "Select a world");
        aJString_3103 = aJString_3100;
        aJString_3107 = Class37_Sub2.method332((byte) 114, "<br>");
    }

    public int anInt3093;
    public int anInt3101 = 1;
    public int anInt3108;

    public Class37_Sub9_Sub11() {
        super(0, true);
        anInt3093 = 0;
        anInt3108 = 0;
    }

    public int[] method761(int i, int i_0_) {
        anInt3102++;

        int[] is = aClass38_1966.method1049(i_0_, true);

        if (aClass38_1966.aBoolean850) {
            int i_1_ = Class37_Sub4_Sub16.anIntArray2871[i_0_];
            int i_2_ = (-2048 + i_1_) >> 1985766177;

            for (int i_3_ = 0; i_3_ < Class32.anInt743; i_3_++) {
                int i_4_ = Class84.anIntArray1528[i_3_];
                int i_5_ = (i_4_ - 2048) >> -1177950015;
                int i_6_;

                if (anInt3093 != 0) {
                    int i_7_ = ((i_5_ * i_5_) - -(i_2_ * i_2_)) >> 967017068;
                    i_6_ = (int) (Math.sqrt((double) (i_7_ / 4096)) * 4096.0);
                    i_6_ = (int) ((double) (i_6_ * anInt3101) * 3.141592653589793);
                } else {
                    i_6_ = anInt3101 * (-i_1_ + i_4_);
                }

                i_6_ -= (~0xfff & i_6_);

                if (anInt3108 != 0) {
                    if ((anInt3108 ^ 0xffffffff) == -3) {
                        i_6_ -= 2048;

                        if (i_6_ < 0) {
                            i_6_ = -i_6_;
                        }

                        i_6_ = (-i_6_ + 2048) << -2077672447;
                    }
                } else {
                    i_6_ = ((4096 +
                        (Class13.anIntArray226[(i_6_ & 0xff3) >> -1657309756])) >> 609794433);
                }

                is[i_3_] = i_6_;
            }
        }

        if (i >= -125) {
            method806(false);
        }

        return is;
    }

    public static void method806(boolean bool) {
        Class37_Sub9_Sub28.anIntArray3434 = null;

        if (bool == true) {
            Class10.aByteArrayArray198 = null;
            Class62.anIntArray1180 = null;
            Class37_Sub9_Sub23.anIntArray3357 = null;
            Class14.anIntArray250 = null;
            Class37_Sub9_Sub1.anIntArray2919 = null;
            anInt3104++;
        }
    }

    public static boolean method807(byte i) {
        anInt3109++;

        if (i != 22) {
            return false;
        }

        try {
            if ((Class37_Sub7.anInt1904 ^ 0xffffffff) == -3) {
                if (ObjectDef.aClass37_Sub19_2735 == null) {
                    ObjectDef.aClass37_Sub19_2735 = Class37_Sub19.method1019(Class84.aClass15_1534,
                            Class3.anInt89, (Class37_Sub4_Sub7.anInt2639));

                    if (ObjectDef.aClass37_Sub19_2735 == null) {
                        return false;
                    }
                }

                if (RSSocket.aClass73_489 == null) {
                    RSSocket.aClass73_489 = new Class73(Class37_Sub4_Sub15.aClass15_2835,
                            Class37_Sub17.aClass15_2160);
                }

                if (Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method386(
                            RSSocket.aClass73_489,
                            ObjectDef.aClass37_Sub19_2735,
                            PacketParser.aClass15_3263, true, 22050)) {
                    Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method385(114);
                    Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method384(Class37_Sub13.anInt2118,
                        (byte) 115);
                    Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method369(ObjectDef.aClass37_Sub19_2735,
                        (byte) 101, Class37_Sub9_Sub12.aBoolean3117);
                    Class84.aClass15_1534 = null;
                    ObjectDef.aClass37_Sub19_2735 = null;
                    Class37_Sub7.anInt1904 = 0;
                    RSSocket.aClass73_489 = null;

                    return true;
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method363(127);
            Class37_Sub7.anInt1904 = 0;
            RSSocket.aClass73_489 = null;
            ObjectDef.aClass37_Sub19_2735 = null;
            Class84.aClass15_1534 = null;
        }

        return false;
    }

    public static void method808(boolean bool, int i, int i_8_) {
        Class37_Sub4_Sub7_Sub7.anInt3841++;
        anInt3096++;
        Class42.aStream_Sub1_936.writePacket(-1494101117, 64);
        Class42.aStream_Sub1_936.writeShortLE(i, false);
        Class42.aStream_Sub1_936.writeInt2(bool, i_8_);
    }

    public static void method809(int i) {
        aJString_3095 = null;

        if (i <= 99) {
            anInt3098 = 47;
        }

        aClass15_3099 = null;
        aJString_3100 = null;
        aJString_3103 = null;
        aJString_3107 = null;
    }

    public void method750(Stream stream, int i, boolean bool) {
        if (bool != true) {
            method809(-124);
        }

        int i_9_ = i;
while_62_: 
        do {
            do {
                if ((i_9_ ^ 0xffffffff) != -1) {
                    if ((i_9_ ^ 0xffffffff) != -2) {
                        if (i_9_ == 3) {
                            break;
                        }

                        break while_62_;
                    }
                } else {
                    anInt3093 = stream.readByte(116);

                    break while_62_;
                }

                anInt3108 = stream.readByte(118);

                break while_62_;
            } while (false);

            anInt3101 = stream.readByte(124);
        } while (false);

        anInt3097++;
    }

    public void method752(int i) {
        Class37_Sub9_Sub28.method884(113);

        if (i != -2) {
            method808(false, 24, -61);
        }

        anInt3105++;
    }
}
