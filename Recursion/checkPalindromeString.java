//        | Metric           | Complexity |
//        | ---------------- | ---------- |
//        | Time Complexity  | O(n)       |
//        | Space Complexity | O(n)       |

public class checkPalindromeString {
    public static void main(String[] args) {

        String str="abcbaa";

        System.out.println(palindrome(0,str.length()-1,str));

    }

    static boolean palindrome(int left, int right, String str)
    {
        if(left>right) return true;
        else if(str.charAt(left)!= str.charAt(right))
        {
            return false;
        }


        return palindrome(left+1,right-1,str);
    }
}