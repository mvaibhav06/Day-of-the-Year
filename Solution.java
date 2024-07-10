class Solution {
    public int dayOfYear(String date) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] part = date.split("-");
        int[] parts = {Integer.parseInt(part[0]),Integer.parseInt(part[1]),Integer.parseInt(part[2])};
        int year = parts[0];

        if(year%400==0 || (year%4==0 && year%100!=0)){
            days[1]++;
        }
        int out = 0;
        for(int i=0; i<parts[1]-1; i++){
            out += days[i];
        }
        out += parts[2];
        return out;
    }
}
