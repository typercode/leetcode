package com.leetcode.easy;

public class ReverseInteger {

  public static void main(String[] args) {
    //
    ReverseInteger reverseInteger = new ReverseInteger();
    int reverse = reverseInteger.reverse(12233);
    System.out.println(reverse);
  }

  /**
   * 作者：LeetCode
   * 链接：https://leetcode-cn.com/problems/reverse-integer/solution/zheng-shu-fan-zhuan-by-leetcode/
   * 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
   *
   * @param x
   * @return
   */
  public int reverse(int x) {
    int rev = 0;
    while (x != 0) {
      int pop = x % 10;
      x /= 10;
      if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
        return 0;
      }
      if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
        return 0;
      }
      rev = rev * 10 + pop;
    }
    return rev;
  }

  /**
   * my ugly answer
   *
   * <p>并且没有溢出的判断
   *
   * @param x
   * @return
   */
  public int uglyReverse(int x) {
    System.out.println(x);
    int result = 0;
    if (x == 0) {
      // do nothing
    } else if (x > 0) {
      String si = String.valueOf(x);
      char[] chars = si.toCharArray();
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = chars.length - 1; i >= 0; i--) {
        stringBuilder.append(chars[i]);
      }
      result = Integer.parseInt(stringBuilder.toString());
    } else {
      String si = String.valueOf(x);
      char[] chars = si.toCharArray();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("-");
      for (int i = chars.length - 1; i >= 1; i--) {
        stringBuilder.append(chars[i]);
      }
      result = Integer.parseInt(stringBuilder.toString());
    }
    System.out.println(result);
    return result;
  }
}
