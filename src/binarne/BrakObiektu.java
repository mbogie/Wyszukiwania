package binarne;

public class BrakObiektu extends RuntimeException {

        private String message;

    public BrakObiektu(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
