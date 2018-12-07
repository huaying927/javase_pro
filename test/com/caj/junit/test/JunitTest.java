package test.com.caj.junit.test;

import com.caj.advance.junit.Emp;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Junit3Test.class, Junit4Test.class})
public class JunitTest
{
}
