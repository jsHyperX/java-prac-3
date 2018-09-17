import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class Practice3Test {

    private static Practice3 practice;
    private static MainCatch mainCatch;
    private static ExceptionHandle exceptionHandle;
    private static Matrix matrix;
    private static StudentMarks studentMarks;

    @BeforeClass
    public static void setUp() throws Exception {
        practice = new Practice3();
        mainCatch = new MainCatch();
        exceptionHandle = new ExceptionHandle();
        matrix = new Matrix();
        studentMarks = new StudentMarks();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        practice = null;
        mainCatch = null;
        exceptionHandle = null;
        matrix = null;
        studentMarks = null;
    }

    @Test
    public void MatrixAddTest() {
        Matrix a = new Matrix(3,3);
        a.setMat( new int[][] {{1,2,3},{4,5,6},{7,8,9}},3,3);

        Matrix b = new Matrix(3,3);
        b.setMat(new int[][] {{0,0,0},{1,1,1},{2,2,2}},3,3);

        Matrix c = new Matrix(3,3);
        c.setMat(new int[][] {{1,2,3},{5,6,7},{9,10,11}},3,3);

        assertEquals(c,matrix.add(a,b));
    }

    @Test(expected = CustomException.class)
    public void StudentMarksTest() throws CustomException {
        studentMarks.setNumOfStudents(5);
        studentMarks.setMarks(new int[] { 22,43,54,66,23},5);
    }

    @Test
    public void removeVowelsTest() {
        assertEquals("they both should match after vowels are removed",
                new String[]{"ptn","bnglr","hydrbd"},practice.removeVowels(new String[]{"patna","bangalore","hyderabad"}));
    }

    @Test
    public void consecutiveStreamOfNumbersTest() {
        assertEquals("theya are consecutive",true,
                practice.consecutiveStreamOfNumbers("50,51,52,53,54,55,56"));
        assertEquals("theya are not consecutive",false,
                practice.consecutiveStreamOfNumbers("1,2,3,2,1,0,4"));
        assertEquals("theya are consecutive",true,
                practice.consecutiveStreamOfNumbers("7,6,5,4,3,2,1"));
    }

    @Test
    public void genChessBoard() {
        String[][] chess = {
                    {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                        {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                                    {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                                        {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                                            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                                                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}
        };
        assertEquals(chess,practice.genChessBoard());
    }
}