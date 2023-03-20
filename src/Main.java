import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      ArrayList<SimpleGeometricObject> figurer=new ArrayList<>();
      CircleFromSimpleGeometricObject c1=new CircleFromSimpleGeometricObject(5);
      CircleFromSimpleGeometricObject c2=new CircleFromSimpleGeometricObject(10);
      CircleFromSimpleGeometricObject c3=new CircleFromSimpleGeometricObject(15);
      RectangleFromSimpleGeometricObject r1=new RectangleFromSimpleGeometricObject(5,10);
      RectangleFromSimpleGeometricObject r2=new RectangleFromSimpleGeometricObject(4,6);
      RectangleFromSimpleGeometricObject r3=new RectangleFromSimpleGeometricObject(1,7);
      figurer.add(c1);
      figurer.add(c2);
      figurer.add(c3);
      figurer.add(r1);
      figurer.add(r2);
      figurer.add(r3);
      for(SimpleGeometricObject o:figurer)
        System.out.println(o);
    }
}