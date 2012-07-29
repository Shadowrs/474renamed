/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;


public class Class42 {
    public static int anInt914;
    public static int anInt915;
    public static int anInt916;
    public static JString aJString_917;
    public static int anInt918;
    public static Class15 aClass15_919;
    public static JString aJString_920 = Class37_Sub2.method332((byte) 119,
            "Invalid loginserver requested)3");
    public static int anInt922;
    public static Class37_Sub4_Sub9_Sub3 aClass37_Sub4_Sub9_Sub3_923;
    public static int anInt924;
    public static Class37_Sub4_Sub9_Sub1 aClass37_Sub4_Sub9_Sub1_925;
    public static int anInt930;
    public static int anInt931;
    public static int anInt933;
    public static int anInt935;
    public static PacketStream aStream_Sub1_936;
    public static int anInt937;
    public static int anInt939;
    public static JString aJString_941;
    public static Class18 aClass18_942;
    public static int anInt944;
    public static JString aJString_945;
    public static int anInt946;
    public static int anInt947;
    public static int anInt948;

    static {
        aJString_917 = Class37_Sub2.method332((byte) 121, "<img=1>");
        anInt939 = 0;
        anInt931 = 0;
        anInt944 = 99;
        aJString_945 = Class37_Sub2.method332((byte) 114, "<img=1>");
        aJString_941 = aJString_920;
        aStream_Sub1_936 = new PacketStream(5000);
    }

    public long aLong913 = -1L;
    public byte[] aByteArray921;
    public byte[] aByteArray926;
    public Class70 aClass70_927;
    public int anInt928 = 0;
    public long aLong929 = -1L;
    public long aLong932;
    public int anInt934;
    public long aLong938;
    public long aLong940;
    public long aLong943;

    public Class42(Class70 class70, int i, int i_56_) throws IOException {
        aClass70_927 = class70;
        aLong940 = aLong932 = class70.method1256(1);
        aByteArray926 = new byte[i_56_];
        aByteArray921 = new byte[i];
        aLong943 = 0L;
    }

    public static void method1075(int i, byte i_0_, int i_1_) {
        anInt915++;

        if ((i_0_ == -126) &&
                ((Class37_Sub9_Sub21.anInt3321 ^ 0xffffffff) == -3)) {
            Class37_Sub4_Sub10.method677(Class41.anInt906 * 2,
                (Class59.anInt1132 +
                ((Class38.anInt851 - Class37_Sub18.anInt2200) << -1349858329)),
                ((Class71.anInt1362 - Class15_Sub1.anInt1738) << -1448268377) -
                -Class88.anInt1599, (byte) -109);

            if ((Class37_Sub23.anInt2232 > -1) &&
                    ((Class37_Sub7.anInt1898 % 20) < 10)) {
                Class37_Sub25.aClass37_Sub4_Sub9_Sub3Array2291[0].method653(-12 +
                    Class37_Sub23.anInt2232 + i_1_,
                    -28 + (Stream.anInt2014 + i));
            }
        }
    }

