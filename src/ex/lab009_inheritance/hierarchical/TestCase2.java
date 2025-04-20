package ex.lab009_inheritance.hierarchical;

public class TestCase2 extends CommonToAll{

    void runningTC2(){
        startBrowser();
        System.out.println("Execute TC2: ");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }
}
