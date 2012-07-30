/* Class37_Sub4_Sub7_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub4_Sub7_Sub7 extends Class37_Sub4_Sub7 {
    public static JS5 aClass15_3837;
    public static int anInt3841;
    public static int[] anIntArray3842 = new int[100];
    public static JString aJString_3844;
    public static int anInt3845;
    public static JString aJString_3846;
    public static int anInt3849 = 0;
    public static int anInt3850 = 0;
    public static int anInt3851 = 0;
    public static int anInt3852;
    public static Class37_Sub4_Sub9_Sub1[] aClass37_Sub4_Sub9_Sub1Array3853;

    static {
        aJString_3846 = Class37_Sub2.method332((byte) 106, "Examine");
        aJString_3844 = aJString_3846;
    }

    public int anInt3838 = 0;
    public int anInt3839;
    public boolean aBoolean3840;
    public int anInt3843;
    public int anInt3847;
    public int anInt3848 = 0;
    public Class37_Sub4_Sub12 aClass37_Sub4_Sub12_3854;
    public int anInt3855;
    public int anInt3856;
    public int anInt3857;

    public Class37_Sub4_Sub7_Sub7(int i, int i_1_, int i_2_, int i_3_,
        int i_4_, int i_5_, int i_6_) {
        aBoolean3840 = false;
        anInt3847 = i_2_;
        anInt3856 = i_3_;
        anInt3857 = i_4_;
        anInt3843 = i_5_ + i_6_;
        anInt3839 = i;
        anInt3855 = i_1_;

        int i_7_ = Class76.method1285((byte) 126, anInt3839).anInt2897;

        if (i_7_ == -1) {
            aBoolean3840 = true;
        } else {
            aBoolean3840 = false;

            aClass37_Sub4_Sub12_3854 = Class37_Sub9_Sub22.method861(-107, i_7_);
        }
    }

    public static void method569(int i) {
        aClass37_Sub4_Sub9_Sub1Array3853 = null;
        aJString_3846 = null;

        if (i == 6237) {
            aClass15_3837 = null;
            anIntArray3842 = null;
            aJString_3844 = null;
        }
    }

    public void method570(int i, byte i_0_) {
        anInt3845++;

        if (i_0_ != 84) {
            anInt3838 = -4;
        }

        if (!aBoolean3840) {
            anInt3848 += i;

            while (aClass37_Sub4_Sub12_3854.anIntArray2780[anInt3838] < anInt3848) {
                anInt3848 -= aClass37_Sub4_Sub12_3854.anIntArray2780[anInt3838];
                anInt3838++;

                if ((aClass37_Sub4_Sub12_3854.anIntArray2761.length ^
                        0xffffffff) >= (anInt3838 ^ 0xffffffff)) {
                    aBoolean3840 = true;

                    break;
                }
            }
        }
    }

    public Class37_Sub4_Sub7_Sub6 method493(boolean bool) {
        anInt3852++;

        Class37_Sub4_Sub18 class37_sub4_sub18 = Class76.method1285((byte) 105,
                anInt3839);

        if (bool != true) {
            return null;
        }

        Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6;

        if (aBoolean3840) {
            class37_sub4_sub7_sub6 = class37_sub4_sub18.method731(-1, true);
        } else {
            class37_sub4_sub7_sub6 = class37_sub4_sub18.method731(anInt3838,
                    bool);
        }

        if (class37_sub4_sub7_sub6 == null) {
            return null;
        }

        return class37_sub4_sub7_sub6;
    }
}
