package ro.ase.acs.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.acs.teste.GrupaTest;
import ro.ase.acs.teste.GrupaTestWithFake;
import ro.ase.acs.teste.GrupaTestWithMocks;

@RunWith(Suite.class)//Va face toate testele fara sa tina cont de @Category
@Suite.SuiteClasses({GrupaTest.class, GrupaTestWithFake.class, GrupaTestWithMocks.class})
public class CompleteTestSuite {
}