    public void method1076(int i, byte i_2_, int i_3_, byte[] is)
        throws IOException {
        anInt933++;

        try {
            if (i_2_ != 99) {
                method1083((byte) 35);
            }

            if ((is.length ^ 0xffffffff) > ((i + i_3_) ^ 0xffffffff)) {
                throw new ArrayIndexOutOfBoundsException(-is.length + i_3_ + i);
            }

            if ((aLong913 != -1L) && (aLong913 <= aLong943) &&
                    (((aLong943 + (long) i_3_) ^ 0xffffffffffffffffL) >= ((aLong913 -
                    -(long) anInt928) ^ 0xffffffffffffffffL))) {
                Class53.method1135(aByteArray926, (int) (-aLong913 + aLong943),
                    is, i, i_3_);
                aLong943 += (long) i_3_;

                return;
            }

            long l = aLong943;
            int i_4_ = i;
            int i_5_ = i_3_;

            if ((aLong943 >= aLong929) &&
                    (aLong943 < ((long) anInt934 + aLong929))) {
                int i_6_ = (int) ((long) anInt934 + (-aLong943 - -aLong929));

                if (i_3_ < i_6_) {
                    i_6_ = i_3_;
                }

                i_3_ -= i_6_;
                Class53.method1135(aByteArray921, (int) (-aLong929 + aLong943),
                    is, i, i_6_);
                i += i_6_;
                aLong943 += (long) i_6_;
            }

            if ((i_3_ ^ 0xffffffff) >= (aByteArray921.length ^ 0xffffffff)) {
                if (i_3_ > 0) {
                    method1077(0);

                    int i_7_ = i_3_;

                    if (i_7_ > anInt934) {
                        i_7_ = anInt934;
                    }

                    i_3_ -= i_7_;
                    Class53.method1135(aByteArray921, 0, is, i, i_7_);
                    aLong943 += (long) i_7_;
                    i += i_7_;
                }
            } else {
                aClass70_927.method1254((byte) 17, aLong943);
                aLong938 = aLong943;

                while ((i_3_ ^ 0xffffffff) < -1) {
                    int i_8_ = aClass70_927.method1255(i, i_3_, (byte) -4, is);

                    if (i_8_ == -1) {
                        break;
                    }

                    i_3_ -= i_8_;
                    i += i_8_;
                    aLong943 += (long) i_8_;
                    aLong938 += (long) i_8_;
                }
            }

            if (aLong913 != -1L) {
                if ((aLong913 > aLong943) && (i_3_ > 0)) {
                    int i_9_ = (int) (-aLong943 + aLong913) + i;

                    if ((i + i_3_) < i_9_) {
                        i_9_ = i_3_ + i;
                    }

                    while (i_9_ > i) {
                        is[i++] = (byte) 0;
                        aLong943++;
                        i_3_--;
                    }
                }

                long l_10_ = -1L;

                if ((aLong913 >= l) && (aLong913 < (l + (long) i_5_))) {
                    l_10_ = aLong913;
                } else if ((l >= aLong913) &&
                        ((((long) anInt928 + aLong913) ^ 0xffffffffffffffffL) < (l ^
                        0xffffffffffffffffL))) {
                    l_10_ = l;
                }

                long l_11_ = -1L;

                if ((l >= (aLong913 - -(long) anInt928)) ||
                        (((long) anInt928 + aLong913) > ((long) i_5_ + l))) {
                    if ((aLong913 < (l + (long) i_5_)) &&
                            (((l + (long) i_5_) ^ 0xffffffffffffffffL) >= ((aLong913 -
                            -(long) anInt928) ^ 0xffffffffffffffffL))) {
                        l_11_ = (long) i_5_ + l;
                    }
                } else {
                    l_11_ = (long) anInt928 + aLong913;
                }

                if ((l_10_ > -1L) &&
                        ((l_11_ ^ 0xffffffffffffffffL) < (l_10_ ^
                        0xffffffffffffffffL))) {
                    int i_12_ = (int) (-l_10_ + l_11_);
                    Class53.method1135(aByteArray926,
                        (int) (-aLong913 + l_10_), is,
                        (int) (l_10_ - l) + i_4_, i_12_);

                    if ((l_11_ ^ 0xffffffffffffffffL) < (aLong943 ^
                            0xffffffffffffffffL)) {
                        i_3_ -= (-aLong943 + l_11_);
                        aLong943 = l_11_;
                    }
                }
            }
        } catch (IOException ioexception) {
            aLong938 = -1L;
            throw ioexception;
        }

        if ((i_3_ ^ 0xffffffff) < -1) {
            throw new EOFException();
        }
    }

    public void method1077(int i) throws IOException {
        anInt934 = i;
        anInt937++;

        if ((aLong943 ^ 0xffffffffffffffffL) != (aLong938 ^
                0xffffffffffffffffL)) {
            aClass70_927.method1254((byte) 17, aLong943);
            aLong938 = aLong943;
        }

        aLong929 = aLong943;

        int i_13_;

        for (; (aByteArray921.length ^ 0xffffffff) < (anInt934 ^ 0xffffffff);
                anInt934 += i_13_) {
            i_13_ = aClass70_927.method1255(anInt934,
                    -anInt934 + aByteArray921.length, (byte) 25, aByteArray921);

            if ((i_13_ ^ 0xffffffff) == 0) {
                break;
            }

            aLong938 += (long) i_13_;
        }
    }

    public static boolean method1078(int i, int i_14_) {
        anInt948++;

        if (i != -32) {
            anInt931 = 124;
        }

        if ((((i_14_ >> -1446364547) & 0x1) ^ 0xffffffff) == -1) {
            return false;
        }

        return true;
    }

    public void method1079(int i) throws IOException {
        if (i != 0) {
            method1078(-120, 40);
        }

        anInt914++;
        method1088(3994);
        aClass70_927.method1257(i ^ ~0x7b);
    }

