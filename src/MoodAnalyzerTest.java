import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	 @Test
	    public void MoodTest_Sad(){

	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
	        String mood = null;
	        try {
	            mood = moodAnalyzer.analyzeMood();
	        } catch (MoodAnalyzerException e) {
	            e.printStackTrace();
	        }
	        Assert.assertEquals("SAD", mood);
	    }

	    @Test
	    public void MoodTest_Happy(){

	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy mood");
	        String mood = null;
	        try {
	            mood = moodAnalyzer.analyzeMood();
	        } catch (MoodAnalyzerException e) {
	            e.printStackTrace();
	        }
	        Assert.assertEquals("HAPPY", mood);
	    }


	    @Test
	    public void MoodTest_Null(){

	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
	        String mood = null;
	        try {
	            mood = moodAnalyzer.analyzeMood();
	        } catch (MoodAnalyzerException e) {
	            System.out.println(e.type);
	            System.out.println(e);
	        }
	    }


	    @Test
	    public void MoodTest_Empty(){

	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
	        String mood = null;
	        try {
	            mood = moodAnalyzer.analyzeMood();
	        } catch (MoodAnalyzerException e) {
	            System.out.println(e.type);
	            System.out.println(e);
	        }
	    }

}
