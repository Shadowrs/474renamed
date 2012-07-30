/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.event.KeyEvent;


public class Class80 {
    public static JString aJString_1501 = Class37_Sub2.method332((byte) 121,
            "blinken1:");
    public static int anInt1502;
    public static int[] anIntArray1503 = new int[2000];
    public static long[] aLongArray1504 = new long[100];
    public static long aLong1505;
    public static int anInt1506;
    public static Class15 aClass15_1507;
    public static Signlink aClass51_1508;

    public static void method1299(int i, long l) {
        try {
            anInt1502++;

            if (l != 0L) {
                if (Class18.anInt340 >= 100) {
                    Class37_Sub4_Sub7_Sub1_Sub1.method505((Class37_Sub9_Sub8.aJString_3045),
                        0, Class24.aJString_596, (byte) 87);
                } else {
                    JString jstring = Class37_Sub4_Sub13.method708(37, l)
                                                        .capitalizeAfterQuestion(70);

                    for (int i_0_ = i;
                            (Class18.anInt340 ^ 0xffffffff) < (i_0_ ^
                            0xffffffff); i_0_++) {
                        if ((aLongArray1504[i_0_] ^ 0xffffffffffffffffL) == (l ^
                                0xffffffffffffffffL)) {
                            Class37_Sub4_Sub7_Sub1_Sub1.method505(Class37_Sub9_Sub8.aJString_3045,
                                0,
                                (Class37_Sub9_Sub27.method881(-7,
                                    new JString[] { jstring, Class38.aJString_846 })),
                                (byte) 71);

                            return;
                        }
                    }

                    for (int i_1_ = 0;
                            (i_1_ ^ 0xffffffff) > (RSApplet.anInt173 ^
                            0xffffffff); i_1_++) {
                        if ((l ^ 0xffffffffffffffffL) == (Class71.aLongArray1360[i_1_] ^
                                0xffffffffffffffffL)) {
                            Class37_Sub4_Sub7_Sub1_Sub1.method505(Class37_Sub9_Sub8.aJString_3045,
                                0,
                                (Class37_Sub9_Sub27.method881(i ^ ~0x69,
                                    (new JString[] {
                                        Class37_Sub9_Sub31.aJString_3491,
                                        jstring, Class60.aJString_1145
                                    }))), (byte) 100);

                            return;
                        }
                    }

                    if (jstring.equals(-94,
                                (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aJString_3993))) {
                        Class37_Sub4_Sub7_Sub1_Sub1.method505(Class37_Sub9_Sub8.aJString_3045,
                            0, Class37_Sub23.aJString_2239, (byte) 71);
                    } else {
                        Class10.anInt195++;
                        aLongArray1504[Class18.anInt340] = l;

                        Class18.aJStringArray332[Class18.anInt340++] = (Class37_Sub4_Sub13.method708(Class37_Sub4_Sub7_Sub1_Sub1.method502(
                                    i, 37), l));
                        Class37_Sub9_Sub32.anInt3509 = Class83.anInt1515;
                        Class42.aStream_Sub1_936.writePacket(-1494101117,
                            152);
                        Class42.aStream_Sub1_936.writeLong(l);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("ug.A(" + i + ',' + l + ')'));
        }
    }

    public static int method1300(KeyEvent keyevent, int i) {
        anInt1506++;

        if (i != -15009) {
            return -71;
        }

        int i_2_ = keyevent.getKeyChar();

        if ((i_2_ ^ 0xffffffff) == -8365) {
            return 128;
        }

        if (((i_2_ ^ 0xffffffff) >= -1) || ((i_2_ ^ 0xffffffff) <= -257)) {
            i_2_ = -1;
        }

        return i_2_;
    }

    public static void method1301(int i) {
        if (i >= 32) {
            aClass51_1508 = null;
            aLongArray1504 = null;
            aJString_1501 = null;
            aClass15_1507 = null;
            anIntArray1503 = null;
        }
    }
}
