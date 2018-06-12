public class ReverseString {

    private String str8;

    public void reverseString (String today){
//        String [] todayArr = today.split("");
//        List<String> todayArrList = Arrays.asList(todayArr);
//        Collections.reverse(todayArrList);
//        String [] newArr = (String []) todayArrList.toArray();
//        String newToday = "".join("", newArr);
//        System.out.println(newToday);
//
        String reversedString = "";
        for(int i = today.length() - 1; i >= 0; i--) {
            reversedString += today.charAt(i);
        }
        System.out.println(reversedString);
    }


}
