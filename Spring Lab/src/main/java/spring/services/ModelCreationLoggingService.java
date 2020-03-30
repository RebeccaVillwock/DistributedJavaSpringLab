package spring.services;

public class ModelCreationLoggingService implements LoggingService {
    @Override
    public String confirmMini() {
        return "Model has been created.";
    }
}
