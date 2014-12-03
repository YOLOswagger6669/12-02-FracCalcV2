// Write a class called RationalNumber that represents a fraction with an integer numerator and denominator
public class RationalNumber
{
  int num;
  int denom;
  public RationalNumber()
  {
    num=0;
    denom=1;
  }
  public RationalNumber(int numIn,int denomIn)
  {
    num = numIn;
    denom = denomIn;
    if(denom==0)
    {
      denom=1;
    }
  }
  public int greatestCommonDivisor(int first, int second) 
  {
    int temp;
    while (second != 0) 
    {
      temp = second;
      second = first % second;
      first = temp;
    }        
    return first;
  }
  public void add(RationalNumber frac)
  {
    num=num*frac.denom+denom*frac.num;
    denom=denom*frac.denom;
  }
  public void subtract(RationalNumber frac)
  {
    num=num*frac.denom-denom*frac.num;
    denom=denom*frac.denom;
  }
  public void multiply(RationalNumber frac)
  {
    num=num*frac.num;
    denom=denom*frac.denom;
  }
  public void divide(RationalNumber frac)
  {
    num=num*frac.denom;
    denom=denom*frac.num;
  }
  public int getDenominator()
  {
    return denom;
  }
  public int getNumerator()
  {
    return num;
  }
  public String toString()
  {
    String a;
    int gcd=greatestCommonDivisor(num,denom);
    num=num/gcd;
    denom=denom/gcd;
    if(denom==1)
    {
      a=Integer.toString(num);
    }
    else
    {
      a=num+"/"+denom;
    }
    return a;
  }
}