    public static void method1080(int i) {
        anInt916++;

        if ((ObjectDef.anInt2734 ^ 0xffffffff) < -1) {
            ObjectDef.anInt2734--;
        }

        if ((Class37_Sub9_Sub16.anInt3201 ^ 0xffffffff) < -2) {
            Class37_Sub9_Sub16.anInt3201--;
        }

        if (Class37_Sub18.aBoolean2201) {
            Class37_Sub18.aBoolean2201 = false;
            PacketParser.method843(false);
        } else {
            for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -101; i_15_++) {
                if (!PacketParser.method840(-1)) {
                    break;
                }
            }

            if (Class32.anInt740 == 30) {
                Class37_Sub4_Sub17.method725(aStream_Sub1_936, 149, -21);

                synchronized (Class37_Sub9_Sub27.aClass55_3417.anObject1073) {
                    if (Class37_Sub13.aBoolean2109) {
                        if ((Class37_Sub9_Sub28.anInt3440 != 0) ||
                                ((Class37_Sub9_Sub27.aClass55_3417.anInt1079 ^
                                0xffffffff) <= -41)) {
                            aStream_Sub1_936.method989(-1494101117, 121);
                            Class10.anInt192++;
                            aStream_Sub1_936.method964(104, 0);

                            int i_16_ = aStream_Sub1_936.currentIndex;
                            int i_17_ = 0;

                            for (int i_18_ = 0;
                                    ((i_18_ ^ 0xffffffff) > (Class37_Sub9_Sub27.aClass55_3417.anInt1079 ^
                                    0xffffffff)); i_18_++) {
                                if (((-i_16_ +
                                        aStream_Sub1_936.currentIndex) ^
                                        0xffffffff) <= -241) {
                                    break;
                                }

                                i_17_++;

                                int i_19_ = (Class37_Sub9_Sub27.aClass55_3417.anIntArray1080[i_18_]);
                                int i_20_ = (Class37_Sub9_Sub27.aClass55_3417.anIntArray1078[i_18_]);

                                if ((i_20_ ^ 0xffffffff) > -1) {
                                    i_20_ = 0;
                                } else if ((i_20_ ^ 0xffffffff) < -765) {
                                    i_20_ = 764;
                                }

                                if ((i_19_ ^ 0xffffffff) > -1) {
                                    i_19_ = 0;
                                } else if (i_19_ > 502) {
                                    i_19_ = 502;
                                }

                                int i_21_ = i_20_ + (i_19_ * 765);

                                if ((((Class37_Sub9_Sub27.aClass55_3417.anIntArray1080[i_18_]) ^
                                        0xffffffff) == 0) &&
                                        ((Class37_Sub9_Sub27.aClass55_3417.anIntArray1078[i_18_]) == -1)) {
                                    i_19_ = -1;
                                    i_21_ = 524287;
                                    i_20_ = -1;
                                }

                                if ((i_20_ == Class24.anInt605) &&
                                        (i_19_ == Class37_Sub9_Sub30.anInt3479)) {
                                    if (Class37_Sub9_Sub16.anInt3192 < 2047) {
                                        Class37_Sub9_Sub16.anInt3192++;
                                    }
                                } else {
                                    int i_22_ = i_20_ + -Class24.anInt605;
                                    Class24.anInt605 = i_20_;

                                    int i_23_ = (-Class37_Sub9_Sub30.anInt3479 +
                                        i_19_);
                                    Class37_Sub9_Sub30.anInt3479 = i_19_;

                                    if ((Class37_Sub9_Sub16.anInt3192 < 8) &&
                                            (i_22_ >= -32) && (i_22_ <= 31) &&
                                            (i_23_ >= -32) && (i_23_ <= 31)) {
                                        i_22_ += 32;
                                        i_23_ += 32;
                                        aStream_Sub1_936.method965(848881960,
                                            ((i_22_ << -1251076986) +
                                            ((Class37_Sub9_Sub16.anInt3192 << 988481868) -
                                            -i_23_)));
                                        Class37_Sub9_Sub16.anInt3192 = 0;
                                    } else if (Class37_Sub9_Sub16.anInt3192 < 8) {
                                        aStream_Sub1_936.method930((i_21_ +
                                            8388608 +
                                            (Class37_Sub9_Sub16.anInt3192 << -1247144301)),
                                            i ^ ~0x7c);
                                        Class37_Sub9_Sub16.anInt3192 = 0;
                                    } else {
                                        aStream_Sub1_936.method947((byte) 53,
                                            (i_21_ +
                                            ((Class37_Sub9_Sub16.anInt3192 << -1764545069) +
                                            -1073741824)));
                                        Class37_Sub9_Sub16.anInt3192 = 0;
                                    }
                                }
                            }

                            aStream_Sub1_936.method948(-i_16_ +
                                aStream_Sub1_936.currentIndex, i ^ 0x80);

                            if (i_17_ < Class37_Sub9_Sub27.aClass55_3417.anInt1079) {
                                Class37_Sub9_Sub27.aClass55_3417.anInt1079 -= i_17_;

                                for (int i_24_ = 0;
                                        ((Class37_Sub9_Sub27.aClass55_3417.anInt1079) > i_24_);
                                        i_24_++) {
                                    Class37_Sub9_Sub27.aClass55_3417.anIntArray1078[i_24_] = (Class37_Sub9_Sub27.aClass55_3417.anIntArray1078[i_24_ +
                                        i_17_]);

                                    Class37_Sub9_Sub27.aClass55_3417.anIntArray1080[i_24_] = (Class37_Sub9_Sub27.aClass55_3417.anIntArray1080[i_17_ +
                                        i_24_]);
                                }
                            } else {
                                Class37_Sub9_Sub27.aClass55_3417.anInt1079 = 0;
                            }
                        }
                    } else {
                        Class37_Sub9_Sub27.aClass55_3417.anInt1079 = 0;
                    }
                }

                if (Class37_Sub9_Sub28.anInt3440 != 0) {
                    Class37_Sub8.anInt1942++;

                    long l = ((Class89.aLong1619 -
                        PacketParser.aLong3250) / 50L);

                    if (l > 4095L) {
                        l = 4095L;
                    }

                    PacketParser.aLong3250 = Class89.aLong1619;

                    int i_25_ = Class37_Sub13.anInt2113;

                    if ((i_25_ ^ 0xffffffff) > -1) {
                        i_25_ = 0;
                    } else if (i_25_ > 502) {
                        i_25_ = 502;
                    }

                    int i_26_ = Class33.anInt764;

                    if ((i_26_ ^ 0xffffffff) <= -1) {
                        if ((i_26_ ^ 0xffffffff) < -765) {
                            i_26_ = 764;
                        }
                    } else {
                        i_26_ = 0;
                    }

                    int i_27_ = i_26_ + (i_25_ * 765);
                    int i_28_ = 0;
                    int i_29_ = (int) l;

                    if ((Class37_Sub9_Sub28.anInt3440 ^ 0xffffffff) == -3) {
                        i_28_ = 1;
                    }

                    aStream_Sub1_936.method989(-1494101117, 167);
                    aStream_Sub1_936.method973((i_27_ +
                        ((i_29_ << -1805390380) - -(i_28_ << 731042931))),
                        i + -1629130328);
                }

                if ((Class43.anInt956 ^ 0xffffffff) < -1) {
                    Class43.anInt956--;
                }

                if (RSSocket.aBooleanArray484[96] ||
                        RSSocket.aBooleanArray484[97] ||
                        RSSocket.aBooleanArray484[98] ||
                        RSSocket.aBooleanArray484[99]) {
                    Class37_Sub9_Sub28.aBoolean3422 = true;
                }

                if (Class37_Sub9_Sub28.aBoolean3422 && (Class43.anInt956 <= 0)) {
                    Class14.anInt236++;
                    Class43.anInt956 = 20;
                    Class37_Sub9_Sub28.aBoolean3422 = false;
                    aStream_Sub1_936.method989(-1494101117, 169);
                    aStream_Sub1_936.method962(Class76.anInt1439, false);
                    aStream_Sub1_936.method962(Class37_Sub14.anInt2127,
                        false);
                }

                if ((Class78.aBoolean1464 == true) &&
                        (Class37_Sub20.aBoolean2217 == false)) {
                    Class37_Sub20.aBoolean2217 = true;
                    Class37_Sub9_Sub22.anInt3322++;
                    aStream_Sub1_936.method989(-1494101117, 34);
                    aStream_Sub1_936.method964(120, 1);
                }

                if ((Class78.aBoolean1464 == false) &&
                        (Class37_Sub20.aBoolean2217 != false)) {
                    Class37_Sub9_Sub22.anInt3322++;
                    Class37_Sub20.aBoolean2217 = false;
                    aStream_Sub1_936.method989(-1494101117, 34);
                    aStream_Sub1_936.method964(i + 119, 0);
                }

                Class37_Sub9_Sub27.method880(0);

                if ((Class32.anInt740 ^ 0xffffffff) == -31) {
                    Class71.method1264((byte) 74);
                    Class37_Sub9_Sub13.method812(1);
                    Class37_Sub9_Sub30.anInt3480++;

                    if ((Class37_Sub9_Sub30.anInt3480 ^ 0xffffffff) < -751) {
                        PacketParser.method843(false);
                    } else {
                        Class37_Sub9_Sub33.method905(i + -127);
                        Class37_Sub4_Sub7_Sub1_Sub2.method506(false);
                        Class37_Sub9_Sub12.method810(i ^ 0x1000);

                        if ((RSSocket.anInt490 ^ 0xffffffff) != -1) {
                            Class37_Sub9_Sub8.anInt3057 += 20;

                            if (Class37_Sub9_Sub8.anInt3057 >= 400) {
                                RSSocket.anInt490 = 0;
                            }
                        }

                        Class37_Sub9_Sub37.anInt3589++;

                        if (Class37_Sub4_Sub13.aClass18_2797 != null) {
                            anInt939++;

                            if (anInt939 >= 15) {
                                Class73.method1274((Class37_Sub4_Sub13.aClass18_2797),
                                    -1);
                                Class37_Sub4_Sub13.aClass18_2797 = null;
                            }
                        }

                        if (Class37_Sub25.aClass18_2285 != null) {
                            Class73.method1274(Class37_Sub25.aClass18_2285,
                                i + -1);
                            Class79.anInt1495++;

                            if ((((Stream.anInt2009 + 5) ^ 0xffffffff) > (Class37_Sub4_Sub7_Sub7.anInt3851 ^
                                    0xffffffff)) ||
                                    ((-5 + Stream.anInt2009) > Class37_Sub4_Sub7_Sub7.anInt3851) ||
                                    ((5 + Class37_Sub4_Sub12.anInt2784) < Class37_Sub9_Sub1.anInt2914) ||
                                    (((Class37_Sub4_Sub12.anInt2784 - 5) ^
                                    0xffffffff) < (Class37_Sub9_Sub1.anInt2914 ^
                                    0xffffffff))) {
                                Class77.aBoolean1454 = true;
                            }

                            if ((Class60.anInt1140 ^ 0xffffffff) == -1) {
                                if (Class77.aBoolean1454 &&
                                        (Class79.anInt1495 >= 5)) {
                                    if ((Class37_Sub4_Sub4.aClass18_2579 == Class37_Sub25.aClass18_2285) &&
                                            (Class37_Sub4_Sub7_Sub7.anInt3850 != Class37_Sub9.anInt1979)) {
                                        Class37_Sub14.anInt2124++;

                                        int i_30_ = 0;
                                        Class18 class18 = Class37_Sub25.aClass18_2285;

                                        if ((Class37_Sub4_Sub10.anInt2677 == 1) &&
                                                ((class18.anInt376 ^
                                                0xffffffff) == -207)) {
                                            i_30_ = 1;
                                        }

                                        if ((class18.anIntArray356[(Class37_Sub4_Sub7_Sub7.anInt3850)]) <= 0) {
                                            i_30_ = 0;
                                        }

                                        if (!method1078(-32,
                                                    (RuntimeException_Sub1.method1339(
                                                        class18, 25)))) {
                                            if ((i_30_ ^ 0xffffffff) == -2) {
                                                int i_31_ = Class37_Sub9.anInt1979;
                                                int i_32_ = (Class37_Sub4_Sub7_Sub7.anInt3850);

                                                while ((i_32_ ^ 0xffffffff) != (i_31_ ^
                                                        0xffffffff)) {
                                                    if (i_31_ > i_32_) {
                                                        class18.method193(i_31_,
                                                            (byte) 71,
                                                            -1 + i_31_);
                                                        i_31_--;
                                                    } else if ((i_32_ ^
                                                            0xffffffff) < (i_31_ ^
                                                            0xffffffff)) {
                                                        class18.method193(i_31_,
                                                            (byte) 76, 1 +
                                                            i_31_);
                                                        i_31_++;
                                                    }
                                                }
                                            } else {
                                                class18.method193(Class37_Sub9.anInt1979,
                                                    (byte) 41,
                                                    (Class37_Sub4_Sub7_Sub7.anInt3850));
                                            }
                                        } else {
                                            int i_33_ = (Class37_Sub4_Sub7_Sub7.anInt3850);
                                            int i_34_ = Class37_Sub9.anInt1979;

                                            class18.anIntArray356[i_33_] = class18.anIntArray356[i_34_];

                                            class18.anIntArray422[i_33_] = class18.anIntArray422[i_34_];
                                            class18.anIntArray356[i_34_] = -1;
                                            class18.anIntArray422[i_34_] = 0;
                                        }

                                        aStream_Sub1_936.method989(-1494101117,
                                            166);
                                        aStream_Sub1_936.method957(true,
                                            Class37_Sub4_Sub7_Sub7.anInt3850);
                                        aStream_Sub1_936.method946((byte) -85,
                                            i_30_);
                                        aStream_Sub1_936.method966(false,
                                            (Class37_Sub25.aClass18_2285.anInt402));
                                        aStream_Sub1_936.method962(Class37_Sub9.anInt1979,
                                            false);
                                    }
                                } else if ((((Class37_Sub2.anInt1825 ^
                                        0xffffffff) == -2) ||
                                        (Class88.method1331((Class37_Sub9_Sub13.anInt3134 -
                                            1), 2000))) &&
                                        (Class37_Sub9_Sub13.anInt3134 > 2)) {
                                    Class37_Sub9_Sub24.method868(116);
                                } else if ((Class37_Sub9_Sub13.anInt3134 ^
                                        0xffffffff) < -1) {
                                    Class37_Sub5.method738((byte) -87,
                                        (Class37_Sub9_Sub13.anInt3134) - 1);
                                }

                                Class37_Sub9_Sub28.anInt3440 = 0;
                                anInt939 = 10;
                                Class37_Sub25.aClass18_2285 = null;
                            }
                        }

                        Class39.anInt872 = i;
                        Class37_Sub4_Sub12.aClass18_2773 = null;
                        Class32.aBoolean746 = false;

                        Class18 class18 = aClass18_942;
                        Class18 class18_35_ = RSSocket.aClass18_491;
                        aClass18_942 = null;
                        Class24.aBoolean609 = false;
                        RSSocket.aClass18_491 = null;

                        for (;
                                Class46.method1106(0) &&
                                (Class39.anInt872 < 128); Class39.anInt872++) {
                            JString.anIntArray1659[Class39.anInt872] = Class37_Sub4_Sub3.anInt2560;

                            Class37_Sub9_Sub10.anIntArray3091[Class39.anInt872] = Class88.anInt1600;
                        }

                        Class1.method39(0, Class32.anInt733, 0, 0, 765, 0,
                            i ^ ~0x5b, 503);
                        Class83.anInt1515++;

                        for (;;) {
                            Class37_Sub8 class37_sub8 = ((Class37_Sub8) Class37_Sub9_Sub9.aClass58_3068.method1161((byte) -112));

                            if (class37_sub8 == null) {
                                break;
                            }

                            Class18 class18_36_ = class37_sub8.aClass18_1925;

                            if ((class18_36_.anInt334 ^ 0xffffffff) <= -1) {
                                Class18 class18_37_ = Class37_Sub9_Sub14.method820((class18_36_.anInt394),
                                        4096);

                                if ((class18_37_ == null) ||
                                        (class18_37_.aClass18Array450 == null) ||
                                        ((class18_37_.aClass18Array450.length ^
                                        0xffffffff) >= (class18_36_.anInt334 ^
                                        0xffffffff)) ||
                                        (class18_36_ != (class18_37_.aClass18Array450[class18_36_.anInt334]))) {
                                    continue;
                                }
                            }

                            Class43.method1092(class37_sub8, (byte) 104);
                        }

                        for (;;) {
                            Class37_Sub8 class37_sub8 = (Class37_Sub8) Class17.aClass58_300.method1161((byte) -127);

                            if (class37_sub8 == null) {
                                break;
                            }

                            Class18 class18_38_ = class37_sub8.aClass18_1925;

                            if ((class18_38_.anInt334 ^ 0xffffffff) <= -1) {
                                Class18 class18_39_ = Class37_Sub9_Sub14.method820((class18_38_.anInt394),
                                        4096);

                                if ((class18_39_ == null) ||
                                        (class18_39_.aClass18Array450 == null) ||
                                        (class18_39_.aClass18Array450.length <= class18_38_.anInt334) ||
                                        ((class18_39_.aClass18Array450[class18_38_.anInt334]) != class18_38_)) {
                                    continue;
                                }
                            }

                            Class43.method1092(class37_sub8, (byte) 121);
                        }

                        for (;;) {
                            Class37_Sub8 class37_sub8 = ((Class37_Sub8) Class37_Sub9_Sub20.aClass58_3296.method1161((byte) -94));

                            if (class37_sub8 == null) {
                                break;
                            }

                            Class18 class18_40_ = class37_sub8.aClass18_1925;

                            if (class18_40_.anInt334 >= 0) {
                                Class18 class18_41_ = Class37_Sub9_Sub14.method820((class18_40_.anInt394),
                                        4096);

                                if ((class18_41_ == null) ||
                                        (class18_41_.aClass18Array450 == null) ||
                                        (class18_41_.aClass18Array450.length <= class18_40_.anInt334) ||
                                        (class18_40_ != (class18_41_.aClass18Array450[class18_40_.anInt334]))) {
                                    continue;
                                }
                            }

                            Class43.method1092(class37_sub8, (byte) 58);
                        }

                        if (Class37_Sub7.aClass18_1894 != null) {
                            Class15.method116(i);
                        }

                        if (Class67.anInt1291 != -1) {
                            int i_42_ = Class67.anInt1291;
                            int i_43_ = Class67.anInt1279;
                            boolean bool = (Class37_Sub4.method434((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
                                    0, i_42_,
                                    (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
                                    true, 0, 0, 0, 0, i_43_, 0, 0));
                            Class67.anInt1291 = -1;

                            if (bool) {
                                Class37_Sub9_Sub8.anInt3057 = 0;
                                Applet_Sub1.anInt8 = Class33.anInt764;
                                RSSocket.anInt490 = 1;
                                Class27.anInt676 = Class37_Sub13.anInt2113;
                            }
                        }

                        Class37_Sub9.method753(i + -2);

                        if (aClass18_942 != class18) {
                            if (class18 != null) {
                                Class73.method1274(class18, -1);
                            }

                            if (aClass18_942 != null) {
                                Class73.method1274(aClass18_942, -1);
                            }
                        }

                        if ((class18_35_ != RSSocket.aClass18_491) &&
                                (Class65.anInt1241 == Class37_Sub9_Sub2.anInt2935)) {
                            if (class18_35_ != null) {
                                Class73.method1274(class18_35_, -1);
                            }

                            if (RSSocket.aClass18_491 != null) {
                                Class73.method1274(RSSocket.aClass18_491, -1);
                            }
                        }

                        if (RSSocket.aClass18_491 != null) {
                            if (Class65.anInt1241 > Class37_Sub9_Sub2.anInt2935) {
                                Class37_Sub9_Sub2.anInt2935++;

                                if ((Class37_Sub9_Sub2.anInt2935 ^ 0xffffffff) == (Class65.anInt1241 ^
                                        0xffffffff)) {
                                    Class73.method1274(RSSocket.aClass18_491, -1);
                                }
                            }
                        } else if ((Class37_Sub9_Sub2.anInt2935 ^ 0xffffffff) < -1) {
                            Class37_Sub9_Sub2.anInt2935--;
                        }

                        Applet_Sub1.method26(false);

                        if (Class37_Sub4_Sub12.aBoolean2775) {
                            Class73.method1273(-1);
                        }

                        for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > -6;
                                i_44_++)
                            Class58.anIntArray1126[i_44_]++;

                        int i_45_ = Class37_Sub9_Sub14.method821(255);
                        int i_46_ = Class20.method212(-79);

                        if (((i_45_ ^ 0xffffffff) < -4501) &&
                                ((i_46_ ^ 0xffffffff) < -4501)) {
                            ObjectDef.anInt2734 = 250;
                            Class43.anInt960++;
                            Class58.method1156(8, 4000);
                            aStream_Sub1_936.method989(-1494101117, 236);
                        }

                        Class37_Sub4_Sub7_Sub7.anInt3849++;
                        Class77.anInt1444++;

                        if (Class37_Sub4_Sub7_Sub7.anInt3849 > 500) {
                            Class37_Sub4_Sub7_Sub7.anInt3849 = 0;

                            int i_47_ = (int) (Math.random() * 8.0);

                            if (((i_47_ & 0x1) ^ 0xffffffff) == -2) {
                                Class37_Sub9_Sub9.anInt3077 += Class32_Sub1.anInt1789;
                            }

                            if ((i_47_ & 0x4) == 4) {
                                Class83.anInt1518 += Class85.anInt1557;
                            }

                            if (((i_47_ & 0x2) ^ 0xffffffff) == -3) {
                                Class37_Sub9_Sub23.anInt3358 += Class38.anInt837;
                            }
                        }

                        if ((Class83.anInt1518 ^ 0xffffffff) > 39) {
                            Class85.anInt1557 = 1;
                        }

                        if ((Class83.anInt1518 ^ 0xffffffff) < -41) {
                            Class85.anInt1557 = -1;
                        }

                        if ((Class37_Sub9_Sub9.anInt3077 ^ 0xffffffff) > 49) {
                            Class32_Sub1.anInt1789 = 2;
                        }

                        if (Class77.anInt1444 > 500) {
                            int i_48_ = (int) (8.0 * Math.random());
                            Class77.anInt1444 = 0;

                            if ((i_48_ & 0x2) == 2) {
                                Class78.anInt1458 += PacketParser.anInt3248;
                            }

                            if ((i_48_ & 0x1) == 1) {
                                Class37_Sub9_Sub37.anInt3590 += Class29.anInt695;
                            }
                        }

                        if ((Class37_Sub9_Sub23.anInt3358 ^ 0xffffffff) > 54) {
                            Class38.anInt837 = 2;
                        }

                        if (Class37_Sub9_Sub23.anInt3358 > 55) {
                            Class38.anInt837 = -2;
                        }

                        if (Class78.anInt1458 < -20) {
                            PacketParser.anInt3248 = 1;
                        }

                        Class25.anInt637++;

                        if (Class78.anInt1458 > 10) {
                            PacketParser.anInt3248 = -1;
                        }

                        if ((Class37_Sub9_Sub9.anInt3077 ^ 0xffffffff) < -51) {
                            Class32_Sub1.anInt1789 = -2;
                        }

                        if ((Class37_Sub9_Sub37.anInt3590 ^ 0xffffffff) > 59) {
                            Class29.anInt695 = 2;
                        }

                        if (Class37_Sub9_Sub37.anInt3590 > 60) {
                            Class29.anInt695 = -2;
                        }

                        if (Class25.anInt637 > 50) {
                            Class37_Sub16.anInt2153++;
                            aStream_Sub1_936.method989(-1494101117, 186);
                        }

                        do {
                            try {
                                if ((Applet_Sub1.aClass19_38 == null) ||
                                        (aStream_Sub1_936.currentIndex <= 0)) {
                                    break;
                                }

                                Applet_Sub1.aClass19_38.write(0, (byte) 97,
                                    aStream_Sub1_936.buffer,
                                    aStream_Sub1_936.currentIndex);
                                Class25.anInt637 = 0;
                                aStream_Sub1_936.currentIndex = 0;
                            } catch (IOException ioexception) {
                                PacketParser.method843(false);

                                break;
                            }

                            break;
                        } while (false);
                    }
                }
            }
        }
    }

