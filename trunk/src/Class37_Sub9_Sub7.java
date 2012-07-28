/* Class37_Sub9_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub9_Sub7 extends Class37_Sub9 {
    public static int anInt3028;
    public static JString aJString_3029 = Class37_Sub2.method332((byte) 109,
            "mapscene");
    public static JString aJString_3030;
    public static Class15 aClass15_3031;
    public static JString aJString_3032;
    public static JString aJString_3033;
    public static JString aJString_3034 = Class37_Sub2.method332((byte) 117,
            "scrollen:");
    public static int anInt3035;
    public static int anInt3036;
    public static int anInt3038;
    public static int anInt3039;
    public static JString aJString_3040;
    public static JString aJString_3042;
    public static int anInt3043;
    public static int anInt3044;

    static {
        aJString_3033 = Class37_Sub2.method332((byte) 106, "sl_stars");
        aJString_3040 = Class37_Sub2.method332((byte) 125, " x ");
        aJString_3032 = Class37_Sub2.method332((byte) 110, "glow1:");
        aJString_3030 = aJString_3032;
        aJString_3042 = aJString_3032;
    }

    public int anInt3027;
    public int anInt3037;
    public int anInt3041;

    public Class37_Sub9_Sub7() {
        this(0);
    }

    public Class37_Sub9_Sub7(int i) {
        super(0, false);
        method791(255, i);
    }

    public static void method788(int i) {
        Class37_Sub9_Sub11.anInt3098 = 0;
        anInt3039++;
        Class37_Sub9_Sub21.anInt3306 = 0;
        Class38.method1055((byte) -12);
        Class37_Sub9_Sub22.method864(i + -13798);
        Class56.method1143((byte) 91);

        if (i != 13896) {
            aJString_3033 = null;
        }

        for (int i_0_ = 0;
                (i_0_ ^ 0xffffffff) > (Class37_Sub9_Sub21.anInt3306 ^
                0xffffffff); i_0_++) {
            int i_1_ = Applet_Sub1.anIntArray30[i_0_];

            if (((Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_1_].anInt3641) ^
                    0xffffffff) != (Class37_Sub7.anInt1898 ^ 0xffffffff)) {
                Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_1_].aClass37_Sub4_Sub15_3955 = null;

                Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_1_] = null;
            }
        }

        if ((Class83.packetStream.currentIndex ^ 0xffffffff) != (Class37_Sub4.packetSize ^
                0xffffffff)) {
            throw new RuntimeException("gnp1 pos:" +
                (Class83.packetStream.currentIndex) + " psize:" +
                Class37_Sub4.packetSize);
        }

        for (int i_2_ = 0;
                (Class76.anInt1436 ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
                i_2_++) {
            if ((Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[Class37_Sub4_Sub16.anIntArray2869[i_2_]]) == null) {
                throw new RuntimeException("gnp2 pos:" + i_2_ + " size:" +
                    Class76.anInt1436);
            }
        }
    }

    public static void method789(int i) {
        aJString_3033 = null;
        aJString_3034 = null;
        aJString_3029 = null;
        aJString_3042 = null;

        if (i < 56) {
            method789(-103);
        }

        aJString_3030 = null;
        aClass15_3031 = null;
        aJString_3032 = null;
        aJString_3040 = null;
    }

    public static int method790(int i, int i_3_, int i_4_, int i_5_) {
        anInt3038++;

        if (i_3_ != 1816459564) {
            return -64;
        }

        int i_6_ = 256 + -i_5_;

        return (((~0xff00ff &
        ((i_6_ * (0xff00ff & i_4_)) + ((i & 0xff00ff) * i_5_))) +
        ((((i_4_ & 0xff00) * i_6_) - -(i_5_ * (i & 0xff00))) & 0xff0000)) >> 439446792);
    }

    public void method750(Stream stream, int i, boolean bool) {
        int i_7_ = i;

        if (i_7_ == 0) {
            method791(255, stream.method935(-26256544));
        }

        if (bool != true) {
            anInt3027 = -73;
        }

        anInt3043++;
    }

    public int[][] method759(byte i, int i_8_) {
        if (i <= 111) {
            return null;
        }

        anInt3036++;

        int[][] is = aClass33_1946.method298(false, i_8_);

        if (aClass33_1946.aBoolean767) {
            int[] is_9_ = is[0];
            int[] is_10_ = is[2];
            int[] is_11_ = is[1];

            for (int i_12_ = 0; Class32.anInt743 > i_12_; i_12_++) {
                is_9_[i_12_] = anInt3027;
                is_11_[i_12_] = anInt3037;
                is_10_[i_12_] = anInt3041;
            }
        }

        return is;
    }

    public void method791(int i, int i_13_) {
        anInt3041 = (i_13_ << -2130958620) & 0xff0;
        anInt3027 = (i_13_ & 0xff0000) >> 1816459564;
        anInt3035++;
        anInt3037 = (0xff00 & i_13_) >> -107235196;

        if (i != 255) {
            anInt3041 = 40;
        }
    }

    public static int method792(int i, int i_14_) {
        anInt3044++;
        i_14_ = (0x55555555 & i_14_) - -(0x55555555 & i_14_ >>> 1620347425);
        i_14_ = (i_14_ & 0x33333333) + (0x73333333 & i_14_ >>> 1152557602);
        i_14_ = 0xf0f0f0f & ((i_14_ >>> 1917850148) + i_14_);
        i_14_ += i_14_ >>> 1383985416;
        i_14_ += i_14_ >>> -1159134064;

        if (i != 1152557602) {
            method788(-58);
        }

        return i_14_ & 0xff;
    }
}
