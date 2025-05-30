public class mergeSort {

    public static void mergeSorts(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSorts(arr,si,mid);
        mergeSorts(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si, int mid, int ei){
        int i=si;
        int j=mid+1;
        int k=0;
        int temp[]= new int[ei-si+1];

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid)
            temp[k++]=arr[i++];

        while(j<=ei)
            temp[k++]=arr[j++];

        k=0;
        for(int p=si; k<temp.length; p++){
            arr[p]=temp[k];
            k++;
        }
    }

    public static void main(String[] args) {
        int arr[]={5,3,4,1,2};
        mergeSorts(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}

//asdnkiashnd 