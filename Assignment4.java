Que:1 Create a class rectangle & its data members functions and create a member function which display the area of rectangle?
Ans:1
package acadviewdemo;
public class Rectangle2 {
      public static void main(String args[]){
        Rectangle2 rectangle=new Rectangle2(4,5);
        rectangle.calculateArea();
    }
    double length;
    double width;
    Rectangle2(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public void calculateArea()
    {
        System.out.println("Araea is :"+length*width);
         }
}

Que:2 Create a class complex & its data members & create a member functions which display complex number?
Ans:2
package acadviewdemo1;
public class ComplexNumber {
    public static void main(String args[]){
        ComplexNumber complex=new ComplexNumber(8,5);
        complex.displayNumber();
    }
    int real;
    int imaginary;
    ComplexNumber(int a,int b)
    {
        this.real=a;
        this.imaginary=b;
    }
    public void displayNumber()
    {
        System.out.println("ComplexNumber is:"+real+"+i"+imaginary);
    }
    
    
    
}
    }
    
}

Que:4 W.A.P to print an array in a waveform?
Ans:4
package acadviewdemo1;
import java.util.Scanner;
public class ArrayWave {
    public static void main(String args[]){
        int temp;
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the elements of array=");
        int arr[]=new int [10];
        int j=1;
        int i;
        for(i=0;i<=9;i++)
        {
            arr[i]=num.nextInt();
        }
        for(i=0;i<arr.length;i+=2)
        {
            for( ;j<=9; )
            {
            temp=arr[i];        
            arr[i]=arr[j];
            arr[j]=temp;
            break;
        }
        j+=2;
    }
    for( i=0;i<=9;i++)
    System.out.print(arr[i]+"");
}

}

    
    

