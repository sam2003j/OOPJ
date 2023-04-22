package oop1;
public class Complex {
	private double real;
	private double img;	
	public Complex() {
		real=0;
		img=0;
	}	
	public Complex(double real, double img) {
		this.real=real;
		this.img=img;
	}	
	public double getReal() {
        return real;
    }  
    public double getImaginary() {
        return img;
    }    
    public void setReal(double real) {
        this.real = real;
    }  
    public void setImaginary(double imaginary) {
        this.img = imaginary;
    }  
    public Complex add(Complex n) {
    	return new Complex(real+n.getReal(), img+n.getImaginary());
    }  
    public Complex subtract(Complex n) {
    	return new Complex(real-n.getReal(), img-n.getImaginary());
    }   
    public Complex multiply(Complex other) {
        double realPart = real * other.getReal() - img * other.getImaginary();
        double imaginaryPart = real * other.getImaginary() + img * other.getReal();
        return new Complex(realPart, imaginaryPart);
    }   
    public Complex divide(Complex other) {
        double denominator = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        double realPart = (real * other.getReal() + img * other.getImaginary()) / denominator;
        double imaginaryPart = (img * other.getReal() - real * other.getImaginary()) / denominator;
        return new Complex(realPart, imaginaryPart);
    }    
    public String toString() {
        if (img >= 0) {
            return real + " + " + img + "i";
        } else {
            return real + " - " + (-img) + "i";
        }
    } 
}
