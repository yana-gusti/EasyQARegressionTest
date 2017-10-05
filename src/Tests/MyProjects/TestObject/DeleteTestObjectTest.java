package Tests.MyProjects.TestObject;

import Methods.MyProjects.Projects;
import Methods.MyProjects.TestObjects;
import Tests.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/5/17.
 */
public class DeleteTestObjectTest extends BaseTest{

    @Test
    public void addTestObject() throws InterruptedException {
        Projects projects = openProject();
        TestObjects testObjects = projects.goToTestObjects(driver);
        testObjects.deleteTestObject(driver);
        logout();
    }
}
