package tr.com.hamzaeren.designpatterns.behavioral.chainofresponsibility;

public class SupportRequest {
    private final RequestType type;
    private final String description;

    public SupportRequest(RequestType type, String description) {
        this.type = type;
        this.description = description;
    }

    public RequestType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
