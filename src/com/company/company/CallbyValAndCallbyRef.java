package company;

public class CallbyValAndCallbyRef {
    int p; //Global variables
    int q;

    public static void main(String[] args) {
        CallbyValAndCallbyRef obj = new CallbyValAndCallbyRef();
        int x = 10;
        int y = 20;
        obj.test(x, y); //Call by Value OR pass by value -- copy of x,y values are passed to a,b

        obj.p=10;
        obj.q=20;
        obj.swap(obj); //obj as reference -  when called values swapped
        //after swap
        System.out.println(obj.p);
        System.out.println(obj.q);

    }

    public int test(int a, int b) {
        a = 30; //but we changed values
        b = 80;
        int c = a + b; //above values will be considered i.e. 30---80
        return c;
    }
    //Call by ref
    //We are passing value of object reference -- Call by Reference
    //Is CBR possible in Java? -- yes by using object references

    public void swap(CallbyValAndCallbyRef t) {
        int temp;
        temp=t.p; //temp=10
        t.p=t.q; //p=20
        t.q=temp; //q=10

    }

}
