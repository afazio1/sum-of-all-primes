//sum of prime numbers less than 3000

class Main {
  public static void main(String[] args) {
int value = 1;
int i = 1;
int sumOfPrimes = 0;
int maxNum = 3000;

while(i <= maxNum){
//if (value == 1 || value == 0){
  //System.out.print(value);
  //System.out.println(" neither prime or composite");
//}
int flag = 0;
  for (int x = 2; x <= value/2; x++){
    if(value % x == 0){
     // System.out.print(value);
     // System.out.println(" is composite");
      flag = 1;
      break;
    }
    
  }
  if (flag == 0 && value != 1 && value != 0){
  // System.out.print(value);
  //System.out.println( " is prime");
  sumOfPrimes = value + sumOfPrimes;
  }
  value++;
 // System.out.println("...........");
  i++;
}
System.out.print(sumOfPrimes);
System.out.print(" is the sum of all prime numbers less than ");
System.out.println(maxNum);



  }
}