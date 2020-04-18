class CountingElement {
    public int countElements(int[] arr) {
        
        Arrays.sort(arr);
        int count =0;
        for(int i=1;i<arr.length;i++){
            int repeat = 0;
            while(i < arr.length && arr[i-1] == arr[i] ){
                i++;
                repeat++;
            }
            if(i<arr.length && arr[i-1]+1 == arr[i]){
                count++;
                count = count+repeat;
            }
        }
        return count;
    }
}
