package Dev_Enviroment.RoundRobin1_1;

public class Question {

    /*
    Constructor: public Questions(){
    variables: isSolvedCount, time, topic, solution

     */
    public int isSolvedCount;
    public String numberOfQuestion;



    public Question(String numberOfQuestion) {//constructor format
        this.numberOfQuestion = numberOfQuestion;

    }

    public void questionAnswered() {
        isSolvedCount++;

    }

    /*
    CREATE A METHOD TO TAKE THE TIME OUT OF THE QUESTION...FOR EXAMPLE:
          The question will have this format below:
          String testQuestion = "testQuestion [2 min.]";

          testQuestion = testQuestion.substring(testQuestion.indexOf("min.") - 2, testQuestion.indexOf("min"));

          System.out.println(testQuestion);
     */



    @Override
    public String toString() {
        return numberOfQuestion +
                " isSolvedCount=" + isSolvedCount +
                ", numberOfQuestion='" + numberOfQuestion + '\'' +
                '}';
    }
}
