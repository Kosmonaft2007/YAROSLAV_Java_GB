package src.seminars.Kata.Block_2;

import java.util.Objects;

public class Ex_2_1_10 {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
    }
}
  class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

      @Override
      public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          ComplexNumber that = (ComplexNumber) o;
          return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
      }

      @Override
      public int hashCode() {
          return Objects.hash(re, im);
      }
  }
