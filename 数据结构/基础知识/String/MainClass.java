package String;

/**
 * 基础知识：
 * 一、广泛性
 * 1）字符串可以看做字符类型的数组，与数组排序、查找、调整有关
 * 2）很多其它类型的面试题都可以看做字符串类型的面试题
 * 3）StringBuffer：线程安全，可变的字符序列。 字符串缓冲区就像一个String ，但可以修改。
 *                 在任何时间点，它包含一些特定的字符序列，但可以通过某些方法调用来更改序列的长度和内容,append和insert方法
 * 4) StringBuilder：一个可变的字符序列。 此类提供与StringBuffer的API，但不保证同步。 此类设计用作简易替换为StringBuffer
 *                 在正在使用由单个线程字符串缓冲区的地方
 *
 * 二、需掌握的概念
 * 1）回文；2）子串（连续）；3）子序列（不连续）；4）前缀树（Tire树）
 * 5）后缀树和后缀数组；6）匹配；7）字典序
 *
 * 三、需掌握的操作
 * 1）与数组相关的操作：增、删、改、查；2）字符的替换；3）字符串的旋转
 *
 * 常见题目类型
 * 一、规则判断
 * 1）判断字符串是否符合整数规则
 * 2）判断字符串是否符合浮点数规则
 * 3）判断字符串是否符合回文字符串规则
 *
 * 二、数字运算
 * int和long类型表达整数的范围有限，所以经常使用字符串匹配大整数。与大整数相关的加减乘除操作，需模拟笔算的过程
 *
 * 三、与数组操作有关的类型
 * 1）数组有关的调整、排序等操作需要掌握
 * 2）快速排序的划分过程
 *
 * 四、字符计数
 * 1）哈希表；2）固定长度的数组；3）滑动窗口问题、寻找无重复字符子串的问题、计算变位词等问题
 *
 * 五、动态规划类型
 * 1）最长公共子串
 * 2）最长公共子序列
 * 3）最长回文子串
 * 4）最长回文子序列
 * ......
 *
 * 六、搜索类型
 * 1）宽度优先遍历搜索
 * 2）深度优先遍历搜索
 */

public class MainClass {
    public static void main(String[] args){

        /**
         * 1.给定一个字符串，请你找出其中不含有重复字符的最长子串的长度
         */
        CharactCount.lengthOfLongestSubstring();

        /**
         * 2.给定两个字符串str1和str2，如果str1和str2中出现的字符种类一样且每种字符出现的次数也一样，
         *   那么str1和str2互为变形词，请实现函数判断两个字符串是否互为变形词
         */
        CharactCount.isTransform();

        /**
         * 3.给定彼此独立的两棵树头节点t1和t2，判断t1中是否有与t2树拓扑结构完全一致的子树
         */
        CharactCount.jugeChildTree();

        /**
         * 4.给定一个字符串s，把字符串s前面任意部分挪到后面去形成的字符串叫做它的旋转词。比如，str="1234"
         *   的旋转词有"1234"，"2341"，"3412"，"4123"。给定两个字符串a和b，请判断a和b是否为旋转词
         */
        CharactCount.rotate();

        /**
         * 5.给定一个字符串str，请在单词间做逆序调整
         */
        CharactCount.reverseSentence();

        /**
         * 6.给定一个字符串str和一个整数i，i代表str中的位置，将str[0,i]移到右侧，str[i+1, N-1]移到左侧
         *   要求：时间复杂度为O(N，额外空间复杂度为O(1)
         */
        CharactCount.reverceSubString();

        /**
         * 7.给定一个字符串类型的数组strs，请找到一种拼接顺序，使得将所有字符串拼接起来组成的
         *   大字符串是所有可能性中字典顺序最小的，并返回这个大字符串
         */
        StringSort.getSmallString();

        /**
         * 8.给定一个字符串str，将其中所有空格字符替换为"%20"
         */
        StringSort.replaceSpace();

        /**
         * 9.给定一个字符串str，判断是否是整体有效的括号字符串
         */
        RuleJuge.isValidBracket();
    }
}
