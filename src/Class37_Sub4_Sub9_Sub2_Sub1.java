/* Class37_Sub4_Sub9_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub4_Sub9_Sub2_Sub1 extends Class37_Sub4_Sub9_Sub2 {
    public Class37_Sub4_Sub9_Sub2_Sub1(byte[] is) {
        super(is);
    }

    public Class37_Sub4_Sub9_Sub2_Sub1(byte[] is, int[] is_25_, int[] is_26_,
        int[] is_27_, int[] is_28_, int[] is_29_, byte[][] is_30_) {
        super(is, is_25_, is_26_, is_27_, is_28_, is_29_, is_30_);
    }

    public void method616(int i, int i_0_, int i_1_, int i_2_, int i_3_,
        int i_4_) {
        int i_5_ = i_0_ + (i_1_ * Class37_Sub4_Sub9.anInt2662);
        int i_6_ = Class37_Sub4_Sub9.anInt2662 - i_2_;
        int i_7_ = 0;
        int i_8_ = 0;

        if (i_1_ < Class37_Sub4_Sub9.anInt2663) {
            int i_9_ = Class37_Sub4_Sub9.anInt2663 - i_1_;
            i_3_ -= i_9_;
            i_1_ = Class37_Sub4_Sub9.anInt2663;
            i_8_ += (i_9_ * i_2_);
            i_5_ += (i_9_ * Class37_Sub4_Sub9.anInt2662);
        }

        if ((i_1_ + i_3_) > Class37_Sub4_Sub9.anInt2664) {
            i_3_ -= ((i_1_ + i_3_) - Class37_Sub4_Sub9.anInt2664);
        }

        if (i_0_ < Class37_Sub4_Sub9.anInt2661) {
            int i_10_ = Class37_Sub4_Sub9.anInt2661 - i_0_;
            i_2_ -= i_10_;
            i_0_ = Class37_Sub4_Sub9.anInt2661;
            i_8_ += i_10_;
            i_5_ += i_10_;
            i_7_ += i_10_;
            i_6_ += i_10_;
        }

        if ((i_0_ + i_2_) > Class37_Sub4_Sub9.anInt2667) {
            int i_11_ = (i_0_ + i_2_) - Class37_Sub4_Sub9.anInt2667;
            i_2_ -= i_11_;
            i_7_ += i_11_;
            i_6_ += i_11_;
        }

        if ((i_2_ > 0) && (i_3_ > 0)) {
            Class37_Sub4_Sub9_Sub2.method620(Class37_Sub4_Sub9.anIntArray2666,
                aByteArrayArray3878[i], i_4_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
        }
    }

    public void method621(int i, int i_12_, int i_13_, int i_14_, int i_15_,
        int i_16_, int i_17_) {
        int i_18_ = i_12_ + (i_13_ * Class37_Sub4_Sub9.anInt2662);
        int i_19_ = Class37_Sub4_Sub9.anInt2662 - i_14_;
        int i_20_ = 0;
        int i_21_ = 0;

        if (i_13_ < Class37_Sub4_Sub9.anInt2663) {
            int i_22_ = Class37_Sub4_Sub9.anInt2663 - i_13_;
            i_15_ -= i_22_;
            i_13_ = Class37_Sub4_Sub9.anInt2663;
            i_21_ += (i_22_ * i_14_);
            i_18_ += (i_22_ * Class37_Sub4_Sub9.anInt2662);
        }

        if ((i_13_ + i_15_) > Class37_Sub4_Sub9.anInt2664) {
            i_15_ -= ((i_13_ + i_15_) - Class37_Sub4_Sub9.anInt2664);
        }

        if (i_12_ < Class37_Sub4_Sub9.anInt2661) {
            int i_23_ = Class37_Sub4_Sub9.anInt2661 - i_12_;
            i_14_ -= i_23_;
            i_12_ = Class37_Sub4_Sub9.anInt2661;
            i_21_ += i_23_;
            i_18_ += i_23_;
            i_20_ += i_23_;
            i_19_ += i_23_;
        }

        if ((i_12_ + i_14_) > Class37_Sub4_Sub9.anInt2667) {
            int i_24_ = (i_12_ + i_14_) - Class37_Sub4_Sub9.anInt2667;
            i_14_ -= i_24_;
            i_20_ += i_24_;
            i_19_ += i_24_;
        }

        if ((i_14_ > 0) && (i_15_ > 0)) {
            Class37_Sub4_Sub9_Sub2.method622(Class37_Sub4_Sub9.anIntArray2666,
                aByteArrayArray3878[i], i_16_, i_21_, i_18_, i_14_, i_15_,
                i_19_, i_20_, i_17_);
        }
    }
}
