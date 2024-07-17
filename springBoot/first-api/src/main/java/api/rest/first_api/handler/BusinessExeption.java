package api.rest.first_api.handler;

public class BusinessExeption extends RuntimeException {

    public BusinessExeption(String message) {
        super(message);
    }

    public BusinessExeption(String message, Object... params) {
        super(String.format(message, params));
    }
}
