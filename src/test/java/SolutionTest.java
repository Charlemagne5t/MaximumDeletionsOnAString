import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        String s = "abcabcdabc";
        int expected = 2;
        int actual = new Solution().deleteString(s);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String s = "aaabaab";
        int expected = 4;
        int actual = new Solution().deleteString(s);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String s = "aaaaa";
        int expected = 5;
        int actual = new Solution().deleteString(s);

        Assert.assertEquals(expected, actual);
    }
}
