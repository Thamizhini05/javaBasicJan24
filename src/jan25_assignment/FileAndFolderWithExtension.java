package jan25_assignment;
import java.io.File;
import java.io.FilenameFilter;
public class FileAndFolderWithExtension {

	public static void main(String[] args) {
	
		        File file = new File("D:\\");
		           String[] list = file.list(new FilenameFilter() {
		            public boolean accept(File dir, String name) {
		             if(name.toLowerCase().endsWith(".txt")){
		                    return true;
		                } else {
		                    return false;
		                }
		            }
		        });
		        for(String f:list){
		            System.out.println(f);
		        }
		    }
		}