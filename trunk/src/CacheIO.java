/* CacheIO - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class CacheIO {
    public static Class15_Sub1 aClass15_Sub1_1330;
    public static JString aJString_1332 = Class37_Sub2.method332((byte) 101,
            "Your account has been disabled)3");
    public static JString aJString_1333 = aJString_1332;
    public static int anInt1334;
    public static Class15_Sub1 aClass15_Sub1_1335;
    public static JString aJString_1336 = Class37_Sub2.method332((byte) 121,
            ": ");
    public static int anInt1337;
    public static JString aJString_1338 = Class37_Sub2.method332((byte) 104,
            "<col=00ffff>");
    public static JString aJString_1339;
    public static int anInt1340;
    public static JString[] aJStringArray1342 = new JString[200];
    public static JString aJString_1343;
    public static int anInt1344;
    public static JString aJString_1346;
    public static JString aJString_1347 = Class37_Sub2.method332((byte) 127,
            "Der Server wird gerade aktualisiert)3");
    public static int anInt1348;
    public static JString aJString_1349;

    static {
        aJString_1343 = Class37_Sub2.method332((byte) 102,
                "Error loading your profile)3");
        aJString_1339 = aJString_1343;

        aJString_1349 = Class37_Sub2.method332((byte) 110, "Loaded interfaces");
        aJString_1346 = aJString_1349;
    }

    public Class42 aClass42_1331 = null;
    public int anInt1341 = 65000;
    public int anInt1345;
    public Class42 aClass42_1350 = null;

    public CacheIO(int i, Class42 class42, Class42 class42_22_, int i_23_) {
        try {
            anInt1341 = i_23_;
            aClass42_1331 = class42_22_;
            anInt1345 = i;
            aClass42_1350 = class42;
        } catch (RuntimeException runtimeexception) {
            throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
                ("s.<init>(" + i + ',' + ((class42 != null) ? "{...}" : "null") +
                ',' + ((class42_22_ != null) ? "{...}" : "null") + ',' + i_23_ +
                ')'));
        }
    }

    public String toString() {
        anInt1334++;

        return "Cache:" + anInt1345;
    }

    public boolean method1250(byte[] is, int i, boolean bool, int i_0_, int i_1_) {
        anInt1340++;

        synchronized (aClass42_1350) {
            try {
                if (i_0_ != 20356) {
                    method1250(null, 64, false, 103, 75);
                }

                int i_2_;

                if (bool) {
                    if ((long) ((i_1_ * 6) - -6) > aClass42_1331.method1083(
                                (byte) -110)) {
                        return false;
                    }

                    aClass42_1331.seek((long) (i_1_ * 6), 0);
                    aClass42_1331.read(0, (byte) 99, 6,
                        Login.aByteArray779);
                    i_2_ = (((Login.aByteArray779[5] & 0xff) +
                        ((Login.aByteArray779[3] & 0xff) << 1435711184)) -
                        -((Login.aByteArray779[4] << 1284305800) & 0xff00));

                    if ((i_2_ <= 0) ||
                            (((long) i_2_ ^ 0xffffffffffffffffL) < ((aClass42_1350.method1083(
                                (byte) -102) / 520L) ^ 0xffffffffffffffffL))) {
                        return false;
                    }
                } else {
                    i_2_ = (int) ((aClass42_1350.method1083((byte) -83) -
                        -519L) / 520L);

                    if (i_2_ == 0) {
                        i_2_ = 1;
                    }
                }

                Login.aByteArray779[2] = (byte) i;
                Login.aByteArray779[3] = (byte) (i_2_ >> -658673328);

                int i_3_ = 0;
                Login.aByteArray779[4] = (byte) (i_2_ >> -55358808);
                Login.aByteArray779[1] = (byte) (i >> 1797883368);
                Login.aByteArray779[0] = (byte) (i >> 26733136);
                Login.aByteArray779[5] = (byte) i_2_;
                aClass42_1331.seek((long) (6 * i_1_), i_0_ + -20356);
                aClass42_1331.method1082(Login.aByteArray779, 0, -128, 6);

                int i_4_ = 0;
                int i_5_;

                for (; i > i_3_; i_3_ += i_5_) {
                    int i_6_ = 0;

                    if (bool) {
                        aClass42_1350.seek((long) (520 * i_2_), 0);

                        try {
                            aClass42_1350.read(0, (byte) 99, 8,
                                Login.aByteArray779);
                        } catch (java.io.EOFException eofexception) {
                            break;
                        }

                        i_6_ = ((((Login.aByteArray779[5] << -1208504184) &
                            0xff00) +
                            ((Login.aByteArray779[4] << 1312285680) &
                            0xff0000)) - -(0xff & Login.aByteArray779[6]));

                        i_5_ = (((Login.aByteArray779[0] & 0xff) << 535461064) -
                            -(0xff & Login.aByteArray779[1]));

                        int i_7_ = ((0xff & Login.aByteArray779[3]) +
                            ((0xff & Login.aByteArray779[2]) << 1594561224));
                        int i_8_ = Login.aByteArray779[7] & 0xff;

                        if (((i_5_ ^ 0xffffffff) != (i_1_ ^ 0xffffffff)) ||
                                (i_4_ != i_7_) ||
                                ((i_8_ ^ 0xffffffff) != (anInt1345 ^
                                0xffffffff))) {
                            return false;
                        }

                        if ((i_6_ < 0) ||
                                ((long) i_6_ > (aClass42_1350.method1083(
                                    (byte) -54) / 520L))) {
                            return false;
                        }
                    }

                    i_5_ = i - i_3_;

                    if ((i_6_ ^ 0xffffffff) == -1) {
                        bool = false;
                        i_6_ = (int) ((aClass42_1350.method1083((byte) -118) -
                            -519L) / 520L);

                        if (i_6_ == 0) {
                            i_6_++;
                        }

                        if ((i_6_ ^ 0xffffffff) == (i_2_ ^ 0xffffffff)) {
                            i_6_++;
                        }
                    }

                    Login.aByteArray779[7] = (byte) anInt1345;
                    Login.aByteArray779[0] = (byte) (i_1_ >> 1317249832);
                    Login.aByteArray779[2] = (byte) (i_4_ >> -1155043800);
                    Login.aByteArray779[3] = (byte) i_4_;

                    if ((-i_3_ + i) <= 512) {
                        i_6_ = 0;
                    }

                    Login.aByteArray779[4] = (byte) (i_6_ >> 584402192);
                    Login.aByteArray779[1] = (byte) i_1_;
                    Login.aByteArray779[6] = (byte) i_6_;

                    if (i_5_ > 512) {
                        i_5_ = 512;
                    }

                    Login.aByteArray779[5] = (byte) (i_6_ >> -1323405176);
                    i_4_++;
                    aClass42_1350.seek((long) (i_2_ * 520), 0);
                    aClass42_1350.method1082(Login.aByteArray779, 0, -119, 8);
                    i_2_ = i_6_;
                    aClass42_1350.method1082(is, i_3_, -128, i_5_);
                }

                return true;
            } catch (java.io.IOException ioexception) {
                return false;
            }
        }
    }

    public static void method1251(boolean bool) {
        aJString_1333 = null;
        aJString_1347 = null;
        aJString_1343 = null;

        if (bool != false) {
            aJString_1332 = null;
        }

        aJString_1339 = null;
        aJString_1338 = null;
        aJString_1346 = null;
        aClass15_Sub1_1330 = null;
        aJStringArray1342 = null;
        aJString_1332 = null;
        aClass15_Sub1_1335 = null;
        aJString_1349 = null;
        aJString_1336 = null;
    }

    public byte[] method1252(int i, int i_9_) {
        anInt1348++;

        synchronized (aClass42_1350) {
            try {
                if ((aClass42_1331.method1083((byte) -118) ^
                        0xffffffffffffffffL) > ((long) (6 + (6 * i)) ^
                        0xffffffffffffffffL)) {
                    return null;
                }

                aClass42_1331.seek((long) (6 * i), 0);
                aClass42_1331.read(0, (byte) 99, 6, Login.aByteArray779);

                if (i_9_ > -99) {
                    method1251(false);
                }

                int i_10_ = (((Login.aByteArray779[2] & 0xff) +
                    ((Login.aByteArray779[0] << 1230726160) & 0xff0000)) -
                    -((0xff & Login.aByteArray779[1]) << -1699147640));
                int i_11_ = ((Login.aByteArray779[5] & 0xff) +
                    (((0xff & Login.aByteArray779[3]) << -768535696) +
                    ((Login.aByteArray779[4] & 0xff) << -2097690552)));

                if (((i_10_ ^ 0xffffffff) > -1) ||
                        ((anInt1341 ^ 0xffffffff) > (i_10_ ^ 0xffffffff))) {
                    return null;
                }

                if ((i_11_ <= 0) ||
                        (((long) i_11_ ^ 0xffffffffffffffffL) < ((aClass42_1350.method1083(
                            (byte) -124) / 520L) ^ 0xffffffffffffffffL))) {
                    return null;
                }

                int i_12_ = 0;
                byte[] is = new byte[i_10_];
                int i_13_ = 0;

                while ((i_10_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff)) {
                    if (i_11_ == 0) {
                        return null;
                    }

                    aClass42_1350.seek((long) (520 * i_11_), 0);

                    int i_14_ = i_10_ - i_12_;

                    if (i_14_ > 512) {
                        i_14_ = 512;
                    }

                    aClass42_1350.read(0, (byte) 99, i_14_ - -8,
                        Login.aByteArray779);

                    int i_15_ = ((0xff00 &
                        (Login.aByteArray779[0] << 278981096)) +
                        (0xff & Login.aByteArray779[1]));
                    int i_16_ = ((0xff00 &
                        (Login.aByteArray779[2] << -2039272120)) +
                        (0xff & Login.aByteArray779[3]));
                    int i_17_ = ((0xff & Login.aByteArray779[6]) +
                        ((0xff00 & (Login.aByteArray779[5] << 449477960)) +
                        ((Login.aByteArray779[4] & 0xff) << -323014256)));
                    int i_18_ = 0xff & Login.aByteArray779[7];

                    if (((i ^ 0xffffffff) != (i_15_ ^ 0xffffffff)) ||
                            ((i_16_ ^ 0xffffffff) != (i_13_ ^ 0xffffffff)) ||
                            ((i_18_ ^ 0xffffffff) != (anInt1345 ^ 0xffffffff))) {
                        return null;
                    }

                    if (((i_17_ ^ 0xffffffff) > -1) ||
                            (((long) i_17_ ^ 0xffffffffffffffffL) < ((aClass42_1350.method1083(
                                (byte) -66) / 520L) ^ 0xffffffffffffffffL))) {
                        return null;
                    }

                    i_11_ = i_17_;

                    for (int i_19_ = 0; i_14_ > i_19_; i_19_++)
                        is[i_12_++] = Login.aByteArray779[8 + i_19_];

                    i_13_++;
                }


                return is;

            } catch (java.io.IOException ioexception) {
                return null;
            }
        }
    }

    public boolean method1253(int i, int i_20_, byte[] is, int i_21_) {
        anInt1344++;

        synchronized (aClass42_1350) {
            if ((i_21_ < 0) || (anInt1341 < i_21_)) {
                throw new IllegalArgumentException();
            }

            if (i != 520) {
                aJString_1346 = null;
            }

            boolean bool = method1250(is, i_21_, true, 20356, i_20_);

            if (!bool) {
                bool = method1250(is, i_21_, false, 20356, i_20_);
            }

            return bool;
        }
    }
}
