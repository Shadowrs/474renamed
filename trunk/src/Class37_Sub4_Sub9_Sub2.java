/* Class37_Sub4_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.util.Random;


public abstract class Class37_Sub4_Sub9_Sub2 extends Class37_Sub4_Sub9 {
    public static int anInt3866;
    public static JString aJString_3867;
    public static JString aJString_3868 = Class37_Sub2.method332((byte) 116,
            ")4u");
    public static JString aJString_3870 = Class37_Sub2.method332((byte) 121,
            "u=");
    public static JString aJString_3872;
    public static JString aJString_3873;
    public static int anInt3874;
    public static Class37_Sub4_Sub9_Sub1[] aClass37_Sub4_Sub9_Sub1Array3875;
    public static int anInt3876;
    public static JString aJString_3877;
    public static JString aJString_3879;
    public static JString aJString_3880;
    public static int anInt3881;
    public static int anInt3882;
    public static int anInt3883;
    public static int anInt3884;
    public static JString aJString_3885;
    public static int anInt3887;
    public static JString aJString_3890;
    public static JString[] aJStringArray3892;
    public static JString aJString_3893;
    public static int anInt3894;
    public static JString aJString_3896;
    public static JString aJString_3897;
    public static JString aJString_3898;
    public static JString aJString_3900;
    public static int anInt3902;

    static {
        anInt3866 = 256;
        anInt3882 = 256;
        aJString_3885 = Class37_Sub2.method332((byte) 106, ")4str");
        anInt3887 = 0;
        anInt3884 = -1;
        aJString_3867 = Class37_Sub2.method332((byte) 109, ")4shad");
        aJString_3890 = Class37_Sub2.method332((byte) 111, ")4col");
        anInt3881 = -1;
        aJString_3872 = Class37_Sub2.method332((byte) 120, "br");
        aJString_3893 = Class37_Sub2.method332((byte) 127, "lt");
        aJString_3896 = Class37_Sub2.method332((byte) 125, "str=");
        anInt3894 = 0;
        aJString_3879 = Class37_Sub2.method332((byte) 114, "img=");
        aJString_3873 = Class37_Sub2.method332((byte) 121, "gt");
        aJString_3898 = Class37_Sub2.method332((byte) 115, "shad=");
        aJString_3880 = Class37_Sub2.method332((byte) 102, "col=");
        anInt3876 = -1;
        anInt3874 = 0;
        anInt3883 = 0;
        aJString_3897 = Class37_Sub2.method332((byte) 115, "shad");
        anInt3902 = -1;
        aJString_3877 = Class37_Sub2.method332((byte) 125, "u");
        aJString_3900 = Class37_Sub2.method332((byte) 125, "str");
        aJStringArray3892 = new JString[100];
    }

    public int[] anIntArray3869;
    public int[] anIntArray3871;
    public byte[][] aByteArrayArray3878;
    public int anInt3886;
    public int[] anIntArray3888;
    public int anInt3889;
    public int anInt3891;
    public int[] anIntArray3895;
    public int[] anIntArray3899;
    public byte[] aByteArray3901;

    public Class37_Sub4_Sub9_Sub2(byte[] is, int[] is_202_, int[] is_203_,
        int[] is_204_, int[] is_205_, int[] is_206_, byte[][] is_207_) {
        aByteArrayArray3878 = new byte[256][];
        anInt3889 = 0;
        anIntArray3895 = is_202_;
        anIntArray3888 = is_203_;
        anIntArray3869 = is_204_;
        anIntArray3899 = is_205_;
        method600(is);
        aByteArrayArray3878 = is_207_;

        int i = 2147483647;
        int i_208_ = -2147483648;

        for (int i_209_ = 0; i_209_ < 256; i_209_++) {
            if ((anIntArray3888[i_209_] < i) && (anIntArray3899[i_209_] != 0)) {
                i = anIntArray3888[i_209_];
            }

            if ((anIntArray3888[i_209_] + anIntArray3899[i_209_]) > i_208_) {
                i_208_ = anIntArray3888[i_209_] + anIntArray3899[i_209_];
            }
        }

        anInt3886 = anInt3889 - i;
        anInt3891 = i_208_ - anInt3889;
    }

    public Class37_Sub4_Sub9_Sub2(byte[] is) {
        aByteArrayArray3878 = new byte[256][];
        anInt3889 = 0;
        method600(is);
    }

    public int method599(JString jstring, int[] is, JString[] jstrings) {
        if (jstring == null) {
            return 0;
        }

        int i = 0;
        int i_0_ = 0;
        JString jstring_1_ = Class37_Sub4_Sub7.method491(100, 0);
        int i_2_ = -1;
        int i_3_ = 0;
        int i_4_ = 0;
        int i_5_ = -1;
        int i_6_ = -1;
        int i_7_ = 0;
        int i_8_ = jstring.length((byte) 38);

        for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
            int i_10_ = jstring.charAt(i_9_);

            if (i_10_ == 60) {
                i_5_ = i_9_;
            } else {
                if ((i_10_ == 62) && (i_5_ != -1)) {
                    JString jstring_11_ = jstring.substring(0, i_5_ + 1, i_9_);
                    i_5_ = -1;
                    jstring_1_.appendChar(0, 60);
                    jstring_1_.append(jstring_11_, -20035);
                    jstring_1_.appendChar(0, 62);

                    if (jstring_11_.equals(-127, aJString_3872)) {
                        jstrings[i_7_++] = jstring_1_.substring(0, i_0_,
                                jstring_1_.length((byte) 38));
                        i_0_ = jstring_1_.length((byte) 38);
                        i = 0;
                        i_2_ = -1;
                        i_6_ = -1;
                    } else if (jstring_11_.equals(-107, aJString_3893)) {
                        i += method615(60);

                        if ((aByteArray3901 != null) && (i_6_ != -1)) {
                            i += aByteArray3901[(i_6_ << 8) + 60];
                        }

                        i_6_ = 60;
                    } else if (jstring_11_.equals(-106, aJString_3873)) {
                        i += method615(62);

                        if ((aByteArray3901 != null) && (i_6_ != -1)) {
                            i += aByteArray3901[(i_6_ << 8) + 62];
                        }

                        i_6_ = 62;
                    } else if (jstring_11_.startsWith(aJString_3879, 52)) {
                        try {
                            int i_12_ = jstring_11_.substring(4)
                                                   .method175(8109);
                            i += (aClass37_Sub4_Sub9_Sub1Array3875[i_12_].anInt3864);
                            i_6_ = -1;
                        } catch (Exception exception) {
                            /* empty */
                        }
                    }

                    i_10_ = -1;
                }

                if (i_5_ == -1) {
                    if (i_10_ != -1) {
                        jstring_1_.appendChar(0, i_10_);
                        i += method615(i_10_);

                        if ((aByteArray3901 != null) && (i_6_ != -1)) {
                            i += aByteArray3901[(i_6_ << 8) + i_10_];
                        }

                        i_6_ = i_10_;
                    }

                    if (i_10_ == 32) {
                        i_2_ = jstring_1_.length((byte) 38);
                        i_3_ = i;
                        i_4_ = 1;
                    }

                    if ((is != null) &&
                            (i > is[(i_7_ < is.length) ? i_7_ : (is.length - 1)]) &&
                            (i_2_ >= 0)) {
                        jstrings[i_7_++] = jstring_1_.substring(0, i_0_,
                                i_2_ - i_4_);
                        i_0_ = i_2_;
                        i_2_ = -1;
                        i -= i_3_;
                        i_6_ = -1;
                    }

                    if (i_10_ == 45) {
                        i_2_ = jstring_1_.length((byte) 38);
                        i_3_ = i;
                        i_4_ = 0;
                    }
                }
            }
        }

        if (jstring_1_.length((byte) 38) > i_0_) {
            jstrings[i_7_++] = jstring_1_.substring(0, i_0_,
                    jstring_1_.length((byte) 38));
        }

        return i_7_;
    }

    public void method600(byte[] is) {
        anIntArray3871 = new int[256];

        if (is.length == 257) {
            for (int i = 0; i < anIntArray3871.length; i++)
                anIntArray3871[i] = is[i] & 0xff;

            anInt3889 = is[256] & 0xff;
        } else {
            int i = 0;

            for (int i_13_ = 0; i_13_ < 256; i_13_++)
                anIntArray3871[i_13_] = is[i++] & 0xff;

            int[] is_14_ = new int[256];
            int[] is_15_ = new int[256];

            for (int i_16_ = 0; i_16_ < 256; i_16_++)
                is_14_[i_16_] = is[i++] & 0xff;

            for (int i_17_ = 0; i_17_ < 256; i_17_++)
                is_15_[i_17_] = is[i++] & 0xff;

            byte[][] is_18_ = new byte[256][];

            for (int i_19_ = 0; i_19_ < 256; i_19_++) {
                is_18_[i_19_] = new byte[is_14_[i_19_]];

                byte i_20_ = 0;

                for (int i_21_ = 0; i_21_ < is_18_[i_19_].length; i_21_++) {
                    i_20_ += is[i++];
                    is_18_[i_19_][i_21_] = i_20_;
                }
            }

            byte[][] is_22_ = new byte[256][];

            for (int i_23_ = 0; i_23_ < 256; i_23_++) {
                is_22_[i_23_] = new byte[is_14_[i_23_]];

                byte i_24_ = 0;

                for (int i_25_ = 0; i_25_ < is_22_[i_23_].length; i_25_++) {
                    i_24_ += is[i++];
                    is_22_[i_23_][i_25_] = i_24_;
                }
            }

            aByteArray3901 = new byte[65536];

            for (int i_26_ = 0; i_26_ < 256; i_26_++) {
                if ((i_26_ != 32) && (i_26_ != 160)) {
                    for (int i_27_ = 0; i_27_ < 256; i_27_++) {
                        if ((i_27_ != 32) && (i_27_ != 160)) {
                            aByteArray3901[(i_26_ << 8) + i_27_] = (byte) method625(is_18_,
                                    is_22_, is_15_, anIntArray3871, is_14_,
                                    i_26_, i_27_);
                        }
                    }
                }
            }

            anInt3889 = is_15_[32] + is_14_[32];
        }
    }

    public void method601(JString jstring, int i, int i_28_, int i_29_,
        int i_30_, int i_31_, int i_32_) {
        if (jstring != null) {
            method602(i_29_, i_30_);

            double d = 7.0 - ((double) i_32_ / 8.0);

            if (d < 0.0) {
                d = 0.0;
            }

            int[] is = new int[jstring.length];

            for (int i_33_ = 0; i_33_ < jstring.length; i_33_++)
                is[i_33_] = (int) (Math.sin(((double) i_33_ / 1.5) +
                        (double) i_31_) * d);

            method618(jstring, i - (method617(jstring) / 2), i_28_, null, is);
        }
    }

    public void method602(int i, int i_34_) {
        anInt3876 = -1;
        anInt3902 = -1;
        anInt3881 = anInt3884 = i_34_;
        anInt3883 = anInt3874 = i;
        anInt3882 = anInt3866 = 256;
        anInt3887 = 0;
        anInt3894 = 0;
    }

    public void method603(JString jstring, int i, int i_35_, int i_36_,
        int i_37_) {
        if (jstring != null) {
            method602(i_36_, i_37_);
            method611(jstring, i - method617(jstring), i_35_);
        }
    }

    public void method604(JString jstring, int i, int i_38_, int i_39_,
        int i_40_, int i_41_) {
        if (jstring != null) {
            method602(i_39_, i_40_);

            int[] is = new int[jstring.length];

            for (int i_42_ = 0; i_42_ < jstring.length; i_42_++)
                is[i_42_] = (int) (Math.sin(((double) i_42_ / 2.0) +
                        ((double) i_41_ / 5.0)) * 5.0);

            method618(jstring, i - (method617(jstring) / 2), i_38_, null, is);
        }
    }

    public static JString method605(JString jstring) {
        int i = jstring.length((byte) 38);
        int i_43_ = 0;

        for (int i_44_ = 0; i_44_ < i; i_44_++) {
            byte i_45_ = jstring.charArray[i_44_];

            if ((i_45_ == 60) || (i_45_ == 62)) {
                i_43_ += 3;
            }
        }

        JString jstring_46_ = new JString();
        jstring_46_.length = i + i_43_;
        jstring_46_.charArray = new byte[jstring_46_.length];

        int i_47_ = 0;

        for (int i_48_ = 0; i_48_ < i; i_48_++) {
            byte i_49_ = jstring.charArray[i_48_];

            if (i_49_ == 60) {
                jstring_46_.charArray[i_47_++] = (byte) 60;
                jstring_46_.charArray[i_47_++] = (byte) 108;
                jstring_46_.charArray[i_47_++] = (byte) 116;
                jstring_46_.charArray[i_47_++] = (byte) 62;
            } else if (i_49_ == 62) {
                jstring_46_.charArray[i_47_++] = (byte) 60;
                jstring_46_.charArray[i_47_++] = (byte) 103;
                jstring_46_.charArray[i_47_++] = (byte) 116;
                jstring_46_.charArray[i_47_++] = (byte) 62;
            } else {
                jstring_46_.charArray[i_47_++] = i_49_;
            }
        }

        return jstring_46_;
    }

    public void method606(JString jstring, int i, int i_50_, int i_51_,
        int i_52_) {
        if (jstring != null) {
            method602(i_51_, i_52_);
            method611(jstring, i - (method617(jstring) / 2), i_50_);
        }
    }

    public void method607(JString jstring, int i, int i_53_, int i_54_,
        int i_55_) {
        if (jstring != null) {
            method602(i_54_, i_55_);
            method611(jstring, i, i_53_);
        }
    }

    public void method608(JString jstring, int i) {
        int i_56_ = 0;
        boolean bool = false;

        for (int i_57_ = 0; i_57_ < jstring.length((byte) 38); i_57_++) {
            int i_58_ = jstring.charAt(i_57_);

            if (i_58_ == 60) {
                bool = true;
            } else if (i_58_ == 62) {
                bool = false;
            } else if (!bool && (i_58_ == 32)) {
                i_56_++;
            }
        }

        if (i_56_ > 0) {
            anInt3887 = ((i - method617(jstring)) << 8) / i_56_;
        }
    }

    public void method609(JString jstring, int i, int i_59_, int i_60_,
        int i_61_, int i_62_) {
        if (jstring != null) {
            method602(i_60_, i_61_);

            int[] is = new int[jstring.length];
            int[] is_63_ = new int[jstring.length];

            for (int i_64_ = 0; i_64_ < jstring.length; i_64_++) {
                is[i_64_] = (int) (Math.sin(((double) i_64_ / 5.0) +
                        ((double) i_62_ / 5.0)) * 5.0);
                is_63_[i_64_] = (int) (Math.sin(((double) i_64_ / 3.0) +
                        ((double) i_62_ / 5.0)) * 5.0);
            }

            method618(jstring, i - (method617(jstring) / 2), i_59_, is, is_63_);
        }
    }

    public int method610(JString jstring, int i, int i_65_, int i_66_,
        int i_67_, Random random, int i_68_) {
        if (jstring == null) {
            return 0;
        }

        random.setSeed((long) i_68_);
        method624(i_66_, i_67_, 192 + (random.nextInt() & 0x1f));

        int[] is = new int[jstring.length];
        int i_69_ = 0;

        for (int i_70_ = 0; i_70_ < jstring.length; i_70_++) {
            is[i_70_] = i_69_;

            if ((random.nextInt() & 0x3) == 0) {
                i_69_++;
            }
        }

        method618(jstring, i, i_65_, is, null);

        return i_69_;
    }

    public void method611(JString jstring, int i, int i_71_) {
        i_71_ -= anInt3889;

        int i_72_ = -1;
        int i_73_ = -1;

        for (int i_74_ = 0; i_74_ < jstring.length; i_74_++) {
            int i_75_ = jstring.charArray[i_74_] & 0xff;

            if (i_75_ == 60) {
                i_72_ = i_74_;
            } else {
                if ((i_75_ == 62) && (i_72_ != -1)) {
                    JString jstring_76_ = jstring.substring(0, i_72_ + 1, i_74_);
                    i_72_ = -1;

                    if (jstring_76_.equals(-98, aJString_3893)) {
                        i_75_ = 60;
                    } else if (jstring_76_.equals(-89, aJString_3873)) {
                        i_75_ = 62;
                    } else {
                        if (jstring_76_.startsWith(aJString_3879, 52)) {
                            try {
                                int i_77_ = jstring_76_.substring(4)
                                                       .method175(8109);
                                Class37_Sub4_Sub9_Sub1 class37_sub4_sub9_sub1 = aClass37_Sub4_Sub9_Sub1Array3875[i_77_];
                                class37_sub4_sub9_sub1.method597(i,
                                    ((i_71_ + anInt3889) -
                                    class37_sub4_sub9_sub1.anInt3858));
                                i += class37_sub4_sub9_sub1.anInt3864;
                                i_73_ = -1;
                            } catch (Exception exception) {
                                /* empty */
                            }
                        } else {
                            method627(jstring_76_);
                        }

                        continue;
                    }
                }

                if (i_72_ == -1) {
                    if ((aByteArray3901 != null) && (i_73_ != -1)) {
                        i += aByteArray3901[(i_73_ << 8) + i_75_];
                    }

                    int i_78_ = anIntArray3869[i_75_];
                    int i_79_ = anIntArray3899[i_75_];

                    if (i_75_ != 32) {
                        if (anInt3882 == 256) {
                            if (anInt3881 != -1) {
                                method614(i_75_, i + anIntArray3895[i_75_] + 1,
                                    i_71_ + anIntArray3888[i_75_] + 1, i_78_,
                                    i_79_, anInt3881);
                            }

                            method616(i_75_, i + anIntArray3895[i_75_],
                                i_71_ + anIntArray3888[i_75_], i_78_, i_79_,
                                anInt3883);
                        } else {
                            if (anInt3881 != -1) {
                                method626(i_75_, i + anIntArray3895[i_75_] + 1,
                                    i_71_ + anIntArray3888[i_75_] + 1, i_78_,
                                    i_79_, anInt3881, anInt3882);
                            }

                            method621(i_75_, i + anIntArray3895[i_75_],
                                i_71_ + anIntArray3888[i_75_], i_78_, i_79_,
                                anInt3883, anInt3882);
                        }
                    } else if (anInt3887 > 0) {
                        anInt3894 += anInt3887;
                        i += (anInt3894 >> 8);
                        anInt3894 &= 0xff;
                    }

                    int i_80_ = anIntArray3871[i_75_];

                    if (anInt3876 != -1) {
                        Class37_Sub4_Sub9.method580(i,
                            i_71_ + (int) ((double) anInt3889 * 0.7), i_80_,
                            anInt3876);
                    }

                    if (anInt3902 != -1) {
                        Class37_Sub4_Sub9.method580(i, i_71_ + anInt3889 + 1,
                            i_80_, anInt3902);
                    }

                    i += i_80_;
                    i_73_ = i_75_;
                }
            }
        }
    }

    public int method612(JString jstring, int i) {
        return method599(jstring, new int[] { i }, aJStringArray3892);
    }

    public static void method613() {
        aJString_3893 = null;
        aJString_3873 = null;
        aJString_3879 = null;
        aJString_3872 = null;
        aJString_3880 = null;
        aJString_3890 = null;
        aJString_3870 = null;
        aJString_3877 = null;
        aJString_3868 = null;
        aJString_3898 = null;
        aJString_3897 = null;
        aJString_3867 = null;
        aJString_3896 = null;
        aJString_3900 = null;
        aJString_3885 = null;
        aClass37_Sub4_Sub9_Sub1Array3875 = null;
        aJStringArray3892 = null;
    }

    public void method614(int i, int i_81_, int i_82_, int i_83_, int i_84_,
        int i_85_) {
        int i_86_ = i_81_ + (i_82_ * Class37_Sub4_Sub9.anInt2662);
        int i_87_ = Class37_Sub4_Sub9.anInt2662 - i_83_;
        int i_88_ = 0;
        int i_89_ = 0;

        if (i_82_ < Class37_Sub4_Sub9.anInt2663) {
            int i_90_ = Class37_Sub4_Sub9.anInt2663 - i_82_;
            i_84_ -= i_90_;
            i_82_ = Class37_Sub4_Sub9.anInt2663;
            i_89_ += (i_90_ * i_83_);
            i_86_ += (i_90_ * Class37_Sub4_Sub9.anInt2662);
        }

        if ((i_82_ + i_84_) > Class37_Sub4_Sub9.anInt2664) {
            i_84_ -= ((i_82_ + i_84_) - Class37_Sub4_Sub9.anInt2664);
        }

        if (i_81_ < Class37_Sub4_Sub9.anInt2661) {
            int i_91_ = Class37_Sub4_Sub9.anInt2661 - i_81_;
            i_83_ -= i_91_;
            i_81_ = Class37_Sub4_Sub9.anInt2661;
            i_89_ += i_91_;
            i_86_ += i_91_;
            i_88_ += i_91_;
            i_87_ += i_91_;
        }

        if ((i_81_ + i_83_) > Class37_Sub4_Sub9.anInt2667) {
            int i_92_ = (i_81_ + i_83_) - Class37_Sub4_Sub9.anInt2667;
            i_83_ -= i_92_;
            i_88_ += i_92_;
            i_87_ += i_92_;
        }

        if ((i_83_ > 0) && (i_84_ > 0)) {
            method620(Class37_Sub4_Sub9.anIntArray2666, aByteArrayArray3878[i],
                i_85_, i_89_, i_86_, i_83_, i_84_, i_87_, i_88_);
        }
    }

    public int method615(int i) {
        return anIntArray3871[i & 0xff];
    }

    public abstract void method616(int i, int i_93_, int i_94_, int i_95_,
        int i_96_, int i_97_);

    public int method617(JString jstring) {
        if (jstring == null) {
            return 0;
        }

        int i = -1;
        int i_98_ = -1;
        int i_99_ = 0;

        for (int i_100_ = 0; i_100_ < jstring.length; i_100_++) {
            int i_101_ = jstring.charArray[i_100_] & 0xff;

            if (i_101_ == 60) {
                i = i_100_;
            } else {
                if ((i_101_ == 62) && (i != -1)) {
                    JString jstring_102_ = jstring.substring(0, i + 1, i_100_);
                    i = -1;

                    if (jstring_102_.equals(-77, aJString_3893)) {
                        i_101_ = 60;
                    } else if (jstring_102_.equals(-98, aJString_3873)) {
                        i_101_ = 62;
                    } else {
                        if (jstring_102_.startsWith(aJString_3879, 52)) {
                            try {
                                int i_103_ = jstring_102_.substring(4)
                                                         .method175(8109);
                                i_99_ += (aClass37_Sub4_Sub9_Sub1Array3875[i_103_].anInt3864);
                                i_98_ = -1;
                            } catch (Exception exception) {
                                /* empty */
                            }
                        }

                        continue;
                    }
                }

                if (i == -1) {
                    i_99_ += anIntArray3871[i_101_];

                    if ((aByteArray3901 != null) && (i_98_ != -1)) {
                        i_99_ += aByteArray3901[(i_98_ << 8) + i_101_];
                    }

                    i_98_ = i_101_;
                }
            }
        }

        return i_99_;
    }

    public void method618(JString jstring, int i, int i_104_, int[] is,
        int[] is_105_) {
        i_104_ -= anInt3889;

        int i_106_ = -1;
        int i_107_ = -1;
        int i_108_ = 0;

        for (int i_109_ = 0; i_109_ < jstring.length; i_109_++) {
            int i_110_ = jstring.charArray[i_109_] & 0xff;

            if (i_110_ == 60) {
                i_106_ = i_109_;
            } else {
                if ((i_110_ == 62) && (i_106_ != -1)) {
                    JString jstring_111_ = jstring.substring(0, i_106_ + 1,
                            i_109_);
                    i_106_ = -1;

                    if (jstring_111_.equals(-118, aJString_3893)) {
                        i_110_ = 60;
                    } else if (jstring_111_.equals(-89, aJString_3873)) {
                        i_110_ = 62;
                    } else {
                        if (jstring_111_.startsWith(aJString_3879, 52)) {
                            try {
                                int i_112_;

                                if (is != null) {
                                    i_112_ = is[i_108_];
                                } else {
                                    i_112_ = 0;
                                }

                                int i_113_;

                                if (is_105_ != null) {
                                    i_113_ = is_105_[i_108_];
                                } else {
                                    i_113_ = 0;
                                }

                                i_108_++;

                                int i_114_ = jstring_111_.substring(4)
                                                         .method175(8109);
                                Class37_Sub4_Sub9_Sub1 class37_sub4_sub9_sub1 = aClass37_Sub4_Sub9_Sub1Array3875[i_114_];
                                class37_sub4_sub9_sub1.method597(i + i_112_,
                                    ((i_104_ + anInt3889) -
                                    class37_sub4_sub9_sub1.anInt3858 + i_113_));
                                i += class37_sub4_sub9_sub1.anInt3864;
                                i_107_ = -1;
                            } catch (Exception exception) {
                                /* empty */
                            }
                        } else {
                            method627(jstring_111_);
                        }

                        continue;
                    }
                }

                if (i_106_ == -1) {
                    if ((aByteArray3901 != null) && (i_107_ != -1)) {
                        i += aByteArray3901[(i_107_ << 8) + i_110_];
                    }

                    int i_115_ = anIntArray3869[i_110_];
                    int i_116_ = anIntArray3899[i_110_];
                    int i_117_;

                    if (is != null) {
                        i_117_ = is[i_108_];
                    } else {
                        i_117_ = 0;
                    }

                    int i_118_;

                    if (is_105_ != null) {
                        i_118_ = is_105_[i_108_];
                    } else {
                        i_118_ = 0;
                    }

                    i_108_++;

                    if (i_110_ != 32) {
                        if (anInt3882 == 256) {
                            if (anInt3881 != -1) {
                                method614(i_110_,
                                    (i + anIntArray3895[i_110_] + 1 + i_117_),
                                    (i_104_ + anIntArray3888[i_110_] + 1 +
                                    i_118_), i_115_, i_116_, anInt3881);
                            }

                            method616(i_110_,
                                i + anIntArray3895[i_110_] + i_117_,
                                i_104_ + anIntArray3888[i_110_] + i_118_,
                                i_115_, i_116_, anInt3883);
                        } else {
                            if (anInt3881 != -1) {
                                method626(i_110_,
                                    (i + anIntArray3895[i_110_] + 1 + i_117_),
                                    (i_104_ + anIntArray3888[i_110_] + 1 +
                                    i_118_), i_115_, i_116_, anInt3881,
                                    anInt3882);
                            }

                            method621(i_110_,
                                i + anIntArray3895[i_110_] + i_117_,
                                i_104_ + anIntArray3888[i_110_] + i_118_,
                                i_115_, i_116_, anInt3883, anInt3882);
                        }
                    } else if (anInt3887 > 0) {
                        anInt3894 += anInt3887;
                        i += (anInt3894 >> 8);
                        anInt3894 &= 0xff;
                    }

                    int i_119_ = anIntArray3871[i_110_];

                    if (anInt3876 != -1) {
                        Class37_Sub4_Sub9.method580(i,
                            i_104_ + (int) ((double) anInt3889 * 0.7), i_119_,
                            anInt3876);
                    }

                    if (anInt3902 != -1) {
                        Class37_Sub4_Sub9.method580(i, i_104_ + anInt3889,
                            i_119_, anInt3902);
                    }

                    i += i_119_;
                    i_107_ = i_110_;
                }
            }
        }
    }

    public int method619(JString jstring, int i, int i_120_, int i_121_,
        int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_) {
        return method623(jstring, i, i_120_, i_121_, i_122_, i_123_, i_124_,
            256, i_125_, i_126_, i_127_);
    }

    public static void method620(int[] is, byte[] is_128_, int i, int i_129_,
        int i_130_, int i_131_, int i_132_, int i_133_, int i_134_) {
        int i_135_ = -(i_131_ >> 2);
        i_131_ = -(i_131_ & 0x3);

        for (int i_136_ = -i_132_; i_136_ < 0; i_136_++) {
            for (int i_137_ = i_135_; i_137_ < 0; i_137_++) {
                if (is_128_[i_129_++] != 0) {
                    is[i_130_++] = i;
                } else {
                    i_130_++;
                }

                if (is_128_[i_129_++] != 0) {
                    is[i_130_++] = i;
                } else {
                    i_130_++;
                }

                if (is_128_[i_129_++] != 0) {
                    is[i_130_++] = i;
                } else {
                    i_130_++;
                }

                if (is_128_[i_129_++] != 0) {
                    is[i_130_++] = i;
                } else {
                    i_130_++;
                }
            }

            for (int i_138_ = i_131_; i_138_ < 0; i_138_++) {
                if (is_128_[i_129_++] != 0) {
                    is[i_130_++] = i;
                } else {
                    i_130_++;
                }
            }

            i_130_ += i_133_;
            i_129_ += i_134_;
        }
    }

    public abstract void method621(int i, int i_139_, int i_140_, int i_141_,
        int i_142_, int i_143_, int i_144_);

    public static void method622(int[] is, byte[] is_145_, int i, int i_146_,
        int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_) {
        i = ((((i & 0xff00ff) * i_152_) & ~0xff00ff) +
            (((i & 0xff00) * i_152_) & 0xff0000)) >> 8;
        i_152_ = 256 - i_152_;

        for (int i_153_ = -i_149_; i_153_ < 0; i_153_++) {
            for (int i_154_ = -i_148_; i_154_ < 0; i_154_++) {
                if (is_145_[i_146_++] != 0) {
                    int i_155_ = is[i_147_];
                    is[i_147_++] = (((((i_155_ & 0xff00ff) * i_152_) &
                        ~0xff00ff) + (((i_155_ & 0xff00) * i_152_) & 0xff0000)) >> 8) +
                        i;
                } else {
                    i_147_++;
                }
            }

            i_147_ += i_150_;
            i_146_ += i_151_;
        }
    }

    public int method623(JString jstring, int i, int i_156_, int i_157_,
        int i_158_, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_,
        int i_164_) {
        if (jstring == null) {
            return 0;
        }

        method624(i_159_, i_160_, i_161_);

        if (i_164_ == 0) {
            i_164_ = anInt3889;
        }

        int[] is = { i_157_ };

        if ((i_158_ < (anInt3886 + anInt3891 + i_164_)) &&
                (i_158_ < (i_164_ + i_164_))) {
            is = null;
        }

        int i_165_ = method599(jstring, is, aJStringArray3892);

        if ((i_163_ == 3) && (i_165_ == 1)) {
            i_163_ = 1;
        }

        int i_166_;

        if (i_163_ == 0) {
            i_166_ = i_156_ + anInt3886;
        } else if (i_163_ == 1) {
            i_166_ = i_156_ + anInt3886 +
                ((i_158_ - anInt3886 - anInt3891 - ((i_165_ - 1) * i_164_)) / 2);
        } else if (i_163_ == 2) {
            i_166_ = (i_156_ + i_158_) - anInt3891 - ((i_165_ - 1) * i_164_);
        } else {
            int i_167_ = ((i_158_ - anInt3886 - anInt3891 -
                ((i_165_ - 1) * i_164_)) / (i_165_ + 1));

            if (i_167_ < 0) {
                i_167_ = 0;
            }

            i_166_ = i_156_ + anInt3886 + i_167_;
            i_164_ += i_167_;
        }

        for (int i_168_ = 0; i_168_ < i_165_; i_168_++) {
            if (i_162_ == 0) {
                method611(aJStringArray3892[i_168_], i, i_166_);
            } else if (i_162_ == 1) {
                method611(aJStringArray3892[i_168_],
                    i + ((i_157_ - method617(aJStringArray3892[i_168_])) / 2),
                    i_166_);
            } else if (i_162_ == 2) {
                method611(aJStringArray3892[i_168_],
                    (i + i_157_) - method617(aJStringArray3892[i_168_]), i_166_);
            } else if (i_168_ == (i_165_ - 1)) {
                method611(aJStringArray3892[i_168_], i, i_166_);
            } else {
                method608(aJStringArray3892[i_168_], i_157_);
                method611(aJStringArray3892[i_168_], i, i_166_);
                anInt3887 = 0;
            }

            i_166_ += i_164_;
        }

        return i_165_;
    }

    public void method624(int i, int i_169_, int i_170_) {
        anInt3876 = -1;
        anInt3902 = -1;
        anInt3881 = anInt3884 = i_169_;
        anInt3883 = anInt3874 = i;
        anInt3882 = anInt3866 = i_170_;
        anInt3887 = 0;
        anInt3894 = 0;
    }

    public static int method625(byte[][] is, byte[][] is_171_, int[] is_172_,
        int[] is_173_, int[] is_174_, int i, int i_175_) {
        int i_176_ = is_172_[i];
        int i_177_ = i_176_ + is_174_[i];
        int i_178_ = is_172_[i_175_];
        int i_179_ = i_178_ + is_174_[i_175_];
        int i_180_ = i_176_;

        if (i_178_ > i_176_) {
            i_180_ = i_178_;
        }

        int i_181_ = i_177_;

        if (i_179_ < i_177_) {
            i_181_ = i_179_;
        }

        int i_182_ = is_173_[i];

        if (is_173_[i_175_] < i_182_) {
            i_182_ = is_173_[i_175_];
        }

        byte[] is_183_ = is_171_[i];
        byte[] is_184_ = is[i_175_];
        int i_185_ = i_180_ - i_176_;
        int i_186_ = i_180_ - i_178_;

        for (int i_187_ = i_180_; i_187_ < i_181_; i_187_++) {
            int i_188_ = is_183_[i_185_++] + is_184_[i_186_++];

            if (i_188_ < i_182_) {
                i_182_ = i_188_;
            }
        }

        return -i_182_;
    }

    public void method626(int i, int i_189_, int i_190_, int i_191_,
        int i_192_, int i_193_, int i_194_) {
        int i_195_ = i_189_ + (i_190_ * Class37_Sub4_Sub9.anInt2662);
        int i_196_ = Class37_Sub4_Sub9.anInt2662 - i_191_;
        int i_197_ = 0;
        int i_198_ = 0;

        if (i_190_ < Class37_Sub4_Sub9.anInt2663) {
            int i_199_ = Class37_Sub4_Sub9.anInt2663 - i_190_;
            i_192_ -= i_199_;
            i_190_ = Class37_Sub4_Sub9.anInt2663;
            i_198_ += (i_199_ * i_191_);
            i_195_ += (i_199_ * Class37_Sub4_Sub9.anInt2662);
        }

        if ((i_190_ + i_192_) > Class37_Sub4_Sub9.anInt2664) {
            i_192_ -= ((i_190_ + i_192_) - Class37_Sub4_Sub9.anInt2664);
        }

        if (i_189_ < Class37_Sub4_Sub9.anInt2661) {
            int i_200_ = Class37_Sub4_Sub9.anInt2661 - i_189_;
            i_191_ -= i_200_;
            i_189_ = Class37_Sub4_Sub9.anInt2661;
            i_198_ += i_200_;
            i_195_ += i_200_;
            i_197_ += i_200_;
            i_196_ += i_200_;
        }

        if ((i_189_ + i_191_) > Class37_Sub4_Sub9.anInt2667) {
            int i_201_ = (i_189_ + i_191_) - Class37_Sub4_Sub9.anInt2667;
            i_191_ -= i_201_;
            i_197_ += i_201_;
            i_196_ += i_201_;
        }

        if ((i_191_ > 0) && (i_192_ > 0)) {
            method622(Class37_Sub4_Sub9.anIntArray2666, aByteArrayArray3878[i],
                i_193_, i_198_, i_195_, i_191_, i_192_, i_196_, i_197_, i_194_);
        }
    }

    public void method627(JString jstring) {
        do {
            try {
                if (jstring.startsWith(aJString_3880, 52)) {
                    anInt3883 = jstring.substring(4).parseInt(1037, 16);
                } else if (jstring.equals(-88, aJString_3890)) {
                    anInt3883 = anInt3874;
                } else if (jstring.startsWith(aJString_3896, 52)) {
                    anInt3876 = jstring.substring(4).parseInt(1037, 16);
                } else if (jstring.equals(-79, aJString_3900)) {
                    anInt3876 = 8388608;
                } else if (jstring.equals(-99, aJString_3885)) {
                    anInt3876 = -1;
                } else if (jstring.startsWith(aJString_3870, 52)) {
                    anInt3902 = jstring.substring(2).parseInt(1037, 16);
                } else if (jstring.equals(-99, aJString_3877)) {
                    anInt3902 = 0;
                } else if (jstring.equals(-128, aJString_3868)) {
                    anInt3902 = -1;
                } else if (jstring.startsWith(aJString_3898, 52)) {
                    anInt3881 = jstring.substring(5).parseInt(1037, 16);
                } else if (jstring.equals(-122, aJString_3897)) {
                    anInt3881 = 0;
                } else if (jstring.equals(-101, aJString_3867)) {
                    anInt3881 = anInt3884;
                } else {
                    if (!jstring.equals(-89, aJString_3872)) {
                        break;
                    }

                    method624(anInt3874, anInt3884, anInt3866);
                }
            } catch (Exception exception) {
                break;
            }

            break;
        } while (false);
    }

    public int method628(JString jstring, int i) {
        int i_210_ = method599(jstring, new int[] { i }, aJStringArray3892);
        int i_211_ = 0;

        for (int i_212_ = 0; i_212_ < i_210_; i_212_++) {
            int i_213_ = method617(aJStringArray3892[i_212_]);

            if (i_213_ > i_211_) {
                i_211_ = i_213_;
            }
        }

        return i_211_;
    }
}
