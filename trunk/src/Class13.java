/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class13 {
    public static int anInt216 = -2;
    public static int anInt217;
    public static int anInt218;
    public static int anInt219;
    public static int anInt222;
    public static int anInt223;
    public static int anInt224;
    public static int[] anIntArray226;
    public static int anInt227;
    public static int anInt228;
    public static int anInt230 = 0;
    public Class37 aClass37_220;
    public long aLong221;
    public Class37[] aClass37Array225;
    public int anInt229;
    public int anInt231 = 0;
    public Class37 aClass37_232;

    public Class13(int i) {
        anInt229 = i;
        aClass37Array225 = new Class37[i];

        for (int i_14_ = 0; (i ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++) {
            Class37 class37 = aClass37Array225[i_14_] = new Class37();
            class37.aClass37_814 = class37;
            class37.aClass37_821 = class37;
        }
    }

    public Class37 method94(int i) {
        anInt223++;

        int i_0_ = 12 / ((77 - i) / 41);
        anInt231 = 0;

        return method102((byte) 61);
    }

    public static int method95(int i, int i_1_, int i_2_) {
        Class37_Sub13 class37_sub13 = ((Class37_Sub13) Class37_Sub4_Sub7_Sub1.aClass13_3670.method100((byte) 81,
                (long) i));

        if (i_2_ != -1) {
            return -86;
        }

        anInt218++;

        if (class37_sub13 == null) {
            return 0;
        }

        if ((i_1_ ^ 0xffffffff) == 0) {
            return 0;
        }

        int i_3_ = 0;

        for (int i_4_ = 0; i_4_ < class37_sub13.anIntArray2108.length;
                i_4_++) {
            if ((i_1_ ^ 0xffffffff) == (class37_sub13.anIntArray2116[i_4_] ^
                    0xffffffff)) {
                i_3_ += class37_sub13.anIntArray2108[i_4_];
            }
        }

        return i_3_;
    }

    public int method96(int i, Class37[] class37s) {
        anInt222++;

        int i_5_ = i;

        for (int i_6_ = 0; (anInt229 ^ 0xffffffff) < (i_6_ ^ 0xffffffff);
                i_6_++) {
            Class37 class37 = aClass37Array225[i_6_];

            for (Class37 class37_7_ = class37.aClass37_814;
                    class37 != class37_7_;
                    class37_7_ = class37_7_.aClass37_814)
                class37s[i_5_++] = class37_7_;
        }

        return i_5_;
    }

    public int method97(int i) {
        anInt224++;

        int i_8_ = 0;

        for (int i_9_ = 0; i_9_ < anInt229; i_9_++) {
            Class37 class37 = aClass37Array225[i_9_];
            Class37 class37_10_ = class37.aClass37_814;

            while (class37 != class37_10_) {
                class37_10_ = class37_10_.aClass37_814;
                i_8_++;
            }
        }

        if (i <= 75) {
            method99(true);
        }

        return i_8_;
    }

    public Class37 method98(int i) {
        anInt227++;

        if (aClass37_220 == null) {
            return null;
        }

        if (i != -9410) {
            aClass37Array225 = null;
        }

        for (Class37 class37 = aClass37Array225[(int) (aLong221 &
                (long) (anInt229 + -1))]; aClass37_220 != class37;
                aClass37_220 = aClass37_220.aClass37_814) {
            if (aLong221 == aClass37_220.aLong818) {
                Class37 class37_11_ = aClass37_220;
                aClass37_220 = aClass37_220.aClass37_814;

                return class37_11_;
            }
        }

        aClass37_220 = null;

        return null;
    }

    public static void method99(boolean bool) {
        if (bool != true) {
            method95(-9, 2, -49);
        }

        anIntArray226 = null;
    }

    public Class37 method100(byte i, long l) {
        try {
            anInt217++;
            aLong221 = l;

            Class37 class37 = aClass37Array225[(int) (l &
                (long) (anInt229 + -1))];

            if (i <= 27) {
                return null;
            }

            for (aClass37_220 = class37.aClass37_814; class37 != aClass37_220;
                    aClass37_220 = aClass37_220.aClass37_814) {
                if (aClass37_220.aLong818 == l) {
                    Class37 class37_12_ = aClass37_220;
                    aClass37_220 = aClass37_220.aClass37_814;

                    return class37_12_;
                }
            }

            aClass37_220 = null;

            return null;
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("da.C(" + i + ',' + l + ')'));
        }
    }

    public void method101(Class37 class37, boolean bool, long l) {
        try {
            if (class37.aClass37_821 != null) {
                class37.method322(bool);
            }

            anInt219++;

            Class37 class37_13_ = aClass37Array225[(int) (l &
                (long) (anInt229 + -1))];
            class37.aClass37_821 = class37_13_.aClass37_821;
            class37.aLong818 = l;

            if (bool == false) {
                class37.aClass37_814 = class37_13_;
                class37.aClass37_821.aClass37_814 = class37;
                class37.aClass37_814.aClass37_821 = class37;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("da.G(" + ((class37 != null) ? "{...}" : "null") + ',' + bool +
                ',' + l + ')'));
        }
    }

    public Class37 method102(byte i) {
        if (i <= 0) {
            anInt229 = 46;
        }

        anInt228++;

        if (((anInt231 ^ 0xffffffff) < -1) &&
                (aClass37Array225[anInt231 - 1] != aClass37_232)) {
            Class37 class37 = aClass37_232;
            aClass37_232 = class37.aClass37_814;

            return class37;
        }

        while (anInt231 < anInt229) {
            Class37 class37 = aClass37Array225[anInt231++].aClass37_814;

            if (aClass37Array225[anInt231 - 1] != class37) {
                aClass37_232 = class37.aClass37_814;

                return class37;
            }
        }

        return null;
    }
}
