/* Login - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.io.IOException;

import java.net.Socket;


public class Login {
    public static JString aJString_776;
    public static JString aJString_777;
    public static int anInt778;
    public static byte[] aByteArray779;
    public static JString aJString_780;
    public static int anInt781;
    public static int anInt782;
    public static int anInt783;
    public static JString aJString_784 = Class37_Sub2.method332((byte) 106,
            "Hierhin gehen");
    public static int anInt785;
    public static JString aJString_786;
    public static JString aJString_787;
    public static int anInt788;
    public static short[] aShortArray789;
    public static JString aJString_790;
    public static JString aJString_791;
    public static int anInt792;
    public static int anInt793;
    public static int anInt794;

    static {
        aJString_777 = Class37_Sub2.method332((byte) 108, "Connection lost)3");
        aJString_786 = Class37_Sub2.method332((byte) 122, "lila:");
        aJString_776 = Class37_Sub2.method332((byte) 127,
                "Please enter your username)3");
        anInt782 = 0;
        aJString_780 = Class37_Sub2.method332((byte) 117, "blaugr-Un:");
        anInt781 = 0;
        aJString_787 = aJString_776;
        aJString_790 = Class37_Sub2.method332((byte) 117, "Null");
        aJString_791 = aJString_777;
        aByteArray779 = new byte[520];
    }

    public static byte[] method312(byte[] is, byte i) {
        Stream stream = new Stream(is);

        if (i != 106) {
            method315(25);
        }

        int i_0_ = stream.readByte(i + 12);
        anInt792++;

        int i_1_ = stream.readInt(-89);

        if (((i_1_ ^ 0xffffffff) > -1) ||
                ((Class15_Sub1.anInt1762 != 0) &&
                (Class15_Sub1.anInt1762 < i_1_))) {
            throw new RuntimeException();
        }
        if (i_0_ != 0) {
            int i_2_ = stream.readInt(-42);

            if ((i_2_ < 0) ||
                    (((Class15_Sub1.anInt1762 ^ 0xffffffff) != -1) &&
                    ((Class15_Sub1.anInt1762 ^ 0xffffffff) > (i_2_ ^
                    0xffffffff)))) {
                return new byte[100];
                //throw new RuntimeException();
            }
            if (i_2_ >= 2000000) {
                return new byte[100];
            }
            byte[] is_3_ = new byte[i_2_];
            if (i_0_ != 1) {
                Class37_Sub4_Sub3.aClass6_2552.method58((byte) 126, is_3_,
                        stream);
            } else {
                Class31.method286(is_3_, i_2_, is, i_1_, 9);
            }

            return is_3_;
        }

        byte[] is_4_ = new byte[i_1_];
        stream.readBytes(0, i_1_, is_4_, (byte) -53);
	
        return is_4_;
    }

    public static void method313(int i, Class15_Sub1 class15_sub1,
        Class69 class69, int i_5_) {
        try {
            anInt793++;

            Class37_Sub5 class37_sub5 = new Class37_Sub5();
            class37_sub5.aClass69_1866 = class69;
            class37_sub5.aClass15_Sub1_1868 = class15_sub1;
            class37_sub5.anInt1867 = i_5_;
            class37_sub5.aLong818 = (long) i;

            synchronized (Class37_Sub9_Sub34.aClass58_3557) {
                Class37_Sub9_Sub34.aClass58_3557.method1149((byte) -117,
                    class37_sub5);
            }

            Class37_Sub10.method926(true);
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("kf.B(" + i + ',' +
                ((class15_sub1 != null) ? "{...}" : "null") + ',' +
                ((class69 != null) ? "{...}" : "null") + ',' + i_5_ + ')'));
        }
    }

    public static void method314(int i) {
        if (i != -9) {
            anInt788 = 26;
        }

        aShortArray789 = null;
        aJString_776 = null;
        aJString_791 = null;
        aJString_787 = null;
        aJString_790 = null;
        aByteArray779 = null;
        aJString_777 = null;
        aJString_780 = null;
        aJString_786 = null;
        aJString_784 = null;
    }

    public static void method315(int i) {
        anInt794++;

        try {
            if ((Class22.anInt580 ^ 0xffffffff) == -1) {
                if (Applet_Sub1.aClass19_38 != null) {
                    Applet_Sub1.aClass19_38.killThread((byte) -128);
                    Applet_Sub1.aClass19_38 = null;
                }

                Class37_Sub18.aBoolean2201 = false;
                anInt781 = 0;
                Class22.anInt580 = 1;
                Class55.aClass23_1076 = null;
            }

            if (Class22.anInt580 == 1) {
                if (Class55.aClass23_1076 == null) {
                    Class55.aClass23_1076 = (Class80.aClass51_1508.createResource(Class37_Sub8.address,
                            Class37_Sub4_Sub7_Sub1.anInt3700, true));
                }

                if ((Class55.aClass23_1076.anInt591 ^ 0xffffffff) == -3) {
                    throw new IOException();
                }

                if (Class55.aClass23_1076.anInt591 == 1) {
                    Applet_Sub1.aClass19_38 = new RSSocket(((Socket) Class55.aClass23_1076.anObject595),
                            Class80.aClass51_1508);
                    Class22.anInt580 = 2;
                    Class55.aClass23_1076 = null;
                }
            }

            if (i != -21482) {
                method312(null, (byte) 0);
            }

            if (Class22.anInt580 == 2) {
                long l = (Class37_Sub9_Sub34.aLong3556 = Class37_Sub9_Sub33.aJString_3526.method152(-53));
                int i_6_ = (int) (0x1fL & (l >> -356845744));
                Class42.aStream_Sub1_936.bufferLocation = 0;
                Class42.aStream_Sub1_936.writeSignedByte(101, 14);
                Class42.aStream_Sub1_936.writeSignedByte(99, i_6_);
                Applet_Sub1.aClass19_38.write(0, (byte) 101,
                    (Class42.aStream_Sub1_936.buffer), 2);
                Class83.packetStream.bufferLocation = 0;
                Class22.anInt580 = 3;
            }

            if ((Class22.anInt580 ^ 0xffffffff) == -4) {
                if (Class88.aClass24_1605 != null) {
                    Class88.aClass24_1605.method243(false);
                }

                if (Class37_Sub4_Sub7.aClass24_2638 != null) {
                    Class37_Sub4_Sub7.aClass24_2638.method243(false);
                }

                int i_7_ = Applet_Sub1.aClass19_38.read(false);

                if (Class88.aClass24_1605 != null) {
                    Class88.aClass24_1605.method243(false);
                }

                if (Class37_Sub4_Sub7.aClass24_2638 != null) {
                    Class37_Sub4_Sub7.aClass24_2638.method243(false);
                }

                if ((i_7_ ^ 0xffffffff) != -1) {
                    RuntimeException_Sub1.method1338(i_7_, (byte) 59);

                    return;
                }

                Class83.packetStream.bufferLocation = 0;
                Class22.anInt580 = 4;
            }

            if ((Class22.anInt580 ^ 0xffffffff) == -5) {
                if (Class83.packetStream.bufferLocation < 8) {
                    int i_8_ = Applet_Sub1.aClass19_38.available(-106);

                    if ((i_8_ ^ 0xffffffff) < ((8 -
                            Class83.packetStream.bufferLocation) ^
                            0xffffffff)) {
                        i_8_ = 8 + -Class83.packetStream.bufferLocation;
                    }

                    if ((i_8_ ^ 0xffffffff) < -1) {
                        Applet_Sub1.aClass19_38.read(i_8_,
                            Class83.packetStream.bufferLocation, 122,
                            Class83.packetStream.buffer);
                        Class83.packetStream.bufferLocation += i_8_;
                    }
                }

                if (Class83.packetStream.bufferLocation == 8) {
                    Class83.packetStream.bufferLocation = 0;

                    Class26.aLong659 = Class83.packetStream.readLongDuplicate(false);
                    Class22.anInt580 = 5;
                }
            }

            if (Class22.anInt580 == 5) {
                int[] is = new int[4];
                is[0] = (int) (Math.random() * 9.9999999E7);
                is[3] = (int) Class26.aLong659;
                is[2] = (int) (Class26.aLong659 >> -311437664);
                Class42.aStream_Sub1_936.bufferLocation = 0;
                is[1] = (int) (9.9999999E7 * Math.random());
                Class42.aStream_Sub1_936.writeSignedByte(i ^ ~0x5394, 10);
                Class42.aStream_Sub1_936.writeInt(is[0]);
                Class42.aStream_Sub1_936.writeInt(is[1]);
                Class42.aStream_Sub1_936.writeInt(is[2]);
                Class42.aStream_Sub1_936.writeInt(is[3]);
                Class42.aStream_Sub1_936.writeLong(Class37_Sub9_Sub33.aJString_3526.method152(i ^
                        0x53be));
                Class42.aStream_Sub1_936.writeString(Class37_Sub9_Sub33.aJString_3525, 0);
                //Class42.aStream_Sub1_936.method958((byte) -91,
                //    (Class37_Sub20.aBigInteger2210), (Class26.aBigInteger652));
                Class58.aStream_Sub1_1106.bufferLocation = 0;

                if (Class32.anInt740 != 40) {
                    Class58.aStream_Sub1_1106.writeSignedByte(118, 16);
                } else {
                    Class58.aStream_Sub1_1106.writeSignedByte(i ^ ~0x5383, 18);
                }

                Class58.aStream_Sub1_1106.writeSignedByte(106,
                    Class42.aStream_Sub1_936.bufferLocation + 93);
                Class58.aStream_Sub1_1106.writeInt(474);
                Class58.aStream_Sub1_1106.writeSignedByte(124,
                    Class37_Sub4_Sub6.aBoolean2613 ? 1 : 0);
                Class25.method253(Class58.aStream_Sub1_1106, -107);
                Class58.aStream_Sub1_1106.writeInt(Class69.aClass15_Sub1_1335.anInt255);
                Class58.aStream_Sub1_1106.writeInt(Class69.aClass15_Sub1_1330.anInt255);
                Class58.aStream_Sub1_1106.writeInt(Class14.aClass15_Sub1_242.anInt255);
                Class58.aStream_Sub1_1106.writeInt((Canvas_Sub1.aClass15_Sub1_46.anInt255));
                Class58.aStream_Sub1_1106.writeInt((Class37_Sub4.aClass15_Sub1_1862.anInt255));
                Class58.aStream_Sub1_1106.writeInt(Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740.anInt255);
                Class58.aStream_Sub1_1106.writeInt(Class54.aClass15_Sub1_1060.anInt255);
                Class58.aStream_Sub1_1106.writeInt(Class29.aClass15_Sub1_711.anInt255);
                Class58.aStream_Sub1_1106.writeInt((Class60.aClass15_Sub1_1151.anInt255));
                Class58.aStream_Sub1_1106.writeInt((PacketStream.aClass15_Sub1_3609.anInt255));
                Class58.aStream_Sub1_1106.writeInt((Class52_Sub1.aClass15_Sub1_2309.anInt255));
                Class58.aStream_Sub1_1106.writeInt((Class36.aClass15_Sub1_796.anInt255));
                Class58.aStream_Sub1_1106.writeInt((Class37_Sub9_Sub34.aClass15_Sub1_3555.anInt255));
                Class58.aStream_Sub1_1106.writeInt((Class37_Sub9_Sub2.aClass15_Sub1_2932.anInt255));
                Class58.aStream_Sub1_1106.writeInt((Class37_Sub20.aClass15_Sub1_2216.anInt255));
                Class58.aStream_Sub1_1106.writeInt((Class37_Sub17.aClass15_Sub1_2164.anInt255));
                Class58.aStream_Sub1_1106.writeBytes(Class42.aStream_Sub1_936.bufferLocation,
                    0, i + 21486, Class42.aStream_Sub1_936.buffer);
                Applet_Sub1.aClass19_38.write(0, (byte) 102,
                    Class58.aStream_Sub1_1106.buffer,
                    Class58.aStream_Sub1_1106.bufferLocation);
                Class42.aStream_Sub1_936.initISAAC(false, is);

                for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -5; i_9_++)
                    is[i_9_] += 50;

                Class83.packetStream.initISAAC(false, is);
                Class22.anInt580 = 6;
            }

            if (((Class22.anInt580 ^ 0xffffffff) == -7) &&
                    ((Applet_Sub1.aClass19_38.available(-112) ^ 0xffffffff) < -1)) {
                int i_10_ = Applet_Sub1.aClass19_38.read(false);

                if (((i_10_ ^ 0xffffffff) == -22) && (Class32.anInt740 == 20)) {
                    Class22.anInt580 = 7;
                } else if (i_10_ != 2) {
                    if ((i_10_ == 15) && (Class32.anInt740 == 40)) {
                        Class37_Sub9_Sub9.method799(i + 26512);

                        return;
                    }

                    if (((i_10_ ^ 0xffffffff) == -24) &&
                            (Class37_Sub9_Sub23.anInt3355 < 1)) {
                        Class37_Sub9_Sub23.anInt3355++;
                        Class22.anInt580 = 0;
                    } else {
                        RuntimeException_Sub1.method1338(i_10_, (byte) 59);

                        return;
                    }
                } else {
                    Class22.anInt580 = 9;
                }
            }

            if ((Class22.anInt580 == 7) &&
                    (Applet_Sub1.aClass19_38.available(-107) > 0)) {
                RSApplet.anInt178 = (60 * Applet_Sub1.aClass19_38.read(false)) +
                    180;
                Class22.anInt580 = 8;
            }

            if ((Class22.anInt580 ^ 0xffffffff) == -9) {
                anInt781 = 0;
                Class32_Sub1.method293((byte) -120,
                    (Class37_Sub9_Sub27.method881(-84,
                        (new JString[] {
                            Class37_Sub9_Sub24.method870(RSApplet.anInt178 / 60,
                                (byte) -114), Class37_Sub9_Sub8.aJString_3066
                        }))), Class37_Sub9_Sub35.aJString_3568,
                    Class37_Sub3_Sub1.aJString_2327);

                if (--RSApplet.anInt178 <= 0) {
                    Class22.anInt580 = 0;
                }
            } else {
                if ((Class22.anInt580 == 9) &&
                        (Applet_Sub1.aClass19_38.available(-110) >= 8)) {

                    Class37_Sub9_Sub20.anInt3301 = Applet_Sub1.aClass19_38.read(false);

                    Class37_Sub13.aBoolean2109 = (Applet_Sub1.aClass19_38.read(false) ^
                        0xffffffff) == -2;

                    Class37_Sub9_Sub5.anInt2998 = Applet_Sub1.aClass19_38.read(false);
                    Class37_Sub9_Sub5.anInt2998 <<= 8;

                    Class37_Sub9_Sub5.anInt2998 += Applet_Sub1.aClass19_38.read(false);

                    Class37_Sub12.anInt2077 = Applet_Sub1.aClass19_38.read(false);
                    Applet_Sub1.aClass19_38.read(1, 0, 122,
                        Class83.packetStream.buffer);
                    Class83.packetStream.bufferLocation = 0;

                    Class37_Sub9_Sub17.packetId = Class83.packetStream.readPacket(7);

                    Applet_Sub1.aClass19_38.read(2, 0, i + 21604,
                        Class83.packetStream.buffer);
                    Class83.packetStream.bufferLocation = 0;
                    Class37_Sub4.packetSize = Class83.packetStream.readShort();
                    Class22.anInt580 = 10;
                }

                if ((Class22.anInt580 ^ 0xffffffff) == -11) {

                    if ((Applet_Sub1.aClass19_38.available(-124) ^ 0xffffffff) <= (Class37_Sub4.packetSize ^
                            0xffffffff)) {
                        Class83.packetStream.bufferLocation = 0;
                        Applet_Sub1.aClass19_38.read(Class37_Sub4.packetSize,
                            0, 122,
                            Class83.packetStream.buffer);

                        Class54.method1140(0);//reset ALL the data
                        Class37_Sub10.anInt1985 = -1;
                        Stream.method934(0, false);
                        Class37_Sub9_Sub17.packetId = -1;
                    }
                } else {
                    anInt781++;
                    if (anInt781 > 2000) {
                        if ((Class37_Sub9_Sub23.anInt3355 ^ 0xffffffff) > -2) {
                            if (Class37_Sub4_Sub7_Sub1.anInt3700 == Class37_Sub9_Sub31.anInt3490) {
                                Class37_Sub4_Sub7_Sub1.anInt3700 = Class22.anInt581;
                            } else {
                                Class37_Sub4_Sub7_Sub1.anInt3700 = Class37_Sub9_Sub31.anInt3490;
                            }

                            Class22.anInt580 = 0;
                            Class37_Sub9_Sub23.anInt3355++;
                        } else {
                            RuntimeException_Sub1.method1338(-3, (byte) 59);
                        }
                    }
                }
            }
        } catch (IOException ioexception) {
            if (Class37_Sub9_Sub23.anInt3355 < 1) {
                if ((Class37_Sub9_Sub31.anInt3490 ^ 0xffffffff) != (Class37_Sub4_Sub7_Sub1.anInt3700 ^
                        0xffffffff)) {
                    Class37_Sub4_Sub7_Sub1.anInt3700 = Class37_Sub9_Sub31.anInt3490;
                } else {
                    Class37_Sub4_Sub7_Sub1.anInt3700 = Class22.anInt581;
                }

                Class37_Sub9_Sub23.anInt3355++;
                Class22.anInt580 = 0;
            } else {
                RuntimeException_Sub1.method1338(-2, (byte) 59);
            }
        }
    }
}
