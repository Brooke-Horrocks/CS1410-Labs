/**
* Assignment Lab J Unit
* Program: AllTests
* Programmer: Brooke Horrocks
* Date: May 22, 2018
*/
package labjunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MyClassTest.class, MyClassTest2.class, MyClassTest3.class })
public class AllTests {

}
