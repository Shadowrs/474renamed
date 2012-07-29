/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class49 {
    public static volatile long aLong1003 = 0L;
    public static int anInt1004;
    public static byte[][] aByteArrayArray1005;
    public static Stream aStream_1006;
    public static int anInt1007;
    public static JString aJString_1008 = Class37_Sub2.method332((byte) 112,
            "Bitte geben Sie Ihr Passwort ein)3");
    public static int anInt1009;
    public static int anInt1010;

    public static void method1111(boolean bool, byte[] is) {
        Stream stream = new Stream(is);
        anInt1009++;
        stream.bufferLocation = -2 + is.length;
        Class10.anInt194 = stream.readShort();
        Class10.aByteArrayArray198 = new byte[Class10.anInt194][];
        Class37_Sub9_Sub23.anIntArray3357 = new int[Class10.anInt194];
        Class14.anIntArray250 = new int[Class10.anInt194];
        Class62.anIntArray1180 = new int[Class10.anInt194];
        Class37_Sub9_Sub28.anIntArray3434 = new int[Class10.anInt194];
        stream.bufferLocation = (-7 + is.length) - (8 * Class10.anInt194);
        Class37_Sub4_Sub7.anInt2637 = stream.readShort();
        Class46.anInt989 = stream.readShort();

        int i = 1 + (stream.readByte(120) & 0xff);

        if (bool != false) {
            aStream_1006 = null;
        }

        for (int i_0_ = 0;
                (Class10.anInt194 ^ 0xffffffff) < (i_0_ ^ 0xffffffff);
                i_0_++)
            Class62.anIntArray1180[i_0_] = stream.readShort();

        for (int i_1_ = 0; i_1_ < Class10.anInt194; i_1_++)
            Class37_Sub9_Sub23.anIntArray3357[i_1_] = stream.readShort();

        for (int i_2_ = 0; Class10.anInt194 > i_2_; i_2_++)
            Class14.anIntArray250[i_2_] = stream.readShort();

        for (int i_3_ = 0; Class10.anInt194 > i_3_; i_3_++)
            Class37_Sub9_Sub28.anIntArray3434[i_3_] = stream.readShort();

        stream.bufferLocation = -(Class10.anInt194 * 8) +
            (-7 + (is.length + -(3 * i))) + 3;
        Class37_Sub9_Sub1.anIntArray2919 = new int[i];

        for (int i_4_ = 1; (i_4_ ^ 0xffffffff) > (i ^ 0xffffffff); i_4_++) {
            Class37_Sub9_Sub1.anIntArray2919[i_4_] = stream.read3Bytes(-26256544);

            if (Class37_Sub9_Sub1.anIntArray2919[i_4_] == 0) {
                Class37_Sub9_Sub1.anIntArray2919[i_4_] = 1;
            }
        }

        stream.bufferLocation = 0;

        for (int i_5_ = 0; i_5_ < Class10.anInt194; i_5_++) {
            int i_6_ = Class14.anIntArray250[i_5_];
            int i_7_ = Class37_Sub9_Sub28.anIntArray3434[i_5_];
            int i_8_ = i_7_ * i_6_;
            byte[] is_9_ = new byte[i_8_];
            Class10.aByteArrayArray198[i_5_] = is_9_;

            int i_10_ = stream.readByte(125);

            if ((i_10_ ^ 0xffffffff) == -1) {
                for (int i_11_ = 0; i_8_ > i_11_; i_11_++)
                    is_9_[i_11_] = stream.readSignedByte((byte) 106);
            } else if ((i_10_ ^ 0xffffffff) == -2) {
                for (int i_12_ = 0; i_6_ > i_12_; i_12_++) {
                    for (int i_13_ = 0;
                            (i_7_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff);
                            i_13_++)
                        is_9_[i_12_ + (i_13_ * i_6_)] = stream.readSignedByte((byte) 106);
                }
            }
        }
    }

    public static void method1112(int i) {
        aStream_1006 = null;
        aJString_1008 = null;
        aByteArrayArray1005 = null;

        if (i != -193) {
            aLong1003 = 36L;
        }
    }

    public static int method1113(int i, int i_14_, int i_15_, int i_16_) {
        if (i >= -120) {
            return 13;
        }

        anInt1007++;

        if ((i_14_ ^ 0xffffffff) < -180) {
            i_15_ /= 2;
        }

        if ((i_14_ ^ 0xffffffff) < -193) {
            i_15_ /= 2;
        }

        if ((i_14_ ^ 0xffffffff) < -218) {
            i_15_ /= 2;
        }

        if (i_14_ > 243) {
            i_15_ /= 2;
        }

        int i_17_ = ((i_14_ / 2) + ((i_16_ / 4) << -795759158) +
            ((i_15_ / 32) << -2098548505));

        return i_17_;
    }
}
