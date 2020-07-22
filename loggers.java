import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class Interest
{ 
private static final Logger l=LogManager.getLogger(Main.class);
private int p,t;
private double r;
 
   public void setPrinciple(int p )
  
  {
      l.info("Entered into setPrinciple method");
      this.p=p ;
       l.info("Exited the setPrinciple method");
 
   }
 
   public void setRate(double r)
 
   {
 
  l.info("Entered into setRate method");     
  this.r=r;
  l.info("Exited the setRate method");

    }
  
  public void setTime(int t)
 
   {
     
    l.info("Entered into setTime method");
   this.t=t;
   l.info("Exited the setTime method");

    }
 
   public int getPrinciple()
 
   {
     l.info("Entered into getPrinciple method");
     return this.p;
     l.info("Exited the setPrinciple method");
   
 }

    public double getRate()
  
  {
         l.info("Entered into setRate method");
        return this.r;
        l.info("Exited the setRate method");

    }

    public int getTime()
 
   {
         l.info("Entered into getTime method");
        return this.t;
        l.info("Exited the getTime method");

    }

    public double simpleIntrest()

    {
         l.info("Entered into simpleIntrest method");
        return ((this.p)*(this.r)*(this.t))/100;
        l.info("Entered into setPrinciple method");
   
    }

    public double compoundInterest()

    {
        l.info("Entred into compoundIntrest method");
       return this.p*(Math.pow((1+this.r),this.t)-1);
       l.info("Entered into setPrinciple method");
    
    }

}
