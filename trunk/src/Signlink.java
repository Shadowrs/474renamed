import java.applet.Applet;
import java.awt.*;
import java.io.*;
import java.lang.reflect.Method;
import java.net.*;


public class Signlink implements Runnable {
    public static String aString1031;
    public static String aString1033;
    public static Method aMethod1035;
    public static String aString1039;
    public static int anInt1041 = 3;
    public static Method aMethod1044;
    public Interface2 anInterface2_1030;
    public File aFile1032 = null;
    public Class70 aClass70_1034;
    public EventQueue anEventQueue1036;
    public Class70 aClass70_1037 = null;
    public Thread aThread1038;
    public File aFile1040;
    public Class70 aClass70_1042;
    public boolean aBoolean1043 = false;
    public Applet anApplet1045;
    public Class70[] aClass70Array1046;
    public SignlinkResourceNode aClass23_1047;
    public SignlinkResourceNode aClass23_1048;

    public Signlink(boolean bool, Applet applet, int i, String string, int i_20_) {
        aClass70_1034 = null;
        aFile1040 = null;
        anApplet1045 = null;
        aClass70_1042 = null;
        aClass23_1047 = null;
        aClass23_1048 = null;
        aString1039 = "Unknown";
        anApplet1045 = applet;
        aString1033 = "1.1";

        try {
            aString1039 = System.getProperty("java.vendor");
            aString1033 = System.getProperty("java.version");
        } catch (Exception exception) {
            /* empty */
        }

        try {
            aString1031 = System.getProperty("user.home");

            if (aString1031 != null) {
                aString1031 += "/";
            }
        } catch (Exception exception) {
            /* empty */
        }

        if (aString1031 == null) {
            aString1031 = "~/";
        }

        try {
            anEventQueue1036 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable throwable) {
            /* empty */
        }

        try {
            if (applet != null) {
                aMethod1035 = (applet.getClass()
                                     .getMethod("setFocusTraversalKeysEnabled",
                        new Class[] { Boolean.TYPE }));
            } else {
                aMethod1035 = (Class.forName("java.awt.Component")
                                    .getDeclaredMethod("setFocusTraversalKeysEnabled",
                        new Class[] { Boolean.TYPE }));
            }
        } catch (Exception exception) {
            /* empty */
        }

        try {
            if (applet == null) {
                aMethod1044 = (Class.forName("java.awt.Container")
                                    .getDeclaredMethod("setFocusCycleRoot",
                        new Class[] { Boolean.TYPE }));
            } else {
                aMethod1044 = applet.getClass()
                                    .getMethod("setFocusCycleRoot",
                        (new Class[] { Boolean.TYPE }));
            }
        } catch (Exception exception) {
            /* empty */
        }

        if (bool) {
            loadCache(i, i_20_, -19218, string);
        }

        aBoolean1043 = false;
        aThread1038 = new Thread(this);
        aThread1038.setPriority(10);
        aThread1038.setDaemon(true);
        aThread1038.start();
    }

