/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class85 {
    public static int anInt1540;
    public static int anInt1543;
    public static int anInt1546;
    public static int anInt1552;
    public static int anInt1555;
    public static int anInt1557 = 1;
    public static int anInt1571;
    public static int anInt1574;
    public int anInt1536;
    public int anInt1537;
    public byte[] aByteArray1538;
    public int[] anIntArray1539;
    public byte aByte1541;
    public int anInt1542;
    public int[] anIntArray1544 = new int[6];
    public byte[] aByteArray1545;
    public int anInt1547;
    public boolean[] aBooleanArray1548;
    public int anInt1549;
    public int[][] anIntArrayArray1550;
    public boolean[] aBooleanArray1551;
    public int anInt1553;
    public byte[][] aByteArrayArray1554;
    public int anInt1556;
    public byte[] aByteArray1558;
    public int[] anIntArray1559;
    public int anInt1560;
    public int anInt1561;
    public byte[] aByteArray1562;
    public int anInt1563;
    public int anInt1564;
    public int[][] anIntArrayArray1565;
    public int anInt1566;
    public byte[] aByteArray1567;
    public int anInt1568;
    public int anInt1569;
    public byte[] aByteArray1570;
    public int[] anIntArray1572;
    public int[][] anIntArrayArray1573;
    public int anInt1575;

    public Class85() {
        anIntArray1539 = new int[256];
        aBooleanArray1551 = new boolean[256];
        anIntArrayArray1550 = new int[6][258];
        anInt1536 = 0;
        aBooleanArray1548 = new boolean[16];
        anInt1560 = 0;
        aByteArray1562 = new byte[256];
        anIntArray1559 = new int[257];
        anIntArrayArray1565 = new int[6][258];
        anIntArray1572 = new int[16];
        aByteArray1558 = new byte[18002];
        aByteArrayArray1554 = new byte[6][258];
        aByteArray1567 = new byte[18002];
        anIntArrayArray1573 = new int[6][258];
        aByteArray1570 = new byte[4096];
    }

    public static int method1319(byte[] is, int i, int i_0_, int i_1_) {
        anInt1546++;

        int i_2_ = -1;

        if (i_1_ != 448779536) {
            method1319(null, -31, -98, -11);
        }

        for (int i_3_ = i; i_3_ < i_0_; i_3_++)
            i_2_ = (Class37_Sub1.anIntArray1803[0xff & (i_2_ ^ is[i_3_])] ^
                i_2_ >>> -1456252312);

        i_2_ ^= 0xffffffff;

        return i_2_;
    }

    public static void method1320(Class18 class18, int i, int i_4_, int i_5_,
        int i_6_, int i_7_, int i_8_, int i_9_) {
        anInt1540++;

        int i_10_ = -14 / ((-41 - i_4_) / 35);

        if (Class37_Sub9.aBoolean1957) {
            Class37_Sub16.anInt2154 = 32;
        } else {
            Class37_Sub16.anInt2154 = 0;
        }

        Class37_Sub9.aBoolean1957 = false;

        if ((Class60.anInt1140 ^ 0xffffffff) != -1) {
            if ((i <= i_7_) && ((i_7_ ^ 0xffffffff) > ((16 + i) ^ 0xffffffff)) &&
                    (i_8_ <= i_9_) &&
                    ((i_9_ ^ 0xffffffff) > ((i_8_ + 16) ^ 0xffffffff))) {
                class18.anInt432 -= 4;
                Class73.method1274(class18, -1);
            } else if (((i_7_ ^ 0xffffffff) > (i ^ 0xffffffff)) ||
                    (((16 + i) ^ 0xffffffff) >= (i_7_ ^ 0xffffffff)) ||
                    (i_9_ < (-16 + (i_8_ - -i_5_))) ||
                    (((i_8_ - -i_5_) ^ 0xffffffff) >= (i_9_ ^ 0xffffffff))) {
                if (((-Class37_Sub16.anInt2154 + i) <= i_7_) &&
                        (i_7_ < (Class37_Sub16.anInt2154 + (16 + i))) &&
                        (((i_8_ - -16) ^ 0xffffffff) >= (i_9_ ^ 0xffffffff)) &&
                        ((-16 + (i_8_ + i_5_)) > i_9_)) {
                    int i_11_ = ((-32 + i_5_) * i_5_) / i_6_;

                    if ((i_11_ ^ 0xffffffff) > -9) {
                        i_11_ = 8;
                    }

                    int i_12_ = -(i_11_ / 2) + -16 + i_9_ + -i_8_;
                    int i_13_ = i_5_ + (-32 + -i_11_);
                    class18.anInt432 = ((i_6_ + -i_5_) * i_12_) / i_13_;
                    Class73.method1274(class18, -1);
                    Class37_Sub9.aBoolean1957 = true;
                }
            } else {
                class18.anInt432 += 4;
                Class73.method1274(class18, -1);
            }
        }

        if ((Class37_Sub4_Sub7_Sub1_Sub1.anInt3945 ^ 0xffffffff) != -1) {
            int i_14_ = class18.anInt441;

            if ((i_7_ >= (i - i_14_)) &&
                    ((i_8_ ^ 0xffffffff) >= (i_9_ ^ 0xffffffff)) &&
                    (i_7_ < (i - -16)) && (i_9_ <= (i_5_ + i_8_))) {
                class18.anInt432 += (Class37_Sub4_Sub7_Sub1_Sub1.anInt3945 * 45);
                Class73.method1274(class18, -1);
            }
        }
    }

    public static void method1321(int i, int i_15_, byte i_16_) {
        if (i_16_ == 3) {
            anInt1571++;

            long l = (long) ((i_15_ << -1543447152) + i);
            Class37_Sub4_Sub13 class37_sub4_sub13 = ((Class37_Sub4_Sub13) Class37_Sub4_Sub18.aClass13_2905.method100((byte) 58,
                    l));

            if (class37_sub4_sub13 != null) {
                ISAAC.aClass77_92.method1288(-1454, class37_sub4_sub13);
            }
        }
    }

    public static int method1322(int i, int i_17_, int i_18_, int i_19_,
        int i_20_) {
        int i_21_ = ((-Class37_Sub4_Sub9_Sub4.anIntArray3929[(1024 * i_19_) / i_18_] +
            65536) >> -1009382879);

        if (i_17_ != 2058356880) {
            return 82;
        }

        anInt1574++;

        return (((i * i_21_) >> 2058356880) +
        (((65536 - i_21_) * i_20_) >> 448779536));
    }
}
