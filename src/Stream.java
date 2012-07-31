import java.math.BigInteger;

public class Stream extends Class37 {
	public static JString aJString_2001;
	public static int anInt2002;
	public static int anInt2003;
	public static int anInt2004;
	public static int anInt2005;
	public static JString aJString_2006;
	public static int anInt2007;
	public static int anInt2008;
	public static int anInt2009;
	public static int anInt2010;
	public static int anInt2011;
	public static int anInt2012;
	public static int anInt2013;
	public static int anInt2014 = -1;
	public static int anInt2015;
	public static int anInt2016;
	public static int anInt2017;
	public static JString aJString_2018;
	public static int anInt2019;
	public static int anInt2020;
	public static JString aJString_2021;
	public static int anInt2022;
	public static Applet_Sub1 anApplet_Sub1_2023;
	public static int anInt2024;
	public static JS5 aClass15_2025;
	public static int anInt2026;
	public static int anInt2027;
	public static int anInt2028;
	public static int anInt2029;
	public static int anInt2030;
	public static int anInt2031;
	public static int anInt2032;
	public static int anInt2033;
	public static int anInt2034;
	public static int anInt2035;
	public static int anInt2036;
	public static int anInt2037;
	public static JString aJString_2038;
	public static int anInt2039;
	public static int anInt2040;
	public static JString[] aJStringArray2041;
	public static int anInt2042;
	public static int anInt2043;
	public static JString aJString_2044;
	public static int anInt2045;
	public static int anInt2046;
	public static int anInt2047;
	public static int anInt2048;
	public static int anInt2049;
	public static int anInt2050;
	public static int anInt2051;
	public static int anInt2052;
	public static int anInt2053;
	public static int anInt2054;
	public static int anInt2056;
	public static int anInt2057;
	public static int anInt2058;
	public static JString aJString_2059;
	public static int anInt2060;
	public static int anInt2061;
	public static int anInt2063;
	public static int anInt2064;
	public static int anInt2065;
	public static int anInt2066;
	public static int anInt2067;
	public static int anInt2068;
	public static int anInt2069;
	public static int anInt2070;
	public static int anInt2071;
	public static int anInt2072;
	public static int anInt2073;
	public static int anInt2074;

	static {
		anInt2004 = 5063219;
		anInt2032 = 0;
		anApplet_Sub1_2023 = null;
		aJString_2038 = Class37_Sub2.method332((byte) 119, "<col=ff7000>");
		aJString_2044 = Class37_Sub2.method332((byte) 111, "Konfig geladen)3");
		aJString_2021 = Class37_Sub2.method332((byte) 101, "OFF");
		anInt2031 = 3353893;

		aJString_2001 = Class37_Sub2.method332((byte) 119, "und loggen sich dann erneut ein)3");
		aJStringArray2041 = new JString[100];
		anInt2009 = 0;
		aJString_2006 = aJString_2021;
		aJString_2018 = Class37_Sub2.method332((byte) 123, "Hidden");
		aJString_2059 = aJString_2018;
	}

	public int bufferLocation;
	public byte[] buffer;

	public Stream(int i) {
		buffer = Class83.method1314((byte) 17, i);
		bufferLocation = 0;
	}

	public Stream(byte[] is) {
		bufferLocation = 0;
		buffer = is;
	}

	public void write3Bytes(int value, int i_0_) {
		buffer[bufferLocation++] = (byte) (value >> 16);

		if (i_0_ > -93) {
			anInt2014 = 31;
		}

		buffer[bufferLocation++] = (byte) (value >> 8);
		buffer[bufferLocation++] = (byte) value;
		anInt2019++;
	}

	public int readSignedShort(byte i) {
		bufferLocation += 2;
		anInt2069++;

		int i_2_ = ((0xff & buffer[-1 + bufferLocation]) + (0xff00 & (buffer[-2 + bufferLocation] << 8)));

		if (i_2_ > 32767) {
			i_2_ -= 65536;
		}

		return i_2_;
	}

	public int readByteC(byte i) {
		anInt2003++;

		if (i <= 14) {
			return 86;
		}

		return 0xff & -buffer[bufferLocation++];
	}

