package at.campus02.iwi.pictures;

import static org.junit.Assert.*;
import org.junit.Test;
public class PictureTest {
    @Test
    public void testTotalPixels() {
        Picture picture = new Picture();
        picture.width = 640;
        picture.length = 480;

        assertEquals(307200, picture.totalPixels());
    }

    @Test
    public void testTotalSize() {
       Picture picture = new Picture();
        picture.width = 640;
        picture.length = 480;

       assertEquals(921600, picture.totalSize(3));
    }
    @Test
    public void testScaleUp() {
        Picture picture = new Picture();
        picture.width = 640;
        picture.length = 480;

        picture.scale(2);

        assertEquals(1280, picture.width);
        assertEquals(960, picture.length);
    }
    @Test
    public void testScaleDown() {
        Picture picture = new Picture();
        picture.width = 640;
        picture.length = 480;

        picture.scale(0.5);

        assertEquals(320, picture.width);
       assertEquals(240, picture.length);
    }
}
