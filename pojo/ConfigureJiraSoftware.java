public class ConfigureJiraSoftware {
    private String username;
    private String password;
    private String url;
    private String repositoryName;
    private int numberOfEntries;
    private List<String> titleList;
    private List<String> userNameList;
    private List<String> urlList;
    private List<String> actionList;
    
    public ConfigureJiraSoftware() {
        this.titleList = new ArrayList<>();
        this.userNameList = new ArrayList<>();
        this.urlList = new ArrayList<>();
        this.actionList = new ArrayList<>();
    }
    
    public void loginToSacralAiWebsite() {
        // code for login to Sacral.ai website
    }
    
    public void accessExpertServicesPage() {
        // code for accessing the "Expert Services to Change Business" page
    }
    
    public void clickConfigure() {
        // code for clicking the Configure button
    }
    
    public void clickJiraSoftware() {
        // code for clicking the Jira Software button
    }
    
    public void setJiraSoftwareCredentials(String username, String password, String url, String repositoryName) {
        this.username = username;
        this.password = password;
        this.url = url;
        this.repositoryName = repositoryName;
    }
    
    public void resetJiraSoftwareCredentials() {
        this.username = null;
        this.password = null;
        this.url = null;
        this.repositoryName = null;
    }
    
    public void saveConfigure() {
        // code for saving the configuration
    }
    
    public boolean validateJiraCredentials() {
        // code for validating the Jira credentials
        return true;
    }
    
    public void changeNumberOfEntries(int numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }
    
    public void addMoreJiraSoftware() {
        // code for adding more Jira Software
    }
    
    public void addToTitleList(String title) {
        this.titleList.add(title);
    }
    
    public void addToUserNameList(String username) {
        this.userNameList.add(username);
    }
    
    public void addToUrlList(String url) {
        this.urlList.add(url);
    }
    
    public void addToActionList(String action) {
        this.actionList.add(action);
    }
    
    public void editTitle(int index, String title) {
        this.titleList.set(index, title);
    }
    
    public void editUserName(int index, String username) {
        this.userNameList.set(index, username);
    }
    
    public void editUrl(int index, String url) {
        this.urlList.set(index, url);
    }
    
    public void deleteTitle(int index) {
        this.titleList.remove(index);
    }
    
    public void deleteUserName(int index) {
        this.userNameList.remove(index);
    }
    
    public void deleteUrl(int index) {
        this.urlList.remove(index);
    }
    
    public void deleteAction(int index) {
        this.actionList.remove(index);
    }
    
    public void changePageNumber(int pageNumber) {
        // code for changing the page number
    }
    
    public List<String> getTitleList() {
        return this.titleList;
    }
    
    public List<String> getUserNameList() {
        return this.userNameList;
    }
    
    public List<String> getUrlList() {
        return this.urlList;
    }
    
    public List<String> getActionList() {
        return this.actionList;
    }
}