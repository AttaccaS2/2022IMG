package thumbnailator;

import java.io.File;
import net.coobird.thumbnailator.Thumbnails;

public class Thum2 {

	public static void main(String[] args) throws Exception {
		 Thumbnails
	        .of(new File("cat.jpg"))
	        .forceSize(200, 200)
	        .toFile(new File("s_result.jpg"));
	
	}

}
