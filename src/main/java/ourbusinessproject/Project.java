package ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "Project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @NotBlank
    @Column(name = "Title")
    private String Title;

    @Column(name = "Description")
    private String Description;

    /**
     *
     * @return the identifier
     */
    public Long getId() {
        return Id;
    }

    /**
     *
     * @return the description
     */
    public String getDescription() {
        return Description;
    }

    /**
     *
     * @return the title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * Set the title
     * @param title the title
     */
    public void setTitle(String title) {
        Title = title;
    }

    /**
     * Set the description
     * @param description the description
     */
    public void setDescription(String description) {
        Description = description;
    }
}
