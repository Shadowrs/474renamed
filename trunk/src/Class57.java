/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class57 {
    public static Class29 aClass29_1098;
    public static long[] aLongArray1099 = new long[100];
    public static int anInt1100;
    public static int anInt1101;

    static {
        aClass29_1098 = new Class29();
    }

    public static void method1146(int i, int i_0_) {
        anInt1100++;

        for (Class37_Sub10 class37_sub10 = (Class37_Sub10) Class62.aClass13_1177.method94(
                    123); class37_sub10 != null;
                class37_sub10 = ((Class37_Sub10) Class62.aClass13_1177.method102(
                        (byte) 63))) {
            if (((long) i ^ 0xffffffffffffffffL) == ((0xffffL &
                    (class37_sub10.aLong818 >> 1632300400)) ^
                    0xffffffffffffffffL)) {
                class37_sub10.method322(false);
            }
        }

        if (i_0_ <= 6) {
            aClass29_1098 = null;
        }
    }

    public static void method1147(int i) {
        aClass29_1098 = null;
        aLongArray1099 = null;

        int i_1_ = 39 / ((i - 54) / 61);
    }
}
