import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogToFileUsingFileHandler {

    private static Logger logger = Logger.getLogger("loggerdemo");
    
    public static void main(String[] args) throws IOException {
	
	//Log to a file
	logger.addHandler(new FileHandler("MyReallyOwnLog.xml"));
	
	//Homework add another file handler
	logger.addHandler(new FileHandler("HomeworkLog.xml"));
	
	logger.info("doing stuff");
	
	try {
	    System.out.println(3/0);
	} catch(Exception e) {
	    logger.log(Level.SEVERE, "dividing by 0");
	}
	
	logger.info("done");
    }
    
}
