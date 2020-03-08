package Creational.Factory;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		// TODO Auto-generated method stub
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