	public int readInt() {
		bufferLocation += 4;
		anInt2010++;

		return ((buffer[-1 + bufferLocation] & 0xff) + ((0xff00 & (buffer[bufferLocation - 2] << 8)) + ((0xff & buffer[bufferLocation + -4]) << 24) + ((buffer[-3 + bufferLocation] << 16) & 0xff0000)));
	}

	public static void loadMap(int i, boolean bool) {
		Class37_Sub17.aBoolean2165 = bool;

		if (Class37_Sub17.aBoolean2165) {
			Class83.packetStream.initBitAccess(false);

			for (int i_3_ = 0; i_3_ < 4; i_3_++) {
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -14; i_4_++) {
					for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -14; i_5_++) {
						int i_6_ = Class83.packetStream.readBits(1, 73);

						if (i_6_ == 1) {
							Class37_Sub9_Sub27.anIntArrayArrayArray3407[i_3_][i_4_][i_5_] = Class83.packetStream.readBits(26, 86);
						} else {
							Class37_Sub9_Sub27.anIntArrayArrayArray3407[i_3_][i_4_][i_5_] = -1;
						}
					}
				}
			}

			Class83.packetStream.finishBitAccess(true);

			int i_7_ = ((-Class83.packetStream.bufferLocation + Class37_Sub4.packetSize) / 16);
			Class37_Sub9_Sub36.anIntArrayArray3573 = new int[i_7_][4];

			for (int i_8_ = 0; (i_7_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
				for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -5; i_9_++)
					Class37_Sub9_Sub36.anIntArrayArray3573[i_8_][i_9_] = Class83.packetStream.readInt2(82);
			}

			int i_10_ = Class83.packetStream.readShortLEA(2);
			int i_11_ = Class83.packetStream.readShortLE(2);
			int i_12_ = Class83.packetStream.readShortLE(2);
			int i_13_ = Class83.packetStream.readByte(124);
			int i_14_ = Class83.packetStream.readShortA(i + -1739943584);

			Class22.aByteArrayArray569 = new byte[i_7_][];
			ObjectDef.anIntArray2712 = new int[i_7_];
			Class49.aByteArrayArray1005 = new byte[i_7_][];
			Class37_Sub9_Sub8.anIntArray3061 = new int[i_7_];
			Class66.anIntArray1261 = new int[i_7_];
			i_7_ = 0;

			for (int i_15_ = 0; i_15_ < 4; i_15_++) {
				for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -14; i_16_++) {
					for (int i_17_ = 0; i_17_ < 13; i_17_++) {
						int i_18_ = (Class37_Sub9_Sub27.anIntArrayArrayArray3407[i_15_][i_16_][i_17_]);

						if ((i_18_ ^ 0xffffffff) != 0) {
							int i_19_ = (i_18_ & 0xffe102) >> -2065348562;
							int i_20_ = (i_18_ >> -850334781) & 0x7ff;
							int i_21_ = ((i_19_ / 8) << -1958982808) + (i_20_ / 8);

							for (int i_22_ = 0; (i_7_ ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
								if (Class66.anIntArray1261[i_22_] == i_21_) {
									i_21_ = -1;

									break;
								}
							}

							if (i_21_ != -1) {
								Class66.anIntArray1261[i_7_] = i_21_;

								int i_23_ = (i_21_ >> -1455900856) & 0xff;
								int i_24_ = i_21_ & 0xff;

								ObjectDef.anIntArray2712[i_7_] = (Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740.method123((byte) 32, (Class37_Sub9_Sub27.method881(2, (new JString[] { Class86.aJString_1576, (Class37_Sub9_Sub24.method870(i_23_, (byte) -114)), Class71.aJString_1359, (Class37_Sub9_Sub24.method870(i_24_, (byte) -114)) })))));

								Class37_Sub9_Sub8.anIntArray3061[i_7_] = (Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740.method123((byte) 32, (Class37_Sub9_Sub27.method881(-58, (new JString[] { Class37_Sub9_Sub14.aJString_3156, (Class37_Sub9_Sub24.method870(i_23_, (byte) -114)), Class71.aJString_1359, (Class37_Sub9_Sub24.method870(i_24_, (byte) -114)) })))));
								i_7_++;
							}
						}
					}
				}
			}

