public class CrawlingFriday {

    private String str7 = "";

    public void crawlingFriday (String friday){
        String [] fridayArr = friday.split("");
        for (String letter: fridayArr){
            str7 += letter;
            System.out.println(str7);
        }


    }


}
