public class JiraConfig {
    private String username;
    private String password;
    private String url;
    private String repositoryName;
    private int numEntries;

    public JiraConfig(){

    }

    public JiraConfig(String username, String password, String url, String repositoryName) {
        this.username = username;
        this.password = password;
        this.url = url;
        this.repositoryName = repositoryName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public int getNumEntries() {
        return numEntries;
    }

    public void setNumEntries(int numEntries) {
        this.numEntries = numEntries;
    }

    public void loginToSacral() {
        // code to login to Sacral website
    }

    public void accessExpertServices() {
        // code to access Expert Services page
    }

    public void clickConfigure() {
        // code to click on Configure
    }

    public void clickJiraSoftware() {
        // code to click on Jira Software
    }

    public void validateJiraCredentials() {
        // code to validate Jira credentials
    }

    public void displayList() {
        // code to display list with Title, User Name, URL and Action
    }

    public void editList() {
        // code to edit list with Title, User Name, URL and Action
    }

    public void deleteList() {
        // code to delete list with Title, User Name, URL and Action
    }

    public void showEntries() {
        // code to show entries in the list
    }

    public void displayPagination() {
        // code to display pagination under the list
    }

    public void changePageNumbers() {
        // code to change page numbers
    }

    public void displayAddMoreButton() {
        // code to display Add more button
    }

    public void displayPopUpForm() {
        // code to display Pop Up form
    }

    public void enterDetails() {
        // code to enter the required details in Pop Up form
    }

    public void resetDetails() {
        // code to reset the details entered
    }

    public void saveConfigure() {
        // code to click on save button to configure
    }
}