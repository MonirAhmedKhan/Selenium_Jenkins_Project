package pages;
import org.openqa.selenium.By;
public class OrderList_Page {
    public static By LastColum = By.xpath("//tbody/tr[last()]/td[7]/a");
    public static By textConfirmed = By.xpath("//tbody/tr[last()]/td[6]");
    public static By tableRowsOrderList = By.xpath("//tr");
}
