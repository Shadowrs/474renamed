/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class65 {
    public static int anInt1220;
    public static RSApplet aClass9_1221;
    public static int anInt1222;
    public static int anInt1223;
    public static int anInt1224;
    public static JString aJString_1225 = Class37_Sub2.method332((byte) 109,
            ")4lang)4de");
    public static JString aJString_1226 = Class37_Sub2.method332((byte) 116, "M");
    public static int anInt1227;
    public static JString aJString_1228 = aJString_1226;
    public static int[] anIntArray1229 = new int[5];
    public static int anInt1230;
    public static int anInt1231;
    public static JString aJString_1232;
    public static int anInt1233;
    public static int anInt1234;
    public static JString aJString_1235 = aJString_1226;
    public static int anInt1239;
    public static int anInt1241;
    public static JString aJString_1242;

    static {
        aJString_1232 = Class37_Sub2.method332((byte) 109, "Okay");
        anInt1241 = 50;
        aClass9_1221 = new RSApplet();

        aJString_1242 = (Class37_Sub2.method332((byte) 108,
                "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3"));
    }

    public Class37_Sub4 aClass37_Sub4_1219 = new Class37_Sub4();
    public Class13 aClass13_1236;
    public Class77 aClass77_1237 = new Class77();
    public int anInt1238;
    public int anInt1240;

    public Class65(int i) {
        anInt1238 = i;
        anInt1240 = i;

        int i_7_;

        for (i_7_ = 1; ((i_7_ + i_7_) ^ 0xffffffff) > (i ^ 0xffffffff);
                i_7_ += i_7_) {
            /* empty */
        }

        aClass13_1236 = new Class13(i_7_);
    }

    public Class37 method1177(int i) {
        if (i != -5) {
            return null;
        }

        anInt1233++;

        return aClass13_1236.method102((byte) 67);
    }

    public static void method1178(int i) {
        anIntArray1229 = null;
        aJString_1235 = null;

        if (i <= 41) {
            anInt1241 = -111;
        }

        aJString_1226 = null;
        aClass9_1221 = null;
        aJString_1228 = null;
        aJString_1242 = null;
        aJString_1225 = null;
        aJString_1232 = null;
    }

    public void method1179(long l, int i, Class37_Sub4 class37_sub4) {
        try {
            if ((anInt1238 ^ 0xffffffff) != -1) {
                anInt1238--;
            } else {
                Class37_Sub4 class37_sub4_0_ = aClass77_1237.method1289((byte) -49);
                class37_sub4_0_.method322(false);
                class37_sub4_0_.method438(false);

                if (class37_sub4_0_ == aClass37_Sub4_1219) {
                    class37_sub4_0_ = aClass77_1237.method1289((byte) -49);
                    class37_sub4_0_.method322(false);
                    class37_sub4_0_.method438(false);
                }
            }

            aClass13_1236.method101(class37_sub4, false, l);
            anInt1224++;

            if (i != -4) {
                anInt1240 = -97;
            }

            aClass77_1237.method1293(464, class37_sub4);
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("rc.J(" + l + ',' + i + ',' +
                ((class37_sub4 != null) ? "{...}" : "null") + ')'));
        }
    }

    public Class37 method1180(boolean bool) {
        anInt1230++;

        if (bool != true) {
            aClass9_1221 = null;
        }

        return aClass13_1236.method94(124);
    }

    public Class37_Sub4 method1181(byte i, long l) {
        try {
            anInt1227++;

            Class37_Sub4 class37_sub4 = (Class37_Sub4) aClass13_1236.method100((byte) 36,
                    l);

            if (class37_sub4 != null) {
                aClass77_1237.method1293(464, class37_sub4);
            }

            if (i < 9) {
                return null;
            }

            return class37_sub4;
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("rc.I(" + i + ',' + l + ')'));
        }
    }

    public static void method1182(boolean bool) {
        anInt1220++;
        Class52_Sub1.anInt2303 = 0;

        int i = (Class37_Sub18.anInt2200 +
            (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666 >> -1183036505));

        if (bool != false) {
            method1183(43, (byte) -43);
        }

        int i_1_ = (Class15_Sub1.anInt1738 +
            (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642 >> -1579329017));

        if ((i >= 3053) && ((i ^ 0xffffffff) >= -3157) && (i_1_ >= 3056) &&
                (i_1_ <= 3136)) {
            Class52_Sub1.anInt2303 = 1;
        }

        if ((i >= 3072) && (i <= 3118) && (i_1_ >= 9492) &&
                ((i_1_ ^ 0xffffffff) >= -9536)) {
            Class52_Sub1.anInt2303 = 1;
        }

        if ((Class52_Sub1.anInt2303 == 1) && ((i ^ 0xffffffff) <= -3140) &&
                ((i ^ 0xffffffff) >= -3200) && (i_1_ >= 3008) &&
                (i_1_ <= 3062)) {
            Class52_Sub1.anInt2303 = 0;
        }
    }

    public static void method1183(int i, byte i_2_) {
        anInt1222++;
        Class37_Sub9_Sub15.method822((byte) 96);
        Class1.method42((byte) -119);

        int i_3_ = Class37_Sub4_Sub18.method730(-9094, i).anInt2808;

        if (i_2_ != -3) {
            aJString_1235 = null;
        }

        if ((i_3_ ^ 0xffffffff) != -1) {
            int i_4_ = Class37_Sub23.anIntArray2237[i];

            if ((i_3_ ^ 0xffffffff) == -2) {
                if (i_4_ == 1) {
                    Class37_Sub4_Sub9_Sub4.method666(0.9F);
                }

                if ((i_4_ ^ 0xffffffff) == -3) {
                    Class37_Sub4_Sub9_Sub4.method666(0.8F);
                }

                if (i_4_ == 3) {
                    Class37_Sub4_Sub9_Sub4.method666(0.7F);
                }

                if (i_4_ == 4) {
                    Class37_Sub4_Sub9_Sub4.method666(0.6F);
                }

                Class37_Sub4_Sub12.method693(i_2_ ^ ~0x74);
            }

            if ((i_3_ ^ 0xffffffff) == -4) {
                int i_5_ = 0;

                if (i_4_ == 0) {
                    i_5_ = 255;
                }

                if ((i_4_ ^ 0xffffffff) == -2) {
                    i_5_ = 192;
                }

                if (i_4_ == 2) {
                    i_5_ = 128;
                }

                if (i_4_ == 3) {
                    i_5_ = 64;
                }

                if ((i_4_ ^ 0xffffffff) == -5) {
                    i_5_ = 0;
                }

                if ((i_5_ ^ 0xffffffff) != (Class37_Sub9_Sub17.anInt3223 ^
                        0xffffffff)) {
                    if ((Class37_Sub9_Sub17.anInt3223 != 0) ||
                            ((Class77.anInt1442 ^ 0xffffffff) == 0)) {
                        if (i_5_ != 0) {
                            Class59.method1164(32701, i_5_);
                        } else {
                            Class37_Sub9_Sub4.method778(false);
                            Class55.aBoolean1071 = false;
                        }
                    } else {
                        JS5.method120(i_5_, 0, false, -15793,
                            Class54.aClass15_Sub1_1060, Class77.anInt1442);
                        Class55.aBoolean1071 = false;
                    }

                    Class37_Sub9_Sub17.anInt3223 = i_5_;
                }
            }

            if (i_3_ == 10) {
                if (i_4_ == 0) {
                    Class43.anInt957 = 127;
                }

                if ((i_4_ ^ 0xffffffff) == -2) {
                    Class43.anInt957 = 96;
                }

                if ((i_4_ ^ 0xffffffff) == -3) {
                    Class43.anInt957 = 64;
                }

                if (i_4_ == 3) {
                    Class43.anInt957 = 32;
                }

                if ((i_4_ ^ 0xffffffff) == -5) {
                    Class43.anInt957 = 0;
                }
            }

            if (i_3_ == 9) {
                Class37_Sub4_Sub10.anInt2677 = i_4_;
            }

            if (i_3_ == 5) {
                Class37_Sub2.anInt1825 = i_4_;
            }

            if (i_3_ == 4) {
                if ((i_4_ ^ 0xffffffff) == -1) {
                    Canvas_Sub1.anInt45 = 127;
                }

                if (i_4_ == 1) {
                    Canvas_Sub1.anInt45 = 96;
                }

                if ((i_4_ ^ 0xffffffff) == -3) {
                    Canvas_Sub1.anInt45 = 64;
                }

                if (i_4_ == 3) {
                    Canvas_Sub1.anInt45 = 32;
                }

                if (i_4_ == 4) {
                    Canvas_Sub1.anInt45 = 0;
                }
            }

            if ((i_3_ ^ 0xffffffff) == -7) {
                Class59.anInt1130 = i_4_;
            }
        }
    }

    public void method1184(long l, byte i) {
        do {
            try {
                anInt1223++;

                if (i != -63) {
                    aJString_1225 = null;
                }

                Class37_Sub4 class37_sub4 = (Class37_Sub4) aClass13_1236.method100((byte) 58,
                        l);

                if (class37_sub4 == null) {
                    break;
                }

                class37_sub4.method322(false);
                class37_sub4.method438(false);
                anInt1238++;
            } catch (RuntimeException runtimeexception) {
                throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                    ("rc.B(" + l + ',' + i + ')'));
            }

            break;
        } while (false);
    }

    public static boolean method1185(int i, int i_6_) {
        if (i >= -66) {
            return false;
        }

        anInt1234++;

        if ((0x1 & i_6_) == 0) {
            return false;
        }

        return true;
    }

    public void method1186(int i) {
        anInt1239++;

        for (;;) {
            Class37_Sub4 class37_sub4 = aClass77_1237.method1289((byte) -49);

            if (class37_sub4 == null) {
                break;
            }

            class37_sub4.method322(false);
            class37_sub4.method438(false);
        }

        if (i != 3056) {
            aJString_1225 = null;
        }

        anInt1238 = anInt1240;
    }
}
