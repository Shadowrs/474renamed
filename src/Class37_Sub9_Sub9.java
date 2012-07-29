/* Class37_Sub9_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.io.IOException;


public class Class37_Sub9_Sub9 extends Class37_Sub9 {
    public static Class58 aClass58_3068;
    public static int anInt3070;
    public static int anInt3071;
    public static int anInt3072 = 0;
    public static int anInt3073;
    public static int anInt3074;
    public static int anInt3075;
    public static int anInt3077;
    public static int anInt3078;
    public static int anInt3079;
    public static int anInt3080 = 0;
    public static int[] anIntArray3081;

    static {
        anInt3077 = 0;
        aClass58_3068 = new Class58();
        anIntArray3081 = new int[] { -1, -1, 1, 1 };
    }

    public int anInt3069 = 4;
    public int anInt3076 = 4;

    public Class37_Sub9_Sub9() {
        super(1, false);
    }

    public static void method798(int i, byte i_0_) {
        int[] is = Class37_Sub9_Sub16.aClass37_Sub4_Sub9_Sub3_3202.anIntArray3904;
        anInt3075++;

        int i_1_ = is.length;
        int i_2_ = 0;

        if (i_0_ < 116) {
            anInt3080 = 126;
        }

        for (; (i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_2_++)
            is[i_2_] = 0;

        for (int i_3_ = 1; (i_3_ ^ 0xffffffff) > -104; i_3_++) {
            int i_4_ = (4 * (52736 - (i_3_ * 512))) + 24628;

            for (int i_5_ = 1; i_5_ < 103; i_5_++) {
                if ((0x18 & Class1.aByteArrayArrayArray63[i][i_5_][i_3_]) == 0) {
                    Class38.aClass67_847.method1216(is, i_4_, 512, i, i_5_, i_3_);
                }

                if (((i ^ 0xffffffff) > -4) &&
                        ((0x8 &
                        Class1.aByteArrayArrayArray63[1 + i][i_5_][i_3_]) != 0)) {
                    Class38.aClass67_847.method1216(is, i_4_, 512, i - -1,
                        i_5_, i_3_);
                }

                i_4_ += 4;
            }
        }

        int i_6_ = (((228 - -(int) (Math.random() * 20.0)) << 1132772104) +
            ((((int) (Math.random() * 20.0) + 238 + -10) << 817651088) -
            -(int) (Math.random() * 20.0) - -238 - 10));
        Class37_Sub9_Sub16.aClass37_Sub4_Sub9_Sub3_3202.method641();

        int i_7_ = (-10 + ((int) (20.0 * Math.random()) + 238)) << 47514704;

        for (int i_8_ = 1; (i_8_ ^ 0xffffffff) > -104; i_8_++) {
            for (int i_9_ = 1; (i_9_ ^ 0xffffffff) > -104; i_9_++) {
                if (((Class1.aByteArrayArrayArray63[i][i_9_][i_8_] & 0x18) ^
                        0xffffffff) == -1) {
                    Class79.method1296(i_6_, i_7_, i_8_, i_9_, i, 8950);
                }

                if ((i < 3) &&
                        (((Class1.aByteArrayArrayArray63[1 + i][i_9_][i_8_] &
                        0x8) ^ 0xffffffff) != -1)) {
                    Class79.method1296(i_6_, i_7_, i_8_, i_9_, 1 + i, 8950);
                }
            }
        }

        Stream.anInt2032 = 0;

        for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -105; i_10_++) {
            for (int i_11_ = 0; i_11_ < 104; i_11_++) {
                int i_12_ = Class38.aClass67_847.method1199((Class37_Sub9_Sub1.anInt2916),
                        i_10_, i_11_);

                if (i_12_ != 0) {
                    i_12_ = (i_12_ & 0x1fffd3bc) >> 429346862;

                    int i_13_ = Class37_Sub9_Sub8.method794(i_12_, 28067).anInt2699;

                    if (i_13_ >= 0) {
                        int i_14_ = i_11_;
                        int i_15_ = i_10_;

                        if ((i_13_ != 22) && ((i_13_ ^ 0xffffffff) != -30) &&
                                ((i_13_ ^ 0xffffffff) != -35) &&
                                ((i_13_ ^ 0xffffffff) != -37) && (i_13_ != 46) &&
                                ((i_13_ ^ 0xffffffff) != -48) &&
                                ((i_13_ ^ 0xffffffff) != -49)) {
                            int[][] is_16_ = (Class68.aClass20Array1322[Class37_Sub9_Sub1.anInt2916].anIntArrayArray554);

                            for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -11;
                                    i_17_++) {
                                int i_18_ = (int) (4.0 * Math.random());

                                if (((i_18_ ^ 0xffffffff) == -1) &&
                                        (i_15_ > 0) && (i_15_ > (i_10_ - 3)) &&
                                        (((0x12c0108 &
                                        is_16_[-1 + i_15_][i_14_]) ^
                                        0xffffffff) == -1)) {
                                    i_15_--;
                                }

                                if ((i_18_ == 1) && (i_15_ < 103) &&
                                        ((3 + i_10_) > i_15_) &&
                                        ((is_16_[1 + i_15_][i_14_] & 0x12c0180) == 0)) {
                                    i_15_++;
                                }

                                if (((i_18_ ^ 0xffffffff) == -3) &&
                                        ((i_14_ ^ 0xffffffff) < -1) &&
                                        (((-3 + i_11_) ^ 0xffffffff) > (i_14_ ^
                                        0xffffffff)) &&
                                        ((0x12c0102 &
                                        is_16_[i_15_][-1 + i_14_]) == 0)) {
                                    i_14_--;
                                }

                                if (((i_18_ ^ 0xffffffff) == -4) &&
                                        ((i_14_ ^ 0xffffffff) > -104) &&
                                        ((i_11_ - -3) > i_14_) &&
                                        (((is_16_[i_15_][i_14_ - -1] &
                                        0x12c0120) ^ 0xffffffff) == -1)) {
                                    i_14_++;
                                }
                            }
                        }

                        Class22.aClass37_Sub4_Sub9_Sub3Array588[(Stream.anInt2032)] = (Class37_Sub9_Sub22.aClass37_Sub4_Sub9_Sub3Array3329[i_13_]);

                        Class77.anIntArray1440[Stream.anInt2032] = i_15_;

                        Class37_Sub9_Sub33.anIntArray3518[(Stream.anInt2032)] = i_14_;
                        Stream.anInt2032++;
                    }
                }
            }
        }

        Class21.aClass32_568.method291((byte) -10);
    }

    public int[] method761(int i, int i_19_) {
        anInt3073++;

        int[] is = aClass38_1966.method1049(i_19_, true);

        if (aClass38_1966.aBoolean850) {
            int i_20_ = Class37_Sub14.anInt2121 / anInt3069;
            int i_21_ = i_19_ % i_20_;
            int[] is_22_ = this.method760((i_21_ * Class37_Sub14.anInt2121) / i_20_,
                    0, -110);

            for (int i_23_ = 0;
                    (Class32.anInt743 ^ 0xffffffff) < (i_23_ ^ 0xffffffff);
                    i_23_++) {
                int i_24_ = Class32.anInt743 / anInt3076;
                int i_25_ = i_23_ % i_24_;
                is[i_23_] = is_22_[(Class32.anInt743 * i_25_) / i_24_];
            }
        }

        if (i >= -125) {
            return null;
        }

        return is;
    }

    public int[][] method759(byte i, int i_26_) {
        anInt3074++;

        if (i < 111) {
            anInt3069 = 16;
        }

        int[][] is = aClass33_1946.method298(false, i_26_);

        if (aClass33_1946.aBoolean767) {
            int i_27_ = Class37_Sub14.anInt2121 / anInt3069;
            int i_28_ = i_26_ % i_27_;
            int[][] is_29_ = this.method762(0,
                    (Class37_Sub14.anInt2121 * i_28_) / i_27_, (byte) -122);
            int[] is_30_ = is_29_[1];
            int[] is_31_ = is[0];
            int[] is_32_ = is_29_[0];
            int[] is_33_ = is_29_[2];
            int[] is_34_ = is[1];
            int[] is_35_ = is[2];

            for (int i_36_ = 0;
                    (Class32.anInt743 ^ 0xffffffff) < (i_36_ ^ 0xffffffff);
                    i_36_++) {
                int i_37_ = Class32.anInt743 / anInt3076;
                int i_38_ = i_36_ % i_37_;
                int i_39_ = (Class32.anInt743 * i_38_) / i_37_;
                is_31_[i_36_] = is_32_[i_39_];
                is_34_[i_36_] = is_30_[i_39_];
                is_35_[i_36_] = is_33_[i_39_];
            }
        }

        return is;
    }

    public void method750(Stream stream, int i, boolean bool) {
        int i_40_ = i;

        do {
            if ((i_40_ ^ 0xffffffff) != -1) {
                if (i_40_ != 1) {
                    break;
                }
            } else {
                anInt3076 = stream.readByte(120);

                break;
            }

            anInt3069 = stream.readByte(117);
        } while (false);

        anInt3079++;

        if (bool != true) {
            aClass58_3068 = null;
        }
    }

    public static void method799(int i) {
        anInt3071++;
        Class37_Sub9_Sub13.anInt3134 = 0;
        Class37_Sub9_Sub27.anInt3418 = -1;
        Class37_Sub9_Sub17.packetId = -1;
        Class37_Sub16.anInt2151 = -1;

        if (i == 5030) {
            Class45.anInt977 = -1;
            Class37_Sub9_Sub16.anInt3201 = 0;
            Class37_Sub4.packetSize = 0;
            Class37_Sub9_Sub30.anInt3480 = 0;
            Class42.aStream_Sub1_936.bufferLocation = 0;
            Class83.packetStream.bufferLocation = 0;
            Class37_Sub9_Sub36.anInt3584 = 0;
            Class37_Sub20.aBoolean2220 = false;
            Class79.anInt1474 = 0;

            for (int i_41_ = 0;
                    i_41_ < Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414.length;
                    i_41_++) {
                if (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_41_] != null) {
                    Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_41_].anInt3653 = -1;
                }
            }

            for (int i_42_ = 0;
                    ((Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111.length ^
                    0xffffffff) < (i_42_ ^ 0xffffffff)); i_42_++) {
                if (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_42_] != null) {
                    Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_42_].anInt3653 = -1;
                }
            }

            Class87.method1328(true);
            Class37_Sub4_Sub3.method461(30, i ^ 0x7ebd);

            for (int i_43_ = 0; i_43_ < 100; i_43_++)
                Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_43_] = true;
        }
    }

    public static void method800(int i) {
        anInt3070++;

        try {
            if (Class37_Sub9.aClass22_1954 != null) {
                byte[] is = Class37_Sub9.aClass22_1954.method231(i + -4593);

                if (is != null) {
                    Stream stream = new Stream(is);

                    Class37_Sub14.anInt2129 = stream.readShort(i +
                            -4535);

                    Class37_Sub8.aClass56Array1933 = new Class56[Class37_Sub14.anInt2129];

                    for (int i_44_ = 0;
                            ((i_44_ ^ 0xffffffff) > (Class37_Sub14.anInt2129 ^
                            0xffffffff)); i_44_++) {
                        Class56 class56 = (Class37_Sub8.aClass56Array1933[i_44_] = new Class56());
                        int i_45_ = stream.readShort(-120);
                        class56.aBoolean1082 = (i_45_ & 0x8000) != 0;
                        class56.anInt1089 = 0x7fff & i_45_;

                        class56.aJString_1081 = stream.readString();

                        class56.anInt1093 = stream.readSignedShort((byte) 122);
                        class56.anInt1086 = i_44_;

                        class56.anInt1090 = Class36.method316(i ^ 0x11f5,
                                class56.aJString_1081);
                    }

                    Class37_Sub20.method1021(Class37_Sub12.anIntArray2097, 0,
                        Class87.anIntArray1587, 0,
                        (Class37_Sub8.aClass56Array1933).length + -1,
                        Class37_Sub8.aClass56Array1933);
                    Class37_Sub9.aClass22_1954 = null;
                    Class37_Sub4_Sub13.aBoolean2799 = true;
                }
            } else {
                Class37_Sub9.aClass22_1954 = new Class22(Class80.aClass51_1508,
                        Class37_Sub9_Sub27.method881(-57,
                            (new JString[] {
                                Class41.aJString_910,
                                Class37_Sub9_Sub8.aJString_3056,
                                Class37_Sub6.aJString_1887
                            })).method178((byte) -107));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            Class37_Sub9.aClass22_1954 = null;
        }

        if (i != 4594) {
            anInt3077 = 46;
        }
    }

    public static void method801(byte i) {
        aClass58_3068 = null;

        if (i <= 56) {
            anInt3072 = -87;
        }

        anIntArray3081 = null;
    }

    public static boolean method802(int i) {
        if (i != 25075) {
            anInt3077 = 120;
        }

        anInt3078++;

        long l = Class71.method1263((byte) -80);
        int i_46_ = (int) (-Class60.aLong1144 + l);
        Class60.aLong1144 = l;

        if ((i_46_ ^ 0xffffffff) < -201) {
            i_46_ = 200;
        }

        Class59.anInt1129 += i_46_;

        if (((Class45.anInt974 ^ 0xffffffff) == -1) &&
                (Class37_Sub9_Sub12.anInt3121 == 0) &&
                ((Class37_Sub9_Sub26.anInt3396 ^ 0xffffffff) == -1) &&
                (Class37_Sub4_Sub7_Sub1_Sub1.anInt3953 == 0)) {
            return true;
        }

        if (Class43.aClass19_950 == null) {
            return false;
        }

        try {
            if (Class59.anInt1129 > 30000) {
                throw new IOException();
            }

            for (; Class37_Sub9_Sub12.anInt3121 < 20;
                    Class37_Sub9_Sub12.anInt3121++) {
                if ((Class37_Sub4_Sub7_Sub1_Sub1.anInt3953 ^ 0xffffffff) >= -1) {
                    break;
                }

                Class37_Sub4_Sub13 class37_sub4_sub13 = (Class37_Sub4_Sub13) Class6.aClass13_139.method94(127);
                Stream stream = new Stream(4);
                stream.writeSignedByte(i ^ 0x619f, 1);
                stream.write3Bytes((int) class37_sub4_sub13.aLong818, -114);
                Class43.aClass19_950.write(0, (byte) 115,
                    stream.buffer, 4);
                Class17.aClass13_316.method101(class37_sub4_sub13, false,
                    class37_sub4_sub13.aLong818);
                Class37_Sub4_Sub7_Sub1_Sub1.anInt3953--;
            }

            for (;
                    (((Class45.anInt974 ^ 0xffffffff) > -21) &&
                    (Class37_Sub9_Sub26.anInt3396 > 0)); Class45.anInt974++) {
                Class37_Sub4_Sub13 class37_sub4_sub13 = ((Class37_Sub4_Sub13) Class4.aClass77_92.method1291((byte) 108));
                Stream stream = new Stream(4);
                stream.writeSignedByte(100, 0);
                stream.write3Bytes((int) class37_sub4_sub13.aLong818, -121);
                Class43.aClass19_950.write(0, (byte) 110,
                    stream.buffer, 4);
                class37_sub4_sub13.method438(false);
                Class37_Sub9_Sub20.aClass13_3297.method101(class37_sub4_sub13,
                    false, (class37_sub4_sub13.aLong818));
                Class37_Sub9_Sub26.anInt3396--;
            }

            for (int i_47_ = 0; (i_47_ ^ 0xffffffff) > -101; i_47_++) {
                int i_48_ = Class43.aClass19_950.available(-116);

                if ((i_48_ ^ 0xffffffff) > -1) {
                    throw new IOException();
                }

                if (i_48_ == 0) {
                    break;
                }

                int i_49_ = 0;
                Class59.anInt1129 = 0;

                if (Class60.aClass37_Sub4_Sub13_1152 != null) {
                    if ((Class37_Sub9.anInt1956 ^ 0xffffffff) == -1) {
                        i_49_ = 1;
                    }
                } else {
                    i_49_ = 8;
                }

                if (i_49_ <= 0) {
                    int i_50_ = -Class37_Sub9.anInt1956 + 512;
                    int i_51_ = (-Class60.aClass37_Sub4_Sub13_1152.aByte2788 +
                        (Class49.aStream_1006.buffer).length);

                    if (i_50_ > (i_51_ - Class49.aStream_1006.bufferLocation)) {
                        i_50_ = i_51_ + -Class49.aStream_1006.bufferLocation;
                    }

                    if (i_48_ < i_50_) {
                        i_50_ = i_48_;
                    }

                    Class43.aClass19_950.read(i_50_,
                        Class49.aStream_1006.bufferLocation, 122,
                        Class49.aStream_1006.buffer);

                    if (Class75.aByte1409 != 0) {
                        for (int i_52_ = 0;
                                (i_50_ ^ 0xffffffff) < (i_52_ ^ 0xffffffff);
                                i_52_++)
                            Class49.aStream_1006.buffer[i_52_ +
                            Class49.aStream_1006.bufferLocation] = (byte) (Class37_Sub4_Sub7_Sub1_Sub1.method502((Class49.aStream_1006.buffer[i_52_ +
                                    (Class49.aStream_1006.bufferLocation)]),
                                    Class75.aByte1409));
                    }

                    Class49.aStream_1006.bufferLocation += i_50_;
                    Class37_Sub9.anInt1956 += i_50_;

                    if ((i_51_ ^ 0xffffffff) == (Class49.aStream_1006.bufferLocation ^
                            0xffffffff)) {
                        if ((Class60.aClass37_Sub4_Sub13_1152.aLong818 ^
                                0xffffffffffffffffL) == -16711936L) {
                            Class37_Sub9_Sub27.aStream_3399 = Class49.aStream_1006;

                            for (int i_53_ = 0; i_53_ < 256; i_53_++) {
                                Class15_Sub1 class15_sub1 = (Class37_Sub4_Sub5.aClass15_Sub1Array2597[i_53_]);

                                if (class15_sub1 != null) {
                                    Class37_Sub9_Sub27.aStream_3399.bufferLocation = 5 +
                                        (i_53_ * 8);

                                    int i_54_ = Class37_Sub9_Sub27.aStream_3399.readInt(i +
                                            -25190);
                                    int i_55_ = Class37_Sub9_Sub27.aStream_3399.readInt(-23);
                                    class15_sub1.method139((byte) -122, i_54_,
                                        i_55_);
                                }
                            }
                        } else {
                            Class37_Sub4_Sub5.aCRC32_2599.reset();
                            Class37_Sub4_Sub5.aCRC32_2599.update(Class49.aStream_1006.buffer,
                                0, i_51_);

                            int i_56_ = (int) Class37_Sub4_Sub5.aCRC32_2599.getValue();

                            if (i_56_ != (Class60.aClass37_Sub4_Sub13_1152.anInt2790)) {
                                try {
                                    Class43.aClass19_950.killThread((byte) -128);
                                } catch (Exception exception) {
                                    /* empty */
                                }

                                Class75.aByte1409 = (byte) (int) (1.0 +
                                    (Math.random() * 255.0));
                                Class37_Sub25.anInt2290++;
                                Class43.aClass19_950 = null;

                                return false;
                            }

                            Class37_Sub25.anInt2290 = 0;
                            Class37_Sub4_Sub12.anInt2785 = 0;
                            Class60.aClass37_Sub4_Sub13_1152.aClass15_Sub1_2801.method137((int) (0xffffL &
                                (Class60.aClass37_Sub4_Sub13_1152.aLong818)),
                                (byte) 97,
                                Class49.aStream_1006.buffer,
                                ((0xff0000L &
                                Class60.aClass37_Sub4_Sub13_1152.aLong818) == 16711680L),
                                RSSocket.aBoolean474);
                        }

                        Class60.aClass37_Sub4_Sub13_1152.method322(false);

                        if (RSSocket.aBoolean474) {
                            Class37_Sub9_Sub12.anInt3121--;
                        } else {
                            Class45.anInt974--;
                        }

                        Class60.aClass37_Sub4_Sub13_1152 = null;
                        Class49.aStream_1006 = null;
                        Class37_Sub9.anInt1956 = 0;
                    } else {
                        if (Class37_Sub9.anInt1956 != 512) {
                            break;
                        }

                        Class37_Sub9.anInt1956 = 0;
                    }
                } else {
                    int i_57_ = i_49_ +
                        -(Class37_Sub9_Sub17.aStream_3224.bufferLocation);

                    if (i_57_ > i_48_) {
                        i_57_ = i_48_;
                    }

                    Class43.aClass19_950.read(i_57_,
                        (Class37_Sub9_Sub17.aStream_3224.bufferLocation),
                        122,
                        (Class37_Sub9_Sub17.aStream_3224.buffer));

                    if ((Class75.aByte1409 ^ 0xffffffff) != -1) {
                        for (int i_58_ = 0;
                                (i_57_ ^ 0xffffffff) < (i_58_ ^ 0xffffffff);
                                i_58_++)
                            Class37_Sub9_Sub17.aStream_3224.buffer[i_58_ +
                            (Class37_Sub9_Sub17.aStream_3224.bufferLocation)] = (byte) (Class37_Sub4_Sub7_Sub1_Sub1.method502((Class37_Sub9_Sub17.aStream_3224.buffer[i_58_ +
                                    (Class37_Sub9_Sub17.aStream_3224.bufferLocation)]),
                                    Class75.aByte1409));
                    }

                    Class37_Sub9_Sub17.aStream_3224.bufferLocation += i_57_;

                    if ((i_49_ ^ 0xffffffff) < (Class37_Sub9_Sub17.aStream_3224.bufferLocation ^
                            0xffffffff)) {
                        break;
                    }

                    if (Class60.aClass37_Sub4_Sub13_1152 == null) {
                        Class37_Sub9_Sub17.aStream_3224.bufferLocation = 0;

                        int i_59_ = Class37_Sub9_Sub17.aStream_3224.readByte(122);
                        int i_60_ = Class37_Sub9_Sub17.aStream_3224.readShort(111);
                        int i_61_ = Class37_Sub9_Sub17.aStream_3224.readByte(i ^
                                0x6187);
                        long l_62_ = (long) ((i_59_ << 1962296592) + i_60_);
                        int i_63_ = Class37_Sub9_Sub17.aStream_3224.readInt(-57);
                        Class37_Sub4_Sub13 class37_sub4_sub13 = ((Class37_Sub4_Sub13) Class17.aClass13_316.method100((byte) 52,
                                l_62_));
                        RSSocket.aBoolean474 = true;

                        if (class37_sub4_sub13 == null) {
                            class37_sub4_sub13 = ((Class37_Sub4_Sub13) Class37_Sub9_Sub20.aClass13_3297.method100((byte) 108,
                                    l_62_));
                            RSSocket.aBoolean474 = false;
                        }

                        if (class37_sub4_sub13 == null) {
                            throw new IOException();
                        }

                        Class60.aClass37_Sub4_Sub13_1152 = class37_sub4_sub13;

                        int i_64_ = ((i_61_ ^ 0xffffffff) != -1) ? 9 : 5;

                        Class49.aStream_1006 = new Stream((Class60.aClass37_Sub4_Sub13_1152.aByte2788) +
                                (i_63_ - -i_64_));
                        Class49.aStream_1006.writeSignedByte(i ^ 0x6193, i_61_);
                        Class49.aStream_1006.writeInt(i_63_);
                        Class37_Sub9.anInt1956 = 8;
                        Class37_Sub9_Sub17.aStream_3224.bufferLocation = 0;
                    } else if (Class37_Sub9.anInt1956 == 0) {
                        if ((Class37_Sub9_Sub17.aStream_3224.buffer[0]) == -1) {
                            Class37_Sub9_Sub17.aStream_3224.bufferLocation = 0;
                            Class37_Sub9.anInt1956 = 1;
                        } else {
                            Class60.aClass37_Sub4_Sub13_1152 = null;
                        }
                    }
                }
            }

            return true;
        } catch (IOException ioexception) {
            try {
                Class43.aClass19_950.killThread((byte) -128);
            } catch (Exception exception) {
                /* empty */
            }

            Class43.aClass19_950 = null;
            Class37_Sub4_Sub12.anInt2785++;

            return false;
        }
    }
}
