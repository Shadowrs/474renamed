/* Class37_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.Canvas;


public abstract class Class37_Sub9 extends Class37 {
    public static int anInt1944;
    public static JString aJString_1945;
    public static int anInt1948;
    public static int anInt1950;
    public static int[] anIntArray1951;
    public static int anInt1952;
    public static int anInt1953;
    public static Class22 aClass22_1954;
    public static int anInt1956;
    public static boolean aBoolean1957 = false;
    public static int anInt1958;
    public static JString aJString_1959 = Class37_Sub2.method332((byte) 115,
            "AUS");
    public static int anInt1960;
    public static int anInt1961;
    public static int anInt1962;
    public static int anInt1963;
    public static int[] anIntArray1964 = new int[32];
    public static int anInt1965;
    public static Canvas aCanvas1967;
    public static JString aJString_1968;
    public static JString aJString_1969;
    public static JString aJString_1970;
    public static JString aJString_1971;
    public static int anInt1972;
    public static JString aJString_1973;
    public static int anInt1974;
    public static int anInt1975;
    public static int anInt1976;
    public static int anInt1977;
    public static int anInt1978;
    public static int anInt1979;

    static {
        anInt1956 = 0;
        aJString_1970 = (Class37_Sub2.method332((byte) 123,
                "Please check your message)2centre for details)3"));
        aJString_1945 = aJString_1970;
        anInt1979 = 0;
        aJString_1968 = Class37_Sub2.method332((byte) 121, "mapfunction");

        aJString_1969 = Class37_Sub2.method332((byte) 103,
                "Please use a different world)3");
        aJString_1971 = aJString_1969;
        aJString_1973 = aJString_1969;
    }

    public boolean aBoolean1943;
    public Class33 aClass33_1946;
    public Class37_Sub9[] aClass37_Sub9Array1947;
    public int anInt1949;
    public int anInt1955;
    public Class38 aClass38_1966;

    public Class37_Sub9(int i, boolean bool) {
        aClass37_Sub9Array1947 = new Class37_Sub9[i];
        aBoolean1943 = bool;
    }

    public static void method749(int i) {
        anIntArray1964 = null;
        aCanvas1967 = null;

        if (i == 17106) {
            aJString_1970 = null;
            aJString_1971 = null;
            aJString_1968 = null;
            anIntArray1951 = null;
            aJString_1973 = null;
            aJString_1969 = null;
            aJString_1945 = null;
            aClass22_1954 = null;
            aJString_1959 = null;
        }
    }

    public void method750(Stream stream, int i, boolean bool) {
        anInt1978++;

        if (bool != true) {
            method751(64, -123, 36);
        }
    }

    public void method751(int i, int i_0_, int i_1_) {
        anInt1950++;

        int i_2_ = (anInt1949 != 255) ? anInt1949 : i;

        if (aBoolean1943) {
            aClass38_1966 = new Class38(i_2_, i, i_0_);
        } else {
            aClass33_1946 = new Class33(i_2_, i, i_0_);
        }

        if (i_1_ != -10) {
            method762(-3, 78, (byte) 7);
        }
    }

    public void method752(int i) {
        anInt1974++;

        if (i != -2) {
            method761(19, -36);
        }
    }

    public static void method753(int i) {
        anInt1944++;

        if ((Class37_Sub25.aClass18_2285 == null) && (i == -2) &&
                (Class37_Sub7.aClass18_1894 == null)) {
            int i_3_ = Class37_Sub9_Sub28.anInt3440;

            if (Class37_Sub20.aBoolean2220) {
                if ((i_3_ ^ 0xffffffff) != -2) {
                    int i_4_ = Class37_Sub4_Sub7_Sub7.anInt3851;
                    int i_5_ = Class37_Sub9_Sub1.anInt2914;

                    if (((i_4_ ^ 0xffffffff) > ((-10 +
                            Class37_Sub4_Sub13.anInt2794) ^ 0xffffffff)) ||
                            ((Class37_Sub4_Sub13.anInt2794 +
                            (Class37_Sub9_Sub24.anInt3377 + 10)) < i_4_) ||
                            ((Class15_Sub1.anInt1753 + -10) > i_5_) ||
                            (((10 + Class37_Sub5.anInt1878 +
                            Class15_Sub1.anInt1753) ^ 0xffffffff) > (i_5_ ^
                            0xffffffff))) {
                        Class37_Sub20.aBoolean2220 = false;
                        Class37_Sub7.method740(Class37_Sub9_Sub24.anInt3377,
                            Class37_Sub4_Sub13.anInt2794,
                            Class15_Sub1.anInt1753, Class37_Sub5.anInt1878,
                            16711680);
                    }
                }

                if (i_3_ == 1) {
                    int i_6_ = Class15_Sub1.anInt1753;
                    int i_7_ = Class37_Sub4_Sub13.anInt2794;
                    int i_8_ = Class33.anInt764;
                    int i_9_ = Class37_Sub9_Sub24.anInt3377;
                    int i_10_ = Class37_Sub13.anInt2113;
                    int i_11_ = -1;

                    for (int i_12_ = 0; Class37_Sub9_Sub13.anInt3134 > i_12_;
                            i_12_++) {
                        int i_13_ = ((15 * (-1 + Class37_Sub9_Sub13.anInt3134 +
                            -i_12_)) + (i_6_ + 31));

                        if (((i_7_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) &&
                                ((i_9_ + i_7_) > i_8_) &&
                                (((-13 + i_13_) ^ 0xffffffff) > (i_10_ ^
                                0xffffffff)) && ((3 + i_13_) > i_10_)) {
                            i_11_ = i_12_;
                        }
                    }

                    if ((i_11_ ^ 0xffffffff) != 0) {
                        Class37_Sub5.method738((byte) -110, i_11_);
                    }

                    Class37_Sub20.aBoolean2220 = false;
                    Class37_Sub7.method740(Class37_Sub9_Sub24.anInt3377,
                        Class37_Sub4_Sub13.anInt2794, Class15_Sub1.anInt1753,
                        Class37_Sub5.anInt1878, 16711680);
                }
            } else {
                if (((i_3_ ^ 0xffffffff) == -2) &&
                        (Class37_Sub9_Sub13.anInt3134 > 0)) {
                    int i_14_ = (Class37_Sub9_Sub20.anIntArray3300[-1 +
                        Class37_Sub9_Sub13.anInt3134]);

                    if ((i_14_ == 37) || ((i_14_ ^ 0xffffffff) == -40) ||
                            ((i_14_ ^ 0xffffffff) == -42) || (i_14_ == 58) ||
                            ((i_14_ ^ 0xffffffff) == -22) ||
                            ((i_14_ ^ 0xffffffff) == -39) || (i_14_ == 30) ||
                            (i_14_ == 12) || ((i_14_ ^ 0xffffffff) == -44) ||
                            ((i_14_ ^ 0xffffffff) == -58) ||
                            ((i_14_ ^ 0xffffffff) == -6) ||
                            ((i_14_ ^ 0xffffffff) == -1006)) {
                        int i_15_ = (Class37_Sub4_Sub14.anIntArray2809[-1 +
                            Class37_Sub9_Sub13.anInt3134]);
                        int i_16_ = (Class58.anIntArray1128[-1 +
                            Class37_Sub9_Sub13.anInt3134]);
                        Class18 class18 = Class37_Sub9_Sub14.method820(i_15_,
                                i ^ ~0x1001);

                        if (method754(RuntimeException_Sub1.method1339(
                                        class18, i + 27), 31) ||
                                (Class42.method1078(-32,
                                    RuntimeException_Sub1.method1339(class18, 25)))) {
                            Class79.anInt1495 = 0;
                            Class77.aBoolean1454 = false;

                            if (Class37_Sub25.aClass18_2285 != null) {
                                Class73.method1274(Class37_Sub25.aClass18_2285,
                                    -1);
                            }

                            Class37_Sub25.aClass18_2285 = Class37_Sub9_Sub14.method820(i_15_,
                                    4096);
                            anInt1979 = i_16_;
                            Stream.anInt2009 = Class33.anInt764;

                            Class37_Sub4_Sub12.anInt2784 = Class37_Sub13.anInt2113;
                            Class73.method1274(Class37_Sub25.aClass18_2285, -1);

                            return;
                        }
                    }
                }

                if (((i_3_ ^ 0xffffffff) == -2) &&
                        ((((Class37_Sub2.anInt1825 ^ 0xffffffff) == -2) &&
                        (Class37_Sub9_Sub13.anInt3134 > 2)) ||
                        Class88.method1331((-1 + Class37_Sub9_Sub13.anInt3134),
                            2000))) {
                    i_3_ = 2;
                }

                if (((i_3_ ^ 0xffffffff) == -2) &&
                        ((Class37_Sub9_Sub13.anInt3134 ^ 0xffffffff) < -1)) {
                    Class37_Sub5.method738((byte) -86,
                        Class37_Sub9_Sub13.anInt3134 + -1);
                }

                if (((i_3_ ^ 0xffffffff) == -3) &&
                        ((Class37_Sub9_Sub13.anInt3134 ^ 0xffffffff) < -1)) {
                    Class37_Sub9_Sub24.method868(i + 106);
                }
            }
        }
    }

    public static boolean method754(int i, int i_17_) {
        anInt1976++;

        if (i_17_ < 8) {
            method749(125);
        }

        if (((i >> -436260420) & 0x1) == 0) {
            return false;
        }

        return true;
    }

    public void method755(byte i) {
        if (!aBoolean1943) {
            aClass33_1946.method301(2);
            aClass33_1946 = null;
        } else {
            aClass38_1966.method1057((byte) -92);
            aClass38_1966 = null;
        }

        if (i < 98) {
            method758(-98);
        }

        anInt1965++;
    }

    public static boolean method756(int i) {
        anInt1972++;

        if (i < 125) {
            return true;
        }

        if (Class37_Sub7.anInt1904 != 0) {
            return true;
        }

        return Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method376(75);
    }

    public int method757(int i) {
        if (i <= 70) {
            method753(-97);
        }

        anInt1960++;

        return -1;
    }

    public int method758(int i) {
        if (i != -30563) {
            aBoolean1957 = false;
        }

        anInt1962++;

        return -1;
    }

    public int[][] method759(byte i, int i_18_) {
        if (i < 111) {
            anInt1949 = -34;
        }

        anInt1975++;
        throw new IllegalStateException(
            "This operation does not have a colour output");
    }

    public int[] method760(int i, int i_19_, int i_20_) {
        if (i_20_ > -27) {
            aBoolean1957 = false;
        }

        anInt1977++;

        if (!aClass37_Sub9Array1947[i_19_].aBoolean1943) {
            return aClass37_Sub9Array1947[i_19_].method759((byte) 119, i)[0];
        }

        return aClass37_Sub9Array1947[i_19_].method761(-127, i);
    }

    public int[] method761(int i, int i_21_) {
        if (i >= -125) {
            anInt1948 = 60;
        }

        anInt1952++;
        throw new IllegalStateException(
            "This operation does not have a monochrome output");
    }

    public int[][] method762(int i, int i_22_, byte i_23_) {
        if (i_23_ >= -75) {
            return null;
        }

        anInt1963++;

        if (aClass37_Sub9Array1947[i].aBoolean1943) {
            int[] is = aClass37_Sub9Array1947[i].method761(-126, i_22_);
            int[][] is_24_ = new int[3][];
            is_24_[2] = is;
            is_24_[1] = is;
            is_24_[0] = is;

            return is_24_;
        }

        return aClass37_Sub9Array1947[i].method759((byte) 125, i_22_);
    }
}
