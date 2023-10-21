class TwitterLoginAdapter implements LoginAdapter {
    private TwitterService twitterService;

    public TwitterLoginAdapter() {
        this.twitterService = new TwitterService();
    }

    @Override
    public void login(String username, String password) {
        twitterService.loginToTwitter(username, password);
    }
}
