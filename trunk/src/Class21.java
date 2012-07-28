/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Class21 implements KeyListener, FocusListener {
    public static int anInt558 = -1;
    public static JString aJString_559 = Class37_Sub2.method332((byte) 110,
            "Zu viele Verbindungen von Ihrer Adresse)3");
    public static JString aJString_560;
    public static JString aJString_561 = Class37_Sub2.method332((byte) 111,
            "Fps:");
    public static int anInt562;
    public static int anInt563;
    public static int anInt564;
    public static int anInt565;
    public static int anInt566;
    public static int anInt567;
    public static Class32 aClass32_568;

    static {
        aJString_560 = (Class37_Sub2.method332((byte) 113,
                " steht bereits auf Ihrer Ignorieren)2Liste(Q"));
    }

    public synchronized void keyPressed(KeyEvent keyevent) {
        if (Class37_Sub9_Sub13.aClass21_3126 != null) {
            Class37_Sub13.anInt2120 = 0;

            int i = keyevent.getKeyCode();

            if ((i < 0) ||
                    ((i ^ 0xffffffff) <= (Class37_Sub5.anIntArray1879.length ^
                    0xffffffff))) {
                i = -1;
            } else {
                i = Class37_Sub5.anIntArray1879[i];

                if ((i & 0x80) != 0) {
                    i = -1;
                }
            }

            if (((Class13.anInt230 ^ 0xffffffff) <= -1) && (i >= 0)) {
                PacketParser.anIntArray3271[Class13.anInt230] = i;
                Class13.anInt230 = 0x7f & (1 + Class13.anInt230);

                if ((Class37_Sub9_Sub26.anInt3390 ^ 0xffffffff) == (Class13.anInt230 ^
                        0xffffffff)) {
                    Class13.anInt230 = -1;
                }
            }

            if (i >= 0) {
                int i_0_ = (Class37_Sub9_Sub16.anInt3208 + 1) & 0x7f;

                if ((Class37_Sub9_Sub21.anInt3314 ^ 0xffffffff) != (i_0_ ^
                        0xffffffff)) {
                    Class86.anIntArray1577[Class37_Sub9_Sub16.anInt3208] = i;

                    Class37_Sub9_Sub31.anIntArray3485[(Class37_Sub9_Sub16.anInt3208)] = -1;
                    Class37_Sub9_Sub16.anInt3208 = i_0_;
                }
            }

            int i_1_ = keyevent.getModifiers();

            if ((((0xa & i_1_) ^ 0xffffffff) != -1) ||
                    ((i ^ 0xffffffff) == -86) || (i == 10)) {
                keyevent.consume();
            }
        }

        anInt567++;
    }

    public static void method228(int i) {
        aJString_561 = null;
        aClass32_568 = null;
        aJString_560 = null;

        if (i != 0) {
            aJString_561 = null;
        }

        aJString_559 = null;
    }

    public synchronized void focusLost(FocusEvent focusevent) {
        anInt565++;

        if (Class37_Sub9_Sub13.aClass21_3126 != null) {
            Class13.anInt230 = -1;
        }
    }

    public synchronized void keyReleased(KeyEvent keyevent) {
        if (Class37_Sub9_Sub13.aClass21_3126 != null) {
            Class37_Sub13.anInt2120 = 0;

            int i = keyevent.getKeyCode();

            if ((i >= 0) && (Class37_Sub5.anIntArray1879.length > i)) {
                i = ~0x80 & Class37_Sub5.anIntArray1879[i];
            } else {
                i = -1;
            }

            if ((Class13.anInt230 >= 0) && ((i ^ 0xffffffff) <= -1)) {
                PacketParser.anIntArray3271[Class13.anInt230] = i ^
                    0xffffffff;
                Class13.anInt230 = (1 + Class13.anInt230) & 0x7f;

                if ((Class13.anInt230 ^ 0xffffffff) == (Class37_Sub9_Sub26.anInt3390 ^
                        0xffffffff)) {
                    Class13.anInt230 = -1;
                }
            }
        }

        anInt566++;
        keyevent.consume();
    }

    public void keyTyped(KeyEvent keyevent) {
        anInt564++;

        if (Class37_Sub9_Sub13.aClass21_3126 != null) {
            int i = Class80.method1300(keyevent, -15009);

            if (i >= 0) {
                int i_2_ = 0x7f & (Class37_Sub9_Sub16.anInt3208 - -1);

                if (i_2_ != Class37_Sub9_Sub21.anInt3314) {
                    Class86.anIntArray1577[Class37_Sub9_Sub16.anInt3208] = -1;

                    Class37_Sub9_Sub31.anIntArray3485[(Class37_Sub9_Sub16.anInt3208)] = i;
                    Class37_Sub9_Sub16.anInt3208 = i_2_;
                }
            }
        }

        keyevent.consume();
    }

    public void focusGained(FocusEvent focusevent) {
        anInt563++;
    }
}
