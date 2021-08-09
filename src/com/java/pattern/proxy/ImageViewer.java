package com.java.pattern.proxy;

public class ImageViewer {
    public static void main(String[] args) {
        Image proxyHighResolutionImage1 = new ImageProxy("highResolutionImage1");
        Image proxyHighResolutionImage2 = new ImageProxy("highResolutionImage2");
        Image proxyHighResolutionImage3 = new ImageProxy("highResolutionImage3");

        proxyHighResolutionImage1.showImage();

        Image highResolutionImage1 = new HighResolutionImage("highResolutionImage1");
        Image highResolutionImage2 = new HighResolutionImage("highResolutionImage3");
        Image highResolutionImage3 = new HighResolutionImage("highResolutionImage3");

        highResolutionImage2.showImage();

    }
}
