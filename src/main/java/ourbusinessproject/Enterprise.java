package ourbusinessproject;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Enterprise {

    @NotNull
    @Size(min = 1)
    private String Name;
    @Size(min = 10)
    private String Description;
    @NotNull
    @Size(min = 1)
    private String ContactName;
    @NotNull
    @Size(min = 1)
    @Email
    private String ContactEmail;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getContactEmail() {
        return ContactEmail;
    }

    public void setContactEmail(String contactEmail) {
        ContactEmail = contactEmail;
    }
}
