
import static java.lang.Math.min;

/*
Pattern 1: Rectangle Star Pattern
For n rows, print n star in each row

Approch:
- Outer loop: runs n times for n rows
- Inner loop: runs n times for n stars per row
- Print star and space in inner loop
- Move to next line after each row

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

class Pattern{

    static void pattern1(int N)
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int N)
    {
        //outer loop for N rows
        for(int i=0;i<N;i++)
        {
            //inner loop 
            //no. of col=current row no
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int N)
    {
        //outer loop for N rows
        for(int i=1;i<=N;i++)
        {
            //inner loop 
            //no. of col=current row no
            //print col number in each row
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    static void pattern4(int N)
    {
        //outer loop for N rows
        for(int i=1;i<=N;i++)
        {
            //inner loop 
            //no. of col=current row no
            //print row number in each row
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int N)
    {
        //outer loop for N rows
        for(int i=N;i>0;i--)
        {
            //inner loop 
            //no. of col=current row no
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int N)
    {
        //outer loop for N rows
        for(int i=N;i>0;i--)
        {
            //inner loop 
            //no. of col=current row no
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern7(int N)
    {
       for (int i = 0; i < N; i++) {
           
        //space 
        for(int j=0;j<N-i-1;j++){
            System.out.print(" ");
        }

        //star
        for(int j=0;j<(2*i+1);j++){
            System.out.print("*");
        }
        //space
        for(int j=0;j<N-i-1;j++){
            System.out.print(" ");
        }
        System.out.println("");
       }
    }

    static void pattern8(int N)
    {
       for (int i = 0; i < N; i++) {
           
        //space 
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }

        //star
        for(int j=0;j<2*N-(2*i+1);j++){
            System.out.print("*");
        }
        //space
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        System.out.println("");
       }
    }

    static void pattern10(int N)
    {
       for (int i = 1; i <= 2*N-1; i++) {

        int stars=i;
        if(i>N) stars=2*N-i;
           
        //space 
        for(int j=1;j<stars;j++){
            System.out.print("*");
        }
        System.out.println("");
       }
    }

    static void pattern11(int N)
    {
        int start=1;
        for (int i = 0; i < N; i++) {
            if(i%2==0) start=1;
            else start=0;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println("");
        }
    }

    static void pattern12(int N)
    {
        int space=2*(N-1);
    
        for (int i = 1; i <= N; i++) {
            
            //Numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            //Space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            
            //Numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("");
            space-=2;
        }
    }

    static void pattern13(int N)
    {
        int num=1;
        for (int i = 1; i <=N; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println("");
        }
    }

    static void pattern14(int N)
    {
        for(int i=0;i<N;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println("");
        }
    }

    static void pattern15(int N)
    {
        for(int i=0;i<N;i++){
            for(char ch='A';ch<'A'+N-i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println("");
        }
    }

    static void pattern16(int N)
    {
        for (int i = 0; i < N; i++) {
            
            char ch = (char) ('A' + i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+"");
            }
            System.out.println("");
        }
    }

    static void pattern17(int N)
    {
       for (int i = 0; i < N; i++) {
           
        //space 
        for(int j=0;j<N-i-1;j++){
            System.out.print(" ");
        }

        //Characters
        char ch='A';
        int breakpoint=(2*i+1)/2;

        for(int j=1;j<=2*i+1;j++){
            System.out.print(ch);
            if(j<=breakpoint) ch++;
            else ch--;
        }
        //space
        for(int j=0;j<N-i-1;j++){
            System.out.print(" ");
        }
        System.out.println("");
       }
    }

    static void pattern18(int N){
        for(int i=0;i<N;i++){
            for(char ch=(char) ('A'-1+N-i);ch<='A'+N-1;ch++){
                System.out.print(ch+" ");
            }
            System.out.println("");
        }
    }

    static void pattern19(int N){

        //top
        for(int i=0;i<N;i++){

            //stars
            for(int j=N-i;j>0;j--){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<i+i;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=N-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        //bottom
        for(int i=1;i<=N;i++){

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=2*N-(2*i);j>0;j--){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern20(int N){
        //top part
        for(int i=1;i<=N;i++){

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=2*N-(2*i);j>0;j--){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //bottom
        for(int i=1;i<N;i++){

            //stars
            for(int j=N-i;j>0;j--){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<i+i;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=N-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern21(int N){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==0||j==0||i==N-1||j==N-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern22(int N){
        for(int i=0;i<2*N-1;i++){
            for(int j=0;j<2*N-1;j++){
                int top=i;
                int left=j;
                int right=(2*N-2)-j;
                int down=(2*N-2)-i;

                System.out.print(N-min(min(top,down),min(left,right)));
            }
            System.out.println("");
        }
    }
    public static void main (String[] args){

        int N=5;
        // pattern1(N);
        // pattern2(N);
        // pattern3(N);
        // pattern4(N);
        // pattern5(N);
        // pattern6(N);
        // pattern7(N);
        // pattern8(N);
        //pattern9= pattern7+pattern8 so we'll just run pattern 7 and 8
        // pattern7(N);
        // pattern8(N);
        // pattern10(N);
        // pattern11(N);
        // pattern12(N);
        // pattern13(N);
        // pattern14(N);
        // pattern15(N);
        // pattern16(N);
        // pattern17(N);
        // pattern18(N);
        // pattern19(N);
        // pattern20(N);
        // pattern21(N);
        pattern22(N);

    }
}
