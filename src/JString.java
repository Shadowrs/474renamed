/* JString - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.FontMetrics;
import java.awt.Graphics;

import java.net.MalformedURLException;
import java.net.URL;


public class JString implements Interface1 {
    public static int anInt1635;
    public static int anInt1636;
    public static int anInt1637;
    public static JString aJString_1638;
    public static int anInt1640;
    public static int anInt1641;
    public static int anInt1642;
    public static int anInt1643;
    public static int anInt1644;
    public static Class15 aClass15_1645;
    public static JString aJString_1646 = Class37_Sub2.method332((byte) 106,
            "Connecting to update server");
    public static int anInt1647;
    public static int anInt1648;
    public static int anInt1649;
    public static int anInt1651;
    public static int anInt1652;
    public static int anInt1653;
    public static int anInt1654;
    public static int anInt1655;
    public static int anInt1656;
    public static int anInt1657;
    public static int anInt1658;
    public static int[] anIntArray1659 = new int[128];
    public static int anInt1661;
    public static int anInt1662;
    public static int anInt1663;
    public static int anInt1664 = -16 + (int) (Math.random() * 33.0);
    public static int anInt1665;
    public static int anInt1666;
    public static int anInt1667;
    public static int anInt1668;
    public static int anInt1670;
    public static int anInt1671;
    public static int anInt1672;
    public static int anInt1673;
    public static int anInt1674;
    public static int anInt1675;
    public static int anInt1676;
    public static int anInt1677;
    public static int anInt1678;
    public static JString aJString_1679;
    public static int anInt1680;
    public static int anInt1681;
    public static JString aJString_1682 = aJString_1646;
    public static int anInt1683;
    public static int anInt1684;
    public static int anInt1685;

    /*synthetic*/ public static Class aJString86;

    static {
        aJString_1679 = Class37_Sub2.method332((byte) 111, "Loaded config");
        aJString_1638 = aJString_1679;
    }

    public boolean aBoolean1639 = true;
    public int anInt1650;
    public int anInt1660;
    public byte[] aByteArray1669;

    public int method143(JString jstring_0_, int i) {
        anInt1655++;

        int i_1_;

        if (anInt1650 <= jstring_0_.anInt1650) {
            i_1_ = anInt1650;
        } else {
            i_1_ = jstring_0_.anInt1650;
        }

        for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_2_++) {
            if (((jstring_0_.aByteArray1669[i_2_] & 0xff) ^ 0xffffffff) < ((0xff &
                    aByteArray1669[i_2_]) ^ 0xffffffff)) {
                return -1;
            }

            if ((0xff & aByteArray1669[i_2_]) > (jstring_0_.aByteArray1669[i_2_] &
                    0xff)) {
                return 1;
            }
        }

        if (anInt1650 < jstring_0_.anInt1650) {
            return -1;
        }

        if ((anInt1650 ^ 0xffffffff) < (jstring_0_.anInt1650 ^ 0xffffffff)) {
            return 1;
        }

        if (i != 10303) {
            return -74;
        }

        return 0;
    }

    public JString method144(int i, boolean bool) {
        anInt1670++;

        if (((i ^ 0xffffffff) >= -1) || (i > 255)) {
            throw new IllegalArgumentException("invalid char");
        }

        JString jstring_3_ = new JString();

        if (bool != false) {
            anInt1650 = -31;
        }

        jstring_3_.aByteArray1669 = new byte[anInt1650 - -1];
        jstring_3_.anInt1650 = 1 + anInt1650;
        Class53.method1135(aByteArray1669, 0, jstring_3_.aByteArray1669, 0,
            anInt1650);
        jstring_3_.aByteArray1669[anInt1650] = (byte) i;

        return jstring_3_;
    }

    public boolean method145(int i) {
        if (i > -32) {
            anInt1650 = -1;
        }

        anInt1643++;

        return method149(-46, 10);
    }

    public static void method146(byte i) {
        if (i >= 23) {
            aClass15_1645 = null;
            aJString_1682 = null;
            aJString_1679 = null;
            anIntArray1659 = null;
            aJString_1646 = null;
            aJString_1638 = null;
        }
    }

    public JString method147(int i) {
        if (i != 12131) {
            method167(-103);
        }

        JString jstring_4_ = new JString();
        anInt1676++;
        jstring_4_.anInt1650 = anInt1650;
        jstring_4_.aByteArray1669 = new byte[anInt1650];

        for (int i_5_ = 0; anInt1650 > i_5_; i_5_++) {
            byte i_6_ = aByteArray1669[i_5_];

            if (((i_6_ >= 65) && ((i_6_ ^ 0xffffffff) >= -91)) ||
                    (((i_6_ ^ 0xffffffff) <= 63) &&
                    ((i_6_ ^ 0xffffffff) >= 33) && ((i_6_ ^ 0xffffffff) != 40))) {
                i_6_ += 32;
            }

            jstring_4_.aByteArray1669[i_5_] = i_6_;
        }

        return jstring_4_;
    }

    public boolean method148(int i, JString jstring_7_) {
        anInt1684++;

        if (jstring_7_ == null) {
            return false;
        }

        if (anInt1650 != jstring_7_.anInt1650) {
            return false;
        }

        if (!aBoolean1639 || !jstring_7_.aBoolean1639) {
            if (anInt1660 == 0) {
                anInt1660 = method162((byte) -111);

                if (anInt1660 == 0) {
                    anInt1660 = 1;
                }
            }

            if ((jstring_7_.anInt1660 ^ 0xffffffff) == -1) {
                jstring_7_.anInt1660 = jstring_7_.method162((byte) -125);

                if (jstring_7_.anInt1660 == 0) {
                    jstring_7_.anInt1660 = 1;
                }
            }

            if ((anInt1660 ^ 0xffffffff) != (jstring_7_.anInt1660 ^ 0xffffffff)) {
                return false;
            }
        }

        if (i > -75) {
            return false;
        }

        for (int i_8_ = 0; anInt1650 > i_8_; i_8_++) {
            if (jstring_7_.aByteArray1669[i_8_] != aByteArray1669[i_8_]) {
                return false;
            }
        }

        return true;
    }

    public boolean method149(int i, int i_9_) {
        anInt1647++;

        boolean bool = false;
        boolean bool_10_ = false;

        if (i != -46) {
            method155(89, -91);
        }

        int i_11_ = 0;

        if ((i_9_ < 1) || ((i_9_ ^ 0xffffffff) < -37)) {
            i_9_ = 10;
        }

        for (int i_12_ = 0; (anInt1650 ^ 0xffffffff) < (i_12_ ^ 0xffffffff);
                i_12_++) {
            int i_13_ = 0xff & aByteArray1669[i_12_];

            if (i_12_ == 0) {
                if ((i_13_ ^ 0xffffffff) == -46) {
                    bool_10_ = true;

                    continue;
                }

                if (i_13_ == 43) {
                    continue;
                }
            }

            if (((i_13_ ^ 0xffffffff) <= -49) && (i_13_ <= 57)) {
                i_13_ -= 48;
            } else if ((i_13_ < 65) || ((i_13_ ^ 0xffffffff) < -91)) {
                if (((i_13_ ^ 0xffffffff) <= -98) &&
                        ((i_13_ ^ 0xffffffff) >= -123)) {
                    i_13_ -= 87;
                } else {
                    return false;
                }
            } else {
                i_13_ -= 55;
            }

            if (i_13_ >= i_9_) {
                return false;
            }

            if (bool_10_) {
                i_13_ = -i_13_;
            }

            int i_14_ = (i_9_ * i_11_) - -i_13_;

            if (((i_14_ / i_9_) ^ 0xffffffff) != (i_11_ ^ 0xffffffff)) {
                return false;
            }

            bool = true;
            i_11_ = i_14_;
        }

        return bool;
    }

    public String toString() {
        anInt1636++;
        throw new RuntimeException();
    }

    public JString method150(int i) {
        int i_15_ = 2;
        JString jstring_16_ = new JString();

        if (i != 1) {
            method155(6, -34);
        }

        jstring_16_.anInt1650 = anInt1650;
        jstring_16_.aByteArray1669 = new byte[anInt1650];

        for (int i_17_ = 0; anInt1650 > i_17_; i_17_++) {
            byte i_18_ = aByteArray1669[i_17_];

            if ((((i_18_ ^ 0xffffffff) > -98) || ((i_18_ ^ 0xffffffff) < -123)) &&
                    ((i_18_ < -32) || (i_18_ > -2) ||
                    ((i_18_ ^ 0xffffffff) == 8))) {
                if ((((i_18_ ^ 0xffffffff) > -66) ||
                        ((i_18_ ^ 0xffffffff) < -91)) &&
                        ((i_18_ < -64) || (i_18_ > -34) ||
                        ((i_18_ ^ 0xffffffff) == 40))) {
                    if ((i_18_ == 46) || ((i_18_ ^ 0xffffffff) == -34) ||
                            ((i_18_ ^ 0xffffffff) == -64)) {
                        i_15_ = 2;
                    } else if (i_18_ != 32) {
                        i_15_ = 1;
                    } else if ((i_15_ ^ 0xffffffff) != -3) {
                        i_15_ = 1;
                    }
                } else {
                    if (i_15_ == 0) {
                        i_18_ += 32;
                    }

                    i_15_ = 0;
                }
            } else {
                if ((i_15_ ^ 0xffffffff) == -3) {
                    i_18_ -= 32;
                }

                i_15_ = 0;
            }

            jstring_16_.aByteArray1669[i_17_] = i_18_;
        }

        anInt1649++;

        return jstring_16_;
    }

    public JString method151(byte i) {
        anInt1683++;

        if (i > -49) {
            method162((byte) -66);
        }

        int i_19_ = anInt1650;
        int i_20_;

        for (i_20_ = 0; (i_20_ ^ 0xffffffff) > (anInt1650 ^ 0xffffffff);
                i_20_++) {
            if (((aByteArray1669[i_20_] < 0) || (aByteArray1669[i_20_] > 32)) &&
                    (((0xff & aByteArray1669[i_20_]) ^ 0xffffffff) != -161)) {
                break;
            }
        }

        for (;
                (((i_20_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff)) &&
                ((((aByteArray1669[-1 + i_19_] ^ 0xffffffff) <= -1) &&
                (aByteArray1669[i_19_ - 1] <= 32)) ||
                ((0xff & aByteArray1669[i_19_ - 1]) == 160))); i_19_--) {
            /* empty */
        }

        if ((i_20_ == 0) && (i_19_ == anInt1650)) {
            return this;
        }

        JString jstring_21_ = new JString();
        jstring_21_.anInt1650 = -i_20_ + i_19_;
        jstring_21_.aByteArray1669 = new byte[jstring_21_.anInt1650];

        for (int i_22_ = 0; i_22_ < jstring_21_.anInt1650; i_22_++)
            jstring_21_.aByteArray1669[i_22_] = aByteArray1669[i_20_ + i_22_];

        return jstring_21_;
    }

    public long method152(int i) {
        anInt1658++;

        long l = 0L;

        for (int i_23_ = 0;
                (((i_23_ ^ 0xffffffff) > (anInt1650 ^ 0xffffffff)) &&
                ((i_23_ ^ 0xffffffff) > -13)); i_23_++) {
            int i_24_ = aByteArray1669[i_23_];
            l *= 37L;

            if (((i_24_ ^ 0xffffffff) <= -66) && (i_24_ <= 90)) {
                l += (long) (-65 + (i_24_ + 1));
            } else if (((i_24_ ^ 0xffffffff) <= -98) && (i_24_ <= 122)) {
                l += (long) (-97 + (i_24_ + 1));
            } else if (((i_24_ ^ 0xffffffff) <= -49) &&
                    ((i_24_ ^ 0xffffffff) >= -58)) {
                l += (long) (-48 + (27 - -i_24_));
            }
        }

        if (i > -35) {
            method171(-5);
        }

        for (; (((l % 37L) ^ 0xffffffffffffffffL) == -1L) && (l != 0L);
                l /= 37L) {
            /* empty */
        }

        return l;
    }

    public static int method153(int i, int i_25_, int i_26_, int i_27_) {
        anInt1675++;

        int i_28_ = i_27_ >> 1243315303;
        int i_29_ = i_26_ >> 49332391;

        if (i_25_ != -169496123) {
            method146((byte) -81);
        }

        if ((i_28_ < 0) || (i_29_ < 0) || (i_28_ > 103) ||
                ((i_29_ ^ 0xffffffff) < -104)) {
            return 0;
        }

        int i_30_ = i;

        if (((i_30_ ^ 0xffffffff) > -4) &&
                (((Class1.aByteArrayArrayArray63[1][i_28_][i_29_] & 0x2) ^
                0xffffffff) == -3)) {
            i_30_++;
        }

        int i_31_ = 0x7f & i_27_;
        int i_32_ = ((((128 + -i_31_) * Class64.anIntArrayArrayArray1217[i_30_][i_28_][i_29_]) -
            -(Class64.anIntArrayArrayArray1217[i_30_][1 + i_28_][i_29_] * i_31_)) >> -52272761);
        int i_33_ = 0x7f & i_26_;
        int i_34_ = ((((128 + -i_31_) * (Class64.anIntArrayArrayArray1217[i_30_][i_28_][1 +
            i_29_])) +
            ((Class64.anIntArrayArrayArray1217[i_30_][i_28_ - -1][i_29_ + 1]) * i_31_)) >> 539975719);

        return ((i_32_ * (-i_33_ + 128)) + (i_34_ * i_33_)) >> 1771097127;
    }

    public JString method154(int i, int i_35_) {
        anInt1673++;

        if (((i_35_ ^ 0xffffffff) >= -1) || ((i_35_ ^ 0xffffffff) < -256)) {
            throw new IllegalArgumentException("invalid char:" + i_35_);
        }

        if (!aBoolean1639) {
            throw new IllegalArgumentException();
        }

        anInt1660 = i;

        if (anInt1650 == aByteArray1669.length) {
            int i_36_;

            for (i_36_ = 1; (i_36_ ^ 0xffffffff) >= (anInt1650 ^ 0xffffffff);
                    i_36_ += i_36_) {
                /* empty */
            }

            byte[] is = new byte[i_36_];
            Class53.method1135(aByteArray1669, 0, is, 0, anInt1650);
            aByteArray1669 = is;
        }

        aByteArray1669[anInt1650++] = (byte) i_35_;

        return this;
    }

    public int hashCode() {
        anInt1657++;

        return method162((byte) -107);
    }

    public int method155(int i, int i_37_) {
        if (i != 1037) {
            aJString_1682 = null;
        }

        boolean bool = false;

        if ((i_37_ < 1) || (i_37_ > 36)) {
            i_37_ = 10;
        }

        boolean bool_38_ = false;
        anInt1640++;

        int i_39_ = 0;

        for (int i_40_ = 0; anInt1650 > i_40_; i_40_++) {
            int i_41_ = 0xff & aByteArray1669[i_40_];

            if ((i_40_ ^ 0xffffffff) == -1) {
                if (i_41_ == 45) {
                    bool = true;

                    continue;
                }

                if ((i_41_ ^ 0xffffffff) == -44) {
                    continue;
                }
            }

            if ((i_41_ >= 48) && (i_41_ <= 57)) {
                i_41_ -= 48;
            } else if (((i_41_ ^ 0xffffffff) <= -66) && (i_41_ <= 90)) {
                i_41_ -= 55;
            } else {
                if ((i_41_ < 97) || ((i_41_ ^ 0xffffffff) < -123)) {
                    throw new NumberFormatException();
                }

                i_41_ -= 87;
            }

            if (i_37_ <= i_41_) {
                throw new NumberFormatException();
            }

            if (bool) {
                i_41_ = -i_41_;
            }

            int i_42_ = i_41_ + (i_39_ * i_37_);

            if (((i_42_ / i_37_) ^ 0xffffffff) != (i_39_ ^ 0xffffffff)) {
                throw new NumberFormatException();
            }

            i_39_ = i_42_;
            bool_38_ = true;
        }

        if (!bool_38_) {
            throw new NumberFormatException();
        }

        return i_39_;
    }

    public int method156(int i, JString jstring_43_) {
        anInt1678++;

        int i_44_ = 103 / ((i - -47) / 55);

        return method168((byte) 58, jstring_43_, 0);
    }

    public JString method157(JString jstring_45_, int i) {
        anInt1681++;

        if (!aBoolean1639) {
            throw new IllegalArgumentException();
        }

        anInt1660 = 0;

        if ((aByteArray1669.length ^ 0xffffffff) > ((jstring_45_.anInt1650 +
                anInt1650) ^ 0xffffffff)) {
            int i_46_;

            for (i_46_ = 1; (anInt1650 + jstring_45_.anInt1650) > i_46_;
                    i_46_ += i_46_) {
                /* empty */
            }

            byte[] is = new byte[i_46_];
            Class53.method1135(aByteArray1669, 0, is, 0, anInt1650);
            aByteArray1669 = is;
        }

        Class53.method1135(jstring_45_.aByteArray1669, 0, aByteArray1669,
            anInt1650, jstring_45_.anInt1650);
        anInt1650 += jstring_45_.anInt1650;

        if (i != -20035) {
            return null;
        }

        return this;
    }

    public JString method158(int i, int i_47_) {
        if (i_47_ != -1) {
            aJString_1682 = null;
        }

        anInt1656++;

        return method169(i_47_ ^ 0xffffffff, i, anInt1650);
    }

    public boolean method159(JString jstring_48_, byte i) {
        anInt1671++;

        if (jstring_48_ == null) {
            return false;
        }

        if (i < 52) {
            aByteArray1669 = null;
        }

        if ((jstring_48_.anInt1650 ^ 0xffffffff) != (anInt1650 ^ 0xffffffff)) {
            return false;
        }

        for (int i_49_ = 0; anInt1650 > i_49_; i_49_++) {
            byte i_50_ = jstring_48_.aByteArray1669[i_49_];

            if (((i_50_ >= 65) && (i_50_ <= 90)) ||
                    (((i_50_ ^ 0xffffffff) <= 63) && (i_50_ <= -34) &&
                    ((i_50_ ^ 0xffffffff) != 40))) {
                i_50_ += 32;
            }

            byte i_51_ = aByteArray1669[i_49_];

            if ((((i_51_ ^ 0xffffffff) <= -66) && (i_51_ <= 90)) ||
                    (((i_51_ ^ 0xffffffff) <= 63) && (i_51_ <= -34) &&
                    (i_51_ != -41))) {
                i_51_ += 32;
            }

            if ((i_50_ ^ 0xffffffff) != (i_51_ ^ 0xffffffff)) {
                return false;
            }
        }

        return true;
    }

    public int method160(int i, int i_52_, int i_53_) {
        anInt1651++;

        byte i_54_ = (byte) i_52_;

        if (i_53_ != 25356) {
            method153(-62, -49, 63, -82);
        }

        for (int i_55_ = i; (i_55_ ^ 0xffffffff) > (anInt1650 ^ 0xffffffff);
                i_55_++) {
            if ((i_54_ ^ 0xffffffff) == (aByteArray1669[i_55_] ^ 0xffffffff)) {
                return i_55_;
            }
        }

        return -1;
    }

    public int method161(int i, int i_56_) {
        anInt1635++;

        int i_57_ = -116 / ((-14 - i_56_) / 35);

        return 0xff & aByteArray1669[i];
    }

    public int method162(byte i) {
        anInt1654++;

        int i_58_ = 0;

        if (i > -104) {
            return 45;
        }

        for (int i_59_ = 0; (i_59_ ^ 0xffffffff) > (anInt1650 ^ 0xffffffff);
                i_59_++)
            i_58_ = (i_58_ << -1272282715) +
                (-i_58_ + (0xff & aByteArray1669[i_59_]));

        return i_58_;
    }

    public JString method163(int i) {
        JString jstring_60_ = new JString();
        jstring_60_.anInt1650 = anInt1650;
        jstring_60_.aByteArray1669 = new byte[anInt1650];

        int i_61_ = 0;
        int i_62_ = -58 / ((60 - i) / 54);

        for (; anInt1650 > i_61_; i_61_++)
            jstring_60_.aByteArray1669[i_61_] = (byte) 42;

        anInt1668++;

        return jstring_60_;
    }

    public boolean equals(Object object) {
        anInt1665++;

        if (object instanceof JString) {
            return method148(-97, (JString) object);
        }

        throw new IllegalArgumentException();
    }

    public JString method164(int i) {
        anInt1672++;

        JString jstring_63_ = new JString();
        jstring_63_.anInt1650 = anInt1650;

        if (i != 70) {
            aJString_1646 = null;
        }

        boolean bool = true;
        jstring_63_.aByteArray1669 = new byte[anInt1650];

        for (int i_64_ = 0; anInt1650 > i_64_; i_64_++) {
            byte i_65_ = aByteArray1669[i_64_];

            if ((i_65_ ^ 0xffffffff) == -96) {
                bool = true;
                jstring_63_.aByteArray1669[i_64_] = (byte) 32;
            } else if (((i_65_ ^ 0xffffffff) <= -98) &&
                    ((i_65_ ^ 0xffffffff) >= -123) && bool) {
                bool = false;
                jstring_63_.aByteArray1669[i_64_] = (byte) (i_65_ + -32);
            } else {
                bool = false;
                jstring_63_.aByteArray1669[i_64_] = i_65_;
            }
        }

        return jstring_63_;
    }

    public boolean method165(JString jstring_66_, int i) {
        anInt1666++;

        if ((jstring_66_.anInt1650 ^ 0xffffffff) < (anInt1650 ^ 0xffffffff)) {
            return false;
        }

        for (int i_67_ = 0;
                (i_67_ ^ 0xffffffff) > (jstring_66_.anInt1650 ^ 0xffffffff);
                i_67_++) {
            if ((jstring_66_.aByteArray1669[i_67_] ^ 0xffffffff) != (aByteArray1669[i_67_] ^
                    0xffffffff)) {
                return false;
            }
        }

        if (i != 52) {
            method146((byte) 20);
        }

        return true;
    }

    public JString method166(int i) {
        long l = method171(-169496123);
        anInt1663++;

        synchronized ((aJString86 != null) ? aJString86
                                           : (aJString86 = method181("JString"))) {
            if (Class62.aClass13_1185 != null) {
                for (Class37_Sub1 class37_sub1 = ((Class37_Sub1) Class62.aClass13_1185.method100(
                            (byte) 116, l)); class37_sub1 != null;
                        class37_sub1 = ((Class37_Sub1) Class62.aClass13_1185.method98(
                                -9410))) {
                    if (method148(-127, class37_sub1.aJString_1797)) {
                        return class37_sub1.aJString_1797;
                    }
                }
            } else {
                Class62.aClass13_1185 = new Class13(4096);
            }

            Class37_Sub1 class37_sub1 = new Class37_Sub1();
            aBoolean1639 = false;
            class37_sub1.aJString_1797 = this;
            Class62.aClass13_1185.method101(class37_sub1, false, l);
        }

        if (i > -88) {
            method168((byte) -80, null, 52);
        }

        return this;
    }

    public JString method167(int i) {
        int i_68_ = 0;

        if (i != -1) {
            method170(false, null);
        }

        JString jstring_69_ = new JString();
        jstring_69_.aByteArray1669 = new byte[12];
        anInt1685++;
        jstring_69_.anInt1650 = 0;

        for (int i_70_ = 0; anInt1650 > i_70_; i_70_++) {
            if ((aByteArray1669[i_70_] < 65) ||
                    ((aByteArray1669[i_70_] ^ 0xffffffff) < -91)) {
                if ((((aByteArray1669[i_70_] ^ 0xffffffff) > -98) ||
                        (aByteArray1669[i_70_] > 122)) &&
                        ((aByteArray1669[i_70_] < 48) ||
                        ((aByteArray1669[i_70_] ^ 0xffffffff) < -58))) {
                    if ((i_68_ ^ 0xffffffff) < -1) {
                        jstring_69_.aByteArray1669[i_68_++] = (byte) 95;
                    }
                } else {
                    jstring_69_.aByteArray1669[i_68_++] = aByteArray1669[i_70_];
                    jstring_69_.anInt1650 = i_68_;
                }
            } else {
                jstring_69_.aByteArray1669[i_68_++] = (byte) (32 +
                    aByteArray1669[i_70_]);
                jstring_69_.anInt1650 = i_68_;
            }

            if (i_68_ == 12) {
                break;
            }
        }

        return jstring_69_;
    }

    public int method168(byte i, JString jstring_71_, int i_72_) {
        int[] is = new int[jstring_71_.anInt1650];
        anInt1680++;

        int[] is_73_ = new int[256];
        int[] is_74_ = new int[jstring_71_.anInt1650];
        int i_75_ = 0;

        if (i != 58) {
            method163(-123);
        }

        for (; (i_75_ ^ 0xffffffff) > (is_73_.length ^ 0xffffffff); i_75_++)
            is_73_[i_75_] = jstring_71_.anInt1650;

        for (int i_76_ = 1;
                (i_76_ ^ 0xffffffff) >= (jstring_71_.anInt1650 ^ 0xffffffff);
                i_76_++) {
            is[-1 + i_76_] = (jstring_71_.anInt1650 << 1080633089) + -i_76_;

            is_73_[Class37_Sub4_Sub7.method490(255,
                jstring_71_.aByteArray1669[-1 + i_76_])] = jstring_71_.anInt1650 -
                i_76_;
        }

        int i_77_ = 1 + jstring_71_.anInt1650;
        int i_78_ = jstring_71_.anInt1650;

        while ((i_78_ ^ 0xffffffff) < -1) {
            is_74_[-1 + i_78_] = i_77_;

            for (;
                    (((jstring_71_.anInt1650 ^ 0xffffffff) <= (i_77_ ^
                    0xffffffff)) &&
                    ((jstring_71_.aByteArray1669[-1 + i_78_] ^ 0xffffffff) != (jstring_71_.aByteArray1669[-1 +
                    i_77_] ^ 0xffffffff))); i_77_ = is_74_[i_77_ + -1]) {
                if (is[-1 + i_77_] >= (-i_78_ + jstring_71_.anInt1650)) {
                    is[-1 + i_77_] = jstring_71_.anInt1650 - i_78_;
                }
            }

            i_78_--;
            i_77_--;
        }

        int i_79_ = i_77_;
        int i_80_ = 0;
        int i_81_ = 1;
        i_77_ = -i_79_ + jstring_71_.anInt1650 + 1;

        for (int i_82_ = 1; (i_77_ ^ 0xffffffff) <= (i_82_ ^ 0xffffffff);
                i_82_++) {
            is_74_[i_82_ + -1] = i_80_;

            for (;
                    (i_80_ >= 1) &&
                    (jstring_71_.aByteArray1669[-1 + i_82_] != jstring_71_.aByteArray1669[i_80_ +
                    -1]); i_80_ = is_74_[-1 + i_80_]) {
                /* empty */
            }

            i_80_++;
        }

        while ((i_79_ ^ 0xffffffff) > (jstring_71_.anInt1650 ^ 0xffffffff)) {
            for (int i_83_ = i_81_;
                    (i_79_ ^ 0xffffffff) <= (i_83_ ^ 0xffffffff); i_83_++) {
                if ((((i_79_ + jstring_71_.anInt1650) - i_83_) ^ 0xffffffff) >= (is[i_83_ +
                        -1] ^ 0xffffffff)) {
                    is[i_83_ - 1] = -i_83_ + (i_79_ + jstring_71_.anInt1650);
                }
            }

            i_81_ = 1 + i_79_;
            i_79_ = -is_74_[-1 + i_77_] + i_77_ + i_79_;
            i_77_ = is_74_[i_77_ - 1];
        }

        int i_84_;

        for (int i_85_ = jstring_71_.anInt1650 + (i_72_ - 1);
                (i_85_ ^ 0xffffffff) > (anInt1650 ^ 0xffffffff);
                i_85_ += Math.max(is_73_[aByteArray1669[i_85_] & 0xff],
                    is[i_84_])) {
            for (i_84_ = jstring_71_.anInt1650 + -1;
                    (i_84_ >= 0) &&
                    (aByteArray1669[i_85_] == jstring_71_.aByteArray1669[i_84_]);
                    i_84_--)
                i_85_--;

            if ((i_84_ ^ 0xffffffff) == 0) {
                return i_85_ - -1;
            }
        }

        return -1;
    }

    public JString method169(int i, int i_86_, int i_87_) {
        anInt1667++;

        JString jstring_88_ = new JString();
        jstring_88_.aByteArray1669 = new byte[i_87_ + -i_86_];
        jstring_88_.anInt1650 = i_87_ + -i_86_;
        Class53.method1135(aByteArray1669, i_86_, jstring_88_.aByteArray1669,
            i, jstring_88_.anInt1650);

        return jstring_88_;
    }

    public int method170(boolean bool, JString jstring_89_) {
        int i;

        if (anInt1650 > jstring_89_.anInt1650) {
            i = jstring_89_.anInt1650;
        } else {
            i = anInt1650;
        }

        anInt1652++;

        if (bool != true) {
            method180(null, -38, 126, 47);
        }

        for (int i_90_ = 0; (i ^ 0xffffffff) < (i_90_ ^ 0xffffffff); i_90_++) {
            if (Class37_Sub9_Sub22.anIntArray3326[aByteArray1669[i_90_] & 0xff] < (Class37_Sub9_Sub22.anIntArray3326[0xff &
                    jstring_89_.aByteArray1669[i_90_]])) {
                return -1;
            }

            if ((Class37_Sub9_Sub22.anIntArray3326[jstring_89_.aByteArray1669[i_90_] &
                    0xff]) < (Class37_Sub9_Sub22.anIntArray3326[aByteArray1669[i_90_] &
                    0xff])) {
                return 1;
            }
        }

        if ((anInt1650 ^ 0xffffffff) > (jstring_89_.anInt1650 ^ 0xffffffff)) {
            return -1;
        }

        if (jstring_89_.anInt1650 < anInt1650) {
            return 1;
        }

        return 0;
    }

    public long method171(int i) {
        anInt1662++;

        if (i != -169496123) {
            method161(-94, -38);
        }

        long l = 0L;

        for (int i_91_ = 0; anInt1650 > i_91_; i_91_++)
            l = ((long) (0xff & aByteArray1669[i_91_]) + (l << -169496123)) -
                l;

        return l;
    }

    public int method172(byte i) {
        if (i != 38) {
            return -84;
        }

        anInt1653++;

        return anInt1650;
    }

    public JString method173(byte i) {
        anInt1637++;

        if (!aBoolean1639) {
            throw new IllegalArgumentException();
        }

        anInt1660 = 0;

        if ((aByteArray1669.length ^ 0xffffffff) != (anInt1650 ^ 0xffffffff)) {
            byte[] is = new byte[anInt1650];
            Class53.method1135(aByteArray1669, 0, is, 0, anInt1650);
            aByteArray1669 = is;
        }

        if (i <= 58) {
            hashCode();
        }

        return this;
    }

    public int method174(FontMetrics fontmetrics, int i) {
        String string;

        try {
            string = new String(aByteArray1669, 0, anInt1650, "ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
            string = new String(aByteArray1669, 0, anInt1650);
        }

        if (i <= 83) {
            aJString_1682 = null;
        }

        anInt1677++;

        return fontmetrics.stringWidth(string);
    }

    public int method175(int i) {
        if (i != 8109) {
            method171(-11);
        }

        anInt1642++;

        return method155(1037, 10);
    }

    public boolean method176(JString jstring_92_, byte i) {
        anInt1644++;

        if ((jstring_92_.anInt1650 ^ 0xffffffff) < (anInt1650 ^ 0xffffffff)) {
            return false;
        }

        int i_93_ = -jstring_92_.anInt1650 + anInt1650;

        if (i != -124) {
            aClass15_1645 = null;
        }

        for (int i_94_ = 0; jstring_92_.anInt1650 > i_94_; i_94_++) {
            if ((aByteArray1669[i_94_ + i_93_] ^ 0xffffffff) != (jstring_92_.aByteArray1669[i_94_] ^
                    0xffffffff)) {
                return false;
            }
        }

        return true;
    }

    public int method177(int i, int i_95_, byte[] is, int i_96_, int i_97_) {
        anInt1661++;

        if (i_96_ != -91) {
            return -76;
        }

        Class53.method1135(aByteArray1669, i_97_, is, i_95_, -i_97_ + i);

        return -i_97_ + i;
    }

    public URL method178(byte i) throws MalformedURLException {
        if (i > -40) {
            return null;
        }

        anInt1648++;

        return new URL(new String(aByteArray1669, 0, anInt1650));
    }

    public byte[] getString() {
        anInt1674++;

        byte[] is = new byte[anInt1650];
        Class53.method1135(aByteArray1669, 0, is, 0, anInt1650);

        return is;
    }

    public void method180(Graphics graphics, int i, int i_98_, int i_99_) {
        if (i != 48) {
            method161(-13, -128);
        }

        anInt1641++;

        String string;

        try {
            string = new String(aByteArray1669, 0, anInt1650, "ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
            string = new String(aByteArray1669, 0, anInt1650);
        }

        graphics.drawString(string, i_98_, i_99_);
    }

    /*synthetic*/ public static Class method181(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
