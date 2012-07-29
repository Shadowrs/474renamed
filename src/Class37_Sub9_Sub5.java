/* Class37_Sub9_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub9_Sub5 extends Class37_Sub9 {
    public static int anInt2985;
    public static int anInt2987;
    public static int anInt2989;
    public static int anInt2990;
    public static int anInt2992;
    public static int anInt2993;
    public static Class58 aClass58_2994;
    public static JString aJString_2995 = Class37_Sub2.method332((byte) 119,
            "skill)2");
    public static JString aJString_2996 = aJString_2995;
    public static JString aJString_2997;
    public static int anInt2998;
    public static JString aJString_2999;
    public static JString aJString_3000;
    public static JString aJString_3001;
    public static JString aJString_3002;
    public static JString aJString_3003;
    public static JString aJString_3004;
    public static JString aJString_3005;

    static {
        aClass58_2994 = new Class58();

        aJString_3000 = (Class37_Sub2.method332((byte) 122,
                "You need a members account to login to this world)3"));
        anInt2998 = -1;

        aJString_3001 = (Class37_Sub2.method332((byte) 123,
                "Verbindung konnte nicht hergestellt werden)3"));

        aJString_3003 = Class37_Sub2.method332((byte) 117, "Unable to connect)3");
        aJString_3002 = aJString_3003;
        aJString_2997 = aJString_3000;
        aJString_2999 = aJString_3003;
        aJString_3004 = Class37_Sub2.method332((byte) 114, "Ok");
        aJString_3005 = aJString_3004;
    }

    public int anInt2986 = 1024;
    public int anInt2988;
    public int anInt2991 = 2048;

    public Class37_Sub9_Sub5() {
        super(1, false);
        anInt2988 = 3072;
    }

    public void method752(int i) {
        if (i == -2) {
            anInt2989++;
            anInt2991 = -anInt2986 + anInt2988;
        }
    }

    public int[][] method759(byte i, int i_0_) {
        if (i <= 111) {
            aJString_3004 = null;
        }

        anInt2985++;

        int[][] is = aClass33_1946.method298(false, i_0_);

        if (aClass33_1946.aBoolean767) {
            int[][] is_1_ = this.method762(0, i_0_, (byte) -79);
            int[] is_2_ = is_1_[0];
            int[] is_3_ = is_1_[1];
            int[] is_4_ = is_1_[2];
            int[] is_5_ = is[1];
            int[] is_6_ = is[2];
            int[] is_7_ = is[0];

            for (int i_8_ = 0; i_8_ < Class32.anInt743; i_8_++) {
                is_7_[i_8_] = ((is_2_[i_8_] * anInt2991) >> -1197808500) +
                    anInt2986;

                is_5_[i_8_] = ((anInt2991 * is_3_[i_8_]) >> 583699180) +
                    anInt2986;

                is_6_[i_8_] = anInt2986 +
                    ((is_4_[i_8_] * anInt2991) >> 106425772);
            }
        }

        return is;
    }

    public void method750(Stream stream, int i, boolean bool) {
        anInt2987++;

        int i_9_ = i;
while_18_: 
        do {
            do {
                if (i_9_ != 0) {
                    if ((i_9_ ^ 0xffffffff) != -2) {
                        if (i_9_ == 2) {
                            break;
                        }

                        break while_18_;
                    }
                } else {
                    anInt2986 = stream.readShort();

                    break while_18_;
                }

                anInt2988 = stream.readShort();

                break while_18_;
            } while (false);

            aBoolean1943 = stream.readByte(116) == 1;
        } while (false);

        if (bool != true) {
            anInt2998 = 70;
        }
    }

    public int[] method761(int i, int i_10_) {
        anInt2992++;

        if (i > -125) {
            aJString_3001 = null;
        }

        int[] is = aClass38_1966.method1049(i_10_, true);

        if (aClass38_1966.aBoolean850) {
            int[] is_11_ = this.method760(i_10_, 0, -81);

            for (int i_12_ = 0;
                    (i_12_ ^ 0xffffffff) > (Class32.anInt743 ^ 0xffffffff);
                    i_12_++)
                is[i_12_] = anInt2986 -
                    -((anInt2991 * is_11_[i_12_]) >> 1292537740);
        }

        return is;
    }

    public static void method779(byte i) {
        int i_13_ = -45 % ((-28 - i) / 61);
        Class37_Sub3_Sub3.aClass65_2339.method1186(3056);
        anInt2993++;
        Class37_Sub9_Sub32.aClass65_3503.method1186(3056);
    }

    public static void method780(int i) {
        aJString_2997 = null;
        aJString_2999 = null;
        aJString_3000 = null;
        aClass58_2994 = null;
        aJString_3001 = null;

        if (i >= -57) {
            method779((byte) 31);
        }

        aJString_3002 = null;
        aJString_2995 = null;
        aJString_3005 = null;
        aJString_3004 = null;
        aJString_3003 = null;
        aJString_2996 = null;
    }
}
