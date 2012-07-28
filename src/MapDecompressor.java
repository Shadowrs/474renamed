/*
 * Class: MapDecompressor.java
 * Loads decompressed maps from a subcache.
 * @ Author: Zee best
*/

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public class MapDecompressor {

	public static List<Integer> mapIndices = null;
	public static Map<Integer, byte[]> mapBuffer = new HashMap<Integer, byte[]>();
	
	public static void dump() {
		System.out.println("Beginning Dumping files...");
		for (int i = 1; i < 1884; i+=2) {
		    try {
			grabMap(i);
			System.out.println("Dumped mapfile: " + i);
		    } catch (IOException ioe) {
			System.out.println("Error Dumping map ( " + i + " ) .... " + ioe.toString());
		    }
		}
	}

	public static byte[] grabMap(int id) throws IOException
	{

		if(mapIndices == null)
			loadIndex2();
		if (FileOperations.FileExists("cache/maps/" + id + ".dat")) {
			byte[] b = FileOperations.readFile("cache/maps/" + id + ".dat");
			return b;
		} else if(mapBuffer.get(id) == null) {
			RandomAccessFile raf_cache = new RandomAccessFile("cache/maps/MAP_CACHE.dat", "rw");
			RandomAccessFile raf_index = new RandomAccessFile("cache/maps/MAP_CACHE.idx", "rw");
			int pos = getIndexPosition(id);
			if(pos == -1)
				return null;
			raf_index.seek(pos * 12);
			raf_cache.seek(raf_index.readInt());
			byte[] b = new byte[raf_index.readInt()];
			raf_cache.readFully(b);
			b = inflate(b, raf_index.readInt());
			mapBuffer.put(id, b);
		}
		return mapBuffer.get(id);
	}

	public static void loadIndex2() throws IOException
	{
		mapIndices = new ArrayList<Integer>();
		DataInputStream dis = new DataInputStream(new FileInputStream("cache/maps/MAP_CACHE.idx2"));
		for (int i = 0; i < (int) new File("cache/maps/MAP_CACHE.idx2").length() / 2; i++)
			mapIndices.add((int) dis.readShort());
	}

	public static int getIndexPosition(int id) throws IOException
	{
		if(mapIndices.contains(id))
			for (int i = 0; i < mapIndices.size(); i++)
				if(mapIndices.get(i) == id)
					return i;
		return -1;
	}

	public static byte[] inflate(byte[] b, int l) throws IOException
	{
		byte[] buf = new byte[l];
		ByteArrayInputStream bais = new ByteArrayInputStream(b);
		DataInputStream dis = new DataInputStream(new GZIPInputStream(bais));
		dis.readFully(buf, 0, buf.length);
		dis.close();
		return buf;
	}


}
