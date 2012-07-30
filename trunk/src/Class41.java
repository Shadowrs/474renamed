/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class41 {
    public static int anInt888;
    public static JString aJString_889;
    public static JString aJString_893;
    public static JString aJString_894;
    public static JString aJString_895;
    public static JString aJString_898;
    public static JString aJString_899;
    public static int anInt900 = 0;
    public static int anInt901;
    public static int[] anIntArray902;
    public static JString aJString_905;
    public static int anInt906;
    public static JString aJString_909;
    public static JString aJString_910;
    public static int[] anIntArray912;

    static {
        aJString_893 = Class37_Sub2.method332((byte) 112, " has logged in)3");
        aJString_895 = Class37_Sub2.method332((byte) 127, "T");

        aJString_905 = Class37_Sub2.method332((byte) 119,
                "Loading interfaces )2 ");
        anIntArray902 = new int[100];
        anInt906 = 0;

        aJString_898 = (Class37_Sub2.method332((byte) 106,
                "Please wait 5 minutes before trying again)3"));
        aJString_899 = aJString_898;

        aJString_894 = Class37_Sub2.method332((byte) 115,
                "Ung-Ultiger Benutzername");
        aJString_889 = aJString_893;
        aJString_909 = aJString_905;
        aJString_910 = Class37_Sub2.method332((byte) 123,
                "http:)4)4www)3runescape)3com");
        anIntArray912 = new int[] { 3, 40, 7, 32, 15, 47, 36, 49 };
    }

    public Class37_Sub4_Sub7 aClass37_Sub4_Sub7_887;
    public int anInt890;
    public int anInt891;
    public Class37_Sub4_Sub7 aClass37_Sub4_Sub7_892;
    public int anInt896;
    public int anInt897;
    public int anInt903 = 0;
    public int anInt904;
    public int anInt907;
    public int anInt908;
    public int anInt911 = 0;

    public static void method1073(int i) {
        aJString_895 = null;
        anIntArray912 = null;
        aJString_899 = null;
        aJString_893 = null;
        aJString_898 = null;
        anIntArray902 = null;
        aJString_889 = null;
        aJString_909 = null;

        if (i != -6321) {
            method1073(107);
        }

        aJString_894 = null;
        aJString_905 = null;
        aJString_910 = null;
    }

    public static void method1074(JS5 class15, int i, boolean bool,
        JString jstring, JString jstring_0_, int i_1_, int i_2_) {
        try {
            anInt888++;

            if (i_1_ != 32) {
                aJString_898 = null;
            }

            int i_3_ = class15.method123((byte) 32, jstring_0_);
            int i_4_ = class15.method128(jstring, i_1_ + -119, i_3_);
            Class37_Sub4_Sub4.method476(i, class15, i_3_, i_2_, bool, true, i_4_);
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("ma.B(" + ((class15 != null) ? "{...}" : "null") + ',' + i +
                ',' + bool + ',' + ((jstring != null) ? "{...}" : "null") +
                ',' + ((jstring_0_ != null) ? "{...}" : "null") + ',' + i_1_ +
                ',' + i_2_ + ')'));
        }
    }
}
