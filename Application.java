/**
 * Created by yangmingquan on 2018/9/11.
 */
public class Application {
    static {
        System.loadLibrary("Bonaparte");
    }
    public native void calcunatePonaparte();

    public static void main(String[] args) {

        new Application().calcunatePonaparte();
    }
}
