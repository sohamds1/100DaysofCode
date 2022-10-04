/*Leetcode #2114
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.
 */
class Solution {
    public int mostWordsFound(String[] sentences) {
    
        int max=0;
        int i=0,len=sentences.length;
        while(i<len){
            max=Math.max(max,(sentences[i].split(" ")).length);
            i++;
        }
        return max;
              
    }
}