/* Class37_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub3_Sub2 extends Class37_Sub3 {
    public Class58 aClass58_2332 = new Class58();
    public Class58 aClass58_2333 = new Class58();
    public int anInt2334 = -1;
    public int anInt2335 = 0;

    public Class37_Sub3 method343() {
        return (Class37_Sub3) aClass58_2332.method1155(0);
    }

    public synchronized void method350(Class37_Sub3 class37_sub3) {
        aClass58_2332.method1150(9282, class37_sub3);
    }

    public int method337() {
        return 0;
    }

    public void method351(Class37_Sub21 class37_sub21) {
        class37_sub21.method322(false);
        class37_sub21.method1024();

        Class37 class37 = aClass58_2333.aClass37_1102.aClass37_814;

        if (class37 == aClass58_2333.aClass37_1102) {
            anInt2334 = -1;
        } else {
            anInt2334 = ((Class37_Sub21) class37).anInt2221;
        }
    }

    public void method352(int[] is, int i, int i_0_) {
        for (Class37_Sub3 class37_sub3 = (Class37_Sub3) aClass58_2332.method1155(
                    0); class37_sub3 != null;
                class37_sub3 = (Class37_Sub3) aClass58_2332.method1162(
                        (byte) 54))
            class37_sub3.method340(is, i, i_0_);
    }

    public synchronized void method341(int i) {
        do {
            if (anInt2334 < 0) {
                method356(i);

                break;
            }

            if ((anInt2335 + i) < anInt2334) {
                anInt2335 += i;
                method356(i);

                break;
            }

            int i_1_ = anInt2334 - anInt2335;
            method356(i_1_);
            i -= i_1_;
            anInt2335 += i_1_;
            method355();

            Class37_Sub21 class37_sub21 = (Class37_Sub21) aClass58_2333.method1155(0);

            synchronized (class37_sub21) {
                int i_2_ = class37_sub21.method1025(this);

                if (i_2_ < 0) {
                    class37_sub21.anInt2221 = 0;
                    method351(class37_sub21);
                } else {
                    class37_sub21.anInt2221 = i_2_;
                    method354(class37_sub21.aClass37_814, class37_sub21);
                }
            }
        } while (i != 0);
    }

    public synchronized void method353(Class37_Sub3 class37_sub3) {
        class37_sub3.method322(false);
    }

    public Class37_Sub3 method339() {
        return (Class37_Sub3) aClass58_2332.method1162((byte) 76);
    }

    public void method354(Class37 class37, Class37_Sub21 class37_sub21) {
        for (;
                ((class37 != aClass58_2333.aClass37_1102) &&
                (((Class37_Sub21) class37).anInt2221 <= class37_sub21.anInt2221));
                class37 = class37.aClass37_814) {
            /* empty */
        }

        aClass58_2333.method1152(class37_sub21, class37, (byte) 119);
        anInt2334 = (((Class37_Sub21) aClass58_2333.aClass37_1102.aClass37_814).anInt2221);
    }

    public synchronized void method338(int[] is, int i, int i_3_) {
        do {
            if (anInt2334 < 0) {
                method352(is, i, i_3_);

                break;
            }

            if ((anInt2335 + i_3_) < anInt2334) {
                anInt2335 += i_3_;
                method352(is, i, i_3_);

                break;
            }

            int i_4_ = anInt2334 - anInt2335;
            method352(is, i, i_4_);
            i += i_4_;
            i_3_ -= i_4_;
            anInt2335 += i_4_;
            method355();

            Class37_Sub21 class37_sub21 = (Class37_Sub21) aClass58_2333.method1155(0);

            synchronized (class37_sub21) {
                int i_5_ = class37_sub21.method1025(this);

                if (i_5_ < 0) {
                    class37_sub21.anInt2221 = 0;
                    method351(class37_sub21);
                } else {
                    class37_sub21.anInt2221 = i_5_;
                    method354(class37_sub21.aClass37_814, class37_sub21);
                }
            }
        } while (i_3_ != 0);
    }

    public void method355() {
        if (anInt2335 > 0) {
            for (Class37_Sub21 class37_sub21 = (Class37_Sub21) aClass58_2333.method1155(
                        0); class37_sub21 != null;
                    class37_sub21 = (Class37_Sub21) aClass58_2333.method1162(
                            (byte) 89))
                class37_sub21.anInt2221 -= anInt2335;

            anInt2334 -= anInt2335;
            anInt2335 = 0;
        }
    }

    public void method356(int i) {
        for (Class37_Sub3 class37_sub3 = (Class37_Sub3) aClass58_2332.method1155(
                    0); class37_sub3 != null;
                class37_sub3 = (Class37_Sub3) aClass58_2332.method1162(
                        (byte) 67))
            class37_sub3.method341(i);
    }
}
