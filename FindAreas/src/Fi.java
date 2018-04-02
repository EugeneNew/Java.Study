
//  Применение  полиморфизма  во  время  выполнения

abstract class  Figure { 
 double  diml; 
 double  dim2;

Figure(double а,double b) { 
 diml = а; 
 dim2 = b; 
} 

abstract double area();

}

class Rectangle extends Figure{ 
      Rectangle(double a, double b){ 
        super(a,b);
      }      
// переопределить  метод area() для четырехугольника 
     double area(){ 
       System.out.println("B области  четырехугольника." ); 
       return  diml*dim2;
     }  
} 
class Triangle extends Figure{ 
   Triangle(double а,double b){ 
     super(а,b);
   }
   
//  переопределить метод  area ()  для  прямоугольного  треугольника 
   double area(){ 
     System.out.println(" B  области  треугольника ." ); 
     return  diml*dim2/2;
   }
}   
   
class  FindAreas  { 
    public static void main(String args[]){ 
       // Figure f = new Figure(10,10); 
        Rectangle r = new Rectangle(9,5); 
        Triangle t = new Triangle (10,8); 
        Figure figref; 
        figref = r; 
        System.out.println(" Плoщaдь равна " + figref.area());
        System.out.println(figref.toString());
        figref = t; 
        System.out.println(" Плoщaдь равна "+ figref.area());
        System.out.println(figref.toString());
      //  figref = f; 
      //  System.out.println(" Плoщaдь равна "+ figref.area());
    }
}