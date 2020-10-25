public class HasBad2 {
  public boolean hasBad(String str) {
    int len = str.length();

    if (len == 3) {
      return (str.substring(0, 3).equals("bad"));
    }

    if (len > 3) {
      return str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad");
    }
    return false;
  }
}
