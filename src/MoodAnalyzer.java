
public class MoodAnalyzer {
	  private String message;

	    public MoodAnalyzer() {
	    }

	    public MoodAnalyzer(String message) {
	        this.message = message;
	    }

	    //Handle NULLPOINTER Exception using try-catch block
	    public String analyzeMood() throws MoodAnalyzerException {

	        try {
	            if (message.length() == 0 )
	                throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.EMPTY,"Message cannot be empty");
	            if (message.contains("Sad")) {
	                return "SAD";
	            } else
	                return "HAPPY";

	        } catch (NullPointerException e) {
	            throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.NULL,"Message cannot be Null");
	        }
	    }

}
