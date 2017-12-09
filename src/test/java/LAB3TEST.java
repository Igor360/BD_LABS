
import LAB3.DataGeneratorNeo4j;
import LAB3.GeneratorRandomDataInDB;
import org.junit.Assert;
import org.junit.Test;

public class LAB3TEST {


    @Test
    public void test(){
        Assert.assertNotNull(DataGeneratorNeo4j.getFirstName());
        Assert.assertNotNull(DataGeneratorNeo4j.getAge());
        Assert.assertNotNull(DataGeneratorNeo4j.getArticleText());
        Assert.assertNotNull(DataGeneratorNeo4j.getSecondName());
        Assert.assertNotNull(DataGeneratorNeo4j.getLastName());
        Assert.assertNotNull(DataGeneratorNeo4j.getUrlAdress());
        Assert.assertNotNull(DataGeneratorNeo4j.getNowDate());
        Assert.assertNotNull(DataGeneratorNeo4j.getGroupDescription());
        Assert.assertNotNull(DataGeneratorNeo4j.getBirthday());
        Assert.assertNotNull(DataGeneratorNeo4j.getArticleTitle());
        Assert.assertNotNull(DataGeneratorNeo4j.getGroupName());
    }

    @Test
    public void test2(){
        GeneratorRandomDataInDB.generateUsers(30);
        GeneratorRandomDataInDB.generateArticles(20);
        GeneratorRandomDataInDB.generateGroups(20);
        Assert.assertTrue(GeneratorRandomDataInDB.getArticles() != null);
        Assert.assertTrue(GeneratorRandomDataInDB.getPersons() != null);
        Assert.assertTrue(GeneratorRandomDataInDB.getGroups() != null);
    }


}
