public class RepeatingWord {
    public static void main(String[] args) {
        String seq = "abababc";
        String word="ab";
        int count=0;

        for (int i = 0; i < seq.length(); i++) {
            int wcount=0;
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(j) == seq.charAt(i));
                wcount++;
            }
            System.out.println(wcount);

        }

    }
}
