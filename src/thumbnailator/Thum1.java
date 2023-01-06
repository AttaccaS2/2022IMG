package thumbnailator;

import java.io.File;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class Thum1 {

	public static void main(String[] args) throws Exception {
		// File file = new File("cat.jpg");
		    Thumbnails
		        .of(new File("cat.jpg"))
		        .sourceRegion(Positions.TOP_CENTER, 200, 200)
		        .size(200, 200)
		        .toFile(new File("s_cat.jpg"));
	}

}
