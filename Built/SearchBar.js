class TrieNode {
    constructor() {
        this.children = {};
        this.isEnd = false;
        this.freq = 0;
    }
}












class Trie {
    constructor() {
        this.root = new TrieNode();
    }

    insert(word) {
        let curr = this.root;
        for (let ch of word) {
            if (!curr.children[ch]) {
                curr.children[ch] = new TrieNode();
            }
            curr = curr.children[ch];
        }
        curr.isEnd = true;
    }











    
    increaseFrequency(word) {
        let curr = this.root;
        for (let ch of word) {
            if (!curr.children[ch]) return;
            curr = curr.children[ch];
        }
        curr.freq++;
    }

    getSuggestions(prefix) {
        let curr = this.root;
        for (let ch of prefix) {
            if (!curr.children[ch]) return [];
            curr = curr.children[ch];
        }
        let res = [];
        this._dfs(curr, prefix, res);
        return res.sort((a, b) => b.freq - a.freq);
    }

    _dfs(node, word, res) {
        if (node.isEnd) res.push({ word, freq: node.freq });
        for (let ch in node.children) {
            this._dfs(node.children[ch], word + ch, res);
        }
    }
}

const trie = new Trie();

/* Pre-stored history (acts like database) */
["java", "javascript", "json", "javafx", "jquery"].forEach(w => {
    trie.insert(w);
});

/* Runtime typing */
function onType() {
    const text = document.getElementById("searchInput").value.toLowerCase();
    const ul = document.getElementById("results");
    ul.innerHTML = "";

    if (!text) return;

    const results = trie.getSuggestions(text);
    results.forEach(r => {
        const li = document.createElement("li");
        li.textContent = `${r.word} (priority ${r.freq})`;
        ul.appendChild(li);
    });
}

/* Actual search (Enter or button) */
function doSearch() {
    const text = document.getElementById("searchInput").value.toLowerCase();
    if (!text) return;

    trie.insert(text);
    trie.increaseFrequency(text);
    onType(); // refresh suggestions
}
