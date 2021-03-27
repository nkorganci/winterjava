package day25overridingexceptions_36;

public class P01_Socrative37 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
/*
public class Test2 {

	String str = "a";

	void A() {

		try {

			str = str + "b";

			B();

		} catch (Exception e) {

			str = str + "c";

		}

	 }

	void B() throws Exception {

		try {

			str = str + "d";

			C();

		} catch (Exception e) {

			str = str + "e";

		} finally {

			str = str + "f";

		}

		str = str + "g";

	}

	void C() throws Exception {

		System.out.println(12/0);

	}

	void display() {

		System.out.println(str);

	}

	public static void main(String[] args) {

		Test2 object = new Test2();

		object.A();

		object.display();

	}

}
 */
    /*
    public static void main(String[] args) {

		FileInputStream f = new FileInputStream("src/day/TextFile");

		int i = 0;

		while ((i = f.read()) != -1) {

			System.out.print((char) i);

		}

		f.close();

}
     */
    /*
    public static void main(String[] args) {

		try {

		   FileInputStream f = new FileInputStream("src/daypackage/TextFile");

		   int i = 0;

			while ((i = f.read()) != -1) {

				System.out.print((char) i);

			}

			f.close();

		} catch(FileNotFoundException e) {

			System.out.println("Most probably path is wrong or someone deleted my file");

		} catch(IOException e) {

			System.out.println("Text could not be read or the file could not be closed");

	  } finally {

			System.out.println("Do not forget to close the file!");

	  }

}
     */
    /*
    public static void main(String[] args) {

		  try {

		   FileInputStream f = new FileInputStream("src/daypackage/TextFile");

		} catch(FileNotFoundException e) {

			System.out.println("Good");

		} catch(IOException e) {

			System.out.println("Bad");

		} finally {

			System.out.println("Not bad");

	   }

	}
     */

}

//day29

class A {
public static void main(String[] args) {

        try {

        run();

        } catch (Exception e) {

        System.out.println(e.getMessage());

        }

        }

private static void run() {

        throw new RuntimeException("Run more");

        }
        }

class B {

    public static void main(String[] args) {

        Integer z = 0;

        try {

            String s = "1234";

            z = Integer.parseInt(s);

        }catch(NumberFormatException e) {

            System.out.println(e);

        }

        System.out.println(z);

    }

}
class C{
    public static void main(String[] args) {

        try {

            m(9);

        }catch(IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

    }

    public static void m(int x) {

        if(x<0 || x>9) {

            throw new IllegalArgumentException("Good");

        }else {

            System.out.println(x);

        }

    }
}






