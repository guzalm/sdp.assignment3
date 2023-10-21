class FacebookPostAdapter implements PostAdapter {
    private FacebookService facebookService;

    public FacebookPostAdapter() {
        this.facebookService = new FacebookService();
    }

    @Override
    public void post(String message) {
        facebookService.postOnFacebook(message);
    }
}