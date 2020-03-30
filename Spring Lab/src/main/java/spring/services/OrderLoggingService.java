package spring.services;

public class OrderLoggingService implements LoggingService {
    @Override
    public String confirmMini() {
        return "Order has been placed";
    }
}
