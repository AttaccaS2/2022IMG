package thumbnailator;

import java.io.File;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class Thum3 {

	public static void main(String[] args) throws Exception {
		 Thumbnails
	        .of(new File("cat.jpg"))
	        .size(200, 200)
	        .crop(Positions.CENTER)
	        .toFile(new File("s2_result.jpg"));;
	
	}

}
