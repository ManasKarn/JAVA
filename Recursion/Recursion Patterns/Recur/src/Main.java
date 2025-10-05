import java.util.*;
import java.util.HashSet;
class Recur
{
    public static void main(String[] args)
    {
        Recur ob= new Recur();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter case");
        int no=sc.nextInt();
        switch (no) {
            case 1:
                System.out.println("Enter string ");
                String st = sc.next();
                System.out.println(reverse(st, st.length()));
                break;
            case 2:
                System.out.println("Enter the number for factorial");
                int n= sc.nextInt();
                System.out.println(ob.factorial(n));
                break;
            case 3:
                System.out.println("Enter the number and power");
                int n1= sc.nextInt();
                int po= sc.nextInt();
                System.out.println(ob.power(n1,po));
                break;
            case 4:
                System.out.println("Enter string and element");
                String st1=sc.next();
                char c=sc.next().charAt(0);
                System.out.println(lo(st1,st1.length(),c,0));
                break;
            case 5:
                System.out.println("Enter the string");
                String st2=sc.next();int i=0;
                String sf="", sl="";
                System.out.println(shiftc(st2,sf,sl,i));
                break;
            case 6:
                System.out.println("Enter the string");
                String st3=sc.next();
                boolean ar[] =new  boolean[26];
                System.out.println(dublicate(st3,"",0,ar));
                break;
            case 7:
                System.out.println("Enter the string");
                String st4=sc.next();
                System.out.println(choice(st4,"",0));
                break;
            case 8:
                System.out.println("Enter the string");
                String st5=sc.next();
                HashSet<String>set=new HashSet<>();
                sequence(st5,"",0,set);
                break;
            case 9:
                System.out.println("Enter the string");
                String st6=sc.next();
                permutation(st6,"");
                break;
            case 10:
                System.out.println("Enter the no for the subsets ");
                int n2=sc.nextInt();
                ArrayList<Integer> sub =new ArrayList<>();
                subset(n2,sub);
                break;
            default:
                System.out.println("Entered wrong choice");

        }
        // ok(1);
//        String a="abcdef";
//        String b=a.substring(2,2);
//        System.out.println(b);
    }
    public static int factorial(int n)
    {
        if (n==0 || n==1)
            return 1;
        return (factorial(n-1) * n);
    }
    public static int power(int x,int n)
    {
        if (n==0)
            return 1;
        return (power(x,n-1)*x);
    }
    public static String reverse(String st , int l)
    {
        if (l==1)
            return ""+st.charAt(0);
        else
            return ""+st.charAt(l-1)+reverse(st,l-1);
    }
    public static int lo(String st,int l,char c,int k){
        if(l==1)
        {
            if (st.charAt(l-1)==c)
                return ++k;
            else return k;
        }
        if (st.charAt(l-1)==c)
            return lo(st, l - 1, c, ++k);

        else
            return lo(st,l-1,c,k);


    }
    public static String shiftc(String st,String fs,String sl,int i) {
        if(i==st.length())
        {
            return fs+sl;
        }
        if(st.charAt(i)!='x') {//xxxbcxn
            fs += st.charAt(i);// bcnxxxx
        }
        else {
            sl+=st.charAt(i);
        }
        return shiftc(st,fs,sl,++i);

    }
    public static String dublicate(String st,String nst,int i,boolean ar[]){
        if (i==st.length())
            return  nst;
        if (ar[ st.charAt(i)-'a']) {
            return dublicate( st,  nst,  ++i,  ar);
        }
        else {
            ar[ st.charAt(i)-'a']=true;
            nst+=st.charAt(i);
            return dublicate( st,  nst,  ++i, ar);
        }
    }
    public static String choice(String st,String nst,int i){
        if (i==st.length())
            return nst;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your choice if you want the next character "+st.charAt(i)+" in string enter 1 otherwise 0");
        int t=sc.nextInt();
        if (t==1){
            nst+=st.charAt(i);
            return choice(st,nst,++i);
        }
        else {
            nst+="_";
            return choice(st,nst,++i);
        }
    }
    public static void  sequence(String st ,String nst , int i,HashSet<String> set){
        if(i==st.length()) {
            if(set.contains(nst))
                return;
        }
        else
        {
            set.add(nst);
            System.out.println(nst);
            return;
        }
        sequence(st,nst+st.charAt(i),i+1,set);
        sequence(st,nst,i+1,set);
    }
    //    public static void ok(int i){
//        if (i==5)
//            return;
//            System.out.println("before recursion "+i);
//            ok(++i);
//            System.out.println("After recursion"+i);
//
//    }
    public static void permutation(String st ,String permutation  ){
        if(st.length()==0)
        {
            System.out.println(permutation);
            return;
        }
        for (int i =0 ; i < st.length(); i++) {
            char c=st.charAt(i);
            String nst=st.substring(0,i)+st.substring(i+1);
            permutation(nst,permutation+c);
        }

    }
    public static void subset(int n,ArrayList<Integer>set){
        if (n==0) {
            for (int i = 0; i < set.size(); i++)
                System.out.print(set.get(i) + " ");
            System.out.println();
            return;
        }
        set.add(n);
        subset(n-1,set);
        set.remove(set.size()-1);
        subset(n-1,set);
    }
}