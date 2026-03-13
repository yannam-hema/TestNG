# TestNG
**It is testing framework for java used**
- Write and run test cases
- Group Testcases
- Generate reports
- Run Tests in parallel
- Control execution order

## Testng.xml 
- It is a configuration File which contains test execution details (flow of test cases)
- Test Suite--->tests-->test steps

## Assertions
**Assertion means Verification**
- In automation testing , assertions are used to check whether the actual result matches the expected result
- In TestNG we use class :- org.testng.Assert (Hard) , org.testng.asserts.SoftAssertion (Soft)
- Without Assertions , Selenium will only perform actions but will not verify results **Assert.assertEquals(actual,expected)**

  ### Types of Assertions
  - **Hard Assertion -** :-stops the test immediately if it fails
  - **Soft Assertion -** :-It does not stop the test if it fails , In other words when an assertion fails , it don't throw an  exception but record the failure calling assertAll() will cause an exception to be thrown if atleast one assertion failed
 
  ### What if We have many test annotations in our program
  **By default TestNG will sort the methods by alphabetically order , so to make them run like the order we want we can use priority , the lower the priority number it is the one excutes first**

## Annotations
**Annotation is a form of metadata that can be added to the java source code**
**In TestNG Annotations control the test Execution flow**
- @BeforeSuite = Before entire test suite
- @BeforeTest = Before <test> in XML
- @BeforeClass = Before first Test in class (Related tests)
- @BeforeMethod = Before every @Test (Independent Tests)
- @Test = Actual test case
- @AfterMethod = After every @Test
- @AfterClass = After all tests in class
- @AfterTest = After <test> in XML
- @AfterSuite = After entire suite
  
  
