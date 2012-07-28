/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public abstract class Class52 {
    public static int anInt1049;
    public static boolean aBoolean1050 = false;
    public static JString aJString_1051 = Class37_Sub2.method332((byte) 119,
            "This world is full)3");
    public static int anInt1052;
    public static Class15 aClass15_1053;
    public static Class15 aClass15_1054;
    public static JString aJString_1055;
    public static Class15 aClass15_1056;
    public static JString aJString_1057 = aJString_1051;

    static {
        aJString_1055 = Class37_Sub2.method332((byte) 114, "mn");
    }

    public static JString method1126(int i, int i_0_, int i_1_) {
        anInt1052++;

        int i_2_ = -i_0_ + i_1_;

        if (i_2_ < -9) {
            return Class20.aJString_551;
        }

        if ((i_2_ ^ 0xffffffff) > 5) {
            return Class43.aJString_962;
        }

        if (i > i_2_) {
            return Stream.aJString_2038;
        }

        if ((i_2_ ^ 0xffffffff) > -1) {
            return Class26.aJString_649;
        }

        if ((i_2_ ^ 0xffffffff) < -10) {
            return Class82.aJString_1690;
        }

        if (i_2_ > 6) {
            return Class37_Sub9_Sub6.aJString_3006;
        }

        if ((i_2_ ^ 0xffffffff) < -4) {
            return Class38.aJString_830;
        }

        if (i_2_ > 0) {
            return Class37_Sub9_Sub6.aJString_3025;
        }

        return PacketStream.aJString_3627;
    }

    public abstract void method1127(int i);

    public static void method1128(int i) {
        aJString_1055 = null;
        aJString_1051 = null;
        aClass15_1056 = null;
        aClass15_1054 = null;

        if (i > -30) {
            method1130((byte) 27);
        }

        aJString_1057 = null;
        aClass15_1053 = null;
    }

    public abstract int method1129(int i, byte i_3_, int i_4_);

    public static void method1130(byte i) {
        if (i > -64) {
            method1128(55);
        }

        Class37_Sub4_Sub3.aClass65_2558.method1186(3056);
        Class37_Sub9_Sub31.aClass65_3489.method1186(3056);
        anInt1049++;
    }
}
