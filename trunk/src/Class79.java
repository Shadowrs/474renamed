/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.Graphics;


public class Class79 {
    public static int anInt1468;
    public static boolean aBoolean1469 = false;
    public static JString aJString_1473;
    public static int anInt1474 = 0;
    public static int anInt1477;
    public static JString aJString_1478;
    public static JString aJString_1481 = Class37_Sub2.method332((byte) 124,
            "Willkommen auf RuneScape");
    public static JString aJString_1482;
    public static int anInt1485;
    public static boolean aBoolean1488;
    public static Class18 aClass18_1489;
    public static int anInt1490;
    public static JString aJString_1492;
    public static JString aJString_1494;
    public static int anInt1495;
    public static JString aJString_1497;

    static {
        aJString_1478 = Class37_Sub2.method332((byte) 126, " )2> <col=ffff00>");
        aJString_1473 = Class37_Sub2.method332((byte) 115, "(U1");
        aJString_1492 = Class37_Sub2.method332((byte) 119, "level)2");
        anInt1495 = 0;
        aJString_1482 = aJString_1492;
        aJString_1494 = Class37_Sub2.method332((byte) 114, "blinken3:");
        aClass18_1489 = null;
        aJString_1497 = Class37_Sub2.method332((byte) 116, ":assistreq:");
    }

    public int anInt1467;
    public int anInt1470;
    public int anInt1471;
    public int anInt1472;
    public int anInt1475;
    public int anInt1476;
    public int anInt1479;
    public int anInt1480;
    public int anInt1483;
    public int anInt1484;
    public int anInt1486;
    public int anInt1487;
    public int anInt1491;
    public int anInt1493;
    public int anInt1496;
    public int anInt1498;
    public int anInt1499;
    public int anInt1500;

    public static boolean method1295(byte i, int i_0_) {
        anInt1490++;

        int i_1_ = -31 % ((i - 20) / 41);

        if (((0x1 & (i_0_ >> 1323616542)) ^ 0xffffffff) == -1) {
            return false;
        }

        return true;
    }

