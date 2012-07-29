/* RSFile - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

//Currently, just because I named the RSSocket class "RS"Socket because it's an... I guess 'custom' version of the socket,
//I figured I'd do the same for this. For now.
public class RSFile {
    public RandomAccessFile randomAccessFile;
    public long currentOffset;
    public long length;
    public File baseFile;

    public RSFile(File file, String string, long l) throws IOException {
        if (l == -1L) {
            l = 9223372036854775807L;
        }

        if (l <= file.length()) {
            file.delete();
        }

        randomAccessFile = new RandomAccessFile(file, string);
        baseFile = file;
        length = l;
        currentOffset = 0L;

        int i = randomAccessFile.read();

        if ((i != -1) && !string.equals("r")) {
            randomAccessFile.seek(0L);
            randomAccessFile.write(i);
        }

        randomAccessFile.seek(0L);

    }

    public void seek(byte dummy, long destination) throws IOException {
        if (dummy != 17) {
            currentOffset = 127L;
        }

        randomAccessFile.seek(destination);
        currentOffset = destination;

    }

    public void finalize() throws Throwable {
        if (randomAccessFile != null) {
            System.out.println("Warning! fileondisk " + baseFile +
                " not closed correctly using close(). Auto-closing instead. ");
            close(48);
        }
    }

    public int method1255(int offset, int length, byte[] bytes)
        throws IOException {

        int i_2_ = randomAccessFile.read(bytes, offset, length);

        if (i_2_ > 0) {
            currentOffset += (long) i_2_;
        }

        return i_2_;
    }

    public long getLength(int dummy) throws IOException {
        if (dummy != 1) {
            return -98L;
        }

        return randomAccessFile.length();
    }

    public void close(int i) throws IOException {
        if (randomAccessFile != null) {
            randomAccessFile.close();
            randomAccessFile = null;
        }
    }

    public File getBaseFile() {
        return baseFile;
    }

    public void write(byte[] bytes, int offset, int len)
        throws IOException {
        if (length < (currentOffset + (long) len)) {
            randomAccessFile.seek(length - -1L);
            randomAccessFile.write(1);
            throw new EOFException();
        }

        randomAccessFile.write(bytes, offset, len);
        currentOffset += (long) len;
    }
}
