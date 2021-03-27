package company;

public class ThisKeyword {
    public static void main(String[] args) {
////       Array using FOR loop
//        Scanner input= new Scanner(System.in);
//        int n=input.nextInt();
//        int arr[];
//        arr= new int[n];
//        for(int i=0;i<n;i++)
//        {
//            int x= input.nextInt();
//            arr[i]=x;
//        }
//        System.out.println(arr.length);
//    }

        Student s1=new Student("Karan",1056, 8);
       s1.displayProfile();
        System.out.println("Percentage of "+ s1.name+" is"+ " "+ s1.findPercentage());


    }
}

class Student {
    public int rollno;
    public String name;
    public double cgpa;

    // Declare constructor of 'Student' class here
    public Student(String name,int rollno,double cgpa)
    {
        this.name=name;
        this.rollno=rollno;
        this.cgpa=cgpa;
    }

    public void displayProfile() {
        System.out.println(rollno + " " + name + " " + cgpa);
       //return 0;
    }
    public double findPercentage() {
        double percent = cgpa * 10;
        return percent;
    }
}
