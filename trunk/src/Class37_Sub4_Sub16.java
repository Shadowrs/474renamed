/* Class37_Sub4_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub4_Sub16 extends Class37_Sub4 {
    public static int anInt2864 = 0;
    public static JString aJString_2865;
    public static int anInt2866;
    public static int anInt2867;
    public static int anInt2868;
    public static int[] anIntArray2869 = new int[32768];
    public static int[] anIntArray2871;

    static {
        aJString_2865 = Class37_Sub2.method332((byte) 101, " loggt sich aus)3");
    }

    public Class61[] aClass61Array2870;

    public Class37_Sub4_Sub16(JS5 class15, JS5 class15_3_, int i,
        boolean bool) {
        try {
            Class58 class58 = new Class58();
            int i_4_ = class15.method129(10000, i);
            aClass61Array2870 = new Class61[i_4_];

            int[] is = class15.method119(i, (byte) 68);

            for (int i_5_ = 0; (is.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff);
                    i_5_++) {
                byte[] is_6_ = class15.method131(is[i_5_], i, 1);
                int i_7_ = (0xff & is_6_[1]) |
                    ((is_6_[0] & 0xff) << -163476184);
                Class37_Sub25 class37_sub25 = null;

                for (Class37_Sub25 class37_sub25_8_ = (Class37_Sub25) class58.method1155(
                            0); class37_sub25_8_ != null;
                        class37_sub25_8_ = (Class37_Sub25) class58.method1162(
                                (byte) 92)) {
                    if ((class37_sub25_8_.anInt2278 ^ 0xffffffff) == (i_7_ ^
                            0xffffffff)) {
                        class37_sub25 = class37_sub25_8_;

                        break;
                    }
                }

                if (class37_sub25 == null) {
                    byte[] is_9_;

                    if (!bool) {
                        is_9_ = class15_3_.method110(0, 90, i_7_);
                    } else {
                        is_9_ = class15_3_.method110(i_7_, 90, 0);
                    }

                    class37_sub25 = new Class37_Sub25(i_7_, is_9_);
                    class58.method1149((byte) -121, class37_sub25);
                }

                aClass61Array2870[is[i_5_]] = new Class61(is_6_, class37_sub25);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("t.<init>(" + ((class15 != null) ? "{...}" : "null") + ',' +
                ((class15_3_ != null) ? "{...}" : "null") + ',' + i + ',' +
                bool + ')'));
        }
    }

    public boolean method722(boolean bool, int i) {
        anInt2867++;

        if (bool != false) {
            method723((byte) -42);
        }

        return aClass61Array2870[i].aBoolean1163;
    }

    public static void method723(byte i) {
        aJString_2865 = null;

        if (i != -46) {
            method724(-38, -120, -20, 117);
        }

        anIntArray2869 = null;
        anIntArray2871 = null;
    }

    public static Class37_Sub6 method724(int i, int i_0_, int i_1_, int i_2_) {
        anInt2868++;

        Class37_Sub6 class37_sub6 = new Class37_Sub6();
        class37_sub6.anInt1884 = i_0_;
        class37_sub6.anInt1882 = i;

        if (i_2_ != -17421) {
            return null;
        }

        Class76.aClass13_1423.method101(class37_sub6, false, (long) i_1_);
        Class37_Sub10.method928((byte) 27, i_0_);
        Class87.method1330(i_0_, i_2_ ^ 0x443d);

        Class18 class18 = Class37_Sub9_Sub14.method820(i_1_, i_2_ ^ ~0x540c);

        if (class18 != null) {
            Class73.method1274(class18, -1);
        }

        if (Class79.aClass18_1489 != null) {
            Class73.method1274(Class79.aClass18_1489, i_2_ ^ 0x440c);
            Class79.aClass18_1489 = null;
        }

        Class37_Sub9_Sub13.anInt3134 = 0;
        Class37_Sub20.aBoolean2220 = false;
        Class37_Sub7.method740(Class37_Sub9_Sub24.anInt3377,
            Class37_Sub4_Sub13.anInt2794, Class15_Sub1.anInt1753,
            Class37_Sub5.anInt1878, i_2_ ^ ~0xff440c);

        if (AbstractDrawingArea.anInt733 != -1) {
            Class26.method259(AbstractDrawingArea.anInt733, 1, -125);
        }

        return class37_sub6;
    }
}
