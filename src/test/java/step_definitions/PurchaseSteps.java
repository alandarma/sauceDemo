package step_definitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.ChartPage;
import org.example.pageObject.CheckOutPage;
import org.example.pageObject.InventoriPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps {

    private WebDriver webDriver;

    public PurchaseSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on landing page")
    public void verifyLandPage() {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.displayLandingPage());
    }

    @And("User sort product by \"(.*)\"")
    public void sortProduct(String products) throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.sortProductBy(products);
        Thread.sleep(3000);
    }

    @And("User pick item Sauce Labs Onesie")
    public void clickItemBasket1() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBasket1();
        Thread.sleep(3000);
    }

    @And("^User pick item Test\\.allTheThings\\(\\) T-Shirt \\(Red\\)$")
    public void clickItemBasket2() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBasket2();
        Thread.sleep(3000);
    }

    @And("User click Chart icon")
    public void clickItemBasket3() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBasket3();
        Thread.sleep(3000);
    }

    @And("User verify that products in Chart Page")
    public void verifyListOfProduct() throws InterruptedException {
        ChartPage chartPage = new ChartPage(webDriver);
        Assert.assertTrue(chartPage.displayChartPage());
        Thread.sleep(3000);
    }

    @And("^User remove item Test\\.allTheThings\\(\\) T-Shirt \\(Red\\)$")
    public void clickRemoveItemBasket4() throws InterruptedException {
        ChartPage chartPage = new ChartPage(webDriver);
        chartPage.clickBasket4();
        Thread.sleep(3000);
    }

    @And("User click CHECKOUT button")
    public void clickCheckOutButton() throws InterruptedException {
        ChartPage chartPage = new ChartPage(webDriver);
        chartPage.clickBasket5();
        Thread.sleep(3000);
    }

    @Then("User already on CHECKOUT: YOUR INFORMATION page")
    public void verifyCheckOut() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertTrue(checkOutPage.displayCheckOutPage());
        Thread.sleep(3000);
    }

    @Then("User input \"(.*)\" as firstName, \"(.*)\" as lastName and \"(.*)\" as postalCode")
    public void inputCredential(String firstName1, String lastName1, String postalCode1) throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.setFirstName(firstName1);
        checkOutPage.setLastName(lastName1);
        checkOutPage.setPostalCode(postalCode1);
        Thread.sleep(3000);
    }

    @Then("User click continue")
    public void clickContinueButton() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.clickContinue();
        Thread.sleep(3000);
    }

    @And("User already on CHECKOUT: OVERVIEW page")
    public void verifyOverview() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertTrue(checkOutPage.getTotalAndTax());
        Assert.assertTrue(checkOutPage.getItemTax());
        Assert.assertTrue(checkOutPage.getItemTotal());
        Thread.sleep(3000);
    }

    @Then("User click FINISH button")
    public void clickFinishButton() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.clickFinish();
        Thread.sleep(3000);
    }

    @And("CHECKOUT COMPLETE! and showing \"THANK YOU FOR YOUR ORDER\" text")
    public void verifyCheckOutComplete() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertTrue(checkOutPage.checkOutComplete());
        Thread.sleep(3000);
    }

}

    //User input "Alan" as firstName , "Darma" as lastName and "16152" as postalCode


//    @And("User sort checkout \"(.*)\" as products to cart")
//    public void addProductToChart(String products) throws InterruptedException {
//        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
//        checkOutPage.clickBasket2();
//        Thread.sleep(3000);
//    }


    //    @And("User sort product list by name Z to A")
//    public void selectProductContainer() throws InterruptedException {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        String a = "Name (Z to A)";
//        inventoriPage.sortProductBy(a);
//        Thread.sleep(3000);
//    }



//    @And("User verify that \"(.*)\" as products in a list")
//    public void verifyListOfProduct(String products) {
//        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
//        Assert.assertTrue(checkOutPage.displayCheckOutPage());
//    }


