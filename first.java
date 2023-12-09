import java.util.Scanner; 
public class first{

    static void count(int n){
        int cnt = 0 ;
        while(n!=0){
            int digit = n%10 ; 
            cnt++ ; 
            n = n/10; 
        }

        System.out.println(cnt);
    }

    static void reverse(int n){
        int rev = 0 ;
        while(n!=0){
            int digit = n%10 ; 
            rev = rev*10 + digit ;   
            n = n/10; 
        }

        System.out.println(rev);
    }

    static void palindrome(int n){
        int temp = n ;
        int rev = 0 ; 
        while(n!=0){
            int digit = n%10 ;
            rev = rev*10 + digit ;
            n = n/10 ; 
        }
        if(temp==rev) System.out.println("Palindrome");
        else System.out.println("NOT Palindrome");
    }

    static int gcd(int a ,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    static void armstrong(int n){
        int temp = n ;
        int sum = 0 ; 
        while(n!=0){
            int digit = n%10 ;
            sum += digit*digit*digit;
            n = n/10;
        }
        
        if(temp==sum) System.out.println("Armstrong") ;
        else System.out.println("NOT Armstrong");
    }
    static boolean prime(int n){
        for(int i = 2 ;i*i<= n;i++){
            if(n%i==0) return false ;
        }

        return true;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the number: ") ;

        int n = sc.nextInt() ; 

        count(n) ; 
        reverse(n) ; 
        palindrome(n) ; 
        gcd(n,n*3) ; 
        armstrong(n) ; 

        prime(n) ; 


    }
}