public class RepeatingWord {
    public static void main(String[] args) {
        String seq = "ababc";
        String word="ab";
        int count=0;

        for (int i = 0; i < seq.length(); i++) {
            for (int k = i+1; k <= seq.length(); k++) {
                if(seq.substring(i,k).equals(word))
                    count++;
            }
        }
        System.out.println(count);
    }
}
