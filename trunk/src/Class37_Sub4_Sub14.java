/* Class37_Sub4_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub4_Sub14 extends Class37_Sub4 {
    public static JString aJString_2802 = Class37_Sub2.method332((byte) 113,
            "<col=ffffff>");
    public static int anInt2803;
    public static JString aJString_2804;
    public static JS5 aClass15_2805;
    public static JString aJString_2806 = (Class37_Sub2.method332((byte) 103,
            "Clientscript error )2 check log for details"));
    public static int anInt2807;
    public static int[] anIntArray2809 = new int[500];
    public static JString aJString_2810 = Class37_Sub2.method332((byte) 122,
            "Please contact customer support)3");

    static {
        aJString_2804 = aJString_2810;
    }

    public int anInt2808 = 0;

    public void method709(byte i, Stream stream) {
        for (;;) {
            int i_0_ = stream.readByte(124);

            if ((i_0_ ^ 0xffffffff) == -1) {
                break;
            }

            method710(stream, i_0_, -60);
        }

        if (i >= 102) {
            anInt2803++;
        }
    }

    public void method710(Stream stream, int i, int i_1_) {
        if ((i ^ 0xffffffff) == -6) {
            anInt2808 = stream.readShort();
        }

        anInt2807++;

        int i_2_ = 105 / ((76 - i_1_) / 46);
    }

    public static void method711(int i) {
        anIntArray2809 = null;
        aJString_2810 = null;
        aJString_2804 = null;

        if (i == 500) {
            aJString_2806 = null;
            aJString_2802 = null;
            aClass15_2805 = null;
        }
    }
}
