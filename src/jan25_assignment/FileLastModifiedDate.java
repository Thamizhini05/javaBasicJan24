package jan25_assignment;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
public class FileLastModifiedDate {

	public static void main(String[] args) {
		        String filePath = "input.txt";
		        File file = new File(filePath);
		        if (file.exists()) {
		            long lastMod = file.lastModified();
		            Date lastModDate = new Date(lastMod);

		            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		            String formattedDate = dateFormat.format(lastModDate);

		            System.out.println("Last Modified Date: " + formattedDate);
		        } else {
		            System.out.println("File not found!");
		        }
		    }
		}

