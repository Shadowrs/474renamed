/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class RSApplet implements MouseListener, MouseMotionListener,
    FocusListener {
    public static int anInt170;
    public static int[] anIntArray171;
    public static int anInt172;
    public static int anInt173;
    public static int anInt174;
    public static int anInt175;
    public static int[] anIntArray176 = new int[200];
    public static JString aJString_177;
    public static int anInt178 = 0;
    public static int anInt179;
    public static JString aJString_180;
    public static int anInt181;
    public static int anInt182;
    public static int anInt183;
    public static int anInt184;
    public static int anInt185;
    public static int anInt186;
    public static int anInt187;
    public static int anInt188;
    public static int anInt189;

    static {
        anInt173 = 0;
        anIntArray171 = new int[] { 1, 0, -1, 0 };
        aJString_177 = Class37_Sub2.method332((byte) 127,
                "Geben Sie Ihren Benutzernamen");
        aJString_180 = Class37_Sub2.method332((byte) 101, "Hier wechseln");
    }

    public void focusGained(FocusEvent focusevent) {
        anInt189++;
    }

    public static void method81(byte i) {
        aJString_180 = null;
        anIntArray171 = null;
        aJString_177 = null;

        if (i != 91) {
            anIntArray176 = null;
        }

        anIntArray176 = null;
    }

    public synchronized void mouseDragged(MouseEvent mouseevent) {
        anInt175++;

        if (Class65.aClass9_1221 != null) {
            PacketParser.anInt3274 = 0;
            Class37_Sub9_Sub17.anInt3215 = mouseevent.getX();
            Class37_Sub9_Sub23.anInt3359 = mouseevent.getY();
        }
    }

    public synchronized void mousePressed(MouseEvent mouseevent) {
        if (Class65.aClass9_1221 != null) {
            PacketParser.anInt3274 = 0;
            PacketParser.anInt3258 = mouseevent.getX();
            Class1.anInt67 = mouseevent.getY();
            Class87.aLong1588 = Class71.method1263((byte) -80);

            if (mouseevent.isMetaDown()) {
                Class37_Sub9_Sub29.anInt3452 = 2;
                Class71.anInt1356 = 2;
            } else {
                Class37_Sub9_Sub29.anInt3452 = 1;
                Class71.anInt1356 = 1;
            }
        }

        if (mouseevent.isPopupTrigger()) {
            mouseevent.consume();
        }

        anInt183++;
    }

    public synchronized void mouseExited(MouseEvent mouseevent) {
        if (Class65.aClass9_1221 != null) {
            PacketParser.anInt3274 = 0;
            Class37_Sub9_Sub17.anInt3215 = -1;
            Class37_Sub9_Sub23.anInt3359 = -1;
        }

        anInt187++;
    }

    public static void method82(int i,
        Class37_Sub4_Sub7_Sub1 class37_sub4_sub7_sub1) {
        if (((Class37_Sub7.anInt1898 ^ 0xffffffff) == (class37_sub4_sub7_sub1.anInt3667 ^
                0xffffffff)) || (class37_sub4_sub7_sub1.anInt3655 == -1) ||
                (class37_sub4_sub7_sub1.anInt3689 != 0) ||
                (((class37_sub4_sub7_sub1.anInt3680 + 1) ^ 0xffffffff) < ((Class37_Sub9_Sub22.method861(
                    125, class37_sub4_sub7_sub1.anInt3655).anIntArray2780[class37_sub4_sub7_sub1.anInt3677]) ^
                0xffffffff))) {
            int i_0_ = (class37_sub4_sub7_sub1.anInt3667 -
                class37_sub4_sub7_sub1.anInt3648);
            int i_1_ = Class37_Sub7.anInt1898 +
                -class37_sub4_sub7_sub1.anInt3648;
            int i_2_ = ((class37_sub4_sub7_sub1.anInt3683 * 64) +
                (128 * class37_sub4_sub7_sub1.anInt3684));
            int i_3_ = ((64 * class37_sub4_sub7_sub1.anInt3683) +
                (class37_sub4_sub7_sub1.anInt3639 * 128));
            int i_4_ = ((64 * class37_sub4_sub7_sub1.anInt3683) +
                (128 * class37_sub4_sub7_sub1.anInt3643));

            class37_sub4_sub7_sub1.anInt3642 = ((i_1_ * i_4_) +
                ((-i_1_ + i_0_) * i_3_)) / i_0_;

            int i_5_ = ((class37_sub4_sub7_sub1.anInt3688 * 128) +
                (64 * class37_sub4_sub7_sub1.anInt3683));

            class37_sub4_sub7_sub1.anInt3666 = ((i_5_ * i_1_) +
                (i_2_ * (-i_1_ + i_0_))) / i_0_;
        }

        if ((class37_sub4_sub7_sub1.anInt3661 ^ 0xffffffff) == -1) {
            class37_sub4_sub7_sub1.anInt3681 = 1024;
        }

        anInt182++;
        class37_sub4_sub7_sub1.anInt3665 = 0;

        if ((class37_sub4_sub7_sub1.anInt3661 ^ 0xffffffff) == -2) {
            class37_sub4_sub7_sub1.anInt3681 = 1536;
        }

        if (class37_sub4_sub7_sub1.anInt3661 == 2) {
            class37_sub4_sub7_sub1.anInt3681 = 0;
        }

        if ((class37_sub4_sub7_sub1.anInt3661 ^ 0xffffffff) == -4) {
            class37_sub4_sub7_sub1.anInt3681 = 512;
        }

        class37_sub4_sub7_sub1.anInt3663 = class37_sub4_sub7_sub1.anInt3681;

        if (i != 128) {
            aJString_177 = null;
        }
    }

    public synchronized void mouseMoved(MouseEvent mouseevent) {
        if (Class65.aClass9_1221 != null) {
            PacketParser.anInt3274 = 0;
            Class37_Sub9_Sub17.anInt3215 = mouseevent.getX();
            Class37_Sub9_Sub23.anInt3359 = mouseevent.getY();
        }

        anInt188++;
    }

    public synchronized void mouseEntered(MouseEvent mouseevent) {
        anInt170++;

        if (Class65.aClass9_1221 != null) {
            PacketParser.anInt3274 = 0;
            Class37_Sub9_Sub17.anInt3215 = mouseevent.getX();
            Class37_Sub9_Sub23.anInt3359 = mouseevent.getY();
        }
    }

    public synchronized void mouseReleased(MouseEvent mouseevent) {
        anInt181++;

        if (Class65.aClass9_1221 != null) {
            PacketParser.anInt3274 = 0;
            Class71.anInt1356 = 0;
        }

        if (mouseevent.isPopupTrigger()) {
            mouseevent.consume();
        }
    }

    public synchronized void focusLost(FocusEvent focusevent) {
        if (Class65.aClass9_1221 != null) {
            Class71.anInt1356 = 0;
        }

        anInt186++;
    }

    public void mouseClicked(MouseEvent mouseevent) {
        if (mouseevent.isPopupTrigger()) {
            mouseevent.consume();
        }

        anInt185++;
    }
}
