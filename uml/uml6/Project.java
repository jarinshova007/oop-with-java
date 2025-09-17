package uml6;

class Project {
    private int projectId;
    private String projectName;

    Project(int projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }
    /* unnecessary
    String getProjectName() {
        return projectName;
    }
    void setProjectName(String projectName) {
        this.projectName = projectName;
    } */

    void displayProject() {
        System.out.println("Project Id: " + projectId);
        System.out.println("Project Name: " + projectName);
    }
}
