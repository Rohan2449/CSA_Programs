package miscellaneous;


public class WordList {
    private String[] words;
    int count;

    public WordList() {
        words = new String[]{"", ""};
        count = 0;
    }

    public int findWord(String str) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(str))
                return i;
        }
        return -1;
    }

    public int addWord(String str) {
        // if word already in array
        if (findWord(str) >= 0) {
            return count;
        }
        //if the array is full
        else if (!words[words.length - 1].equals("")) {
            String[] prevWords = words;
            words = new String[words.length * 2];
            for (int index = 0; index < prevWords.length; index++) {
                words[index] = prevWords[index];
            }
            for(int index = prevWords.length; index < words.length; index++){
                words[index] = "";
            }

            words[count + 1] = str;
            count++;

            return count;
        } else {
            count++;
            for (int index = 0; index < words.length; index++) {
                if (words[index].equals("")) {
                    words[index] = str;
                    return count;
                }
            }
            return count;
        }
    }

    public void removeWord(String str){
        String[]prevWords = words;
        int wordIndex = findWord(str);
        if(wordIndex >= 0){
            words[wordIndex]= "";
            for(int index = wordIndex; index < words.length-1; index++){
                words[index] = prevWords[index+1];
            }
            words[words.length-1] = "";
            count--;
        }
    }

    public boolean equals(WordList other) {
        if (this.count != other.count) {
            return false;
        } else {
            for (int i = 0; i < this.count; i++) {
                if (words[i] != other.words[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        String s = "There are " + count + " word" + ((words.length == 1)?"":"s") + " in the word list:\n";
        for (String w : words) {
            s = s + w + "\n";
        }
        return s;
    }


    public static void main(String[] args) {
        WordList wl = new WordList();
        wl.addWord("Dog");
        System.out.print(wl);
        wl.addWord("Dog");
        System.out.print(wl);
        wl.removeWord("Dog");
        wl.addWord("Cat");
        wl.addWord("Fish");
        wl.addWord("Horse");
        System.out.print(wl);
        if (wl.findWord("Cat") >= 0)
            System.out.println("Cat is in the word list");
        if (wl.findWord("Dog") >= 0)
            System.out.println("Dog is in the word list");
        WordList myList = new WordList();
        myList.addWord("Cat");
        myList.addWord("Horse");
        myList.addWord("Fish");
        if (wl.equals(myList))
            System.out.println("The two lists are the same");
        System.out.println("hi");
    }
}





