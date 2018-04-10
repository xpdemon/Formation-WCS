package fr.wildcodeschool.unittesting;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.*;


import org.junit.Test;

public class TestClass {

    private StringUtils testCase;

///////////////////////////////////////////////////
    @BeforeEach
    void init (){
        StringUtils testCase = new StringUtils();
    }
//////////////////////////////////////////////////

//////////////////////////////////////////////////// TESTS DE VOWELS //////////////////////////////////////////////////

    ///// TEST # 1 /////
    @Test

    public void notWorkingCase(){
        String wordtest = testCase.vowels("Azer");
        String expected = "Ae";
        assertEquals(expected,expected,wordtest);

    }

    ///// TEST # 2 /////
    @Test

    public void exceptionCase(){
        String wordtest = testCase.vowels(null);
        String expected = "";
        assertEquals(expected,expected,wordtest);
    }

    ///// TEST # 3 /////
    @Test

    public void withoutVowelsdTest(){
        String wordtest = testCase.vowels("zpqrtghk");
        String expected = "";
        assertEquals(expected,expected,wordtest);

    }
/////////////////////////////////////////////////  FIN DES TESTS DE VOWELS /////////////////////////////////////////////

//////////////////////////////////////////////////// TESTS DE UNICVOWELS  //////////////////////////////////////////////

    ///// TEST # 1 /////
    @Test
    public void occurencesTest(){
        String wordtest = testCase.unicVowels("iiiiii");
        String expected = "iiiiii";
        assertEquals(expected,expected,wordtest);

    }

    ///// TEST # 2 /////
    @Test
    public void withoutVowelsdTestCase(){
        String wordtest = testCase.unicVowels("zpqrtghk");
        String expected = "";
        assertEquals(expected,expected,wordtest);

    }


    @Test

    public void nullParameterCase(){
        String wordtest = testCase.unicVowels(null);
        String expected = "";
        assertEquals(expected,expected,wordtest);
    }






/////////////////////////////////////////////////// FIN DES TESTS UNICVOWELS ///////////////////////////////////////////
    @AfterEach

    void reset(){
        testCase =null;
    }

}
