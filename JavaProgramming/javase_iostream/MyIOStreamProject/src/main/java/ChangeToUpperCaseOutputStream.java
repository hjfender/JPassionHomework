import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ChangeToUpperCaseOutputStream extends FilterOutputStream {

    public ChangeToUpperCaseOutputStream(OutputStream out){
	super(out);
    }
    
    public void write(int b) throws IOException {
	if(b>=97 && b<=122){
	    b -= 32;
	}
	out.write(b);
    }
    
    public void write(byte[] b) throws IOException {
	for (int i = 0; i < b.length; i++) {
	    if(b[i]>=97 && b[i]<=122){
		    b[i] -= 32;
	    }
	}
	out.write(b, 0, b.length);
    }
    
    public void write(byte[] b, int off, int len) throws IOException {
	for (int i = 0; i < b.length; i++) {
	    if(b[i]>=97 && b[i]<=122){
		    b[i] -= 32;
	    }
	}
	out.write(b, off, len);
    }
}
