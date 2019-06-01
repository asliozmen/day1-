package methodRecapute;

public class TestAmazon {

	public static void main(String[] args) {
		 Amazon.navigate(TestData.url);
		 Amazon.login(TestData.userName,TestData.password);
		 Amazon.search(TestData.item);

	}

}
