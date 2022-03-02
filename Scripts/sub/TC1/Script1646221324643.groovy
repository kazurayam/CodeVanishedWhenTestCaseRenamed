import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser("http://demoaut.katalon.com/")
WebUI.comment("Hello")
WebUI.delay(3)
WebUI.closeBrowser()