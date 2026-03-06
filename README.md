# 🚀 Production Optimization Sprint

This project contains implementations of some important data structures and algorithms that are commonly used in solving optimization and system-related problems.

Each module focuses on solving a specific problem while keeping the solution efficient.

---

## 📌 Implemented Modules

### 1️⃣ Trie-Based Autocomplete

**Problem:**  
Create an autocomplete system that suggests words based on a given prefix.

**Approach:**  
Used a **Trie (Prefix Tree)** to store words and search for prefixes efficiently.

**Features:**
- Insert words into the Trie
- Search words using a prefix
- Generate suggestions based on prefix

---

### 2️⃣ Sliding Window Maximum

**Problem:**  
Given a list of server latency values, find the maximum value in every window of size **K**.

**Approach:**  
Used a **deque** to maintain useful elements in the window and get the maximum efficiently.

---

### 3️⃣ Network Vulnerability Detection

**Problem:**  
Find critical connections (bridges) in a network graph.

**Approach:**  
Used **Tarjan’s Algorithm with DFS** to identify edges whose removal disconnects the network.

---

### 4️⃣ Range Performance Monitor

**Problem:**  
Support efficient updates and range maximum queries for stock prices.

**Approach:**  
Used a **Segment Tree** to handle updates and queries efficiently.

---

### 5️⃣ Optimal Resource Allocation

**Problem:**  
Assign **N workers to N tasks** while minimizing the total cost.

**Approach:**  
Used **Dynamic Programming with Bitmasking** to represent different task assignments.

---

## 🧠 Concepts Used

- Trie Data Structure
- Deque
- Graph Algorithms
- DFS
- Segment Trees
- Dynamic Programming
- Bitmasking