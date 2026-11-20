public class happy {
    public static void main( String args[]){
        int num=19;
int temp= num,sum=0;
while(sum!=1 && sum!=4){
    sum=0;
    while(temp>0){
        int r=temp%10;
        sum=sum+(r*r);
        temp=temp/10;
    }
    temp=sum;
}
if(sum==1){
    System.out.println("Happy number");
}
else{
    System.out.println("Not a happy number");
}
    }
}
