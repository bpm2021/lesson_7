package suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import web.SparkTest;
import web.SuccessfulXBoxGameInfoTest;
import web.UnSuccessfulXBoxGameInfoTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        SparkTest.class,
        SuccessfulXBoxGameInfoTest.class,
        UnSuccessfulXBoxGameInfoTest.class
})
public class JunitTestSuits {}
