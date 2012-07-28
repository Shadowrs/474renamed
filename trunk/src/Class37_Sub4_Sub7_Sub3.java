/* Class37_Sub4_Sub7_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub4_Sub7_Sub3 extends Class37_Sub4_Sub7 {
    public static JString aJString_3736;
    public static boolean aBoolean3738 = false;
    public static JString aJString_3739;
    public static Class15_Sub1 aClass15_Sub1_3740;
    public static JString aJString_3741;
    public static int anInt3742;
    public static int anInt3743;
    public static int anInt3744;
    public static JString aJString_3745;
    public static JString aJString_3746;
    public static JString aJString_3747;
    public static boolean[] aBooleanArray3748;
    public static JString aJString_3749;
    public static JString aJString_3750;
    public static JString aJString_3751;
    public static int anInt3753;
    public static JString aJString_3754;
    public static JString aJString_3755;

    static {
        aJString_3736 = Class37_Sub2.method332((byte) 120,
                "Please wait 1 minute and try again)3");
        aJString_3745 = aJString_3736;

        aJString_3747 = Class37_Sub2.method332((byte) 106,
                "Bitte versuchen Sie es erneut)3");

        aBooleanArray3748 = new boolean[] {
                true, true, true, true, true, true, true, true, true, true, true,
                true, true, true, true, true, true, true, true, true, true, true,
                true, false, false
            };

        aJString_3741 = Class37_Sub2.method332((byte) 109,
                "Please reload this page)3");

        aJString_3754 = Class37_Sub2.method332((byte) 117,
                " zuerst von Ihrer Ignorieren)2Liste(Q");
        aJString_3750 = Class37_Sub2.method332((byte) 126, ":trade:");

        aJString_3739 = Class37_Sub2.method332((byte) 103,
                "Invalid username or password)3");
        aJString_3749 = aJString_3736;
        aJString_3755 = Class37_Sub2.method332((byte) 103, "mapdots");
        aJString_3751 = aJString_3739;
        aJString_3746 = aJString_3741;
    }

    public int anInt3737;
    public int anInt3752;

    public Class37_Sub4_Sub7_Sub6 method493(boolean bool) {
        if (bool != true) {
            method516(null, null);
        }

        anInt3744++;

        return Class46.method1108(anInt3752, (byte) 115)
                      .method451((byte) -115, anInt3737);
    }

    public static void method515(Class15 class15, Class15 class15_0_, int i) {
        try {
            anInt3753++;
            Class36.aClass15_800 = class15_0_;
            Class37_Sub9_Sub15.aClass15_3159 = class15;
            Class37_Sub2.anInt1832 = Class36.aClass15_800.method129(10000, i);
        } catch (RuntimeException runtimeexception) {
            throw method516(runtimeexception,
                ("f.A(" + ((class15 != null) ? "{...}" : "null") + ',' +
                ((class15_0_ != null) ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    public static RuntimeException_Sub1 method516(Throwable throwable,
        String string) {
        anInt3742++;

        RuntimeException_Sub1 runtimeexception_sub1;

        if (throwable instanceof RuntimeException_Sub1) {
            runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
            runtimeexception_sub1.aString1625 += (' ' + (String) string);
        } else {
            runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
        }

        return runtimeexception_sub1;
    }

    public static void method517(byte i) {
        aJString_3741 = null;
        aJString_3746 = null;
        aJString_3754 = null;
        aJString_3750 = null;
        aJString_3751 = null;
        aJString_3747 = null;
        aClass15_Sub1_3740 = null;
        aJString_3736 = null;
        aJString_3749 = null;

        if (i != 59) {
            method517((byte) -101);
        }

        aJString_3739 = null;
        aBooleanArray3748 = null;
        aJString_3745 = null;
        aJString_3755 = null;
    }
}
