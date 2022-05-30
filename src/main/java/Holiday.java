public class Holiday {

        private String name;
        private int day;
        private String month;
        // your code goes here
        public Holiday(String n, int d, String m) {
            name = n;
            day = d;
            month = m;
            System.out.println(n+" is "+ m+" "+d);
        }
    public boolean inSameMonth(Holiday hol){
        return this.month.equals(hol.month);
    }
    public static double avgDate(Holiday[] hol) {
        int sum = 0;
        for(int i = 0; i < hol.length; i++) {
            sum = sum + hol[i].day;
        }
        return ((double) sum)/hol.length;
    }

    public static void main(String[] args) {
        Holiday hol = new Holiday("Independence_day",4,"July");

    }
    }

