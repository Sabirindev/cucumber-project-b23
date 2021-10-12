package com.cydeo.step_definitions;

import com.cydeo.pages.WCommanArea;
import com.cydeo.pages.WOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebOrderStepDefs {

    @When("we select {string} tab from sidebar")
    public void weSelectTabFromSidebar(String tabName) {
        System.out.println("tabName = " + tabName);
        WCommanArea commanArea = new WCommanArea();
        commanArea.orderTab.click();
    }

    @Then("we should see below options in Product dropdown list")
    public void weShouldSeeBelowOptionsInProductDropdownList(List<String> expectedOptions) {

        System.out.println("options = " + expectedOptions);

        WOrderPage wOrderPage = new WOrderPage();

        WebElement dropdown = wOrderPage.productDropdown;
        Select selectObj = new Select(dropdown);

       //Option with Lambda sign
        //        List<String> actualOptions =
//                selectObj.getOptions().stream() //get Stream<Webelemnt> from List<Webelement>
//                        .map(eachOption-> eachOption.getText()) //get Lis<String> from List<Webelement>
//                        .collect(Collectors.toList());

        //getOptions method deom select class is used
        //to return all dropdown options as List of webelement
        List<WebElement> allProductOptions = selectObj.getOptions();

        List<String > actuallOptions = new ArrayList<>();

        for (WebElement eachOption : allProductOptions) {
            System.out.println("eachOption.getText() = " + eachOption.getText());
            actuallOptions.add(eachOption.getText());
        }

        //asert these two list are equal
        assertEquals(expectedOptions,actuallOptions);


    }
}
