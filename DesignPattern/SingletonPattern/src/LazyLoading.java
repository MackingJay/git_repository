/*
  延迟加载
 */
public class LazyLoading {
    private static LazyLoading lazyLoading;

    private LazyLoading() {

    }

    public static LazyLoading getInstance() {
        if (lazyLoading == null) {
            lazyLoading = new LazyLoading();
        }
        return lazyLoading;
    }


}
