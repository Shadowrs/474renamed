/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;


public class Canvas_Sub1 extends Canvas {
    public static JString aJString_44;
    public static int anInt45 = 127;
    public static Class15_Sub1 aClass15_Sub1_46;
    public static Class37_Sub4_Sub9_Sub1 aClass37_Sub4_Sub9_Sub1_47;
    public static int anInt48;
    public static int anInt49;
    public static int anInt51;
    public static int anInt52;
    public static JString aJString_53;
    public static JString aJString_54;
    public static JString aJString_55;
    public static JString aJString_56;

    static {
        aJString_44 = (Class37_Sub2.method332((byte) 125,
                "Bitte geben Sie Ihren Benutzenamen ein)3"));

        aJString_54 = (Class37_Sub2.method332((byte) 121,
                "zur-Uck auf die RuneScape)2Webseite gehen"));
        aJString_53 = Class37_Sub2.method332((byte) 126, "Fertigkeit)2");

        aJString_55 = Class37_Sub2.method332((byte) 107,
                "Enter your username (V password)3");
        aJString_56 = aJString_55;
    }

    public Component aComponent50;

    public Canvas_Sub1(Component component) {
        aComponent50 = component;
    }

    public void update(Graphics graphics) {
        anInt52++;
        aComponent50.update(graphics);
    }

    public void paint(Graphics graphics) {
        anInt48++;
        aComponent50.paint(graphics);
    }

    public static void method36(int i) {
        aClass15_Sub1_46 = null;
        aJString_54 = null;
        aJString_55 = null;

        if (i <= 21) {
            method38(null, -42, (byte) 88, true, null);
        }

        aJString_53 = null;
        aClass37_Sub4_Sub9_Sub1_47 = null;
        aJString_56 = null;
        aJString_44 = null;
    }

    public static void method37(int i, int i_0_) {
        Class37_Sub9_Sub12.aBoolean3117 = false;
        Class3.anInt89 = -1;
        Class37_Sub7.anInt1904 = 1;
        Class37_Sub13.anInt2118 = 0;
        Class37_Sub4_Sub7.anInt2639 = -1;
        anInt51++;

        if (i < -103) {
            Class84.aClass15_1534 = null;
            Class37_Sub5.anInt1877 = i_0_;
        }
    }

    public static Class37_Sub4_Sub16 method38(JS5 class15, int i,
        byte i_1_, boolean bool, JS5 class15_2_) {
        try {
            anInt49++;

            boolean bool_3_ = true;
            int[] is = class15_2_.method119(i, (byte) 68);
            int i_4_ = 0;

            if (i_1_ < 119) {
                return null;
            }

            for (; (is.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
                byte[] is_5_ = class15_2_.method110(is[i_4_], 87, i);

                if (is_5_ == null) {
                    bool_3_ = false;
                } else {
                    int i_6_ = (0xff & is_5_[1]) |
                        ((is_5_[0] << 615078312) & 0xff00);
                    byte[] is_7_;

                    if (bool) {
                        is_7_ = class15.method110(i_6_, 100, 0);
                    } else {
                        is_7_ = class15.method110(0, 126, i_6_);
                    }

                    if (is_7_ == null) {
                        bool_3_ = false;
                    }
                }
            }

            if (!bool_3_) {
                return null;
            }

            try {
                return new Class37_Sub4_Sub16(class15_2_, class15, i, bool);
            } catch (Exception exception) {
                return null;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("j.B(" + ((class15 != null) ? "{...}" : "null") + ',' + i +
                ',' + i_1_ + ',' + bool + ',' +
                ((class15_2_ != null) ? "{...}" : "null") + ')'));
        }
    }
}
