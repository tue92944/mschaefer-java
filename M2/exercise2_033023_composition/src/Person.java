public class Person extends Artifact {
    private String firstName;
    private String lastName;
    private String primarySpeciality;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPrimarySpeciality() {
        return primarySpeciality;
    }

    public void setPrimarySpeciality(String primarySpeciality) {
        this.primarySpeciality = primarySpeciality;
    }
}
