/* AbstractDrawingArea - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;


public abstract class AbstractDrawingArea {
    public static JString aJString_729;
    public static JString aJString_730;
    public static int anInt731;
    public static int anInt733;
    public static JString aJString_736 = Class37_Sub2.method332((byte) 102,
            "m-Ochte sich mit Ihnen duellieren)3");
    public static int anInt737;
    public static JString aJString_738;
    public static int anInt739;
    public static int anInt740;
    public static JString aJString_741;
    public static int anInt742;
    public static int anInt743;
    public static boolean aBoolean744;
    public static boolean aBoolean746;

    static {
        anInt733 = -1;

        aJString_738 = Class37_Sub2.method332((byte) 122,
                "Lade Schrifts-=tze )2 ");
        aJString_730 = Class37_Sub2.method332((byte) 106, "runes");
        aJString_741 = Class37_Sub2.method332((byte) 126, "<img=0>");
        anInt740 = 0;
        aJString_729 = Class37_Sub2.method332((byte) 106, "event_opbase");
        aBoolean744 = false;
        aBoolean746 = false;
    }

    public int anInt732;
    public int anInt734;
    public Image image;
    public int[] anIntArray745;

    public abstract void method287(Component component, int i, int i_0_,
        byte i_1_);

    public static void resetStaticVariables(int i) {
        if (i >= 1) {
            aJString_738 = null;
            aJString_736 = null;
            aJString_741 = null;
            aJString_729 = null;
            aJString_730 = null;
        }
    }

    public static JString method289(int i, int i_2_, int i_3_, boolean bool) {
        if (((i_2_ ^ 0xffffffff) > -2) || ((i_2_ ^ 0xffffffff) < -37)) {
            i_2_ = 10;
        }

        anInt731++;

        int i_4_ = 1;

        for (int i_5_ = i_3_ / i_2_; (i_5_ ^ 0xffffffff) != -1; i_5_ /= i_2_)
            i_4_++;

        int i_6_ = i_4_;

        if (((i_3_ ^ 0xffffffff) > -1) || bool) {
            i_6_++;
        }

        byte[] is = new byte[i_6_];

        if ((i_3_ ^ 0xffffffff) > -1) {
            is[0] = (byte) 45;
        } else if (bool) {
            is[0] = (byte) 43;
        }

        if (i < 117) {
            return null;
        }

        for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_7_++) {
            int i_8_ = i_3_ % i_2_;
            i_3_ /= i_2_;

            if ((i_8_ ^ 0xffffffff) > -1) {
                i_8_ = -i_8_;
            }

            if (i_8_ > 9) {
                i_8_ += 39;
            }

            is[-1 + i_6_ + -i_7_] = (byte) (48 + i_8_);
        }

        JString jstring = new JString();
        jstring.charArray = is;
        jstring.length = i_6_;

        return jstring;
    }

    public abstract void method290(int i, Graphics graphics, int i_9_,
        boolean bool);

    public void method291(byte i) {
        anInt739++;
        Class37_Sub4_Sub9.method587(anIntArray745, anInt734, anInt732);

        if (i != -10) {
            resetStaticVariables(5);
        }
    }

    public abstract void draw(int srcX, int i, int srcHeight, int srcWidth,
        int srcY, Graphics graphics);
}
