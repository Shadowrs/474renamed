/* Class37_Sub9_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub9_Sub17 extends Class37_Sub9 {
    public static int anInt3210;
    public static int anInt3213;
    public static int anInt3214;
    public static volatile int anInt3215;
    public static int anInt3218;
    public static int anInt3219 = 0;
    public static int anInt3220;
    public static int anInt3221;
    public static int anInt3223;
    public static Stream aStream_3224;
    public static int packetId;
    public static JString aJString_3226;
    public static JString aJString_3227;

    static {
        anInt3218 = -1;
        anInt3215 = -1;
        anInt3223 = 255;
        packetId = 0;
        aStream_3224 = new Stream(8);
        aJString_3226 = Class37_Sub2.method332((byte) 111, "null");
        aJString_3227 = Class37_Sub2.method332((byte) 114, "<col=00ff80>");
    }

    public int anInt3211;
    public int[] anIntArray3212 = new int[3];
    public int anInt3216 = 4096;
    public int anInt3217;
    public int anInt3222 = 4096;

    public Class37_Sub9_Sub17() {
        super(1, false);
        anInt3211 = 4096;
        anInt3217 = 409;
    }

    public static void method833(int i) {
        aJString_3226 = null;

        if (i == 4096) {
            aJString_3227 = null;
            aStream_3224 = null;
        }
    }

    public static Class18 method834(Class18 class18, boolean bool) {
        anInt3213++;

        int i = Class42.method1084((byte) 125,
                RuntimeException_Sub1.method1339(class18, 25));

        if ((i ^ 0xffffffff) == -1) {
            return null;
        }

        for (int i_0_ = 0; i_0_ < i; i_0_++) {
            class18 = Class37_Sub9_Sub14.method820(class18.anInt394, 4096);

            if (class18 == null) {
                return null;
            }
        }

        if (bool != false) {
            packetId = 60;
        }

        return class18;
    }

    public void method750(Stream stream, int i, boolean bool) {
        anInt3210++;

        if (bool != true) {
            anInt3215 = -80;
        }

        int i_1_ = i;
while_79_: 
        do {
while_78_: 
            do {
while_77_: 
                do {
                    do {
                        if ((i_1_ ^ 0xffffffff) != -1) {
                            if ((i_1_ ^ 0xffffffff) != -2) {
                                if ((i_1_ ^ 0xffffffff) != -3) {
                                    if (i_1_ != 3) {
                                        if ((i_1_ ^ 0xffffffff) == -5) {
                                            break while_78_;
                                        }

                                        break while_79_;
                                    }
                                } else {
                                    break;
                                }

                                break while_77_;
                            }
                        } else {
                            anInt3217 = stream.readShort();

                            return;
                        }

                        anInt3211 = stream.readShort();

                        return;
                    } while (false);

                    anInt3222 = stream.readShort();

                    return;
                } while (false);

                anInt3216 = stream.readShort();

                return;
            } while (false);

            int i_2_ = stream.read3Bytes(-26256544);

            anIntArray3212[2] = Class37_Sub4_Sub7.method490(i_2_, 255) >> 1851507628;

            anIntArray3212[1] = Class37_Sub4_Sub7.method490(4080,
                    i_2_ >> 1389804452);

            anIntArray3212[0] = Class37_Sub4_Sub7.method490(16711680, i_2_) << 1732009348;
        } while (false);
    }

    public int[][] method759(byte i, int i_3_) {
        anInt3220++;

        int[][] is = aClass33_1946.method298(false, i_3_);

        if (aClass33_1946.aBoolean767) {
            int[][] is_4_ = this.method762(0, i_3_, (byte) -113);
            int[] is_5_ = is_4_[0];
            int[] is_6_ = is_4_[1];
            int[] is_7_ = is_4_[2];
            int[] is_8_ = is[0];
            int[] is_9_ = is[1];
            int[] is_10_ = is[2];

            for (int i_11_ = 0; AbstractDrawingArea.anInt743 > i_11_; i_11_++) {
                int i_12_ = is_5_[i_11_];
                int i_13_ = i_12_ + -anIntArray3212[0];

                if (i_13_ < 0) {
                    i_13_ = -i_13_;
                }

                if (anInt3217 < i_13_) {
                    is_8_[i_11_] = i_12_;
                    is_9_[i_11_] = is_6_[i_11_];
                    is_10_[i_11_] = is_7_[i_11_];
                } else {
                    int i_14_ = is_6_[i_11_];
                    i_13_ = i_14_ - anIntArray3212[1];

                    if (i_13_ < 0) {
                        i_13_ = -i_13_;
                    }

                    if (i_13_ > anInt3217) {
                        is_8_[i_11_] = i_12_;
                        is_9_[i_11_] = i_14_;
                        is_10_[i_11_] = is_7_[i_11_];
                    } else {
                        int i_15_ = is_7_[i_11_];
                        i_13_ = i_15_ + -anIntArray3212[2];

                        if (i_13_ < 0) {
                            i_13_ = -i_13_;
                        }

                        if (anInt3217 < i_13_) {
                            is_8_[i_11_] = i_12_;
                            is_9_[i_11_] = i_14_;
                            is_10_[i_11_] = i_15_;
                        } else {
                            is_8_[i_11_] = (anInt3216 * i_12_) >> -570633556;
                            is_9_[i_11_] = (i_14_ * anInt3222) >> 1743883500;
                            is_10_[i_11_] = (i_15_ * anInt3211) >> -686243988;
                        }
                    }
                }
            }
        }

        if (i <= 111) {
            return null;
        }

        return is;
    }
}
