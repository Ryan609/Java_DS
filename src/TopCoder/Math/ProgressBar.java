package TopCoder.Math;

/**
 * @author: xinyan
 * @data: 2022/08/03/10:19
 **/
public class ProgressBar {

    public static void main(String[] args) {
        int[] arr = {7,60,468,489,707,499,350,998,1000,716,457,104,597,583,396,862};
        int task = 2;
        System.out.println(showProgress(arr,task));
    }

   public static String showProgress(int[] taskTimes, int tasksCompleted) {
       int totalTime = 0;
       int curTime = 0;
       double complet = 0;
       int time = 0;
       int cur = tasksCompleted;
       String res = "....................";
       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < taskTimes.length; i++) {
           totalTime += taskTimes[i];
       }
       for (int i = 0; i < cur; i ++) {
           curTime += taskTimes[i];
       }
       complet = (double) curTime / totalTime * 20;
       time = (int)Math.floor(complet);

       for (int i = 0; i < time; i++) {
           sb.append("#");
       }
        for (int i = 0; i < 20-time; i++) {
            sb.append(".");
        }
       return sb.toString();
   }
}
