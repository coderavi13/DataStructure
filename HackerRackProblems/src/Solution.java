
import java.util.*;
import java.util.stream.*;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] colors = new int[101];
    for (int i = 0; i < n; ++i) {
      int c = in.nextInt();
      colors[c]++;
      System.out.println(colors[c]);
    }
    System.out.println("*******");
    System.out.println(Arrays.stream(colors).map(count -> count / 2).sum());
  }
}