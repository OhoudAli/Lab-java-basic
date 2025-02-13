import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

//        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input
//        Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5


//        System.out.println("Please enter First number :");
//        int num1 = input.nextInt();
//        System.out.println("Please enter Second number :");
//        int num2 = input.nextInt();
//
//        System.out.println(num1+" + "+num2+" = "+(num1+num2));
//        System.out.println(num1+" - "+num2+" = "+(num1-num2));
//        System.out.println(num1+" * "+num2+" = "+(num1*num2));
//        System.out.println(num1+" / "+num2+" = "+(num1/num2));
//        System.out.println(num1+" mod "+num2+" = "+(num1%num2));

//*************************************************************************
//        2. Write a Java program that takes a number as input and prints its multiplication table up to
//        10.
//        Test Data:
//        Input a number: 8 Expected
//        Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//...
//        8 x 10 = 80


//        System.out.println("Please enter an integer number: ");
//        int number = input.nextInt() ;
//        int multi = 1;
//        for (int i = 1; i <= 10; i++) {
//
//            multi = number * i; // multiply number user add and i the loop that start from 1 to 10
//           System.out.println(number+" * "+i+" = "+multi);
//        }


        //********************************************************************
//        3. Write a Java program to print the area and perimeter of a circle.
//        Test Data:
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586


//        double Radius = 7.5;
//        double Perimeter = 2 * Math.PI * Radius; // the mathematical that used to calculate Perimeter of circile
//        double Area = Math.PI * Radius * Radius;// the mathematical that used to calculat  Area of circle
//
//        System.out.println("Perimeter is = "+Perimeter);
//        System.out.println("Area is = "+Area);



// *******************************************************
//        4. Java program to find out the average of a set of integers
//        Enter the count of numbers:
//        5
//        Enter an integer:
//        3
//        Enter an integer:
//        8
//        Enter an integer:
//        6
//        Enter an integer:
//        7
//        Enter an integer:
//        2
//        The average is: 5.2


//        int number;
//        double sum = 0;
//        System.out.println("Enter the count of numbers :");
//        int count = input.nextInt();
//        for (int i = 0; i < count; i++) {// using count as condition because it is the limit
//            System.out.println("Enter an integer: ");
//            number = input.nextInt();
//            sum = number + sum;
//        }
//        System.out.println("The average is: "+(sum/count));// the average is sum of numbers divided by their number





// *************************************************
//        5. Write a Java program that accepts three integers as input, adds the first two integers
//        together, and then determines whether the sum is equal to the third integer 3
//        Sample Output:
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true
//                --------
//        Input the first number : 10
//        Input the second number: 20
//        Input the third number : 25
//        The result is: false

//        System.out.println("Please enter the first number : ");
//        int num1 = input.nextInt();
//        System.out.println("Please enter the second number : ");
//        int num2 = input.nextInt();
//        System.out.println("Please enter the third number : ");
//        int num3 = input.nextInt();
//        boolean result= true;
//        System.out.println("Input the first number : "+num1);
//        System.out.println("Input the second number : "+num2);
//        System.out.println("Input the third number : "+num3);
//        if ((num1+num2) != num3){ // if the number 1 plus number 2 does not = to third number thats mean the condition is true
//            result = false; // change the result to false cause it is not equal
//            System.out.println("The result is: "+result);
//        }
//        else
//            System.out.println("The result is: "+result);


//*******************************************************************
//        6. Write a Java program to reverse a word.
//        Sample Output:
//        Input a word: dsaf
//        Reverse word: fasd


//        String words = "dsaf";
//        String holder = ""; // holding the letter in revers
//        char ch ; //holding the letter in index i
//        for (int i = 0; i < words.length(); i++) {
//            ch = words.charAt(i); // take the letter in index i
//            holder = holder + ch; // save the letter that's come from ch
//
//        } System.out.println("Reverse a word: "+holder);


//************************************************************************
//        7 - Java program to check whether the given number is even or odd
//        Enter a number:
//        33
//        The number is Odd
//        Enter a number:
//        24
//        The number is Even


