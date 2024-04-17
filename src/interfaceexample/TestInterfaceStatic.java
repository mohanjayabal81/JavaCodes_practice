package interfaceexample;

interface Drawable1{  
void draw();  
static int cube(int x){return x*x*x;}  
}  
class Rectangle1 implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
  
class TestInterfaceStatic{  
public static void main(String args[]){  
Drawable d=new Rectangle();  
d.draw();  
System.out.println(Drawable1.cube(3));  
}}  