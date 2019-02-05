package core;

public class Environment {

    private int height;
    private int width;
    private Agent[][] agentGrid;

    public Environment(int height, int width) throws ZeroLengthArrayException {
        if (height == 0 || width == 0) {
            throw new ZeroLengthArrayException();
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

    public Agent getAgent(int y, int x) throws NoAgentException {
        if (this.agentGrid[y][x] == null) {
            throw new NoAgentException();
        }
        return this.agentGrid[y][x];
    }

    public void addAgent(Agent agent) {
        this.agentGrid[agent.getPosY()][agent.getPosX()] = agent;
    }
}
