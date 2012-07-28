/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class Class72 {
    public static int anInt1370;
    public static Class65 aClass65_1371 = new Class65(30);
    public static int anInt1372;
    public static int anInt1373;
    public static int anInt1374;
    public static JString aJString_1375 = Class37_Sub2.method332((byte) 122,
            "0(U");
    public static int anInt1376 = 0;
    public static Class37_Sub4_Sub9_Sub3[] aClass37_Sub4_Sub9_Sub3Array1377;

    public static void method1267(int i) {
        if (i == 2) {
            if (Class37_Sub4_Sub7.aClass24_2638 != null) {
                Class37_Sub4_Sub7.aClass24_2638.method248(101);
            }

            if (Class88.aClass24_1605 != null) {
                Class88.aClass24_1605.method248(i ^ 0x60);
            }

            anInt1374++;
        }
    }

    public static void method1268(long l, int i) {
        try {
            anInt1372++;

            if ((l != 0L) && (i == 122)) {
                for (int i_0_ = 0;
                        (RSApplet.anInt173 ^ 0xffffffff) < (i_0_ ^ 0xffffffff);
                        i_0_++) {
                    if ((Class71.aLongArray1360[i_0_] ^ 0xffffffffffffffffL) == (l ^
                            0xffffffffffffffffL)) {
                        RSApplet.anInt173--;

                        for (int i_1_ = i_0_;
                                ((RSApplet.anInt173 ^ 0xffffffff) < (i_1_ ^
                                0xffffffff)); i_1_++) {
                            Class69.aJStringArray1342[i_1_] = Class69.aJStringArray1342[i_1_ -
                                -1];

                            RSApplet.anIntArray176[i_1_] = RSApplet.anIntArray176[i_1_ -
                                -1];

                            Class71.aLongArray1360[i_1_] = Class71.aLongArray1360[i_1_ +
                                1];

                            Class37_Sub9_Sub31.anIntArray3484[i_1_] = Class37_Sub9_Sub31.anIntArray3484[i_1_ -
                                -1];
                        }

                        Class37_Sub9_Sub32.anInt3509 = Class83.anInt1515;
                        Class37_Sub4_Sub7_Sub1_Sub1.anInt3958++;
                        Class42.aStream_Sub1_936.method989(i +
                            -1494101239, 122);
                        Class42.aStream_Sub1_936.method949(l, (byte) -128);

                        break;
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("sf.D(" + l + ',' + i + ')'));
        }
    }

    public static void method1269(int i) {
        aClass37_Sub4_Sub9_Sub3Array1377 = null;
        aClass65_1371 = null;

        if (i <= 45) {
            aClass37_Sub4_Sub9_Sub3Array1377 = null;
        }

        aJString_1375 = null;
    }

    public static void method1270(JString jstring, Color color, int i, int i_2_) {
        try {
            try {
                Graphics graphics = Class37_Sub9.aCanvas1967.getGraphics();

                if (Class37_Sub9_Sub37.aFont3606 == null) {
                    Class37_Sub9_Sub37.aFont3606 = new Font("Helvetica", 1, 13);

                    Class88.aFontMetrics1598 = Class37_Sub9.aCanvas1967.getFontMetrics(Class37_Sub9_Sub37.aFont3606);
                }

                if (Class4.aBoolean93) {
                    Class4.aBoolean93 = false;
                    graphics.setColor(Color.black);
                    graphics.fillRect(0, 0, Class73.anInt1393, Class46.anInt980);
                }

                if (color == null) {
                    color = new Color(140, 17, 17);
                }

                try {
                    if (Class37_Sub6.anImage1885 == null) {
                        Class37_Sub6.anImage1885 = Class37_Sub9.aCanvas1967.createImage(304,
                                34);
                    }

                    Graphics graphics_3_ = Class37_Sub6.anImage1885.getGraphics();
                    graphics_3_.setColor(color);
                    graphics_3_.drawRect(0, 0, 303, 33);
                    graphics_3_.fillRect(2, 2, 3 * i_2_, 30);
                    graphics_3_.setColor(Color.black);
                    graphics_3_.drawRect(1, i, 301, 31);
                    graphics_3_.fillRect((3 * i_2_) + 2, 2, -(3 * i_2_) + 300,
                        30);
                    graphics_3_.setFont(Class37_Sub9_Sub37.aFont3606);
                    graphics_3_.setColor(Color.white);
                    jstring.method180(graphics_3_, i + 47,
                        (-jstring.method174((Class88.aFontMetrics1598), 123) +
                        304) / 2, 22);
                    graphics.drawImage(Class37_Sub6.anImage1885,
                        (Class73.anInt1393 / 2) + -152,
                        -18 + (Class46.anInt980 / 2), null);
                } catch (Exception exception) {
                    int i_4_ = -152 + (Class73.anInt1393 / 2);
                    int i_5_ = (Class46.anInt980 / 2) + -18;
                    graphics.setColor(color);
                    graphics.drawRect(i_4_, i_5_, 303, 33);
                    graphics.fillRect(2 + i_4_, i_5_ + 2, 3 * i_2_, 30);
                    graphics.setColor(Color.black);
                    graphics.drawRect(1 + i_4_, i_5_ - -1, 301, 31);
                    graphics.fillRect(2 + (i_4_ - -(3 * i_2_)), i_5_ - -2,
                        -(3 * i_2_) + 300, 30);
                    graphics.setFont(Class37_Sub9_Sub37.aFont3606);
                    graphics.setColor(Color.white);
                    jstring.method180(graphics, i + 47,
                        ((304 +
                        -jstring.method174(Class88.aFontMetrics1598, 113)) / 2) +
                        i_4_, 22 + i_5_);
                }
            } catch (Exception exception) {
                Class37_Sub9.aCanvas1967.repaint();
            }

            anInt1370++;
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("sf.A(" + ((jstring != null) ? "{...}" : "null") + ',' +
                ((color != null) ? "{...}" : "null") + ',' + i + ',' + i_2_ +
                ')'));
        }
    }
}
