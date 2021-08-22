class GfG
{
    public static int findMax(Height arr[], int n)
    {
       int maxHeight = arr[0].feet * 12 + arr[0].inches;
       
       for(int i=1; i<n; i++){
           int temp = arr[i].feet * 12 + arr[i].inches;
           
           if(temp > maxHeight)
                maxHeight = temp;
       }
       
       return maxHeight;
    }
    
}