    public static void method1296(int i, int i_2_, int i_3_, int i_4_,
        int i_5_, int i_6_) {
        anInt1477++;

        int i_7_ = Class38.aClass67_847.method1230(i_5_, i_4_, i_3_);

        if (i_7_ != 0) {
            int i_8_ = Class38.aClass67_847.method1239(i_5_, i_4_, i_3_, i_7_);
            int i_9_ = i;
            int i_10_ = i_8_ & 0x1f;
            int i_11_ = (i_4_ * 4) + (24624 - -(2048 * (103 + -i_3_)));

            if ((i_7_ ^ 0xffffffff) < -1) {
                i_9_ = i_2_;
            }

            int i_12_ = (0xc9 & i_8_) >> 913031302;
            int[] is = (Class37_Sub9_Sub16.aClass37_Sub4_Sub9_Sub3_3202.anIntArray3904);
            int i_13_ = 0x7fff & (i_7_ >> -1202319602);
            ObjectDef objectdef = Class37_Sub9_Sub8.method794(i_13_,
                    28067);

            if (objectdef.anInt2706 != -1) {
                Class37_Sub4_Sub9_Sub1 class37_sub4_sub9_sub1 = (Class20.aClass37_Sub4_Sub9_Sub1Array529[objectdef.anInt2706]);

                if (class37_sub4_sub9_sub1 != null) {
                    int i_14_ = (((4 * objectdef.tileDepth) +
                        -class37_sub4_sub9_sub1.anInt3862) / 2);
                    int i_15_ = ((-class37_sub4_sub9_sub1.anInt3865 +
                        (4 * objectdef.tileWidth)) / 2);
                    class37_sub4_sub9_sub1.method597((i_4_ * 4) + 48 + i_15_,
                        ((((104 + -i_3_) - (objectdef.tileDepth)) * 4) +
                        (48 + i_14_)));
                }
            } else {
                if ((i_10_ == 0) || ((i_10_ ^ 0xffffffff) == -3)) {
                    if ((i_12_ ^ 0xffffffff) != -1) {
                        if (i_12_ == 1) {
                            is[i_11_] = i_9_;
                            is[1 + i_11_] = i_9_;
                            is[i_11_ - -2] = i_9_;
                            is[3 + i_11_] = i_9_;
                        } else if ((i_12_ ^ 0xffffffff) == -3) {
                            is[3 + i_11_] = i_9_;
                            is[515 + i_11_] = i_9_;
                            is[(3 + i_11_) - -1024] = i_9_;
                            is[i_11_ - -3 + 1536] = i_9_;
                        } else if (i_12_ == 3) {
                            is[i_11_ + 1536] = i_9_;
                            is[1 + (i_11_ - -1536)] = i_9_;
                            is[1536 + (i_11_ - -2)] = i_9_;
                            is[3 + (1536 + i_11_)] = i_9_;
                        }
                    } else {
                        is[i_11_] = i_9_;
                        is[i_11_ - -512] = i_9_;
                        is[i_11_ + 1024] = i_9_;
                        is[1536 + i_11_] = i_9_;
                    }
                }

                if ((i_10_ ^ 0xffffffff) == -4) {
                    if (i_12_ == 0) {
                        is[i_11_] = i_9_;
                    } else if (i_12_ == 1) {
                        is[i_11_ - -3] = i_9_;
                    } else if ((i_12_ ^ 0xffffffff) != -3) {
                        if ((i_12_ ^ 0xffffffff) == -4) {
                            is[1536 + i_11_] = i_9_;
                        }
                    } else {
                        is[1539 + i_11_] = i_9_;
                    }
                }

                if ((i_10_ ^ 0xffffffff) == -3) {
                    if (i_12_ == 3) {
                        is[i_11_] = i_9_;
                        is[512 + i_11_] = i_9_;
                        is[i_11_ - -1024] = i_9_;
                        is[1536 + i_11_] = i_9_;
                    } else if ((i_12_ ^ 0xffffffff) == -1) {
                        is[i_11_] = i_9_;
                        is[1 + i_11_] = i_9_;
                        is[i_11_ - -2] = i_9_;
                        is[i_11_ - -3] = i_9_;
                    } else if (i_12_ != 1) {
                        if (i_12_ == 2) {
                            is[i_11_ + 1536] = i_9_;
                            is[1 + (i_11_ + 1536)] = i_9_;
                            is[(i_11_ + 1536) - -2] = i_9_;
                            is[1536 + (i_11_ + 3)] = i_9_;
                        }
                    } else {
                        is[i_11_ - -3] = i_9_;
                        is[3 + i_11_ + 512] = i_9_;
                        is[i_11_ + 3 + 1024] = i_9_;
                        is[1536 + (3 + i_11_)] = i_9_;
                    }
                }
            }
        }

        i_7_ = Class38.aClass67_847.method1228(i_5_, i_4_, i_3_);

        if ((i_7_ ^ 0xffffffff) != -1) {
            int i_16_ = Class38.aClass67_847.method1239(i_5_, i_4_, i_3_, i_7_);
            int i_17_ = (0xda & i_16_) >> 1398255910;
            int i_18_ = i_16_ & 0x1f;
            int i_19_ = 0x7fff & (i_7_ >> -915120978);
            ObjectDef objectdef = Class37_Sub9_Sub8.method794(i_19_,
                    i_6_ ^ 0x4f55);

            if (objectdef.anInt2706 != -1) {
                Class37_Sub4_Sub9_Sub1 class37_sub4_sub9_sub1 = (Class20.aClass37_Sub4_Sub9_Sub1Array529[objectdef.anInt2706]);

                if (class37_sub4_sub9_sub1 != null) {
                    int i_20_ = (((4 * objectdef.tileWidth) -
                        class37_sub4_sub9_sub1.anInt3865) / 2);
                    int i_21_ = (((4 * objectdef.tileDepth) -
                        class37_sub4_sub9_sub1.anInt3862) / 2);
                    class37_sub4_sub9_sub1.method597((i_4_ * 4) +
                        (48 - -i_20_),
                        ((((-(objectdef.tileDepth) + (104 - i_3_)) * 4) +
                        48) - -i_21_));
                }
            } else if ((i_18_ ^ 0xffffffff) == -10) {
                int i_22_ = 15658734;

                if (i_7_ > 0) {
                    i_22_ = 15597568;
                }

                int[] is = (Class37_Sub9_Sub16.aClass37_Sub4_Sub9_Sub3_3202.anIntArray3904);
                int i_23_ = (4 * i_4_) +
                    (24624 - -((-(i_3_ * 512) + 52736) * 4));

                if (((i_17_ ^ 0xffffffff) == -1) || (i_17_ == 2)) {
                    is[i_23_ - -1536] = i_22_;
                    is[1 + (1024 + i_23_)] = i_22_;
                    is[(2 + i_23_) - -512] = i_22_;
                    is[3 + i_23_] = i_22_;
                } else {
                    is[i_23_] = i_22_;
                    is[513 + i_23_] = i_22_;
                    is[1024 + i_23_ + 2] = i_22_;
                    is[i_23_ + 1539] = i_22_;
                }
            }
        }

        i_7_ = Class38.aClass67_847.method1199(i_5_, i_4_, i_3_);

        if ((i_7_ ^ 0xffffffff) != -1) {
            int i_24_ = 0x7fff & (i_7_ >> 1444656142);
            ObjectDef objectdef = Class37_Sub9_Sub8.method794(i_24_,
                    28067);

            if (objectdef.anInt2706 != -1) {
                Class37_Sub4_Sub9_Sub1 class37_sub4_sub9_sub1 = (Class20.aClass37_Sub4_Sub9_Sub1Array529[objectdef.anInt2706]);

                if (class37_sub4_sub9_sub1 != null) {
                    int i_25_ = ((-class37_sub4_sub9_sub1.anInt3862 +
                        (4 * objectdef.tileDepth)) / 2);
                    int i_26_ = (((objectdef.tileWidth * 4) +
                        -class37_sub4_sub9_sub1.anInt3865) / 2);
                    class37_sub4_sub9_sub1.method597(48 + ((i_4_ * 4) + i_26_),
                        48 +
                        ((4 * (104 - (i_3_ - -objectdef.tileDepth))) -
                        -i_25_));
                }
            }
        }

        if (i_6_ != 8950) {
            method1297((byte) -119);
        }
    }

