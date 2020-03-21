public class BackTracking{

     public static void main(String []args){
         String str = "ABC";
         int n = str.length();
         BackTracking backTracking = new BackTracking();
         backTracking.permute(str,0,n-1);
     }
     
     public void permute(String str, int l, int r){
         if(r== l){
             System.out.println(str);
         }else{
             for(int i = l; i<=r ; i++){
                 str = swap(str, l,i);
                 permute(str,l+1,r);
                 str = swap(str,l,i);
             }
         }
     }
     
     public String swap(String str,int a,int b){
         char[] arr = str.toCharArray();
         char temp = arr[a];
         arr[a] = arr[b];
         arr[b] = temp;
         
         return String.valueOf(arr); 
         
     }
}
