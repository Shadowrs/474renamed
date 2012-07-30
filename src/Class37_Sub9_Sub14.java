/* Class37_Sub9_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub9_Sub14 extends Class37_Sub9 {
    public static JString aJString_3143;
    public static JString aJString_3144;
    public static JS5 aClass15_3145;
    public static int anInt3146;
    public static int anInt3147;
    public static JString aJString_3148 = (Class37_Sub2.method332((byte) 116,
            "Benutzen Sie die (WPasswort -=ndern(W Option"));
    public static JString aJString_3149 = Class37_Sub2.method332((byte) 105,
            "sch-Utteln:");
    public static JString aJString_3150;
    public static JString[] aJStringArray3151;
    public static int anInt3152;
    public static int anInt3153;
    public static int anInt3155;
    public static JString aJString_3156;

    static {
        aJString_3144 = Class37_Sub2.method332((byte) 127,
                "Musik)2Engine vorbereitet)3");
        aJStringArray3151 = new JString[500];

        aJString_3150 = Class37_Sub2.method332((byte) 119,
                "To create a new account you need to");
        aJString_3143 = aJString_3150;
        aJString_3156 = Class37_Sub2.method332((byte) 127, "l");
    }

    public int anInt3154 = 4096;

    public Class37_Sub9_Sub14() {
        this(4096);
    }

    public Class37_Sub9_Sub14(int i) {
        super(0, true);
        anInt3154 = i;
    }

    public static void method818(boolean bool) {
        anInt3147++;

        synchronized (Class65.aClass9_1221) {
            Class60.anInt1140 = Class71.anInt1356;
            Class37_Sub4_Sub7_Sub7.anInt3851 = Class37_Sub9_Sub17.anInt3215;
            Class37_Sub9_Sub1.anInt2914 = Class37_Sub9_Sub23.anInt3359;
            Class37_Sub9_Sub28.anInt3440 = Class37_Sub9_Sub29.anInt3452;

            if (bool != false) {
                /* empty */
            } else {
                Class33.anInt764 = PacketParser.anInt3258;
                Class37_Sub13.anInt2113 = Class1.anInt67;
                Class89.aLong1619 = Class87.aLong1588;
                Class37_Sub9_Sub29.anInt3452 = 0;
            }
        }
    }

    public static void method819(int i) {
        aJString_3144 = null;
        aJString_3149 = null;
        aJStringArray3151 = null;
        aJString_3143 = null;
        aJString_3156 = null;

        if (i == 4096) {
            aJString_3150 = null;
            aClass15_3145 = null;
            aJString_3148 = null;
        }
    }

    public static Class18 method820(int i, int i_0_) {
        int i_1_ = i >> 2112930704;
        int i_2_ = 0xffff & i;
        anInt3152++;

        if (i_0_ != 4096) {
            method821(-118);
        }

        if ((Class37_Sub9_Sub29.aClass18ArrayArray3454[i_1_] == null) ||
                (Class37_Sub9_Sub29.aClass18ArrayArray3454[i_1_][i_2_] == null)) {
            boolean bool = Class37_Sub10.method927(i_1_, 27323);

            if (!bool) {
                return null;
            }
        }

        return Class37_Sub9_Sub29.aClass18ArrayArray3454[i_1_][i_2_];
    }

    public int[] method761(int i, int i_3_) {
        if (i > -125) {
            method819(-73);
        }

        int[] is = aClass38_1966.method1049(i_3_, true);

        if (aClass38_1966.aBoolean850) {
            ArrayOperations.setArray(is, 0, AbstractDrawingArea.anInt743, anInt3154);
        }

        anInt3146++;

        return is;
    }

    public void method750(Stream stream, int i, boolean bool) {
        anInt3155++;

        if (bool != true) {
            method818(false);
        }

        int i_4_ = i;

        if (i_4_ == 0) {
            anInt3154 = (stream.readByte(123) << 904088684) / 255;
        }
    }

    public static int method821(int i) {
        if (i != 255) {
            method820(-70, -123);
        }

        anInt3153++;

        return PacketParser.anInt3274++;
    }
}
