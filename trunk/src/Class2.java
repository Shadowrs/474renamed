/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class2 {
    public static int anInt73;
    public static int anInt74;
    public static int anInt75 = 0;
    public static int anInt76;
    public static Class47 aClass47_77;
    public static JString aJString_78;
    public static JString aJString_79;
    public static JString aJString_80;
    public static JString aJString_81 = (Class37_Sub2.method332((byte) 117,
            "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q"));
    public static int anInt82;
    public static JString aJString_83;

    static {
        aJString_78 = Class37_Sub2.method332((byte) 125,
                " zuerst von Ihrer Freunde)2Liste(Q");
        anInt82 = 0;
        aJString_80 = Class37_Sub2.method332((byte) 101, "(Y<)4col>");

        aJString_79 = Class37_Sub2.method332((byte) 123, "Loading wordpack )2 ");
        aJString_83 = aJString_79;
    }

    public static void method43(int i, JString jstring, int i_0_) {
        anInt74++;

        if (i_0_ > -26) {
            aJString_80 = null;
        }

        boolean bool = false;
        JString jstring_1_ = jstring.method167(-1).method164(70);

        for (int i_2_ = 0; i_2_ < Class19.anInt487; i_2_++) {
            Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[Class26.anIntArray657[i_2_]]);

            if ((class37_sub4_sub7_sub1_sub2 != null) &&
                    (class37_sub4_sub7_sub1_sub2.aJString_3993 != null) &&
                    class37_sub4_sub7_sub1_sub2.aJString_3993.method159(
                        jstring_1_, (byte) 108)) {
                Class37_Sub4.method434((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
                    0, class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
                    (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
                    false, 2, 0, 1, 0,
                    class37_sub4_sub7_sub1_sub2.anIntArray3669[0], 0, 1);
                bool = true;

                if (i != 1) {
                    if ((i ^ 0xffffffff) == -5) {
                        Class37_Sub9_Sub13.anInt3127++;
                        Class42.aStream_Sub1_936.method989(-1494101117,
                            247);
                        Class42.aStream_Sub1_936.method945(19058,
                            Class26.anIntArray657[i_2_]);
                    } else if ((i ^ 0xffffffff) != -7) {
                        if (i == 7) {
                            Class42.aStream_Sub1_936.method989(-1494101117,
                                211);
                            Class42.aStream_Sub1_936.method957(true,
                                Class26.anIntArray657[i_2_]);
                            Class37_Sub9_Sub4.anInt2960++;
                        }
                    } else {
                        Class42.aStream_Sub1_936.method989(-1494101117,
                            244);
                        Class62.anInt1174++;
                        Class42.aStream_Sub1_936.method945(19058,
                            Class26.anIntArray657[i_2_]);
                    }
                } else {
                    RSApplet.anInt184++;
                    Class42.aStream_Sub1_936.method989(-1494101117, 96);
                    Class42.aStream_Sub1_936.method957(true,
                        Class26.anIntArray657[i_2_]);
                }

                break;
            }
        }

        if (!bool) {
            Class37_Sub4_Sub7_Sub1_Sub1.method505(Class37_Sub9_Sub8.aJString_3045,
                0,
                Class37_Sub9_Sub27.method881(-71,
                    (new JString[] { Class37_Sub2.aJString_1821, jstring_1_ })),
                (byte) 87);
        }
    }

    public static void method44(int i) {
        aJString_80 = null;
        aJString_81 = null;
        aJString_83 = null;
        aJString_79 = null;
        aClass47_77 = null;
        aJString_78 = null;

        if (i != 0) {
            method44(81);
        }
    }
}
