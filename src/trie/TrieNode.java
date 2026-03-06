package trie;

import java.util.*;

class TrieNode {

    Map<Character, TrieNode> children;
    boolean isWord;
    int frequency;
    PriorityQueue<String> topSuggestions;

    public TrieNode() {
        children = new HashMap<>();
        isWord = false;
        frequency = 0;
        topSuggestions = new PriorityQueue<>(5);
    }
}