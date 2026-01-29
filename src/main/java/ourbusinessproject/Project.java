package ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @NotBlank
    @Column(name = "Title")
    private String title;

    @Column(name = "Description")
    private String description;

    @NotNull
    @ManyToOne
    private Enterprise enterprise;

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
        return description;
    }

    /**
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return the enterprise
     */
    public ourbusinessproject.Enterprise getEnterprise() {
        return enterprise;
    }

    /**
     * Set the title
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Set the description
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Set the description
     * @param enterprise the description
     */
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
}
