import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in) ;
        int  value,start;
        int count = 0 ;
        int countStart = 0 ;
        System.out.print("Lütfen bir değer giriniz :");
        value = inp.nextInt();
        for(start = 1 ; start <=value ; start++) {
            if (start % 3 == 0 && start % 4 == 0) {
                countStart = countStart + start ;
                count = count + 1 ;
            }else {
                countStart = countStart ;
                count = count ;
            }
        }
        System.out.println(countStart/count);
    }
}
/* eğer 3 e ve 4 e tam bölünebiliyor ise o sayıyı countStart cebimize koyuyoruz ve
1 tane 3 e ve 4 e tam bölünen sayı bulduğumuz için count cebimize 1 ekliyoruz.
eğer 3 e ve 4 e bölünmüyosa cebimize herhangi bir değer eklemiyoruz.
örn. 12 = 12/ 1
örn 36 = 12 + 24 + 36 / 1 + 1 + 1 ve sonuç 24
 */
