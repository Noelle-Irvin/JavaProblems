public class Main {

    public static void main (String [] args){
        //Exercise 5
//       try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))){
//           System.out.println("Enter String:");
//           String input = console.readLine();
//
//           CrawlingFriday cf = new CrawlingFriday();
//           cf.crawlingFriday(input);
//
//       }catch (Exception e){
//           System.out.println(e);
//       }
        //Exercise 6
//        ReverseString todayString = new ReverseString();
//        String str8 = "Today is Tuesday and tomorrow is Wednesday";
//        todayString.reverseString(str8);
        //Exercise 7
        String sixFlags = "Sign up for our park newsletter and we'll let you know immediately if you" +
                "'ve won two tickets to Six Flags!";

        LeetSpeak leetSpeak = new LeetSpeak();
        leetSpeak.replaceLetterWithNumber(sixFlags);

    }
}
