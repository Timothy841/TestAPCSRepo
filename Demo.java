public class Demo{

  public static void main(String[] args) {
    if (args.length==0){
      printLoop(5);
    }
    else{
      printLoop(Integer.parseInt(args[0]));
    }
    System.out.println(arrayDeepToString(create2DArrayRandomized(10,10,100)).replace("}, ","},\n "));
   }

   public static void printLoop(int n) {
     for (int i = 1; i<=n;i++){
       for (int j = 0; j<n-i+1;j++){
         System.out.print(i);
       }
       System.out.println();
     }
   }

   public static String arrToString(int[] arr){
     String a = "{";
     for (int i = 0; i<arr.length;i++){
       if (i<arr.length-1){
         a+=arr[i]+", ";
       }
       else{
         a+=arr[i];
       }
     }
     a+="}, ";
     return a;
   }

   public static String arrayDeepToString(int[][] arr){
     String a = "";
     for (int i = 0; i<arr.length; i++){
       a+=arrToString(arr[i]);
     }
     return a;
   }

   public static int[][] create2DArray(int rows, int cols, int maxValue){
     int[][] a = new int[rows][];
     for (int i = 0; i < rows; i++){
       a[i] = new int[cols];
       for (int j = 0; j < cols; j++){
         a[i][j] = ((int)(Math.random() * (maxValue+1)));
       }
     }
     return a;
   }

   public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
     int[][] a = new int[rows][];
     for (int i = 0; i < rows; i++){
       a[i] = new int[(int)(Math.random() * (cols+1))];
       for (int j = 0; j < a[i].length; j++){
         a[i][j] = ((int)(Math.random() * (maxValue+1)));
       }
     }
     return a;
   }

}
