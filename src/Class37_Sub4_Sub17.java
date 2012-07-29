/* Class37_Sub4_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Class37_Sub4_Sub17 extends Class37_Sub4 {
    public static int[] anIntArray2872;
    public static JString aJString_2873;
    public static JString aJString_2875;
    public static int anInt2876;
    public static JString aJString_2877;
    public static JString aJString_2878;
    public static JString aJString_2879 = Class37_Sub2.method332((byte) 102,
            "red:");
    public static JString aJString_2880 = Class37_Sub2.method332((byte) 102,
            "Ihr Spielkonto wurde deaktiviert)3");
    public static int anInt2881;
    public static JString aJString_2882;
    public static JString aJString_2883;
    public static int anInt2884;

    static {
        aJString_2873 = (Class37_Sub2.method332((byte) 118,
                "Account locked as we suspect it has been stolen)3"));
        aJString_2878 = aJString_2879;
        aJString_2877 = aJString_2873;

        aJString_2883 = Class37_Sub2.method332((byte) 118,
                "Login server offline)3");
        aJString_2875 = aJString_2883;
        aJString_2882 = aJString_2879;
    }

    public int anInt2874 = 0;

    public static void method725(PacketStream stream_sub1, int i,
        int i_0_) {
        if (i_0_ != -21) {
            method728((byte) -117);
        }

        anInt2876++;

        for (;;) {
            Class37_Sub20 class37_sub20 = ((Class37_Sub20) Class37_Sub4_Sub7.aClass58_2633.method1155(0));

            if (class37_sub20 == null) {
                break;
            }

            boolean bool = false;

            for (int i_1_ = 0; class37_sub20.anInt2205 > i_1_; i_1_++) {
                if (class37_sub20.aClass23Array2209[i_1_] != null) {
                    if ((class37_sub20.aClass23Array2209[i_1_].anInt591 ^
                            0xffffffff) == -3) {
                        class37_sub20.anIntArray2212[i_1_] = -5;
                    }

                    if ((class37_sub20.aClass23Array2209[i_1_].anInt591 ^
                            0xffffffff) == -1) {
                        bool = true;
                    }
                }

                if (class37_sub20.aClass23Array2206[i_1_] != null) {
                    if ((class37_sub20.aClass23Array2206[i_1_].anInt591 ^
                            0xffffffff) == -3) {
                        class37_sub20.anIntArray2212[i_1_] = -6;
                    }

                    if (class37_sub20.aClass23Array2206[i_1_].anInt591 == 0) {
                        bool = true;
                    }
                }
            }

            if (bool) {
                break;
            }

            stream_sub1.writePacket(-1494101117, i);
            stream_sub1.writeSignedByte(119, 0);

            int i_2_ = stream_sub1.bufferLocation;
            stream_sub1.writeInt(class37_sub20.anInt2207);

            for (int i_3_ = 0; class37_sub20.anInt2205 > i_3_; i_3_++) {
                if (class37_sub20.anIntArray2212[i_3_] != 0) {
                    stream_sub1.writeSignedByte(115,
                        class37_sub20.anIntArray2212[i_3_]);
                } else {
                    try {
                        int i_4_ = class37_sub20.anIntArray2214[i_3_];

                        if (i_4_ != 0) {
                            if ((i_4_ ^ 0xffffffff) == -2) {
                                Field field = (Field) (class37_sub20.aClass23Array2209[i_3_].anObject595);
                                field.setInt(null,
                                    (class37_sub20.anIntArray2204[i_3_]));
                                stream_sub1.writeSignedByte(i_0_ ^ ~0x68, 0);
                            } else if ((i_4_ ^ 0xffffffff) == -3) {
                                Field field = (Field) (class37_sub20.aClass23Array2209[i_3_].anObject595);
                                int i_5_ = field.getModifiers();
                                stream_sub1.writeSignedByte(100, 0);
                                stream_sub1.writeInt(i_5_);
                            }
                        } else {
                            Field field = (Field) (class37_sub20.aClass23Array2209[i_3_].anObject595);
                            int i_6_ = field.getInt(null);
                            stream_sub1.writeSignedByte(116, 0);
                            stream_sub1.writeInt(i_6_);
                        }

                        if ((i_4_ ^ 0xffffffff) != -4) {
                            if ((i_4_ ^ 0xffffffff) == -5) {
                                Method method = (Method) (class37_sub20.aClass23Array2206[i_3_].anObject595);
                                int i_7_ = method.getModifiers();
                                stream_sub1.writeSignedByte(111, 0);
                                stream_sub1.writeInt(i_7_);
                            }
                        } else {
                            Method method = (Method) (class37_sub20.aClass23Array2206[i_3_].anObject595);
                            byte[][] is = class37_sub20.aByteArrayArrayArray2213[i_3_];
                            Object[] objects = new Object[is.length];

                            for (int i_8_ = 0; is.length > i_8_; i_8_++) {
                                ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(
                                            is[i_8_])));
                                objects[i_8_] = objectinputstream.readObject();
                            }

                            Object object = method.invoke(null, objects);

                            if (object != null) {
                                if (object instanceof Number) {
                                    stream_sub1.writeSignedByte(i_0_ ^ ~0x6c, 1);
                                    stream_sub1.writeLong(((Number) object).longValue());
                                } else if (!(object instanceof JString)) {
                                    stream_sub1.writeSignedByte(108, 4);
                                } else {
                                    stream_sub1.writeSignedByte(i_0_ + 137, 2);
                                    stream_sub1.writeString(((JString) object),
                                        i_0_ ^ ~0x14);
                                }
                            } else {
                                stream_sub1.writeSignedByte(103, 0);
                            }
                        }
                    } catch (ClassNotFoundException classnotfoundexception) {
                        stream_sub1.writeSignedByte(121, -10);
                    } catch (java.io.InvalidClassException invalidclassexception) {
                        stream_sub1.writeSignedByte(112, -11);
                    } catch (java.io.StreamCorruptedException streamcorruptedexception) {
                        stream_sub1.writeSignedByte(108, -12);
                    } catch (java.io.OptionalDataException optionaldataexception) {
                        stream_sub1.writeSignedByte(i_0_ ^ ~0x75, -13);
                    } catch (IllegalAccessException illegalaccessexception) {
                        stream_sub1.writeSignedByte(120, -14);
                    } catch (IllegalArgumentException illegalargumentexception) {
                        stream_sub1.writeSignedByte(104, -15);
                    } catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
                        stream_sub1.writeSignedByte(102, -16);
                    } catch (SecurityException securityexception) {
                        stream_sub1.writeSignedByte(i_0_ ^ ~0x61, -17);
                    } catch (java.io.IOException ioexception) {
                        stream_sub1.writeSignedByte(118, -18);
                    } catch (NullPointerException nullpointerexception) {
                        stream_sub1.writeSignedByte(101, -19);
                    } catch (Exception exception) {
                        stream_sub1.writeSignedByte(127, -20);
                    } catch (Throwable throwable) {
                        stream_sub1.writeSignedByte(110, -21);
                    }
                }
            }

            stream_sub1.method937(i_2_, (byte) -87);
            stream_sub1.method948(-i_2_ + stream_sub1.bufferLocation,
                128);
            class37_sub20.method322(false);
        }
    }

    public void method726(int i, int i_9_, Stream stream) {
        anInt2884++;

        if (i < 53) {
            anIntArray2872 = null;
        }

        if ((i_9_ ^ 0xffffffff) == -3) {
            anInt2874 = stream.readShort();
        }
    }

    public void method727(Stream stream, boolean bool) {
        anInt2881++;

        for (;;) {
            int i = stream.readByte(117);

            if (i == 0) {
                break;
            }

            method726(85, i, stream);
        }

        if (bool != false) {
            anIntArray2872 = null;
        }
    }

    public static void method728(byte i) {
        if (i <= 90) {
            method725(null, 35, -71);
        }

        aJString_2873 = null;
        aJString_2877 = null;
        aJString_2878 = null;
        aJString_2879 = null;
        aJString_2883 = null;
        anIntArray2872 = null;
        aJString_2882 = null;
        aJString_2875 = null;
        aJString_2880 = null;
    }
}
