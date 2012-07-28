/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class46 {
    public static int anInt979;
    public static int anInt980;
    public static int anInt981;
    public static int anInt982;
    public static int anInt983;
    public static int anInt984;
    public static JString aJString_985 = (Class37_Sub2.method332((byte) 118,
            "Bitte wenden Sie sich an den Kundendienst)3"));
    public static int anInt986;
    public static Class37_Sub4_Sub9_Sub1 aClass37_Sub4_Sub9_Sub1_987;
    public static int[] anIntArray988 = new int[50];
    public static int anInt989;

    public static void method1102(Class18 class18, int i) {
        if (i != 10) {
            method1108(-26, (byte) -88);
        }

        anInt979++;

        int i_0_ = class18.anInt376;

        if (i_0_ == 324) {
            if ((Class37_Sub9_Sub8.anInt3063 ^ 0xffffffff) == 0) {
                Class37_Sub3_Sub1.anInt2321 = class18.anInt400;
                Class37_Sub9_Sub8.anInt3063 = class18.anInt385;
            }

            if (Class57.aClass29_1098.aBoolean700) {
                class18.anInt385 = Class37_Sub9_Sub8.anInt3063;
            } else {
                class18.anInt385 = Class37_Sub3_Sub1.anInt2321;
            }
        } else if (i_0_ == 325) {
            if (Class37_Sub9_Sub8.anInt3063 == -1) {
                Class37_Sub9_Sub8.anInt3063 = class18.anInt385;
                Class37_Sub3_Sub1.anInt2321 = class18.anInt400;
            }

            if (Class57.aClass29_1098.aBoolean700) {
                class18.anInt385 = Class37_Sub3_Sub1.anInt2321;
            } else {
                class18.anInt385 = Class37_Sub9_Sub8.anInt3063;
            }
        } else if ((i_0_ ^ 0xffffffff) == -328) {
            class18.anInt319 = 150;

            class18.anInt405 = (0x7ff &
                (int) (Math.sin((double) Class37_Sub7.anInt1898 / 40.0) * 256.0));
            class18.anInt408 = 5;
            class18.anInt369 = 0;
        } else if ((i_0_ ^ 0xffffffff) == -329) {
            class18.anInt319 = 150;

            class18.anInt405 = (int) (Math.sin((double) Class37_Sub7.anInt1898 / 40.0) * 256.0) &
                0x7ff;
            class18.anInt408 = 5;
            class18.anInt369 = 1;
        }
    }

    public static void method1103(boolean bool) {
        aClass37_Sub4_Sub9_Sub1_987 = null;
        aJString_985 = null;
        anIntArray988 = null;

        if (bool != false) {
            aClass37_Sub4_Sub9_Sub1_987 = null;
        }
    }

    public static Class37_Sub4_Sub9_Sub1[] method1104(Class15 class15,
        JString jstring, int i, JString jstring_1_) {
        try {
            int i_2_ = class15.method123((byte) 32, jstring_1_);
            anInt982++;

            if (i != 999999999) {
                return null;
            }

            int i_3_ = class15.method128(jstring, -123, i_2_);

            return Class15_Sub1.method140(i_2_, i_3_, (byte) 0, class15);
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("na.D(" + ((class15 != null) ? "{...}" : "null") + ',' +
                ((jstring != null) ? "{...}" : "null") + ',' + i + ',' +
                ((jstring_1_ != null) ? "{...}" : "null") + ')'));
        }
    }

    public static JString method1105(int i, byte i_4_) {
        anInt984++;

        if (i_4_ > -114) {
            method1108(70, (byte) -14);
        }

        if (i < 999999999) {
            return Class37_Sub9_Sub24.method870(i, (byte) -114);
        }

        return Class37_Sub9_Sub13.aJString_3129;
    }

    public static boolean method1106(int i) {
        anInt986++;

        synchronized (Class37_Sub9_Sub13.aClass21_3126) {
            if (Class37_Sub9_Sub21.anInt3314 == Class37.anInt820) {
                return false;
            }

            if (i != 0) {
                return false;
            }

            Class37_Sub4_Sub3.anInt2560 = Class86.anIntArray1577[Class37_Sub9_Sub21.anInt3314];
            Class88.anInt1600 = (Class37_Sub9_Sub31.anIntArray3485[Class37_Sub9_Sub21.anInt3314]);

            Class37_Sub9_Sub21.anInt3314 = 0x7f &
                (Class37_Sub9_Sub21.anInt3314 - -1);

            return true;
        }
    }

    public static int method1107(byte[] is, byte i, int i_5_) {
        int i_6_ = -75 % ((i - -40) / 53);
        anInt983++;

        return Class85.method1319(is, 0, i_5_, 448779536);
    }

    public static ItemDef method1108(int i, byte i_7_) {
        ItemDef itemdef = ((ItemDef) Class37_Sub9_Sub3.aClass65_2940.method1181((byte) 16,
                (long) i));
        anInt981++;

        if (i_7_ <= 76) {
            return null;
        }

        if (itemdef != null) {
            return itemdef;
        }

        byte[] is = Class37_Sub9_Sub11.aClass15_3099.method131(i, 10, 1);
        itemdef = new ItemDef();
        itemdef.anInt2468 = i;

        if (is != null) {
            itemdef.method441(2000, new Stream(is));
        }

        itemdef.method452((byte) 118);

        if ((itemdef.anInt2462 ^ 0xffffffff) != 0) {
            itemdef.method443(method1108(
                    itemdef.anInt2462, (byte) 127),
                method1108(itemdef.anInt2424, (byte) 101), (byte) 117);
        }

        if (!Class37_Sub4_Sub10.aBoolean2688 && itemdef.aBoolean2509) {
            itemdef.aBoolean2421 = false;
            itemdef.anInt2504 = 0;
            itemdef.aJStringArray2459 = null;
            itemdef.aJStringArray2435 = null;
            itemdef.aJString_2458 = Class37_Sub18.aJString_2193;
        }

        Class37_Sub9_Sub3.aClass65_2940.method1179((long) i, -4,
            itemdef);

        return itemdef;
    }
}
