/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class89 {
    public static JString aJString_1610;
    public static JString aJString_1612;
    public static JString aJString_1613;
    public static JString aJString_1615;
    public static JString aJString_1616;
    public static JString aJString_1618 = Class37_Sub2.method332((byte) 117,
            "and choose the (Wcreate account(W");
    public static long aLong1619;
    public static int anInt1620;

    static {
        aJString_1615 = (Class37_Sub2.method332((byte) 102,
                " steht bereits auf Ihrer Freunde)2Liste(Q"));

        aJString_1613 = Class37_Sub2.method332((byte) 105,
                "wishes to duel with you)3");
        aJString_1616 = aJString_1618;
        aJString_1610 = aJString_1613;
        aJString_1612 = Class37_Sub2.method332((byte) 101, "::");
        aLong1619 = 0L;
    }

    public int anInt1611;
    public int anInt1614;
    public int anInt1617;
    public int anInt1621;

    public Class89() {
        /* empty */
    }

    public Class89(Class89 class89_1_) {
        anInt1617 = class89_1_.anInt1617;
        anInt1611 = class89_1_.anInt1611;
        anInt1621 = class89_1_.anInt1621;
        anInt1614 = class89_1_.anInt1614;
    }

    public static void method1335(int i) {
        if (i == 0) {
            aJString_1612 = null;
            aJString_1616 = null;
            aJString_1615 = null;
            aJString_1610 = null;
            aJString_1618 = null;
            aJString_1613 = null;
        }
    }

    public static boolean method1336(Class15 class15, int i, int i_0_) {
        anInt1620++;

        byte[] is = class15.method111(i_0_, (byte) 94);

        if (is == null) {
            return false;
        }

        Class49.method1111(false, is);

        if (i <= 55) {
            return false;
        }

        return true;
    }
}
