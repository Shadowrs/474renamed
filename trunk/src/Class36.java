/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.Frame;


public class Class36 {
    public static int anInt795;
    public static Class15_Sub1 aClass15_Sub1_796;
    public static Frame aFrame797;
    public static int anInt798;
    public static JString aJString_799;
    public static JS5 aClass15_800;
    public static int anInt801;
    public static int anInt802;
    public static JString aJString_803 = Class37_Sub2.method332((byte) 119,
            "Anmelde)2Zeitlimit -Uberschritten)3");
    public static int anInt804;
    public static int anInt805;
    public static int anInt806;
    public static JString aJString_807;
    public static short[][] aShortArrayArray808;
    public static int[] anIntArray809;

    static {
        aJString_799 = Class37_Sub2.method332((byte) 115, "compass");
        aJString_807 = Class37_Sub2.method332((byte) 104, ":tradereq:");
        anIntArray809 = new int[2048];

        aShortArrayArray808 = (new short[][] {
                {
                    6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433,
                    2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571,
                    908, 21830, 28946, -15701, -14010
                },
                {
                    8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094,
                    10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281,
                    10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946,
                    -15701, -14010
                },
                {
                    25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106,
                    24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281,
                    10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946,
                    -15701, -14010
                },
                { 4626, 11146, 6439, 12, 4758, 10270 },
                { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 }
            });
    }

    public static int method316(int i, JString jstring) {
        anInt802++;

        if ((Class37_Sub9_Sub25.anInt3382 ^ 0xffffffff) == -2) {
            return 7;
        }

        if (jstring.startsWith(Class52.aJString_1055, i ^ 0x33)) {
            return 1;
        }

        if (jstring.startsWith(Class37_Sub9_Sub4.aJString_2984, 52)) {
            return 1;
        }

        if (i != 7) {
            aJString_807 = null;
        }

        if (jstring.startsWith(Client.aJString_1721, 52)) {
            return 2;
        }

        if (jstring.startsWith(Class37_Sub9_Sub26.aJString_3389, 52)) {
            return 2;
        }

        if (jstring.startsWith(Class37_Sub4_Sub4.aJString_2578, i + 45)) {
            return 3;
        }

        if (jstring.startsWith(Class29.aJString_707, 52)) {
            return 4;
        }

        if (jstring.startsWith(Class50.aJString_1022, 52)) {
            return 4;
        }

        if (jstring.startsWith(Class84.aJString_1530, 52)) {
            return 5;
        }

        if (jstring.startsWith(Class1.aJString_70, 52)) {
            return 6;
        }

        return 0;
    }

    public static void method317(int i) {
        Class88.aClass65_1594.method1186(3056);
        anInt801++;
        Class37_Sub9_Sub23.aClass65_3346.method1186(3056);

        if (i != 8) {
            aClass15_800 = null;
        }

        Class39.aClass65_867.method1186(3056);
        Class72.aClass65_1371.method1186(3056);
        Class37_Sub4_Sub12.aClass65_2770.method1186(3056);
    }

    public static JString method318(int i, int i_0_) {
        if (i != -21952) {
            method319(null, 22);
        }

        anInt798++;

        return (Class37_Sub9_Sub27.method881(-24,
            (new JString[] {
                Class37_Sub9_Sub24.method870((i_0_ >> -658598408) & 0xff,
                    (byte) -114), Client.aJString_1727,
                Class37_Sub9_Sub24.method870(
                    ((i_0_ & 0xff9881) >> -949502576), (byte) -114),
                Client.aJString_1727,
                Class37_Sub9_Sub24.method870((0xff0a & i_0_) >> 2053687912,
                    (byte) -114), Client.aJString_1727,
                Class37_Sub9_Sub24.method870(i_0_ & 0xff, (byte) -114)
            })));
    }

    public static JString method319(Stream stream, int i) {
        anInt795++;

        if (i >= -25) {
            anIntArray809 = null;
        }

        return Class68.method1248(stream, false, 32767);
    }

    public static void method320(byte i) {
        aJString_803 = null;
        anIntArray809 = null;
        aJString_807 = null;
        aFrame797 = null;
        aClass15_800 = null;

        if (i != -27) {
            method318(6, -40);
        }

        aClass15_Sub1_796 = null;
        aShortArrayArray808 = null;
        aJString_799 = null;
    }

    public static boolean method321(int i, int i_1_) {
        anInt805++;

        if (i > -115) {
            method319(null, 37);
        }

        if ((0x1 & (i_1_ >> 126462004)) == 0) {
            return false;
        }

        return true;
    }
}
