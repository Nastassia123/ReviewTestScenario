package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CardPage;
import pages.MainPage;

public class VerifyProductIsAddedToCard {


    @Test
    public void testAdditionProductToCard()  {
       CardPage mainPage = new MainPage()
               .openHomePage()
               .closeAddToCardWindow()
               .verifyProductInTheCard();

    }
}
