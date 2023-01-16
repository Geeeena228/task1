public class Main {
    public static void main(String[] args) {
        System.out.println(ostat(10, 3));
        System.out.println(square(10, 3));
        System.out.println(col_legs(10, 3, 3));
        System.out.println(profitableGamble(10, 3, 13));
        System.out.println(operation(10, 3, 13));
        System.out.println(ASCLL('A'));
        System.out.println(nextEdge(10, 3));
        System.out.println(addUpTO(new int[] {1,2,3,4,5}));
       // System.out.println(square(10, 3));
       // System.out.println(square(10, 3));
        //System.out.println(square(10, 3));


    }
    // остаток от деления
    public static double ostat(double x, double y){
        return x%y;
    }
    // площадь треугольника
    public static double square(double a, double h){
        return (a*h)/2;
    }
    // кол ног
    public static int col_legs(int chicken, int cows, int pigs){
        return chicken * 2 + cows * 4 + pigs * 4;
    }
    // true false
    public static boolean profitableGamble (double prob, double prize, double pay){
        if (prob * prize > pay){
            return true;
        }
        else{
            return false;
        }
    }
    // простые мат. действия
    public static String operation(int a,int b, int n){
        if (a+b == n){
            return "plus";
        }
        else if (a-b == n){
            return "minus";
        }
        else if (a*b == n){
            return "multiply";
        }
        else if (a/b == n){
            return "split";
        }
        else{
            return "none";
        }
    }
    // возвращение ASCLL значения
    public static int ASCLL (char ch){
        return ((int)ch);
    }
    public static int addUpTO(int[] mas){
        int sum = 0;
        for (int i = 0; i< mas.length; i++){
            sum += mas[i];
        }
        return sum;
    }
    // третья сторона треугольника
    public static int nextEdge(int x, int y){
        return (x+y)-1;
    }
    // сумма кубов
    public static int sumOfCubes(int[] mas){
        int sum = 0;
        for (int i = 0; i<mas.length;i++){
            sum += mas[i] * mas[i];
        }
        return sum;
    }
    public static boolean abc (double a, double b, double c){
        for (int i = 1; i<b; i++){
            a+=a;
        }
        if (a%c == 0){
            return true;
        }
        else{
            return false;
        }
    }
}