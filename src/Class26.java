/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.math.BigInteger;


public class Class26 {
    public static JString aJString_649 = Class37_Sub2.method332((byte) 124,
            "<col=ffb000>");
    public static int anInt650;
    public static JString aJString_651 = Class37_Sub2.method332((byte) 101,
            "Sichtbare Karte vorbereitet)3");
    public static BigInteger aBigInteger652 = (new BigInteger(
            "7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789"));
    public static int anInt653;
    public static int anInt654;
    public static int[] anIntArray657;
    public static JString aJString_658 = (Class37_Sub2.method332((byte) 120,
            "Press (Wchange your password(W on front page)3"));
    public static long serverSessionKey;
    public static JString aJString_660;
    public static JString aJString_661;
    public static JString aJString_662;
    public static JString aJString_663;
    public static int[] anIntArray664;
    public static JString aJString_665;
    public static JString aJString_666;

    static {
        anIntArray657 = new int[2048];
        aJString_660 = Class37_Sub2.method332((byte) 106,
                "Unexpected server response)3");
        aJString_663 = aJString_660;
        aJString_662 = Class37_Sub2.method332((byte) 125, "mapmarker");

        aJString_661 = Class37_Sub2.method332((byte) 103,
                "Suche nach Updates )2 ");
        serverSessionKey = 0L;
        aJString_665 = aJString_658;
        anIntArray664 = new int[5];
        aJString_666 = Class37_Sub2.method332((byte) 126, "gleiten:");
    }

    public int anInt648;
    public int anInt655;
    public int anInt656;

    public static void method256(int i) {
        aJString_663 = null;
        anIntArray657 = null;
        aJString_658 = null;
        aJString_651 = null;
        aJString_649 = null;

        if (i != 28345) {
            serverSessionKey = 99L;
        }

        aBigInteger652 = null;
        aJString_666 = null;
        aJString_665 = null;
        anIntArray664 = null;
        aJString_662 = null;
        aJString_661 = null;
        aJString_660 = null;
    }

    public static byte[] method257(boolean bool, Object object, int i) {
        anInt650++;

        if (object == null) {
            return null;
        }

        if (object instanceof byte[]) {
            byte[] is = (byte[]) object;

            if (bool) {
                return Class39.method1059(is, (byte) 7);
            }

            return is;
        }

        if (object instanceof Class68) {
            Class68 class68 = (Class68) object;
            return class68.method1247(-1);
        }

        if (i != -9) {
            method259(-91, -92, -45);
        }

        throw new IllegalArgumentException();
    }