			Class37_Sub9_Sub22.method859((byte) -128, i_14_, i_10_, i_12_, i_13_, i_11_);
		} else {
			int i_25_ = Class83.packetStream.readShortLEA(2);
			int i_26_ = Class83.packetStream.readByte(i + 117);
			int i_27_ = Class83.packetStream.readShort();
			int i_28_ = ((-Class83.packetStream.bufferLocation + Class37_Sub4.packetSize) / 16);
			Class37_Sub9_Sub36.anIntArrayArray3573 = new int[i_28_][4];

			for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
				for (int i_30_ = 0; i_30_ < 4; i_30_++) {
					Class37_Sub9_Sub36.anIntArrayArray3573[i_29_][i_30_] = (Class83.packetStream.readIntLE(Class37_Sub4_Sub7_Sub1_Sub1.method502(i, -52131576)));
				}
			}

			int i_31_ = Class83.packetStream.readShortA(-1739943584);
			int i_32_ = Class83.packetStream.readShort();
			Class49.aByteArrayArray1005 = new byte[i_28_][];
			ObjectDef.anIntArray2712 = new int[i_28_];
			Class37_Sub9_Sub8.anIntArray3061 = new int[i_28_];
			Class22.aByteArrayArray569 = new byte[i_28_][];
			Class66.anIntArray1261 = new int[i_28_];

			boolean bool_33_ = false;

			if (((i_27_ / 8) == 48 || (i_27_ / 8) == 49) && ((i_32_ / 8) == 48)) {
				bool_33_ = true;
			}

			if ((i_27_ / 8) == 48 && (i_32_ / 8) == 148) {
				bool_33_ = true;
			}

			i_28_ = 0;

			for (int i_34_ = (i_27_ - 6) / 8; i_34_ <= ((i_27_ + 6) / 8); i_34_++) {
				for (int i_35_ = (i_32_ - 6) / 8; ((i_32_ + 6) / 8) >= i_35_; i_35_++) {
					int i_36_ = i_35_ + (i_34_ << 8);

					if (!bool_33_ || (((i_35_ ^ 0xffffffff) != -50) && ((i_35_ ^ 0xffffffff) != -150) && (i_35_ != 147) && ((i_34_ ^ 0xffffffff) != -51) && ((i_34_ != 49) || ((i_35_ ^ 0xffffffff) != -48)))) {
						Class66.anIntArray1261[i_28_] = i_36_;

						ObjectDef.anIntArray2712[i_28_] = (Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740.method123((byte) 32, (Class37_Sub9_Sub27.method881(Class37_Sub4_Sub7_Sub1_Sub1.method502(i, -1), (new JString[] { Class86.aJString_1576, Class37_Sub9_Sub24.method870(i_34_, (byte) -114), Class71.aJString_1359, Class37_Sub9_Sub24.method870(i_35_, (byte) -114) })))));

						Class37_Sub9_Sub8.anIntArray3061[i_28_] = (Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740.method123((byte) 32, (Class37_Sub9_Sub27.method881(106, (new JString[] { Class37_Sub9_Sub14.aJString_3156, Class37_Sub9_Sub24.method870(i_34_, (byte) -114), Class71.aJString_1359, Class37_Sub9_Sub24.method870(i_35_, (byte) -114) })))));
						i_28_++;
					}
				}
			}

			Class37_Sub9_Sub22.method859((byte) -128, i_32_, i_27_, i_25_, i_26_, i_31_);
		}

		if (i != 0) {
			method983(30, -59);
		}

		anInt2017++;
	}

	public int read3Bytes(int i) {
		bufferLocation += 3;
		anInt2008++;

		if (i != -26256544) {
			aJStringArray2041 = null;
		}

		return ((0xff & buffer[-1 + bufferLocation]) + (((buffer[bufferLocation + -2] << 8) & 0xff00) + ((buffer[-3 + bufferLocation] & 0xff) << 16)));
	}

	public int readInt1(int i) {
		if (i != 8191) {
			readSignedShortA(-10);
		}

		anInt2048++;
		bufferLocation += 4;

		return ((buffer[-3 + bufferLocation] & 0xff) + ((0xff & buffer[bufferLocation + -2]) << 24) + ((buffer[-1 + bufferLocation] << 16) & 0xff0000) + ((buffer[bufferLocation + -4] << 8) & 0xff00));
	}

	public int method937(int i, byte i_37_) {
		anInt2029++;

		int i_38_ = Class85.method1319(buffer, i, bufferLocation, 448779536);
		writeInt(i_38_);

		if (i_37_ >= -60) {
			return -44;
		}

		return i_38_;
	}

	public byte readSignedByteC(int i) {
		if (i < 67) {
			return (byte) -45;
		}

		anInt2035++;

		return (byte) -buffer[bufferLocation++];
	}

	public int read3Bytes1(int i) {
		anInt2013++;

		if (i != -22591) {
			return 119;
		}

		bufferLocation += 3;

		return (((0xff & buffer[-3 + bufferLocation]) << 16) - (-((0xff & buffer[-1 + bufferLocation]) << 8) - (buffer[-2 + bufferLocation] & 0xff)));
	}

	public byte readSignedByteS(boolean bool) {
		if (bool != true) {
			writeByteS((byte) -25, -96);
		}

		anInt2071++;

		return (byte) (-buffer[bufferLocation++] + 128);
	}

	public byte readSignedByteA(byte i) {
		if (i < 67) {
			aJString_2044 = null;
		}

		anInt2027++;

		return (byte) (-128 + buffer[bufferLocation++]);
	}

	public int readSignedShortLE(int i) {
		anInt2028++;
		bufferLocation += i;

		int i_39_ = (((buffer[bufferLocation + -1] & 0xff) << 8) + (buffer[bufferLocation - 2] & 0xff));

		if (i_39_ > 32767) {
			i_39_ -= 65536;
		}

		return i_39_;
	}

	public void writeInt1(int i) {
		anInt2064++;
		buffer[bufferLocation++] = (byte) (i >> 8);
		buffer[bufferLocation++] = (byte) i;
		buffer[bufferLocation++] = (byte) (i >> 24);
		buffer[bufferLocation++] = (byte) (i >> 16);
	}

	public JString readString() {
		anInt2007++;

		int i_43_ = bufferLocation;

		while (buffer[bufferLocation++] != 0) {
			/* empty */
		}

		return Class37_Sub12.method998((byte) -17, bufferLocation - i_43_ - 1, buffer, i_43_);
	}

	public void writeShortA(int i, int i_44_) {
		buffer[bufferLocation++] = (byte) (i_44_ >> 8);
		buffer[bufferLocation++] = (byte) (i_44_ + 128);
		anInt2039++;

		if (i != 19058) {
			readBytes(-57, -8, null, (byte) 40);
		}
	}

	public void writeByteS(byte i, int value) {
		if (i == -85) {
			anInt2052++;
			buffer[bufferLocation++] = (byte) (-value + 128);
		}
	}

	public void writeInt(int i_46_) {
		anInt2011++;
		
		buffer[bufferLocation++] = (byte) (i_46_ >> 24);
		buffer[bufferLocation++] = (byte) (i_46_ >> 16);
		buffer[bufferLocation++] = (byte) (i_46_ >> 8);
		buffer[bufferLocation++] = (byte) i_46_;
	}

	public void method948(int i, int i_48_) {
		if (i_48_ == 128) {
			anInt2065++;
			buffer[-i + (bufferLocation - 1)] = (byte) i;
		}
	}

	public void writeLong(long l) {
		try {
			buffer[bufferLocation++] = (byte) (int) (l >> 56);
			anInt2005++;

			buffer[bufferLocation++] = (byte) (int) (l >> 48);
			buffer[bufferLocation++] = (byte) (int) (l >> 40);
			buffer[bufferLocation++] = (byte) (int) (l >> 32);
			buffer[bufferLocation++] = (byte) (int) (l >> 24);
			buffer[bufferLocation++] = (byte) (int) (l >> 16);
			buffer[bufferLocation++] = (byte) (int) (l >> 8);
			buffer[bufferLocation++] = (byte) (int) l;
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("hc.BB(" + l + ',' + 0 + ')'));
		}
	}

	public static int method950(int i, int i_50_, int i_51_) {
		anInt2020++;

		int i_52_ = 1;

		while (i_51_ > 1) {
			if ((i_51_ & 0x1) != 0) {
				i_52_ *= i_50_;
			}

			i_51_ >>= 1;
			i_50_ *= i_50_;
		}

		if (i < 40) {
			aJString_2018 = null;
		}

		if ((i_51_ ^ 0xffffffff) == -2) {
			return i_52_ * i_50_;
		}

		return i_52_;
	}

	public void writeSignedByteOrShort(byte i, int i_53_) {
		anInt2060++;

		if ((i_53_ >= 0) && (i_53_ < 128)) {
			writeByte(i_53_);
		} else if ((i_53_ >= 0) && ((i_53_ ^ 0xffffffff) > -32769)) {
			writeShort(i + 848881923, i_53_ + 32768);
		} else {
			if (i != 37) {
				anApplet_Sub1_2023 = null;
			}

			throw new IllegalArgumentException();
		}
	}

	public int readByteA() {
		anInt2074++;

		return (buffer[bufferLocation++] - 128) & 0xff;
	}

	public void writeLong1(int i, long l) {
		do {
			try {
				writeInt1((int) (l >> 32));
				anInt2024++;
				writeInt1((int) l);

				if (i == 1132103072) {
					break;
				}

				decodeXtea(-23, -125, (byte) 89, null);
			} catch (RuntimeException runtimeexception) {
				throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("hc.CB(" + i + ',' + l + ')'));
			}

			break;
		} while (false);
	}

	public void writeBytes(int length, int offset, int dummy, byte[] bytes) {
		if (dummy != 4) {
			aJStringArray2041 = null;
		}

		for (int i_57_ = offset; i_57_ < length + offset; i_57_++)
			buffer[bufferLocation++] = bytes[i_57_];

		anInt2042++;
	}

	public JString tryReadString(int i) {
		if (i != 255) {
			readSignedShort((byte) 126);
		}

		anInt2026++;

		if (buffer[bufferLocation] == 0) {
			bufferLocation++;

			return null;
		}

		return readString();
	}

	public int readShortLEA(int i) {
		bufferLocation += i;
		anInt2067++;

		return (((0xff & buffer[bufferLocation + -1]) << 8) - -((-128 + buffer[bufferLocation - 2]) & 0xff));
	}

	public void writeShortLEA(boolean bool, int i) {
		buffer[bufferLocation++] = (byte) (128 + i);
		anInt2022++;

		if (bool == true) {
			buffer[bufferLocation++] = (byte) (i >> 8);
		}
	}

	public void method958(byte i, BigInteger biginteger, BigInteger biginteger_58_) {
		try {
			anInt2056++;

			int i_59_ = bufferLocation;

			if (i >= -88) {
				writeString(null, 76);
			}

			bufferLocation = 0;

			byte[] is = new byte[i_59_];
			readBytes(0, i_59_, is, (byte) -53);

			BigInteger biginteger_60_ = new BigInteger(is);
			BigInteger biginteger_61_ = biginteger_60_.modPow(biginteger, biginteger_58_);
			byte[] is_62_ = biginteger_61_.toByteArray();
			bufferLocation = 0;
			writeByte(is_62_.length);
			writeBytes(is_62_.length, 0, 4, is_62_);
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("hc.GB(" + i + ',' + ((biginteger != null) ? "{...}" : "null") + ',' + ((biginteger_58_ != null) ? "{...}" : "null") + ')'));
		}
	}

	public int readShortOrByte(int i) { //I have to make it more descriptive later as there are modifications.
		anInt2073++;

		int i_64_ = buffer[bufferLocation] & 0xff;

		if ((i_64_ ^ 0xffffffff) <= -129) {
			return -49152 + readShort();
		}

		return readByte(120) - 64;
	}

	public void insertValueOffset(byte i, int i_65_) { //Terrible name but I can't think of any other way to describe it
		anInt2054++;

		if (i >= -2) {
			readBytes(14, -86, null, (byte) 60);
		}

		buffer[-4 + bufferLocation + -i_65_] = (byte) (i_65_ >> 24);
		buffer[-i_65_ + bufferLocation + -3] = (byte) (i_65_ >> 16);
		buffer[bufferLocation + -i_65_ + -2] = (byte) (i_65_ >> 8);
		buffer[-1 + bufferLocation + -i_65_] = (byte) i_65_;
	}

	public int readSignedShortOrByte(int i) {
		int i_66_ = i & buffer[bufferLocation];
		anInt2050++;

		if (i_66_ >= 128) {
			return -32768 + readShort();
		}

		return readByte(i ^ 0x81);
	}

	public void writeShortLE(int i, boolean bool) {
		buffer[bufferLocation++] = (byte) i;
		buffer[bufferLocation++] = (byte) (i >> -197350840);

		if (bool != false) {
			anInt2014 = -77;
		}

		anInt2047++;
	}

	public void readBytesReversed(int offset, byte[] dest, int dummy, int length) {
		anInt2057++;

		int i_69_ = length + (offset - 1);

		if (dummy < 42) {
			readByteS(-46);
		}

		for (; length <= i_69_; i_69_--)
			dest[i_69_] = buffer[bufferLocation++];
	}

	public void writeByte(int value) {
		buffer[bufferLocation++] = (byte) value;
		anInt2053++;
	}

	public void writeShort(int dummy, int value) {
		if (dummy == 848881960) {
			anInt2049++;
			buffer[bufferLocation++] = (byte) (value >> 8);
			buffer[bufferLocation++] = (byte) value;
		}
	}

	public void writeInt2(boolean bool, int i) {
		if (bool != false) {
			read3Bytes1(108);
		}

		anInt2037++;
		buffer[bufferLocation++] = (byte) (i >> 16);
		buffer[bufferLocation++] = (byte) (i >> 24);
		buffer[bufferLocation++] = (byte) i;
		buffer[bufferLocation++] = (byte) (i >> 8);
	}

	public int readByteS(int i) {
		if (i != 255) {
			aJString_2044 = null;
		}

		anInt2045++;

		return (-buffer[bufferLocation++] + 128) & 0xff;
	}

	public void readBytes(int offset, int length, byte[] dest, byte dummy) {
		anInt2061++;

		for (int i_74_ = offset; i_74_ < (length + offset); i_74_++)
			dest[i_74_] = buffer[bufferLocation++];

		if (dummy != -53) {
			writeIntLE(-97, 62);
		}
	}

	public int readInt2(int i) {
		if (i <= 69) {
			writeByte(-110);
		}

		bufferLocation += 4;
		anInt2072++;

		return ((buffer[-2 + bufferLocation] & 0xff) + (0xff00 & (buffer[-1 + bufferLocation] << 8)) + (((buffer[bufferLocation + -3] & 0xff) << 24) + ((buffer[bufferLocation - 4] << 16) & 0xff0000)));
	}

	public int readSignedShortA(int i) {
		bufferLocation += 2;
		anInt2033++;

		if (i != -2453) {
			anInt2004 = -7;
		}

		int i_75_ = ((0xff & (-128 + buffer[-1 + bufferLocation])) + (0xff00 & (buffer[bufferLocation + -2] << 8)));

		if (i_75_ > 32767) {
			i_75_ -= 65536;
		}

		return i_75_;
	}

	public long readLongDuplicate(boolean bool) { //This looks to be the exact same method as the regular readLong, so I'm not sure what's going on...
		anInt2066++;

		long l = 0xffffffffL & (long) readInt();
		long l_76_ = 0xffffffffL & (long) readInt();

		if (bool != false) {
			return 29L;
		}

		return l_76_ + (l << 32);
	}

	public void writeByteC(int i, int i_77_) {
		buffer[bufferLocation++] = (byte) -i_77_;

		if (i != 8) {
			writeIntLE(-42, -64);
		}

		anInt2034++;
	}

	public void writeIntLE(int i, int i_78_) {
		if (i_78_ != -1629130328) {
			aJString_2038 = null;
		}

		anInt2070++;
		buffer[bufferLocation++] = (byte) i;
		buffer[bufferLocation++] = (byte) (i >> 8);
		buffer[bufferLocation++] = (byte) (i >> 16);
		buffer[bufferLocation++] = (byte) (i >> 24);
	}

	public int method974(byte i) {
		anInt2030++;

		if (i >= -82) {
			readLongDuplicate(false);
		}

		int i_79_ = 0;
		int i_80_;

		for (i_80_ = buffer[bufferLocation++]; i_80_ < 0; i_80_ = buffer[bufferLocation++])
			i_79_ = (i_79_ | (i_80_ & 0x7f)) << -1019326105;

		return i_80_ | i_79_;
	}

	public int readShortLE(int i) {
		anInt2051++;
		bufferLocation += i;

		return ((0xff00 & (buffer[bufferLocation - 1] << 8)) + (0xff & buffer[-2 + bufferLocation]));
	}

	public void method976(int i, byte i_81_) {
		anInt2058++;

		if (i_81_ == 16) {
			if (((i & ~0x7f) ^ 0xffffffff) != -1) {
				if ((i & ~0x3fff) != 0) {
					if (((~0x1fffff & i) ^ 0xffffffff) != -1) {
						if ((~0xfffffff & i) != 0) {
							writeByte(0x80 | i >>> -1205282660);
						}

						writeByte(0x80 | i >>> 341586613);
					}

					writeByte(i >>> 1607471566 | 0x80);
				}

				writeByte((0x400d | i) >>> 946412423);
			}

			writeByte(0x7f & i);
		}
	}

	public void writeString(JString jstring, int i) {
		anInt2040++;
		bufferLocation += jstring.copy(jstring.length((byte) 38), bufferLocation, buffer, i ^ ~0x5a, i);
		buffer[bufferLocation++] = (byte) 0;
	}

	public int readByte(int i) {
		anInt2063++;

		if (i < 115) {
			readSignedShortA(111);
		}

		return 0xff & buffer[bufferLocation++];
	}

	public int readIntLE(int i) {
		if (i != -52131576) {
			readByteA();
		}

		bufferLocation += 4;
		anInt2015++;

		return (((buffer[-1 + bufferLocation] << 24) & ~0xffffff) - -((buffer[-2 + bufferLocation] & 0xff) << 16) + (((buffer[bufferLocation + -3] << 8) & 0xff00) - -(buffer[bufferLocation + -4] & 0xff)));
	}

	public int readShort() {
		bufferLocation += 2;

		anInt2068++;

		return ((0xff00 & (buffer[-2 + bufferLocation] << 8)) + (0xff & buffer[bufferLocation - 1]));
	}

	public void decodeXtea(int i, int i_83_, byte i_84_, int[] is) {
		anInt2046++;

		int i_85_ = bufferLocation;
		int i_86_ = (i - i_83_) / 8;
		bufferLocation = i_83_;

		for (int i_87_ = 0; i_86_ > i_87_; i_87_++) {
			int i_88_ = readInt();
			int i_89_ = readInt();
			int i_90_ = -957401312;
			int i_91_ = -1640531527;
			int i_92_ = 32;

			while (i_92_-- > 0) {
				i_89_ -= ((i_88_ + (i_88_ >>> 867048645 ^ (i_88_ << 2136205540))) ^ (is[i_90_ >>> -307927573 & 0x4ba00003] + i_90_));
				i_90_ -= i_91_;
				i_88_ -= ((i_90_ - -is[i_90_ & 0x3]) ^ (((i_89_ << -1280432060) ^ i_89_ >>> 481887621) - -i_89_));
			}

			bufferLocation -= 8;
			writeInt(i_88_);
			writeInt(i_89_);
		}

		if (i_84_ >= -54) {
			readBytes(-71, 52, null, (byte) 29);
		}

		bufferLocation = i_85_;
	}

	public byte readSignedByte(byte i) {
		if (i < 89) {
			writeByte(1);
		}

		anInt2012++;

		return buffer[bufferLocation++];
	}

	public static int method983(int i, int i_93_) {
		Class37_Sub4_Sub5 class37_sub4_sub5 = Class37_Sub3_Sub3.method387(i, 9199);
		anInt2036++;

		int i_94_ = class37_sub4_sub5.anInt2598;
		int i_95_ = class37_sub4_sub5.anInt2596;

		if (i_93_ < 108) {
			method983(46, -110);
		}

		int i_96_ = class37_sub4_sub5.anInt2594;
		int i_97_ = Class37_Sub4_Sub10.anIntArray2689[i_96_ + -i_94_];

		return i_97_ & (Class37_Sub23.anIntArray2237[i_95_] >> i_94_);
	}

	public int readShortA(int i) {
		bufferLocation += 2;
		anInt2002++;

		if (i != -1739943584) {
			write3Bytes(107, -126);
		}

		return (((buffer[-2 + bufferLocation] << 8) & 0xff00) + (0xff & (buffer[bufferLocation + -1] + -128)));
	}

	public static void resetStaticVariables(boolean bool) {
		aJString_2001 = null;
		aClass15_2025 = null;
		aJString_2059 = null;
		aJStringArray2041 = null;
		aJString_2006 = null;
		aJString_2021 = null;
		aJString_2038 = null;
		aJString_2044 = null;

		if (bool == false) {
			aJString_2018 = null;
		}
	}
}
