/* Class37_Sub9_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class Class37_Sub9_Sub35 extends Class37_Sub9 {
    public static JString aJString_3560;
    public static int[] anIntArray3561 = { 16, 32, 64, 128 };
    public static JString aJString_3562;
    public static JString aJString_3563;
    public static int anInt3564;
    public static int anInt3565;
    public static Class52 aClass52_3566;
    public static JString aJString_3567;
    public static JString aJString_3568;
    public static int anInt3569;

    static {
        aJString_3560 = Class37_Sub2.method332((byte) 102,
                "as it was used to break our rules)3");

        aJString_3562 = (Class37_Sub2.method332((byte) 109,
                "You have only just left another world)3"));
        anInt3564 = -1;
        aJString_3563 = aJString_3560;
        aJString_3568 = aJString_3562;

        aJString_3567 = Class37_Sub2.method332((byte) 116, " weitere Optionen");
    }

    public Class37_Sub9_Sub35() {
        super(0, true);
    }

    public static Class18 method914(int i, byte i_0_, int i_1_) {
        anInt3569++;

        int i_2_ = 105 % ((63 - i_0_) / 52);
        Class18 class18 = Class37_Sub9_Sub14.method820(i, 4096);

        if (i_1_ == -1) {
            return class18;
        }

        if ((class18 == null) || (class18.aClass18Array450 == null) ||
                ((class18.aClass18Array450.length ^ 0xffffffff) >= (i_1_ ^
                0xffffffff))) {
            return null;
        }

        return class18.aClass18Array450[i_1_];
    }

    public int[] method761(int i, int i_3_) {
        if (i > -125) {
            anIntArray3561 = null;
        }

        anInt3565++;

        int[] is = aClass38_1966.method1049(i_3_, true);

        if (aClass38_1966.aBoolean850) {
            ArrayOperations.setArray(is, 0, Class32.anInt743,
                Class37_Sub4_Sub16.anIntArray2871[i_3_]);
        }

        return is;
    }

    public static void method915(int i) {
        aJString_3563 = null;
        aClass52_3566 = null;
        anIntArray3561 = null;
        aJString_3560 = null;
        aJString_3562 = null;
        aJString_3567 = null;

        if (i != -10453) {
            aJString_3562 = null;
        }

        aJString_3568 = null;
    }
}
