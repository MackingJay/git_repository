/*
    立即加载
 */
public class NoLazyLoading {
    private static NoLazyLoading noLazyLoading = getInstance();

    private NoLazyLoading() {

    }

    public static NoLazyLoading getInstance() {
        if (noLazyLoading == null) {
            noLazyLoading = new NoLazyLoading();
        }
        return noLazyLoading;
    }

}
