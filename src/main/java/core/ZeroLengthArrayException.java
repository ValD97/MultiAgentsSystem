package core;

public class ZeroLengthArrayException extends Throwable {

    @Override
    public String getMessage() {
        return "Impossible de créer un tableau de taille 0";
    }
}
