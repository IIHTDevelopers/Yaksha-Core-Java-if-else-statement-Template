package functional;

import static testutils.TestUtils.businessTestFile;
import static testutils.TestUtils.currentTest;
import static testutils.TestUtils.testReport;
import static testutils.TestUtils.yakshaAssert;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import testutils.AutoGrader;

public class FunctionalTest {

    // Provide the path to the IfElseStatementAssignment class file
    String filePath = "src/main/java/com/yaksha/assignment/IfElseStatementAssignment.java";

    @AfterAll
    public static void afterAll() {
        testReport();
    }

    @Test
    public void testIfElseStatementsOnly() throws Exception {
        AutoGrader autoGrader = new AutoGrader();
        boolean result = autoGrader.testIfElseStatementsOnly(filePath);
        yakshaAssert(currentTest(), result, businessTestFile);
    }
}
