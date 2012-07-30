/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.io.IOException;


public class Class25 {
    public static int anInt635;
    public static JString aJString_636 = Class37_Sub2.method332((byte) 104,
            "<col=ffffff>");
    public static int anInt637;
    public static JString aJString_638;
    public static int anInt639;
    public static JString aJString_640 = (Class37_Sub2.method332((byte) 120,
            "Too many incorrect logins from your address)3"));
    public static JString aJString_641;
    public static Class58 aClass58_642;
    public static int anInt643;
    public static JString aJString_644;
    public static JString aJString_645;
    public static byte[][] aByteArrayArray646;
    public static JString aJString_647;

    static {
        aJString_638 = Class37_Sub2.method332((byte) 116, "(U0a )2 via: ");
        aJString_641 = aJString_640;
        anInt637 = 0;
        aClass58_642 = new Class58();

        aJString_645 = Class37_Sub2.method332((byte) 105,
                "nicht hergestellt werden)3");
        aByteArrayArray646 = new byte[250][];
        aJString_647 = Class37_Sub2.method332((byte) 117, "<col=ffff00>*V");
        aJString_644 = Class37_Sub2.method332((byte) 123, "(Y");
    }

    public static void writeFromRandom(Stream stream, int i) {
        anInt643++;

        byte[] is = new byte[24];

        if (Class71.randomFile != null) {
            try {
                Class71.randomFile.seek(0L, 0);
                Class71.randomFile.read(is, (byte) 118);

                int i_1_;

                for (i_1_ = 0; i_1_ < 24; i_1_++) {
                    if (is[i_1_] != 0) {
                        break;
                    }
                }

                if (i_1_ >= 24) {
                    throw new IOException();
                }
            } catch (Exception exception) {
                for (int i_2_ = 0; i_2_ < 24; i_2_++)
                    is[i_2_] = (byte) -1;
            }
        }

        stream.writeBytes(24, 0, 4, is);
    }

    public static void resetStaticVariables(int i) {
        if (i > -55) {
            writeFromRandom(null, 56);
        }

        aJString_638 = null;
        aJString_640 = null;
        aJString_636 = null;
        aJString_645 = null;
        aJString_644 = null;
        aByteArrayArray646 = null;
        aClass58_642 = null;
        aJString_647 = null;
        aJString_641 = null;
    }

    public static Class37_Sub4_Sub8 method255(boolean bool, int i) {
        anInt635++;

        Class37_Sub4_Sub8 class37_sub4_sub8 = ((Class37_Sub4_Sub8) Class64.aClass65_1210.method1181((byte) 10,
                (long) i));

        if (class37_sub4_sub8 != null) {
            return class37_sub4_sub8;
        }

        byte[] is = Class52.aClass15_1054.method131(i, 4, 1);
        class37_sub4_sub8 = new Class37_Sub4_Sub8();

        if (is != null) {
            class37_sub4_sub8.method575(-16, new Stream(is), i);
        }

        class37_sub4_sub8.method571(0);
        Class64.aClass65_1210.method1179((long) i, -4, class37_sub4_sub8);

        if (bool != true) {
            aJString_644 = null;
        }

        return class37_sub4_sub8;
    }
}
