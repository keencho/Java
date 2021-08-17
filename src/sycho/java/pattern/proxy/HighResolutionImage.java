package sycho.java.pattern.proxy;

public class HighResolutionImage implements Image {

    public HighResolutionImage(String path) {
        loadImage(path);
    }

    private void loadImage(String path) {
        // 이미지를 디스크에서 불러와 메모리에 적재
        // 작업 자체가 무겁고 많은 자원을 필요로함
    }

    @Override
    public void showImage() {
        // 실제 이미지를 렌더링 하는 작업
    }
}
