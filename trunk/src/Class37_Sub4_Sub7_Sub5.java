/* Class37_Sub4_Sub7_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub4_Sub7_Sub5 extends Class37_Sub4_Sub7 {
    public static Class65 aClass65_3805;
    public static JString aJString_3806;
    public static JString aJString_3808;
    public static int anInt3809;
    public static JString aJString_3810 = Class37_Sub2.method332((byte) 122,
            "b12_full");
    public static JString aJString_3813;
    public static JString aJString_3814 = Class37_Sub2.method332((byte) 126,
            "Loaded update list");
    public static int anInt3815;
    public static JString aJString_3821;

    static {
        aJString_3806 = Class37_Sub2.method332((byte) 104, "Cabbage");
        aJString_3808 = Class37_Sub2.method332((byte) 117, "null");
        aJString_3821 = aJString_3814;

        aJString_3813 = Class37_Sub2.method332((byte) 103,
                "Die Verbindung konnte");
        aClass65_3805 = new Class65(64);
    }

    public int anInt3804;
    public int anInt3807;
    public int anInt3811;
    public int anInt3812;
    public int anInt3816;
    public int anInt3817;
    public int anInt3818;
    public int anInt3819;
    public Class37_Sub4_Sub12 aClass37_Sub4_Sub12_3820;

    public Class37_Sub4_Sub7_Sub5(int i, int i_11_, int i_12_, int i_13_,
        int i_14_, int i_15_, int i_16_, boolean bool,
        Class37_Sub4_Sub7 class37_sub4_sub7) {
        anInt3818 = i_11_;
        anInt3817 = i_14_;
        anInt3812 = i_15_;
        anInt3807 = i;
        anInt3816 = i_12_;
        anInt3819 = i_13_;

        if (i_16_ != -1) {
            aClass37_Sub4_Sub12_3820 = Class37_Sub9_Sub22.method861(-116, i_16_);
            anInt3804 = 0;
            anInt3811 = -1 + Class37_Sub7.anInt1898;

            if (((aClass37_Sub4_Sub12_3820.anInt2760 ^ 0xffffffff) == -1) &&
                    (class37_sub4_sub7 != null) &&
                    class37_sub4_sub7 instanceof Class37_Sub4_Sub7_Sub5) {
                Class37_Sub4_Sub7_Sub5 class37_sub4_sub7_sub5_17_ = (Class37_Sub4_Sub7_Sub5) class37_sub4_sub7;

                if (class37_sub4_sub7_sub5_17_.aClass37_Sub4_Sub12_3820 == aClass37_Sub4_Sub12_3820) {
                    anInt3804 = class37_sub4_sub7_sub5_17_.anInt3804;
                    anInt3811 = class37_sub4_sub7_sub5_17_.anInt3811;

                    return;
                }
            }

            if (bool &&
                    ((aClass37_Sub4_Sub12_3820.anInt2777 ^ 0xffffffff) != 0)) {
                anInt3804 = (int) ((double) (aClass37_Sub4_Sub12_3820.anIntArray2761).length * Math.random());
                anInt3811 -= (int) ((double) (aClass37_Sub4_Sub12_3820.anIntArray2780[anInt3804]) * Math.random());
            }
        }
    }

    public static Class15_Sub1 method540(boolean bool, boolean bool_0_, int i,
        byte i_1_, boolean bool_2_) {
        anInt3815++;

        CacheIO class69 = null;

        if (Class58.aClass42_1109 != null) {
            class69 = new CacheIO(i, Class58.aClass42_1109,
                    Class37_Sub4_Sub7_Sub1.aClass42Array3699[i], 1000000);
        }

        if (i_1_ < 7) {
            return null;
        }

        return new Class15_Sub1(class69, Class10.aClass69_199, i, bool_2_,
            bool, bool_0_);
    }

    public Class37_Sub4_Sub7_Sub6 method493(boolean bool) {
        if (aClass37_Sub4_Sub12_3820 != null) {
            int i = -anInt3811 + Class37_Sub7.anInt1898;

            if (((i ^ 0xffffffff) < -101) &&
                    (aClass37_Sub4_Sub12_3820.anInt2777 > 0)) {
                i = 100;
            }

            while ((i ^ 0xffffffff) < (aClass37_Sub4_Sub12_3820.anIntArray2780[anInt3804] ^
                    0xffffffff)) {
                i -= aClass37_Sub4_Sub12_3820.anIntArray2780[anInt3804];
                anInt3804++;

                if (aClass37_Sub4_Sub12_3820.anIntArray2761.length <= anInt3804) {
                    anInt3804 -= aClass37_Sub4_Sub12_3820.anInt2777;

                    if (((anInt3804 ^ 0xffffffff) > -1) ||
                            ((anInt3804 ^ 0xffffffff) <= (aClass37_Sub4_Sub12_3820.anIntArray2761.length ^
                            0xffffffff))) {
                        aClass37_Sub4_Sub12_3820 = null;

                        break;
                    }
                }
            }

            anInt3811 = -i + Class37_Sub7.anInt1898;
        }

        ObjectDef objectdef = Class37_Sub9_Sub8.method794(anInt3807,
                28067);

        if (objectdef.anIntArray2702 != null) {
            objectdef = objectdef.method681((byte) 96);
        }

        anInt3809++;

        if (objectdef == null) {
            return null;
        }

        int i;
        int i_3_;

        if ((anInt3816 != 1) && (anInt3816 != 3)) {
            i_3_ = objectdef.tileWidth;
            i = objectdef.tileDepth;
        } else {
            i = objectdef.tileWidth;
            i_3_ = objectdef.tileDepth;
        }

        int i_4_ = anInt3817 + (i_3_ >> 539166945);
        int i_5_ = ((1 + i_3_) >> -381608063) + anInt3817;
        int i_6_ = ((i - -1) >> 922229921) + anInt3812;
        int i_7_ = (i >> -1289991935) + anInt3812;
        int[][] is = Class64.anIntArrayArrayArray1217[anInt3819];

        if (bool != true) {
            return null;
        }

        int i_8_ = ((is[i_4_][i_6_] +
            (is[i_5_][i_7_] + (is[i_4_][i_7_] + is[i_5_][i_6_]))) >> -1001973470);
        int i_9_ = (anInt3817 << 1081967879) - -(i_3_ << -321869690);
        int i_10_ = (i << -1159911866) + (anInt3812 << 1156935911);

        return objectdef.method682(i_10_, i_9_, anInt3818, anInt3804,
            is, i_8_, 52, aClass37_Sub4_Sub12_3820, anInt3816);
    }

    public static void method541(int i) {
        aJString_3821 = null;

        if (i != -1159911866) {
            aJString_3806 = null;
        }

        aJString_3813 = null;
        aJString_3814 = null;
        aJString_3808 = null;
        aClass65_3805 = null;
        aJString_3806 = null;
        aJString_3810 = null;
    }
}
