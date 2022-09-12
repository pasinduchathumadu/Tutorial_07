object q3 extends App{
    var x= new Rational(3,4)
    var y= new Rational(5,8)
    var z= new Rational(2,7)

    var answer = x - y - z
    println(answer)

}

class Rational(a:Int,b:Int){
    def numer = a
    def denom = b

    def neg = new Rational(-this.numer,this.denom)
    def add(r:Rational)=new Rational(r.numer*this.denom+r.denom*this.numer,this.denom*r.denom)

    def -(r1:Rational)=this.add(r1.neg)

     override def toString(): String = numer + "/"+denom

}