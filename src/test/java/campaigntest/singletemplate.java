package campaigntest;

import org.testng.annotations.Test;
import framework.pageobjects.campaignPage;
import framework.pageobjects.loginPage;
import framework.pageobjects.templatePage;
import framework.pageobjects.loginPage;
import framework.pageobjects.campaignPage;
import framework.pageobjects.templatePage;
import campaigntest.TestComponents.BaseTest2;

		public class singletemplate extends BaseTest2 {

		    @Test
		    public void createCampaignWithTemplate() throws Exception {

		        loginPage login = new loginPage(driver);
		        campaignPage campaign = new campaignPage(driver, wait);
		        templatePage template = new templatePage(driver);

		        login.login("divya+test00001@chat360.io", "Admin*123");

		        campaign.openCampaignPage();
		        campaign.createCampaign("dvHybrid1");

		        template.selectTemplate("mayuriimage");
		        
		        Thread.sleep(5000);

		        template.uploadRecipientsFile("C:\\Users\\Divya\\OneDrive\\MM\\xcel\\avi.exe");

		        template.mapParameters();

		        template.sendTestMessage("9980960647");

		        template.launchCampaign(); 
		    }
		}

