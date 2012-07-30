/* Class37_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub19 extends Class37 {
    public byte[] aByteArray2202;
    public Class13 aClass13_2203;

    public Class37_Sub19(Stream stream) {
        stream.bufferLocation = stream.buffer.length - 3;

        int i = stream.readByte(127);
        int i_16_ = stream.readShort();
        int i_17_ = 14 + (i * 10);
        stream.bufferLocation = 0;

        int i_18_ = 0;
        int i_19_ = 0;
        int i_20_ = 0;
        int i_21_ = 0;
        int i_22_ = 0;
        int i_23_ = 0;
        int i_24_ = 0;
        int i_25_ = 0;
while_87_: 
        for (int i_26_ = 0; i_26_ < i; i_26_++) {
            int i_27_ = -1;

            for (;;) {
                int i_28_ = stream.readByte(122);

                if (i_28_ != i_27_) {
                    i_17_++;
                }

                i_27_ = i_28_ & 0xf;

                if (i_28_ == 7) {
                    continue while_87_;
                }

                if (i_28_ == 23) {
                    i_18_++;
                } else if (i_27_ == 0) {
                    i_20_++;
                } else if (i_27_ == 1) {
                    i_21_++;
                } else if (i_27_ == 2) {
                    i_19_++;
                } else if (i_27_ == 3) {
                    i_22_++;
                } else if (i_27_ == 4) {
                    i_23_++;
                } else if (i_27_ == 5) {
                    i_24_++;
                } else {
                    if (i_27_ != 6) {
                        break;
                    }

                    i_25_++;
                }
            }

            throw new RuntimeException();
        }

        i_17_ += (5 * i_18_);
        i_17_ += (2 * (i_20_ + i_21_ + i_19_ + i_22_ + i_24_));
        i_17_ += (i_23_ + i_25_);

        int i_29_ = stream.bufferLocation;
        int i_30_ = (i + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_ + i_24_ +
            i_25_);

        for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
            stream.method974((byte) -90);

        i_17_ += (stream.bufferLocation - i_29_);

        int i_32_ = stream.bufferLocation;
        int i_33_ = 0;
        int i_34_ = 0;
        int i_35_ = 0;
        int i_36_ = 0;
        int i_37_ = 0;
        int i_38_ = 0;
        int i_39_ = 0;
        int i_40_ = 0;
        int i_41_ = 0;
        int i_42_ = 0;
        int i_43_ = 0;
        int i_44_ = 0;
        int i_45_ = 0;

        for (int i_46_ = 0; i_46_ < i_19_; i_46_++) {
            i_45_ = (i_45_ + stream.readByte(120)) & 0x7f;

            if ((i_45_ == 0) || (i_45_ == 32)) {
                i_25_++;
            } else if (i_45_ == 1) {
                i_33_++;
            } else if (i_45_ == 33) {
                i_34_++;
            } else if (i_45_ == 7) {
                i_35_++;
            } else if (i_45_ == 39) {
                i_36_++;
            } else if (i_45_ == 10) {
                i_37_++;
            } else if (i_45_ == 42) {
                i_38_++;
            } else if (i_45_ == 99) {
                i_39_++;
            } else if (i_45_ == 98) {
                i_40_++;
            } else if (i_45_ == 101) {
                i_41_++;
            } else if (i_45_ == 100) {
                i_42_++;
            } else if ((i_45_ == 64) || (i_45_ == 65) || (i_45_ == 120) ||
                    (i_45_ == 121) || (i_45_ == 123)) {
                i_43_++;
            } else {
                i_44_++;
            }
        }

        int i_47_ = 0;
        int i_48_ = stream.bufferLocation;
        stream.bufferLocation += i_43_;

        int i_49_ = stream.bufferLocation;
        stream.bufferLocation += i_24_;

        int i_50_ = stream.bufferLocation;
        stream.bufferLocation += i_23_;

        int i_51_ = stream.bufferLocation;
        stream.bufferLocation += i_22_;

        int i_52_ = stream.bufferLocation;
        stream.bufferLocation += i_33_;

        int i_53_ = stream.bufferLocation;
        stream.bufferLocation += i_35_;

        int i_54_ = stream.bufferLocation;
        stream.bufferLocation += i_37_;

        int i_55_ = stream.bufferLocation;
        stream.bufferLocation += (i_20_ + i_21_ + i_24_);

        int i_56_ = stream.bufferLocation;
        stream.bufferLocation += i_20_;

        int i_57_ = stream.bufferLocation;
        stream.bufferLocation += i_44_;

        int i_58_ = stream.bufferLocation;
        stream.bufferLocation += i_21_;

        int i_59_ = stream.bufferLocation;
        stream.bufferLocation += i_34_;

        int i_60_ = stream.bufferLocation;
        stream.bufferLocation += i_36_;

        int i_61_ = stream.bufferLocation;
        stream.bufferLocation += i_38_;

        int i_62_ = stream.bufferLocation;
        stream.bufferLocation += i_25_;

        int i_63_ = stream.bufferLocation;
        stream.bufferLocation += i_22_;

        int i_64_ = stream.bufferLocation;
        stream.bufferLocation += i_39_;

        int i_65_ = stream.bufferLocation;
        stream.bufferLocation += i_40_;

        int i_66_ = stream.bufferLocation;
        stream.bufferLocation += i_41_;

        int i_67_ = stream.bufferLocation;
        stream.bufferLocation += i_42_;

        int i_68_ = stream.bufferLocation;
        stream.bufferLocation += (i_18_ * 3);
        aByteArray2202 = new byte[i_17_];

        Stream stream_69_ = new Stream(aByteArray2202);
        stream_69_.writeInt(1297377380);
        stream_69_.writeInt(6);
        stream_69_.writeShort(848881960, (i > 1) ? 1 : 0);
        stream_69_.writeShort(848881960, i);
        stream_69_.writeShort(848881960, i_16_);
        stream.bufferLocation = i_29_;

        int i_70_ = 0;
        int i_71_ = 0;
        int i_72_ = 0;
        int i_73_ = 0;
        int i_74_ = 0;
        int i_75_ = 0;
        int i_76_ = 0;
        int[] is = new int[128];
        i_45_ = 0;

        for (int i_77_ = 0; i_77_ < i; i_77_++) {
            stream_69_.writeInt(1297379947);
            stream_69_.bufferLocation += 4;

            int i_78_ = stream_69_.bufferLocation;
            int i_79_ = -1;
while_88_: 
            do {
                for (;;) {
                    int i_80_ = stream.method974((byte) -118);
                    stream_69_.method976(i_80_, (byte) 16);

                    int i_81_ = stream.buffer[i_47_++] & 0xff;
                    boolean bool = i_81_ != i_79_;
                    i_79_ = i_81_ & 0xf;

                    if (i_81_ == 7) {
                        if (bool) {
                            stream_69_.writeByte(255);
                        }

                        stream_69_.writeByte(47);
                        stream_69_.writeByte(0);

                        break while_88_;
                    }

                    if (i_81_ == 23) {
                        if (bool) {
                            stream_69_.writeByte(255);
                        }

                        stream_69_.writeByte(81);
                        stream_69_.writeByte(3);
                        stream_69_.writeByte((stream.buffer[i_68_++]));
                        stream_69_.writeByte((stream.buffer[i_68_++]));
                        stream_69_.writeByte((stream.buffer[i_68_++]));
                    } else {
                        i_70_ ^= (i_81_ >> 4);

                        if (i_79_ == 0) {
                            if (bool) {
                                stream_69_.writeByte(144 + i_70_);
                            }

                            i_71_ += stream.buffer[i_55_++];
                            i_72_ += stream.buffer[i_56_++];
                            stream_69_.writeByte(i_71_ & 0x7f);
                            stream_69_.writeByte(i_72_ & 0x7f);
                        } else if (i_79_ == 1) {
                            if (bool) {
                                stream_69_.writeByte(128 + i_70_);
                            }

                            i_71_ += stream.buffer[i_55_++];
                            i_73_ += stream.buffer[i_58_++];
                            stream_69_.writeByte(i_71_ & 0x7f);
                            stream_69_.writeByte(i_73_ & 0x7f);
                        } else if (i_79_ == 2) {
                            if (bool) {
                                stream_69_.writeByte(176 + i_70_);
                            }

                            i_45_ = (i_45_ +
                                (stream.buffer[i_32_++])) &
                                0x7f;
                            stream_69_.writeByte(i_45_);

                            int i_82_;

                            if ((i_45_ == 0) || (i_45_ == 32)) {
                                i_82_ = stream.buffer[i_62_++];
                            } else if (i_45_ == 1) {
                                i_82_ = stream.buffer[i_52_++];
                            } else if (i_45_ == 33) {
                                i_82_ = stream.buffer[i_59_++];
                            } else if (i_45_ == 7) {
                                i_82_ = stream.buffer[i_53_++];
                            } else if (i_45_ == 39) {
                                i_82_ = stream.buffer[i_60_++];
                            } else if (i_45_ == 10) {
                                i_82_ = stream.buffer[i_54_++];
                            } else if (i_45_ == 42) {
                                i_82_ = stream.buffer[i_61_++];
                            } else if (i_45_ == 99) {
                                i_82_ = stream.buffer[i_64_++];
                            } else if (i_45_ == 98) {
                                i_82_ = stream.buffer[i_65_++];
                            } else if (i_45_ == 101) {
                                i_82_ = stream.buffer[i_66_++];
                            } else if (i_45_ == 100) {
                                i_82_ = stream.buffer[i_67_++];
                            } else if ((i_45_ == 64) || (i_45_ == 65) ||
                                    (i_45_ == 120) || (i_45_ == 121) ||
                                    (i_45_ == 123)) {
                                i_82_ = stream.buffer[i_48_++];
                            } else {
                                i_82_ = stream.buffer[i_57_++];
                            }

                            i_82_ += is[i_45_];
                            is[i_45_] = i_82_;
                            stream_69_.writeByte(i_82_ & 0x7f);
                        } else if (i_79_ == 3) {
                            if (bool) {
                                stream_69_.writeByte(224 + i_70_);
                            }

                            i_74_ += stream.buffer[i_63_++];

                            i_74_ += (stream.buffer[i_51_++] << 7);
                            stream_69_.writeByte(i_74_ & 0x7f);
                            stream_69_.writeByte((i_74_ >> 7) &
                                0x7f);
                        } else if (i_79_ == 4) {
                            if (bool) {
                                stream_69_.writeByte(208 + i_70_);
                            }

                            i_75_ += stream.buffer[i_50_++];
                            stream_69_.writeByte(i_75_ & 0x7f);
                        } else if (i_79_ == 5) {
                            if (bool) {
                                stream_69_.writeByte(160 + i_70_);
                            }

                            i_71_ += stream.buffer[i_55_++];
                            i_76_ += stream.buffer[i_49_++];
                            stream_69_.writeByte(i_71_ & 0x7f);
                            stream_69_.writeByte(i_76_ & 0x7f);
                        } else {
                            if (i_79_ != 6) {
                                break;
                            }

                            if (bool) {
                                stream_69_.writeByte(192 + i_70_);
                            }

                            stream_69_.writeByte((stream.buffer[i_62_++]));
                        }
                    }
                }

                throw new RuntimeException();
            } while (false);

            stream_69_.insertValueOffset((byte) -49,
                stream_69_.bufferLocation - i_78_);
        }
    }

    public void method1018() {
        aClass13_2203 = null;
    }

    public static Class37_Sub19 method1019(JS5 class15, int i, int i_0_) {
        byte[] is = class15.method131(i_0_, i, 1);

        if (is == null) {
            return null;
        }

        return new Class37_Sub19(new Stream(is));
    }

    public void method1020() {
        if (aClass13_2203 == null) {
            aClass13_2203 = new Class13(16);

            int[] is = new int[16];
            int[] is_1_ = new int[16];
            is[9] = is_1_[9] = 128;

            Class7 class7 = new Class7(aByteArray2202);
            int i = class7.method72();

            for (int i_2_ = 0; i_2_ < i; i_2_++) {
                class7.method71(i_2_);
                class7.method74(i_2_);
                class7.method69(i_2_);
            }

while_89_: 
            for (;;) {
                int i_3_ = class7.method77();
                int i_4_ = class7.anIntArray156[i_3_];

                while (class7.anIntArray156[i_3_] == i_4_) {
                    class7.method71(i_3_);

                    int i_5_ = class7.method64(i_3_);

                    if (i_5_ == 1) {
                        class7.method75();
                        class7.method69(i_3_);

                        if (!class7.method68()) {
                            break;
                        }

                        break while_89_;
                    }

                    int i_6_ = i_5_ & 0xf0;

                    if (i_6_ == 176) {
                        int i_7_ = i_5_ & 0xf;
                        int i_8_ = (i_5_ >> 8) & 0x7f;
                        int i_9_ = (i_5_ >> 16) & 0x7f;

                        if (i_8_ == 0) {
                            is[i_7_] = (is[i_7_] & ~0x1fc000) + (i_9_ << 14);
                        }

                        if (i_8_ == 32) {
                            is[i_7_] = (is[i_7_] & ~0x3f80) + (i_9_ << 7);
                        }
                    }

                    if (i_6_ == 192) {
                        int i_10_ = i_5_ & 0xf;
                        int i_11_ = (i_5_ >> 8) & 0x7f;
                        is_1_[i_10_] = is[i_10_] + i_11_;
                    }

                    if (i_6_ == 144) {
                        int i_12_ = i_5_ & 0xf;
                        int i_13_ = (i_5_ >> 8) & 0x7f;
                        int i_14_ = (i_5_ >> 16) & 0x7f;

                        if (i_14_ > 0) {
                            int i_15_ = is_1_[i_12_];
                            Class37_Sub23 class37_sub23 = ((Class37_Sub23) aClass13_2203.method100((byte) 66,
                                    (long) i_15_));

                            if (class37_sub23 == null) {
                                class37_sub23 = new Class37_Sub23(new byte[128]);
                                aClass13_2203.method101(class37_sub23, false,
                                    (long) i_15_);
                            }

                            class37_sub23.aByteArray2225[i_13_] = (byte) 1;
                        }
                    }

                    class7.method74(i_3_);
                    class7.method69(i_3_);
                }
            }
        }
    }
}
