import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadInByteArray {
	public static byte[] BytesFromFile(File file) throws IOException {
        InputStream is = new FileInputStream(file);
        long length = file.length();
    
        if (length > Integer.MAX_VALUE) {
			System.out.println("Sorry! Your given file is too large.");
			System.exit(0);
        }

        byte[] bytes = new byte[(int)length];
        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
            offset += numRead;
        }
        if (offset < bytes.length) {
            throw new IOException("Could not completely read file " + file.getName());
        }
        is.close();
        return bytes;
    }

    public static void main(String[] args) {
        byte[] byteArray = null;
        try {
            byteArray = BytesFromFile(new File("test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (byteArray != null) {
			System.out.println("Your File Content: ");
            for (int i=0; i < byteArray.length; i++) {
				System.out.print((char)byteArray[i]);
            }
        }
    }
}