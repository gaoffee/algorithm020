package org.geekbang.algorithm020;

public class Trie {

    Trie[] next = new Trie[26];

    boolean end = false;

    public Trie() {
    }

    public void insert(String word) {
        Trie current = this;
        for (char c : word.toCharArray()) {
            if (current.next[c - 'a'] == null) {
                current.next[c - 'a'] = new Trie();
            }
            current = current.next[c - 'a'];
        }
        current.end = true;
    }

    public boolean search(String word) {
        Trie current = this;
        for (char c : word.toCharArray()) {
            if (current.next[c - 'a'] == null) {
                return false;
            }
            current = current.next[c - 'a'];
        }
        return current.end;
    }

    public boolean startsWith(String prefix) {
        Trie current = this;
        for (char c : prefix.toCharArray()) {
            if (current.next[c - 'a'] == null) {
                return false;
            }
            current = current.next[c - 'a'];
        }
        return true;
    }
}
