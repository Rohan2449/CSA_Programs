package miscellaneous;
import java.util.Scanner;


public class Greedy {
public static void main(String[] args) {

System.out.println("O hai! How much change is owed?");
Scanner reader = new Scanner(System.in);
double userChange = reader.nextDouble();
int coinsOwed;
coinsOwed = 0;
userChange = userChange * 100;

while (userChange >= 25 ) {
 userChange = userChange-25;
 coinsOwed += 1;
}

while (userChange >= 10 ) {
 userChange = userChange-10;
 coinsOwed += 1;
}

while (userChange >= 05 ) {
 userChange = userChange-05;
 coinsOwed += 1;
}

while (userChange >= 01 ) {
 userChange = userChange-01;
 coinsOwed += 1;
}
System.out.println(coinsOwed);

}
}
