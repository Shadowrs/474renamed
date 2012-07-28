/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class50 {
    public static JString aJString_1011 = Class37_Sub2.method332((byte) 123,
            "(U(Y");
    public static JString aJString_1013;
    public static JString aJString_1014;
    public static JString aJString_1015;
    public static int anInt1016 = 0;
    public static int anInt1019;
    public static JString aJString_1020;
    public static JString aJString_1022;
    public static JString aJString_1023;
    public static int anInt1024;
    public static JString aJString_1027;
    public static int anInt1028;

    static {
        aJString_1015 = Class37_Sub2.method332((byte) 101, "headicons_pk");
        aJString_1013 = Class37_Sub2.method332((byte) 111, "logo");
        aJString_1020 = Class37_Sub2.method332((byte) 120, "::fpson");
        aJString_1022 = Class37_Sub2.method332((byte) 115, "me");

        aJString_1014 = Class37_Sub2.method332((byte) 114,
                "W-=hlen Sie eine Option");
        aJString_1023 = Class37_Sub2.method332((byte) 111, ":");
        aJString_1027 = Class37_Sub2.method332((byte) 124, "Freie Welt");
    }

    public int anInt1012;
    public int anInt1017;
    public int anInt1018;
    public boolean aBoolean1021 = true;
    public int anInt1025;
    public int anInt1026;
    public int anInt1029;

    public Class50(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_,
        boolean bool) {
        anInt1029 = i_7_;
        anInt1018 = i_4_;
        anInt1017 = i_5_;
        anInt1025 = i;
        anInt1012 = i_6_;
        aBoolean1021 = bool;
        anInt1026 = i_3_;
    }

    public static void method1114(boolean bool) {
        aJString_1022 = null;
        aJString_1015 = null;
        aJString_1023 = null;
        aJString_1020 = null;
        aJString_1011 = null;
        aJString_1014 = null;
        aJString_1027 = null;
        aJString_1013 = null;

        if (bool != false) {
            aJString_1022 = null;
        }
    }

    public static void method1115(int i, int i_0_, byte i_1_) {
        anInt1019++;

        if (((Class37_Sub9_Sub13.anInt3134 ^ 0xffffffff) <= -3) ||
                (Class37_Sub14.anInt2122 != 0) ||
                Class37_Sub4_Sub5.aBoolean2595) {
            JString jstring;

            if (((Class37_Sub14.anInt2122 ^ 0xffffffff) == -2) &&
                    (Class37_Sub9_Sub13.anInt3134 < 2)) {
                jstring = Class37_Sub9_Sub27.method881(-98,
                        (new JString[] {
                            (Class37_Sub9_Sub27.aJString_3404),
                            Class38.aJString_827, Class64.aJString_1218,
                            Class30.aJString_726
                        }));
            } else if (!Class37_Sub4_Sub5.aBoolean2595 ||
                    ((Class37_Sub9_Sub13.anInt3134 ^ 0xffffffff) <= -3)) {
                jstring = Class37_Sub4_Sub7_Sub1_Sub2.method510(-1 +
                        Class37_Sub9_Sub13.anInt3134, 93);
            } else {
                jstring = Class37_Sub9_Sub27.method881(108,
                        (new JString[] {
                            (Class37_Sub9_Sub1.aJString_2912),
                            Class38.aJString_827, Class60.aJString_1142,
                            Class30.aJString_726
                        }));
            }

            if ((Class37_Sub9_Sub13.anInt3134 ^ 0xffffffff) < -3) {
                jstring = (Class37_Sub9_Sub27.method881(125,
                        (new JString[] {
                            jstring, Class78.aJString_1462,
                            Class37_Sub9_Sub24.method870((-2 +
                                (Class37_Sub9_Sub13.anInt3134)), (byte) -114),
                            Class6.aJString_143
                        })));
            }

            if (i_1_ > 39) {
                int i_2_ = (Class37_Sub4_Sub7_Sub2.aClass37_Sub4_Sub9_Sub2_Sub1_3724.method610(jstring,
                        4 + i, 15 + i_0_, 16777215, 0, Class33.aRandom751,
                        Class39.anInt874));
                Class37_Sub7.method740(Class37_Sub4_Sub7_Sub2.aClass37_Sub4_Sub9_Sub2_Sub1_3724.method617(
                        jstring) + i_2_, i - -4, i_0_, 15, 16711680);
            }
        }
    }
}
