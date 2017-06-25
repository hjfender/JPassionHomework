
import java.io.*;

public class FilterInputOutputStream {

    public static void main(String[] args) throws IOException {

        //Adler32 inChecker = new Adler32();
        //Adler32 outChecker = new Adler32();
        //CheckedInputStream in = null;
        //CheckedOutputStream out = null;
	ChangeToUpperCaseInputStream in = null;
	ChangeToUpperCaseOutputStream out = null;
	
        try {
            // Create ChangeToUpperCaseInputStream object, which is a subclass of
            // FilterInputStream class.
            in = new ChangeToUpperCaseInputStream(
                    new FileInputStream("farrago.txt"));
            // Create ChangeToUpperCaseOutputStream object, which is a subclass of
            // FilterOutputStream class.
            out = new ChangeToUpperCaseOutputStream(
                    new FileOutputStream("outagain.txt"));
        } 
        /*catch (FileNotFoundException e) {
            System.err.println("CheckedIOTest: " + e);
            System.exit(-1);
        } */
        catch (IOException e) {
            System.err.println("ChangeToUpperCaseIOTest: " + e);
            System.exit(-1);
        }

        int c;

        while ((c = in.read()) != -1) {
            out.write(c);
        }

        /*System.out.println("Input stream check sum: "
                + inChecker.getValue());
        System.out.println("Output stream check sum: "
                + outChecker.getValue());*/

        in.close();
        out.close();
    }
}
