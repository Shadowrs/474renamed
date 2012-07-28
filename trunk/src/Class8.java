/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class8 implements Runnable {
    public static long aLong157;
    public static JString aJString_158;
    public static int anInt159;
    public static JString aJString_160 = Class37_Sub2.method332((byte) 125,
            "Spieler kann nicht gefunden werden: ");
    public static JString aJString_161;
    public static JString aJString_162 = Class37_Sub2.method332((byte) 117,
            "Loading)3)3)3");
    public static int anInt163;
    public static int anInt164;
    public static int anInt165;
    public static JString aJString_166;
    public static int anInt167;
    public static int anInt168;
    public static JString aJString_169;

    static {
        aJString_161 = Class37_Sub2.method332((byte) 111,
                "button near the top of that page)3");
        anInt165 = 0;

        aJString_158 = Class37_Sub2.method332((byte) 102,
                "RuneScape wurde aktualisiert(Q");
        aJString_166 = aJString_161;
        anInt168 = 0;
        aJString_169 = aJString_162;
    }

    public void run() {
        anInt167++;

        try {
            for (;;) {
                Class37_Sub5 class37_sub5;

                synchronized (Class37_Sub9_Sub34.aClass58_3557) {
                    class37_sub5 = ((Class37_Sub5) Class37_Sub9_Sub34.aClass58_3557.method1155(0));
                }

                if (class37_sub5 == null) {
                    Class37_Sub9_Sub20.method846(100L, (byte) 58);

                    synchronized (Class37_Sub4_Sub10.anObject2686) {
                        if ((Class37_Sub9_Sub22.anInt3327 ^ 0xffffffff) >= -2) {
                            Class37_Sub9_Sub22.anInt3327 = 0;
                            Class37_Sub4_Sub10.anObject2686.notifyAll();

                            break;
                        }

                        Class37_Sub9_Sub22.anInt3327--;
                    }
                } else {
                    if ((class37_sub5.anInt1867 ^ 0xffffffff) != -1) {
                        if ((class37_sub5.anInt1867 ^ 0xffffffff) == -2) {
                            class37_sub5.aByteArray1863 = (class37_sub5.aClass69_1866.method1252((int) class37_sub5.aLong818,
                                    -128));

                            synchronized (Class37_Sub9_Sub34.aClass58_3557) {
                                Class25.aClass58_642.method1149((byte) -106,
                                    class37_sub5);
                            }
                        }
                    } else {
                        class37_sub5.aClass69_1866.method1253(520,
                            (int) class37_sub5.aLong818,
                            class37_sub5.aByteArray1863,
                            class37_sub5.aByteArray1863.length);

                        synchronized (Class37_Sub9_Sub34.aClass58_3557) {
                            class37_sub5.method322(false);
                        }
                    }

                    synchronized (Class37_Sub4_Sub10.anObject2686) {
                        if (Class37_Sub9_Sub22.anInt3327 <= 1) {
                            Class37_Sub9_Sub22.anInt3327 = 0;
                            Class37_Sub4_Sub10.anObject2686.notifyAll();

                            break;
                        }

                        Class37_Sub9_Sub22.anInt3327 = 600;
                    }
                }
            }
        } catch (Exception exception) {
            Class37_Sub9_Sub3.method768(-105, null, exception);
        }
    }

    public static int method78(int[] is, boolean bool, int i, int i_0_) {
        if (bool != false) {
            aJString_158 = null;
        }

        anInt164++;

        return (i * is[1]) + (is[0] * i_0_);
    }

    public static void method79(Class37_Sub3 class37_sub3, boolean bool) {
        if (class37_sub3.aClass37_Sub22_1839 != null) {
            class37_sub3.aClass37_Sub22_1839.anInt2222 = 0;
        }

        anInt163++;
        class37_sub3.aBoolean1838 = bool;

        for (Class37_Sub3 class37_sub3_1_ = class37_sub3.method343();
                class37_sub3_1_ != null;
                class37_sub3_1_ = class37_sub3.method339())
            method79(class37_sub3_1_, bool);
    }

    public static void method80(int i) {
        aJString_158 = null;
        aJString_162 = null;
        aJString_161 = null;
        aJString_160 = null;
        aJString_169 = null;

        int i_2_ = -109 / ((i - 1) / 43);
        aJString_166 = null;
    }
}