    public void method1081(long l, int i) throws IOException {
        try {
            anInt930++;

            if (i == 0) {
                if ((l ^ 0xffffffffffffffffL) > -1L) {
                    throw new IOException("Invalid seek to " + l + " in file " +
                        method1087(86));
                }

                aLong943 = l;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("md.N(" + l + ',' + i + ')'));
        }
    }

    public void method1082(byte[] is, int i, int i_49_, int i_50_)
        throws IOException {
        anInt947++;

        try {
            if (i_49_ >= -95) {
                method1080(113);
            }

            if ((aLong940 ^ 0xffffffffffffffffL) > ((aLong943 - -(long) i_50_) ^
                    0xffffffffffffffffL)) {
                aLong940 = aLong943 + (long) i_50_;
            }

            if (((aLong913 ^ 0xffffffffffffffffL) != 0L) &&
                    ((aLong913 > aLong943) ||
                    (((long) anInt928 + aLong913) < aLong943))) {
                method1088(3994);
            }

            if (((aLong913 ^ 0xffffffffffffffffL) != 0L) &&
                    (((aLong943 - -(long) i_50_) ^ 0xffffffffffffffffL) < (((long) aByteArray926.length +
                    aLong913) ^ 0xffffffffffffffffL))) {
                int i_51_ = (int) ((long) aByteArray926.length -
                    (aLong943 - aLong913));
                i_50_ -= i_51_;
                Class53.method1135(is, i, aByteArray926,
                    (int) (aLong943 - aLong913), i_51_);
                aLong943 += (long) i_51_;
                i += i_51_;
                anInt928 = aByteArray926.length;
                method1088(3994);
            }

            if ((aByteArray926.length ^ 0xffffffff) > (i_50_ ^ 0xffffffff)) {
                if (aLong943 != aLong938) {
                    aClass70_927.method1254((byte) 17, aLong943);
                    aLong938 = aLong943;
                }

                aClass70_927.method1259(is, (byte) -91, i, i_50_);

                long l = -1L;

                if ((aLong943 < aLong929) ||
                        ((((long) anInt934 + aLong929) ^ 0xffffffffffffffffL) >= (aLong943 ^
                        0xffffffffffffffffL))) {
                    if ((aLong943 <= aLong929) &&
                            (((long) i_50_ + aLong943) > aLong929)) {
                        l = aLong929;
                    }
                } else {
                    l = aLong943;
                }

                aLong938 += (long) i_50_;

                long l_52_ = -1L;

                if ((((long) i_50_ + aLong943) > aLong929) &&
                        ((((long) anInt934 + aLong929) ^ 0xffffffffffffffffL) <= ((aLong943 +
                        (long) i_50_) ^ 0xffffffffffffffffL))) {
                    l_52_ = (long) i_50_ + aLong943;
                } else if ((((aLong929 - -(long) anInt934) ^
                        0xffffffffffffffffL) < (aLong943 ^ 0xffffffffffffffffL)) &&
                        ((aLong929 + (long) anInt934) <= (aLong943 +
                        (long) i_50_))) {
                    l_52_ = (long) anInt934 + aLong929;
                }

                if (aLong932 < aLong938) {
                    aLong932 = aLong938;
                }

                if (((l ^ 0xffffffffffffffffL) < 0L) && (l_52_ > l)) {
                    int i_53_ = (int) (-l + l_52_);
                    Class53.method1135(is, (int) (-aLong943 + ((long) i + l)),
                        aByteArray921, (int) (-aLong929 + l), i_53_);
                }

                aLong943 += (long) i_50_;
            } else if ((i_50_ ^ 0xffffffff) < -1) {
                if ((aLong913 ^ 0xffffffffffffffffL) == 0L) {
                    aLong913 = aLong943;
                }

                Class53.method1135(is, i, aByteArray926,
                    (int) (-aLong913 + aLong943), i_50_);
                aLong943 += (long) i_50_;

                if (((-aLong913 + aLong943) ^ 0xffffffffffffffffL) < ((long) anInt928 ^
                        0xffffffffffffffffL)) {
                    anInt928 = (int) (-aLong913 + aLong943);
                }
            }
        } catch (IOException ioexception) {
            aLong938 = -1L;
            throw ioexception;
        }
    }

