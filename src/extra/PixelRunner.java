package extra;

public class PixelRunner {
public static void main(String[] args) {
	PixelParty pi = new PixelParty();
	pi.setColor(230, 19, 87);
	pi.drawRectangle(100, 30, 97, 60);
	pi.drawCircle(39, 123, 45);
	//pi.drawLine(8, -14, 93, 17);
	pi.drawTriangle(23, 1, 2, 62, 73, 13);
	pi.saveImage();
	pi.displayImage();
}
}
