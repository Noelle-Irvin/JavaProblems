public class LeetSpeak {


    public void replaceLetterWithNumber(String string) {
        String newstring = "";
        for (int i = 0; i < string.length(); i++) {
//            System.out.println(string.toUpperCase().charAt(i));

            switch (string.toUpperCase().charAt(i)) {
                case 'A': {
                    newstring += "4";
                    break;
                }
                case 'E': {
                    newstring += "3";
                    break;
                }
                case 'G': {
                    newstring += "6";
                    break;
                }
                case 'I': {
                    newstring += "1";
                    break;
                }
                case 'O': {
                    newstring += "0";
                    break;
                }
                case 'S': {
                    newstring += "5";
                    break;
                }
                case 'T': {
                    newstring += "7";
                    break;
                }
                default: {
                    newstring += string.charAt(i);
                }

            }

        }
        System.out.println(newstring);
    }
}


