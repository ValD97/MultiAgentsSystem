package core;

public class NoAgentThrowable extends Throwable {

    @Override
    public String getMessage() {
        return "Impossible de récupérer un agent sur une case null";
    }
}
