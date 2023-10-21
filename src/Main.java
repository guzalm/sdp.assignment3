public class Main {
    public static void main(String[] args) {
        // Create instances of login and post adapters
        LoginAdapter facebookLoginAdapter = new FacebookLoginAdapter();
        PostAdapter facebookPostAdapter = new FacebookPostAdapter();
        LoginAdapter twitterLoginAdapter = new TwitterLoginAdapter();
        PostAdapter twitterPostAdapter = new TwitterPostAdapter();

        // Log in and post messages to Facebook
        facebookLoginAdapter.login("facebook_username", "facebook_password");
        System.out.println("Logged in to Facebook.");
        facebookPostAdapter.post("Hello, Facebook!");
        System.out.println("Posted on Facebook.");

        // Log in and post messages to Twitter
        twitterLoginAdapter.login("twitter_username", "twitter_password");
        System.out.println("Logged in to Twitter.");
        twitterPostAdapter.post("Hello, Twitter!");
        System.out.println("Posted on Twitter.");
    }
}





