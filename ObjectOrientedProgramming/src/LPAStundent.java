public record LPAStundent(String id, String name, String dateOfBirth, String classList) {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            LPAStundent student = new LPAStundent("id" + i, switch(i) {
                case 1 -> "name1";
                case 2 -> "name2";
                case 3 -> "name3";
                case 4 -> "name4";
                case 5 -> "name5";
                default -> "name";
            }, "01/01/2001", "class" + i);
            System.out.println(student);
        }
    }

}
