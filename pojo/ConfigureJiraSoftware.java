public class ConfigureJiraSoftware {
 
  private String jiraUsername;
  private String jiraPassword;
  private String jiraUrl;
  private String repositoryName;
  
  // constructor
  public ConfigureJiraSoftware(String jiraUsername, String jiraPassword, String jiraUrl, String repositoryName) {
    this.jiraUsername = jiraUsername;
    this.jiraPassword = jiraPassword;
    this.jiraUrl = jiraUrl;
    this.repositoryName = repositoryName;
  }
  
  // Setters
  
  public void setJiraUsername(String jiraUsername) {
    this.jiraUsername = jiraUsername;
  }
  
  public void setJiraPassword(String jiraPassword) {
    this.jiraPassword = jiraPassword;
  }
  
  public void setJiraUrl(String jiraUrl) {
    this.jiraUrl = jiraUrl;
  }
  
  public void setRepositoryName(String repositoryName) {
    this.repositoryName = repositoryName;
  }
  
  // Getters
  
  public String getJiraUsername() {
    return this.jiraUsername;
  }
  
  public String getJiraPassword() {
    return this.jiraPassword;
  }
  
  public String getJiraUrl() {
    return this.jiraUrl;
  }
  
  public String getRepositoryName() {
    return this.repositoryName;
  }
  
  // Other methods
  
  public void resetForm() {
    this.jiraUsername = null;
    this.jiraPassword = null;
    this.jiraUrl = null;
    this.repositoryName = null;
  }
  
  public void saveConfiguration() {
    // save configuration to the database
  }
  
  public void displayList() {
    // display list with title, user name, url and action
  }
  
  public void editList() {
    // edit list with title, user name, url and action
  }
  
  public void deleteList() {
    // delete list with title, user name, url and action
  }
  
  public void changeNumberOfEntries() {
    // change number of entries to display in the list
  }
  
  public void displayPagination() {
    // display pagination under the list
  }
  
  public void changePageNumber() {
    // click on pagination to change the page numbers
  }
  
  public void addMore() {
    // add more button above the list to configure other Jira Software
  }
  
  public void displayPopUpForm() {
    // display pop up form
  }
  
  public boolean authenticateJiraCredentials() {
    // authenticate credentials and return response
    return true;
  }
  
}