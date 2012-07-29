/* ISAAC - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class ISAAC {
	public static JString aJString_91 = Class37_Sub2.method332((byte) 124, "Bitte versuchen Sie)1");
	public static Class77 aClass77_92;
	public static volatile boolean aBoolean93;
	public static int anInt95;
	public static JString aJString_98 = Class37_Sub2.method332((byte) 117, "Verbindung mit Update)2Server)3)3)3");
	public static int anInt99;
	public static int anInt100;
	public static int anInt101;
	public static JString aJString_105;
	public static int anInt106;
	public static JString aJString_107;
	public static long aLong108;

	static {
		aBoolean93 = true;
		aJString_105 = Class37_Sub2.method332((byte) 120, "titlebox");
		aClass77_92 = new Class77();
		aJString_107 = Class37_Sub2.method332((byte) 105, "60 Sekunden noch einmal)3)3)3");
	}

	public int[] memory = new int[256];
	public int lastResult;
	public int[] results = new int[256];
	public int anInt102;
	public int counter;
	public int accumulator;

	public ISAAC(int[] seed) {
		for (int i = 0; seed.length > i; i++)
			results[i] = seed[i];

		initializeKeySet(8);
	}

	public static void resetStaticVariables(int i) {
		aJString_98 = null;
		aJString_105 = null;
		aJString_107 = null;
		aClass77_92 = null;

		if (i != 7) {
			aJString_98 = null;
		}

		aJString_91 = null;
	}

	public int getNextKey(boolean dummy) {
		anInt101++;

		if (dummy != true) {
			aJString_107 = null;
		}

		if (anInt102-- == 0) {
			generateNextKeySet(true);
			anInt102 = 255;
		}

		// return results[anInt102];
		return 0;
	}

	public void initializeKeySet(int dummy) {
		anInt95++;

		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		int j2;
		int k2;
		int l = i1 = j1 = k1 = l1 = i2 = j2 = k2 = 0x9e3779b9;
		for (int i = 0; i < 4; i++) {
			l ^= i1 << 11;
			k1 += l;
			i1 += j1;
			i1 ^= j1 >>> 2;
			l1 += i1;
			j1 += k1;
			j1 ^= k1 << 8;
			i2 += j1;
			k1 += l1;
			k1 ^= l1 >>> 16;
			j2 += k1;
			l1 += i2;
			l1 ^= i2 << 10;
			k2 += l1;
			i2 += j2;
			i2 ^= j2 >>> 4;
			l += i2;
			j2 += k2;
			j2 ^= k2 << 8;
			i1 += j2;
			k2 += l;
			k2 ^= l >>> 9;
			j1 += k2;
			l += i1;
		}

		for (int j = 0; j < 256; j += 8) {
			l += results[j];
			i1 += results[j + 1];
			j1 += results[j + 2];
			k1 += results[j + 3];
			l1 += results[j + 4];
			i2 += results[j + 5];
			j2 += results[j + 6];
			k2 += results[j + 7];
			l ^= i1 << 11;
			k1 += l;
			i1 += j1;
			i1 ^= j1 >>> 2;
			l1 += i1;
			j1 += k1;
			j1 ^= k1 << 8;
			i2 += j1;
			k1 += l1;
			k1 ^= l1 >>> 16;
			j2 += k1;
			l1 += i2;
			l1 ^= i2 << 10;
			k2 += l1;
			i2 += j2;
			i2 ^= j2 >>> 4;
			l += i2;
			j2 += k2;
			j2 ^= k2 << 8;
			i1 += j2;
			k2 += l;
			k2 ^= l >>> 9;
			j1 += k2;
			l += i1;
			memory[j] = l;
			memory[j + 1] = i1;
			memory[j + 2] = j1;
			memory[j + 3] = k1;
			memory[j + 4] = l1;
			memory[j + 5] = i2;
			memory[j + 6] = j2;
			memory[j + 7] = k2;
		}

		for (int k = 0; k < 256; k += 8) {
			l += memory[k];
			i1 += memory[k + 1];
			j1 += memory[k + 2];
			k1 += memory[k + 3];
			l1 += memory[k + 4];
			i2 += memory[k + 5];
			j2 += memory[k + 6];
			k2 += memory[k + 7];
			l ^= i1 << 11;
			k1 += l;
			i1 += j1;
			i1 ^= j1 >>> 2;
			l1 += i1;
			j1 += k1;
			j1 ^= k1 << 8;
			i2 += j1;
			k1 += l1;
			k1 ^= l1 >>> 16;
			j2 += k1;
			l1 += i2;
			l1 ^= i2 << 10;
			k2 += l1;
			i2 += j2;
			i2 ^= j2 >>> 4;
			l += i2;
			j2 += k2;
			j2 ^= k2 << 8;
			i1 += j2;
			k2 += l;
			k2 ^= l >>> 9;
			j1 += k2;
			l += i1;
			memory[k] = l;
			memory[k + 1] = i1;
			memory[k + 2] = j1;
			memory[k + 3] = k1;
			memory[k + 4] = l1;
			memory[k + 5] = i2;
			memory[k + 6] = j2;
			memory[k + 7] = k2;
		}

		if (dummy == 8) {
			generateNextKeySet(true);
			anInt102 = 256;
		}
	}

	public static void method52(int i, int i_11_, boolean bool, int i_12_, int i_13_, Class37_Sub4_Sub9_Sub3 class37_sub4_sub9_sub3) {
		anInt106++;

		if (bool == false) {
			int i_14_ = (i_13_ * i_13_) + (i_11_ * i_11_);

			if ((i_14_ <= 4225) || (i_14_ >= 90000)) {
				Class37_Sub25.method1043(i_12_, i_11_, class37_sub4_sub9_sub3, 94, i, i_13_);
			} else {
				int i_15_ = ((Class37_Sub9_Sub37.anInt3590 + Class37_Sub14.anInt2127) & 0x7ff);
				int i_16_ = Class37_Sub4_Sub9_Sub4.anIntArray3910[i_15_];
				i_16_ = (256 * i_16_) / (Class78.anInt1458 + 256);

				int i_17_ = Class37_Sub4_Sub9_Sub4.anIntArray3929[i_15_];
				i_17_ = (256 * i_17_) / (256 + Class78.anInt1458);

				int i_18_ = ((i_16_ * i_13_) - -(i_17_ * i_11_)) >> 857751824;
				int i_19_ = ((i_13_ * i_17_) - (i_16_ * i_11_)) >> -65436688;
				double d = Math.atan2((double) i_18_, (double) i_19_);
				int i_20_ = (int) (Math.sin(d) * 63.0);
				int i_21_ = (int) (57.0 * Math.cos(d));
				Class59.aClass37_Sub4_Sub9_Sub3_1135.method647(-10 + i_20_ + 94 + i + 4, (-i_21_ + i_12_) - -83 - 20, 20, 20, 15, 15, d, 256);
			}
		}
	}

	public void generateNextKeySet(boolean bool) {
		lastResult += ++counter;
		anInt99++;

		int i = 0;

		if (bool == true) {
			for (; i < 256; i++) {
				int i_22_ = memory[i];

				if ((i & 0x2) != 0) {
					if ((0x1 & i) == 0) {
						accumulator ^= (accumulator << 1056626818);
					} else {
						accumulator ^= accumulator >>> -2008057808;
					}
				} else if ((i & 0x1) != 0) {
					accumulator ^= accumulator >>> 362766630;
				} else {
					accumulator ^= (accumulator << 1602569421);
				}

				accumulator += memory[(128 + i) & 0xff];

				int i_23_;
				memory[i] = i_23_ = accumulator + ((memory[Class37_Sub4_Sub7.method490(255, i_22_ >> 2136761698)]) + lastResult);
				results[i] = lastResult = (i_22_ + (memory[Class37_Sub4_Sub7.method490(i_23_ >> 159208936, 1020) >> 789191330]));
			}
		}
	}
}
