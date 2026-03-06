package trie;

import java.util.*;

public class trie {

    private TrieNode root;

    public trie() {
        root = new TrieNode();
    }

    public void insert(String word, int frequency) {

        TrieNode current = root;

        for (char ch : word.toCharArray()) {

            current.children.putIfAbsent(ch, new TrieNode());
            current = current.children.get(ch);

            current.topSuggestions.offer(word);

            if (current.topSuggestions.size() > 5) {
                current.topSuggestions.poll();
            }
        }

        current.isWord = true;
        current.frequency = frequency;
    }

    public List<String> getTopSuggestions(String prefix) {

        TrieNode current = root;

        for (char ch : prefix.toCharArray()) {
            if (!current.children.containsKey(ch)) {
                return new ArrayList<>();
            }
            current = current.children.get(ch);
        }

        return new ArrayList<>(current.topSuggestions);
    }
}