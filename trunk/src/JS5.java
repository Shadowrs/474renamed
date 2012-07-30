/* JS5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public abstract class JS5 {
	public static int anInt257;
	public static int anInt258;
	public static int anInt259;
	public static int anInt261;
	public static int anInt262;
	public static int anInt264;
	public static int anInt265;
	public static int anInt266;
	public static int anInt267;
	public static int anInt268;
	public static int anInt269;
	public static int anInt272;
	public static int anInt274;
	public static int anInt275;
	public static int anInt279;
	public static int anInt280;
	public static int anInt281;
	public static int anInt282;
	public static byte[][][] aByteArrayArrayArray283;
	public static int anInt285;
	public static int anInt286;
	public static int anInt287;
	public static int anInt288;
	public static int anInt289;
	public static int anInt291;
	public static int anInt292;
	public static int anInt293;
	public static int anInt295;
	public Object[][] anObjectArrayArray253;
	public int anInt254;
	public int anInt255;
	public int[] anIntArray256;
	public int[] anIntArray260;
	public int[] anIntArray263;
	public int[][] anIntArrayArray270;
	public boolean aBoolean271;
	public boolean aBoolean273;
	public Class60[] aClass60Array276;
	public int[] anIntArray277;
	public Object[] anObjectArray278;
	public Class60 aClass60_284;
	public int[] anIntArray290;
	public int[][] anIntArrayArray294;

	public JS5(boolean bool, boolean bool_83_) {
		aBoolean271 = bool_83_;
		aBoolean273 = bool;
	}

	public int method108(byte i) {
		int i_0_ = 18 / (-i / 58);
		anInt272++;

		return anObjectArrayArray253.length;
	}

	public void method109(byte[] is, int i) {
		anInt255 = Class46.method1107(is, (byte) 66, is.length);

		Stream stream = new Stream(Login.method312(is, (byte) 106));
		anInt289++;

		int i_1_ = stream.readByte(127);

		if ((i_1_ != 5) && ((i_1_ ^ 0xffffffff) != -7)) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + i_1_);
		}

		if (i_1_ >= 6) {
			stream.readInt();
		}

		int i_2_ = stream.readByte(i ^ 0x746a);
		anInt254 = stream.readShort();

		int i_3_ = 0;
		int i_4_ = -1;
		anIntArray290 = new int[anInt254];

		for (int i_5_ = 0; (anInt254 ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
			anIntArray290[i_5_] = i_3_ += stream.readShort();

			if (i_4_ < anIntArray290[i_5_]) {
				i_4_ = anIntArray290[i_5_];
			}
		}

		anObjectArray278 = new Object[i_4_ - -1];

		if (i == 29725) {
			anIntArrayArray270 = new int[1 + i_4_][];
			anIntArray263 = new int[1 + i_4_];
			anIntArray277 = new int[1 + i_4_];
			anObjectArrayArray253 = new Object[i_4_ + 1][];
			anIntArray256 = new int[1 + i_4_];

			if (i_2_ != 0) {
				anIntArray260 = new int[i_4_ + 1];

				for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > ((1 + i_4_) ^ 0xffffffff); i_6_++)
					anIntArray260[i_6_] = -1;

				for (int i_7_ = 0; (anInt254 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++)
					anIntArray260[anIntArray290[i_7_]] = stream.readInt();

				aClass60_284 = new Class60(anIntArray260);
			}

			for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (anInt254 ^ 0xffffffff); i_8_++)
				anIntArray277[anIntArray290[i_8_]] = stream.readInt();

			for (int i_9_ = 0; anInt254 > i_9_; i_9_++)
				anIntArray263[anIntArray290[i_9_]] = stream.readInt();

			for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (anInt254 ^ 0xffffffff); i_10_++)
				anIntArray256[anIntArray290[i_10_]] = stream.readShort();

			for (int i_11_ = 0; (anInt254 ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
				i_3_ = 0;

				int i_12_ = anIntArray290[i_11_];
				int i_13_ = anIntArray256[i_12_];
				int i_14_ = -1;
				anIntArrayArray270[i_12_] = new int[i_13_];

				for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff); i_15_++) {
					int i_16_ = (anIntArrayArray270[i_12_][i_15_] = i_3_ += (stream.readShort()));

					if (i_16_ > i_14_) {
						i_14_ = i_16_;
					}
				}

				anObjectArrayArray253[i_12_] = new Object[i_14_ + 1];
			}

			if ((i_2_ ^ 0xffffffff) != -1) {
				aClass60Array276 = new Class60[i_4_ + 1];
				anIntArrayArray294 = new int[i_4_ - -1][];

				for (int i_17_ = 0; (anInt254 ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
					int i_18_ = anIntArray290[i_17_];
					int i_19_ = anIntArray256[i_18_];

					anIntArrayArray294[i_18_] = new int[anObjectArrayArray253[i_18_].length];

					for (int i_20_ = 0; anObjectArrayArray253[i_18_].length > i_20_; i_20_++)
						anIntArrayArray294[i_18_][i_20_] = -1;

					for (int i_21_ = 0; (i_19_ ^ 0xffffffff) < (i_21_ ^ 0xffffffff); i_21_++)
						anIntArrayArray294[i_18_][(anIntArrayArray270[i_18_][i_21_])] = stream.readInt();

					aClass60Array276[i_18_] = new Class60(anIntArrayArray294[i_18_]);
				}
			}
		}
	}

	public byte[] method110(int i, int i_22_, int i_23_) {
		anInt293++;

		if ((i_23_ < 0) || ((anObjectArrayArray253.length ^ 0xffffffff) >= (i_23_ ^ 0xffffffff)) || (anObjectArrayArray253[i_23_] == null) || (i < 0) || ((i ^ 0xffffffff) <= (anObjectArrayArray253[i_23_].length ^ 0xffffffff))) {
			return null;
		}

		if (anObjectArrayArray253[i_23_][i] == null) {
			boolean bool = method132(-25355, null, i_23_);

			if (!bool) {
				method118(i_23_, -1);
				bool = method132(-25355, null, i_23_);

				if (!bool) {
					return null;
				}
			}
		}

		byte[] is = Class26.method257(false, anObjectArrayArray253[i_23_][i], -9);

		if (i_22_ < 71) {
			method120(-101, 48, false, -95, null, 104);
		}

		return is;
	}

	public byte[] method111(int i, byte i_24_) {
		anInt257++;

		if (anObjectArrayArray253.length == 1) {
			return method131(i, 0, 1);
		}

		if ((anObjectArrayArray253[i].length ^ 0xffffffff) == -2) {
			return method131(0, i, 1);
		}

		if (i_24_ != 94) {
			method128(null, -20, 74);
		}

		throw new RuntimeException();
	}

	public boolean method112(int i, int i_25_) {
		if (i_25_ != -17104) {
			anIntArrayArray294 = null;
		}

		anInt291++;

		if ((anObjectArrayArray253.length ^ 0xffffffff) == -2) {
			return method115(-9350, 0, i);
		}

		if (anObjectArrayArray253[i].length == 1) {
			return method115(i_25_ ^ 0x664a, i, 0);
		}

		throw new RuntimeException();
	}

	public byte[] method113(int i, int i_26_, int i_27_, int[] is) {
		anInt286++;

		if ((i_27_ < 0) || ((anObjectArrayArray253.length ^ 0xffffffff) >= (i_27_ ^ 0xffffffff)) || (anObjectArrayArray253[i_27_] == null) || ((i_26_ ^ 0xffffffff) > -1) || (i_26_ >= anObjectArrayArray253[i_27_].length)) {
			return null;
		}
		// dekoduojama (sukuriama jei netureta) is gzip su Inflate bla bla
		if (anObjectArrayArray253[i_27_][i_26_] == null) {
			boolean bool = method132(-25355, is, i_27_);
			if (!bool) {
				method118(i_27_, -1);
				bool = method132(-25355, is, i_27_);

				if (!bool) {
					return null;
				}
			}
		}

		byte[] is_28_ = Class26.method257(false, anObjectArrayArray253[i_27_][i_26_], -9);

		if (i > -40) {
			method131(65, 38, 105);
		}

		if (aBoolean271) {
			anObjectArrayArray253[i_27_][i_26_] = null;
		}

		return is_28_;
	}

	public boolean method114(byte i) {
		anInt288++;

		boolean bool = true;
		int i_29_ = 102 % ((i - -40) / 37);

		for (int i_30_ = 0; anIntArray290.length > i_30_; i_30_++) {
			int i_31_ = anIntArray290[i_30_];

			if (anObjectArray278[i_31_] == null) {
				method118(i_31_, -1);

				if (anObjectArray278[i_31_] == null) {
					bool = false;
				}
			}
		}

		return bool;
	}

	public boolean method115(int i, int i_32_, int i_33_) {
		anInt266++;

		if ((i_32_ < 0) || ((i_32_ ^ 0xffffffff) <= (anObjectArrayArray253.length ^ 0xffffffff)) || (anObjectArrayArray253[i_32_] == null) || ((i_33_ ^ 0xffffffff) > -1) || ((i_33_ ^ 0xffffffff) <= (anObjectArrayArray253[i_32_].length ^ 0xffffffff))) {
			return false;
		}

		if (anObjectArrayArray253[i_32_][i_33_] != null) {
			return true;
		}

		if (anObjectArray278[i_32_] != null) {
			return true;
		}

		if (i != -9350) {
			method114((byte) 100);
		}

		method118(i_32_, -1);

		if (anObjectArray278[i_32_] != null) {
			return true;
		}

		return false;
	}

	public static void method116(int i) {
		anInt269++;
		Class73.method1274(Class37_Sub7.aClass18_1894, -1);
		Class37_Sub4_Sub7.anInt2640++;

		if (!Class24.aBoolean609 || !AbstractDrawingArea.aBoolean746) {
			if (Class37_Sub4_Sub7.anInt2640 > 1) {
				Class37_Sub7.aClass18_1894 = null;
			}
		} else {
			int i_34_ = Class37_Sub4_Sub7_Sub7.anInt3851;
			i_34_ -= Class37_Sub4_Sub7_Sub1_Sub1.anInt3957;

			int i_35_ = Class37_Sub9_Sub1.anInt2914;

			if (i == 0) {
				int i_36_ = Class37_Sub7.aClass18_1894.anInt378;
				i_35_ -= Class37_Sub9_Sub15.anInt3182;

				if ((Class37_Sub4_Sub7_Sub1_Sub2.anInt3977 ^ 0xffffffff) < (i_34_ ^ 0xffffffff)) {
					i_34_ = Class37_Sub4_Sub7_Sub1_Sub2.anInt3977;
				}

				if ((Class59.anInt1134 ^ 0xffffffff) < (i_35_ ^ 0xffffffff)) {
					i_35_ = Class59.anInt1134;
				}

				if ((Class77.aClass18_1452.anInt441 + Class37_Sub4_Sub7_Sub1_Sub2.anInt3977) < (i_34_ - -Class37_Sub7.aClass18_1894.anInt441)) {
					i_34_ = (Class77.aClass18_1452.anInt441 + (Class37_Sub4_Sub7_Sub1_Sub2.anInt3977 + -Class37_Sub7.aClass18_1894.anInt441));
				}

				int i_37_ = i_34_ - Class37_Sub5.anInt1875;

				if ((Class37_Sub7.aClass18_1894.anInt353 + i_35_) > (Class59.anInt1134 + Class77.aClass18_1452.anInt353)) {
					i_35_ = (Class59.anInt1134 - -Class77.aClass18_1452.anInt353 - Class37_Sub7.aClass18_1894.anInt353);
				}

				int i_38_ = i_35_ + -RuntimeException_Sub1.anInt1626;

				if (((Class37_Sub4_Sub7.anInt2640 ^ 0xffffffff) < (Class37_Sub7.aClass18_1894.anInt350 ^ 0xffffffff)) && ((i_37_ > i_36_) || ((i_37_ ^ 0xffffffff) > (-i_36_ ^ 0xffffffff)) || (i_38_ > i_36_) || (i_38_ < -i_36_))) {
					Class37_Sub9_Sub37.aBoolean3591 = true;
				}

				int i_39_ = ((-Class59.anInt1134 + i_35_) - -Class77.aClass18_1452.anInt432);
				int i_40_ = (-Class37_Sub4_Sub7_Sub1_Sub2.anInt3977 + i_34_ + Class77.aClass18_1452.anInt371);

				if ((Class37_Sub7.aClass18_1894.anObjectArray409 != null) && Class37_Sub9_Sub37.aBoolean3591) {
					Class37_Sub8 class37_sub8 = new Class37_Sub8();
					class37_sub8.anInt1923 = i_39_;
					class37_sub8.aClass18_1925 = Class37_Sub7.aClass18_1894;

					class37_sub8.anObjectArray1938 = Class37_Sub7.aClass18_1894.anObjectArray409;
					class37_sub8.anInt1927 = i_40_;
					Class43.method1092(class37_sub8, (byte) 56);
				}

				if ((Class60.anInt1140 ^ 0xffffffff) == -1) {
					if (Class37_Sub9_Sub37.aBoolean3591) {
						if (Class37_Sub7.aClass18_1894.anObjectArray456 != null) {
							Class37_Sub8 class37_sub8 = new Class37_Sub8();

							class37_sub8.aClass18_1925 = Class37_Sub7.aClass18_1894;

							class37_sub8.anObjectArray1938 = Class37_Sub7.aClass18_1894.anObjectArray456;
							class37_sub8.anInt1923 = i_39_;

							class37_sub8.aClass18_1922 = Class37_Sub4_Sub12.aClass18_2773;
							class37_sub8.anInt1927 = i_40_;
							Class43.method1092(class37_sub8, (byte) 126);
						}

						if ((Class37_Sub4_Sub12.aClass18_2773 != null) && (Class37_Sub9_Sub17.method834((Class37_Sub7.aClass18_1894), false) != null)) {
							Class42.outputStream.writePacket(-1494101117, 78);
							Class78.anInt1461++;
							Class42.outputStream.writeInt2(false, Class37_Sub4_Sub12.aClass18_2773.anInt402);
							Class42.outputStream.writeShortA(19058, Class37_Sub7.aClass18_1894.anInt334);
							Class42.outputStream.writeShort(i ^ 0x3298e928, Class37_Sub4_Sub12.aClass18_2773.anInt334);
							Class42.outputStream.writeInt(Class37_Sub7.aClass18_1894.anInt402);
						}
					} else if (((Class37_Sub2.anInt1825 == 1) || Class88.method1331((Class37_Sub9_Sub13.anInt3134) - 1, 2000)) && (Class37_Sub9_Sub13.anInt3134 > 2)) {
						Class37_Sub9_Sub24.method868(72);
					} else if (Class37_Sub9_Sub13.anInt3134 > 0) {
						Class37_Sub5.method738((byte) -122, -1 + (Class37_Sub9_Sub13.anInt3134));
					}

					Class37_Sub7.aClass18_1894 = null;
				}
			}
		}
	}

	public void method117(int i, byte i_41_) {
		if (i_41_ > -42) {
			anInt254 = 2;
		}

		anInt281++;
	}

	public void method118(int i, int i_42_) {
		if (i_42_ == -1) {
			anInt267++;
		}
	}

	public int[] method119(int i, byte i_43_) {
		if (i_43_ != 68) {
			return null;
		}

		anInt282++;

		return anIntArrayArray270[i];
	}

	public static void method120(int i, int i_44_, boolean bool, int i_45_, JS5 class15, int i_46_) {
		Class3.anInt89 = i_46_;
		Class37_Sub7.anInt1904 = 1;
		Class37_Sub4_Sub7.anInt2639 = i_44_;
		Class37_Sub9_Sub12.aBoolean3117 = bool;
		Class84.aClass15_1534 = class15;
		Class37_Sub13.anInt2118 = i;

		if (i_45_ != -15793) {
			method133(82);
		}

		Class37_Sub5.anInt1877 = 10000;
		anInt280++;
	}

	public void method121(JString jstring, byte i) {
		anInt292++;
		jstring = jstring.toLowerCase(12131);

		int i_47_ = aClass60_284.method1168(-1, jstring.getHashCode((byte) -106));

		if (i < 25) {
			method127(false);
		}

		if (i_47_ >= 0) {
			method117(i_47_, (byte) -122);
		}
	}

	public static void method122(boolean bool, byte i) {
		Class72.method1267(2);

		if (i != -103) {
			anInt259 = 32;
		}

		Class25.anInt637++;
		anInt275++;

		if (((Class25.anInt637 ^ 0xffffffff) <= -51) || bool) {
			Class25.anInt637 = 0;

			do {
				if (!Class37_Sub18.aBoolean2201 && (Applet_Sub1.activeSocket != null)) {
					Class37_Sub16.anInt2153++;
					Class42.outputStream.writePacket(-1494101117, 186);

					try {
						Applet_Sub1.activeSocket.write(0, (byte) 116, Class42.outputStream.buffer, Class42.outputStream.bufferLocation);
						Class42.outputStream.bufferLocation = 0;
					} catch (java.io.IOException ioexception) {
						Class37_Sub18.aBoolean2201 = true;

						break;
					}

					break;
				}
			} while (false);
		}
	}

	public int method123(byte i, JString jstring) {
		anInt265++;

		if (i != 32) {
			method108((byte) 10);
		}

		jstring = jstring.toLowerCase(12131);

		return aClass60_284.method1168(-1, jstring.getHashCode((byte) -126));
	}

	public void method124(int i, int i_48_) {
		anInt279++;

		for (int i_49_ = 0; i_49_ < anObjectArrayArray253[i].length; i_49_++)
			anObjectArrayArray253[i][i_49_] = null;

		if (i_48_ < 36) {
			method126((byte) -86, null, null);
		}
	}

	public boolean method125(byte i, int i_50_) {
		anInt268++;

		if (i != -92) {
			aByteArrayArrayArray283 = null;
		}

		if (anObjectArray278[i_50_] != null) {
			return true;
		}

		method118(i_50_, -1);

		if (anObjectArray278[i_50_] != null) {
			return true;
		}

		return false;
	}

	public byte[] method126(byte i, JString jstring, JString jstring_51_) {
		try {
			jstring = jstring.toLowerCase(12131);
			jstring_51_ = jstring_51_.toLowerCase(12131);
			anInt264++;

			int i_52_ = aClass60_284.method1168(-1, jstring.getHashCode((byte) -109));
			int i_53_ = 53 / ((36 - i) / 62);
			int i_54_ = aClass60Array276[i_52_].method1168(-1, jstring_51_.getHashCode((byte) -128));

			return method131(i_54_, i_52_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("dd.CA(" + i + ',' + ((jstring != null) ? "{...}" : "null") + ',' + ((jstring_51_ != null) ? "{...}" : "null") + ')'));
		}
	}

	public void method127(boolean bool) {
		anInt287++;

		if (bool != false) {
			aByteArrayArrayArray283 = null;
		}

		for (int i = 0; anObjectArrayArray253.length > i; i++) {
			if (anObjectArrayArray253[i] != null) {
				for (int i_55_ = 0; i_55_ < anObjectArrayArray253[i].length; i_55_++)
					anObjectArrayArray253[i][i_55_] = null;
			}
		}
	}

	public int method128(JString jstring, int i, int i_56_) {
		if (i >= -59) {
			method115(91, 91, -126);
		}

		jstring = jstring.toLowerCase(12131);
		anInt274++;

		return aClass60Array276[i_56_].method1168(-1, jstring.getHashCode((byte) -118));
	}

	public int method129(int i, int i_57_) {
		if (i != 10000) {
			method110(-8, 126, -89);
		}

		anInt295++;

		return anObjectArrayArray253[i_57_].length;
	}

	public boolean method130(JString jstring, JString jstring_58_, int i) {
		try {
			jstring = jstring.toLowerCase(12131);

			if (i > -66) {
				anObjectArrayArray253 = null;
			}

			anInt261++;
			jstring_58_ = jstring_58_.toLowerCase(12131);

			int i_59_ = aClass60_284.method1168(-1, jstring.getHashCode((byte) -117));
			int i_60_ = aClass60Array276[i_59_].method1168(-1, jstring_58_.getHashCode((byte) -125));

			return method115(-9350, i_59_, i_60_);
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("dd.K(" + ((jstring != null) ? "{...}" : "null") + ',' + ((jstring_58_ != null) ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public byte[] method131(int i, int i_61_, int i_62_) {
		anInt258++;

		if (i_62_ != 1) {
			return null;
		}

		return method113(-113, i, i_61_, null);
	}

	public boolean method132(int i, int[] is, int i_63_) {
		anInt285++;

		if (anObjectArray278[i_63_] == null) {
			return false;
		}

		int[] is_64_ = anIntArrayArray270[i_63_];
		Object[] objects = anObjectArrayArray253[i_63_];
		int i_65_ = anIntArray256[i_63_];
		boolean bool = true;

		for (int i_66_ = 0; i_66_ < i_65_; i_66_++) {
			if (objects[is_64_[i_66_]] == null) {
				bool = false;

				break;
			}
		}

		if (i != -25355) {
			anIntArrayArray294 = null;
		}

		if (bool) {
			return true;
		}

		byte[] is_67_;

		if ((is != null) && ((is[0] != 0) || (is[1] != 0) || (is[2] != 0) || (is[3] != 0))) {
			is_67_ = Class26.method257(true, anObjectArray278[i_63_], -9);

			Stream stream = new Stream(is_67_);
			stream.decodeXtea(stream.buffer.length, 5, (byte) -88, is);
		} else {
			is_67_ = Class26.method257(false, anObjectArray278[i_63_], -9);
		}

		byte[] is_68_;

		try {
			// cia dekoduojamas mapas, mapo info.
			is_68_ = Login.method312(is_67_, (byte) 106);
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("T3 - " + (is != null) + "," + i_63_ + "," + is_67_.length + "," + Class46.method1107(is_67_, (byte) 72, is_67_.length) + "," + Class46.method1107(is_67_, (byte) 80, is_67_.length - 2) + "," + anIntArray277[i_63_] + "," + anInt255));
		}

		if (aBoolean273) {
			anObjectArray278[i_63_] = null;
		}

		if (i_65_ > 1) {
			int i_69_ = is_68_.length;
			int i_70_ = 0xff & is_68_[--i_69_];
			Stream stream = new Stream(is_68_);
			i_69_ -= (4 * i_70_ * i_65_);
			stream.bufferLocation = i_69_;

			int[] is_71_ = new int[i_65_];

			for (int i_72_ = 0; (i_72_ ^ 0xffffffff) > (i_70_ ^ 0xffffffff); i_72_++) {
				int i_73_ = 0;

				for (int i_74_ = 0; (i_74_ ^ 0xffffffff) > (i_65_ ^ 0xffffffff); i_74_++) {
					i_73_ += stream.readInt();
					is_71_[i_74_] += i_73_;
				}
			}

			byte[][] is_75_ = new byte[i_65_][];

			for (int i_76_ = 0; i_65_ > i_76_; i_76_++) {
				is_75_[i_76_] = new byte[is_71_[i_76_]];
				is_71_[i_76_] = 0;
			}

			stream.bufferLocation = i_69_;

			int i_77_ = 0;

			for (int i_78_ = 0; i_78_ < i_70_; i_78_++) {
				int i_79_ = 0;

				for (int i_80_ = 0; i_80_ < i_65_; i_80_++) {
					i_79_ += stream.readInt();
					ArrayOperations.copyArray(is_68_, i_77_, is_75_[i_80_], is_71_[i_80_], i_79_);
					i_77_ += i_79_;
					is_71_[i_80_] += i_79_;
				}
			}

			for (int i_81_ = 0; i_65_ > i_81_; i_81_++) {
				if (!aBoolean271) {
					objects[is_64_[i_81_]] = Class88.method1332(false, is_75_[i_81_], (byte) 2);
				} else {
					objects[is_64_[i_81_]] = is_75_[i_81_];
				}
			}
		} else if (aBoolean271) {
			objects[is_64_[0]] = is_68_;
		} else {
			objects[is_64_[0]] = Class88.method1332(false, is_68_, (byte) 2);
		}

		return true;
	}

	public static void method133(int i) {
		aByteArrayArrayArray283 = null;
	}
}
