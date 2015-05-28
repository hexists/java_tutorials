import java.io.*;
import java.util.*;

public class ShadowStaticTest {

    public int x = 0;

    static class FirstLevel {

      public int x = 1;

      void methodInFirstLevel(int x) {
				System.out.println(this);
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
      }
    }

    public static void main(String... args) {
      ShadowStaticTest st = new ShadowStaticTest();

			List<ShadowStaticTest.FirstLevel> flList = new ArrayList<ShadowStaticTest.FirstLevel>();

			flList.add( new ShadowStaticTest.FirstLevel() );
			flList.add( new ShadowStaticTest.FirstLevel() );
			flList.add( new ShadowStaticTest.FirstLevel() );
			flList.add( new ShadowStaticTest.FirstLevel() );
			flList.add( new ShadowStaticTest.FirstLevel() );

			for (ShadowStaticTest.FirstLevel fl: flList) {
				fl.methodInFirstLevel(23);
			}
    }
}
