import java.applet.Applet;
import java.awt.*;
import java.io.*;
import java.lang.reflect.Method;
import java.net.*;


public class Signlink implements Runnable {
    public static String userHomeLocation;
    public static String javaVersion;
    public static Method aMethod1035;
    public static String javaVendor;
    public static int anInt1041 = 3;
    public static Method aMethod1044;
    public Interface2 anInterface2_1030;
    public File aFile1032 = null;
    public RSFile cacheDataFile;
    public EventQueue anEventQueue1036;
    public RSFile randomFile = null;
    public Thread aThread1038;
    public File aFile1040;
    public RSFile cacheIndex255;
    public boolean aBoolean1043 = false;
    public Applet anApplet1045;
    public RSFile[] cacheIndexFiles;
    public Resource nextResource;
    public Resource aClass23_1048;

    public Signlink(boolean bool, Applet applet, int i, String string, int i_20_) {
        cacheDataFile = null;
        aFile1040 = null;
        anApplet1045 = null;
        cacheIndex255 = null;
        nextResource = null;
        aClass23_1048 = null;
        javaVendor = "Unknown";
        anApplet1045 = applet;
        javaVersion = "1.1";

        try {
            javaVendor = System.getProperty("java.vendor");
            javaVersion = System.getProperty("java.version");
        } catch (Exception exception) {
            /* empty */
        }

        try {
            userHomeLocation = System.getProperty("user.home");

            if (userHomeLocation != null) {
                userHomeLocation += "/";
            }
        } catch (Exception exception) {
            /* empty */
        }

        if (userHomeLocation == null) {
            userHomeLocation = "~/";
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
            Resource class23;

            synchronized (this) {
                for (;;) {
                    if (aBoolean1043) {
                        return;
                    }

                    if (nextResource != null) {
                        class23 = nextResource;
                        nextResource = nextResource.linkedResource;

                        if (nextResource == null) {
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
                int i = class23.type;

                if (i == 1) {
                    class23.resource = new Socket(InetAddress.getByName(
                                (String) (class23.base)),
                            class23.value);
                } else if (i == 2) {
                    Thread thread = new Thread((Runnable) class23.base);
                    thread.setDaemon(true);
                    thread.start();
                    thread.setPriority(class23.value);
                    class23.resource = thread;
                } else if (i == 4) {
                    class23.resource = new DataInputStream(((URL) class23.base).openStream());
                } else if (i != 8) {
                    if (i != 9) {
                        throw new Exception();
                    }

                    Object[] objects = (Object[]) class23.base;

                    class23.resource = ((Class) objects[0]).getDeclaredField((String) objects[1]);
                } else {
                    Object[] objects = (Object[]) class23.base;

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

    public Resource createResource(String string, int i, boolean bool) {
        if (bool != true) {
            return null;
        }

        return createResource(0, string, i, (byte) -112, 1);
    }

    public Resource createResource(byte i, String string, Class var_class,
        Class[] var_classes) {
        if (i <= 59) {
            aBoolean1043 = false;
        }

        return createResource(0, new Object[] { var_class, string, var_classes },
            0, (byte) -93, 8);
    }

    public Resource createResource(Runnable runnable, int i, byte i_0_) {
        if (i_0_ != 65) {
            aFile1032 = null;
        }

        return createResource(0, runnable, i, (byte) -110, 2);
    }

    public Resource createResource(int i, byte i_1_) {
        if (i_1_ < 6) {
            javaVersion = null;
        }

        return createResource(0, null, i, (byte) -108, 3);
    }

    public Resource createResource(int i, Object object, int i_2_, byte i_3_,
        int i_4_) {
        Resource class23 = new Resource();
        class23.type = i_4_;
        class23.value = i_2_;
        class23.base = object;

        synchronized (this) {
            if (aClass23_1048 != null) {
                aClass23_1048.linkedResource = class23;
                aClass23_1048 = class23;
            } else {
                aClass23_1048 = nextResource = class23;
            }

            this.notify();
        }

        return class23;
    }

    public static String findCacheDirectory() {
	return "cache/.jagex_cache_32/runescape";
    }

    public Resource createResource(byte i, URL url) {

        return createResource(0, url, 0, (byte) 122, 4);
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
					for (int i_12_ = 0; strings.length > i_12_; i_12_++) {
                        try {
                            String string_13_ = strings[i_12_];

                            if ((string_13_.length() > 0) &&
                                    !new File(string_13_).exists()) {
                                continue;
                            }

                            File file = new File(string_13_ + strings_9_[i_11_]);

                            if ((i_10_ == 1) && !file.exists()) {
                                boolean bool = file.mkdir();

                                if (!bool) {
                                    continue;
                                }
                            }

                            if (randomFile == null) {
                                try {
                                    File file0 = new File(file, "random.dat");

                                    if ((i_10_ == 1) || file0.exists()) {
                                        randomFile = new RSFile(file0, "rw", 25L);
                                    }
                                } catch (Exception exception) {
                                    randomFile = null;
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

                                    File file_15_ = new File(file, "main_file_cache.dat2");

                                    if ((i_10_ == 0) && !file_15_.exists()) {
                                        continue;
                                    }

                                    cacheDataFile = new RSFile(file_15_, "rw", 52428800L);
                                    cacheIndexFiles = new RSFile[i_7_];

                                    for (int i_16_ = 0; i_16_< i_7_; i_16_++)
                                        cacheIndexFiles[i_16_] = (new RSFile(new File(file, ("main_file_cache.idx" + i_16_)), "rw", 1048576L));

                                    cacheIndex255 = (new RSFile(new File(file, "main_file_cache.idx255"), "rw", 1048576L));

                                    aFile1032 = aFile1040 = file;
                                } catch (Exception exception) {
                                    try {
                                        cacheDataFile.close(12);

										for (int i_17_ = 0; i_17_ < i_7_; i_17_++)
                                            cacheIndexFiles[i_17_].close(i_8_ + 19282);

                                        cacheIndex255.close(-121);
                                    } catch (Exception exception_18_) {
                                        /* empty */
                                    }

                                    cacheIndexFiles = null;
                                    aFile1032 = aFile1040 = null;
                                    cacheDataFile = cacheIndex255 = null;
                                }
                            }
                        } catch (Exception exception) {
                            /* empty */
                        }

                        if ((randomFile != null) && (aFile1040 != null)) {
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

    public Resource method1124(Class var_class, int i, String string) {
        if (i >= -71) {
            aMethod1044 = null;
        }

        return createResource(0, new Object[] { var_class, string }, 0, (byte) 114, 9);
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

        if (cacheDataFile != null) {
            try {
                cacheDataFile.close(111);
            } catch (java.io.IOException ioexception) {
                /* empty */
            }
        }

        if (cacheIndex255 != null) {
            try {
                cacheIndex255.close(-123);
            } catch (java.io.IOException ioexception) {
                /* empty */
            }
        }

        if (i == -111) {
            if (cacheIndexFiles != null) {
				for (int i_19_ = 0; i_19_ < cacheIndexFiles.length; i_19_++) {
                    if (cacheIndexFiles[i_19_] != null) {
                        try {
                            cacheIndexFiles[i_19_].close(-118);
                        } catch (java.io.IOException ioexception) {
                            /* empty */
                        }
                    }
                }
            }

            do {
                if (randomFile != null) {
                    try {
                        randomFile.close(52);
                    } catch (java.io.IOException ioexception) {
                        break;
                    }

                    break;
                }
            } while (false);
        }
    }
}
