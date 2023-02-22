package AlgorithmsBasics;

/*Rabin-Karp algorithm is an algorithm used for searching/matching patterns
in the text using a hash function. Unlike Naive string matching algorithm,
it does not travel through every character in the initial phase rather
it filters the characters that do not match and then performs the comparison.

A hash function is a tool to map a larger input value to a smaller
output value. This output value is called the hash value.


https://www.programiz.com/dsa/rabin-karp-algorithm#:~:text=Rabin%2DKarp%20algorithm%20is%20an,and%20then%20performs%20the%20comparison.
 */

public class RabinKarp {
    public final static int d = 10;
  
    static void search(String pattern, String txt, int q) {
      int m = pattern.length();
      int n = txt.length();
      int i, j;
      int p = 0;
      int t = 0;
      int h = 1;
  
      for (i = 0; i < m - 1; i++)
        h = (h * d) % q;
  
      // Calculate hash value for pattern and text
      for (i = 0; i < m; i++) {
        p = (d * p + pattern.charAt(i)) % q;
        t = (d * t + txt.charAt(i)) % q;
      }
  
      // Find the match
      for (i = 0; i <= n - m; i++) {
        if (p == t) {
          for (j = 0; j < m; j++) {
            if (txt.charAt(i + j) != pattern.charAt(j))
              break;
          }
  
          if (j == m)
            System.out.println("Pattern is found at position: " + (i + 1));
        }
  
        if (i < n - m) {
          t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
          if (t < 0)
            t = (t + q);
        }
      }
    }
  
    public static void main(String[] args) {
      String txt = "ABCCDDAEFG";
      String pattern = "CDD";
      int q = 13;
      search(pattern, txt, q);
    }
  }