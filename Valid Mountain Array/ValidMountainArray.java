class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int p=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1] || p==arr.length-2 && arr[i]<arr[i+1]){
                return false;
            }
            if(arr[i]<arr[i+1]){
                p++;
            }
            if(p==0 && arr[i]>arr[i+1]){
                return false;
            }
            else if(p>0 && arr[i]>arr[i+1]){
                break;
            }
        }
        for(int j=p;j<arr.length-1;j++){
            if(arr[j]==arr[j+1]){
                return false;
            }
            if(arr[j]>arr[j+1]){
                p++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
