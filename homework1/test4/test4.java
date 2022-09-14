class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        // 从后往前遍历
        for (int i = s.length(), j=s.length()-1; j>=0; j--) {
            if (s.charAt(j) == ' ') {
                // 确定当前循环位置单词的末尾索引
                if (j>=1 && s.charAt(j-1) != ' ') {
                    i = j;
                }
            } else {
                // 确定当前循环位置单词的起始索引，并截取单词，放入sb中
                if (j == 0 || (j>=1 && s.charAt(j-1) == ' ')) {
                    if (sb.length() == 0) {
                        sb.append(s.substring(j, i));
                    } else {
                        sb.append(" ").append(s.substring(j, i));
                    }
                }
            }
        }
        return sb.toString();
    }
}