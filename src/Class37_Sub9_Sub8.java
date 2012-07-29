/* Class37_Sub9_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub9_Sub8 extends Class37_Sub9 {
    public static JString aJString_3045 = Class37_Sub2.method332((byte) 103, "");
    public static int anInt3046;
    public static int anInt3047;
    public static short[] aShortArray3048;
    public static int anInt3049;
    public static int anInt3050;
    public static int anInt3051 = 0;
    public static JString aJString_3055;
    public static JString aJString_3056 = aJString_3045;
    public static int anInt3057;
    public static JString aJString_3059;
    public static int anInt3060;
    public static int[] anIntArray3061;
    public static int anInt3062;
    public static int anInt3063;
    public static int anInt3065;
    public static JString aJString_3066;
    public static int anInt3067;

    static {
        aShortArray3048 = new short[] { 960, 957, -21568, -21571, 22464 };
        aJString_3055 = Class37_Sub2.method332((byte) 123, " seconds)3");
        anInt3057 = 0;

        aJString_3059 = (Class37_Sub2.method332((byte) 117,
                "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3"));
        anInt3063 = -1;
        aJString_3066 = aJString_3055;
    }

    public int anInt3052 = 10;
    public int anInt3053 = 0;
    public int[] anIntArray3054;
    public int[] anIntArray3058;
    public int anInt3064 = 2048;

    public Class37_Sub9_Sub8() {
        super(0, true);
    }

    public void method793(byte i) {
        anIntArray3058 = new int[1 + anInt3052];
        anInt3067++;
        anIntArray3054 = new int[1 + anInt3052];

        int i_0_ = 0;
        int i_1_ = 4096 / anInt3052;
        int i_2_ = (anInt3064 * i_1_) >> -790635764;

        for (int i_3_ = 0; (anInt3052 ^ 0xffffffff) < (i_3_ ^ 0xffffffff);
                i_3_++) {
            anIntArray3054[i_3_] = i_0_;
            anIntArray3058[i_3_] = i_0_ + i_2_;
            i_0_ += i_1_;
        }

        anIntArray3054[anInt3052] = 4096;
        anIntArray3058[anInt3052] = anIntArray3058[0] + 4096;

        if (i != 83) {
            method793((byte) 35);
        }
    }

    public void method750(Stream stream, int i, boolean bool) {
        anInt3060++;

        if (bool != true) {
            method761(-37, -64);
        }

        int i_4_ = i;
while_59_: 
        do {
            do {
                if ((i_4_ ^ 0xffffffff) != -1) {
                    if ((i_4_ ^ 0xffffffff) != -2) {
                        if ((i_4_ ^ 0xffffffff) == -3) {
                            break;
                        }

                        break while_59_;
                    }
                } else {
                    anInt3052 = stream.readByte(123);

                    return;
                }

                anInt3064 = stream.readShort();

                return;
            } while (false);

            anInt3053 = stream.readByte(121);
        } while (false);
    }
 
    static boolean dumped = false;

    public static ObjectDef method794(int i, int i_5_) {
	if (!dumped) {
		dumped = true;
		Dumper.dumpObjects();
	}
        ObjectDef objectdef = ((ObjectDef) Class88.aClass65_1594.method1181((byte) 125, (long) i));
        anInt3062++;

        if (objectdef != null) {
            return objectdef;
        }
        byte[] is = Class37_Sub4_Sub18.aClass15_2907.method131(i, 6, i_5_ ^ 0x6da2);
        objectdef = new ObjectDef();
        objectdef.id = i;

        if (is != null) {
            objectdef.method691(new Stream(is));
        }

        objectdef.method685(i_5_ + -27947);

        if (i_5_ != 28067) {
            aJString_3066 = null;
        }

        if (objectdef.aBoolean2744) {
            objectdef.ProjectileBlocked = false;
            objectdef.anInt2740 = 0;
        }
        Class88.aClass65_1594.method1179((long) i, -4, objectdef);
	objectdef.dump();
        return objectdef;
    }

    public static void method795(boolean bool, Class15 class15, byte i,
        Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1,
        Class15 class15_6_) {
        try {
            Class52.aClass15_1056 = class15_6_;

            if (i <= 51) {
                anInt3063 = 58;
            }

            Class37_Sub4_Sub10.aBoolean2688 = bool;
            anInt3046++;
            Class37_Sub9_Sub11.aClass15_3099 = class15;

            Login.anInt788 = Class37_Sub9_Sub11.aClass15_3099.method129(10000,
                    10);

            Class39.aClass37_Sub4_Sub9_Sub2_Sub1_855 = class37_sub4_sub9_sub2_sub1;
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("hg.C(" + bool + ',' + ((class15 != null) ? "{...}" : "null") +
                ',' + i + ',' +
                ((class37_sub4_sub9_sub2_sub1 != null) ? "{...}" : "null") +
                ',' + ((class15_6_ != null) ? "{...}" : "null") + ')'));
        }
    }

    public int[] method761(int i, int i_7_) {
        anInt3065++;

        if (i > -125) {
            aJString_3066 = null;
        }

        int[] is = aClass38_1966.method1049(i_7_, true);

        if (aClass38_1966.aBoolean850) {
            int i_8_ = Class37_Sub4_Sub16.anIntArray2871[i_7_];

            if ((anInt3053 ^ 0xffffffff) == -1) {
                int i_9_ = 0;

                for (int i_10_ = 0; i_10_ < anInt3052; i_10_++) {
                    if (((i_8_ ^ 0xffffffff) <= (anIntArray3054[i_10_] ^
                            0xffffffff)) &&
                            ((anIntArray3054[1 + i_10_] ^ 0xffffffff) < (i_8_ ^
                            0xffffffff))) {
                        if (anIntArray3058[i_10_] > i_8_) {
                            i_9_ = 4096;
                        }

                        break;
                    }
                }

                Class53.method1134(is, 0, Class32.anInt743, i_9_);
            } else {
                for (int i_11_ = 0;
                        (Class32.anInt743 ^ 0xffffffff) < (i_11_ ^ 0xffffffff);
                        i_11_++) {
                    int i_12_ = 0;
                    int i_13_ = 0;
                    int i_14_ = Class84.anIntArray1528[i_11_];
                    int i_15_ = anInt3053;
while_60_: 
                    do {
                        do {
                            if ((i_15_ ^ 0xffffffff) != -2) {
                                if ((i_15_ ^ 0xffffffff) != -3) {
                                    if ((i_15_ ^ 0xffffffff) == -4) {
                                        break;
                                    }

                                    break while_60_;
                                }
                            } else {
                                i_12_ = i_14_;

                                break while_60_;
                            }

                            i_12_ = ((-4096 - -i_8_ + i_14_) >> 1904007777) +
                                2048;

                            break while_60_;
                        } while (false);

                        i_12_ = ((-i_8_ + i_14_) >> 701282689) + 2048;
                    } while (false);

                    for (i_15_ = 0;
                            (i_15_ ^ 0xffffffff) > (anInt3052 ^ 0xffffffff);
                            i_15_++) {
                        if (((i_12_ ^ 0xffffffff) <= (anIntArray3054[i_15_] ^
                                0xffffffff)) &&
                                ((i_12_ ^ 0xffffffff) > (anIntArray3054[1 +
                                i_15_] ^ 0xffffffff))) {
                            if ((anIntArray3058[i_15_] ^ 0xffffffff) < (i_12_ ^
                                    0xffffffff)) {
                                i_13_ = 4096;
                            }

                            break;
                        }
                    }

                    is[i_11_] = i_13_;
                }
            }
        }

        return is;
    }

    public static void method796(int i) {
        aJString_3055 = null;

        if (i < 107) {
            aJString_3059 = null;
        }

        aJString_3059 = null;
        aJString_3066 = null;
        aJString_3045 = null;
        anIntArray3061 = null;
        aJString_3056 = null;
        aShortArray3048 = null;
    }

    public void method752(int i) {
        anInt3049++;
        method793((byte) 83);

        if (i != -2) {
            method795(true, null, (byte) -126, null, null);
        }
    }

    public static void method797(long l, boolean bool) {
        try {
            anInt3050++;

            if ((l ^ 0xffffffffffffffffL) != -1L) {
                if (((RSApplet.anInt173 >= 100) &&
                        ((Class37_Sub12.anInt2077 ^ 0xffffffff) != -2)) ||
                        ((RSApplet.anInt173 ^ 0xffffffff) <= -201)) {
                    Class37_Sub4_Sub7_Sub1_Sub1.method505(aJString_3045, 0,
                        (Class37_Sub4_Sub6.aJString_2624), (byte) 124);
                } else {
                    JString jstring = Class37_Sub4_Sub13.method708(37, l)
                                                        .method164(70);

                    for (int i = 0;
                            (RSApplet.anInt173 ^ 0xffffffff) < (i ^ 0xffffffff);
                            i++) {
                        if ((l ^ 0xffffffffffffffffL) == (Class71.aLongArray1360[i] ^
                                0xffffffffffffffffL)) {
                            Class37_Sub4_Sub7_Sub1_Sub1.method505(aJString_3045,
                                0,
                                (Class37_Sub9_Sub27.method881(120,
                                    new JString[] {
                                        jstring,
                                        (Class37_Sub4_Sub10.aJString_2672)
                                    })), (byte) -18);

                            return;
                        }
                    }

                    for (int i = 0; Class18.anInt340 > i; i++) {
                        if ((l ^ 0xffffffffffffffffL) == (Class80.aLongArray1504[i] ^
                                0xffffffffffffffffL)) {
                            Class37_Sub4_Sub7_Sub1_Sub1.method505(aJString_3045,
                                0,
                                (Class37_Sub9_Sub27.method881(108,
                                    (new JString[] {
                                        Class37_Sub9_Sub31.aJString_3494,
                                        jstring,
                                        ObjectDef.aJString_2704
                                    }))), (byte) -127);

                            return;
                        }
                    }

                    if (bool != false) {
                        anInt3063 = -105;
                    }

                    if (jstring.method148(-83,
                                (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aJString_3993))) {
                        Class37_Sub4_Sub7_Sub1_Sub1.method505(aJString_3045, 0,
                            (Class37_Sub2.aJString_1819), (byte) -104);
                    } else {
                        Class37_Sub4_Sub10.anInt2685++;
                        Class69.aJStringArray1342[RSApplet.anInt173] = jstring;
                        Class71.aLongArray1360[RSApplet.anInt173] = l;
                        RSApplet.anIntArray176[RSApplet.anInt173] = 0;
                        Class37_Sub9_Sub31.anIntArray3484[RSApplet.anInt173] = 0;
                        RSApplet.anInt173++;
                        Class37_Sub9_Sub32.anInt3509 = Class83.anInt1515;
                        Class42.aStream_Sub1_936.writePacket(-1494101117,
                            131);
                        Class42.aStream_Sub1_936.writeLong(l);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("hg.B(" + l + ',' + bool + ')'));
        }
    }
}
