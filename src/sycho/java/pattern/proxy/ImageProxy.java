package sycho.java.pattern.proxy;

public class ImageProxy implements Image {

    private String path;
    private Image proxyImage;

    public ImageProxy(String path) {
        this.path = path;
    }

    @Override
    public void showImage() {
        proxyImage = new HighResolutionImage(path);

        proxyImage.showImage();
    }
}
