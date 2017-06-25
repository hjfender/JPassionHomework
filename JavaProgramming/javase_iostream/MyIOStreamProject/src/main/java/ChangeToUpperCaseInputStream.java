import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ChangeToUpperCaseInputStream extends FilterInputStream {

    public ChangeToUpperCaseInputStream(InputStream in){
	super(in);
    }
    
    public int read() throws IOException {
	int b = in.read();
	if(b>=97 && b<=122){
	    b -= 32;
	}
	return b;
    }
    
    public int read(byte[] b) throws IOException {
	int len;
        len = in.read(b, 0, b.length);
        for (int i = 0; i < b.length; i++) {
	    if(b[i]>=97 && b[i]<=122){
		    b[i] -= 32;
	    }
	}
        return len;
    }
    
    public int read(byte[] b, int off, int len) throws IOException {
        len = in.read(b, off, len);
        for (int i = 0; i < b.length; i++) {
	    if(b[i]>=97 && b[i]<=122){
		    b[i] -= 32;
	    }
	}
        return len;
    }
}
