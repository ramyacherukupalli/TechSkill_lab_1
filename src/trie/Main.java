package trie;

public class Main {

    public static void main(String[] args) {

        trie trie = new trie();

        trie.insert("apple", 10);
        trie.insert("application", 7);
        trie.insert("apply", 5);
        trie.insert("appetite", 3);
        trie.insert("appoint", 2);

        System.out.println(trie.getTopSuggestions("app"));
    }
}