import java.io.*;

public class FileOperations
{

    public static int TotalRead = 0;
    public static int TotalWrite = 0;
    public static int CompleteWrite = 0;

    public FileOperations()
    {
    }

    public static final byte[] ReadFile(String s)
    {
        return readFile(s);
    }

    public static final byte[] readFile(String s)
    {
        byte abyte0[] = null;
        try {
		File file = new File(s);
       		int i = (int)file.length();
        	abyte0 = new byte[i];
        	DataInputStream datainputstream = new DataInputStream(new BufferedInputStream(new FileInputStream(s)));
        	datainputstream.readFully(abyte0, 0, i);
        	datainputstream.close();
        	TotalRead++;
	} catch (Exception e){ }
        return abyte0;
    }

    public static final void writeFile(String s, byte abyte0[])
    {
        	try {
			FileOutputStream fileoutputstream = new FileOutputStream(s);
			fileoutputstream.write(abyte0, 0, abyte0.length);
			fileoutputstream.close();
        	} catch(Exception e) { 
			e.printStackTrace();
		}
    }

    public static final void writeFile(String s, byte abyte0[], int length)
    {
        	try {
			FileOutputStream fileoutputstream = new FileOutputStream(s);
			fileoutputstream.write(abyte0, 0, length);
			fileoutputstream.close();
        	} catch(Exception e) { 
			e.printStackTrace();
		}
    }

    public static boolean FileExists(String s)
    {
        File file = new File(s);
        return file.exists();
    }

}
