public class Project3 {
    public static void main(String[] args) {
        System.out.println(groupify(caesarify(normalizeText("M!@#5665ja ,,, as"), 1), 3));
    }

    public static String normalizeText(String word){
        StringBuilder res = new StringBuilder();
        for (int i=0; i<word.length(); i++){
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z' || word.charAt(i) >= 'a' && word.charAt(i) <= 'z' ){
                    res.append(word.charAt(i));
            }
            else {
                continue;
            }
        }
        String result = res.toString();
        result = result.toUpperCase();
        return result;
    }

    public static String caesarify(String word, int index){
        StringBuilder res = new StringBuilder();
        for (int i=0; i<word.length(); i++){
            int ascii = word.charAt(i);
            int number = ascii + index;
            if(number > 90){
                number = number - 26;
            }
            char letter = (char)(number);
            res.append(letter);
        }
        String result = res.toString();
        return result;
    }

    public static String groupify(String word, int value){
        StringBuilder res = new StringBuilder();
        int counter = 0;
        for (int i=0; i<word.length(); i++){
            if (counter == value){
                res.append(" ");
                counter = 0;
            }
            res.append(word.charAt(i));
            counter++;

        }
        int rest = value - (word.length()%value);
        for (int i=0; i<rest; i++){
            res.append("x");
        }
        String result = res.toString();
        return result;
    }
}
