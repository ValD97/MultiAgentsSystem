package core;

public class Environment {

    private int height;
    private int width;
    private Agent[][] agentGrid;

    public Environment(int height, int width) throws ZeroLengthArrayThrowable {
        if (height == 0 || width == 0) {
            throw new ZeroLengthArrayThrowable();
        }
        this.height = height;
        this.width = width;
        this.agentGrid = new Agent[this.height][this.width];
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public Agent[][] getAgentGrid() {
        return this.agentGrid;
    }

    public Agent getAgent(int y, int x) throws NoAgentThrowable {
        if (this.agentGrid[y][x] == null) {
            throw new NoAgentThrowable();
        }
        return this.agentGrid[y][x];
    }

    public void addAgent(Agent agent) {
        this.agentGrid[agent.getPosY()][agent.getPosX()] = agent;
    }
}
