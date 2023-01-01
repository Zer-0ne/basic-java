package MyPackage;

public class Calculate {
    double height,width,depth,c,d; int a,b;
    public double volumn(double height, double width, double depth){
        this.depth = depth; this.height=height; this.width=width;
        return depth*height*width;
    }
    public int add(int a,int b){
        this.a=a; this.b=b;
        return a+b;
    }
    public double divide(double c,double d){
        this.c=c; this.d=d;
        return c/d;
    }
}
