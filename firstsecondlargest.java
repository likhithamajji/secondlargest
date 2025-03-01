class firstsecondlargest{
    public static void main(String[] args) {
        int a[]={2,4,3,7,6};
        firstsecondlargest(a);
    }
    public static void firstsecondlargest(int [] a){
        int firstmax=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
if(a[i]>firstmax){
secondmax=firstmax;
firstmax=a[i];
}
else if(a[i]>secondmax&&a[i]!=firstmax){
secondmax=a[i];
}     
        }
        if(secondmax==Integer.MIN_VALUE){
            System.out.print("no second largest");
        }
        else{
            System.out.println("secondlargest="+secondmax);
        }
        System.out.println("firstmax="+firstmax);
    }
}