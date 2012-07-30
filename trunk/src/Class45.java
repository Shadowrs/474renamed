/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.Component;


public abstract class Class45 {
    public static int anInt970 = -8 + (int) (17.0 * Math.random());
    public static int anInt971;
    public static JString aJString_972;
    public static int anInt973;
    public static int anInt974;
    public static int anInt975;
    public static int anInt976;
    public static int anInt977 = 0;
    public static JString aJString_978;

    static {
        anInt974 = 0;

        aJString_978 = (Class37_Sub2.method332((byte) 124,
                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V "));
        aJString_972 = aJString_978;
    }

    public static Class37_Sub4_Sub9_Sub3 method1095(boolean bool,
        JS5 class15, JString jstring, JString jstring_0_) {
        try {
            if (bool != false) {
                aJString_972 = null;
            }

            anInt975++;

            int i = class15.method123((byte) 32, jstring_0_);
            int i_1_ = class15.method128(jstring, -128, i);

            return Class6.method61(117, i, i_1_, class15);
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("n.F(" + bool + ',' + ((class15 != null) ? "{...}" : "null") +
                ',' + ((jstring != null) ? "{...}" : "null") + ',' +
                ((jstring_0_ != null) ? "{...}" : "null") + ')'));
        }
    }

    public abstract void method1096(int i, Component component);

    public static Class37_Sub4_Sub16 method1097(byte i, int i_2_) {
        if (i < 126) {
            aJString_972 = null;
        }

        anInt973++;

        Class37_Sub4_Sub16 class37_sub4_sub16 = ((Class37_Sub4_Sub16) Class37_Sub4_Sub18.aClass65_2891.method1181((byte) 106,
                (long) i_2_));

        if (class37_sub4_sub16 != null) {
            return class37_sub4_sub16;
        }

        class37_sub4_sub16 = Canvas_Sub1.method38(Class37_Sub9_Sub14.aClass15_3145,
                i_2_, (byte) 125, false, Class6.aClass15_147);

        if (class37_sub4_sub16 != null) {
            Class37_Sub4_Sub18.aClass65_2891.method1179((long) i_2_, -4,
                class37_sub4_sub16);
        }

        return class37_sub4_sub16;
    }

    public abstract int method1098(int i);

    public static int method1099(int i, int i_3_, byte i_4_) {
        if (i_4_ != -74) {
            return -48;
        }

        int i_5_ = (i >> -215034849) & (-1 + i_3_);
        anInt971++;

        return i_5_ + (((i >>> 832847167) + i) % i_3_);
    }

    public abstract void method1100(Component component, byte i);

    public static void method1101(int i) {
        aJString_972 = null;

        if (i == 0) {
            aJString_978 = null;
        }
    }
}
