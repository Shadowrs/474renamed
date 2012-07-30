/* ArrayOperations - Decompiled by JODE
 * Visit http://jode.sourceforge.net
 */
public class ArrayOperations {
    public static void setArray(int[] src, int offset, int length, int value) {
        length = (offset + length) - 7;

        while (offset < length) {
            src[offset++] = value;
            src[offset++] = value;
            src[offset++] = value;
            src[offset++] = value;
            src[offset++] = value;
            src[offset++] = value;
            src[offset++] = value;
            src[offset++] = value;
        }

        length += 7;

        while (offset < length)
            src[offset++] = value;
    }

    public static void copyArray(byte[] src, int srcOffset, byte[] dest, int destOffset,
        int length) {
        if (src == dest) {

            if (srcOffset == destOffset) {
                return;
            }

            if ((destOffset > srcOffset) && (destOffset < (srcOffset + length))) {
                length--;
                srcOffset += length;
                destOffset += length;
                length = srcOffset - length;
                length += 7;

                while (srcOffset >= length) {
                    dest[destOffset--] = src[srcOffset--];
                    dest[destOffset--] = src[srcOffset--];
                    dest[destOffset--] = src[srcOffset--];
                    dest[destOffset--] = src[srcOffset--];
                    dest[destOffset--] = src[srcOffset--];
                    dest[destOffset--] = src[srcOffset--];
                    dest[destOffset--] = src[srcOffset--];
                    dest[destOffset--] = src[srcOffset--];
                }

                length -= 7;

                while (srcOffset >= length)
                    dest[destOffset--] = src[srcOffset--];

                return;
            }
        }

        length += srcOffset;
        length -= 7;

        while (srcOffset < length) {
            dest[destOffset++] = src[srcOffset++];
            dest[destOffset++] = src[srcOffset++];
            dest[destOffset++] = src[srcOffset++];
            dest[destOffset++] = src[srcOffset++];
            dest[destOffset++] = src[srcOffset++];
            dest[destOffset++] = src[srcOffset++];
            dest[destOffset++] = src[srcOffset++];
            dest[destOffset++] = src[srcOffset++];
        }

        length += 7;

        while (srcOffset < length)
            dest[destOffset++] = src[srcOffset++];
    }

    public static void clearArray(int[] src, int offset, int length) {
        length = (offset + length) - 7;

        while (offset < length) {
            src[offset++] = 0;
            src[offset++] = 0;
            src[offset++] = 0;
            src[offset++] = 0;
            src[offset++] = 0;
            src[offset++] = 0;
            src[offset++] = 0;
            src[offset++] = 0;
        }

        length += 7;

        while (offset < length)
            src[offset++] = 0;
    }

    public static void copyArray(int[] src, int srcOffset, int[] dest, int destOffset,
        int length) {
        if (src == dest) {
            if (srcOffset == destOffset) {
                return;
            }

            if ((destOffset > srcOffset) && (destOffset < (srcOffset + length))) {
                length--;
                srcOffset += length;
                destOffset += length;
                length = srcOffset - length;
                length += 7;

                while (srcOffset >= length) {
                    dest[destOffset--] = src[srcOffset--];
                    dest[destOffset--] = src[srcOffset--];
                    dest[destOffset--] = src[srcOffset--];
                    dest[destOffset--] = src[srcOffset--];
                    dest[destOffset--] = src[srcOffset--];
                    dest[destOffset--] = src[srcOffset--];
                    dest[destOffset--] = src[srcOffset--];
                    dest[destOffset--] = src[srcOffset--];
                }

                length -= 7;

                while (srcOffset >= length)
                    dest[destOffset--] = src[srcOffset--];

                return;
            }
        }

        length += srcOffset;
        length -= 7;

        while (srcOffset < length) {
            dest[destOffset++] = src[srcOffset++];
            dest[destOffset++] = src[srcOffset++];
            dest[destOffset++] = src[srcOffset++];
            dest[destOffset++] = src[srcOffset++];
            dest[destOffset++] = src[srcOffset++];
            dest[destOffset++] = src[srcOffset++];
            dest[destOffset++] = src[srcOffset++];
            dest[destOffset++] = src[srcOffset++];
        }

        length += 7;

        while (srcOffset < length)
            dest[destOffset++] = src[srcOffset++];
    }
}
