import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       System.out.print("Welcome to Acciojob Pizza hub \n");
       System.out.println("Do you want to enjoy our Pizza \n if yes press 1 or 0 for No");
       Scanner sc =new Scanner(System.in);
       int option  =sc.nextInt();
       if(option==0){
           System.out.println("Thanks for visiting us please come again");
       }
        else{
            System.out.println("How many Pizza do you want to Order");
            int Order_Number =sc.nextInt();
            ArrayList<Pizza> pizza_order =new ArrayList<>();
            for(int i =0;i<Order_Number;i++){
                System.out.println("Are you looking for Non Veg pizza? if yes press 1 or 0 for veg");
                int isVeg =sc.nextInt();
               Boolean Veg =false;
                if(isVeg==0){
                    Veg=true;
                }
                    System.out.println("What size do you preferred? press\n0:small\n1:medium\n2:large");
                    int size =sc.nextInt();
                    Pizza pizza =new Pizza(Veg ,size);
                    System.out.println("Do you want Extra Toppings ? yes:1 or no :0");
                    int ExtraTopping =sc.nextInt();
                    if(ExtraTopping==1){
                        pizza.addExtraTopings();

                    }
                    System.out.println("Do you want Extra cheese ? yes:1 or no :0");
                    int cheese =sc.nextInt();
                    if(cheese==1){
                        pizza.addExtraCheese();
                    }
                    System.out.println("Do you want TakeAway ? yes:1 or no :0");
                    int Bag =sc.nextInt();
                    if(Bag==1){
                        pizza.addTakeAwayBag();
                    }
                    pizza_order.add(pizza);

            }
            String TotalBill ="";
            int Total =0;
            for(int i =0;i<Order_Number;i++){
                Pizza local_pizza =pizza_order.get(i);
                TotalBill+=local_pizza.getbill();
                Total +=local_pizza.getTotal();
            }
            TotalBill +="Your grand total for your order is "+Total+"/-"+"\n";
            System.out.println(TotalBill+"press 1:conform your order \npress 0 :cancel your order ");
            int final4 =sc.nextInt();
            if(final4==1){
                System.out.println("Your Order have been  placed.");
           }else{
                System.out.println("You have canceled your order.");
           }
       }


    }
}