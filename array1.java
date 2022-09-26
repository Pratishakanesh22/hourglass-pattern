public class array1 {
    public static void main(String args []){
    int n=6;
for(int i=n; i>=1; i-- ){
    //space
for(int j=1; j<=n-i; j++){
    System.out.print(" ");
}
    
//numb
for(int j=1; j<=i; j++){
    System.out.print(i + " ");
}
 

System.out.println();
}
//2nd part
    for(int i=1; i<=n;i++){
        //spaces
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    //print numb
    for(int j=1; j<=i; j++){
        System.out.print(i+" ");
    }
System.out.println();
    }
}
}





