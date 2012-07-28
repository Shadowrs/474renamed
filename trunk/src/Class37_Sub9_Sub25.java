/* Class37_Sub9_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub9_Sub25 extends Class37_Sub9 {
    public static int anInt3378;
    public static int anInt3379;
    public static JString aJString_3380 = Class37_Sub2.method332((byte) 113,
            "Nehmen");
    public static JString aJString_3381 = Class37_Sub2.method332((byte) 115,
            "Bitte laden Sie die Seite neu)3");
    public static int anInt3382 = 0;
    public static int anInt3383;
    public static int anInt3384;
    public static JString aJString_3385 = Class37_Sub2.method332((byte) 107,
            "bevor Sie den Vorgang wiederholen)3");

    public Class37_Sub9_Sub25() {
        super(0, true);
    }

    public static void method872(boolean bool) {
        aJString_3380 = null;
        aJString_3381 = null;
        aJString_3385 = null;

        if (bool != false) {
            aJString_3381 = null;
        }
    }

    public static JString method873(byte i, Class18 class18, JString jstring) {
        try {
            if ((jstring.method156(-119, Class37_Sub4_Sub4.aJString_2582) ^
                    0xffffffff) != 0) {
                for (;;) {
                    int i_0_ = jstring.method156(125, Class79.aJString_1473);

                    if ((i_0_ ^ 0xffffffff) == 0) {
                        break;
                    }

                    jstring = (Class37_Sub9_Sub27.method881(-119,
                            (new JString[] {
                                jstring.method169(0, 0, i_0_),
                                Class46.method1105(Class38.method1050(-29842,
                                        0, class18), (byte) -117),
                                jstring.method158(2 + i_0_, -1)
                            })));
                }

                for (;;) {
                    int i_1_ = jstring.method156(-106,
                            Class37_Sub3_Sub3.aJString_2395);

                    if (i_1_ == -1) {
                        break;
                    }

                    jstring = (Class37_Sub9_Sub27.method881(-27,
                            (new JString[] {
                                jstring.method169(0, 0, i_1_),
                                Class46.method1105(Class38.method1050(-29842,
                                        1, class18), (byte) -120),
                                jstring.method158(i_1_ - -2, -1)
                            })));
                }

                for (;;) {
                    int i_2_ = jstring.method156(103,
                            Class37_Sub9_Sub34.aJString_3537);

                    if ((i_2_ ^ 0xffffffff) == 0) {
                        break;
                    }

                    jstring = (Class37_Sub9_Sub27.method881(19,
                            (new JString[] {
                                jstring.method169(0, 0, i_2_),
                                Class46.method1105(Class38.method1050(-29842,
                                        2, class18), (byte) -125),
                                jstring.method158(i_2_ + 2, -1)
                            })));
                }

                for (;;) {
                    int i_3_ = jstring.method156(-105, Class30.aJString_721);

                    if (i_3_ == -1) {
                        break;
                    }

                    jstring = (Class37_Sub9_Sub27.method881(-28,
                            (new JString[] {
                                jstring.method169(0, 0, i_3_),
                                Class46.method1105(Class38.method1050(-29842,
                                        3, class18), (byte) -128),
                                jstring.method158(i_3_ - -2, -1)
                            })));
                }

                for (;;) {
                    int i_4_ = jstring.method156(42, Class37_Sub13.aJString_2110);

                    if ((i_4_ ^ 0xffffffff) == 0) {
                        break;
                    }

                    jstring = (Class37_Sub9_Sub27.method881(25,
                            (new JString[] {
                                jstring.method169(0, 0, i_4_),
                                Class46.method1105(Class38.method1050(-29842,
                                        4, class18), (byte) -123),
                                jstring.method158(i_4_ - -2, -1)
                            })));
                }

                for (;;) {
                    int i_5_ = jstring.method156(-111,
                            PacketParser.aJString_3257);

                    if ((i_5_ ^ 0xffffffff) == 0) {
                        break;
                    }

                    JString jstring_6_ = Class37_Sub9_Sub8.aJString_3045;

                    if (Class37_Sub9_Sub33.aClass23_3527 != null) {
                        jstring_6_ = Class36.method318(-21952,
                                (Class37_Sub9_Sub33.aClass23_3527.anInt590));

                        try {
                            if (Class37_Sub9_Sub33.aClass23_3527.anObject595 != null) {
                                byte[] is = ((String) (Class37_Sub9_Sub33.aClass23_3527.anObject595)).getBytes(
                                        "ISO-8859-1");

                                jstring_6_ = Class37_Sub12.method998((byte) -17,
                                        is.length, is, 0);
                            }
                        } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
                            /* empty */
                        }
                    }

                    jstring = (Class37_Sub9_Sub27.method881(123,
                            (new JString[] {
                                jstring.method169(0, 0, i_5_), jstring_6_,
                                jstring.method158(4 + i_5_, -1)
                            })));
                }
            }

            anInt3378++;

            if (i > -20) {
                return null;
            }

            return jstring;
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("rf.C(" + i + ',' + ((class18 != null) ? "{...}" : "null") +
                ',' + ((jstring != null) ? "{...}" : "null") + ')'));
        }
    }

    public int[] method761(int i, int i_7_) {
        anInt3383++;

        int[] is = aClass38_1966.method1049(i_7_, true);

        if (aClass38_1966.aBoolean850) {
            for (int i_8_ = 0;
                    (i_8_ ^ 0xffffffff) > (Class32.anInt743 ^ 0xffffffff);
                    i_8_++)
                is[i_8_] = Class84.anIntArray1528[i_8_];
        }

        if (i > -125) {
            return null;
        }

        return is;
    }

    public static Class18 method874(int i, Class18 class18) {
        anInt3379++;

        Class18 class18_9_ = Class37_Sub9_Sub17.method834(class18, false);

        if (class18_9_ == null) {
            class18_9_ = class18.aClass18_413;
        }

        int i_10_ = -27 / ((i - -82) / 32);

        return class18_9_;
    }
}
