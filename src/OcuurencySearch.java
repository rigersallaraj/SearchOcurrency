public class OcuurencySearch {

  public static void main(String[] args) {

    char[] haystack = {'v', 'n', 'k', '2', '4', '3', '5', 'k', 'v', 'a', 'b', 'c', 'o', '8', 'a', 'w', 'k', 'h', '1', '2', '5', 'k', 'j', 'n', 'e', 'y', 't', 'b', 'c', 'd', '1', '2', 'q', 'j', 'h', 'b', '4', 'a', 'c', 'd', '1', '2', '3', 'x', 'm', 'n', 'b', 'q', 'w', 'n', 'w', '4', 't'};
    char[] needle = {'a', 'b', 'c', 'd', '1', '2', '3', '4'};
    int threshold = 3;
    int m = 0, n = 0, offset1 = 0, offset2 = 0;
    int count = 0;

    for (int i = 0; i < haystack.length; i++) {
      count = 0;
      for (int j = 0; j < needle.length; j++) {

        if (haystack[i] == needle[j]) {
          offset1 = i;
          offset2 = j;
          count++;
          m = i + 1;
          n = j + 1;
          while (m < haystack.length && n < needle.length) {
            if (haystack[m] == needle[n]) {
              count++;
              m++;
              n++;
            } else {
              break;
            }
          }
          if (count >= 3) {
            System.out.println("Sequence of length "
                + count + " found at haystack offset "
                + offset1
                + " , needle offset: "
                + offset2);
          }
          count--;
        }

      }

      i += count;
    }

  }

}
