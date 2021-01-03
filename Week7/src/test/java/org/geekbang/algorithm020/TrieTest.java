package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TrieTest {

    @Test
    public void test_trie() {
        Trie trie = new Trie();

        trie.insert("apple");
        assertThat(trie.search("apple")).isTrue();
        assertThat(trie.search("app")).isFalse();
        assertThat(trie.startsWith("app")).isTrue();
        trie.insert("app");
        assertThat(trie.search("app")).isTrue();
    }
}