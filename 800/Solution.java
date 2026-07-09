
class Solution {
    public static void maxRatings(int[][] units) {

        long sum = 0;
        long minSMin = Integer.MAX_VALUE;
        long gMin = Integer.MAX_VALUE;

        for (int i = 0; i < units.length; i++){

            long fMin = Integer.MAX_VALUE;
            long sMin = Integer.MAX_VALUE;
            for (int j = 0; j < units[i].length; j++){
                gMin = Math.min(units[i][j], gMin);

                if (units[i][j] < fMin){
                    sMin = fMin;
                    fMin = units[i][j];
                }

                else if (units[i][j] < sMin){
                    sMin = units[i][j];
                }
            }
            sum = sum + sMin;
            minSMin = Math.min(sMin, minSMin);

            System.out.println("sMin:" + sMin);
            System.out.println("gMin : "+ gMin);
            System.out.println("sum : " + sum);
            System.out.println("minSMin :" + minSMin);
        }

        long ans = gMin + sum - minSMin;
        System.out.println("ans :" + ans);
    }

    public static void main(String[] args) {
        int [][] units = {{1,2,3},{4,5,6}};
        maxRatings(units);
    }
}