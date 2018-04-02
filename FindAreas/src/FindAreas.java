//  Применение  полиморфизма  во  время  выполнения

class  Figure { 
 double  diml; 
 double  dim2;

Figure(double а,double b) { 
 diml = а; 
 dim2 = b; 
} 

double area(){ 
  System.out.println("Плoщaдь фигуры не определена."); 
  return 0; 
 }
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
   
//  переопределить  метод  area ()  для  прямоуг оль ного  треугольника 
   double area(){ 
     System.out.println(" B  области  треугольника ." ); 
     return  diml*dim2/2;
   }
}   
   
class  FindAreas  { 
    public static void main(String args[]){ 
        Figure f = new Figure(10,10); 
        Rectangle r = new Rectangle(9,5); 
        Triangle t = new Triangle (10,8); 
        Figure figref; 
        figref = r; 
        System.out.println(" Плoщaдь равна " + figref.area()); 
        figref = t; 
        System.out.println(" Плoщaдь равна "+ figref.area()); 
        figref = f; 
        System.out.println(" Плoщaдь равна "+ figref.area());
    }
}