//        System.out.println("Enter a number :");
//        int number = input.nextInt();
//        if(number %2 == 0){ // when divide number with 2 and = 0 that is mean it is even
//            System.out.println("The number is Even");
//        }else // when divide number with 2 and not equal 0 that is mean it is odd but here i did not use condition because if it is not true in the previous if that is mean not even and else work as odd
//            System.out.println("The number is Odd");


//*****************************************************************
//        8 - Java program to convert the temperature in Centigrade to Fahrenheit
//        Enter temperature in Centigrade:
//        43
//        Temperature in Fahrenheit is: 109.4


//        System.out.println("Enter temperature in Centigrade");
//        double celsius = input.nextDouble();
//
//        double fehr = ((celsius *9 )/5)+32; // the mathmatical way to convert from Celsius to Fahrenheit
//        System.out.println("Temperature in Fahrenheit is : "+fehr);


//**********************************************************************
//        9.Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.
//                Test Data:
//        Input a string: Java Bootcamp
//        Input a number: 1
//        Expected Output:
//        a

//        System.out.println("Enter a string: ");
//        String words = input.nextLine();
//        System.out.println("Enter a number : ");
//        int number = input.nextInt();
//
//        System.out.println(words.charAt(number)); // take the sentence and looking in index "user choose number" by char at then print it



//**************************************************************************
//        10. Write a Java program to print the area and perimeter of a rectangle.
//                Test Data:
//        Width = 5.5 Height = 8.5
//        Expected Output
//        Area is 5.6 * 8.5 = 47.60
//        Perimeter is 2 * (5.6 + 8.5) = 28.20


//      //  System.out.println("Enter width :");// does not work when i ask the user
//        float width = 5.6f;
//     //   System.out.println("Enter width :");// does not work when i ask the user
//        float Height =8.5f;
//        float Area = (width * Height); // multiply
//        float Perimeter = (2*(width + Height)); //add width to the height then multiply with 2
//        System.out.printf("Area is %.2f",Area); // use %.2f to print 2 digit after the point
//        System.out.printf("\nPerimeter is %.2f",Perimeter);// use %.2f to print 2 digit after the point




//*******************************************************************************************
//        11. Write a Java program to compare two numbers.
//        Input Data:
//        Input first integer: 25
//        Input second integer: 39
//        Expected Output
//        25 != 39
//        25 < 39
//        25 <= 39


//        System.out.println("Enter first integer : ");
//        int num1 = input.nextInt();
//        System.out.println("Enter second integer : ");
//        int num2 = input.nextInt();
//        if (num1 != num2){ // not equals
//            System.out.println(num1+" != "+num2);
//        }else // if not equals it means equal
//            System.out.println(num1+" == "+num2);
//
//        if (num1 < num2 ){ // if num 1 is bigger than num 2 that is mean true
//            System.out.println(num1+" < "+num2);
//        }else // // if num 1 is not bigger than num 2 that is mean false and use else
//            System.out.println(num1+" > "+num2);
//
//        if(num1<=num2){ // if num 1 is smaller or equal to num 2 that is mean if condition is true
//            System.out.println(num1+" <= "+num2);
//        }else // if if condition not true we go to else which is num 1 > or = num2
//            System.out.println(num1+" >= "+num2);


//******************************************************************************
//        12. Write a Java program to convert seconds to hours, minutes and seconds.
//        Sample Output:
//        Input seconds: 86399
//        23:59:59


//        System.out.println("Enter seconds");
//        int number = input.nextInt();
//        int hours = number / 3600;  // to convert it to hours  which = 23
//        int minutes = (number%3600)/60; // to convert it to minutes which is in every hour 59 minutes
//        int seconds = number % 60; // to conver it to secinde which in every minutes 59 second
//        System.out.println(hours+":"+minutes+":"+seconds);


//        13. Write a Java program that accepts four integers from the user and prints equal if all
//        four are equal, and not equal otherwise.
//                Sample Output:
//        Input first number: 25
//        Input second number: 37
//        Input third number: 45
//        Input fourth number: 23
//        Numbers are not equal!


