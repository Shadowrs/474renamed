/* Class37_Sub9_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class PacketParser extends Class37_Sub9 {
    public static int anInt3248;
    public static int anInt3249;
    public static long aLong3250 = 0L;
    public static int anInt3251;
    public static JString aJString_3252;
    public static JString aJString_3253 = Class37_Sub2.method332((byte) 108,
            ":clan:");
    public static JString aJString_3254 = Class37_Sub2.method332((byte) 107,
            "Connection timed out)3");
    public static JString aJString_3255;
    public static int anInt3256;
    public static JString aJString_3257;
    public static volatile int anInt3258;
    public static int anInt3259;
    public static JString aJString_3260;
    public static JString aJString_3261;
    public static Class37_Sub4_Sub9_Sub3[] aClass37_Sub4_Sub9_Sub3Array3262;
    public static JS5 aClass15_3263;
    public static int anInt3264;
    public static Interface3 anInterface3_3265;
    public static int anInt3266;
    public static int anInt3267;
    public static int anInt3268;
    public static JString aJString_3269;
    public static int anInt3270;
    public static int[] anIntArray3271;
    public static int world;
    public static JString aJString_3273;
    public static volatile int anInt3274;

    static {
        aJString_3252 = Class37_Sub2.method332((byte) 102, "Close");

        aJString_3260 = Class37_Sub2.method332((byte) 108, "Loading config )2 ");
        anInt3258 = 0;
        aJString_3269 = Class37_Sub2.method332((byte) 124, "titlebutton");
        anIntArray3271 = new int[128];
        world = 1;
        aJString_3273 = aJString_3260;
        aJString_3257 = Class37_Sub2.method332((byte) 108, "(Udns");
        anInt3274 = 0;
        aJString_3255 = aJString_3252;
        anInt3248 = 1;
        aJString_3261 = aJString_3254;
    }

    public int anInt3247 = 585;

    public PacketParser() {
        super(0, true);
    }

    public static void method838(Applet_Sub1 applet_sub1, int i) {
        if (i != 13634) {
            anInt3248 = 12;
        }

        anInt3251++;

        do {
            if (Class37_Sub9_Sub28.anInt3440 == 1) {
                int i_0_ = 280;

                if ((i_0_ > Class33.anInt764) ||
                        (((i_0_ - -14) ^ 0xffffffff) > (Class33.anInt764 ^
                        0xffffffff)) ||
                        ((Class37_Sub13.anInt2113 ^ 0xffffffff) > -5) ||
                        ((Class37_Sub13.anInt2113 ^ 0xffffffff) < -19)) {
                    if ((((i_0_ + 15) ^ 0xffffffff) >= (Class33.anInt764 ^
                            0xffffffff)) &&
                            (((i_0_ + 80) ^ 0xffffffff) <= (Class33.anInt764 ^
                            0xffffffff)) && (Class37_Sub13.anInt2113 >= 4) &&
                            ((Class37_Sub13.anInt2113 ^ 0xffffffff) >= -19)) {
                        Class82.method1308(0, (byte) 77, 1);

                        break;
                    }
                } else {
                    Class82.method1308(0, (byte) 101, 0);

                    break;
                }

                int i_1_ = 390;

                if (((Class33.anInt764 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff)) &&
                        (((i_1_ + 14) ^ 0xffffffff) <= (Class33.anInt764 ^
                        0xffffffff)) &&
                        ((Class37_Sub13.anInt2113 ^ 0xffffffff) <= -5) &&
                        (Class37_Sub13.anInt2113 <= 18)) {
                    Class82.method1308(1, (byte) 89, 0);

                    break;
                }

                if ((((i_1_ - -15) ^ 0xffffffff) >= (Class33.anInt764 ^
                        0xffffffff)) &&
                        (((i_1_ + 80) ^ 0xffffffff) <= (Class33.anInt764 ^
                        0xffffffff)) && (Class37_Sub13.anInt2113 >= 4) &&
                        ((Class37_Sub13.anInt2113 ^ 0xffffffff) >= -19)) {
                    Class82.method1308(1, (byte) 108, 1);

                    break;
                }

                int i_2_ = 500;

                if ((Class33.anInt764 >= i_2_) &&
                        ((Class33.anInt764 ^ 0xffffffff) >= ((14 + i_2_) ^
                        0xffffffff)) && (Class37_Sub13.anInt2113 >= 4) &&
                        (Class37_Sub13.anInt2113 <= 18)) {
                    Class82.method1308(2, (byte) 99, 0);

                    break;
                }

                if (((Class33.anInt764 ^ 0xffffffff) <= ((i_2_ + 15) ^
                        0xffffffff)) &&
                        ((Class33.anInt764 ^ 0xffffffff) >= ((i_2_ + 80) ^
                        0xffffffff)) &&
                        ((Class37_Sub13.anInt2113 ^ 0xffffffff) <= -5) &&
                        (Class37_Sub13.anInt2113 <= 18)) {
                    Class82.method1308(2, (byte) 91, 1);

                    break;
                }

                int i_3_ = 610;

                if ((Class33.anInt764 >= i_3_) &&
                        (((14 + i_3_) ^ 0xffffffff) <= (Class33.anInt764 ^
                        0xffffffff)) &&
                        ((Class37_Sub13.anInt2113 ^ 0xffffffff) <= -5) &&
                        ((Class37_Sub13.anInt2113 ^ 0xffffffff) >= -19)) {
                    Class82.method1308(3, (byte) 89, 0);

                    break;
                }

                if (((i_3_ - -15) <= Class33.anInt764) &&
                        ((Class33.anInt764 ^ 0xffffffff) >= ((80 + i_3_) ^
                        0xffffffff)) && (Class37_Sub13.anInt2113 >= 4) &&
                        (Class37_Sub13.anInt2113 <= 18)) {
                    Class82.method1308(3, (byte) 88, 1);

                    break;
                }

                if ((Class33.anInt764 >= 708) &&
                        ((Class37_Sub13.anInt2113 ^ 0xffffffff) <= -5) &&
                        (Class33.anInt764 <= 758) &&
                        ((Class37_Sub13.anInt2113 ^ 0xffffffff) >= -21)) {
                    Class37_Sub4_Sub13.aBoolean2799 = false;
                    Class42.aClass37_Sub4_Sub9_Sub3_923.method652(0, 0);
                    Class14.aClass37_Sub4_Sub9_Sub3_238.method652(382, 0);
                    Class37_Sub9_Sub21.aClass37_Sub4_Sub9_Sub1_3320.method597(382 -
                        ((Class37_Sub9_Sub21.aClass37_Sub4_Sub9_Sub1_3320.anInt3865) / 2),
                        18);

                    break;
                }

                if ((Class37_Sub9_Sub17.anInt3218 ^ 0xffffffff) != 0) {
                    Class56 class56 = (Class37_Sub8.aClass56Array1933[Class37_Sub9_Sub17.anInt3218]);

                    if (Class37_Sub4_Sub13.aBoolean2791 != !class56.aBoolean1082) {
                        byte[] is = Class37_Sub9_Sub27.method881(i ^ 0x3534,
                                new JString[] {
                                    class56.aJString_1081,
                                    (Class37_Sub4_Sub7_Sub1_Sub2.aJString_3971)
				}).getCharArray();

                        Class37_Sub8.address = new String(is, 0, is.length);

                        if (Class37_Sub9_Sub17.anInt3219 != 0) {
                            Class37_Sub9_Sub17.anInt3219 = 0;

                            Class37_Sub9_Sub31.anInt3490 = Class37_Sub4_Sub7_Sub1.port = 43594;
                            Class22.anInt581 = 443;
                        }

                        world = class56.anInt1089;
                        Class37_Sub4_Sub13.aBoolean2799 = false;
                        Class42.aClass37_Sub4_Sub9_Sub3_923.method652(0, 0);
                        Class14.aClass37_Sub4_Sub9_Sub3_238.method652(382, 0);
                        Class37_Sub9_Sub21.aClass37_Sub4_Sub9_Sub1_3320.method597(-((Class37_Sub9_Sub21.aClass37_Sub4_Sub9_Sub1_3320.anInt3865) / 2) +
                            382, 18);
                    } else {
                        JString jstring = (Class37_Sub9_Sub27.method881(i ^
                                ~0x3534,
                                (new JString[] {
                                    RSSocket.aJString_488, class56.aJString_1081,
                                    Class37_Sub4_Sub7_Sub1_Sub2.aJString_3971,
                                    Class37_Sub9_Sub8.aJString_3056,
                                    Class73.aJString_1384,
                                    (Class37_Sub9_Sub24.method870(Class37_Sub4_Sub6.aBoolean2613
                                        ? 1 : 0, (byte) -114)),
                                    Class37_Sub4_Sub7_Sub1_Sub2.aJString_3992,
                                    Class37_Sub9_Sub24.method870(
                                        (Class10.anInt193), (byte) -114),
                                    Class37_Sub23.aJString_2233,
                                    (Class37_Sub9_Sub24.method870(
                                        PacketStream.anInt3610,
                                        (byte) -114))
                                })));

                        try {
                            applet_sub1.getAppletContext()
                                       .showDocument(jstring.toURL(), "_self");
                        } catch (Exception exception) {
                            break;
                        }

                        break;
                    }

                    break;
                }
            }
        } while (false);
    }

    public static void method839(byte i) {
        aClass37_Sub4_Sub9_Sub3Array3262 = null;

        if (i <= 26) {
            method839((byte) 127);
        }

        aJString_3255 = null;
        aClass15_3263 = null;
        anIntArray3271 = null;
        aJString_3273 = null;
        aJString_3269 = null;
        aJString_3254 = null;
        aJString_3261 = null;
        aJString_3253 = null;
        aJString_3257 = null;
        aJString_3252 = null;
        anInterface3_3265 = null;
        aJString_3260 = null;
    }

    public static boolean method840(int i) {
        anInt3264++;

        if (Applet_Sub1.activeSocket == null) {
            return false;
        }

        try {
            int i_4_ = Applet_Sub1.activeSocket.available();

            if ((i_4_ ^ 0xffffffff) == -1) {
                return false;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == 0) {
                i_4_--;
                Applet_Sub1.activeSocket.read(1, 0, 122,
                    (Class83.packetStream.buffer));
                Class83.packetStream.bufferLocation = 0;

                Class37_Sub9_Sub17.packetId = Class83.packetStream.readPacket(7);
                Class37_Sub4.packetSize = (Class37_Sub9_Sub4.anIntArray2981[Class37_Sub9_Sub17.packetId]);
            }

            if (i == Class37_Sub4.packetSize) {
                if ((i_4_ ^ 0xffffffff) < -1) {
                    i_4_--;
                    Applet_Sub1.activeSocket.read(1, 0, 122,
                        Class83.packetStream.buffer);

                    Class37_Sub4.packetSize = (Class83.packetStream.buffer[0] &
                        0xff);
                } else {
                    return false;
                }
            }

            if ((Class37_Sub4.packetSize ^ 0xffffffff) == 1) {
                if (i_4_ <= 1) {
                    return false;
                }

                Applet_Sub1.activeSocket.read(2, 0, i + 123,
                    (Class83.packetStream.buffer));
                i_4_ -= 2;
                Class83.packetStream.bufferLocation = 0;

                Class37_Sub4.packetSize = Class83.packetStream.readShort();
            }

            if (Class37_Sub4.packetSize > i_4_) {
                return false;
            }

            Class83.packetStream.bufferLocation = 0;
            Applet_Sub1.activeSocket.read(Class37_Sub4.packetSize, 0, 122,
                (Class83.packetStream.buffer));
            Class37_Sub9_Sub27.anInt3418 = Class37_Sub16.anInt2151;
            Class37_Sub9_Sub30.anInt3480 = 0;
            Class37_Sub16.anInt2151 = Class45.anInt977;
            Class45.anInt977 = Class37_Sub9_Sub17.packetId;


            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -242) {
                if (AbstractDrawingArea.anInt733 != -1) {
                    Class26.method259(AbstractDrawingArea.anInt733, 0, -127);
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -239) {
                Class55.method1141(Class83.packetStream,
                    (byte) -37, Class80.signlink, Class37_Sub4.packetSize);


                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 237) {
                JString jstring = Class83.packetStream.readString();
                Object[] objects = new Object[1 + jstring.length((byte) 38)];

                for (int i_5_ = -1 + jstring.length((byte) 38); i_5_ >= 0;
                        i_5_--) {
                    if (jstring.charAt(i_5_) == 115) {
                        objects[1 + i_5_] = Class83.packetStream.readString();
                    } else {
                        objects[1 + i_5_] = new Integer(Class83.packetStream.readInt());
                    }
                }

                objects[0] = new Integer(Class83.packetStream.readInt());

                Class37_Sub8 class37_sub8 = new Class37_Sub8();
                class37_sub8.anObjectArray1938 = objects;
                Class43.method1092(class37_sub8, (byte) 70);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -157) {
                Class37_Sub4_Sub12.aBoolean2775 = false;

                for (int i_6_ = 0; i_6_ < 5; i_6_++)
                    Class37_Sub9_Sub30.aBooleanArray3477[i_6_] = false;

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 30) {
                Class37_Sub4_Sub12.anInt2783 = Class83.packetStream.readByte(117);
                Class37_Sub9_Sub17.packetId = -1;
                Class37_Sub9_Sub32.anInt3509 = Class83.anInt1515;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -237) {
                int i_7_ = Class83.packetStream.readInt();

                Class37_Sub9_Sub33.aClass23_3527 = Class80.signlink.createResource(i_7_,
                        (byte) 111);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 163) {
                Class50.anInt1028 = Class83.packetStream.readByte(117);//x coordinate (west->east)

                Class65.anInt1231 = Class83.packetStream.readByteS(i +
                        256); //y coordinate (south->north)

                while (Class83.packetStream.bufferLocation < Class37_Sub4.packetSize) {
                    Class37_Sub9_Sub17.packetId = Class83.packetStream.readByte(126);
                    Class37_Sub10.method929((byte) -28);
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -210) {
                JString jstring = Class83.packetStream.readString();

                if (jstring.endsWith(Class36.aJString_807, (byte) -124)) {
                    JString jstring_8_ = (jstring.substring(0, 0,
                            jstring.indexOf(Class50.aJString_1023)));
                    long l = jstring_8_.toInt64(-73);
                    boolean bool = false;

                    for (int i_9_ = 0; i_9_ < Class18.anInt340; i_9_++) {
                        if ((l ^ 0xffffffffffffffffL) == (Class80.aLongArray1504[i_9_] ^
                                0xffffffffffffffffL)) {
                            bool = true;

                            break;
                        }
                    }

                    if (!bool && ((Class52_Sub1.anInt2303 ^ 0xffffffff) == -1)) {
                        Class37_Sub4_Sub7_Sub1_Sub1.method505(jstring_8_, 4,
                            (Class88.aJString_1607), (byte) 120);
                    }
                } else if (jstring.endsWith(Class38.aJString_843, (byte) -124)) {
                    JString jstring_10_ = (jstring.substring(0, 0,
                            jstring.indexOf(Class50.aJString_1023)));
                    long l = jstring_10_.toInt64(-118);
                    boolean bool = false;

                    for (int i_11_ = 0;
                            ((i_11_ ^ 0xffffffff) > (Class18.anInt340 ^
                            0xffffffff)); i_11_++) {
                        if ((Class80.aLongArray1504[i_11_] ^
                                0xffffffffffffffffL) == (l ^
                                0xffffffffffffffffL)) {
                            bool = true;

                            break;
                        }
                    }

                    if (!bool && (Class52_Sub1.anInt2303 == 0)) {
                        Class37_Sub4_Sub7_Sub1_Sub1.method505(jstring_10_, 8,
                            (Class89.aJString_1610), (byte) 123);
                    }
                } else if (jstring.endsWith(
                            (Class37_Sub4_Sub7_Sub1.aJString_3649), (byte) -124)) {
                    JString jstring_12_ = (jstring.substring(0, 0,
                            jstring.indexOf(Class50.aJString_1023)));
                    long l = jstring_12_.toInt64(-71);
                    boolean bool = false;

                    for (int i_13_ = 0; Class18.anInt340 > i_13_; i_13_++) {
                        if (Class80.aLongArray1504[i_13_] == l) {
                            bool = true;

                            break;
                        }
                    }

                    if (!bool && (Class52_Sub1.anInt2303 == 0)) {
                        JString jstring_14_ = (jstring.substring(0,
                                1 +
                                jstring.indexOf(Class50.aJString_1023),
                                jstring.length((byte) 38) + -9));
                        Class37_Sub4_Sub7_Sub1_Sub1.method505(jstring_12_, 8,
                            jstring_14_, (byte) 70);
                    }
                } else if (!jstring.endsWith(Class79.aJString_1497, (byte) -124)) {
                    if (!jstring.endsWith(aJString_3253, (byte) -124)) {
                        if (!jstring.endsWith(
                                    (Class37_Sub4_Sub7_Sub3.aJString_3750),
                                    (byte) -124)) {
                            if (!jstring.endsWith(Class82.aJString_1693,
                                        (byte) -124)) {
                                Class37_Sub4_Sub7_Sub1_Sub1.method505(Class37_Sub9_Sub8.aJString_3045,
                                    0, jstring, (byte) -117);
                            } else {
                                JString jstring_15_ = (jstring.substring(0, 0,
                                        jstring.indexOf((Class82.aJString_1693))));

                                if ((Class52_Sub1.anInt2303 ^ 0xffffffff) == -1) {
                                    Class37_Sub4_Sub7_Sub1_Sub1.method505(Class37_Sub9_Sub8.aJString_3045,
                                        13, jstring_15_, (byte) -62);
                                }
                            }
                        } else {
                            JString jstring_16_ = (jstring.substring(0, 0,
                                    jstring.indexOf((Class37_Sub4_Sub7_Sub3.aJString_3750))));

                            if (Class52_Sub1.anInt2303 == 0) {
                                Class37_Sub4_Sub7_Sub1_Sub1.method505(Class37_Sub9_Sub8.aJString_3045,
                                    12, jstring_16_, (byte) -62);
                            }
                        }
                    } else {
                        JString jstring_17_ = (jstring.substring(0, 0,
                                jstring.indexOf(aJString_3253)));
                        Class37_Sub4_Sub7_Sub1_Sub1.method505(Class37_Sub9_Sub8.aJString_3045,
                            11, jstring_17_, (byte) -32);
                    }
                } else {
                    JString jstring_18_ = (jstring.substring(0, 0,
                            jstring.indexOf(Class50.aJString_1023)));
                    long l = jstring_18_.toInt64(-64);
                    boolean bool = false;

                    for (int i_19_ = 0;
                            ((Class18.anInt340 ^ 0xffffffff) < (i_19_ ^
                            0xffffffff)); i_19_++) {
                        if ((l ^ 0xffffffffffffffffL) == (Class80.aLongArray1504[i_19_] ^
                                0xffffffffffffffffL)) {
                            bool = true;

                            break;
                        }
                    }

                    if (!bool && (Class52_Sub1.anInt2303 == 0)) {
                        Class37_Sub4_Sub7_Sub1_Sub1.method505(jstring_18_, 10,
                            Class37_Sub9_Sub8.aJString_3045, (byte) -104);
                    }
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -23) {
                int i_20_ = Class83.packetStream.readInt();
                Class18 class18 = Class37_Sub9_Sub14.method820(i_20_, 4096);
                class18.anInt408 = 3;

                class18.anInt369 = Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass29_3985.method268(4);
                Class73.method1274(class18, i);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -18) {
                int i_21_ = Class83.packetStream.readByteS(255);
                int i_22_ = Class83.packetStream.readShortLE(2);
                int i_23_ = Class83.packetStream.readInt1(8191);

                Class37_Sub6 class37_sub6 = ((Class37_Sub6) Class76.aClass13_1423.method100((byte) 96,
                        (long) i_23_));
                if (class37_sub6 != null) {
                    PacketStream.method992(-1494101117, class37_sub6,
                        (i_22_ != class37_sub6.anInt1884));
                }
                Class37_Sub4_Sub16.method724(i_21_, i_22_, i_23_, -17421);
                Class37_Sub9_Sub17.packetId = -1;
                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -43) {
                Class37_Sub9_Sub15.method822((byte) 96);

                Class37_Sub4_Sub16.anInt2864 = Class83.packetStream.readByte(126);
                Class37_Sub9_Sub17.packetId = -1;
                Class37_Sub9_Sub37.anInt3602 = Class83.anInt1515;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 35) {
                long l = Class83.packetStream.readLongDuplicate(false);
                Class83.packetStream.readSignedByte((byte) 127);

                long l_24_ = Class83.packetStream.readLongDuplicate(false);
                long l_25_ = (long) Class83.packetStream.readShort();
                long l_26_ = (long) Class83.packetStream.read3Bytes(-26256544);
                int i_27_ = Class83.packetStream.readByte(119);
                long l_28_ = (l_25_ << -908022624) + l_26_;
                boolean bool = false;

                for (int i_29_ = 0; i_29_ < 100; i_29_++) {
                    if (Class57.aLongArray1099[i_29_] == l_28_) {
                        bool = true;

                        break;
                    }
                }

                if (i_27_ <= 1) {
                    for (int i_30_ = 0;
                            ((i_30_ ^ 0xffffffff) > (Class18.anInt340 ^
                            0xffffffff)); i_30_++) {
                        if (Class80.aLongArray1504[i_30_] == l) {
                            bool = true;

                            break;
                        }
                    }
                }

                if (!bool && (Class52_Sub1.anInt2303 == 0)) {
                    Class57.aLongArray1099[Class41.anInt900] = l_28_;
                    Class41.anInt900 = (1 + Class41.anInt900) % 100;

                    JString jstring = (Class37_Sub4_Sub9_Sub2.method605(Class36.method319(
                                Class83.packetStream, -57)
                                                                               .formatCapitalization(i +
                                2)));

                    if ((i_27_ == 2) || ((i_27_ ^ 0xffffffff) == -4)) {
                        Class38.method1052((Class37_Sub9_Sub27.method881(i +
                                115,
                                (new JString[] {
                                    Class42.aJString_917,
                                    Class37_Sub4_Sub13.method708(37, l)
                                                      .capitalizeAfterQuestion(70)
                                }))), 9, 98, jstring,
                            Class37_Sub4_Sub13.method708(37, l_24_)
                                              .capitalizeAfterQuestion(i + 71));
                    } else if ((i_27_ ^ 0xffffffff) != -2) {
                        Class38.method1052(Class37_Sub4_Sub13.method708(37, l)
                                                             .capitalizeAfterQuestion(i + 71),
                            9, 87, jstring,
                            Class37_Sub4_Sub13.method708(37, l_24_).capitalizeAfterQuestion(70));
                    } else {
                        Class38.method1052((Class37_Sub9_Sub27.method881(i +
                                111,
                                (new JString[] {
                                    AbstractDrawingArea.aJString_741,
                                    Class37_Sub4_Sub13.method708(37, l)
                                                      .capitalizeAfterQuestion(70)
                                }))), 9, 109, jstring,
                            Class37_Sub4_Sub13.method708(37, l_24_).capitalizeAfterQuestion(70));
                    }
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 128) {
                int i_31_ = (Class83.packetStream.bufferLocation -
                    -Class37_Sub4.packetSize);
                int i_32_ = Class83.packetStream.readShort();
                int i_33_ = Class83.packetStream.readShort();

                if (i_32_ != AbstractDrawingArea.anInt733) {
                    AbstractDrawingArea.anInt733 = i_32_;
                    Class37_Sub10.method928((byte) 27, AbstractDrawingArea.anInt733);
                    Class87.method1330(AbstractDrawingArea.anInt733, -50);

                    for (int i_34_ = 0; i_34_ < 100; i_34_++)
                        Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_34_] = true;
                }

                while (i_33_-- > 0) {
                    int i_35_ = Class83.packetStream.readInt();
                    int i_36_ = Class83.packetStream.readShort();
                    int i_37_ = Class83.packetStream.readByte(124);
                    Class37_Sub6 class37_sub6 = ((Class37_Sub6) Class76.aClass13_1423.method100((byte) 97,
                            (long) i_35_));

                    if ((class37_sub6 != null) &&
                            (i_36_ != class37_sub6.anInt1884)) {
                        PacketStream.method992(-1494101117, class37_sub6,
                            true);
                        class37_sub6 = null;
                    }

                    if (class37_sub6 == null) {
                        class37_sub6 = Class37_Sub4_Sub16.method724(i_37_,
                                i_36_, i_35_, -17421);
                    }

                    class37_sub6.aBoolean1886 = true;
                }

                for (Class37_Sub6 class37_sub6 = ((Class37_Sub6) Class76.aClass13_1423.method94(i +
                            119)); class37_sub6 != null;
                        class37_sub6 = (Class37_Sub6) Class76.aClass13_1423.method102(
                                (byte) 95)) {
                    if (class37_sub6.aBoolean1886) {
                        class37_sub6.aBoolean1886 = false;
                    } else {
                        PacketStream.method992(i + -1494101116,
                            class37_sub6, true);
                    }
                }

                Class62.aClass13_1177 = new Class13(512);

                while ((i_31_ ^ 0xffffffff) < (Class83.packetStream.bufferLocation ^
                        0xffffffff)) {
                    int i_38_ = Class83.packetStream.readInt();
                    int i_39_ = Class83.packetStream.readShort();
                    int i_40_ = Class83.packetStream.readShort();
                    int i_41_ = Class83.packetStream.readInt();

                    for (int i_42_ = i_39_; i_40_ >= i_42_; i_42_++) {
                        long l = (long) i_42_ + ((long) i_38_ << 1344652832);
                        Class62.aClass13_1177.method101(new Class37_Sub10(i_41_),
                            false, l);
                    }
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -11) {
                int i_43_ = Class83.packetStream.readIntLE(i +
                        -52131575);
                int i_44_ = Class83.packetStream.readShort();
                Class80.anIntArray1503[i_44_] = i_43_;

                if ((i_43_ ^ 0xffffffff) != (Class37_Sub23.anIntArray2237[i_44_] ^
                        0xffffffff)) {
                    Class37_Sub23.anIntArray2237[i_44_] = i_43_;
                    Class65.method1183(i_44_, (byte) -3);
                }

                Class37_Sub9_Sub1.anIntArray2918[Class37_Sub4_Sub7.method490(Class24.anInt615++,
                    31)] = i_44_;
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -55) {
                Class39.method1060((byte) 105, Class83.packetStream);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 5) {
                Class37_Sub9_Sub36.anInt3584 = Class83.packetStream.readByte(122);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -180) {
                Class37_Sub4_Sub12.aBoolean2775 = true;

                Class37_Sub9.anInt1948 = Class83.packetStream.readByte(117);

                ObjectDef.anInt2697 = Class83.packetStream.readByte(117);

                Class37_Sub9_Sub11.anInt3106 = Class83.packetStream.readShort();

                Class37_Sub8.anInt1932 = Class83.packetStream.readByte(i +
                        120);

                Class76.anInt1438 = Class83.packetStream.readByte(120);

                if (Class76.anInt1438 >= 100) {
                    Class37_Sub6.anInt1888 = (ObjectDef.anInt2697 * 128) +
                        64;
                    RSSocket.anInt483 = (128 * Class37_Sub9.anInt1948) + 64;

                    Class37_Sub25.anInt2286 = (JString.method153(Class37_Sub9_Sub1.anInt2916,
                            -169496123, Class37_Sub6.anInt1888, RSSocket.anInt483) -
                        Class37_Sub9_Sub11.anInt3106);
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 166) {
                Class76.method1284((byte) -86);
                Class37_Sub9_Sub17.packetId = -1;

                return false;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -175) {
                int i_45_ = Class83.packetStream.readInt();
                Class37_Sub6 class37_sub6 = ((Class37_Sub6) Class76.aClass13_1423.method100((byte) 88,
                        (long) i_45_));

                if (class37_sub6 != null) {
                    PacketStream.method992(-1494101117, class37_sub6, true);
                }

                if (Class79.aClass18_1489 != null) {
                    Class73.method1274(Class79.aClass18_1489, -1);
                    Class79.aClass18_1489 = null;
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -122) {
                int i_46_ = Class83.packetStream.readShortLEA(2);

                if (i_46_ == 65535) {
                    i_46_ = -1;
                }

                Class37_Sub9_Sub10.method805((byte) -75, i_46_);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 71) {
                int i_47_ = Class83.packetStream.read3Bytes1(-22591);
                int i_48_ = Class83.packetStream.readShortLE(2);

                if (i_48_ == 65535) {
                    i_48_ = -1;
                }

                Class37_Sub4_Sub8.method574(i_47_, true, i_48_);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 253) {
                int i_49_ = Class83.packetStream.readShort();
                int i_50_ = Class83.packetStream.readSignedByteA((byte) 101);
                Class80.anIntArray1503[i_49_] = i_50_;

                if ((Class37_Sub23.anIntArray2237[i_49_] ^ 0xffffffff) != (i_50_ ^
                        0xffffffff)) {
                    Class37_Sub23.anIntArray2237[i_49_] = i_50_;
                    Class65.method1183(i_49_, (byte) -3);
                }

                Class37_Sub9_Sub1.anIntArray2918[Class37_Sub4_Sub7.method490(31,
                    Class24.anInt615++)] = i_49_;
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 168) {
                Class50.anInt1028 = Class83.packetStream.readByte(i ^
                        ~0x75);

                Class65.anInt1231 = Class83.packetStream.readByteA();
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 15) {
                Class37_Sub9_Sub24.anInt3361 = Class83.packetStream.readByte(124);

                Class8.anInt165 = Class83.packetStream.readByte(i ^
                        ~0x7f);

                Class37_Sub9_Sub15.anInt3169 = Class83.packetStream.readByte(124);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -206) ||
                    (Class37_Sub9_Sub17.packetId == 220) ||
                    ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -19) ||
                    ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -192) ||
                    (Class37_Sub9_Sub17.packetId == 49) ||
                    ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -39) ||
                    ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -29) ||
                    (Class37_Sub9_Sub17.packetId == 7) ||
                    (Class37_Sub9_Sub17.packetId == 55) ||
                    (Class37_Sub9_Sub17.packetId == 86) ||
                    (Class37_Sub9_Sub17.packetId == 188)) {
                Class37_Sub10.method929((byte) -28);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 114) {
                int i_51_ = Class83.packetStream.readShort();
                int i_52_ = Class83.packetStream.readInt1(i ^
                        ~0x1fff);
                int i_53_ = (i_51_ & 0x7e09) >> 652661258;
                int i_54_ = 0x1f & i_51_;
                int i_55_ = (i_51_ >> -732689883) & 0x1f;
                Class18 class18 = Class37_Sub9_Sub14.method820(i_52_, 4096);
                int i_56_ = (i_54_ << 1879056515) +
                    ((i_55_ << -1077140757) + (i_53_ << 1955750899));

                if (i_56_ != class18.anInt442) {
                    class18.anInt442 = i_56_;
                    Class73.method1274(class18, -1);
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -208) {
                Class37_Sub9_Sub16.anInt3201 = 30 * Class83.packetStream.readShortLE(2);
                Class37_Sub9_Sub17.packetId = -1;
                Class37_Sub9_Sub37.anInt3602 = Class83.anInt1515;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 127) {
                int i_57_ = Class83.packetStream.readShortLEA(2);
                int i_58_ = Class83.packetStream.readInt();
                Class18 class18 = Class37_Sub9_Sub14.method820(i_58_, 4096);

                if ((class18.anInt408 != 2) ||
                        ((i_57_ ^ 0xffffffff) != (class18.anInt369 ^
                        0xffffffff))) {
                    class18.anInt408 = 2;
                    class18.anInt369 = i_57_;
                    Class73.method1274(class18, i);
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -83) {
                for (int i_59_ = 0;
                        i_59_ < Class37_Sub23.anIntArray2237.length; i_59_++) {
                    if ((Class80.anIntArray1503[i_59_] ^ 0xffffffff) != (Class37_Sub23.anIntArray2237[i_59_] ^
                            0xffffffff)) {
                        Class37_Sub23.anIntArray2237[i_59_] = Class80.anIntArray1503[i_59_];
                        Class65.method1183(i_59_, (byte) -3);

                        Class37_Sub9_Sub1.anIntArray2918[Class37_Sub4_Sub7.method490(31,
                            Class24.anInt615++)] = i_59_;
                    }
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -108) {
                int i_60_ = Class83.packetStream.readInt2(94);
                int i_61_ = Class83.packetStream.readSignedShortLE(i ^
                        ~0x2);
                Class18 class18 = Class37_Sub9_Sub14.method820(i_60_, 4096);

                if ((i_61_ != class18.anInt390) || (i_61_ == -1)) {
                    class18.anInt390 = i_61_;
                    class18.anInt323 = 0;
                    class18.anInt443 = 0;
                    Class73.method1274(class18, -1);
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 117) {
                long l = Class83.packetStream.readLongDuplicate(false);
                long l_62_ = (long) Class83.packetStream.readShort();
                long l_63_ = (long) Class83.packetStream.read3Bytes(-26256544);
                long l_64_ = l_63_ + (l_62_ << 2100974816);
                int i_65_ = Class83.packetStream.readByte(116);
                boolean bool = false;

                for (int i_66_ = 0; (i_66_ ^ 0xffffffff) > -101; i_66_++) {
                    if (l_64_ == Class57.aLongArray1099[i_66_]) {
                        bool = true;

                        break;
                    }
                }

                if (i_65_ <= 1) {
                    for (int i_67_ = 0; Class18.anInt340 > i_67_; i_67_++) {
                        if ((l ^ 0xffffffffffffffffL) == (Class80.aLongArray1504[i_67_] ^
                                0xffffffffffffffffL)) {
                            bool = true;

                            break;
                        }
                    }
                }

                if (!bool && ((Class52_Sub1.anInt2303 ^ 0xffffffff) == -1)) {
                    Class57.aLongArray1099[Class41.anInt900] = l_64_;
                    Class41.anInt900 = (1 + Class41.anInt900) % 100;

                    JString jstring = (Class37_Sub4_Sub9_Sub2.method605(Class36.method319(
                                Class83.packetStream, -68)
                                                                               .formatCapitalization(1)));

                    if (((i_65_ ^ 0xffffffff) != -3) &&
                            ((i_65_ ^ 0xffffffff) != -4)) {
                        if ((i_65_ ^ 0xffffffff) == -2) {
                            Class37_Sub4_Sub7_Sub1_Sub1.method505((Class37_Sub9_Sub27.method881(
                                    111,
                                    new JString[] {
                                        AbstractDrawingArea.aJString_741,
                                        Class37_Sub4_Sub13.method708(37, l)
                                                          .capitalizeAfterQuestion(70)
                                    })), 7, jstring, (byte) 85);
                        } else {
                            Class37_Sub4_Sub7_Sub1_Sub1.method505(Class37_Sub4_Sub13.method708(i ^
                                    ~0x25, l).capitalizeAfterQuestion(70), 3, jstring,
                                (byte) 111);
                        }
                    } else {
                        Class37_Sub4_Sub7_Sub1_Sub1.method505((Class37_Sub9_Sub27.method881(i ^
                                ~0x6c,
                                new JString[] {
                                    Class42.aJString_917,
                                    Class37_Sub4_Sub13.method708(37, l)
                                                      .capitalizeAfterQuestion(70)
                                })), 7, jstring, (byte) -107);
                    }
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 48) {
                Class37_Sub9_Sub21.anInt3321 = Class83.packetStream.readByte(i ^
                        ~0x77);

                if (Class37_Sub9_Sub21.anInt3321 == 1) {
                    Class50.anInt1016 = Class83.packetStream.readShort();
                }

                if (((Class37_Sub9_Sub21.anInt3321 ^ 0xffffffff) <= -3) &&
                        (Class37_Sub9_Sub21.anInt3321 <= 6)) {
                    if (Class37_Sub9_Sub21.anInt3321 == 2) {
                        Class59.anInt1132 = 64;
                        Class88.anInt1599 = 64;
                    }

                    if (Class37_Sub9_Sub21.anInt3321 == 3) {
                        Class59.anInt1132 = 0;
                        Class88.anInt1599 = 64;
                    }

                    if (Class37_Sub9_Sub21.anInt3321 == 4) {
                        Class59.anInt1132 = 128;
                        Class88.anInt1599 = 64;
                    }

                    if ((Class37_Sub9_Sub21.anInt3321 ^ 0xffffffff) == -6) {
                        Class59.anInt1132 = 64;
                        Class88.anInt1599 = 0;
                    }

                    if (Class37_Sub9_Sub21.anInt3321 == 6) {
                        Class59.anInt1132 = 64;
                        Class88.anInt1599 = 128;
                    }

                    Class37_Sub9_Sub21.anInt3321 = 2;

                    Class38.anInt851 = Class83.packetStream.readShort();

                    Class71.anInt1362 = Class83.packetStream.readShort();

                    Class41.anInt906 = Class83.packetStream.readByte(127);
                }

                if (Class37_Sub9_Sub21.anInt3321 == 10) {
                    Class2.anInt82 = Class83.packetStream.readShort();
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 175) {
                Stream.loadMap(0, true);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -85) {
                Class79.anInt1474 = 0;
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 187) {
                int i_68_ = Class83.packetStream.readInt();
                int i_69_ = Class83.packetStream.readShort();

                if ((i_68_ ^ 0xffffffff) > 69999) {
                    i_69_ += 32768;
                }

                Class18 class18;

                if ((i_68_ ^ 0xffffffff) > -1) {
                    class18 = null;
                } else {
                    class18 = Class37_Sub9_Sub14.method820(i_68_, i + 4097);
                }

                while ((Class83.packetStream.bufferLocation ^
                        0xffffffff) > (Class37_Sub4.packetSize ^ 0xffffffff)) {
                    int i_70_ = Class83.packetStream.readSignedShortOrByte(255);
                    int i_71_ = Class83.packetStream.readShort();
                    int i_72_ = 0;

                    if (i_71_ != 0) {
                        i_72_ = Class83.packetStream.readByte(125);

                        if ((i_72_ ^ 0xffffffff) == -256) {
                            i_72_ = Class83.packetStream.readInt();
                        }
                    }

                    if ((class18 != null) && ((i_70_ ^ 0xffffffff) <= -1) &&
                            ((class18.anIntArray356.length ^ 0xffffffff) < (i_70_ ^
                            0xffffffff))) {
                        class18.anIntArray356[i_70_] = i_71_;
                        class18.anIntArray422[i_70_] = i_72_;
                    }

                    Class52_Sub1.method1131(i_72_, i_70_, i_69_, 25, i_71_ +
                        -1);
                }

                if (class18 != null) {
                    Class73.method1274(class18, -1);
                }

                Class37_Sub9_Sub15.method822((byte) 96);

                Class37_Sub9.anIntArray1964[Class37_Sub4_Sub7.method490(Class37_Sub4_Sub8.anInt2642++,
                    31)] = Class37_Sub4_Sub7.method490(32767, i_69_);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -45) {
                int i_73_ = Class83.packetStream.readByte(117);
                int i_74_ = Class83.packetStream.readByte(i ^
                        ~0x77);
                int i_75_ = Class83.packetStream.readByte(i ^
                        ~0x7a);
                int i_76_ = Class83.packetStream.readByte(123);
                int i_77_ = Class83.packetStream.readShort();
                Class37_Sub9_Sub30.aBooleanArray3477[i_73_] = true;
                Class37_Sub9_Sub4.anIntArray2982[i_73_] = i_74_;
                Class82.anIntArray1702[i_73_] = i_75_;
                Class65.anIntArray1229[i_73_] = i_76_;
                Class58.anIntArray1126[i_73_] = i_77_;
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -174) {
                Class18.anInt340 = Class37_Sub4.packetSize / 8;

                for (int i_78_ = 0; i_78_ < Class18.anInt340; i_78_++) {
                    Class80.aLongArray1504[i_78_] = Class83.packetStream.readLongDuplicate(false);

                    Class18.aJStringArray332[i_78_] = Class37_Sub4_Sub13.method708(37,
                            Class80.aLongArray1504[i_78_]);
                }

                Class37_Sub9_Sub32.anInt3509 = Class83.anInt1515;
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -256) {
                int i_79_ = Class83.packetStream.readShortLEA(i ^
                        ~0x2);
                int i_80_ = Class83.packetStream.readIntLE(-52131576);
                Class18 class18 = Class37_Sub9_Sub14.method820(i_80_, 4096);

                if ((class18 != null) &&
                        ((class18.anInt354 ^ 0xffffffff) == -1)) {
                    if ((-class18.anInt353 + class18.anInt348) < i_79_) {
                        i_79_ = class18.anInt348 - class18.anInt353;
                    }

                    if ((i_79_ ^ 0xffffffff) > -1) {
                        i_79_ = 0;
                    }

                    if (i_79_ != class18.anInt432) {
                        class18.anInt432 = i_79_;
                        Class73.method1274(class18, i);
                    }
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 251) {
                int i_81_ = Class83.packetStream.readShortLE(2);
                AbstractDrawingArea.anInt733 = i_81_;
                Class37_Sub10.method928((byte) 27, i_81_);
                Class87.method1330(AbstractDrawingArea.anInt733, i + -49);

                for (int i_82_ = 0; (i_82_ ^ 0xffffffff) > -101; i_82_++)
                    Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_82_] = true;

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -231) {
                int i_83_ = Class83.packetStream.readByteC((byte) 50);
                int i_84_ = Class83.packetStream.readByteS(i + 256);
                int i_85_ = Class83.packetStream.readByteS(255);
                Class37_Sub9_Sub1.anInt2916 = i_84_ >> 953413153;
                Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.method499(i_83_,
                    i_85_, (0x1 & i_84_) == 1, -125);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -57) {
                Class42.anInt931 = Class83.anInt1515;

                long l = Class83.packetStream.readLongDuplicate(false);

                if ((l ^ 0xffffffffffffffffL) == -1L) {
                    Class37_Sub9_Sub1.aJString_2911 = null;
                    Class14.aClass37_Sub18Array240 = null;
                    Class14.aJString_252 = null;
                    Login.anInt783 = 0;
                    Class37_Sub9_Sub17.packetId = -1;

                    return true;
                }

                long l_86_ = Class83.packetStream.readLongDuplicate(false);
                Class14.aJString_252 = Class37_Sub4_Sub13.method708(37, l_86_);

                Class37_Sub9_Sub1.aJString_2911 = Class37_Sub4_Sub13.method708(37,
                        l);

                Class37_Sub4_Sub4.aByte2573 = Class83.packetStream.readSignedByte((byte) 107);

                int i_87_ = Class83.packetStream.readByte(125);

                if (i_87_ == 255) {
                    Class37_Sub9_Sub17.packetId = -1;

                    return true;
                }

                Login.anInt783 = i_87_;

                Class37_Sub18[] class37_sub18s = new Class37_Sub18[100];

                for (int i_88_ = 0;
                        (Login.anInt783 ^ 0xffffffff) < (i_88_ ^ 0xffffffff);
                        i_88_++) {
                    class37_sub18s[i_88_] = new Class37_Sub18();

                    class37_sub18s[i_88_].aLong818 = Class83.packetStream.readLongDuplicate(false);

                    class37_sub18s[i_88_].aJString_2197 = Class37_Sub4_Sub13.method708(37,
                            class37_sub18s[i_88_].aLong818);

                    class37_sub18s[i_88_].anInt2192 = Class83.packetStream.readShort();

                    class37_sub18s[i_88_].aByte2194 = Class83.packetStream.readSignedByte((byte) 102);

                    if ((Class37_Sub9_Sub34.aLong3556 ^ 0xffffffffffffffffL) == (class37_sub18s[i_88_].aLong818 ^
                            0xffffffffffffffffL)) {
                        Class83.aByte1519 = class37_sub18s[i_88_].aByte2194;
                    }
                }

                boolean bool = false;
                int i_89_ = Login.anInt783;

                while (i_89_ > 0) {
                    i_89_--;
                    bool = true;

                    for (int i_90_ = 0; i_90_ < i_89_; i_90_++) {
                        if (((class37_sub18s[i_90_].aJString_2197.compareString(
                                    class37_sub18s[i_90_ + 1].aJString_2197,
                                    10303)) ^ 0xffffffff) < -1) {
                            Class37_Sub18 class37_sub18 = class37_sub18s[i_90_];
                            class37_sub18s[i_90_] = class37_sub18s[i_90_ - -1];
                            bool = false;
                            class37_sub18s[1 + i_90_] = class37_sub18;
                        }
                    }

                    if (bool) {
                        break;
                    }
                }

                Class37_Sub9_Sub17.packetId = -1;
                Class14.aClass37_Sub18Array240 = class37_sub18s;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -168) {
                Class37_Sub4_Sub12.aBoolean2775 = true;

                Class37_Sub9_Sub11.anInt3094 = Class83.packetStream.readByte(118);

                Login.anInt785 = Class83.packetStream.readByte(120);

                Class37_Sub9_Sub22.anInt3333 = Class83.packetStream.readShort();

                JS5.anInt259 = Class83.packetStream.readByte(126);

                Class6.anInt146 = Class83.packetStream.readByte(119);

                if ((Class6.anInt146 ^ 0xffffffff) <= -101) {
                    int i_91_ = 64 + (Login.anInt785 * 128);
                    int i_92_ = (Class37_Sub9_Sub11.anInt3094 * 128) + 64;
                    int i_93_ = (JString.method153(Class37_Sub9_Sub1.anInt2916,
                            -169496123, i_91_, i_92_) -
                        Class37_Sub9_Sub22.anInt3333);
                    int i_94_ = i_92_ + -RSSocket.anInt483;
                    int i_95_ = i_91_ - Class37_Sub6.anInt1888;
                    int i_96_ = i_93_ + -Class37_Sub25.anInt2286;
                    int i_97_ = (int) Math.sqrt((double) ((i_94_ * i_94_) +
                            (i_95_ * i_95_)));

                    Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 = 0x7ff &
                        (int) (Math.atan2((double) i_96_, (double) i_97_) * 325.949);

                    Class37_Sub17.anInt2188 = ((int) (-325.949 * Math.atan2((double) i_94_,
                            (double) i_95_)) & 0x7ff);

                    if (Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 < 128) {
                        Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 = 128;
                    }

                    if ((Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 ^ 0xffffffff) < -384) {
                        Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 = 383;
                    }
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -101) {
                for (int i_98_ = 0;
                        (Class1.anInt65 ^ 0xffffffff) < (i_98_ ^ 0xffffffff);
                        i_98_++) {
                    Class37_Sub4_Sub14 class37_sub4_sub14 = Class37_Sub4_Sub18.method730(i +
                            -9093, i_98_);

                    if ((class37_sub4_sub14 != null) &&
                            ((class37_sub4_sub14.anInt2808 ^ 0xffffffff) == -1)) {
                        Class80.anIntArray1503[i_98_] = 0;
                        Class37_Sub23.anIntArray2237[i_98_] = 0;
                    }
                }

                Class37_Sub9_Sub15.method822((byte) 96);
                Class24.anInt615 += 32;
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 66) {
                Class37_Sub9_Sub15.method822((byte) 96);

                Class33.anInt761 = Class83.packetStream.readSignedShort((byte) 111);
                Class37_Sub9_Sub17.packetId = -1;
                Class37_Sub9_Sub37.anInt3602 = Class83.anInt1515;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -139) {
                for (int i_99_ = 0;
                        ((i_99_ ^ 0xffffffff) > (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414.length ^
                        0xffffffff)); i_99_++) {
                    if (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_99_] != null) {
                        Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_99_].anInt3655 = -1;
                    }
                }

                for (int i_100_ = 0;
                        ((Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111).length > i_100_);
                        i_100_++) {
                    if ((Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_100_]) != null) {
                        Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_100_].anInt3655 = -1;
                    }
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 150) {
                Class37_Sub9_Sub21.method853(i + -25827);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 158) {
                int i_101_ = Class83.packetStream.readShort();
                Class37_Sub7.method742(false, i_101_);

                Class37_Sub9.anIntArray1964[Class37_Sub4_Sub7.method490(31,
                    Class37_Sub4_Sub8.anInt2642++)] = Class37_Sub4_Sub7.method490(32767,
                        i_101_);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -62) {
                Stream.loadMap(0, false);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 200) {
                long l = Class83.packetStream.readLongDuplicate(false);
                int i_102_ = Class83.packetStream.readShort();
                int i_103_ = Class83.packetStream.readByte(i ^
                        ~0x76);
                JString jstring = Class37_Sub4_Sub13.method708(37, l)
                                                    .capitalizeAfterQuestion(i + 71);

                for (int i_104_ = 0;
                        (RSApplet.anInt173 ^ 0xffffffff) < (i_104_ ^ 0xffffffff);
                        i_104_++) {
                    if (l == Class71.aLongArray1360[i_104_]) {
                        if ((i_102_ ^ 0xffffffff) != (RSApplet.anIntArray176[i_104_] ^
                                0xffffffff)) {
                            RSApplet.anIntArray176[i_104_] = i_102_;

                            if (i_102_ > 0) {
                                Class37_Sub4_Sub7_Sub1_Sub1.method505(Class37_Sub9_Sub8.aJString_3045,
                                    5,
                                    (Class37_Sub9_Sub27.method881(118,
                                        (new JString[] {
                                            jstring, Class41.aJString_889
                                        }))), (byte) 84);
                            }

                            if (i_102_ == 0) {
                                Class37_Sub4_Sub7_Sub1_Sub1.method505(Class37_Sub9_Sub8.aJString_3045,
                                    5,
                                    (Class37_Sub9_Sub27.method881(-74,
                                        (new JString[] {
                                            jstring, Class56.aJString_1097
                                        }))), (byte) 86);
                            }
                        }

                        Class37_Sub9_Sub31.anIntArray3484[i_104_] = i_103_;
                        jstring = null;

                        break;
                    }
                }

                if ((jstring != null) && (RSApplet.anInt173 < 200)) {
                    Class71.aLongArray1360[RSApplet.anInt173] = l;
                    CacheIO.aJStringArray1342[RSApplet.anInt173] = jstring;
                    RSApplet.anIntArray176[RSApplet.anInt173] = i_102_;

                    Class37_Sub9_Sub31.anIntArray3484[RSApplet.anInt173] = i_103_;
                    RSApplet.anInt173++;
                }

                Class37_Sub9_Sub32.anInt3509 = Class83.anInt1515;

                boolean bool = false;
                int i_105_ = RSApplet.anInt173;

                while (i_105_ > 0) {
                    bool = true;
                    i_105_--;

                    for (int i_106_ = 0;
                            (i_105_ ^ 0xffffffff) < (i_106_ ^ 0xffffffff);
                            i_106_++) {
                        if ((((world ^ 0xffffffff) != (RSApplet.anIntArray176[i_106_] ^
                                0xffffffff)) &&
                                ((RSApplet.anIntArray176[1 + i_106_] ^
                                0xffffffff) == (world ^ 0xffffffff))) ||
                                ((RSApplet.anIntArray176[i_106_] == 0) &&
                                (RSApplet.anIntArray176[1 + i_106_] != 0))) {
                            bool = false;

                            int i_107_ = RSApplet.anIntArray176[i_106_];

                            RSApplet.anIntArray176[i_106_] = RSApplet.anIntArray176[i_106_ +
                                1];
                            RSApplet.anIntArray176[1 + i_106_] = i_107_;

                            JString jstring_108_ = CacheIO.aJStringArray1342[i_106_];

                            CacheIO.aJStringArray1342[i_106_] = CacheIO.aJStringArray1342[1 +
                                i_106_];

                            CacheIO.aJStringArray1342[1 + i_106_] = jstring_108_;

                            long l_109_ = Class71.aLongArray1360[i_106_];

                            Class71.aLongArray1360[i_106_] = Class71.aLongArray1360[i_106_ -
                                -1];
                            Class71.aLongArray1360[1 + i_106_] = l_109_;

                            int i_110_ = Class37_Sub9_Sub31.anIntArray3484[i_106_];

                            Class37_Sub9_Sub31.anIntArray3484[i_106_] = (Class37_Sub9_Sub31.anIntArray3484[1 +
                                i_106_]);

                            Class37_Sub9_Sub31.anIntArray3484[i_106_ + 1] = i_110_;
                        }
                    }

                    if (bool) {
                        break;
                    }
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -154) {
                int i_111_ = Class83.packetStream.readInt1(i ^
                        ~0x1fff);
                Class18 class18 = Class37_Sub9_Sub14.method820(i_111_, 4096);

                for (int i_112_ = 0; class18.anIntArray356.length > i_112_;
                        i_112_++) {
                    class18.anIntArray356[i_112_] = -1;
                    class18.anIntArray356[i_112_] = 0;
                }

                Class73.method1274(class18, -1);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 196) {
                Class37_Sub9_Sub15.method822((byte) 96);

                int i_113_ = Class83.packetStream.readByte(118);
                int i_114_ = Class83.packetStream.readInt2(i +
                        126);
                int i_115_ = Class83.packetStream.readByte(117);
                Class37_Sub12.anIntArray2104[i_113_] = i_114_;
                Class82.anIntArray1696[i_113_] = i_115_;
                Class68.anIntArray1324[i_113_] = 1;

                for (int i_116_ = 0; (i_116_ ^ 0xffffffff) > -99; i_116_++) {
                    if (Class17.anIntArray307[i_116_] <= i_114_) {
                        Class68.anIntArray1324[i_113_] = 2 + i_116_;
                    }
                }

                Class37_Sub9_Sub30.anIntArray3475[Class37_Sub4_Sub7.method490(31,
                    Class37_Sub9_Sub3.anInt2946++)] = i_113_;
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -147) {
                Class37_Sub9_Sub7.method788(13896);

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 33) {
                int i_117_ = Class83.packetStream.readShortLEA(2);
                int i_118_ = Class83.packetStream.readInt1(i ^
                        ~0x1fff);
                Class18 class18 = Class37_Sub9_Sub14.method820(i_118_, 4096);

                if (((class18.anInt408 ^ 0xffffffff) != -2) ||
                        (class18.anInt369 != i_117_)) {
                    class18.anInt408 = 1;
                    class18.anInt369 = i_117_;
                    Class73.method1274(class18, -1);
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -120) {
                int i_119_ = Class83.packetStream.readInt();
                int i_120_ = Class83.packetStream.readShort();

                Class18 class18;

                if ((i_119_ ^ 0xffffffff) > -1) {
                    class18 = null;
                } else {
                    class18 = Class37_Sub9_Sub14.method820(i_119_, i + 4097);
                }

                if (class18 != null) {
                    for (int i_121_ = 0;
                            ((i_121_ ^ 0xffffffff) > (class18.anIntArray356.length ^
                            0xffffffff)); i_121_++) {
                        class18.anIntArray356[i_121_] = 0;
                        class18.anIntArray422[i_121_] = 0;
                    }
                }

                if (i_119_ < -70000) {
                    i_120_ += 32768;
                }

                Class24.method249(i_120_, 0);

                int i_122_ = Class83.packetStream.readShort();

                for (int i_123_ = 0;
                        (i_123_ ^ 0xffffffff) > (i_122_ ^ 0xffffffff);
                        i_123_++) {
                    int i_124_ = Class83.packetStream.readByteC((byte) 75);

                    if ((i_124_ ^ 0xffffffff) == -256) {
                        i_124_ = Class83.packetStream.readIntLE(-52131576);
                    }
                    int i_125_ = Class83.packetStream.readShortLEA(2);

                    if ((class18 != null) &&
                            ((i_123_ ^ 0xffffffff) > (class18.anIntArray356.length ^
                            0xffffffff))) {
                        class18.anIntArray356[i_123_] = i_125_;
                        class18.anIntArray422[i_123_] = i_124_;
                    }

                    Class52_Sub1.method1131(i_124_, i_123_, i_120_, 64,
                        -1 + i_125_);
                }

                if (class18 != null) {
                    Class73.method1274(class18, -1);
                }

                Class37_Sub9_Sub15.method822((byte) 96);

                Class37_Sub9.anIntArray1964[Class37_Sub4_Sub7.method490(31,
                    Class37_Sub4_Sub8.anInt2642++)] = Class37_Sub4_Sub7.method490(32767,
                        i_120_);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -37) {
                int i_126_ = Class83.packetStream.readShort();
                int i_127_ = Class83.packetStream.readShortLE(2);
                int i_128_ = Class83.packetStream.readInt();
                int i_129_ = Class83.packetStream.readShortLEA(2);
                Class18 class18 = Class37_Sub9_Sub14.method820(i_128_, 4096);

                if ((class18.anInt319 != i_126_) ||
                        ((class18.anInt405 ^ 0xffffffff) != (i_129_ ^
                        0xffffffff)) ||
                        ((i_127_ ^ 0xffffffff) != (class18.anInt387 ^
                        0xffffffff))) {
                    class18.anInt405 = i_129_;
                    class18.anInt319 = i_126_;
                    class18.anInt387 = i_127_;
                    Class73.method1274(class18, -1);
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 184) {
                boolean bool = ((Class83.packetStream.readByteA() ^
                    0xffffffff) == -2);
                int i_130_ = Class83.packetStream.readInt();
                Class18 class18 = Class37_Sub9_Sub14.method820(i_130_, i +
                        4097);

                if (bool != class18.aBoolean445) {
                    class18.aBoolean445 = bool;
                    Class73.method1274(class18, -1);
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 4) {
                int i_131_ = Class83.packetStream.readByte(i ^
                        ~0x7a);

                if (Class83.packetStream.readByte(119) != 0) {
                    Class83.packetStream.bufferLocation--;

                    Class37_Sub4_Sub8.aClass62Array2643[i_131_] = new Class62(Class83.packetStream);
                } else {
                    Class37_Sub4_Sub8.aClass62Array2643[i_131_] = new Class62();
                }

                Class37_Sub9_Sub17.packetId = -1;
                Class37_Sub6.anInt1889 = Class83.anInt1515;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 32) {
                long l = Class83.packetStream.readLongDuplicate(false);
                int i_132_ = Class83.packetStream.readShort();
                byte i_133_ = Class83.packetStream.readSignedByte((byte) 97);
                boolean bool = false;

                if ((~0x7fffffffffffffffL & l) != 0L) {
                    bool = true;
                }

                if (bool) {
                    if ((Login.anInt783 ^ 0xffffffff) == -1) {
                        Class37_Sub9_Sub17.packetId = -1;

                        return true;
                    }

                    boolean bool_134_ = false;
                    l &= 0x7fffffffffffffffL;

                    int i_135_;

                    for (i_135_ = 0; i_135_ < Login.anInt783; i_135_++) {
                        if (((Class14.aClass37_Sub18Array240[i_135_].aLong818 ^
                                0xffffffffffffffffL) == (l ^
                                0xffffffffffffffffL)) &&
                                ((i_132_ ^ 0xffffffff) == ((Class14.aClass37_Sub18Array240[i_135_].anInt2192) ^
                                0xffffffff))) {
                            break;
                        }
                    }

                    if ((i_135_ ^ 0xffffffff) > (Login.anInt783 ^ 0xffffffff)) {
                        for (;
                                (((Login.anInt783 + -1) ^ 0xffffffff) < (i_135_ ^
                                0xffffffff)); i_135_++)
                            Class14.aClass37_Sub18Array240[i_135_] = Class14.aClass37_Sub18Array240[1 +
                                i_135_];

                        Login.anInt783--;

                        Class14.aClass37_Sub18Array240[Login.anInt783] = null;
                    }
                } else {
                    Class37_Sub18 class37_sub18 = new Class37_Sub18();
                    class37_sub18.aLong818 = l;

                    class37_sub18.aJString_2197 = Class37_Sub4_Sub13.method708(37,
                            class37_sub18.aLong818);
                    class37_sub18.aByte2194 = i_133_;
                    class37_sub18.anInt2192 = i_132_;

                    int i_136_;

                    for (i_136_ = Login.anInt783 - 1; i_136_ >= 0;
                            i_136_--) {
                        int i_137_ = (Class14.aClass37_Sub18Array240[i_136_].aJString_2197.compareString(class37_sub18.aJString_2197,
                                10303));

                        if ((i_137_ ^ 0xffffffff) == -1) {
                            Class14.aClass37_Sub18Array240[i_136_].anInt2192 = i_132_;

                            Class14.aClass37_Sub18Array240[i_136_].aByte2194 = i_133_;
                            Class37_Sub9_Sub17.packetId = -1;
                            Class42.anInt931 = Class83.anInt1515;

                            if (l == Class37_Sub9_Sub34.aLong3556) {
                                Class83.aByte1519 = i_133_;
                            }

                            return true;
                        }

                        if (i_137_ < 0) {
                            break;
                        }
                    }

                    if ((Login.anInt783 ^ 0xffffffff) <= (Class14.aClass37_Sub18Array240.length ^
                            0xffffffff)) {
                        Class37_Sub9_Sub17.packetId = -1;

                        return true;
                    }

                    for (int i_138_ = -1 + Login.anInt783; i_138_ > i_136_;
                            i_138_--)
                        Class14.aClass37_Sub18Array240[i_138_ - -1] = Class14.aClass37_Sub18Array240[i_138_];

                    if (Login.anInt783 == 0) {
                        Class14.aClass37_Sub18Array240 = new Class37_Sub18[100];
                    }

                    Class14.aClass37_Sub18Array240[1 + i_136_] = class37_sub18;
                    Login.anInt783++;

                    if ((l ^ 0xffffffffffffffffL) == (Class37_Sub9_Sub34.aLong3556 ^
                            0xffffffffffffffffL)) {
                        Class83.aByte1519 = i_133_;
                    }
                }

                Class37_Sub9_Sub17.packetId = -1;
                Class42.anInt931 = Class83.anInt1515;

            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -244) {
                int i_139_ = Class83.packetStream.readShort();
                int i_140_ = Class83.packetStream.readByte(126);
                int i_141_ = Class83.packetStream.readShort();
                Class66.method1190((byte) -100, i_141_, i_140_, i_139_);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 178) {
                int i_142_ = Class83.packetStream.readShortLEA(i ^
                        ~0x2);
                int i_143_ = Class83.packetStream.readShortLEA(2);
                int i_144_ = Class83.packetStream.readIntLE(i ^
                        0x31b76f7);
                Class18 class18 = Class37_Sub9_Sub14.method820(i_144_, i +
                        4097);
                Class37_Sub9_Sub17.packetId = -1;
                class18.anInt344 = i_142_ + (i_143_ << -997327696);

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -134) {
                int i_145_ = Class83.packetStream.readIntLE(-52131576);
                int i_146_ = Class83.packetStream.readShortLEA(2);
                int i_147_ = Class83.packetStream.readInt();

                if ((i_146_ ^ 0xffffffff) == -65536) {
                    i_146_ = -1;
                }

                int i_148_ = Class83.packetStream.readShortA(-1739943584);

                if ((i_148_ ^ 0xffffffff) == -65536) {
                    i_148_ = -1;
                }

                for (int i_149_ = i_148_; i_149_ <= i_146_; i_149_++) {
                    long l = ((long) i_147_ << 2023192480) + (long) i_149_;
                    Class37 class37 = Class62.aClass13_1177.method100((byte) 117,
                            l);

                    if (class37 != null) {
                        class37.method322(false);
                    }

                    Class62.aClass13_1177.method101(new Class37_Sub10(i_145_),
                        false, l);
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -226) {
                int i_150_ = Class83.packetStream.readByteS(255);
                JString jstring = Class83.packetStream.readString();
                int i_151_ = Class83.packetStream.readByteC((byte) 66);

                if (((i_151_ ^ 0xffffffff) <= -2) &&
                        ((i_151_ ^ 0xffffffff) >= -9)) {
                    if (jstring.equalsIgnoreCase(Class37_Sub9_Sub17.aJString_3226,
                                (byte) 71)) {
                        jstring = null;
                    }

                    Class75.aJStringArray1413[-1 + i_151_] = jstring;

                    Class54.aBooleanArray1058[i_151_ + -1] = (i_150_ ^
                        0xffffffff) == -1;
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -170) {
                Class65.anInt1231 = Class83.packetStream.readByteS(i ^
                        ~0xff);

                Class50.anInt1028 = Class83.packetStream.readByteA();

                for (int i_152_ = Class50.anInt1028;
                        i_152_ < (8 + Class50.anInt1028); i_152_++) {
                    for (int i_153_ = Class65.anInt1231;
                            (((Class65.anInt1231 + 8) ^ 0xffffffff) < (i_153_ ^
                            0xffffffff)); i_153_++) {
                        if ((Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[Class37_Sub9_Sub1.anInt2916][i_152_][i_153_]) != null) {
                            Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[Class37_Sub9_Sub1.anInt2916][i_152_][i_153_] = null;
                            Class37_Sub2.method335(i_153_, i_152_, 19938);
                        }
                    }
                }

                for (Class37_Sub2 class37_sub2 = ((Class37_Sub2) Class37_Sub9_Sub28.aClass58_3427.method1155(
                            0)); class37_sub2 != null;
                        class37_sub2 = (Class37_Sub2) Class37_Sub9_Sub28.aClass58_3427.method1162(
                                (byte) 104)) {
                    if (((Class50.anInt1028 ^ 0xffffffff) >= (class37_sub2.anInt1836 ^
                            0xffffffff)) &&
                            (((8 + Class50.anInt1028) ^ 0xffffffff) < (class37_sub2.anInt1836 ^
                            0xffffffff)) &&
                            ((Class65.anInt1231 ^ 0xffffffff) >= (class37_sub2.anInt1829 ^
                            0xffffffff)) &&
                            (class37_sub2.anInt1829 < (8 + Class65.anInt1231)) &&
                            ((class37_sub2.anInt1813 ^ 0xffffffff) == (Class37_Sub9_Sub1.anInt2916 ^
                            0xffffffff))) {
                        class37_sub2.anInt1828 = 0;
                    }
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -232) {
                int i_154_ = Class83.packetStream.readInt2(114);
                JString jstring = Class83.packetStream.readString();
                Class18 class18 = Class37_Sub9_Sub14.method820(i_154_,
                        i ^ ~0x1000);

                if (!jstring.equals(-107, class18.aJString_411)) {
                    class18.aJString_411 = jstring;
                    Class73.method1274(class18, -1);
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 76) {
                int i_155_ = Class83.packetStream.readSignedShortLE(2);
                int i_156_ = Class83.packetStream.readIntLE(i +
                        -52131575);
                int i_157_ = Class83.packetStream.readSignedShortA(-2453);
                Class18 class18 = Class37_Sub9_Sub14.method820(i_156_, 4096);
                int i_158_ = class18.anInt397 - -i_157_;
                int i_159_ = class18.anInt326 + i_155_;

                if (((class18.anInt329 ^ 0xffffffff) != (i_159_ ^ 0xffffffff)) ||
                        ((class18.anInt415 ^ 0xffffffff) != (i_158_ ^
                        0xffffffff))) {
                    class18.anInt415 = i_158_;
                    class18.anInt329 = i_159_;
                    Class73.method1274(class18, -1);
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if (Class37_Sub9_Sub17.packetId == 57) {
                long l = Class83.packetStream.readLongDuplicate(false);
                JString jstring = (Class37_Sub4_Sub9_Sub2.method605(Class36.method319(
                            Class83.packetStream, -58).formatCapitalization(1)));
                Class37_Sub4_Sub7_Sub1_Sub1.method505(Class37_Sub4_Sub13.method708(
                        37, l).capitalizeAfterQuestion(70), 6, jstring, (byte) -87);
                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            if ((Class37_Sub9_Sub17.packetId ^ 0xffffffff) == -250) {
                int i_160_ = Class83.packetStream.readInt1(8191);
                int i_161_ = Class83.packetStream.readInt();
                int i_162_ = Class83.packetStream.readShort();

                if (i_162_ == 65535) {
                    i_162_ = -1;
                }

                Class18 class18 = Class37_Sub9_Sub14.method820(i_160_, 4096);

                if (class18.aBoolean374) {
                    class18.anInt368 = i_161_;
                    class18.anInt367 = i_162_;

                    ItemDef itemdef = Class46.method1108(i_162_,
                            (byte) 79);
                    class18.anInt395 = itemdef.anInt2440;
                    class18.anInt319 = itemdef.anInt2433;
                    class18.anInt410 = itemdef.anInt2507;
                    class18.anInt387 = itemdef.anInt2469;
                    class18.anInt405 = itemdef.anInt2431;

                    if ((class18.anInt441 ^ 0xffffffff) < -1) {
                        class18.anInt387 = (class18.anInt387 * 32) / class18.anInt441;
                    }

                    class18.anInt359 = itemdef.anInt2517;
                    Class73.method1274(class18, -1);
                } else {
                    if (i_162_ == -1) {
                        class18.anInt408 = 0;
                        Class37_Sub9_Sub17.packetId = -1;

                        return true;
                    }

                    ItemDef itemdef = Class46.method1108(i_162_,
                            (byte) 120);

                    class18.anInt387 = (100 * itemdef.anInt2469) / i_161_;
                    class18.anInt319 = itemdef.anInt2433;
                    class18.anInt369 = i_162_;
                    class18.anInt405 = itemdef.anInt2431;
                    class18.anInt408 = 4;
                    Class73.method1274(class18, i);
                }

                Class37_Sub9_Sub17.packetId = -1;

                return true;
            }

            Class37_Sub9_Sub3.method768(-117,
                ("T1 - " + Class37_Sub9_Sub17.packetId + "," +
                Class37_Sub16.anInt2151 + "," + Class37_Sub9_Sub27.anInt3418 +
                " - " + Class37_Sub4.packetSize), null);
            Class76.method1284((byte) -125);
        } catch (java.io.IOException ioexception) {
            method843(false);
        } catch (Exception exception) {
            String string = ("T2 - " + Class37_Sub9_Sub17.packetId + "," +
                Class37_Sub16.anInt2151 + "," + Class37_Sub9_Sub27.anInt3418 +
                " - " + Class37_Sub4.packetSize + "," +
                (Class37_Sub18.anInt2200 +
                (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0])) +
                "," +
                ((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]) +
                Class15_Sub1.anInt1738) + " - ");

            for (int i_163_ = 0;
                    (i_163_ < Class37_Sub4.packetSize) && (i_163_ < 50);
                    i_163_++)
                string += (Class83.packetStream.buffer[i_163_] +
                ",");

            Class37_Sub9_Sub3.method768(-97, string, exception);
            Class76.method1284((byte) -102);
        }

        return true;
    }

    public void method750(Stream stream, int i, boolean bool) {
        if (bool != true) {
            method750(null, -63, false);
        }

        int i_164_ = i;

        if ((i_164_ ^ 0xffffffff) == -1) {
            anInt3247 = stream.readShort();
        }

        anInt3266++;
    }

    public static void method841(int i, int i_165_, int i_166_, byte i_167_,
        int i_168_) {
        if (i_167_ != 71) {
            method838(null, -47);
        }

        anInt3256++;

        for (int i_169_ = i_168_; (i_165_ + i_168_) >= i_169_; i_169_++) {
            for (int i_170_ = i; (i - -i_166_) >= i_170_; i_170_++) {
                if (((i_170_ ^ 0xffffffff) <= -1) && (i_170_ < 104) &&
                        ((i_169_ ^ 0xffffffff) <= -1) && (i_169_ < 104)) {
                    Class37_Sub9_Sub26.aByteArrayArrayArray3391[0][i_170_][i_169_] = (byte) 127;

                    if ((i_170_ == i) && (i_170_ > 0)) {
                        Class64.anIntArrayArrayArray1217[0][i_170_][i_169_] = (Class64.anIntArrayArrayArray1217[0][-1 +
                            i_170_][i_169_]);
                    }

                    if ((((i_166_ + i) ^ 0xffffffff) == (i_170_ ^ 0xffffffff)) &&
                            (i_170_ < 103)) {
                        Class64.anIntArrayArrayArray1217[0][i_170_][i_169_] = (Class64.anIntArrayArrayArray1217[0][i_170_ +
                            1][i_169_]);
                    }

                    if (((i_168_ ^ 0xffffffff) == (i_169_ ^ 0xffffffff)) &&
                            (i_169_ > 0)) {
                        Class64.anIntArrayArrayArray1217[0][i_170_][i_169_] = (Class64.anIntArrayArrayArray1217[0][i_170_][i_169_ +
                            -1]);
                    }

                    if ((((i_165_ + i_168_) ^ 0xffffffff) == (i_169_ ^
                            0xffffffff)) && (i_169_ < 103)) {
                        Class64.anIntArrayArrayArray1217[0][i_170_][i_169_] = (Class64.anIntArrayArrayArray1217[0][i_170_][1 +
                            i_169_]);
                    }
                }
            }
        }
    }

    public static void method842(int i) {
        if (i < -24) {
            if ((Class43.anInt959 ^ 0xffffffff) >= -1) {
                if (Class37_Sub9_Sub9.anInt3080 > 0) {
                    for (int i_171_ = 0; (i_171_ ^ 0xffffffff) > -257;
                            i_171_++) {
                        if (Class37_Sub9_Sub9.anInt3080 <= 768) {
                            if (Class37_Sub9_Sub9.anInt3080 > 256) {
                                Class22.anIntArray585[i_171_] = (Class37_Sub9_Sub33.anIntArray3519[i_171_]);
                            } else {
                                Class22.anIntArray585[i_171_] = (Class37_Sub9_Sub7.method790((Class37_Sub9_Sub28.anIntArray3428[i_171_]),
                                        1816459564,
                                        (Class37_Sub9_Sub33.anIntArray3519[i_171_]),
                                        256 - Class37_Sub9_Sub9.anInt3080));
                            }
                        } else {
                            Class22.anIntArray585[i_171_] = (Class37_Sub9_Sub7.method790(Class37_Sub9_Sub33.anIntArray3519[i_171_],
                                    1816459564,
                                    Class37_Sub9_Sub28.anIntArray3428[i_171_],
                                    1024 + -Class37_Sub9_Sub9.anInt3080));
                        }
                    }
                } else {
                    for (int i_172_ = 0; i_172_ < 256; i_172_++)
                        Class22.anIntArray585[i_172_] = Class37_Sub9_Sub28.anIntArray3428[i_172_];
                }
            } else {
                for (int i_173_ = 0; (i_173_ ^ 0xffffffff) > -257; i_173_++) {
                    if ((Class43.anInt959 ^ 0xffffffff) < -769) {
                        Class22.anIntArray585[i_173_] = (Class37_Sub9_Sub7.method790(Class37_Sub9.anIntArray1951[i_173_],
                                1816459564,
                                Class37_Sub9_Sub28.anIntArray3428[i_173_],
                                -Class43.anInt959 + 1024));
                    } else if ((Class43.anInt959 ^ 0xffffffff) < -257) {
                        Class22.anIntArray585[i_173_] = Class37_Sub9.anIntArray1951[i_173_];
                    } else {
                        Class22.anIntArray585[i_173_] = (Class37_Sub9_Sub7.method790(Class37_Sub9_Sub28.anIntArray3428[i_173_],
                                1816459564,
                                Class37_Sub9.anIntArray1951[i_173_],
                                256 - Class43.anInt959));
                    }
                }
            }

            anInt3267++;

            int i_174_ = 9 * Class42.aClass37_Sub4_Sub9_Sub3_923.anInt3903;
            int i_175_ = 0;
            int i_176_ = 256;
            int i_177_ = 0;

            for (int i_178_ = 1; (i_176_ - 1) > i_178_; i_178_++) {
                int i_179_ = 22 +
                    ((Class82.anIntArray1692[i_178_] * (-i_178_ + i_176_)) / i_176_);

                if (i_179_ < 0) {
                    i_179_ = 0;
                }

                i_177_ += i_179_;

                for (int i_180_ = i_179_; (i_180_ ^ 0xffffffff) > -129;
                        i_180_++) {
                    int i_181_ = Class52_Sub1.anIntArray2298[i_177_++];
                    int i_182_ = (Class42.aClass37_Sub4_Sub9_Sub3_923.anIntArray3904[i_174_++]);

                    if (i_181_ != 0) {
                        int i_183_ = i_181_;
                        int i_184_ = 256 + -i_181_;
                        i_181_ = Class22.anIntArray585[i_181_];

                        Class56.aClass37_Sub4_Sub9_Sub3_1095.anIntArray3904[i_175_++] = ((Class37_Sub4_Sub7.method490(((i_183_ * Class37_Sub4_Sub7.method490(
                                    65280, i_181_)) +
                                (i_184_ * Class37_Sub4_Sub7.method490(65280,
                                    i_182_))), 16711680)) +
                            (Class37_Sub4_Sub7.method490(-16711936,
                                ((i_184_ * Class37_Sub4_Sub7.method490(i_182_,
                                    16711935)) +
                                (Class37_Sub4_Sub7.method490(16711935, i_181_) * i_183_))))) >> 186336680;
                    } else {
                        Class56.aClass37_Sub4_Sub9_Sub3_1095.anIntArray3904[i_175_++] = i_182_;
                    }
                }

                for (int i_185_ = 0; i_179_ > i_185_; i_185_++)
                    Class56.aClass37_Sub4_Sub9_Sub3_1095.anIntArray3904[i_175_++] = (Class42.aClass37_Sub4_Sub9_Sub3_923.anIntArray3904[i_174_++]);

                i_174_ += (Class42.aClass37_Sub4_Sub9_Sub3_923.anInt3903 +
                -128);
            }

            i_175_ = 0;
            Class56.aClass37_Sub4_Sub9_Sub3_1095.method652(0, 9);
            i_174_ = (9 * Class42.aClass37_Sub4_Sub9_Sub3_923.anInt3903) + 128;
            i_177_ = 0;

            for (int i_186_ = 1;
                    (i_186_ ^ 0xffffffff) > ((-1 + i_176_) ^ 0xffffffff);
                    i_186_++) {
                int i_187_ = (((Class82.anIntArray1692[i_186_] * (-i_186_ +
                    i_176_)) / i_176_) + 22);

                if (i_187_ < 0) {
                    i_187_ = 0;
                }

                for (int i_188_ = 0;
                        (i_188_ ^ 0xffffffff) > (i_187_ ^ 0xffffffff);
                        i_188_++)
                    Class64.aClass37_Sub4_Sub9_Sub3_1212.anIntArray3904[i_175_++] = (Class42.aClass37_Sub4_Sub9_Sub3_923.anIntArray3904[--i_174_]);

                for (int i_189_ = i_187_; (i_189_ ^ 0xffffffff) > -129;
                        i_189_++) {
                    int i_190_ = Class52_Sub1.anIntArray2298[i_177_++];
                    int i_191_ = (Class42.aClass37_Sub4_Sub9_Sub3_923.anIntArray3904[--i_174_]);

                    if (i_190_ == 0) {
                        Class64.aClass37_Sub4_Sub9_Sub3_1212.anIntArray3904[i_175_++] = i_191_;
                    } else {
                        int i_192_ = i_190_;
                        int i_193_ = -i_190_ + 256;
                        i_190_ = Class22.anIntArray585[i_190_];

                        Class64.aClass37_Sub4_Sub9_Sub3_1212.anIntArray3904[i_175_++] = ((Class37_Sub4_Sub7.method490(((i_192_ * Class37_Sub4_Sub7.method490(
                                    65280, i_190_)) -
                                -(Class37_Sub4_Sub7.method490(65280, i_191_) * i_193_)),
                                16711680)) +
                            (Class37_Sub4_Sub7.method490(-16711936,
                                ((Class37_Sub4_Sub7.method490(i_191_, 16711935) * i_193_) +
                                (Class37_Sub4_Sub7.method490(16711935, i_190_) * i_192_))))) >> 1405261768;
                    }
                }

                i_177_ += i_187_;
                i_174_ += (Class42.aClass37_Sub4_Sub9_Sub3_923.anInt3903 -
                -128);
            }

            Class64.aClass37_Sub4_Sub9_Sub3_1212.method652(637, 9);
        }
    }

    public int[] method761(int i, int i_194_) {
        anInt3259++;

        if (i > -125) {
            return null;
        }

        int[] is = aClass38_1966.method1049(i_194_, true);

        if (aClass38_1966.aBoolean850) {
            int i_195_ = Class37_Sub4_Sub16.anIntArray2871[i_194_];

            for (int i_196_ = 0;
                    (AbstractDrawingArea.anInt743 ^ 0xffffffff) < (i_196_ ^ 0xffffffff);
                    i_196_++) {
                int i_197_ = Class84.anIntArray1528[i_196_];

                if ((i_197_ > anInt3247) && (i_197_ < (4096 + -anInt3247)) &&
                        ((-anInt3247 + 2048) < i_195_) &&
                        ((anInt3247 + 2048) > i_195_)) {
                    int i_198_ = 2048 + -i_197_;
                    i_198_ = (i_198_ >= 0) ? i_198_ : (-i_198_);
                    i_198_ <<= 12;
                    i_198_ /= (2048 - anInt3247);
                    is[i_196_] = -i_198_ + 4096;
                } else if (((-anInt3247 + 2048) < i_197_) &&
                        ((anInt3247 + 2048) > i_197_)) {
                    int i_199_ = -2048 + i_195_;
                    i_199_ = (i_199_ < 0) ? (-i_199_) : i_199_;
                    i_199_ -= anInt3247;
                    i_199_ <<= 12;
                    is[i_196_] = i_199_ / (2048 + -anInt3247);
                } else if ((i_195_ < anInt3247) ||
                        (((4096 - anInt3247) ^ 0xffffffff) > (i_195_ ^
                        0xffffffff))) {
                    int i_200_ = -2048 + i_197_;
                    i_200_ = (i_200_ >= 0) ? i_200_ : (-i_200_);
                    i_200_ -= anInt3247;
                    i_200_ <<= 12;
                    is[i_196_] = i_200_ / (-anInt3247 + 2048);
                } else if (((i_197_ ^ 0xffffffff) > (anInt3247 ^ 0xffffffff)) ||
                        ((i_197_ ^ 0xffffffff) < ((4096 + -anInt3247) ^
                        0xffffffff))) {
                    int i_201_ = -i_195_ + 2048;
                    i_201_ = ((i_201_ ^ 0xffffffff) > -1) ? (-i_201_) : i_201_;
                    i_201_ <<= 12;
                    i_201_ /= (2048 + -anInt3247);
                    is[i_196_] = 4096 + -i_201_;
                } else {
                    is[i_196_] = 0;
                }
            }
        }

        return is;
    }

    public static void method843(boolean bool) {
        anInt3249++;

        if (ObjectDef.anInt2734 > 0) {
            Class76.method1284((byte) -107);
        } else {
            Class37_Sub4_Sub3.method461(40, 27931);

            if (bool != false) {
                aJString_3273 = null;
            }

            PacketStream.aClass19_3613 = Applet_Sub1.activeSocket;
            Applet_Sub1.activeSocket = null;
        }
    }
}
