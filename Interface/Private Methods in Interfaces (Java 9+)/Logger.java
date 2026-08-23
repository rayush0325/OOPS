interface Logger{
    default void logInfo(String message){
        System.out.printf("\nINFO : %s\n", message);
        System.out.printf("\n%s\n", formatMessage("formatted message", message));//private method used in default method

    }
    default void logError(String message){
        System.out.printf("\nERROR : %s\n", message);
    }
    private String formatMessage(String level, String message){
        return String.format("[ %s ] %s", level, message);
    }
}