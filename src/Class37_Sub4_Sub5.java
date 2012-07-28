/* Class37_Sub4_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.util.zip.CRC32;


public class Class37_Sub4_Sub5 extends Class37_Sub4 {
    public static int anInt2591;
    public static int anInt2592;
    public static int anInt2593;
    public static boolean aBoolean2595 = false;
    public static Class15_Sub1[] aClass15_Sub1Array2597 = new Class15_Sub1[256];
    public static CRC32 aCRC32_2599 = new CRC32();
    public static int anInt2600;
    public static JString aJString_2601;
    public static long[] aLongArray2602;
    public static short[] aShortArray2603;
    public static byte[][] aByteArrayArray2604 = new byte[1000][];
    public static JString aJString_2605;
    public static JString aJString_2606;
    public static JString aJString_2607 = Class37_Sub2.method332((byte) 122,
            "Please try using a different world)3");
    public static JString aJString_2608 = aJString_2607;
    public static JString aJString_2609;
    public static JString aJString_2610;

    static {
        aShortArray2603 = new short[] { -10304, 9104, -1, -1, -1 };
        aJString_2605 = aJString_2607;
        aJString_2601 = aJString_2607;
        aJString_2606 = aJString_2607;
        aLongArray2602 = new long[32];
        aJString_2609 = aJString_2607;
        aJString_2610 = aJString_2607;
    }

    public int anInt2594;
    public int anInt2596;
    public int anInt2598;

    public void method482(int i, Stream stream, int i_0_) {
        anInt2593++;

        if (i == -24527) {
            if (i_0_ == 1) {
                anInt2596 = stream.method980(-26);
                anInt2598 = stream.method978(123);
                anInt2594 = stream.method978(125);
            }
        }
    }

    public void method483(Stream stream, byte i) {
        for (;;) {
            int i_1_ = stream.method978(124);

            if (i_1_ == 0) {
                break;
            }

            method482(-24527, stream, i_1_);
        }

        anInt2591++;

        if (i >= -28) {
            method482(116, null, 115);
        }
    }

    public static Class37_Sub4_Sub9_Sub2_Sub1 method484(byte[] is, int i) {
        anInt2600++;

        if (i <= 8) {
            aLongArray2602 = null;
        }

        if (is == null) {
            return null;
        }

        Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1 = (new Class37_Sub4_Sub9_Sub2_Sub1(is,
                Class62.anIntArray1180, Class37_Sub9_Sub23.anIntArray3357,
                Class14.anIntArray250, Class37_Sub9_Sub28.anIntArray3434,
                Class37_Sub9_Sub1.anIntArray2919, Class10.aByteArrayArray198));
        Class37_Sub9_Sub11.method806(true);

        return class37_sub4_sub9_sub2_sub1;
    }

    public static void method485(int i, int i_2_, int i_3_, byte i_4_,
        JString jstring) {
        anInt2592++;

        Class18 class18 = Class37_Sub9_Sub35.method914(i_2_, (byte) -26, i_3_);

        if ((class18 != null) && (i_4_ == 108)) {
            if (class18.anObjectArray363 != null) {
                Class37_Sub8 class37_sub8 = new Class37_Sub8();
                class37_sub8.anInt1936 = i;
                class37_sub8.anObjectArray1938 = class18.anObjectArray363;
                class37_sub8.aClass18_1925 = class18;
                class37_sub8.aJString_1937 = jstring;
                Class43.method1092(class37_sub8, (byte) 118);
            }

            boolean bool = true;

            if ((class18.anInt376 ^ 0xffffffff) < -1) {
                bool = Class37_Sub25.method1042(3, class18);
            }

            if (bool &&
                    Class37_Sub9_Sub13.method813(i - 1,
                        RuntimeException_Sub1.method1339(class18, 25),
                        (byte) -126)) {
                if ((i ^ 0xffffffff) == -2) {
                    Class42.aStream_Sub1_936.method989(-1494101117, 234);
                    Class41.anInt901++;
                    Class42.aStream_Sub1_936.method947((byte) 7, i_2_);
                    Class42.aStream_Sub1_936.method965(i_4_ + 848881852,
                        i_3_);
                }

                if (i == 2) {
                    Class42.aStream_Sub1_936.method989(-1494101117, 87);
                    Class42.aStream_Sub1_936.method947((byte) 9, i_2_);
                    RSApplet.anInt179++;
                    Class42.aStream_Sub1_936.method965(848881960, i_3_);
                }

                if ((i ^ 0xffffffff) == -4) {
                    Class60.anInt1157++;
                    Class42.aStream_Sub1_936.method989(-1494101117, 37);
                    Class42.aStream_Sub1_936.method947((byte) 113, i_2_);
                    Class42.aStream_Sub1_936.method965(848881960, i_3_);
                }

                if (i == 4) {
                    Class42.aStream_Sub1_936.method989(-1494101117, 3);
                    Class25.anInt639++;
                    Class42.aStream_Sub1_936.method947((byte) 113, i_2_);
                    Class42.aStream_Sub1_936.method965(848881960, i_3_);
                }

                if (i == 5) {
                    Class42.aStream_Sub1_936.method989(-1494101117, 70);
                    Class42.aStream_Sub1_936.method947((byte) -123, i_2_);
                    Class42.aStream_Sub1_936.method965(848881960, i_3_);
                    Class37.anInt823++;
                }

                if ((i ^ 0xffffffff) == -7) {
                    Class32_Sub1.anInt1777++;
                    Class42.aStream_Sub1_936.method989(-1494101117, 29);
                    Class42.aStream_Sub1_936.method947((byte) 50, i_2_);
                    Class42.aStream_Sub1_936.method965(848881960, i_3_);
                }

                if (i == 7) {
                    Class76.anInt1434++;
                    Class42.aStream_Sub1_936.method989(-1494101117, 192);
                    Class42.aStream_Sub1_936.method947((byte) 100, i_2_);
                    Class42.aStream_Sub1_936.method965(848881960, i_3_);
                }

                if (i == 8) {
                    Class42.aStream_Sub1_936.method989(i_4_ +
                        -1494101225, 154);
                    Class42.aStream_Sub1_936.method947((byte) 104, i_2_);
                    Class55.anInt1065++;
                    Class42.aStream_Sub1_936.method965(i_4_ ^
                        0x3298e944, i_3_);
                }

                if ((i ^ 0xffffffff) == -10) {
                    Class37_Sub8.anInt1934++;
                    Class42.aStream_Sub1_936.method989(i_4_ +
                        -1494101225, 65);
                    Class42.aStream_Sub1_936.method947((byte) 107, i_2_);
                    Class42.aStream_Sub1_936.method965(i_4_ ^
                        0x3298e944, i_3_);
                }

                if (i == 10) {
                    Class58.anInt1124++;
                    Class42.aStream_Sub1_936.method989(-1494101117, 156);
                    Class42.aStream_Sub1_936.method947((byte) 105, i_2_);
                    Class42.aStream_Sub1_936.method965(848881960, i_3_);
                }
            }
        }
    }

    public static void method486(byte i) {
        aByteArrayArray2604 = null;
        aClass15_Sub1Array2597 = null;
        aJString_2610 = null;
        aCRC32_2599 = null;

        if (i <= 73) {
            aJString_2610 = null;
        }

        aLongArray2602 = null;
        aJString_2601 = null;
        aJString_2607 = null;
        aJString_2606 = null;
        aJString_2608 = null;
        aJString_2605 = null;
        aShortArray2603 = null;
        aJString_2609 = null;
    }
}
