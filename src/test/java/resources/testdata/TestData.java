package resources.testdata;


import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "credentials")
    public Object[][] getData(){
        return new Object[][]{
                {"BK","Patel","London"},
                {"Rudra","Patel","Wembley"},
                {"Jay","Patel","London"},
                {"Harsh","Patel","Wembley"}

        };
    }
}