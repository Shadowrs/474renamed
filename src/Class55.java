/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class55 implements Runnable {
    public static int[] anIntArray1064;
    public static int anInt1065;
    public static JString aJString_1066;
    public static JString aJString_1067 = Class37_Sub2.method332((byte) 126,
            " Sekunde(Xn(Y -Ubertragen)3");
    public static int anInt1068;
    public static JString aJString_1069 = Class37_Sub2.method332((byte) 108,
            "Gegenstand f-Ur Mitglieder");
    public static JString aJString_1070;
    public static boolean aBoolean1071 = false;
    public static int anInt1074;
    public static int anInt1075;
    public static Resource loginThread;
    public static JString aJString_1077 = (Class37_Sub2.method332((byte) 107,
            "Sie befinden sich in einem Mitglieder)2Gebiet(Q"));

    static {
        aJString_1070 = Class37_Sub2.method332((byte) 109, "Take");
        aJString_1066 = aJString_1070;
    }

    public boolean aBoolean1072 = true;
    public Object anObject1073 = new Object();
    public int[] anIntArray1078;
    public int anInt1079 = 0;
    public int[] anIntArray1080;

    public Class55() {
        anIntArray1078 = new int[500];
        anIntArray1080 = new int[500];
    }

    public void run() {
        while (aBoolean1072) {
            synchronized (anObject1073) {
                if (anInt1079 < 500) {
                    anIntArray1078[anInt1079] = Class37_Sub4_Sub7_Sub7.anInt3851;
                    anIntArray1080[anInt1079] = Class37_Sub9_Sub1.anInt2914;
                    anInt1079++;
                }
            }

            Class37_Sub9_Sub20.method846(50L, (byte) 58);
        }

        anInt1075++;
    }

    public static void method1141(Stream stream, byte i,
        Signlink class51, int i_0_) {
        try {
            anInt1074++;

            Class37_Sub20 class37_sub20 = new Class37_Sub20();
            class37_sub20.anInt2205 = stream.readByte(118);
            class37_sub20.anInt2207 = stream.readInt();

            class37_sub20.aByteArrayArrayArray2213 = new byte[class37_sub20.anInt2205][][];

            class37_sub20.aClass23Array2206 = new Resource[class37_sub20.anInt2205];
            class37_sub20.anIntArray2204 = new int[class37_sub20.anInt2205];
            class37_sub20.anIntArray2214 = new int[class37_sub20.anInt2205];
            class37_sub20.anIntArray2212 = new int[class37_sub20.anInt2205];

            class37_sub20.aClass23Array2209 = new Resource[class37_sub20.anInt2205];

            if (i == -37) {
                for (int i_1_ = 0; class37_sub20.anInt2205 > i_1_; i_1_++) {
                    try {
                        int i_2_ = stream.readByte(119);

                        if (((i_2_ ^ 0xffffffff) == -1) ||
                                ((i_2_ ^ 0xffffffff) == -2) || (i_2_ == 2)) {
                            String string = new String(stream.readString().getCharArray());
                            String string_3_ = new String(stream.readString().getCharArray());
                            int i_4_ = 0;

                            if (i_2_ == 1) {
                                i_4_ = stream.readInt();
                            }

                            class37_sub20.anIntArray2214[i_1_] = i_2_;
                            class37_sub20.anIntArray2204[i_1_] = i_4_;

                            class37_sub20.aClass23Array2209[i_1_] = (class51.createResource(Class37_Sub9_Sub6.method783(
                                        95, string), -89, string_3_));
                        } else if (((i_2_ ^ 0xffffffff) == -4) ||
                                ((i_2_ ^ 0xffffffff) == -5)) {
                            String string = new String(stream.readString().getCharArray());
                            String string_5_ = new String(stream.readString().getCharArray());
                            int i_6_ = stream.readByte(123);
                            String[] strings = new String[i_6_];

                            for (int i_7_ = 0;
                                    (i_7_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff);
                                    i_7_++)
                                strings[i_7_] = new String(stream.readString().getCharArray());

                            byte[][] is = new byte[i_6_][];

                            if ((i_2_ ^ 0xffffffff) == -4) {
                                for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
                                    int i_9_ = stream.readInt();
                                    is[i_8_] = new byte[i_9_];
                                    stream.readBytes(0, i_9_, is[i_8_],
                                        (byte) -53);
                                }
                            }

                            class37_sub20.anIntArray2214[i_1_] = i_2_;

                            Class[] var_classes = new Class[i_6_];

                            for (int i_10_ = 0;
                                    (i_6_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
                                    i_10_++)
                                var_classes[i_10_] = (Class37_Sub9_Sub6.method783(Class37_Sub4_Sub7_Sub1_Sub1.method502(
                                            i, 88), strings[i_10_]));

                            class37_sub20.aClass23Array2206[i_1_] = (class51.createResource((byte) 64,
                                    string_5_,
                                    Class37_Sub9_Sub6.method783(i + 59, string),
                                    var_classes));
                            class37_sub20.aByteArrayArrayArray2213[i_1_] = is;
                        }
                    } catch (ClassNotFoundException classnotfoundexception) {
                        class37_sub20.anIntArray2212[i_1_] = -1;
                    } catch (SecurityException securityexception) {
                        class37_sub20.anIntArray2212[i_1_] = -2;
                    } catch (NullPointerException nullpointerexception) {
                        class37_sub20.anIntArray2212[i_1_] = -3;
                    } catch (Exception exception) {
                        class37_sub20.anIntArray2212[i_1_] = -4;
                    } catch (Throwable throwable) {
                        class37_sub20.anIntArray2212[i_1_] = -5;
                    }
                }

                Class37_Sub4_Sub7.aClass58_2633.method1149((byte) -103,
                    class37_sub20);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("p.A(" + ((stream != null) ? "{...}" : "null") + ',' +
                i + ',' + ((class51 != null) ? "{...}" : "null") + ',' + i_0_ +
                ')'));
        }
    }

    public static void method1142(byte i) {
        anIntArray1064 = null;
        aJString_1069 = null;
        aJString_1077 = null;

        if (i > -29) {
            method1141(null, (byte) -79, null, 42);
        }

        aJString_1067 = null;
        aJString_1070 = null;
        loginThread = null;
        aJString_1066 = null;
    }
}
