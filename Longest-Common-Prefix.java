// 14. Longest Common Prefix

// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

 

// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"
  
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""


class Solution {
    public String longestCommonPrefix(String[] strs) {
    String str = "";
    int n = strs.length;
    Arrays.sort(strs);
    for(int i =0;i<strs[0].length();i++){
        String a = strs[0];
        String b = strs[n-1];
        if(a.charAt(i) == b.charAt(i)){
            str+=a.charAt(i);
            }
        else{
            break;
            }
        }
        if(str == ""){
            return "";
        }
        else{
            return str;
        }
    }
}