    public void run() {
        for (;;) {
            SignlinkResourceNode class23;

            synchronized (this) {
                for (;;) {
                    if (aBoolean1043) {
                        return;
                    }

                    if (aClass23_1047 != null) {
                        class23 = aClass23_1047;
                        aClass23_1047 = aClass23_1047.linkedResource;

                        if (aClass23_1047 == null) {
                            aClass23_1048 = null;
                        }

                        break;
                    }

                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }

            try {
                int i = class23.resourceType;

                if (i == 1) {
                    class23.resource = new Socket(InetAddress.getByName(
                                (String) (class23.resourceBase)),
                            class23.value);
                } else if (i == 2) {
                    Thread thread = new Thread((Runnable) class23.resourceBase);
                    thread.setDaemon(true);
                    thread.start();
                    thread.setPriority(class23.value);
                    class23.resource = thread;
                } else if ((i ^ 0xffffffff) == -5) {
                    class23.resource = new DataInputStream(((URL) class23.resourceBase).openStream());
                } else if (i != 8) {
                    if (i != 9) {
                        throw new Exception();
                    }

                    Object[] objects = (Object[]) class23.resourceBase;

                    class23.resource = ((Class) objects[0]).getDeclaredField((String) objects[1]);
                } else {
                    Object[] objects = (Object[]) class23.resourceBase;

                    class23.resource = ((Class) objects[0]).getDeclaredMethod(((String) objects[1]),
                            ((Class[]) objects[2]));
                }

                class23.state = 1;
            } catch (Throwable throwable) {
                class23.state = 2;
            }
        }
    }

    public Interface2 method1116(int i) {
        if (i >= -121) {
            aMethod1044 = null;
        }

        return anInterface2_1030;
    }

    public SignlinkResourceNode method1117(String string, int i, boolean bool) {
        if (bool != true) {
            return null;
        }

        return method1121(0, string, i, (byte) -112, 1);
    }

    public SignlinkResourceNode method1118(byte i, String string, Class var_class,
        Class[] var_classes) {
        if (i <= 59) {
            aBoolean1043 = false;
        }

        return method1121(0, new Object[] { var_class, string, var_classes },
            0, (byte) -93, 8);
    }

    public SignlinkResourceNode method1119(Runnable runnable, int i, byte i_0_) {
        if (i_0_ != 65) {
            aFile1032 = null;
        }

        return method1121(0, runnable, i, (byte) -110, 2);
    }

    public SignlinkResourceNode method1120(int i, byte i_1_) {
        if (i_1_ < 6) {
            aString1033 = null;
        }

        return method1121(0, null, i, (byte) -108, 3);
    }

    public SignlinkResourceNode method1121(int i, Object object, int i_2_, byte i_3_,
        int i_4_) {
        int i_5_ = -117 / ((-7 - i_3_) / 50);
        SignlinkResourceNode class23 = new SignlinkResourceNode();
        class23.resourceType = i_4_;
        class23.value = i_2_;
        class23.resourceBase = object;

        synchronized (this) {
            if (aClass23_1048 != null) {
                aClass23_1048.linkedResource = class23;
                aClass23_1048 = class23;
            } else {
                aClass23_1048 = aClass23_1047 = class23;
            }

            this.notify();
        }

        return class23;
    }

    public static String findCacheDirectory() {
	return "cache/.jagex_cache_32/runescape";
    }

    public SignlinkResourceNode method1122(byte i, URL url) {
        int i_6_ = -113 / ((-59 - i) / 41);

        return method1121(0, url, 0, (byte) 122, 4);
    }

    public void loadCache(int i, int i_7_, int i_8_, String string) {
        if (((i ^ 0xffffffff) > -33) || ((i ^ 0xffffffff) < -35)) {
            i = 32;
        }

        String[] strings = {"./bin/cache/"};

        if (i_8_ == -19218) {
            String[] strings_9_ = { ".jagex_cache_" + i, ".file_store_" + i };

            for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -3; i_10_++) {
                for (int i_11_ = 0; strings_9_.length > i_11_; i_11_++) {
                    for (int i_12_ = 0;
                            (strings.length ^ 0xffffffff) < (i_12_ ^
                            0xffffffff); i_12_++) {
                        try {
                            String string_13_ = strings[i_12_];

                            if ((string_13_.length() > 0) &&
                                    !new File(string_13_).exists()) {
                                continue;
                            }

                            File file = new File(string_13_ +
                                    strings_9_[i_11_]);

                            if (((i_10_ ^ 0xffffffff) == -2) && !file.exists()) {
                                boolean bool = file.mkdir();

                                if (!bool) {
                                    continue;
                                }
                            }

                            if (aClass70_1037 == null) {
                                try {
                                    File file_14_ = new File(file, "random.dat");

                                    if (((i_10_ ^ 0xffffffff) == -2) ||
                                            file_14_.exists()) {
                                        aClass70_1037 = new Class70(file_14_,
                                                "rw", 25L);
                                    }
                                } catch (Exception exception) {
                                    aClass70_1037 = null;
                                }
                            }

                            if (aFile1040 == null) {
                                try {
                                    file = new File(file, string);

                                    if ((i_10_ == 1) && !file.exists()) {
                                        boolean bool = file.mkdir();

                                        if (!bool) {
                                            continue;
                                        }
                                    }

                                    File file_15_ = new File(file,
                                            "main_file_cache.dat2");

                                    if (((i_10_ ^ 0xffffffff) == -1) &&
                                            !file_15_.exists()) {
                                        continue;
                                    }

                                    aClass70_1034 = new Class70(file_15_, "rw",
                                            52428800L);
                                    aClass70Array1046 = new Class70[i_7_];

                                    for (int i_16_ = 0; ((i_16_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff)); i_16_++)
                                        aClass70Array1046[i_16_] = (new Class70(new File(
                                                    file,
                                                    ("main_file_cache.idx" +
                                                    i_16_)), "rw", 1048576L));

                                    aClass70_1042 = (new Class70(new File(
                                                file, "main_file_cache.idx255"),
                                            "rw", 1048576L));

                                    aFile1032 = aFile1040 = file;
                                } catch (Exception exception) {
                                    try {
                                        aClass70_1034.method1257(12);

                                        for (int i_17_ = 0;
                                                ((i_17_ ^ 0xffffffff) > (i_7_ ^
                                                0xffffffff)); i_17_++)
                                            aClass70Array1046[i_17_].method1257(i_8_ +
                                                19282);

                                        aClass70_1042.method1257(-121);
                                    } catch (Exception exception_18_) {
                                        /* empty */
                                    }

                                    aClass70Array1046 = null;
                                    aFile1032 = aFile1040 = null;
                                    aClass70_1034 = aClass70_1042 = null;
                                }
                            }
                        } catch (Exception exception) {
                            /* empty */
                        }

                        if ((aClass70_1037 != null) && (aFile1040 != null)) {
                            return;
                        }
                    }
                }
            }

            if (aFile1040 == null) {
                throw new RuntimeException();
            }
        }
    }

    public SignlinkResourceNode method1124(Class var_class, int i, String string) {
        if (i >= -71) {
            aMethod1044 = null;
        }

        return method1121(0, new Object[] { var_class, string }, 0, (byte) 114,
            9);
    }

    public void method1125(byte i) {
        synchronized (this) {
            aBoolean1043 = true;
            this.notifyAll();
        }

        try {
            aThread1038.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }

        if (aClass70_1034 != null) {
            try {
                aClass70_1034.method1257(111);
            } catch (java.io.IOException ioexception) {
                /* empty */
            }
        }

        if (aClass70_1042 != null) {
            try {
                aClass70_1042.method1257(-123);
            } catch (java.io.IOException ioexception) {
                /* empty */
            }
        }

        if (i == -111) {
            if (aClass70Array1046 != null) {
                for (int i_19_ = 0;
                        ((i_19_ ^ 0xffffffff) > (aClass70Array1046.length ^
                        0xffffffff)); i_19_++) {
                    if (aClass70Array1046[i_19_] != null) {
                        try {
                            aClass70Array1046[i_19_].method1257(-118);
                        } catch (java.io.IOException ioexception) {
                            /* empty */
                        }
                    }
                }
            }

            do {
                if (aClass70_1037 != null) {
                    try {
                        aClass70_1037.method1257(52);
                    } catch (java.io.IOException ioexception) {
                        break;
                    }

                    break;
                }
            } while (false);
        }
    }
}