//        System.out.println("Enter first number: ");
//        int num1 = input.nextInt();
//        System.out.println("Enter second number: ");
//        int num2 = input.nextInt();
//        System.out.println("Enter third number: ");
//        int num3 = input.nextInt();
//        System.out.println("Enter fourth number: ");
//        int num4 = input.nextInt();
//
//        if(num1 == num2 && num3== num4 ){ // if num1 equal to num 2 this side is true and if num3 equal num4 this side is true , true and true means the condition is true
//            System.out.println("Numbers are equals! ");
//        }else// if one of the sides is not true the condition is false
//            System.out.println("Numbers are not equals! ");


//*************************************************************************
//        14. Write a Java program that reads an integer and check whether it is negative, zero, or
//        positive.
//                Test Data Input a number: 7 Expected Output :
//        Number is positive


//        System.out.println("Enter an integer number : ");
//        int number = input.nextInt();
//
//        if (number>0){ // number bugger than 1 it is positive
//            System.out.println("Numbers is positive ");
//        } else if (number<0){ // less than 0 it is negative
//            System.out.println("Numbers is negative  ");
//        }else// ather than tha it is zero
//            System.out.println("Numbers is zero ");




//**************************************************************************
//        15.Write a program to enter the numbers till the user wants and at the end it
//        should display the count of positive, negative and zeros entered (End loop use -1 ,
//                Don’t count -1).
//                Test data
//        1
//        3
//        0
//                -2
//                -4
//                -1
//        2 positives
//        1 zero
//        2 negatives


//        System.out.println("Enter numbers to count it or -1 to exit :");
//        int numbers;
//        int positive = 0;
//        int negative = 0;
//        int zeros =-1; // i try to initials it with 0, but then it count in the counter of zeros then i make it -1 and it is work
//        do {
//            numbers = input.nextInt();
//            if (numbers > 0){ // bigger than 0 it is positive
//                ++positive; // and the positive counter +1
//            }else if (numbers < 0 && numbers != -1){ // if it is less than 0 and not -1 because i use it as a condition in the while
//                ++negative;
//            }else
//                ++zeros;
//        }while(numbers != -1); // if the user enter -1 the loop will stopped
//        System.out.println(positive+" positives");
//        System.out.println(zeros+" zero");
//        System.out.println(negative+" negatives");



//*******************************************************************************
//        16 - Write a program that prompts the user to input an integer and then outputs the
//        number with the digits reversed.
//                For example, if the input is 12345, the output should be 54321.


//        System.out.println("Enter numbers");
//        int numbers = input.nextInt();
//        int holder ;
//        int result = 0 ;
//        while (numbers!= 0){ // number not equal 0 enter the loop
//             holder = numbers % 10; // save the number position
//             result = (result * 10)+ holder; // take the number to the result
//             numbers = numbers/10; // delete last number from the digit
//        }
//        System.out.println("Reverse : "+result);


//******************************************************************
//        17 - Write a program to enter the numbers till the user wants and at the end the
//        program should display the largest and smallest numbers entered.
//                enter the number : 4
//        enter the number : 5
//        enter the number : -1
//        enter the number : 9
//        the large number : 9
//        the small number : -1


//        int numbers;
//        int max = 0 ;
//        int min = 0;
//        do {
//            System.out.println("Enter the number or 0 to exit");
//            numbers= input.nextInt();
//
//            if (numbers > max ){ // if the user add number bigger than the what max hold the if is true
//                max = numbers; // replace what max save what the number save
//            }
//            else if (numbers<min){
//                min = numbers;
//            }
//
//        }while (numbers != 0 );
//        System.out.println("The large number : "+max);
//        System.out.println("The small number : "+min);



//********************************************************************************
//        18 - Determine and print the number of times the character ‘a’ appears in the input
//        entered by the user.
//        Enter String:
//        Java bootcamp
//        Output: Number of a's: 3


//           System.out.println("Enter String: ");
//           String sent = input.nextLine();
//            int count = 0  ;
//
//        for (int i = 0; i < sent.length(); i++) {// the sentence length as the condition
//            if (sent.charAt(i)== 'a'){ // if the character in index i equal to 'a' then true
//                count ++;// and the counter ++
//            }
//        }System.out.println("Number of a's: "+count);
    }
    }