    public static void method258(int i, int i_0_, int i_1_, int i_2_, int i_3_,
        int i_4_, byte i_5_, int i_6_, Class18[] class18s) {
        anInt654++;

        int i_7_ = 110 / ((-83 - i_5_) / 37);

        for (int i_8_ = 0;
                (class18s.length ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
            Class18 class18 = class18s[i_8_];

            if ((class18 != null) &&
                    (!class18.aBoolean374 || (class18.anInt354 == 0) ||
                    class18.aBoolean452 ||
                    ((RuntimeException_Sub1.method1339(class18, 25) ^
                    0xffffffff) != -1) || (class18 == Class77.aClass18_1452)) &&
                    (class18.anInt394 == i_4_) &&
                    (!class18.aBoolean374 || !Class66.method1188(0, class18))) {
                int i_9_ = i_1_ + class18.anInt329;
                int i_10_ = class18.anInt415 - -i_2_;

                if (Class37_Sub7.aClass18_1894 == class18) {
                    RuntimeException_Sub1.anInt1626 = i_10_;
                    Class37_Sub5.anInt1875 = i_9_;
                    Class24.aBoolean609 = true;
                }

                int i_11_;
                int i_12_;
                int i_13_;
                int i_14_;

                if ((class18.anInt354 ^ 0xffffffff) != -3) {
                    if ((class18.anInt354 ^ 0xffffffff) == -10) {
                        int i_15_ = i_10_;
                        int i_16_ = i_9_;
                        int i_17_ = i_9_ - -class18.anInt441;
                        int i_18_ = class18.anInt353 + i_10_;

                        if ((i_16_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff)) {
                            int i_19_ = i_16_;
                            i_16_ = i_17_;
                            i_17_ = i_19_;
                        }

                        i_17_++;

                        if (i_15_ > i_18_) {
                            int i_20_ = i_15_;
                            i_15_ = i_18_;
                            i_18_ = i_20_;
                        }

                        i_13_ = (i > i_17_) ? i_17_ : i;
                        i_12_ = (((i_15_ ^ 0xffffffff) >= (i_0_ ^ 0xffffffff))
                            ? i_0_ : i_15_);
                        i_14_ = (i_16_ > i_3_) ? i_16_ : i_3_;
                        i_11_ = (((++i_18_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff))
                            ? i_18_ : i_6_);
                    } else {
                        i_12_ = (((i_10_ ^ 0xffffffff) < (i_0_ ^ 0xffffffff))
                            ? i_10_ : i_0_);
                        i_14_ = (((i_9_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff))
                            ? i_9_ : i_3_);

                        int i_21_ = class18.anInt441 + i_9_;
                        int i_22_ = class18.anInt353 + i_10_;
                        i_11_ = (i_22_ >= i_6_) ? i_6_ : i_22_;
                        i_13_ = (i <= i_21_) ? i : i_21_;
                    }
                } else {
                    i_11_ = i_6_;
                    i_12_ = i_0_;
                    i_13_ = i;
                    i_14_ = i_3_;
                }

                if (!class18.aBoolean374 ||
                        (((i_13_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff)) &&
                        (i_11_ > i_12_))) {
                    if ((class18.anInt376 ^ 0xffffffff) == -1338) {
                        Class73.method1274(class18, -1);
                    } else if ((class18.anInt376 ^ 0xffffffff) == -1339) {
                        Class83.method1311(i_9_, 75, i_10_);
                    } else {
                        if ((class18.anInt354 ^ 0xffffffff) == -1) {
                            if (!class18.aBoolean374 &&
                                    Class66.method1188(0, class18) &&
                                    (Class42.aClass18_942 != class18)) {
                                continue;
                            }

                            method258(i_13_, i_12_, i_9_ - class18.anInt371,
                                i_10_ - class18.anInt432, i_14_,
                                class18.anInt402, (byte) -124, i_11_, class18s);

                            if (class18.aClass18Array450 != null) {
                                method258(i_13_, i_12_,
                                    -class18.anInt371 + i_9_,
                                    -class18.anInt432 + i_10_, i_14_,
                                    class18.anInt402, (byte) 7, i_11_,
                                    class18.aClass18Array450);
                            }

                            Class37_Sub6 class37_sub6 = ((Class37_Sub6) (Class76.aClass13_1423.method100((byte) 106,
                                    (long) class18.anInt402)));

                            if (class37_sub6 != null) {
                                Class1.method39(i_12_, class37_sub6.anInt1884,
                                    i_9_, i_10_, i_13_, i_14_, -91, i_11_);
                            }
                        }

                        if (class18.aBoolean374) {
                            boolean bool;

                            if (((i_14_ ^ 0xffffffff) >= (Class37_Sub4_Sub7_Sub7.anInt3851 ^
                                    0xffffffff)) &&
                                    (Class37_Sub9_Sub1.anInt2914 >= i_12_) &&
                                    (i_13_ > Class37_Sub4_Sub7_Sub7.anInt3851) &&
                                    (i_11_ > Class37_Sub9_Sub1.anInt2914)) {
                                bool = true;
                            } else {
                                bool = false;
                            }

                            boolean bool_23_ = false;
                            boolean bool_24_ = false;

                            if ((Class60.anInt1140 == 1) && bool) {
                                bool_24_ = true;
                            }

                            if ((Class37_Sub9_Sub28.anInt3440 == 1) &&
                                    (Class33.anInt764 >= i_14_) &&
                                    (i_12_ <= Class37_Sub13.anInt2113) &&
                                    (i_13_ > Class33.anInt764) &&
                                    (i_11_ > Class37_Sub13.anInt2113)) {
                                bool_23_ = true;
                            }

                            if (bool_23_) {
                                Class37_Sub25.method1044((-i_9_ +
                                    Class33.anInt764), class18, (byte) -69,
                                    (Class37_Sub13.anInt2113) - i_10_);
                            }

                            if ((Class37_Sub7.aClass18_1894 != null) &&
                                    (Class37_Sub7.aClass18_1894 != class18) &&
                                    bool &&
                                    (Class36.method321(-124,
                                        RuntimeException_Sub1.method1339(
                                            class18, 25)))) {
                                Class37_Sub4_Sub12.aClass18_2773 = class18;
                            }

                            if (Class77.aClass18_1452 == class18) {
                                Class37_Sub4_Sub7_Sub1_Sub2.anInt3977 = i_9_;
                                Class32.aBoolean746 = true;
                                Class59.anInt1134 = i_10_;
                            }

                            if (class18.aBoolean452) {
                                if (bool &&
                                        ((Class37_Sub4_Sub7_Sub1_Sub1.anInt3945 ^
                                        0xffffffff) != -1) &&
                                        (class18.anObjectArray455 != null)) {
                                    Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                    class37_sub8.anInt1923 = (Class37_Sub4_Sub7_Sub1_Sub1.anInt3945);

                                    class37_sub8.anObjectArray1938 = class18.anObjectArray455;
                                    class37_sub8.aClass18_1925 = class18;
                                    Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -123,
                                        class37_sub8);
                                }

                                if ((Class37_Sub7.aClass18_1894 != null) ||
                                        (Class37_Sub25.aClass18_2285 != null) ||
                                        Class37_Sub20.aBoolean2220) {
                                    bool = false;
                                    bool_24_ = false;
                                    bool_23_ = false;
                                }

                                if (!class18.aBoolean427 && bool_23_) {
                                    class18.aBoolean427 = true;

                                    if (class18.anObjectArray430 != null) {
                                        Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                        class37_sub8.anObjectArray1938 = class18.anObjectArray430;

                                        class37_sub8.anInt1927 = Class33.anInt764 -
                                            i_9_;
                                        class37_sub8.aClass18_1925 = class18;

                                        class37_sub8.anInt1923 = Class37_Sub13.anInt2113 +
                                            -i_10_;
                                        Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -114,
                                            class37_sub8);
                                    }
                                }

                                if (class18.aBoolean427 && bool_24_ &&
                                        (class18.anObjectArray393 != null)) {
                                    Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                    class37_sub8.anObjectArray1938 = class18.anObjectArray393;

                                    class37_sub8.anInt1923 = -i_10_ +
                                        Class37_Sub9_Sub1.anInt2914;
                                    class37_sub8.aClass18_1925 = class18;

                                    class37_sub8.anInt1927 = (Class37_Sub4_Sub7_Sub7.anInt3851 -
                                        i_9_);
                                    Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -125,
                                        class37_sub8);
                                }

                                if (class18.aBoolean427 && !bool_24_) {
                                    class18.aBoolean427 = false;

                                    if (class18.anObjectArray418 != null) {
                                        Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                        class37_sub8.anInt1927 = -i_9_ +
                                            (Class37_Sub4_Sub7_Sub7.anInt3851);

                                        class37_sub8.anInt1923 = (-i_10_ +
                                            Class37_Sub9_Sub1.anInt2914);
                                        class37_sub8.aClass18_1925 = class18;

                                        class37_sub8.anObjectArray1938 = class18.anObjectArray418;
                                        Class17.aClass58_300.method1149((byte) -109,
                                            class37_sub8);
                                    }
                                }

                                if (bool_24_ &&
                                        (class18.anObjectArray425 != null)) {
                                    Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                    class37_sub8.anInt1927 = (Class37_Sub4_Sub7_Sub7.anInt3851 -
                                        i_9_);

                                    class37_sub8.anInt1923 = Class37_Sub9_Sub1.anInt2914 +
                                        -i_10_;

                                    class37_sub8.anObjectArray1938 = class18.anObjectArray425;
                                    class37_sub8.aClass18_1925 = class18;
                                    Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -113,
                                        class37_sub8);
                                }

                                if (!class18.aBoolean439 && bool) {
                                    class18.aBoolean439 = true;

                                    if (class18.anObjectArray429 != null) {
                                        Class37_Sub8 class37_sub8 = new Class37_Sub8();
                                        class37_sub8.aClass18_1925 = class18;

                                        class37_sub8.anObjectArray1938 = class18.anObjectArray429;

                                        class37_sub8.anInt1923 = (Class37_Sub9_Sub1.anInt2914 -
                                            i_10_);

                                        class37_sub8.anInt1927 = -i_9_ +
                                            (Class37_Sub4_Sub7_Sub7.anInt3851);
                                        Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -107,
                                            class37_sub8);
                                    }
                                }

                                if (class18.aBoolean439 && bool &&
                                        (class18.anObjectArray366 != null)) {
                                    Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                    class37_sub8.anInt1927 = (Class37_Sub4_Sub7_Sub7.anInt3851 -
                                        i_9_);
                                    class37_sub8.aClass18_1925 = class18;

                                    class37_sub8.anInt1923 = -i_10_ +
                                        Class37_Sub9_Sub1.anInt2914;

                                    class37_sub8.anObjectArray1938 = class18.anObjectArray366;
                                    Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -119,
                                        class37_sub8);
                                }

                                if (class18.aBoolean439 && !bool) {
                                    class18.aBoolean439 = false;

                                    if (class18.anObjectArray355 != null) {
                                        Class37_Sub8 class37_sub8 = new Class37_Sub8();
                                        class37_sub8.aClass18_1925 = class18;

                                        class37_sub8.anInt1927 = -i_9_ +
                                            (Class37_Sub4_Sub7_Sub7.anInt3851);

                                        class37_sub8.anObjectArray1938 = class18.anObjectArray355;

                                        class37_sub8.anInt1923 = (-i_10_ +
                                            Class37_Sub9_Sub1.anInt2914);
                                        Class17.aClass58_300.method1149((byte) -110,
                                            class37_sub8);
                                    }
                                }

                                if (class18.anObjectArray318 != null) {
                                    Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                    class37_sub8.anObjectArray1938 = class18.anObjectArray318;
                                    class37_sub8.aClass18_1925 = class18;
                                    Class37_Sub9_Sub9.aClass58_3068.method1149((byte) -120,
                                        class37_sub8);
                                }

                                if ((class18.anObjectArray347 != null) &&
                                        (class18.anInt382 < Class24.anInt615)) {
                                    if ((class18.anIntArray444 == null) ||
                                            (((-class18.anInt382 +
                                            Class24.anInt615) ^ 0xffffffff) < -33)) {
                                        Class37_Sub8 class37_sub8 = new Class37_Sub8();
                                        class37_sub8.aClass18_1925 = class18;

                                        class37_sub8.anObjectArray1938 = class18.anObjectArray347;
                                        Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -125,
                                            class37_sub8);
                                    } else {
while_56_: 
                                        for (int i_25_ = class18.anInt382;
                                                Class24.anInt615 > i_25_;
                                                i_25_++) {
                                            int i_26_ = (Class37_Sub9_Sub1.anIntArray2918[i_25_ &
                                                0x1f]);

                                            for (int i_27_ = 0;
                                                    ((class18.anIntArray444.length ^
                                                    0xffffffff) < (i_27_ ^
                                                    0xffffffff)); i_27_++) {
                                                if (i_26_ == (class18.anIntArray444[i_27_])) {
                                                    Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                                    class37_sub8.anObjectArray1938 = (class18.anObjectArray347);

                                                    class37_sub8.aClass18_1925 = class18;
                                                    Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -128,
                                                        class37_sub8);

                                                    break while_56_;
                                                }
                                            }
                                        }
                                    }

                                    class18.anInt382 = Class24.anInt615;
                                }

