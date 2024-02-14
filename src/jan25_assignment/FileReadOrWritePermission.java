package jan25_assignment;
import java.io.File;
public class FileReadOrWritePermission {

	public static void main(String[] args) {
		        String filePath = "input.txt";
		        File file = new File(filePath);
		        file.setReadOnly();
		        if (file.exists()) {
		            if (file.canRead()) {
		                System.out.println("Read permission is granted.");
		            } else {
		                System.out.println("Read permission is not granted.");
		            }

		            if (file.canWrite()) {
		                System.out.println("Write permission is granted.");
		            } else {
		                System.out.println("Write permission is not granted.");
		            }
		        } else {
		            System.out.println("File not found!");
		        }
		    }
	}