    public static void method1297(byte i) {
        aJString_1478 = null;
        aJString_1482 = null;

        if (i != 58) {
            aJString_1481 = null;
        }

        aJString_1473 = null;
        aJString_1494 = null;
        aJString_1492 = null;
        aJString_1481 = null;
        aJString_1497 = null;
        aClass18_1489 = null;
    }

    public static void method1298(JString jstring, boolean bool, int i) {
        anInt1485++;

        int i_27_ = 4;

        if (i == 1) {
            int i_28_ = i_27_ + 6;
            int i_29_ = Class17.aClass37_Sub4_Sub9_Sub2_Sub1_315.method628(jstring,
                    250);
            int i_30_ = i_27_ + 6;
            int i_31_ = 13 * Class17.aClass37_Sub4_Sub9_Sub2_Sub1_315.method612(jstring,
                    250);
            Class37_Sub4_Sub9.method578(i_28_ - i_27_, i_30_ + -i_27_,
                i_29_ - -i_27_ - -i_27_, i_27_ + (i_31_ - -i_27_), 0);
            Class37_Sub4_Sub9.method595(i_28_ - i_27_, i_30_ + -i_27_,
                i_27_ + (i_27_ + i_29_), i_27_ + (i_31_ - -i_27_), 16777215);
            Class17.aClass37_Sub4_Sub9_Sub2_Sub1_315.method619(jstring, i_28_,
                i_30_, i_29_, i_31_, 16777215, -1, 1, 1, 0);
            Class37_Sub7.method740((i_27_ + i_29_) - -i_27_, -i_27_ + i_28_,
                -i_27_ + i_30_, i_27_ + (i_31_ - -i_27_), 16711680);

            if (!bool) {
                Class33.method300((byte) -111, i_31_, i_29_, i_28_, i_30_);
            } else {
                try {
                    Graphics graphics = Class37_Sub9.aCanvas1967.getGraphics();
                    Class21.aClass32_568.method290(0, graphics, 0, false);
                } catch (Exception exception) {
                    Class37_Sub9.aCanvas1967.repaint();
                }
            }
        }
    }
}
