public class Switch {
    public static void main(String[] args) {
        int value = 3;
        switch(value) {
          case 1 -> System.out.println("value was 1");
          case 2 -> System.out.println("Value was 2");
          case 3, 4, 5 -> {
              System.out.println("Was a 3, a 4, or a 5");
              System.out.println("Actually it was a " + value);
          }
          default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        System.out.println( "Quarter " + getQuarter("JANUARY"));
    }

    public static String getQuarter(String month) {
        return switch(month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                yield "1st";
            }
            case "APRIL", "MAY", "JUNE" -> "2st";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3st";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4st";
            default -> {
                yield month + " is bad";
                 // yield es como return
            }
        };
    }
}
