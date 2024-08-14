 class Average_of_Salary_Except_min_max {
    public static void main(String[] args) {
        int[] a = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println(average(a));
    }
    public static double average(int[] salary) {
        int n = salary.length;

        int l = Integer.MAX_VALUE, r = Integer.MIN_VALUE;

        for(int i  : salary){
            r = Math.max(r,i);
            l = Math.min(l,i);
        }
        int sum = 0;
        int asum = 0;
        for(int i  : salary){
            if(i!=l && i!=r){
               sum += i;
            }
            asum += i;
        }

        double avg = (double) sum /(n-2), aavg = (double) asum /n;
        double res = aavg%100000;
       


        return avg;
                

    }
}