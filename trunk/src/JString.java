/* JString - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.awt.FontMetrics;
import java.awt.Graphics;

import java.net.MalformedURLException;
import java.net.URL;

public class JString implements Interface1 {
	public static int anInt1635;
	public static int anInt1636;
	public static int anInt1637;
	public static JString aJString_1638;
	public static int anInt1640;
	public static int anInt1641;
	public static int anInt1642;
	public static int anInt1643;
	public static int anInt1644;
	public static Class15 aClass15_1645;
	public static JString aJString_1646 = Class37_Sub2.method332((byte) 106, "Connecting to update server");
	public static int anInt1647;
	public static int anInt1648;
	public static int anInt1649;
	public static int anInt1651;
	public static int anInt1652;
	public static int anInt1653;
	public static int anInt1654;
	public static int anInt1655;
	public static int anInt1656;
	public static int anInt1657;
	public static int anInt1658;
	public static int[] anIntArray1659 = new int[128];
	public static int anInt1661;
	public static int anInt1662;
	public static int anInt1663;
	public static int anInt1664 = -16 + (int) (Math.random() * 33.0);
	public static int anInt1665;
	public static int anInt1666;
	public static int anInt1667;
	public static int anInt1668;
	public static int anInt1670;
	public static int anInt1671;
	public static int anInt1672;
	public static int anInt1673;
	public static int anInt1674;
	public static int anInt1675;
	public static int anInt1676;
	public static int anInt1677;
	public static int anInt1678;
	public static JString aJString_1679;
	public static int anInt1680;
	public static int anInt1681;
	public static JString aJString_1682 = aJString_1646;
	public static int anInt1683;
	public static int anInt1684;
	public static int anInt1685;

	/* synthetic */public static Class aJString86;

	static {
		aJString_1679 = Class37_Sub2.method332((byte) 111, "Loaded config");
		aJString_1638 = aJString_1679;
	}

	public boolean aBoolean1639 = true;
	public int length;
	public int anInt1660;
	public byte[] charArray;

	//This compares two strings
	//If a character is greater on the second or the second length is greater, it returns -1
	//If the character is less or the second length is less, it returns 1
	//If they're equal, it returns 0
	public int compareString(JString jstring_0_, int dummy) {
		anInt1655++;

		int len;

		if (length <= jstring_0_.length) {
			len = length;
		} else {
			len = jstring_0_.length;
		}

		for (int i_2_ = 0; i_2_ < len; i_2_++) {
			if ((jstring_0_.charArray[i_2_] & 0xff) > (0xff & charArray[i_2_])) {
				return -1;
			}

			if ((0xff & charArray[i_2_]) > (jstring_0_.charArray[i_2_] & 0xff)) {
				return 1;
			}
		}

		if (length < jstring_0_.length) {
			return -1;
		}

		if (length > jstring_0_.length) {
			return 1;
		}

		if (dummy != 10303) {
			return -74;
		}

		return 0;
	}

	public JString concatChar(int character, boolean dummy) {
		anInt1670++;

		if ((character <= 0) || (character > 255)) {
			throw new IllegalArgumentException("invalid char");
		}

		JString jstring_3_ = new JString();

		if (dummy != false) {
			length = -31;
		}

		jstring_3_.charArray = new byte[length + 1];
		jstring_3_.length = 1 + length;
		ArrayOperations.copyArray(charArray, 0, jstring_3_.charArray, 0, length);
		jstring_3_.charArray[length] = (byte) character;

		return jstring_3_;
	}

	public boolean isNumber() {
		anInt1643++;

		return isNumber(10);
	}

	public static void resetStaticVariables(byte i) {
		if (i >= 23) {
			aClass15_1645 = null;
			aJString_1682 = null;
			aJString_1679 = null;
			anIntArray1659 = null;
			aJString_1646 = null;
			aJString_1638 = null;
		}
	}

	public JString toLowerCase(int dummy) {
		if (dummy != 12131) {
			formatUsername(-103);
		}

		JString jstring_4_ = new JString();
		anInt1676++;
		jstring_4_.length = length;
		jstring_4_.charArray = new byte[length];

		for (int i_5_ = 0; i_5_ < length; i_5_++) {
			byte i_6_ = charArray[i_5_];

			if (((i_6_ >= 65) && (i_6_ <= 90)) || ((i_6_ >= -63) && (i_6_ <= -34) && (i_6_ != -41))) {
				i_6_ += 32;
			}

			jstring_4_.charArray[i_5_] = i_6_;
		}

		return jstring_4_;
	}

	public boolean equals(int dummy, JString compare) {
		anInt1684++;

		if (compare == null) {
			return false;
		}

		if (length != compare.length) {
			return false;
		}

		if (!aBoolean1639 || !compare.aBoolean1639) {
			if (anInt1660 == 0) {
				anInt1660 = getHashCode((byte) -111);

				if (anInt1660 == 0) {
					anInt1660 = 1;
				}
			}

			if (compare.anInt1660 == 0) {
				compare.anInt1660 = compare.getHashCode((byte) -125);

				if (compare.anInt1660 == 0) {
					compare.anInt1660 = 1;
				}
			}

			if (anInt1660 != compare.anInt1660) {
				return false;
			}
		}

		if (dummy > -75) {
			return false;
		}

		for (int i_8_ = 0; i_8_ < length; i_8_++) {
			if (compare.charArray[i_8_] != charArray[i_8_]) {
				return false;
			}
		}

		return true;
	}

	public boolean isNumber(int numBase) { //number compare with the ability to change the base number
		anInt1647++;

		boolean bool = false;
		boolean negative = false;

		int totalValue = 0;

		if ((numBase < 1) || (numBase > 36)) {
			numBase = 10;
		}

		for (int i_12_ = 0; i_12_ < length; i_12_++) {
			int c = 0xff & charArray[i_12_];

			if (i_12_ == 0) {
				if (c == 45) { //45 = -
					negative = true;

					continue;
				}

				if (c == 43) { //43 = +
					continue;
				}
			}

			if ((c >= 48) && (c <= 57)) { //numbers
				c -= 48;
			} else if ((c < 65) || (c > 90)) { //is not a capital letter
				if ((c >= 97) && (c <= 122)) { //is a lower-case letter
					c -= 87; //get the hexadecimal value, but for all letters, a = 10, b = 11, z = 36...
				} else {
					return false;
				}
			} else {
				c -= 55; //get the hexadecimal value ^
			}

			if (c >= numBase) {
				return false;
			}

			if (negative) {
				c = -c;
			}

			int value = (numBase * totalValue) + c;

			if ((value / numBase) != totalValue) {
				return false;
			}

			bool = true;
			totalValue = value; //The naming doesn't make any sense when looking at this line but does for above. idk.
		}

		return bool;
	}

	public String toString() {
		anInt1636++;
		throw new RuntimeException();
	}

	public JString formatCapitalization(int i) {
		int i_15_ = 2;
		JString jstring_16_ = new JString();

		if (i != 1) {
			parseInt(6, -34);
		}

		jstring_16_.length = length;
		jstring_16_.charArray = new byte[length];

		for (int i_17_ = 0; length > i_17_; i_17_++) {
			byte i_18_ = charArray[i_17_];

			if (((i_18_ < 97) || (i_18_ > 122)) && ((i_18_ < -32) || (i_18_ > -2) || (i_18_ == -9))) {
				if (((i_18_ < 65) || (i_18_ > 90)) && ((i_18_ < -64) || (i_18_ > -34) || (i_18_ == -41))) {
					if ((i_18_ == 46) || (i_18_ == 33) || (i_18_ == 63)) {
						i_15_ = 2;
					} else if (i_18_ != 32) {
						i_15_ = 1;
					} else if (i_15_ != 2) {
						i_15_ = 1;
					}
				} else {
					if (i_15_ == 0) {
						i_18_ += 32;
					}

					i_15_ = 0;
				}
			} else {
				if (i_15_ == 2) {
					i_18_ -= 32;
				}

				i_15_ = 0;
			}

			jstring_16_.charArray[i_17_] = i_18_;
		}

		anInt1649++;

		return jstring_16_;
	}

	public JString trim(byte dummy) {
		anInt1683++;

		if (dummy > -49) {
			getHashCode((byte) -66);
		}

		int newLength = length;
		int i_20_;

		for (i_20_ = 0; i_20_ < length; i_20_++) {
			if (((charArray[i_20_] < 0) || (charArray[i_20_] > 32)) && ((0xff & charArray[i_20_]) != 160)) {
				break;
			}
		}

		for (; (((i_20_ ^ 0xffffffff) > (newLength ^ 0xffffffff)) && ((((charArray[-1 + newLength] ^ 0xffffffff) <= -1) && (charArray[newLength - 1] <= 32)) || ((0xff & charArray[newLength - 1]) == 160))); newLength--) {
			/* empty */
		}

		if ((i_20_ == 0) && (newLength == length)) {
			return this;
		}

		JString jstring_21_ = new JString();
		jstring_21_.length = newLength - i_20_;
		jstring_21_.charArray = new byte[jstring_21_.length];

		for (int i_22_ = 0; i_22_ < jstring_21_.length; i_22_++)
			jstring_21_.charArray[i_22_] = charArray[i_20_ + i_22_];

		return jstring_21_;
	}

	public long toInt64(int i) {
		anInt1658++;

		long l = 0L;

		for (int i_23_ = 0; (((i_23_ ^ 0xffffffff) > (length ^ 0xffffffff)) && ((i_23_ ^ 0xffffffff) > -13)); i_23_++) {
			int i_24_ = charArray[i_23_];
			l *= 37L;

			if (((i_24_ ^ 0xffffffff) <= -66) && (i_24_ <= 90)) {
				l += (long) (-65 + (i_24_ + 1));
			} else if (((i_24_ ^ 0xffffffff) <= -98) && (i_24_ <= 122)) {
				l += (long) (-97 + (i_24_ + 1));
			} else if (((i_24_ ^ 0xffffffff) <= -49) && ((i_24_ ^ 0xffffffff) >= -58)) {
				l += (long) (-48 + (27 - -i_24_));
			}
		}

		if (i > -35) {
			getHashCodeLong(-5);
		}

		for (; (((l % 37L) ^ 0xffffffffffffffffL) == -1L) && (l != 0L); l /= 37L) {
			/* empty */
		}

		return l;
	}

	public static int method153(int i, int i_25_, int i_26_, int i_27_) {
		anInt1675++;

		int i_28_ = i_27_ >> 1243315303;
		int i_29_ = i_26_ >> 49332391;

		if (i_25_ != -169496123) {
			resetStaticVariables((byte) -81);
		}

		if ((i_28_ < 0) || (i_29_ < 0) || (i_28_ > 103) || ((i_29_ ^ 0xffffffff) < -104)) {
			return 0;
		}

		int i_30_ = i;

		if (((i_30_ ^ 0xffffffff) > -4) && (((Class1.aByteArrayArrayArray63[1][i_28_][i_29_] & 0x2) ^ 0xffffffff) == -3)) {
			i_30_++;
		}

		int i_31_ = 0x7f & i_27_;
		int i_32_ = ((((128 + -i_31_) * Class64.anIntArrayArrayArray1217[i_30_][i_28_][i_29_]) - -(Class64.anIntArrayArrayArray1217[i_30_][1 + i_28_][i_29_] * i_31_)) >> -52272761);
		int i_33_ = 0x7f & i_26_;
		int i_34_ = ((((128 + -i_31_) * (Class64.anIntArrayArrayArray1217[i_30_][i_28_][1 + i_29_])) + ((Class64.anIntArrayArrayArray1217[i_30_][i_28_ - -1][i_29_ + 1]) * i_31_)) >> 539975719);

		return ((i_32_ * (-i_33_ + 128)) + (i_34_ * i_33_)) >> 1771097127;
	}

	public JString appendChar(int dummy, int c) {
		anInt1673++;

		if (c <= 0 || c > 255) {
			throw new IllegalArgumentException("invalid char:" + c);
		}

		if (!aBoolean1639) {
			throw new IllegalArgumentException();
		}

		anInt1660 = dummy;

		if (length == charArray.length) {
			int i_36_;

			for (i_36_ = 1; i_36_ <= length; i_36_ += i_36_) {
				/* empty */
			}

			byte[] is = new byte[i_36_];
			ArrayOperations.copyArray(charArray, 0, is, 0, length);
			charArray = is;
		}

		charArray[length++] = (byte) c;

		return this;
	}

	public int hashCode() {
		anInt1657++;

		return getHashCode((byte) -107);
	}

	public int parseInt(int dummy, int numBase) {
		if (dummy != 1037) {
			aJString_1682 = null;
		}

		boolean negative = false;

		if ((numBase < 1) || (numBase > 36)) {
			numBase = 10;
		}

		boolean bool_38_ = false;
		anInt1640++;

		int totalValue = 0;

		for (int i_40_ = 0; length > i_40_; i_40_++) {
			int c = 0xff & charArray[i_40_];

			if (i_40_ == 0) {
				if (c == 45) { //45 = -
					negative = true;

					continue;
				}

				if (c == 43) { //43 = +
					continue;
				}
			}

			if ((c >= 48) && (c <= 57)) { //number
				c -= 48;
			} else if (c >= 65 && c <= 90) { //capital
				c -= 55;
			} else {
				if ((c < 97) || (c > 122)) {
					throw new NumberFormatException();
				}

				c -= 87; //lowercase
			}

			if (numBase <= c) {
				throw new NumberFormatException();
			}

			if (negative) {
				c = -c;
			}

			int value = c + (totalValue * numBase);

			if ((value / numBase) != totalValue) {
				throw new NumberFormatException();
			}

			totalValue = value;
			bool_38_ = true;
		}

		if (!bool_38_) {
			throw new NumberFormatException();
		}

		return totalValue;
	}

	public int indexOf(JString jstring_43_) {
		anInt1678++;

		return indexOf(jstring_43_, 0);
	}

	public JString append(JString str, int dummy) {
		anInt1681++;

		if (!aBoolean1639) {
			throw new IllegalArgumentException();
		}

		anInt1660 = 0;

		if (charArray.length < str.length + length) {
			int i_46_;

			for (i_46_ = 1; i_46_ < (length + str.length); i_46_ += i_46_) {
				/* empty */
			}

			byte[] is = new byte[i_46_];
			ArrayOperations.copyArray(charArray, 0, is, 0, length);
			charArray = is;
		}

		ArrayOperations.copyArray(str.charArray, 0, charArray, length, str.length);
		length += str.length;

		if (dummy != -20035) {
			return null;
		}

		return this;
	}

	public JString substring(int offset) {
		anInt1656++;

		return substring(0, offset, length);
	}

	public boolean equalsIgnoreCase(JString compare, byte dummy) {
		anInt1671++;

		if (compare == null) {
			return false;
		}

		if (dummy < 52) {
			charArray = null;
		}

		if (compare.length != length) {
			return false;
		}

		for (int i_49_ = 0; length > i_49_; i_49_++) {
			byte c = compare.charArray[i_49_];

			if (((c >= 65) && (c <= 90)) || ((c >= -64) && c <= -34 && (c != -40))) {
				c += 32;
			}

			byte i_51_ = charArray[i_49_];

			if ((((i_51_ ^ 0xffffffff) <= -66) && (i_51_ <= 90)) || ((i_51_ >= -64) && (i_51_ <= -34) && (i_51_ != -41))) {
				i_51_ += 32;
			}

			if (c != i_51_) {
				return false;
			}
		}

		return true;
	}

	public int indexOf(int start, int lookFor, int dummy) {
		anInt1651++;

		byte i_54_ = (byte) lookFor;

		if (dummy != 25356) {
			method153(-62, -49, 63, -82);
		}

		for (int i_55_ = start; i_55_ < length; i_55_++) {
			if (i_54_ == charArray[i_55_]) {
				return i_55_;
			}
		}

		return -1;
	}

	public int charAt(int i) {
		anInt1635++;

		return 0xff & charArray[i];
	}

	//Not 100% sure about this one. All I could think of really.
	public int getHashCode(byte dummy) {
		anInt1654++;

		int hash = 0;

		if (dummy > -104) {
			return 45;
		}

		for (int i_59_ = 0; i_59_ < length; i_59_++)
			hash = (hash << 5) + ((0xff & charArray[i_59_]) - hash);

		return hash;
	}

	public JString censor() { //Used to hide the password. Not sure about 'bad' words.
		JString jstring_60_ = new JString();
		jstring_60_.length = length;
		jstring_60_.charArray = new byte[length];

		for (int i_61_ = 0; length > i_61_; i_61_++)
			jstring_60_.charArray[i_61_] = (byte) 42; //42 = *

		anInt1668++;

		return jstring_60_;
	}

	public boolean equals(Object object) {
		anInt1665++;

		if (object instanceof JString) {
			return equals(-97, (JString) object);
		}

		throw new IllegalArgumentException();
	}

	//I have no idea where this is used or what it's for, so I don't know what else to name it.
	public JString capitalizeAfterQuestion(int dummy) {
		anInt1672++;

		JString jstring_63_ = new JString();
		jstring_63_.length = length;

		if (dummy != 70) {
			aJString_1646 = null;
		}

		boolean capitalize = true;
		jstring_63_.charArray = new byte[length];

		for (int i_64_ = 0; i_64_ < length; i_64_++) {
			byte c = charArray[i_64_];

			if (c == 95) { //95 = ?
				capitalize = true;
				jstring_63_.charArray[i_64_] = (byte) 32; //32 = space, obviously (who doesn't know that?)
			} else if ((c >= 97) && (c <= 122) && capitalize) { //Capitalize
				capitalize = false;
				jstring_63_.charArray[i_64_] = (byte) (c - 32);
			} else {
				capitalize = false;
				jstring_63_.charArray[i_64_] = c;
			}
		}

		return jstring_63_;
	}

	public boolean startsWith(JString compare, int dummy) {
		anInt1666++;

		if (compare.length > length) {
			return false;
		}

		for (int i_67_ = 0; i_67_ < compare.length; i_67_++) {
			if (compare.charArray[i_67_] != charArray[i_67_]) {
				return false;
			}
		}

		if (dummy != 52) {
			resetStaticVariables((byte) 20);
		}

		return true;
	}

	//No clue
	public JString method166(int i) {
		long l = getHashCodeLong(-169496123);
		anInt1663++;

		synchronized ((aJString86 != null) ? aJString86 : (aJString86 = classForName("JString"))) {
			if (Class62.aClass13_1185 != null) {
				for (Class37_Sub1 class37_sub1 = ((Class37_Sub1) Class62.aClass13_1185.method100((byte) 116, l)); class37_sub1 != null; class37_sub1 = ((Class37_Sub1) Class62.aClass13_1185.method98(-9410))) {
					if (equals(-127, class37_sub1.aJString_1797)) {
						return class37_sub1.aJString_1797;
					}
				}
			} else {
				Class62.aClass13_1185 = new Class13(4096);
			}

			Class37_Sub1 class37_sub1 = new Class37_Sub1();
			aBoolean1639 = false;
			class37_sub1.aJString_1797 = this;
			Class62.aClass13_1185.method101(class37_sub1, false, l);
		}

		if (i > -88) {
			indexOf(null, 52);
		}

		return this;
	}

	public JString formatUsername(int dummy) {
		int newLength = 0;

		if (dummy != -1) {
			method170(false, null);
		}

		JString jstring_69_ = new JString();
		jstring_69_.charArray = new byte[12];
		anInt1685++;
		jstring_69_.length = 0;

		for (int i_70_ = 0; i_70_ < length; i_70_++) {
			if ((charArray[i_70_] < 65) || (charArray[i_70_] > 90)) {
				if (((charArray[i_70_] < 97) || (charArray[i_70_] > 122)) && ((charArray[i_70_] < 48) || (charArray[i_70_] > 57))) {
					if (newLength > 0) {
						jstring_69_.charArray[newLength++] = (byte) 95;
					}
				} else {
					jstring_69_.charArray[newLength++] = charArray[i_70_];
					jstring_69_.length = newLength;
				}
			} else {
				jstring_69_.charArray[newLength++] = (byte) (32 + charArray[i_70_]);
				jstring_69_.length = newLength;
			}

			if (newLength == 12) {
				break;
			}
		}

		return jstring_69_;
	}

	//I didn't refactor any of this because it looks painful. At a quick glance it appears to be indexOf but with a string.
	public int indexOf(JString search, int start) {
		int[] is = new int[search.length];
		anInt1680++;

		int[] is_73_ = new int[256];
		int[] is_74_ = new int[search.length];
		int i_75_ = 0;

		for (; (i_75_ ^ 0xffffffff) > (is_73_.length ^ 0xffffffff); i_75_++)
			is_73_[i_75_] = search.length;

		for (int i_76_ = 1; (i_76_ ^ 0xffffffff) >= (search.length ^ 0xffffffff); i_76_++) {
			is[-1 + i_76_] = (search.length << 1) + -i_76_;

			is_73_[Class37_Sub4_Sub7.method490(255, search.charArray[-1 + i_76_])] = search.length - i_76_;
		}

		int i_77_ = 1 + search.length;
		int i_78_ = search.length;

		while ((i_78_ ^ 0xffffffff) < -1) {
			is_74_[-1 + i_78_] = i_77_;

			for (; (((search.length ^ 0xffffffff) <= (i_77_ ^ 0xffffffff)) && ((search.charArray[-1 + i_78_] ^ 0xffffffff) != (search.charArray[-1 + i_77_] ^ 0xffffffff))); i_77_ = is_74_[i_77_ + -1]) {
				if (is[-1 + i_77_] >= (-i_78_ + search.length)) {
					is[-1 + i_77_] = search.length - i_78_;
				}
			}

			i_78_--;
			i_77_--;
		}

		int i_79_ = i_77_;
		int i_80_ = 0;
		int i_81_ = 1;
		i_77_ = -i_79_ + search.length + 1;

		for (int i_82_ = 1; (i_77_ ^ 0xffffffff) <= (i_82_ ^ 0xffffffff); i_82_++) {
			is_74_[i_82_ + -1] = i_80_;

			for (; (i_80_ >= 1) && (search.charArray[-1 + i_82_] != search.charArray[i_80_ + -1]); i_80_ = is_74_[-1 + i_80_]) {
				/* empty */
			}

			i_80_++;
		}

		while ((i_79_ ^ 0xffffffff) > (search.length ^ 0xffffffff)) {
			for (int i_83_ = i_81_; (i_79_ ^ 0xffffffff) <= (i_83_ ^ 0xffffffff); i_83_++) {
				if ((((i_79_ + search.length) - i_83_) ^ 0xffffffff) >= (is[i_83_ + -1] ^ 0xffffffff)) {
					is[i_83_ - 1] = -i_83_ + (i_79_ + search.length);
				}
			}

			i_81_ = 1 + i_79_;
			i_79_ = -is_74_[-1 + i_77_] + i_77_ + i_79_;
			i_77_ = is_74_[i_77_ - 1];
		}

		int i_84_;

		for (int i_85_ = search.length + (start - 1); (i_85_ ^ 0xffffffff) > (length ^ 0xffffffff); i_85_ += Math.max(is_73_[charArray[i_85_] & 0xff], is[i_84_])) {
			for (i_84_ = search.length + -1; (i_84_ >= 0) && (charArray[i_85_] == search.charArray[i_84_]); i_84_--)
				i_85_--;

			if ((i_84_ ^ 0xffffffff) == 0) {
				return i_85_ - -1;
			}
		}

		return -1;
	}

	public JString substring(int destOffset, int offset, int length) { //wtf @ destOffset
		anInt1667++;

		JString jstring_88_ = new JString();
		jstring_88_.charArray = new byte[length - offset];
		jstring_88_.length = length - offset;
		ArrayOperations.copyArray(charArray, offset, jstring_88_.charArray, destOffset, jstring_88_.length);

		return jstring_88_;
	}

	//I don't know what anIntArray3326 is yet, so I can't rename this
	public int method170(boolean bool, JString jstring_89_) {
		int i;

		if (length > jstring_89_.length) {
			i = jstring_89_.length;
		} else {
			i = length;
		}

		anInt1652++;

		if (bool != true) {
			draw(null, 126, 47);
		}

		for (int i_90_ = 0; i_90_ < i; i_90_++) {
			if (Class37_Sub9_Sub22.anIntArray3326[charArray[i_90_] & 0xff] < (Class37_Sub9_Sub22.anIntArray3326[0xff & jstring_89_.charArray[i_90_]])) {
				return -1;
			}

			if ((Class37_Sub9_Sub22.anIntArray3326[jstring_89_.charArray[i_90_] & 0xff]) < (Class37_Sub9_Sub22.anIntArray3326[charArray[i_90_] & 0xff])) {
				return 1;
			}
		}

		if (length < jstring_89_.length) {
			return -1;
		}

		if (jstring_89_.length < length) {
			return 1;
		}

		return 0;
	}

	//Again, not sure what this is.
	public long getHashCodeLong(int dummy) {
		anInt1662++;

		if (dummy != -169496123) {
			charAt(-94);
		}

		long hash = 0L;

		for (int i_91_ = 0; i_91_ < length; i_91_++)
			hash = ((long) (0xff & charArray[i_91_]) + (hash << 5)) - hash;

		return hash;
	}

	public int length(byte dummy) {
		if (dummy != 38) {
			return -84;
		}

		anInt1653++;

		return length;
	}

	public JString fixLength() { //Not sure what to call it, but all it does is removes the extra space in the character buffer.
		anInt1637++;

		if (!aBoolean1639) {
			throw new IllegalArgumentException();
		}

		anInt1660 = 0;

		if (charArray.length != length) {
			byte[] is = new byte[length];
			ArrayOperations.copyArray(charArray, 0, is, 0, length);
			charArray = is;
		}

		return this;
	}

	public int getWidth(FontMetrics fontmetrics, int i) {
		String string;

		try {
			string = new String(charArray, 0, length, "ISO-8859-1");
		} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
			string = new String(charArray, 0, length);
		}

		if (i <= 83) {
			aJString_1682 = null;
		}

		anInt1677++;

		return fontmetrics.stringWidth(string);
	}

	public int method175(int i) {
		if (i != 8109) {
			getHashCodeLong(-11);
		}

		anInt1642++;

		return parseInt(1037, 10);
	}

	public boolean endsWith(JString compare, byte i) {
		anInt1644++;

		if (compare.length > length) {
			return false;
		}

		int i_93_ = length - compare.length;

		if (i != -124) {
			aClass15_1645 = null;
		}

		for (int i_94_ = 0; i_94_ < compare.length; i_94_++) {
			if (charArray[i_94_ + i_93_] != compare.charArray[i_94_]) {
				return false;
			}
		}

		return true;
	}

	public int copy(int len, int destOffset, byte[] destination, int i_96_, int srcOffset) {
		anInt1661++;

		if (i_96_ != -91) {
			return -76;
		}

		ArrayOperations.copyArray(charArray, srcOffset, destination, destOffset, len - srcOffset);

		return len - srcOffset;
	}

	public URL toURL() throws MalformedURLException {
		anInt1648++;

		return new URL(new String(charArray, 0, length));
	}

	public byte[] getCharArray() {
		anInt1674++;

		byte[] is = new byte[length];
		ArrayOperations.copyArray(charArray, 0, is, 0, length);

		return is;
	}

	public void draw(Graphics graphics, int x, int y) {
		anInt1641++;

		String string;

		try {
			string = new String(charArray, 0, length, "ISO-8859-1");
		} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
			string = new String(charArray, 0, length);
		}

		graphics.drawString(string, x, y);
	}

	/* synthetic */public static Class classForName(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
