# [代码随想录](https://programmercarl.com/)java刷题笔记
## [数组](https://github.com/massica17/leetcode/tree/main/01Arrays)
## [链表](https://github.com/massica17/leetcode/tree/main/02LinkedList)
## [哈希表](https://github.com/massica17/leetcode/tree/main/03HashTable)
## [字符串](https://github.com/massica17/leetcode/tree/main/04Strings)
## [双指针法](https://github.com/massica17/leetcode/tree/main/05TowPointers)
## [栈和队列](https://github.com/massica17/leetcode/tree/main/06StackAndQueue)
## [二叉树](https://github.com/massica17/leetcode/tree/main/07BinaryTree)
## [回溯算法](https://github.com/massica17/leetcode/tree/main/08BackTracking)
## [贪心算法](https://github.com/massica17/leetcode/tree/main/09GreedyAlogorithm)

## [动态规划](https://github.com/massica17/leetcode/tree/main/10DynamicProgramming)
<details>
<summary>动态规划三步</summary>
    1. 定义数组元素的含义 
    2. 找出数组元素之间的关系 
    3. 找出初始值
</details>
<details>
    <summary>01背包</summary>
    特点：物品只能使用一次
</details>

<details>
<summary>完全背包</summary>
    特点：物品可以无限次使用

    排列问题先遍历背包再遍历物品
    ``` java
    // 先遍历背包，再遍历物品
    for(int j = 0; j <= bagWeight; j++) { // 遍历背包容量
        for(int i = 0; i < weight.size(); i++) { // 遍历物品
            if (j - weight[i] >= 0) dp[j] = max(dp[j], dp[j - weight[i]] + value[i]);
        }
        cout << endl;
    }
    ```
    组合问题先遍历物品再遍历背包
    ```java
    // 先遍历物品，再遍历背包
    for(int i = 0; i < weight.size(); i++) { // 遍历物品
        for(int j = weight[i]; j <= bagWeight ; j++) { // 遍历背包容量
            dp[j] = max(dp[j], dp[j - weight[i]] + value[i]);

        }
    }
    ```
</details>

## [单调栈](https://github.com/massica17/leetcode/tree/main/12SimulationAlgorithm)


2023/08/24写完第一遍
