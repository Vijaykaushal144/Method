public class First {
    int  code(int x, int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) {
            int a=19, b=23;
        First sc=new First();
        System.out.println(sc.code(a,b));

    }
}
