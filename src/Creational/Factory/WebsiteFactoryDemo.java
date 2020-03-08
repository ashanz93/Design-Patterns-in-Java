package Creational.Factory;

public class WebsiteFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		System.out.println(site.getPages());
		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		System.out.println(site.getPages());
	}

}
