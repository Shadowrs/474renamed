/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class87 {
    public static int anInt1584;
    public static int anInt1585;
    public static int anInt1586;
    public static int[] anIntArray1587 = { 0, 1, 2, 3 };
    public static volatile long aLong1588;
    public static int anInt1589;
    public static JString aJString_1590 = Class37_Sub2.method332((byte) 105,
            "Wordpack geladen)3");
    public static int anInt1591;
    public static JString aJString_1592;
    public static int anInt1593;

    static {
        aLong1588 = 0L;
        aJString_1592 = Class37_Sub2.method332((byte) 110, "<br>(X");
    }

    public static void method1325(int baseX, int baseY, int zCoord, int i_2_, int i_3_, int i_4_, Stream stream, int i_5_) {
        anInt1586++;
	if ((i_2_ >= 0) && (i_2_ < 104) && (i_5_ >= 0) && (i_5_ < 104)) {
            Class1.aByteArrayArrayArray63[i_3_][i_2_][i_5_] = (byte) 0;

            for (;;) {
                int i_6_ = stream.method978(120);
                if ((i_6_ ^ 0xffffffff) == -1) {
                    if ((i_3_ ^ 0xffffffff) != -1) {
                        Class64.anIntArrayArrayArray1217[i_3_][i_2_][i_5_] = -240 +
                            (Class64.anIntArrayArrayArray1217[-1 + i_3_][i_2_][i_5_]);
                    } else {
                        Class64.anIntArrayArrayArray1217[0][i_2_][i_5_] = 8 * -Class82.method1305(baseY +
                                i_5_ + 556238, true, baseX + 932731 + i_2_);


                    }

                    break;
                }

                if (i_6_ == 1) {
                    int i_7_ = stream.method978(120);

                    if ((i_7_ ^ 0xffffffff) == -2) {
                        i_7_ = 0;
                    }

                    if (i_3_ == 0) {
                        Class64.anIntArrayArrayArray1217[0][i_2_][i_5_] = -i_7_ * 8;
                    } else {
                        Class64.anIntArrayArrayArray1217[i_3_][i_2_][i_5_] = -(8 * i_7_) +
                            (Class64.anIntArrayArrayArray1217[i_3_ + -1][i_2_][i_5_]);
                    }

                    break;
                }

                if (i_6_ <= 49) {
                    Class15.aByteArrayArrayArray283[i_3_][i_2_][i_5_] = stream.method982((byte) 110);//grindys, vanduo, takai ir stuff :)

                    Class52_Sub1.aByteArrayArrayArray2306[i_3_][i_2_][i_5_] = (byte) ((-2 + i_6_) / 4);//kazkas su grindu kvadrateliu karpymu (kad neislystu is sienu)

                    Class37_Sub3_Sub3.aByteArrayArrayArray2391[i_3_][i_2_][i_5_] = (byte) Class37_Sub4_Sub7.method490(3, zCoord + (-2 + i_6_));//kazkas su kvadrateliu apsukimu
                } else if (i_6_ <= 81) {//kazkas susije su vaiksciojimu
                    Class1.aByteArrayArrayArray63[i_3_][i_2_][i_5_] = (byte) (-49 + i_6_);
                } else {
                    Class84.aByteArrayArrayArray1526[i_3_][i_2_][i_5_] = (byte) (-81 + i_6_);
                }
            }
        } else {
            for (;;) {
                int i_8_ = stream.method978(120);

                if (i_8_ == 0) {
                    break;
                }

                if ((i_8_ ^ 0xffffffff) == -2) {
                    stream.method978(i_4_ + 10012);

                    break;
                }

                if ((i_8_ ^ 0xffffffff) >= -50) {
                    stream.method978(122);
                }
            }
        }

        if (i_4_ != -9890) {
            aJString_1592 = null;
        }
    }

    public static void method1326(boolean bool) {
        aJString_1592 = null;
        anIntArray1587 = null;

        if (bool != true) {
            method1329(36, false);
        }

        aJString_1590 = null;
    }

    public static boolean method1327(JString jstring, int i) {
        anInt1589++;

        if (jstring == null) {
            return false;
        }

        int i_9_ = -109 / ((i - 21) / 57);

        for (int i_10_ = 0;
                (RSApplet.anInt173 ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
                i_10_++) {
            if (jstring.method159(Class69.aJStringArray1342[i_10_], (byte) 124)) {
                return true;
            }
        }

        if (jstring.method159(
                    (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aJString_3993),
                    (byte) 95)) {
            return true;
        }

        return false;
    }

    public static void method1328(boolean bool) {
        if (bool != true) {
            aJString_1590 = null;
        }

        anInt1593++;
        Class37_Sub4_Sub7_Sub1.aClass13_3670 = new Class13(32);
    }

    public static int method1329(int i, boolean bool) {
        int i_11_ = (((i * i) >> -1531677876) * i) >> -358131636;
        anInt1585++;

        if (bool != true) {
            method1327(null, -23);
        }

        int i_12_ = (6 * i) + -61440;
        int i_13_ = 40960 + ((i * i_12_) >> 1812148076);

        return (i_11_ * i_13_) >> -997591796;
    }

    public static void method1330(int i, int i_14_) {
        anInt1584++;

        if ((i != -1) && Class37_Sub10.method927(i, i_14_ + 27373)) {
            Class18[] class18s = Class37_Sub9_Sub29.aClass18ArrayArray3454[i];

            if (i_14_ == -50) {
                for (int i_15_ = 0;
                        (class18s.length ^ 0xffffffff) < (i_15_ ^ 0xffffffff);
                        i_15_++) {
                    Class18 class18 = class18s[i_15_];

                    if (class18.anObjectArray433 != null) {
                        Class37_Sub8 class37_sub8 = new Class37_Sub8();
                        class37_sub8.aClass18_1925 = class18;

                        class37_sub8.anObjectArray1938 = class18.anObjectArray433;
                        Class37_Sub9_Sub4.method776(class37_sub8, -53, 2000000);
                    }
                }
            }
        }
    }
}
