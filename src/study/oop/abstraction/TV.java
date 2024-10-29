package study.oop.abstraction;

public class TV implements Remote {
    private int curCh = 10;
    @Override
    public void chUp() {
        curCh++;
        if (curCh > Remote.MAXCH) {
            curCh = 1;
        }
        System.out.println("TV Channel Up : Current Channel " + curCh);
    }

    @Override
    public void chDown() {
        curCh--;
        if (curCh < Remote.MINCH) {
            curCh = 99;
        }
        System.out.println("TV Channel Down : Current Channel " + curCh);
    }

    @Override
    public void volUp() {
        System.out.println("TV Volume Up");
    }

    @Override
    public void volDown() {
        System.out.println("TV Volume Down");
    }

    @Override
    public void internet() {
        System.out.println("Internet Running");
    }
}
