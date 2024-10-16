
import static com.micu.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Test.*;

public class MathUtilityTest {

    // test case #3: check getFactorial() wwith n = -5 to see exception
    // chủ động có ngoại lệ xuất hiện tron tình huống n âm hoặc n>20
    // nghe kĩ: có ngoại le nhưng màu xanh vì ngoại lệ như dự kiến
    @Test
    void testFactorialGivenWrongArgumentThrowException(){
//        getFactorial(-5);
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(-5);});
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(22);});
    }

    @Test
    void testFacrorialGivenRightArguement5RunsWell(){// TO SEE RESULT 120
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
    }
    @Test
    void testFacrorialGivenRightArguement0RunsWell(){
        // cấu trức test case: ID, Desc, Step/Procedures, Expected value
        // actual result, status: passed, failed
        // test date, bug # (bug id) Bugzilla (bug db)
        // jira
        // testcase #1: check getFactorial() with n=0 to see result of 1
        long expectedValue = 1;
        long actualValue = getFactorial(0);
        // so sánh
        // bình thường: ta sout để in kq để đoán đúng sai
        // hiện tại: xài theem tool , thư viện junit
        // giúp đôi mắt thấy kq đúng sai 2 màu xanh đỏ
        // não và mắt k cần nhn đoán và kết luận như cũ
        // đỏ => tạch xanh => ổn
        assertEquals(expectedValue, actualValue);
        // giống màu xanh, lệnh nhau màu đỏ => nhìn đúng sai

    }
}
// quy tac xanh do cua unit test tool/ framework
// neu tat ca testcase passed (expected == actual) => mau xanh
// chi can 1 trong nhung test case failed (expected != actual) => mau do
// lys doL gafm da dung thi phair dung het cac test case da dua ra!
// mat chir nhinf 2 tin hieu xanh do
// xanh dung het do 1 thg chet

// ki thuajt viet code chinh (api , core....)
// ma di kem code test hafm lun dung 2 trang thai code xanh do liene tuc
// xanh do lien tuc trong qtrinh viet code TDD
// test driven development => viet code song hanh cung code test