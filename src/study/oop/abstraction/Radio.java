package study.oop.abstraction;

public class Radio implements Remote {
    @Override
    public void chUp() {
        System.out.println("Radio Channel Up");
    }

    @Override
    public void chDown() {
        System.out.println("Radio Channel Down");
    }

    @Override
    public void volUp() {
        System.out.println("Radio Volume Up");
    }

    @Override
    public void volDown() {
        System.out.println("Radio Volume Down");
    }

    @Override
    public void internet() {
        System.out.println("Internet Not Running");
    }
}
