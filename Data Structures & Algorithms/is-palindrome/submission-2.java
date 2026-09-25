class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<end){

             // skip non-alphanumeric from left
    while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
        start++;
    }

    // skip non-alphanumeric from right
    while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
        end--;
    }
            if (Character.toLowerCase(s.charAt(start)) !=
        Character.toLowerCase(s.charAt(end))) {
        return false;
    }

    start++;
    end--;
        }
        return true;

        
    }
}
