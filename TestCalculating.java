import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculating {
    double x;
    private static final double DELTA = 1e-15;  //максимальная дельта между ожидаемым и фактическим,
    // для которой оба числа по-прежнему считаются равными.

    @Before
    public void setUP(){
        x = 14;
    }

    @Test (expected = Except.class)
    public void TC1() throws Except{
        double expected = 57501.631;
        double res = new Calculating(1).formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test
    public void TC2() throws Except{
        double expected = 149615.83;
        double res = new Calculating(x).formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }

    @Test
    public void TC3() throws ExceptString{
        double expected = 6.7557949615E7;
        double res = new Calculating("  6  5").formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }

    @Test (expected = Except.class)
    public void TC4() throws Except{
        double expected = 57501.631;
        double res = new Calculating(-1).formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test (expected = Except.class)
    public void TC5() throws Except{
        double expected = 57501.631;
        double res = new Calculating(- 7).formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test (expected = Except.class)
    public void TC6() throws Except{
        double expected = 57501.631;
        double res = new Calculating(- 14).formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test (expected = Except.class)
    public void TC7() throws Except{
        double expected = 57501.631;
        double res = new Calculating(- 2).formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test (expected = ExceptString.class)
    public void TC8() throws ExceptString{
        double expected = 57501.631;
        double res = new Calculating( "34,4").formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Incorrect entry.
    }

    @Test
    public void TC9() throws Except{
        double expected = 5340562.549407999;
        double res = new Calculating( 34.4).formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }

    @Test
    public void TC10() throws Except{
        double expected = 5097410.05;
        double res = new Calculating( 34.).formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }

    @Test
    public void TC11() throws Except{
        double expected = 5340562.549407999;
        double res = new Calculating( 34.4).formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }

    @Test (expected = ExceptString.class)
    public void TC12() throws ExceptString{
        double expected = 5340562.549407999;
        double res = new Calculating( "34.,6").formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Incorrect entry.
    }

    @Test (expected = ExceptString.class)
    public void TC13() throws ExceptString{
        double expected = 5340562.549407999;
        double res = new Calculating( "qwe").formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Incorrect entry.
    }

    @Test (expected = ExceptString.class)
    public void TC14() throws ExceptString{
        double expected = 5340562.549407999;
        double res = new Calculating( "7qwe").formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Incorrect entry.
    }

    @Test (expected = ExceptString.class)
    public void TC15() throws ExceptString{
        double expected = 5340562.549407999;
        double res = new Calculating( "q we").formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Incorrect entry.
    }

    @Test (expected = ExceptString.class)
    public void TC16() throws ExceptString{
        double expected = 5340562.549407999;
        double res = new Calculating( "*").formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Incorrect entry.
    }

    @Test (expected = ExceptString.class)
    public void TC17() throws ExceptString{
        double expected = 5340562.549407999;
        double res = new Calculating( "*33").formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Incorrect entry.
    }

    @Test
    public void TC18() throws ExceptString{
        double expected = 5340562.549407999;
        double res = new Calculating( "    ").formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - ...
    }

    @Test
    public void TC19() throws ExceptString{
        double expected = 5340562.549407999;
        double res = new Calculating( " ").formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - ...
    }

    @Test
    public void TC20() throws ExceptString{
        double expected = 5340562.549407999;
        double res = new Calculating( " ").formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - ...
    }

    @Test (expected = Except.class)
    public void TC21() throws Except{
        double expected = 5340562.549407999;
        double res = new Calculating(1).formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test (expected = Except.class)
    public void TC22() throws Except{
        double expected = 5340562.549407999;
        double res = new Calculating(-1).formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test
    public void TC23() throws Except{
        double expected = 1.5579810495E7;
        double res = new Calculating(45).formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }

    @Test
    public void TC24() throws Except{
        double expected = 1.6859967607547995E7;
        double res = new Calculating(45.9).formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }

    @Test(expected = Except.class)
    public void TC25() throws Except{
        double expected = 16859967.608;
        double res = new Calculating(-1.4).formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test(expected = Except.class)
    public void TC26() throws Except{
        double expected = 16859967.608;
        double res = new Calculating(1.4).formula1();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }
}
