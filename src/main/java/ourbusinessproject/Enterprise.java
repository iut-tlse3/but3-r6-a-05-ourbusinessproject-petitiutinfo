package ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Collection;
import java.util.HashSet;

@Entity
@Table(name = "Enterprise")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @NotBlank
    @Column(name = "Name")
    private String name;

    @Size(min = 10)
    @Column(name = "Description")
    private String description;

    @NotBlank
    @Column(name = "ContactName")
    private String contactName;

    @NotBlank @Email
    @Column(name = "ContactEmail")
    private String contactEmail;

    @OneToMany (mappedBy = "Enterprise")
    private Collection<Project> projects;

    /**
     *
     * @return the identifier
     */
    public Long getId() {
        return Id;
    }

    /**
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return the contactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Set the contactName
     * @param contactName the contactName
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     *
     * @return the contactEmail
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Set the contactEmail
     * @param contactEmail the contactEmail
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    /**
     *
     * @return the projects
     */
    public Collection<Project> getProjects() {
        return projects;
    }

    /**
     * Add a project to the collection of projects
     * @param project the project to add
     */
    public void addProject(Project project) {
        if (this.projects == null) {
            this.projects = new HashSet<>();
        }
        this.projects.add(project);
    }
}
