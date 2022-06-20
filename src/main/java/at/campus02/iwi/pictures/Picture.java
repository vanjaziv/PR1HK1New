package at.campus02.iwi.pictures;

public class Picture {

    public int length;
    public int width;

    public int totalPixels(){
        return length * width;
    }

    public int totalSize(int bytePerPixel){
        return totalPixels() * bytePerPixel;
    }

    public void scale(double factor){
        width *= factor;
        length *= factor;
    }
}