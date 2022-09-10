import java.util.Scanner;
class Complex {
	int real, img;

	void setParams(int a, int b) {
		real = a;
		img = b;
	}

	void display() {

		if(img < 0)
			System.out.println(real+" - "+Math.abs(img)+"i");
		else
			System.out.println(real+" + "+img+"i");
	}

	Complex add(Complex a, Complex b) {

		Complex result = new Complex();
		result.real = a.real + b.real;
		result.img = a.img + b.img;

		return result;
	}

	Complex subtract(Complex a, Complex b) {

		Complex result = new Complex();
		result.real = a.real - b.real;
		result.img = a.img - b.img;

		return result;
	}

}

class ComplexDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Complex a = new Complex();
		Complex b = new Complex();
		Complex result = new Complex();

		System.out.println("Enter the real part and imaginary part of complex number1: ");
		int real = sc.nextInt();
		int img = sc.nextInt();
		a.setParams(real,img);

		System.out.println("Enter the real part and imaginary part of complex number2: ");
		real = sc.nextInt();
		img = sc.nextInt();
		b.setParams(real,img);

		result = result.add(a,b);
		result.display();
		
		result = result.subtract(a,b);
		result.display();


	}
}
