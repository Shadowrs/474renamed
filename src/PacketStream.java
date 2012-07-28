/* Stream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class PacketStream extends Stream {
    public static Class15_Sub1 aClass15_Sub1_3609;
    public static int anInt3610;
    public static int[] anIntArray3611 = new int[100];
    public static int anInt3612;
    public static Class19 aClass19_3613;
    public static JString aJString_3614;
    public static int anInt3615;
    public static int anInt3616;
    public static int anInt3617;
    public static JString aJString_3618;
    public static int anInt3619;
    public static JString aJString_3620;
    public static int anInt3621;
    public static int anInt3622;
    public static int anInt3623;
    public static int anInt3624;
    public static int anInt3625;
    public static JString aJString_3627;
    public static int anInt3629;

    static {
        anInt3610 = 1;
        anInt3625 = 0;

        aJString_3614 = Class37_Sub2.method332((byte) 112,
                "Unexpected loginserver response)3");
        aJString_3618 = aJString_3614;
        aJString_3620 = Class37_Sub2.method332((byte) 115, "Einloggen");
        aJString_3627 = Class37_Sub2.method332((byte) 113, "<col=ffff00>");
    }

    public int anInt3626;
    public Class4 aClass4_3628;

    public PacketStream(int i) {
        super(i);
    }

    public int method986(int i) {
        if (i != 7) {
            aJString_3620 = null;
        }

        anInt3612++;
        return ((buffer[currentIndex++] - aClass4_3628.method50(true)) & 0xff);
    }

    public static void method987(int i, int i_0_, int i_1_, int i_2_) {
        anInt3629++;

        Class18 class18 = Class37_Sub9_Sub35.method914(i_0_, (byte) -34, i);

        if ((class18 != null) && (class18.anObjectArray386 != null)) {
            Class37_Sub8 class37_sub8 = new Class37_Sub8();
            class37_sub8.aClass18_1925 = class18;
            class37_sub8.anObjectArray1938 = class18.anObjectArray386;
            Class43.method1092(class37_sub8, (byte) 124);
        }

        Class37_Sub4_Sub12.anInt2759 = i_1_;
        Class21.anInt558 = i;
        Class37_Sub4_Sub5.aBoolean2595 = true;
        Class32.anInt737 = i_0_;
        Class73.method1274(class18, -1);

        if (i_2_ != 18193) {
            aJString_3627 = null;
        }
    }

    public void method988(boolean bool) {
        anInt3619++;
        currentIndex = (7 + anInt3626) / 8;

        if (bool != true) {
            aClass19_3613 = null;
        }
    }

    public void method989(int i, int i_3_) {
        if (i != -1494101117) {
            method990(false, null);
        }

        buffer[currentIndex++] = (byte) (i_3_ +
            aClass4_3628.method50(true));
        anInt3621++;
    }

    public void method990(boolean bool, int[] is) {
        anInt3622++;

        if (bool == false) {
            aClass4_3628 = new Class4(is);
        }
    }

    public int method991(int i, int i_4_) {
        anInt3616++;

        if (i_4_ != -1337) {
            return 75;
        }

        return (8 * i) - anInt3626;
    }

    public static void method992(int i, Class37_Sub6 class37_sub6, boolean bool) {
        anInt3624++;

        if (i != -1494101117) {
            aJString_3627 = null;
        }

        int i_5_ = class37_sub6.anInt1884;
        int i_6_ = (int) class37_sub6.aLong818;
        class37_sub6.method322(false);

        if (bool) {
            Class37_Sub9_Sub24.method871(i_5_, false);
        }

        Class57.method1146(i_5_, 82);

        Class18 class18 = Class37_Sub9_Sub14.method820(i_6_, i + 1494105213);

        if (class18 != null) {
            Class73.method1274(class18, i + 1494101116);
        }

        Class37_Sub20.aBoolean2220 = false;
        Class37_Sub9_Sub13.anInt3134 = 0;
        Class37_Sub7.method740(Class37_Sub9_Sub24.anInt3377,
            Class37_Sub4_Sub13.anInt2794, Class15_Sub1.anInt1753,
            Class37_Sub5.anInt1878, i ^ ~0x59f12c7c);

        if (Class32.anInt733 != -1) {
            Class26.method259(Class32.anInt733, 1, -127);
        }
    }

    public void method993(boolean bool) {
        anInt3626 = 8 * currentIndex;
        anInt3615++;

        if (bool != false) {
            method990(true, null);
        }
    }

    public static JString method994(int i, int i_7_) {
        if (i_7_ != 3) {
            method992(116, null, false);
        }

        anInt3623++;

        JString jstring = Class37_Sub9_Sub24.method870(i, (byte) -114);

        for (int i_8_ = jstring.method172((byte) 38) + -3; i_8_ > 0;
                i_8_ -= 3)
            jstring = (Class37_Sub9_Sub27.method881(-29,
                    new JString[] {
                        jstring.method169(0, 0, i_8_),
                        Class37_Sub4_Sub6.aJString_2621,
                        jstring.method158(i_8_, -1)
                    }));

        if (jstring.method172((byte) 38) > 9) {
            return (Class37_Sub9_Sub27.method881(119,
                (new JString[] {
                    Class75.aJString_1410,
                    jstring.method169(0, 0, jstring.method172((byte) 38) + -8),
                    Class65.aJString_1228, Class37_Sub9_Sub24.aJString_3370,
                    jstring, Class2.aJString_80
                })));
        }

        if ((jstring.method172((byte) 38) ^ 0xffffffff) < -7) {
            return (Class37_Sub9_Sub27.method881(115,
                (new JString[] {
                    Class37_Sub23.aJString_2235,
                    jstring.method169(0, 0, jstring.method172((byte) 38) + -4),
                    Class27.aJString_667, Class37_Sub9_Sub24.aJString_3370,
                    jstring, Class2.aJString_80
                })));
        }

        return Class37_Sub9_Sub27.method881(-63,
            (new JString[] {
                Class19.aJString_471, jstring,
                (Class37_Sub9_Sub22.aJString_3332)
            }));
    }

    public static void method995(int i) {
        aClass15_Sub1_3609 = null;

        if (i > -126) {
            aClass19_3613 = null;
        }

        aJString_3620 = null;
        aJString_3614 = null;
        anIntArray3611 = null;
        aClass19_3613 = null;
        aJString_3618 = null;
        aJString_3627 = null;
    }

    public int method996(int i, int i_9_) {
        anInt3617++;

        if (i_9_ < 10) {
            aJString_3614 = null;
        }

        int i_10_ = anInt3626 >> -1494101117;//kiek 8 baitu bloku yra (realiai offsetas)
        int i_11_ = 0;
        int i_12_ = -(anInt3626 & 0x7) + 8;//kiek liko neperskaitytu bloko baitu
        anInt3626 += i;

        for (; (i ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_ = 8) {
            i_11_ += ((buffer[i_10_++] & Class47.anIntArray994[i_12_]) << (i +
            -i_12_));
            i -= i_12_;
        }

        if (i_12_ != i) {
            i_11_ += ((buffer[i_10_] >> (i_12_ - i)) &
            Class47.anIntArray994[i]);
        } else {
            i_11_ += (buffer[i_10_] & Class47.anIntArray994[i_12_]);
        }
        return i_11_;
    }
}
