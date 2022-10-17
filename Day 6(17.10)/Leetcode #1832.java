/*Leetcode #1832 - Check if the Sentence Is Pangram
A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram
or false otherwise.
 */
class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] res= new int[26];
            for (int i=0;i<sentence.length();i++){
                    res[sentence.charAt(i)-97]++;
            }
            for(int i=0;i<26;i++){
                    if(res[i]==0){
                            return false;
                    }
            }
            return true;
    }
}