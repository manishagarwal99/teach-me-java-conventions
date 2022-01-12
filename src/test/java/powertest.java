import org.junit.Test;
import org.junit.Before;

public class powertest {

    private powerfinder powfind;

    @Before
    public void setUp() {
        powfind = new powerfinder();
    }

    @Test
    public void one_raised_to_one_is_onew() {
        assert powfind.OF(1,1)==1;
    }

    @Test
    public void twoRaised_to_one_is_2() {
        assert powfind.OF(2,1)==2;
    }

    @Test
    public void two_power_2_is_4() {
        assert powfind.OF(2, 2)==4;
    }

    @Test
    public void power_of_2_and_3_Is_SIX() {
        assert powfind.OF(3, 2)==9;
    }
}
