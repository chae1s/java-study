package study.oop.abstraction;

public class InterfaceTest {
    public static void main(String[] args) {
        Remote remote = new Radio();

        remote.chUp();
        remote.chDown();
        remote.volUp();
        remote.volDown();
        remote.internet();

        remote = new TV();

        remote.chUp();
        remote.chDown();
        remote.volUp();
        remote.volDown();
        remote.internet();

        remote.chDown();
        remote.chDown();
        remote.chDown();
        remote.chDown();
        remote.chDown();
        remote.chDown();
        remote.chDown();
        remote.chDown();
        remote.chDown();
        remote.chDown();
    }
}
