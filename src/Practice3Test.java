import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Practice3Test {

    private static Practice3 practice;
    private static MainCatch mainCatch;
    private static ExceptionHandle exceptionHandle;
    private static Matrix matrix;

    @BeforeClass
    public static void setUp() throws Exception {
        practice = new Practice3();
        mainCatch = new MainCatch();
        exceptionHandle = new ExceptionHandle();
        matrix = new Matrix();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        practice = null;
        mainCatch = null;
        exceptionHandle = null;
        matrix = null;
    }

    @Test
    public void MatrixAddTest() {
        Matrix a = new Matrix(3,3);
        a.setMat( new int[][] {{1,2,3},{4,5,6},{7,8,9}},3,3);

        Matrix b = new Matrix(3,3);
        b.setMat(new int[][] {{0,0,0},{1,1,1},{2,2,2}},3,3);

        Matrix c = new Matrix(3,3);
        c.setMat(new int[][] {{1,2,3},{5,6,7},{9,10,11}},3,3);

        assertTrue(matrix.areSame(c,matrix.add(a,b)));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void StudentMarksTest() throws InvalidScoreException {
        thrown.expect(InvalidScoreException.class);
        thrown.expectMessage("please enter a valid score");
        StudentMarks mark = new StudentMarks(5);
        mark.setMarks(new int[] { 22,43,0,66,23},5);
    }

    @Test
    public void removeVowelsTest() {
        assertEquals("they both should match after vowels are removed",
                new String[]{"ptn","bnglr","hydrbd"},practice.removeVowels(new String[]{"patna","bangalore","hyderabad"}));
        assertEquals("they both should match after vowels are removed",
                new String[]{"nd","ntd Stts","Grmny","gypt","czchslvk"},practice.removeVowels(new String[]{"India","United States","Germany","Egypt","czechoslovakia"}));
    }

    @Test
    public void consecutiveStreamOfNumbersTest() {
        assertEquals("they are consecutive",true,
                practice.consecutiveStreamOfNumbers("50,51,52,53,54,55,56"));
        assertEquals("they are not consecutive",false,
                practice.consecutiveStreamOfNumbers("1,2,3,2,1,0,4"));
        assertEquals("they are consecutive",true,
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