                                if ((class18.anObjectArray346 != null) &&
                                        (Class37_Sub4_Sub8.anInt2642 > class18.anInt428)) {
                                    if ((class18.anIntArray331 != null) &&
                                            (((-class18.anInt428 +
                                            Class37_Sub4_Sub8.anInt2642) ^
                                            0xffffffff) >= -33)) {
while_57_: 
                                        for (int i_28_ = class18.anInt428;
                                                ((Class37_Sub4_Sub8.anInt2642 ^
                                                0xffffffff) < (i_28_ ^
                                                0xffffffff)); i_28_++) {
                                            int i_29_ = (Class37_Sub9.anIntArray1964[0x1f &
                                                i_28_]);

                                            for (int i_30_ = 0;
                                                    ((i_30_ ^ 0xffffffff) > ((class18.anIntArray331).length ^
                                                    0xffffffff)); i_30_++) {
                                                if ((class18.anIntArray331[i_30_]) == i_29_) {
                                                    Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                                    class37_sub8.anObjectArray1938 = (class18.anObjectArray346);

                                                    class37_sub8.aClass18_1925 = class18;
                                                    Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -116,
                                                        class37_sub8);

                                                    break while_57_;
                                                }
                                            }
                                        }
                                    } else {
                                        Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                        class37_sub8.anObjectArray1938 = class18.anObjectArray346;
                                        class37_sub8.aClass18_1925 = class18;
                                        Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -103,
                                            class37_sub8);
                                    }

                                    class18.anInt428 = Class37_Sub4_Sub8.anInt2642;
                                }

                                if ((class18.anObjectArray416 != null) &&
                                        ((Class37_Sub9_Sub3.anInt2946 ^
                                        0xffffffff) < (class18.anInt399 ^
                                        0xffffffff))) {
                                    if ((class18.anIntArray375 != null) &&
                                            ((-class18.anInt399 +
                                            Class37_Sub9_Sub3.anInt2946) <= 32)) {
while_58_: 
                                        for (int i_31_ = class18.anInt399;
                                                ((Class37_Sub9_Sub3.anInt2946 ^
                                                0xffffffff) < (i_31_ ^
                                                0xffffffff)); i_31_++) {
                                            int i_32_ = (Class37_Sub9_Sub30.anIntArray3475[0x1f &
                                                i_31_]);

                                            for (int i_33_ = 0;
                                                    (i_33_ < (class18.anIntArray375).length);
                                                    i_33_++) {
                                                if (i_32_ == (class18.anIntArray375[i_33_])) {
                                                    Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                                    class37_sub8.aClass18_1925 = class18;

                                                    class37_sub8.anObjectArray1938 = (class18.anObjectArray416);
                                                    Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -118,
                                                        class37_sub8);

                                                    break while_58_;
                                                }
                                            }
                                        }
                                    } else {
                                        Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                        class37_sub8.anObjectArray1938 = class18.anObjectArray416;
                                        class37_sub8.aClass18_1925 = class18;
                                        Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -99,
                                            class37_sub8);
                                    }

                                    class18.anInt399 = Class37_Sub9_Sub3.anInt2946;
                                }

                                if ((Class77.anInt1447 > class18.anInt435) &&
                                        (class18.anObjectArray362 != null)) {
                                    Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                    class37_sub8.anObjectArray1938 = class18.anObjectArray362;
                                    class37_sub8.aClass18_1925 = class18;
                                    Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -113,
                                        class37_sub8);
                                }

                                if ((class18.anInt435 < Class37_Sub9_Sub32.anInt3509) &&
                                        (class18.anObjectArray328 != null)) {
                                    Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                    class37_sub8.anObjectArray1938 = class18.anObjectArray328;
                                    class37_sub8.aClass18_1925 = class18;
                                    Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -119,
                                        class37_sub8);
                                }

                                if ((Class42.anInt931 > class18.anInt435) &&
                                        (class18.anObjectArray357 != null)) {
                                    Class37_Sub8 class37_sub8 = new Class37_Sub8();
                                    class37_sub8.aClass18_1925 = class18;

                                    class37_sub8.anObjectArray1938 = class18.anObjectArray357;
                                    Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -126,
                                        class37_sub8);
                                }

                                if ((Class37_Sub6.anInt1889 > class18.anInt435) &&
                                        (class18.anObjectArray327 != null)) {
                                    Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                    class37_sub8.anObjectArray1938 = class18.anObjectArray327;
                                    class37_sub8.aClass18_1925 = class18;
                                    Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -106,
                                        class37_sub8);
                                }

                                if ((Class37_Sub9_Sub37.anInt3602 > class18.anInt435) &&
                                        (class18.anObjectArray352 != null)) {
                                    Class37_Sub8 class37_sub8 = new Class37_Sub8();

                                    class37_sub8.anObjectArray1938 = class18.anObjectArray352;
                                    class37_sub8.aClass18_1925 = class18;
                                    Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -116,
                                        class37_sub8);
                                }

                                class18.anInt435 = Class83.anInt1515;

                                if (class18.anObjectArray349 != null) {
                                    for (int i_34_ = 0;
                                            Class39.anInt872 > i_34_;
                                            i_34_++) {
                                        Class37_Sub8 class37_sub8 = new Class37_Sub8();
                                        class37_sub8.aClass18_1925 = class18;

                                        class37_sub8.anInt1928 = JString.anIntArray1659[i_34_];

                                        class37_sub8.anInt1929 = (Class37_Sub9_Sub10.anIntArray3091[i_34_]);

                                        class37_sub8.anObjectArray1938 = class18.anObjectArray349;
                                        Class37_Sub9_Sub20.aClass58_3296.method1149((byte) -121,
                                            class37_sub8);
                                    }
                                }
                            }
                        }

                        if (!class18.aBoolean374) {
                            if ((Class37_Sub7.aClass18_1894 != null) ||
                                    (Class37_Sub25.aClass18_2285 != null) ||
                                    Class37_Sub20.aBoolean2220) {
                                break;
                            }

                            if (((class18.anInt414 >= 0) ||
                                    ((class18.anInt396 ^ 0xffffffff) != -1)) &&
                                    (i_14_ <= Class37_Sub4_Sub7_Sub7.anInt3851) &&
                                    (i_12_ <= Class37_Sub9_Sub1.anInt2914) &&
                                    (Class37_Sub4_Sub7_Sub7.anInt3851 < i_13_) &&
                                    ((i_11_ ^ 0xffffffff) < (Class37_Sub9_Sub1.anInt2914 ^
                                    0xffffffff))) {
                                if (class18.anInt414 >= 0) {
                                    Class42.aClass18_942 = class18s[class18.anInt414];
                                } else {
                                    Class42.aClass18_942 = class18;
                                }
                            }

                            if (((class18.anInt354 ^ 0xffffffff) == -9) &&
                                    ((Class37_Sub4_Sub7_Sub7.anInt3851 ^
                                    0xffffffff) <= (i_14_ ^ 0xffffffff)) &&
                                    (Class37_Sub9_Sub1.anInt2914 >= i_12_) &&
                                    (Class37_Sub4_Sub7_Sub7.anInt3851 < i_13_) &&
                                    ((Class37_Sub9_Sub1.anInt2914 ^ 0xffffffff) > (i_11_ ^
                                    0xffffffff))) {
                                RSSocket.aClass18_491 = class18;
                            }

                            if (class18.anInt348 > class18.anInt353) {
                                Class85.method1320(class18,
                                    class18.anInt441 + i_9_, 34,
                                    class18.anInt353, class18.anInt348,
                                    Class37_Sub4_Sub7_Sub7.anInt3851, i_10_,
                                    Class37_Sub9_Sub1.anInt2914);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void method259(int i, int i_35_, int i_36_) {
        anInt653++;

        if (Class37_Sub10.method927(i, 27323) && (i_36_ < -123)) {
            Class37_Sub9_Sub37.method923(-7251,
                (Class37_Sub9_Sub29.aClass18ArrayArray3454[i]), i_35_);
        }
    }
}
