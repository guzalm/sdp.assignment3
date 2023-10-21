// Facebook Login Adapter
class FacebookLoginAdapter implements LoginAdapter {
    private FacebookService facebookService;

    public FacebookLoginAdapter() {
        this.facebookService = new FacebookService();
    }

    @Override
    public void login(String username, String password) {
        facebookService.loginToFacebook(username, password);
    }
}
