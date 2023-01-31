import java.util.Scanner;
class Getset
{
     int Roll_no ;
     String Name ;
     double Physics, Chemistry , Maths, Percentage = ((Physics + Chemistry + Maths )/300)*100;
    public void setRoll(int roll)
    {
        Roll_no = roll;
    }
    public int getRoll()
    {
        return Roll_no;
    }
    public void setName(String na)
    {
        Name = na;
    }
    public String getName()
    {
        return Name;
    }
    public void setPhysics(double phy)
    {
        Physics = phy;
    }
    public double getPhysics()
    {
        return Physics;
    }
    public void setChemistry(double chem)
    {
        Chemistry = chem;
    }
    public double getChemistry()
    {
        return Chemistry;
    }
    public void setMaths(double mth)
    {
        Maths = mth;
    }
    public double getMaths()
    {
        return Maths;
    }
    public void setPercentage(double per)
    {
        Percentage = per;
    }
    public double getPercentage()
 {
        return Percentage;
    }
 }
class Student
{
    Getset Gs[];
     int choice,s , i;
     Scanner sc = new Scanner(System.in);
    void menu()
    {
        System.out.println("1. Add Student Details");
        System.out.println("2. Show Student Details");
        
        System.out.println("Enter the Choice");
        choice = Integer.parseInt(sc.nextLine());
        switch(choice)
        {
            case 1 :
                AddStud();
                break;
            case 2 :
            	ShowStud();
                break;
            default :
            	System.out.println("put the Valid option");
            	menu();
        }
    }
        void AddStud()
        { 
            int roll_no,no;
            String name;
            double physics, chemistry, maths,percentage;
            System.out.println("Enter the No. of Student");
            no = Integer.parseInt(sc.nextLine());
            Gs = new Getset[no];
            
            for(i =0; i<Gs.length ; i++)
            {
            	Gs[i]=new Getset();     
            System.out.println("Enter the Roll No. of Student");
            roll_no = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the Student Name");
            name = sc.nextLine();
            System.out.println("Enter the Physics Marks");
            physics = Double.parseDouble(sc.nextLine());
            System.out.println("Enter the Chemistry Marks");
            chemistry = Double.parseDouble(sc.nextLine());
            System.out.println("Enter the Maths Marks");
            maths = Double.parseDouble(sc.nextLine());
            percentage = ((physics + chemistry + maths)/300)*100;
            
            
            Gs[i].setRoll(roll_no);
            Gs[i].setName(name);
            Gs[i].setPhysics(physics);
            Gs[i].setChemistry(chemistry);
            Gs[i].setMaths(maths);
            Gs[i].setPercentage(percentage);
             
        
              }menu();
          
        }
    
       void ShowStud()
        {
            System.out.println("Sr no . "+"\t\tName "+"\t\tRoll no. "+"\tPhysics "+"\tChemistry "+"\tMaths "+"\tPercentage");
        for(i =0; i<Gs.length ; i++)
        {
            System.out.println(Gs[i].getRoll()+"\t\t\t "+Gs[i].getName()+"\t\t"+Gs[i].getPhysics()+"\t\t"+Gs[i].getChemistry()+"\t\t"+Gs[i].getMaths()+"\t\t"+Gs[i].getPercentage());
        }
}

}

class Rishabh {
public static void main(String[] args) {
    System.out.println("Hello, World!"); 
   Student st1 = new Student();
   st1.menu();
    }
}
