import java.util.*;
class SnacksDetails{
    public static void main(String[] args){
        int pi,puff,co;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        pi=sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        puff=sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        co = sc.nextInt();
        int Total;
        Total = (100*pi)+(20*puff)+(10*co);
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pi);
        System.out.println("No of puffs:"+puff);
        System.out.println("No of cooldrinks:"+co);
        System.out.println("Total price="+Total);
        System.out.println("ENJOY THE SHOW!!!");
    }
}