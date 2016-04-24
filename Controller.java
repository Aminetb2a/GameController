/**
 * Created by Communication Lab 3 on 4/24/2016.
 */
public class Controller {
    public static void main(String[] args) {
        Thread waitThread = new Thread(new WaitThread());
        waitThread.start();
    }
}
