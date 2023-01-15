public class Article {

        private String heading;
        private String body;
        private String author;

        public Article () {
            this.heading = heading;
            this.body = "noget i rødt";
            this.author = author;
        }

        public String addLongestWord() {
            String addLongestWord = ""; //
            String[] words = body.split(" "); //i split funktionen, giver vi den en string-værdi med et mellemrum, så det hele ord kommer ud.
            for (String word : words) {
                if (word.length() > addLongestWord.length()) {
                    addLongestWord = word;
                }
            }
            return addLongestWord;

        }
        public static void main(String[] args) {
            Article word = new Article();
            System.out.println(word.addLongestWord());
        }
}
