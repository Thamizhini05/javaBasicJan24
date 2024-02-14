package jan25_assignment;
import java.io.File;
public class FileSizeSample {
		    public static void main(String[] args) {
		        String filePath = "input.txt";
		        File file = new File(filePath);
		        if (file.exists()) {
		            long fileSizeInBytes = file.length();
		            double fileSizeInKB = (double) fileSizeInBytes / 1024;
		            double fileSizeInMB = fileSizeInKB / 1024;
		            System.out.println("File Size in Bytes: " + fileSizeInBytes + " bytes");
		            System.out.println("File Size in Kilo Bytes: " + fileSizeInKB + " KB");
		            System.out.println("File Size in Mega Bytes: " + fileSizeInMB + " MB");
		        } 
		        else {
		            System.out.println("File not found!");
		        }
		    }
		}

