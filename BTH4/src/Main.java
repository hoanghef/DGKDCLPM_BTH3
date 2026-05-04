package BTH4.src;

public class Main {

    // 1. Chu vi
    public static int chuVi(int a, int b) {
        if (a <= 0 || b <= 0) throw new IllegalArgumentException();
        return 2 * (a + b);
    }

    // 2. Diện tích
    public static int dienTich(int a, int b) {
        if (a <= 0 || b <= 0) throw new IllegalArgumentException();
        return a * b;
    }

    // 3. PT bậc 2
    public static String ptBac2(double a, double b, double c) {
        if (a == 0) throw new IllegalArgumentException();
        double delta = b*b - 4*a*c;
        if (delta < 0) return "Vo nghiem";
        if (delta == 0) return "Nghiem kep";
        return "Hai nghiem";
    }

    // 4. Số ngày
    public static int soNgay(int thang, int nam) {
        if (thang < 1 || thang > 12) throw new IllegalArgumentException();
        if (thang == 2) {
            if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0)
                return 29;
            return 28;
        }
        if (thang == 4 || thang == 6 || thang == 9 || thang == 11)
            return 30;
        return 31;
    }

    // 5. Số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    // 6. Tổng xen kẽ
    public static int tong(int n) {
        if (n < 1) throw new IllegalArgumentException();
        int s = 0;
        for (int i = 1; i <= n; i++)
            s += (i % 2 == 0) ? -i : i;
        return s;
    }

    // 7. UCLN
    public static int ucln(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return Math.abs(a);
    }

    // 8. Giai thừa tổng
    public static int tongGiaiThua(int n) {
        if (n < 0) throw new IllegalArgumentException();
        int s = 0, gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
            s += gt;
        }
        return s;
    }
}
