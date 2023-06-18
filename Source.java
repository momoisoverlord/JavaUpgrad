import java.util.Scanner;

class Number {
    private double realPart;
    private double imaginaryPart;

    public Number(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
}

class Complex extends Number {
    public Complex(double realPart, double imaginaryPart) {
        super(realPart, imaginaryPart);
    }

    public void checkComplex() {
        if (getImaginaryPart() != 0) {
            System.out.println("The given number is complex");
        } else {
            System.out.println("The given number is real");
        }
    }

    public String getComplexNumberFormat() {
        return getRealPart() + "+i" + getImaginaryPart();
    }
}

class PurelyImaginary extends Complex {
    public PurelyImaginary(double realPart, double imaginaryPart) {
        super(realPart, imaginaryPart);
    }

    public void checkPurelyImaginaryNumber() {
        if (getRealPart() == 0.0 && getImaginaryPart() != 0.0) {
            System.out.println("The number is purely imaginary");
        } else {
            System.out.println("The number is not purely imaginary");
        }
    }

    @Override
    public String getComplexNumberFormat() {
        if (getRealPart() == 0.0 && getImaginaryPart() != 0.0) {
            return "i" + getImaginaryPart();
        } else {
            return super.getComplexNumberFormat();
        }
    }
}

public class Source {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double realPart = in.nextDouble();
        double imaginaryPart = in.nextDouble();

        PurelyImaginary num = new PurelyImaginary(realPart, imaginaryPart);
        System.out.println(num.getImaginaryPart());
        num.checkComplex();
        System.out.println(num.getComplexNumberFormat());
        num.checkPurelyImaginaryNumber();
    }
}
