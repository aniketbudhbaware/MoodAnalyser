
public class MoodAnalyzerException extends Exception {
	 exceptionType type;

	    enum exceptionType {
	        EMPTY,NULL
	    }

	    public MoodAnalyzerException(exceptionType type, String message) {
	        super(message);
	        this.type = type;
	    }

}
