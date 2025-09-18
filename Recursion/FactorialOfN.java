//        | Metric           | Value |
//        | ---------------- | ----- |
//        | Time Complexity  | O(n)  |
//        | Space Complexity | O(n)  |

public class FactorialOfN {

    public static void main(String[] args) {
        int num=3;
        System.out.println(fact(num));
    }

    static int fact(int num)
    {   if(num==0) return 1;
        return num*fact(--num);
    }
}