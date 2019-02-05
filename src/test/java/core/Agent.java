package core;

public abstract class Agent {

    private int posX;
    private int posY;

    public Agent(int posY, int posX) {
        this.posX = posX;
        this.posY = posY;
    }

    public abstract void decide();

    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public void setPosX(int x) {
        this.posX = x;
    }

    public void setPosY(int y) {
        this.posY = y;
    }
}
