package core;

public class ZeroLengthArrayThrowable extends Throwable {

    @Override
    public String getMessage() {
        return "Impossible de créer un tableau de taille 0";
    }
}