    public long method1083(byte i) {
        if (i >= -48) {
            return 28L;
        }

        anInt918++;

        return aLong940;
    }

    public static int method1084(byte i, int i_54_) {
        int i_55_ = -126 % ((82 - i) / 34);
        anInt922++;

        return (i_54_ & 0xed883) >> 1755798193;
    }

    public void method1085(byte[] is, byte i) throws IOException {
        method1076(0, (byte) 99, is.length, is);

        if (i < 53) {
            aLong932 = -45L;
        }

        anInt924++;
    }

    public static void method1086(byte i) {
        aClass15_919 = null;
        aJString_920 = null;

        if (i != -120) {
            aJString_941 = null;
        }

        aClass18_942 = null;
        aClass37_Sub4_Sub9_Sub3_923 = null;
        aJString_917 = null;
        aJString_941 = null;
        aClass37_Sub4_Sub9_Sub1_925 = null;
        aStream_Sub1_936 = null;
        aJString_945 = null;
    }

    public File method1087(int i) {
        anInt946++;

        if (i < 63) {
            method1083((byte) 2);
        }

        return aClass70_927.method1258(0);
    }

    public void method1088(int i) throws IOException {
        anInt935++;

        if (i == 3994) {
            if (aLong913 != -1L) {
                if (aLong938 != aLong913) {
                    aClass70_927.method1254((byte) 17, aLong913);
                    aLong938 = aLong913;
                }

                aClass70_927.method1259(aByteArray926, (byte) -91, 0, anInt928);
                aLong938 += (long) anInt928;

                long l = -1L;
                long l_57_ = -1L;

                if (aLong932 < aLong938) {
                    aLong932 = aLong938;
                }

                if (((aLong929 ^ 0xffffffffffffffffL) <= ((aLong913 +
                        (long) anInt928) ^ 0xffffffffffffffffL)) ||
                        (((long) anInt928 + aLong913) > (aLong929 +
                        (long) anInt934))) {
                    if ((aLong913 < ((long) anInt934 + aLong929)) &&
                            ((aLong913 - -(long) anInt928) >= (aLong929 +
                            (long) anInt934))) {
                        l = (long) anInt934 + aLong929;
                    }
                } else {
                    l = aLong913 - -(long) anInt928;
                }

                if ((aLong913 < aLong929) ||
                        (aLong913 >= (aLong929 + (long) anInt934))) {
                    if (((aLong913 ^ 0xffffffffffffffffL) >= (aLong929 ^
                            0xffffffffffffffffL)) &&
                            ((aLong929 ^ 0xffffffffffffffffL) > (((long) anInt928 +
                            aLong913) ^ 0xffffffffffffffffL))) {
                        l_57_ = aLong929;
                    }
                } else {
                    l_57_ = aLong913;
                }

                if (((l_57_ ^ 0xffffffffffffffffL) < 0L) &&
                        ((l ^ 0xffffffffffffffffL) < (l_57_ ^
                        0xffffffffffffffffL))) {
                    int i_58_ = (int) (-l_57_ + l);
                    Class53.method1135(aByteArray926, (int) (l_57_ - aLong913),
                        aByteArray921, (int) (l_57_ + -aLong929), i_58_);
                }

                aLong913 = -1L;
                anInt928 = 0;
            }
        }
    }
}
