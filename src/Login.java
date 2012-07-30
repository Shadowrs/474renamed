/* Login - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.io.IOException;

import java.net.Socket;

public class Login {
	public static JString aJString_776;
	public static JString aJString_777;
	public static int anInt778;
	public static byte[] aByteArray779;
	public static JString aJString_780;
	public static int anInt781;
	public static int anInt782;
	public static int anInt783;
	public static JString aJString_784 = Class37_Sub2.method332((byte) 106, "Hierhin gehen");
	public static int anInt785;
	public static JString aJString_786;
	public static JString aJString_787;
	public static int anInt788;
	public static short[] aShortArray789;
	public static JString aJString_790;
	public static JString aJString_791;
	public static int anInt792;
	public static int anInt793;
	public static int anInt794;

	static {
		aJString_777 = Class37_Sub2.method332((byte) 108, "Connection lost)3");
		aJString_786 = Class37_Sub2.method332((byte) 122, "lila:");
		aJString_776 = Class37_Sub2.method332((byte) 127, "Please enter your username)3");
		anInt782 = 0;
		aJString_780 = Class37_Sub2.method332((byte) 117, "blaugr-Un:");
		anInt781 = 0;
		aJString_787 = aJString_776;
		aJString_790 = Class37_Sub2.method332((byte) 117, "Null");
		aJString_791 = aJString_777;
		aByteArray779 = new byte[520];
	}

	public static byte[] method312(byte[] is, byte i) {
		Stream stream = new Stream(is);

		if (i != 106) {
			performLogin(25);
		}

		int i_0_ = stream.readByte(i + 12);
		anInt792++;

		int i_1_ = stream.readInt();

		if (i_1_ < 0 || (Class15_Sub1.anInt1762 != 0 && Class15_Sub1.anInt1762 < i_1_)) {
			throw new RuntimeException();
		}
		if (i_0_ != 0) {
			int i_2_ = stream.readInt();

			if ((i_2_ < 0) || (Class15_Sub1.anInt1762 != 0 && (Class15_Sub1.anInt1762 < i_2_))) {
				return new byte[100];
				// throw new RuntimeException();
			}
			if (i_2_ >= 2000000) {
				return new byte[100];
			}
			byte[] is_3_ = new byte[i_2_];
			if (i_0_ != 1) {
				Class37_Sub4_Sub3.aClass6_2552.method58((byte) 126, is_3_, stream);
			} else {
				Class31.method286(is_3_, i_2_, is, i_1_, 9);
			}

			return is_3_;
		}

		byte[] is_4_ = new byte[i_1_];
		stream.readBytes(0, i_1_, is_4_, (byte) -53);

		return is_4_;
	}

	public static void method313(int i, Class15_Sub1 class15_sub1, CacheIO class69, int i_5_) {
		try {
			anInt793++;

			Class37_Sub5 class37_sub5 = new Class37_Sub5();
			class37_sub5.aClass69_1866 = class69;
			class37_sub5.aClass15_Sub1_1868 = class15_sub1;
			class37_sub5.anInt1867 = i_5_;
			class37_sub5.aLong818 = (long) i;

			synchronized (Class37_Sub9_Sub34.aClass58_3557) {
				Class37_Sub9_Sub34.aClass58_3557.method1149((byte) -117, class37_sub5);
			}

			Class37_Sub10.method926(true);
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("kf.B(" + i + ',' + ((class15_sub1 != null) ? "{...}" : "null") + ',' + ((class69 != null) ? "{...}" : "null") + ',' + i_5_ + ')'));
		}
	}

	public static void method314(int i) {
		if (i != -9) {
			anInt788 = 26;
		}

		aShortArray789 = null;
		aJString_776 = null;
		aJString_791 = null;
		aJString_787 = null;
		aJString_790 = null;
		aByteArray779 = null;
		aJString_777 = null;
		aJString_780 = null;
		aJString_786 = null;
		aJString_784 = null;
	}

	public static void performLogin(int i) {
		anInt794++;

		try {
			if (Class22.loginStage == 0) {
				if (Applet_Sub1.activeSocket != null) {
					Applet_Sub1.activeSocket.killThread((byte) -128);
					Applet_Sub1.activeSocket = null;
				}

				Class37_Sub18.aBoolean2201 = false;
				anInt781 = 0;
				Class22.loginStage = 1;
				Class55.loginThread = null;
			}

			if (Class22.loginStage == 1) {
				if (Class55.loginThread == null) {
					Class55.loginThread = (Class80.signlink.createResource(Class37_Sub8.address, Class37_Sub4_Sub7_Sub1.port, true));
				}

				if (Class55.loginThread.state == 2) {
					throw new IOException();
				}

				if (Class55.loginThread.state == 1) {
					Applet_Sub1.activeSocket = new RSSocket(((Socket) Class55.loginThread.resource), Class80.signlink);
					Class22.loginStage = 2;
					Class55.loginThread = null;
				}
			}

			if (Class22.loginStage == 2) {
				long l = (Class37_Sub9_Sub34.aLong3556 = Class37_Sub9_Sub33.playerName.toInt64(-53));
				int nameHash = (int) (0x1fL & (l >> 16));
				Class42.outputStream.bufferLocation = 0;
				Class42.outputStream.writeByte(14);
				Class42.outputStream.writeByte(nameHash);
				Applet_Sub1.activeSocket.write(0, (byte) 101, (Class42.outputStream.buffer), 2);
				Class83.packetStream.bufferLocation = 0;
				Class22.loginStage = 3;
			}

			if (Class22.loginStage == 3) {
				if (Class88.aClass24_1605 != null) {
					Class88.aClass24_1605.method243(false);
				}

				if (Class37_Sub4_Sub7.aClass24_2638 != null) {
					Class37_Sub4_Sub7.aClass24_2638.method243(false);
				}

				int i_7_ = Applet_Sub1.activeSocket.read(false);

				if (Class88.aClass24_1605 != null) {
					Class88.aClass24_1605.method243(false);
				}

				if (Class37_Sub4_Sub7.aClass24_2638 != null) {
					Class37_Sub4_Sub7.aClass24_2638.method243(false);
				}

				if (i_7_ != 0) {
					RuntimeException_Sub1.handleBadLogin(i_7_, (byte) 59);

					return;
				}

				Class83.packetStream.bufferLocation = 0;
				Class22.loginStage = 4;
			}

			if (Class22.loginStage == 4) {
				if (Class83.packetStream.bufferLocation < 8) {
					int available = Applet_Sub1.activeSocket.available();

					if (available > 8 - Class83.packetStream.bufferLocation) {
						available = 8 - Class83.packetStream.bufferLocation;
					}

					if (available > 0) {
						Applet_Sub1.activeSocket.read(available, Class83.packetStream.bufferLocation, 122, Class83.packetStream.buffer);
						Class83.packetStream.bufferLocation += available;
					}
				}

				if (Class83.packetStream.bufferLocation == 8) {
					Class83.packetStream.bufferLocation = 0;

					Class26.serverSessionKey = Class83.packetStream.readLongDuplicate(false);
					Class22.loginStage = 5;
				}
			}

			if (Class22.loginStage == 5) {
				int[] sessionKeys = new int[4];
				sessionKeys[0] = (int) (Math.random() * 9.9999999E7);
				sessionKeys[3] = (int) Class26.serverSessionKey;
				sessionKeys[2] = (int) (Class26.serverSessionKey >> -311437664);
				Class42.outputStream.bufferLocation = 0;
				sessionKeys[1] = (int) (9.9999999E7 * Math.random());
				Class42.outputStream.writeByte(10);
				Class42.outputStream.writeInt(sessionKeys[0]);
				Class42.outputStream.writeInt(sessionKeys[1]);
				Class42.outputStream.writeInt(sessionKeys[2]);
				Class42.outputStream.writeInt(sessionKeys[3]);
				Class42.outputStream.writeLong(Class37_Sub9_Sub33.playerName.toInt64(i ^ 0x53be));
				Class42.outputStream.writeString(Class37_Sub9_Sub33.playerPassword, 0);
				// Class42.outputStream.method958((byte) -91,
				// (Class37_Sub20.aBigInteger2210), (Class26.aBigInteger652));
				Class58.loginOutputStream.bufferLocation = 0;

				if (AbstractDrawingArea.anInt740 != 40) {
					Class58.loginOutputStream.writeByte(16);
				} else {
					Class58.loginOutputStream.writeByte(18);
				}

				Class58.loginOutputStream.writeByte(Class42.outputStream.bufferLocation + 93);
				Class58.loginOutputStream.writeInt(474);
				Class58.loginOutputStream.writeByte(Class37_Sub4_Sub6.aBoolean2613 ? 1 : 0);
				Class25.writeFromRandom(Class58.loginOutputStream, -107);
				Class58.loginOutputStream.writeInt(CacheIO.aClass15_Sub1_1335.anInt255);
				Class58.loginOutputStream.writeInt(CacheIO.aClass15_Sub1_1330.anInt255);
				Class58.loginOutputStream.writeInt(Class14.aClass15_Sub1_242.anInt255);
				Class58.loginOutputStream.writeInt((Canvas_Sub1.aClass15_Sub1_46.anInt255));
				Class58.loginOutputStream.writeInt((Class37_Sub4.aClass15_Sub1_1862.anInt255));
				Class58.loginOutputStream.writeInt(Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740.anInt255);
				Class58.loginOutputStream.writeInt(Class54.aClass15_Sub1_1060.anInt255);
				Class58.loginOutputStream.writeInt(Class29.aClass15_Sub1_711.anInt255);
				Class58.loginOutputStream.writeInt((Class60.aClass15_Sub1_1151.anInt255));
				Class58.loginOutputStream.writeInt((PacketStream.aClass15_Sub1_3609.anInt255));
				Class58.loginOutputStream.writeInt((Class52_Sub1.aClass15_Sub1_2309.anInt255));
				Class58.loginOutputStream.writeInt((Class36.aClass15_Sub1_796.anInt255));
				Class58.loginOutputStream.writeInt((Class37_Sub9_Sub34.aClass15_Sub1_3555.anInt255));
				Class58.loginOutputStream.writeInt((Class37_Sub9_Sub2.aClass15_Sub1_2932.anInt255));
				Class58.loginOutputStream.writeInt((Class37_Sub20.aClass15_Sub1_2216.anInt255));
				Class58.loginOutputStream.writeInt((Class37_Sub17.aClass15_Sub1_2164.anInt255));
				Class58.loginOutputStream.writeBytes(Class42.outputStream.bufferLocation, 0, i + 21486, Class42.outputStream.buffer);
				Applet_Sub1.activeSocket.write(0, (byte) 102, Class58.loginOutputStream.buffer, Class58.loginOutputStream.bufferLocation);
				Class42.outputStream.initISAAC(false, sessionKeys);

				for (int i_9_ = 0; i_9_ < 4; i_9_++)
					sessionKeys[i_9_] += 50;

				Class83.packetStream.initISAAC(false, sessionKeys);
				Class22.loginStage = 6;
			}

			if (Class22.loginStage == 6 && Applet_Sub1.activeSocket.available() > 0) {
				int returnCode = Applet_Sub1.activeSocket.read(false);

				if ((returnCode == 21) && (AbstractDrawingArea.anInt740 == 20)) {
					Class22.loginStage = 7;
				} else if (returnCode != 2) {
					if ((returnCode == 15) && (AbstractDrawingArea.anInt740 == 40)) {
						Class37_Sub9_Sub9.resetPlayerIO(i + 26512);

						return;
					}

					if (returnCode == 23 && (Class37_Sub9_Sub23.anInt3355 < 1)) {
						Class37_Sub9_Sub23.anInt3355++;
						Class22.loginStage = 0;
					} else {
						RuntimeException_Sub1.handleBadLogin(returnCode, (byte) 59);

						return;
					}
				} else {
					Class22.loginStage = 9;
				}
			}

			if ((Class22.loginStage == 7) && (Applet_Sub1.activeSocket.available() > 0)) {
				RSApplet.loginSeconds = (60 * Applet_Sub1.activeSocket.read(false)) + 180; //You only just left another world. Your profile will be transferred in X seconds.
				Class22.loginStage = 8;
			}

			if (Class22.loginStage == 8) {
				anInt781 = 0;
				Class32_Sub1.method293((byte) -120, (Class37_Sub9_Sub27.method881(-84, (new JString[] { Class37_Sub9_Sub24.method870(RSApplet.loginSeconds / 60, (byte) -114), Class37_Sub9_Sub8.aJString_3066 }))), Class37_Sub9_Sub35.aJString_3568, Class37_Sub3_Sub1.aJString_2327);

				if (--RSApplet.loginSeconds <= 0) {
					Class22.loginStage = 0;
				}
			} else {
				if ((Class22.loginStage == 9) && (Applet_Sub1.activeSocket.available() >= 8)) {

					Class37_Sub9_Sub20.anInt3301 = Applet_Sub1.activeSocket.read(false);

					Class37_Sub13.aBoolean2109 = Applet_Sub1.activeSocket.read(false) == 1;

					Class37_Sub9_Sub5.anInt2998 = Applet_Sub1.activeSocket.read(false);
					Class37_Sub9_Sub5.anInt2998 <<= 8;

					Class37_Sub9_Sub5.anInt2998 += Applet_Sub1.activeSocket.read(false);

					Class37_Sub12.anInt2077 = Applet_Sub1.activeSocket.read(false);
					Applet_Sub1.activeSocket.read(1, 0, 122, Class83.packetStream.buffer);
					Class83.packetStream.bufferLocation = 0;

					Class37_Sub9_Sub17.packetId = Class83.packetStream.readPacket(7);

					Applet_Sub1.activeSocket.read(2, 0, i + 21604, Class83.packetStream.buffer);
					Class83.packetStream.bufferLocation = 0;
					Class37_Sub4.packetSize = Class83.packetStream.readShort();
					Class22.loginStage = 10;
				}

				if (Class22.loginStage == 10) {

					if ((Applet_Sub1.activeSocket.available() ^ 0xffffffff) <= (Class37_Sub4.packetSize ^ 0xffffffff)) {
						Class83.packetStream.bufferLocation = 0;
						Applet_Sub1.activeSocket.read(Class37_Sub4.packetSize, 0, 122, Class83.packetStream.buffer);

						Class54.method1140(0);// reset ALL the data
						Class37_Sub10.anInt1985 = -1;
						Stream.method934(0, false);
						Class37_Sub9_Sub17.packetId = -1;
					}
				} else {
					anInt781++;
					if (anInt781 > 2000) {
						if ((Class37_Sub9_Sub23.anInt3355 ^ 0xffffffff) > -2) {
							if (Class37_Sub4_Sub7_Sub1.port == Class37_Sub9_Sub31.anInt3490) {
								Class37_Sub4_Sub7_Sub1.port = Class22.anInt581;
							} else {
								Class37_Sub4_Sub7_Sub1.port = Class37_Sub9_Sub31.anInt3490;
							}

							Class22.loginStage = 0;
							Class37_Sub9_Sub23.anInt3355++;
						} else {
							RuntimeException_Sub1.handleBadLogin(-3, (byte) 59);
						}
					}
				}
			}
		} catch (IOException ioexception) {
			if (Class37_Sub9_Sub23.anInt3355 < 1) {
				if ((Class37_Sub9_Sub31.anInt3490 ^ 0xffffffff) != (Class37_Sub4_Sub7_Sub1.port ^ 0xffffffff)) {
					Class37_Sub4_Sub7_Sub1.port = Class37_Sub9_Sub31.anInt3490;
				} else {
					Class37_Sub4_Sub7_Sub1.port = Class22.anInt581;
				}

				Class37_Sub9_Sub23.anInt3355++;
				Class22.loginStage = 0;
			} else {
				RuntimeException_Sub1.handleBadLogin(-2, (byte) 59);
			}
		}
	}
}
