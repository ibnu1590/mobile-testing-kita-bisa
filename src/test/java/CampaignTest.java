import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CampaignTest {
    public static void wait(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A6");
        dc.setCapability("udid", "5200048ceebc3521");
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "10");

        dc.setCapability("appPackage", "com.kitabisa.android");
        dc.setCapability("appActivity", "com.kitabisa.android.ui.splash.SplashActivity");

        //creates a new instance based on appium local driver
        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

        //action

        wait(5000);
        MobileElement mulaiDonasi = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[1]");
        mulaiDonasi.click();
        wait(3000);
        MobileElement inputNoPhone = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
        inputNoPhone.sendKeys("089606853329");
        MobileElement clickLanjutkan = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button");
        clickLanjutkan.click();
        wait(2000);
        MobileElement inputPassword = (MobileElement) ad.findElementById("com.kitabisa.android:id/editTextPassword");
        inputPassword.sendKeys("kitabisa123");

        MobileElement clickMasuk = (MobileElement) ad.findElementById("com.kitabisa.android:id/buttonLogin");
        clickMasuk.click();
        wait(2000);

        MobileElement clickSkipVoucher = (MobileElement) ad.findElementById("com.kitabisa.android:id/buttonSkip");
        clickSkipVoucher.click();
        wait(3000);

        MobileElement permission = (MobileElement) ad.findElementById("com.android.permissioncontroller:id/permission_deny_button");
        permission.click();
        wait(3000);

        MobileElement popupClose = (MobileElement) ad.findElementById("com.kitabisa.android:id/buttonClose");
        popupClose.click();
        wait(3000);

        MobileElement popupClose2 = (MobileElement) ad.findElementById("com.kitabisa.android:id/buttonClose");
        popupClose2.click();
        wait(3000);

        MobileElement el1 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView");
        el1.click();
        wait(3000);

        MobileElement popupOnPageDonasi = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
        popupOnPageDonasi.click();
        wait(3000);

        MobileElement el2 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
        el2.click();
        wait(10000);

        MobileElement el3 = (MobileElement) ad.findElementById("com.kitabisa.android:id/buttonDonate");
        el3.click();
        wait(5000);

        MobileElement el4 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup");
        el4.click();
        wait(5000);

        MobileElement el6 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[9]/android.widget.TextView");
        el6.click();
        wait(5000);

        MobileElement el7 = (MobileElement) ad.findElementById("com.kitabisa.android:id/buttonContinuePayment");
        el7.click();
        wait(5000);

        PointOption start = PointOption.point(545, 1021);
        PointOption end = PointOption.point(497, 177);
        (new TouchAction(ad))
                .press(start)
                .moveTo(end)
                .release()
                .perform();

        MobileElement moveToPenggalanganLain = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[9]/android.widget.Button");
        moveToPenggalanganLain.click();

    }
}
