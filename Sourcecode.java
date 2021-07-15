import java.util.*;
// a menu tye program
public class Lodha_Zaika//enter class
{
    public static void main(String as[])
    {
        Scanner in=new Scanner(System.in);
        int i,m=0,vstr,tvstr=0,nvstr,tnvstr=0,vfd,tvfd=0,nvfd,tnvfd=0,fd,tfd=0,amt=0,tamt=0,totalamt=0,d,totald=0,damt=0,ch;
        double vat=0;
        int conti=0,conti1=0;//initiallising variables
        String str="",ans,choice="Y";

     
        System.out.println("##          ##\t##############\t##############\t###############\t##            ");
        System.out.println("##          ##\t##############\t##############\t###############\t##            ");
        System.out.println("##          ##\t##          ##\t       ##     \t##             \t##            ");
        System.out.println("##          ##\t##          ##\t       ##     \t##             \t##            ");
        System.out.println("##          ##\t##          ##\t       ##     \t##             \t##            ");
        System.out.println("##############\t##          ##\t       ##     \t############## \t##            ");
        System.out.println("##############\t##          ##\t       ##     \t############## \t##            ");
        System.out.println("##          ##\t##          ##\t       ##     \t##             \t##            ");
        System.out.println("##          ##\t##          ##\t       ##     \t##             \t##            ");
        System.out.println("##          ##\t##          ##\t       ##     \t##             \t##            ");
        System.out.println("##          ##\t##############\t       ##     \t###############\t##############");
        System.out.println("##          ##\t##############\t       ##     \t###############\t##############");

        System.out.println(" Welcome to our Multi cuisine restaurant : LODHA ZAIKA!");
        do
        {
            conti1=0;
            System.out.println("Starters    : 1");
            System.out.println("Main course : 2");
            System.out.println("Desserts    : 3");
            System.out.println();
            System.out.println("Enter a choice from the above list to enjoy!");
            ch=in.nextInt();   
            System.out.print("Loading");
            for(i=0;i<1000000000;i++)
            {
                if(m==100000000)
                {
                    System.out.print(".");
                    m=0;
                }
                m++;
            }
            System.out.println();

            switch(ch)
            {
                case 1:
                do
                {
                    conti=0;
                    System.out.println("STARTERS");

                    System.out.println("Enter 'VS' to have a taste of our vegetarian delicacies ");
                    System.out.println("Enter 'NVS' to have a taste of our non-vegetarian delicacies ");
                    str=in.next();
                    System.out.print("Loading");
                    for(i=0;i<1000000000;i++)
                    {
                        if(m==100000000)
                        {
                            System.out.print(".");
                            m=0;
                        }
                        m++;
                    }
                    System.out.println();

                    if(str.equalsIgnoreCase("VS"))
                    {//veg starters menu
                        System.out.println("|-------------------------------|");
                        System.out.println("|        VEGETARIAN STARTERS    |");
                        System.out.println("|-------------------------------|");
                        System.out.println("    Delicacy                                \t\t\t Price(in Rs)");
                        System.out.println("1.  MOROCCAN CHICKPEA SOUP                  \t\t\t 1100");
                        System.out.println("2.  RAVIOLI WITH SQUASH AND CRUNCHY CRUMBS  \t\t\t 1100");
                        System.out.println("3.  BAKED STUFFED ROMANO PEPPERS            \t\t\t 1100");
                        System.out.println("4.  WILD MUSHROOM TARTLETS                  \t\t\t 1300");
                        System.out.println("5.  HONEYED WINTER SALAD                    \t\t\t 1300");
                        System.out.println("6.  MEXICAN BEAN SALAD                      \t\t\t 1300");
                        System.out.println("7.  STUFFED COURGETTE ROLLS                 \t\t\t 1400");
                        System.out.println("8.  SPICY ROASTED PARNSNIP SOUP             \t\t\t 1400");
                        System.out.println("9.  SEEDED FLATBREADS                       \t\t\t 1400");
                        System.out.println("10. CRISPY AMERICAN CORN                    \t\t\t 1400");
                        System.out.println();
                        choice="Y";
                        while(choice.equalsIgnoreCase("Y"))
                        {
                            {
                                System.out.println("To have a great start choose your starter from the above delicacy by entering the number");
                                vstr=in.nextInt();
                                System.out.println("Enter the total number of starters you wish to have");
                                tvstr=in.nextInt();
                                if(vstr==1 || vstr<=3)
                                    amt=tvstr*1100;
                                if(vstr==4 ||vstr==5|| vstr==6)
                                    amt=tvstr*1300;
                                if(vstr>=7)
                                    amt=tvstr*1400;
                            }
                            tamt=tamt+amt;
                            System.out.println("Do you want to place order of a different type of starter press 'y'");
                            System.out.println("If you want to have the same choice of yours again press 'n'");
                            System.out.println("If you want to Exit the current cuisine type'Main'");
                            choice=in.next();
                            System.out.print("Loading  ");
                            for(i=0;i<1000000000;i++)
                            {
                                if(m==100000000)
                                {
                                    System.out.print(".");
                                    m=0;
                                }
                                m++;
                            }
                            System.out.println();

                        }
                        if(choice.equalsIgnoreCase("n"))
                        {
                            conti=1;
                        }
                    }
                    if(str.equalsIgnoreCase("NVS"))
                    {// non veg starters menu
                        System.out.println("|-------------------------------|");
                        System.out.println("|   NON-VEGETARIAN STARTERS     |");
                        System.out.println("|-------------------------------|");
                        System.out.println("   DELICACY                                \t\t\t Price(in Rs)");
                        System.out.println("1. CORNFLAKES CRUSTED CHICKEN NUGGETS      \t\t\t 1500");
                        System.out.println("2. CHICKEN CHEESE POPS                     \t\t\t 1500");
                        System.out.println("3. BARLEY AND CHICKEN NUGGETS              \t\t\t 1500");
                        System.out.println("4. DUMDAR PRAWNS                           \t\t\t 1700");
                        System.out.println("5. CREAMY CHICKEN TOAST                    \t\t\t 1700");
                        System.out.println("6. CHICKEN VAL-AU-VENT                     \t\t\t 1700");
                        System.out.println("7. CHICKEN LOLLYPOP                        \t\t\t 1800");
                        System.out.println("8. POLENTA PESTO CHICKEN                   \t\t\t 1800");
                        System.out.println("9. CRISPY BARBEQUE CHICKEN                 \t\t\t 1800");
                        System.out.println("10.CHICKEN LAZONE                          \t\t\t 1800");
                        System.out.println();
                        choice="Y";
                        while(choice.equalsIgnoreCase("Y"))
                        {

                            System.out.println("Choose your starter from the above  delicacy by entering the number");
                            nvstr=in.nextInt();
                            System.out.println("Enter the total number of starters you want");
                            tnvstr=in.nextInt();
                            if(nvstr==1||nvstr<=3)
                                amt=tnvstr*1500;
                            if(nvstr==4||nvstr==5|| nvstr==6)
                                amt=tnvstr*1700;
                            if(nvstr>=7 )
                                amt=tnvstr*1800;
                            tamt=tamt+amt;
                            System.out.println("Do you want to place order of a different type of food press 'y");
                            System.out.println("If you want to have the same choice of yours again press 'n'");
                            System.out.println("If you want to Exit the current cuisine type'Main'");
                            choice=in.next();
                        }
                        if(choice.equalsIgnoreCase("n"))
                        {
                            conti=1;
                        }

                    }
                }while(conti==1);

                break;

                case 2:
                do
                {
                    conti=0;
                    System.out.println("Main Course:Indian and Chinese Dishes!");
                    System.out.println("Enter 'V' to have a taste of our  Indian Veg Dishes");
                    System.out.println("Enter 'NV' to have a taste of our non-vegetarian Indian main course dishes ");
                    System.out.println("Enter 'C' to have a taste of our chinese dishes ");
                    str=in.next();
                    System.out.print("Loading");
                    for(i=0;i<1000000000;i++)
                    {
                        if(m==100000000)
                        {
                            System.out.print(".");
                            m=0;
                        }
                        m++;
                    }
                    System.out.println();

                    if(str.equalsIgnoreCase("V"))
                    {// vegtarian maincourse menu
                        System.out.println("|-------------------------------|");
                        System.out.println("| INDIAN VEGETARIAN MAIN COURSE |");
                        System.out.println("|-------------------------------|");
                        System.out.println("    DELICACY                    \t\t\t Price(in Rs)");
                        System.out.println("1.  DAHI KI SABZI               \t\t\t1800");
                        System.out.println("2.  BHINDI KI SABZI             \t\t\t1800");
                        System.out.println("3.  ALOO KI SABZI               \t\t\t1500");
                        System.out.println("4.  GREEN PEA MASH              \t\t\t1400");
                        System.out.println("5.  GARLIC GRILLED TOMATOES     \t\t\t1400");
                        System.out.println("6.  FRENCH BEANS WITH MOONG DAL \t\t\t1400");
                        System.out.println("7.  CREAMY MUSHROOM             \t\t\t1500");
                        System.out.println("8.  CHOLE CHANNA DAL            \t\t\t1500");
                        System.out.println("9.  CHILLI PANEER               \t\t\t1100");
                        System.out.println("10. TITORI                      \t\t\t1400");
                        System.out.println("11. ANANAS MENSKAI              \t\t\t400");
                        System.out.println("12. SHAHI PANNER                \t\t\t600");
                        choice="Y";
                        while(choice.equalsIgnoreCase("Y"))
                        {
                            System.out.println("Choose your Main Veg Course from the delicacy by entering number:");
                            vfd=in.nextInt();
                            System.out.println("How many plates do you want to place from the above delicacy?");
                            tvfd=in.nextInt();
                            if(vfd==1||vfd==2)
                                amt=tvfd*1800;
                            if(vfd==3)
                                amt=tvfd*1500;
                            if(vfd==4||vfd==5||vfd==6)
                                amt=tvfd*1400;
                            if(vfd==7||vfd==8)
                                amt=tvfd*1500;
                            if(vfd==9)
                                amt=tvfd*1100;
                            if(vfd==10)
                                amt=tvfd*140;
                            if(vfd==11)
                                amt=tvfd*400;
                            if(vfd==12)
                                amt=tvfd*600;
                            tamt=tamt+amt;
                            System.out.println("Do you want to place order of a different type of food press 'y'");
                            System.out.println("if you want to have the same choice of yours again press 'n'");
                            System.out.println("IF you want to Exit the current cuisine type'Main'");
                            choice=in.next();
                            System.out.print("Loading");
                            for(i=0;i<1000000000;i++)
                            {
                                if(m==100000000)
                                {
                                    System.out.print(".");
                                    m=0;
                                }
                                m++;
                            }
                            System.out.println();

                        }
                        if(choice.equalsIgnoreCase("n"))
                        {
                            conti=1;
                        }
                    }

                    if(str.equalsIgnoreCase("NV"))
                    {//non veg main course menu
                        System.out.println("|-----------------------------------|");
                        System.out.println("| INDIAN NON-VEGEARIAN MAIN COURSE  |");
                        System.out.println("|-----------------------------------|");
                        System.out.println("    DELICACY                              \t\t\t: Price(in Rs.)");
                        System.out.println("1.  EGG FRIED QUINOA                      \t\t\t1800");
                        System.out.println("2.  BAKED EGGS                            \t\t\t1800");
                        System.out.println("3.  HOT GARLIC EGGS                       \t\t\t1500");
                        System.out.println("4.  GRILLED TAWA FISH                     \t\t\t600");
                        System.out.println("5.  CABBAGE PRAWNS                        \t\t\t1600");
                        System.out.println("6.  BRAISED CHICKEN WITH WALNUTS          \t\t\t1600");
                        System.out.println("7.  CHICKEN CURRY                         \t\t\t1700");
                        System.out.println("8.  CHARGRILLED CHICKEN WITH THYME        \t\t\t1700");
                        System.out.println("9.  GRILLED CHICKEN WITH PINEAPPLE SALSA  \t\t\t1900");
                        System.out.println("10. CHICKEN IN PRUNE SAUCE                \t\t\t1900");
                        System.out.println("11. CHICKEN AND PEPPER STIR FRY           \t\t\t1400");
                        System.out.println("12. BANJARA GOSHT                         \t\t\t1600");
                        choice="Y";
                        while(choice.equalsIgnoreCase("Y"))
                        {
                            System.out.println("Choose your Main Non-Veg Course from the delicacy by entering number:");
                            vfd=in.nextInt();
                            System.out.println("how many plates do you want to place from the above delicacy?");
                            tvfd=in.nextInt();
                            if(vfd==1||vfd==2)
                                amt=tvfd*1800;
                            if(vfd==3)
                                amt=tvfd*1500;
                            if(vfd==4||vfd==5||vfd==6)
                                amt=tvfd*1600;
                            if(vfd==7||vfd==8)
                                amt=tvfd*1700;
                            if(vfd==9||vfd==10)
                                amt=tvfd*1900;
                            if(vfd==11)
                                amt=tvfd*1400;
                            if(vfd==12)
                                amt=tvfd*1600;
                            tamt=tamt+amt;
                            System.out.println("Do you want to place order of a different type of food press 'y'");
                            System.out.println("if you want to have the same choice of yours again press 'n'");
                            System.out.println("IF you want to exit the current cuisine type'Main'");
                            choice=in.next();
                            System.out.print("Loading");
                            for(i=0;i<1000000000;i++)
                            {
                                if(m==100000000)
                                {
                                    System.out.print(".");
                                    m=0;
                                }
                                m++;
                            }
                            System.out.println(); 

                        }
                        if(choice.equalsIgnoreCase("n"))
                        {
                            conti=1;
                        }
                    }

                    if(str.equalsIgnoreCase("C"))
                    {//chinese menu
                        System.out.println("|-------------------------------|");
                        System.out.println("|     CHINESE MAIN COURSE       | ");
                        System.out.println("|-------------------------------|");
                        System.out.println("   DELICACY                                     \t\t\t Price(in Rs.)");
                        System.out.println("1. GENERAL TSO'S CHICKEN                        \t\t\t 2400");
                        System.out.println("2. TOFU                                         \t\t\t 2800");
                        System.out.println("3. LAMB SKEWERS WITH CUMIN                      \t\t\t 2800");
                        System.out.println("4. BLACK PEPPER TOFU                            \t\t\t 2100");
                        System.out.println("5. BLACK PEPPER AND SHRIMP FRIED RICE           \t\t\t 2100");
                        System.out.println("6. GARLIC BLACK BEAN PORK FRIED RICE            \t\t\t 1900");
                        System.out.println("7. GRILLED CHICKEN AND BIBB LETTUCE             \t\t\t 1900");
                        System.out.println("8. PORK STIR FRY WITH BABY CHOY AND CASHEWS     \t\t\t 1900");
                        System.out.println("9. CLASSIC SESAME NOODLES                       \t\t\t 2400");
                        System.out.println("10. SAUSAGE AND BROCCOLI WITH OYSTER SAUCE      \t\t\t 2100");
                        System.out.println("11. CLASSIC DRY FRIED PEPPER AND SALT SHRIMP    \t\t\t 2100");
                        System.out.println("12. RED COOKED PORK SHOULDER AND CHESTNUTS      \t\t\t 2100");
                        choice="Y";
                        while(choice.equalsIgnoreCase("Y"))
                        {
                            System.out.println("Choose your main course from the above delicacy by entering number");
                            fd=in.nextInt();
                            System.out.println("How many plates do you want to place from the above delicacy?");
                            tfd=in.nextInt();
                            if(fd==1)
                                amt=tfd*2400;
                            if(fd==2||fd==3)
                                amt=tfd*2800;
                            if(fd==4||fd==5)
                                amt=tfd*2100;
                            if(fd==6||fd==7||fd==8)
                                amt=tfd*1900;
                            if(fd==9)
                                amt=tfd*2400;
                            if(fd==10||fd==11||fd==12)
                                amt=tfd*2400;
                            tamt=tamt+amt;
                            System.out.println("Do you want to place order of a different type of food press 'y'");
                            System.out.println("if you want to have the same choice of yours again press 'n'");
                            System.out.println("IF you want to Exit the current cuisine type'Main'");
                            choice=in.next();
                            System.out.print("Loading");
                            for(i=0;i<1000000000;i++)
                            {
                                if(m==100000000)
                                {
                                    System.out.print(".");
                                    m=0;
                                }
                                m++;
                            }
                            System.out.println();

                        }
                        if(choice.equalsIgnoreCase("n"))
                        {
                            conti=1;
                        }
                    }
                }while(conti==1);
                System.out.println();
                break;

                case 3:
                do// Desert menu
                {
                    conti=0;
                    System.out.println("|-------------------------------|");
                    System.out.println("|              DESSERTS         | ");
                    System.out.println("|-------------------------------|");
                    System.out.println("   DELICACY                           \t\t\t Price(in Rs.)");
                    System.out.println("1. WALNUT BAKLAVA                     \t\t\t 1100");
                    System.out.println("2. CHOCO BITE ICE CREAM               \t\t\t 1100");
                    System.out.println("3. BASIC SPONGE CAKE                  \t\t\t 1900");
                    System.out.println("4. CHOCOLATE STUFFED WITH PEDHA       \t\t\t 1900");
                    System.out.println("5. SANTRA BASUNDI                     \t\t\t 1700");
                    System.out.println("6. COCONUT BARFI                      \t\t\t 2900");
                    System.out.println("7. ATTA BESAN LADDOO                  \t\t\t 2900");
                    System.out.println("8. PEANUT AND DRY FRUIT LADDOO        \t\t\t 2800");
                    System.out.println("9. TIL AND DRY FRUITS LADDOO          \t\t\t 2800");
                    System.out.println("10. DRY FRUIT SHRIKHAND               \t\t\t 2800");
                    choice="Y";
                    while(choice.equalsIgnoreCase("Y"))
                    {
                        System.out.println("To melt your burning mouth,choose your desert by entering the number!");
                        d=in.nextInt();
                        System.out.println("Enter the total number of items you want to buy!");
                        totald=in.nextInt();
                        if(d==1||d==2)
                            damt=totald*1100;
                        if(d==3||d==4)
                            damt=totald*1900;
                        if(d==5)
                            damt=totald*1700;
                        if(d==6||d==7)
                            damt=totald*2900;
                        if(d==8||d==9||d==10)
                            damt=totald*2800;
                        tamt=tamt+damt;
                        System.out.println("Do you want to place order of a different type of food press 'y'");
                        System.out.println("IF you want to Exit the current cuisine type'Main'");
                        choice=in.next();
                        System.out.print("Loading");
                        for(i=0;i<1000000000;i++)
                        {
                            if(m==100000000)
                            {
                                System.out.print(".");
                                m=0;
                            }
                            m++;
                        }
                        System.out.println();

                    }
                    if(choice.equalsIgnoreCase("n"))
                    {
                        conti=1;
                    }
                    System.out.println();
                }while(conti==1);
                break;

                default:
                System.out.println("You have entered wrong choice!");
                System.out.println("You can enter in this Multi Cuisine Restaurant~ LODHA  ZAIKA by executing the program again with the correct choice!");
                System.out.println("Now, 'Quit' for the Bill");
            }
            System.out.println("Enter 'Bill' to get your Bill printed");
            System.out.println("Enter 'Menu' if you want to have something other than what you ordered ");
            ans=in.next();
            System.out.print("Loading");
            for(i=0;i<1000000000;i++)
            {
                if(m==100000000)
                {
                    System.out.print(".");
                    m=0;
                }
                m++;
            }
            System.out.println();

            if(ans.equalsIgnoreCase("Bill"))//PRinting of the bill
            {
                
                System.out.println("################\t################\t##              \t##              "); 
                System.out.println("##            ##\t################\t##              \t##              ");
                System.out.println("##           ## \t       ##       \t##              \t##              ");
                System.out.println("##          ##  \t       ##       \t##              \t##              ");
                System.out.println("##         ##   \t       ##       \t##              \t##              ");
                System.out.println("###########     \t       ##       \t##              \t##              ");
                System.out.println("###########     \t       ##       \t##              \t##              ");
                System.out.println("##         ##   \t       ##       \t##              \t##              ");
                System.out.println("##          ##  \t       ##       \t##              \t##              ");
                System.out.println("##           ## \t       ##       \t##              \t##              ");
                System.out.println("##            ##\t################\t################\t################");
                System.out.println("################\t################\t################\t################");
                System.out.println();
                System.out.println();
                System.out.println("**************************************************");
                System.out.println("*                                              \t*");
                System.out.println("*\tTotal Cost            \t= Rs."+tamt+(".0")+"\t*");
                System.out.println("*                                              \t*");
                vat=Math.round(14.5/100.0*tamt);
                System.out.println("*\tValue Added Tax(14.5%)\t= Rs."+vat+       " \t*");
                System.out.println("*\tAmount to be paid     \t= Rs."+(tamt+vat)+" \t*");
                System.out.println("*                                              \t*");
                System.out.println("**************************************************");
                System.out.println();
                System.out.println("Thanks for visiting Lodha Zaika!");
                System.out.println("Your pleasure Our Comfort!");
                System.out.println("Visit Again");
                System.out.println();
                conti1=0;
            }
            else
            {
                conti1=1;
            }

        }while(conti1==1);

    }

}//End of the program
