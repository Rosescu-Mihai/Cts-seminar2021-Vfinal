package ro.ase.acs.suites;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.acs.categories.TestRight;
import ro.ase.acs.categories.TesteUrgente;

@RunWith(Categories.class)//Va tine cont de categoria testelor
@Suite.SuiteClasses(CompleteTestSuite.class)//nerecomandat
@Categories.IncludeCategory(TesteUrgente.class)
@Categories.ExcludeCategory(TestRight.class)
public class CustomTestSuite {
}
