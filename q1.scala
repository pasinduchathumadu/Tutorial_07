object q1 extends App{
    var obj = new Rational(1,4)
    var obj1 = new Rational(2,5)
    println(obj.neg)
    var r = obj.add(obj1)
    println(r)

}

class Rational(a:Int,b:Int){

    require(denom > 0, "Denominator must be greater than 0")
    def numer = a
    def denom = b

    def neg=new Rational(-this.numer,this.denom)
    def add(r:Rational)=new Rational(r.denom*this.numer+r.numer*this.denom,this.denom*r.denom)

    override def toString(): String = numer + "/"+denom
}