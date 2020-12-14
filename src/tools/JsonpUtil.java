package tools;

public class JsonpUtil {
	
	public static Document getDocument(String url) {
		String html = OKHttpUtils.get(url);
		if(StringUtils.isBlank(html)) {
			return null;
		}
		return Json.parse(html);
	}
}
