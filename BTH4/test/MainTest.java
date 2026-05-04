package BTH4.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    // ISSUE 1 - hợp lệ
    @Test
    void testChuVi() {
        assertEquals(16, Main.chuVi(5,3));
    }

    @Test
    void testDienTich() {
        assertEquals(15, Main.dienTich(5,3));
    }

    @Test
    void testPT() {
        assertEquals("Nghiem kep", Main.ptBac2(1,2,1));
    }

    @Test
    void testSoNgay() {
        assertEquals(29, Main.soNgay(2,2024));
    }

    @Test
    void testPrime() {
        assertTrue(Main.isPrime(7));
    }

    @Test
    void testTong() {
        assertEquals(3, Main.tong(5));
    }

    @Test
    void testUCLN() {
        assertEquals(4, Main.ucln(12,8));
    }

    @Test
    void testGiaiThua() {
        assertEquals(9, Main.tongGiaiThua(3));
    }

}
