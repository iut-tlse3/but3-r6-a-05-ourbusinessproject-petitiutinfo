package ourbusinessproject;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Project {

    @NotNull
    @Size(min=1)
    private String Title;
    private String Description;

    public String getDescription() {
        return Description;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
