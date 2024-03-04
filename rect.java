class Rectangle 
 { 
      double length; 
      double breadth; 
       //method to intialize length and breadth of rectangle 
       void setData(double l, double b) 
       {  
         length =l; 
         breadth=b; 
       } 
       //method to calculate area of rectangle 
       int area() 
       { 
         double rectArea; 
         rectArea = length * breadth; 
         return rectArea; 
       } 
 } 
 //Class to Create Rectangle Objects and Calculate Area 
 class rect
 { 
          public static void main(String[] args) 
      { 
            //Creating objects 
            Rectangle firstRect = new Rectangle(); 
            firstRect.setData(12.48,13); 
            int result = firstRect.area(); 
            System.out.println("Area of Rectangle = "+ result); 
      } 
 } 
