/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.io.*;
import java.io.DataInputStream;
import java.io.IOException;

import java.net.URL;


public class Class22 {
    public static byte[][] aByteArrayArray569;
    public static int anInt570;
    public static JString aJString_575;
    public static int anInt576;
    public static int anInt578;
    public static int anInt579 = 0;
    public static int loginStage;
    public static int anInt581;
    public static JString aJString_583 = Class37_Sub2.method332((byte) 125,
            "Loading title screen )2 ");
    public static int[] anIntArray585;
    public static int anInt586;
    public static Class37_Sub4_Sub9_Sub3[] aClass37_Sub4_Sub9_Sub3Array588 = new Class37_Sub4_Sub9_Sub3[1000];
    public static int anInt589;

    static {
        aJString_575 = aJString_583;
        loginStage = 0;
    }

    public long aLong571;
    public int anInt572;
    public int anInt573;
    public byte[] aByteArray574;
    public Resource aClass23_577;
    public byte[] aByteArray582 = new byte[4];
    public int anInt584;
    public DataInputStream aDataInputStream587;

    public Class22(Signlink class51, URL url) {
        try {
            aClass23_577 = class51.createResource((byte) -110, url);
            anInt584 = 0;
            aLong571 = 30000L + Class71.method1263((byte) -80);
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("ge.<init>(" + ((class51 != null) ? "{...}" : "null") + ',' +
                ((url != null) ? "{...}" : "null") + ')'));
        }
    }

    public static void method229(boolean bool) {
        if (bool != true) {
            anInt579 = -94;
        }

        anInt578++;

        for (;;) {
            Class37_Sub5 class37_sub5;

            synchronized (Class37_Sub9_Sub34.aClass58_3557) {
                class37_sub5 = ((Class37_Sub5) Class25.aClass58_642.method1161((byte) -76));
            }

            if (class37_sub5 == null) {
                break;
            }

            class37_sub5.aClass15_Sub1_1868.method142((int) class37_sub5.aLong818,
                false, 126, class37_sub5.aClass69_1866,
                class37_sub5.aByteArray1863);
        }
    }

    public static int method230(int i, int i_0_, int i_1_) {
        anInt576++;

        if (i_0_ == -2) {
            return 12345678;
        }

        if (i_0_ == -1) {
            if ((i ^ 0xffffffff) <= -3) {
                if (i > 126) {
                    i = 126;
                }
            } else {
                i = 2;
            }

            return i;
        }

        i = (i * (i_0_ & 0x7f)) / 128;

        if ((i ^ 0xffffffff) <= -3) {
            if (i > 126) {
                i = 126;
            }
        } else {
            i = 2;
        }

        if (i_1_ != 12108) {
            aJString_583 = null;
        }

        return i + (0xff80 & i_0_);
    }

    public byte[] method231(int i) throws IOException {
        anInt570++;

        if (Class71.method1263((byte) -80) > aLong571) {
            throw new IOException("fdt");
        }

        if ((anInt584 ^ 0xffffffff) == -1) {
            if (aClass23_577.state == 2) {
                throw new IOException("fds");
            }

            if (aClass23_577.state == 1) {
                aDataInputStream587 = (DataInputStream) aClass23_577.resource;
                anInt584 = 1;
            }
        }

        if (i != 1) {
            aJString_583 = null;
        }

        if ((anInt584 ^ 0xffffffff) == -2) {
            int i_2_ = aDataInputStream587.available();

            if (i_2_ > 0) {
                if (((i_2_ + anInt573) ^ 0xffffffff) < -5) {
                    i_2_ = 4 + -anInt573;
                }

                anInt573 += aDataInputStream587.read(aByteArray582, anInt573,
                    i_2_);

                if (anInt573 == 4) {
                    int i_3_ = new Stream(aByteArray582).readInt();
                    anInt584 = 2;
                    aByteArray574 = new byte[i_3_];
                }
            }
        }

        if ((anInt584 ^ 0xffffffff) == -3) {
            int i_4_ = aDataInputStream587.available();

            if ((i_4_ ^ 0xffffffff) < -1) {
                if (aByteArray574.length < (i_4_ - -anInt572)) {
                    i_4_ = aByteArray574.length + -anInt572;
                }

                anInt572 += aDataInputStream587.read(aByteArray574, anInt572,
                    i_4_);

                if (anInt572 == aByteArray574.length) {
                    return aByteArray574;
                }
            }
        }

        return null;
    }

    public static void method232(int i, JS5 class15, boolean bool,
        JS5 class15_5_) {
        try {
            Class37_Sub4_Sub18.aClass15_2907 = class15;
            Class37_Sub9_Sub24.aClass15_3365 = class15_5_;
            Class79.aBoolean1469 = bool;

            if (i > 123) {
                anInt586++;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("ge.A(" + i + ',' + ((class15 != null) ? "{...}" : "null") +
                ',' + bool + ',' + ((class15_5_ != null) ? "{...}" : "null") +
                ')'));
        }
    }

    public static void method233(boolean bool) {
        anIntArray585 = null;
        aByteArrayArray569 = null;
        aJString_575 = null;

        if (bool == true) {
            aClass37_Sub4_Sub9_Sub3Array588 = null;
            aJString_583 = null;
        }
    }

    public static void method234(int i,
        Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2, int i_6_,
        int i_7_) {

        if ((i_6_ & 0x10) != 0) { // i_6_ >= 16

            int i_8_ = Class83.packetStream.readByteA();

            byte[] is = new byte[i_8_];
            Stream stream = new Stream(is);
            Class83.packetStream.readBytesReversed(i_8_, is, 110, 0);

            Class37_Sub9_Sub15.aStreamArray3175[i_7_] = stream;
            class37_sub4_sub7_sub1_sub2.method509(stream, 65535);
        }

        anInt589++;

        if ((0x100 & i_6_) != 0) { // i_6_ >= 256
            class37_sub4_sub7_sub1_sub2.anInt3636 = Class83.packetStream.readShortA(-1739943584);

            int i_9_ = Class83.packetStream.readInt2(127);
            class37_sub4_sub7_sub1_sub2.anInt3693 = i_9_ >> -292312848;

            class37_sub4_sub7_sub1_sub2.anInt3652 = Class37_Sub7.anInt1898 +
                (i_9_ & 0xffff);

            if (class37_sub4_sub7_sub1_sub2.anInt3636 == 65535) {
                class37_sub4_sub7_sub1_sub2.anInt3636 = -1;
            }

            class37_sub4_sub7_sub1_sub2.anInt3664 = 0;
            class37_sub4_sub7_sub1_sub2.anInt3654 = 0;

            if (class37_sub4_sub7_sub1_sub2.anInt3652 > Class37_Sub7.anInt1898) {
                class37_sub4_sub7_sub1_sub2.anInt3654 = -1;
            }
        }

        if ((0x1 & i_6_) != 0) { //i_6_ >= 9

            class37_sub4_sub7_sub1_sub2.anInt3687 = Class83.packetStream.readShortLE(2);

            class37_sub4_sub7_sub1_sub2.anInt3679 = Class83.packetStream.readShortLEA(2);
        }

        if ((0x40 & i_6_) != 0) {

            class37_sub4_sub7_sub1_sub2.aJString_3694 = Class83.packetStream.readString();

            if ((class37_sub4_sub7_sub1_sub2.aJString_3694.charAt(0) ^
                    0xffffffff) != -127) {
                if (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234 == class37_sub4_sub7_sub1_sub2) {
                    Class37_Sub4_Sub7_Sub1_Sub1.method505(class37_sub4_sub7_sub1_sub2.aJString_3993,
                        2, class37_sub4_sub7_sub1_sub2.aJString_3694, (byte) -56);
                }
            } else {
                class37_sub4_sub7_sub1_sub2.aJString_3694 = class37_sub4_sub7_sub1_sub2.aJString_3694.substring(1);
                Class37_Sub4_Sub7_Sub1_Sub1.method505(class37_sub4_sub7_sub1_sub2.aJString_3993,
                    2, class37_sub4_sub7_sub1_sub2.aJString_3694, (byte) 72);
            }

            class37_sub4_sub7_sub1_sub2.anInt3658 = 0;
            class37_sub4_sub7_sub1_sub2.anInt3673 = 0;
            class37_sub4_sub7_sub1_sub2.anInt3662 = 150;
        }

        if ((i_6_ & 0x8) != 0) { // i_6_ >= 8

            int i_10_ = Class83.packetStream.readShortA(-1739943584);
            int i_11_ = Class83.packetStream.readByte(126);

            if (i_10_ == 65535) {
                i_10_ = -1;
            }

            Class37.method324(i_11_, i_10_, class37_sub4_sub7_sub1_sub2, 0);
        }

        if ((i_6_ & 0x2) != 0) { // i_6_ >=2
            class37_sub4_sub7_sub1_sub2.anInt3653 = Class83.packetStream.readShort();
            if (class37_sub4_sub7_sub1_sub2.anInt3653 == 65535) {
                class37_sub4_sub7_sub1_sub2.anInt3653 = -1;
            }
        }

        if (i >= 43) {

            if (((i_6_ & 0x4) ^ 0xffffffff) != -1) {
                int i_12_ = Class83.packetStream.readByte(121);
                int i_13_ = Class83.packetStream.readByteA();
                class37_sub4_sub7_sub1_sub2.method496(Class37_Sub7.anInt1898,
                    i_12_, (byte) 109, i_13_);

                class37_sub4_sub7_sub1_sub2.anInt3697 = Class37_Sub7.anInt1898 -
                    -300;

                class37_sub4_sub7_sub1_sub2.anInt3692 = Class83.packetStream.readByteS(255);

                class37_sub4_sub7_sub1_sub2.anInt3690 = Class83.packetStream.readByteC((byte) 25);
            }

            if ((i_6_ & 0x80) != 0) {

                int i_14_ = Class83.packetStream.readShortLEA(2);
                int i_15_ = Class83.packetStream.readByteA();
                int i_16_ = Class83.packetStream.readByteS(255);
                int i_17_ = Class83.packetStream.bufferLocation;

                if ((class37_sub4_sub7_sub1_sub2.aJString_3993 != null) &&
                        (class37_sub4_sub7_sub1_sub2.aClass29_3985 != null)) {

                    boolean bool = false;
                    long l = class37_sub4_sub7_sub1_sub2.aJString_3993.toInt64(-100);

                    if (i_15_ <= 1) {
                        for (int i_18_ = 0; Class18.anInt340 > i_18_;
                                i_18_++) {
                            if ((l ^ 0xffffffffffffffffL) == (Class80.aLongArray1504[i_18_] ^
                                    0xffffffffffffffffL)) {
                                bool = true;

                                break;
                            }
                        }
                    }

                    if (!bool /*&& ((Class52_Sub1.anInt2303 ^ 0xffffffff) == -1)*/) {

                        Class37_Sub9_Sub13.aStream_3140.bufferLocation = 0;
                        Class83.packetStream.readBytes(0, i_16_,
                            (Class37_Sub9_Sub13.aStream_3140.buffer),
                            (byte) -53);
                        Class37_Sub9_Sub13.aStream_3140.bufferLocation = 0;

                        JString jstring = (Class37_Sub4_Sub9_Sub2.method605(Class36.method319(
                                    Class37_Sub9_Sub13.aStream_3140, -53)
                                                                                   .formatCapitalization(1)));

                        class37_sub4_sub7_sub1_sub2.aJString_3694 = jstring.trim((byte) -111);

                        class37_sub4_sub7_sub1_sub2.anInt3658 = i_14_ >> 841995400;
                        class37_sub4_sub7_sub1_sub2.anInt3673 = 0xff & i_14_;
                        class37_sub4_sub7_sub1_sub2.anInt3662 = 150;

                        if (((i_15_ ^ 0xffffffff) != -3) &&
                                ((i_15_ ^ 0xffffffff) != -4)) {
                            if ((i_15_ ^ 0xffffffff) != -2) {
                                Class37_Sub4_Sub7_Sub1_Sub1.method505(class37_sub4_sub7_sub1_sub2.aJString_3993,
                                    2, jstring, (byte) -30);
                            } else {
                                Class37_Sub4_Sub7_Sub1_Sub1.method505((Class37_Sub9_Sub27.method881(
                                        -51,
                                        (new JString[] {
                                            AbstractDrawingArea.aJString_741,
                                            (class37_sub4_sub7_sub1_sub2.aJString_3993)
                                        }))), 1, jstring, (byte) 111);
                            }
                        } else {
                            Class37_Sub4_Sub7_Sub1_Sub1.method505((Class37_Sub9_Sub27.method881(
                                    110,
                                    new JString[] {
                                        Class42.aJString_917,
                                        (class37_sub4_sub7_sub1_sub2.aJString_3993)
                                    })), 1, jstring, (byte) 74);
                        }
                    }
                }

                Class83.packetStream.bufferLocation = i_16_ + i_17_;
            }

            if (((0x200 & i_6_) ^ 0xffffffff) != -1) {

                int i_19_ = Class83.packetStream.readByteS(255);
                int i_20_ = Class83.packetStream.readByteS(255);
                class37_sub4_sub7_sub1_sub2.method496(Class37_Sub7.anInt1898,
                    i_19_, (byte) 126, i_20_);

                class37_sub4_sub7_sub1_sub2.anInt3697 = Class37_Sub7.anInt1898 -
                    -300;

                class37_sub4_sub7_sub1_sub2.anInt3692 = Class83.packetStream.readByte(124);

                class37_sub4_sub7_sub1_sub2.anInt3690 = Class83.packetStream.readByte(127);
            }

            if ((i_6_ & 0x400) != 0) {

                class37_sub4_sub7_sub1_sub2.anInt3684 = Class83.packetStream.readByteC((byte) 21);

                class37_sub4_sub7_sub1_sub2.anInt3639 = Class83.packetStream.readByteS(255);

                class37_sub4_sub7_sub1_sub2.anInt3688 = Class83.packetStream.readByteS(255);

                class37_sub4_sub7_sub1_sub2.anInt3643 = Class83.packetStream.readByteC((byte) 101);

                class37_sub4_sub7_sub1_sub2.anInt3648 = (Class83.packetStream.readShort() -
                    -Class37_Sub7.anInt1898);

                class37_sub4_sub7_sub1_sub2.anInt3667 = (Class83.packetStream.readShortA(-1739943584) +
                    Class37_Sub7.anInt1898);

                class37_sub4_sub7_sub1_sub2.anInt3661 = Class83.packetStream.readByte(118);
                class37_sub4_sub7_sub1_sub2.anInt3640 = 0;
                class37_sub4_sub7_sub1_sub2.anInt3645 = 1;
            }
        }
    }
}
