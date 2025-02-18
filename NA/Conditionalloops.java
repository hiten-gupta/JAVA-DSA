package NA;
// // // import java.util.Scanner;
// // // public class Conditionalloops {
// // //     public static void main(String[] args) {
// // //         // Scanner nc = new Scanner(System.in);
// // //         // System.out.println("Enter your current Salary->- ");
// // //         // int salary = nc.nextInt();
// // //         // if (salary >= 700000){
// // //         //     salary += 30000;
// // //         // }else{
// // //         //     salary += 40000;
// // //         // }

// // //         // System.out.println("your salary with bonus is->- " + salary);
// // //         // nc.close();


// // //         Scanner input = new Scanner(System.in);//For Loop

// // //         System.out.println("Enter a number of your choice->- ");
// // //         int user = input.nextInt();
// // //         for (int num = 1; num <=user; num++) {
// // //             System.out.println("Uddipan lodu");
// // //         }
// // //         input.close();

// // //     }
// // // }
 import java.util.Scanner;
 public class Conditionalloops{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
// //         // System.out.println("Enter a number to proceed further->-");
// //         // int you = n.nextInt();
// //         // // While Loop->-
// //         // int num = 1;
// //         // // while(num <=you ){
// //         // //     System.out.println(num);
// //         // //     num +=1;

// //         // //do while loop->-

// //         // do{
// //         //     System.out.println(num);
// //         //     num++;
// //         // }
// //         // while(num <=you);

// //         // System.out.println("Enter your 1st desired input->- ");
// //         // int a = n.nextInt();
// //         // System.out.println("Enter your 2nd desired input->- ");
// //         // int b = n.nextInt();
// //         // System.out.println("Enter your 3rd desired input->- ");
// //         // int c = n.nextInt();

// //         // int max= a;
// //         // if (b > max){
// //         //     max = b;
// //         // }
// //         // if(c > max ){
// //         //     max = c;
// //         // }
        
// //         // System.out.println("Greatest number is ->- " + max);

// //         //Alphabet test case wether it's upper case or lower case

// //       //    char hj = n.next().trim().charAt(0);

// //       //    if (hj >= 'a' && hj <= 'z'){
// //       //       System.out.println("Lower caase->-");
// //       //    }
// //       //    else{
// //       //       System.out.println("Upper case alphabet->- ");
// //       //    }
// //       //   System.out.println(hj);

// //       //Fibnouchi numbers 
// //       //  int d = n.nextInt();
// //       //   int p = 0;
// //       //   int i = 1;
// //       //   int count = 2;

// //       //    while (count <= d){
// //       //    int sc = i;
// //       //    i = i + p;
// //       //    p = sc;
// //       //   count++;

// //       // }
// //       //  System.out.println(i);

// //       //Counting Occurance->-
// //       // int c = n.nextInt();
// //       // int count = 0;

// //       // while(c > 0){
// //       //    int rem = c % 10;
// //       //    if (rem == 5){
// //       //       count++;
// //       //    }
// //       //    c = c /10;
// //       // }
// //       // System.out.println(count);

// //       // Reverse of a given number
// //       // System.out.println("Enter the integer input->- ");
// //       // int f = n.nextInt();
// //       // int ans = 0;

// //       // while (f > 0){
// //       //   int y = f % 10;
// //       //   f /= 10;

// //       //   ans = ans * 10 + y;
// //       // }
// //       // System.out.println("Reversed integer is ->- " + ans);

// //       // claculator program

        int ans = 0;

      while (true) {
        // take operator as an input
        System.out.print("Please enter an operator of your choice -> ");

        char gh = n.next().trim().charAt(0);
        if (gh == '+' || gh == '-' || gh == '*' || gh =='/' || gh == '%'){
          // input two numbers
          System.out.print("Enter two digits to make calculation-> ");

          int take1 = n.nextInt();
          int take2 = n.nextInt();

          if (gh == '+') {
            ans = take1 + take2;
          }
          if (gh == '-'){
            ans = take1 - take2;
          }
          if (gh == '*'){
            ans = take1 * take2;
        }
        if (gh == '/'){
          if (take2 != 0){
           ans = take1 / take2;
          }
      }

      if (gh == '%'){
           ans = take1 % take2;
          }   
      }
      else if (gh == 'x' || gh == 'X') {
        break;
       }        else {
        System.out.println("Invalid operation entered please entrerd a valid operation");
      }
        System.out.println("Output of entered numbers are  -> " + ans);
    }
      n.close();
  }
      }

// import java.util.Scanner;
// public class Conditionalloops {
//   public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//  // Take input from user till user does not press X or x
//     int ans = 0;
//    while (true) {
//  // take the operator as input
//      System.out.print("Enter the operator: ");
//       char op = in.next().trim().charAt(0);
//       if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
//  // input two numbers
//      System.out.print("Enter two numbers: ");
//    int num1 = in.nextInt();
//     int num2 = in.nextInt();
//     if (op == '+') {
//     ans = num1 + num2;
//   }
//    if (op == '-') {
//    ans = num1 - num2;
//  }
//     if (op == '*') {
//      ans = num1 * num2;
//  }
//       if (op == '/') {
//        if (num2 != 0) {
//            ans = num1 / num2;
//  }
//  }
//             if (op == '%') {
//             ans = num1 % num2;
//  }
//  }     else if (op == 'x' || op == 'X') {
//           break;
//  }           else {
//            System.out.println("Invalid operation!!");
//  }
//            System.out.println(ans);
//  }
//  }
// } 
     
 