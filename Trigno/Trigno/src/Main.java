import java.util.*;
class Trigno
{
    static String nst="";
    static String st;
    static int l;
    public static void main(String[] args)
    {
        int i=0;
        Trigno ob=new Trigno();
        ob.input();
        // int f=0;
        int j=0;
        String temp="";
        while (i<l && !(st.charAt(j)==(char)32))
        {//first while start
            temp="";
            char c=st.charAt(j);
            if (c=='+' || c=='-' || c=='*' || c=='/') {
                nst += " " + c;
                j++;
            }
            while (j<st.length() && Character.isDigit(st.charAt(j))) {//second while start
                temp += st.charAt(j);
                if (j + 1 < st.length()){
                    if (Character.isAlphabetic(st.charAt(j + 1))) {//first if start
                        String t1 = "", t2 = "";
                        j++;
                        while (j<st.length() && Character.isAlphabetic(st.charAt(j)) && (st.charAt(j)) == '@') {
                            t1 += st.charAt(j);
                            j++;
                        }
                        while (j<st.length() && Character.isDigit(st.charAt(j))) {
                            t2 += st.charAt(j);
                            j++;
                        }
                        if (t1.equalsIgnoreCase("sin@") || t1.equalsIgnoreCase("cos@") || t1.equalsIgnoreCase("tan@") ||
                                t1.equalsIgnoreCase("cosec@") || t1.equalsIgnoreCase("sec@") || t1.equalsIgnoreCase("cot@")) {
                            trig(temp, t1, t2);
                            temp += t1 + t2;
                            i += temp.length();
                            //i+=r;
                        } else if (Character.isAlphabetic((t1.charAt(0))) && !(t1.equalsIgnoreCase("e"))) {
                            pow(temp, t1, t2);
                            temp += t1 + t2;
                            i += temp.length();
                            //i+=r;
                        }

                    }//first if start
                }
                //j++;
            }// second while end
        }// first while end
     /*   while (i<l && st.charAt(i)!=(char)32)
        {
            char a=st.charAt(i);
            char b=st.charAt(i+1);
            char c=st.charAt(i+2);
            if( Character.isDigit(a) && Character.isAlphabetic(b) && Character.isDigit(c))
                f = ob.pow(st,i);

            else if(Character.isAlphabetic(a) && Character.isAlphabetic(b) && Character.isAlphabetic(c)) {
                int j=i; String temp=""; char k;
                do
                {
                     k=st.charAt(j);
                    temp+=""+k;
                    j++;
                }while (Character.isAlphabetic(k) || Character.isDigit(k));
                temp+=""+st.charAt(j)+""+st.charAt(j+1);
                f = ob.trig(temp,j);
            }
            i += f;
        }*/
        System.out.println(nst);
    }
    public static void pow( String a,String b,String c) // ex-3x2 diff- 12x1
    {
        int n=Integer.parseInt(a)*Integer.parseInt(c);
        c+=""+(Integer.parseInt(c)-1);// decreasing the power by 1
        String ns=n+b+c;
        nst+="/t"+ns;
        // return ns.length();
      /*  char c=st1.charAt(p);
        char s=st1.charAt(p+1);
        String n1 =""+((int) c-48) * ((int) (st1.charAt(p + 2))-48) +""+s + ((int) (st1.charAt(p + 2))-48-1);
        nst+=n1;
        return n1.length();*/

    }
    public static void trig(String a,String b,String c)
    {
        String ns="";
        //int j=0;
        //char i=b.charAt(j);
        //int n=(int)i-48;
        if(Integer.parseInt(c)==1)
        {
            if (b.equalsIgnoreCase("sin@"))
                ns+=a+"cos@"+c;
            else if (b.equalsIgnoreCase("cos@"))
                ns+=a+"(-sin@)"+c;
            else if (b.equalsIgnoreCase("tan@"))
                ns+=a+"sec@2"+c;
            else if (b.equalsIgnoreCase("cosec@"))
                ns+=a+"(-cosec@cot@)"+c;
            else if (b.equalsIgnoreCase("sec@"))
                ns+=a+"sec@tan@"+c;
            else if (b.equalsIgnoreCase("cot@"))
                ns+=a+"(-cosec@2)"+c;
            nst+="/t"+ns;
            // return ns.length();
        }
        else {
            pow(a,b,c);
            // return r;
        }
    }
    public static void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Equation");
        st=sc.next() +" ";
        l=st.length();

    }
}