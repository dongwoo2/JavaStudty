package pr6;

public abstract class PlayerLevel {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    final public void go(int count) { //하나의 템플릿 메서드가 있다했음 그게 얘임
        run();

        for (int j =0; j<count; j++) {
            jump();
        }
        turn();
    }
}
